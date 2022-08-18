@file:Suppress("FunctionName")

package com.dah.nrs.dsl

import com.dah.nrs.core.*
import com.dah.nrs.exts.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*
import java.time.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.writeText
import kotlin.reflect.KProperty

interface DSLMeta : IMeta {
    val mutableMeta: MutableMap<String, JsonElement>
    override val meta get() = JsonObject(mutableMeta)

    fun meta(key: String, value: JsonElement) {
        mutableMeta[key] = value
    }

    fun meta(key: String, value: String) {
        meta(key, JsonPrimitive(value))
    }

    fun meta(key: String, value: Number) {
        meta(key, JsonPrimitive(value))
    }

    fun meta(key: String, value: Boolean) {
        meta(key, JsonPrimitive(value))
    }

    fun meta(key: String, value: DSLMeta?) {
        meta(key, value?.meta ?: JsonNull)
    }
}

open class DSLMetaImpl : DSLMeta {
    override val mutableMeta = hashMapOf<String, JsonElement>()
}

class DSLImpact(override val context: NRSContext) : DSLMetaImpl(), IImpact, HasContext {
    var description = ""
    override val contributors = mutableMapOf<String, Double>()
    override var score = context.zeroVector()

}

class DSLRelation(override val context: NRSContext) : DSLMetaImpl(), IRelation, HasContext {
    override val contributors = mutableMapOf<String, Double>()
    override val references = mutableMapOf<String, ScoreMatrix>()
}

interface HasContext {
    val context: NRSContext
}

fun HasContext.vector(block: VectorBlock.() -> Unit) = context.vector(block)
fun HasContext.vector(scalar: Double) = context.vector(scalar)

interface AcceptImpact : HasContext {
    fun acceptImpact(impact: DSLImpact)
}

interface AcceptRelation : HasContext {
    fun acceptRelation(relation: DSLRelation)
}

interface AcceptEntry {
    val root: DSLScope
    fun acceptEntry(entry: DSLEntry)
}

interface AcceptIRE : AcceptImpact, AcceptRelation, AcceptEntry

interface AcceptEntryContains : AcceptEntry {
    val entry: DSLEntry
    val globalContainsFactor: Double

    override fun acceptEntry(entry: DSLEntry) {
        root.acceptEntry(entry)
        acceptEntry(entry, 1.0)
    }

    fun acceptEntry(child: DSLEntry, containsFactor: Double) {
        acceptEntryID(child.id, containsFactor)
    }

    fun acceptEntryID(childId: String, containsFactor: Double) {
        entry.children[childId] = globalContainsFactor * containsFactor
    }

    fun Contains(containsFactor: Double, block: AcceptEntryContains.() -> Unit): DSLContainScope {
        return DSLContainScope(root, entry, globalContainsFactor * containsFactor)
            .also(block)
    }

    fun Contains(id: String, containsFactor: Double = 1.0) = acceptEntryID(id, containsFactor)
}

class DSLScope(override val context: NRSContext) : AcceptIRE {
    val entries = hashMapOf<ID, DSLEntry>()
    val impacts = arrayListOf<DSLImpact>()
    val relations = arrayListOf<DSLRelation>()
    override val root: DSLScope get() = this

    override fun acceptImpact(impact: DSLImpact) {
        impacts.add(impact)
    }

    override fun acceptRelation(relation: DSLRelation) {
        relations.add(relation)
    }

    override fun acceptEntry(entry: DSLEntry) {
        entries[entry.id] = entry
    }

    fun getData(): NRSData {
        return NRSData(entries, impacts, relations)
    }
}

class DSLEntry(override val root: DSLScope) : AcceptIRE, AcceptEntryContains, DSLMeta, IEntry {
    override val context: NRSContext get() = root.context
    override var id: String = ""
    var title by stringMeta("DAH_entry_title")
    var bestGirl by stringMeta("DAH_entry_bestGirl")
    var seasonal: Boolean = false
    override val children = mutableMapOf<String, Double>()

    override val entry: DSLEntry get() = this
    override val globalContainsFactor: Double get() = 1.0
    override val mutableMeta = hashMapOf<String, JsonElement>()

    override fun acceptImpact(impact: DSLImpact) {
        root.acceptImpact(impact)
        if (impact.contributors.isEmpty()) {
            impact.contributors[id] = 1.0
        }
    }

    override fun acceptRelation(relation: DSLRelation) {
        root.acceptRelation(relation)
        if (relation.contributors.isEmpty()) {
            relation.contributors[id] = 1.0
        }
    }
}

class DSLContainScope(
    override val root: DSLScope,
    override val entry: DSLEntry,
    override val globalContainsFactor: Double
) : AcceptEntryContains

fun AcceptEntry.Entry(block: DSLEntry.() -> Unit) = DSLEntry(root).also {
    block(it)
    acceptEntry(it)
}

fun DSLEntry.SubIDEntry(suffix: String, title: String? = null, block: DSLEntry.() -> Unit = {}): DSLEntry {
    return Entry {
        this.id = this@SubIDEntry.id + "-" + suffix
        this.title = title ?: this@SubIDEntry.title
        block()
    }
}

inline fun <reified T> Json.output(filename: String, value: T) {
    Path("output/$filename").writeText(encodeToString(value))
}

fun generate(block: DSLScope.() -> Unit) {
    val ctx = context {
        DAH_factors = DAH_factors(this)
        DAH_overall_score = DAH_overall_score(this)
        DAH_serialize = DAH_serialize(this)
        DAH_serialize_json = DAH_serialize_json(this)
        DAH_meta = DAH_meta(this)
        DAH_standards = DAH_standards(this)
        DAH_anime_normalize = DAH_anime_normalize(this)
    }

    val scope = DSLScope(ctx).also(block)
    val result = ctx.process(scope.getData())
    val json = ctx.DAH_serialize_json!!.json
    json.output("impacts.json", scope.impacts.map { ctx.DAH_json_serialize(it) })
    json.output("relations.json", scope.relations.map { ctx.DAH_json_serialize(it) })
    json.output("entries.json", scope.entries.mapValues { (_, it) -> ctx.DAH_json_serialize(it) })
    json.output("scores.json", result.mapValues { (_, it) -> ctx.DAH_json_serialize(it) })
}

fun stringMeta(key: String) = StringMetaProperty(key)

class StringMetaProperty(private val key: String) {
    operator fun setValue(owner: DSLMeta, property: KProperty<*>, value: String?) {
        if (value != null) {
            owner.meta(key, value)
        } else {
            owner.mutableMeta.remove(key)
        }
    }

    operator fun getValue(owner: DSLMeta, property: KProperty<*>): String? {
        return (owner.mutableMeta[key] as? JsonPrimitive?)?.contentOrNull
    }
}

fun numDays(from: String, to: String? = null): Int {
    val fromDate = LocalDate.parse(from)
    val toDate = to?.let { LocalDate.parse(it) } ?: LocalDate.now()
    return (toDate.toEpochDay() - fromDate.toEpochDay()).toInt()
}
