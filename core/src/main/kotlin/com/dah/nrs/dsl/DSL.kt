@file:Suppress("FunctionName")

package com.dah.nrs.dsl

import com.dah.nrs.core.*
import com.dah.nrs.exts.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*
import java.time.LocalDate
import java.time.ZoneId
import kotlin.io.path.*
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
    val stackTrace = Thread.currentThread().stackTrace.map { "${it.fileName}:${it.lineNumber}" }
}

class DSLRelation(override val context: NRSContext) : DSLMetaImpl(), IRelation, HasContext {
    override val contributors = mutableMapOf<String, Double>()
    override val references = mutableMapOf<String, ScoreMatrix>()
    val stackTrace = Thread.currentThread().stackTrace.map { "${it.fileName}:${it.lineNumber}" }
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

fun DSLEntry.SubIDEntry(suffix: String, block: DSLEntry.() -> Unit): DSLEntry {
    return Entry {
        this.id = this@SubIDEntry.id + "-" + suffix
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
        DAH_standards = DAH_standards(this)
        DAH_anime_normalize = DAH_anime_normalize(this)
        DAH_meta = DAH_meta(this)
    }

    val scope = DSLScope(ctx).also(block)

    // use this to find out where impacts are defined using their index
    val impactStackTrace = arrayOf<Int>()
    val relationStackTrace = arrayOf<Int>()
    for (impactIdx in impactStackTrace) {
        println("Impact #$impactIdx stacktrace: ${scope.impacts[impactIdx].stackTrace}")
    }
    for (relationIdx in relationStackTrace) {
        println("Impact #$relationIdx stacktrace: ${scope.relations[relationIdx].stackTrace}")
    }

    val result = ctx.process(scope.getData())
    val json = ctx.DAH_serialize_json!!.json
    val outputDir = Path("output")
    if (outputDir.exists() && !outputDir.isDirectory()) {
        if(!outputDir.isDirectory()) {
            throw FileAlreadyExistsException(outputDir.toFile())
        }

        outputDir.createDirectory()
    }
    json.output("impacts.json", scope.impacts.map { ctx.DAH_json_serialize(it) })
    json.output("relations.json", scope.relations.map { ctx.DAH_json_serialize(it) })
    json.output("entries.json", scope.entries.mapValues { (_, it) -> ctx.DAH_json_serialize(it) })
    json.output("scores.json", result.mapValues { (_, it) -> ctx.DAH_json_serialize(it) })
}

fun stringMeta(vararg path: String) = StringMetaProperty(path.toList())
fun intMeta(vararg path: String) = IntMetaProperty(path.toList())

class StringMetaProperty(path: List<String>) : MetaProperty<String>(path) {
    override fun fromJSON(element: JsonElement): String? {
        return (element as? JsonPrimitive)?.contentOrNull
    }

    override fun toJSON(value: String?): JsonElement {
        return JsonPrimitive(value)
    }
}

class IntMetaProperty(path: List<String>) : MetaProperty<Int>(path) {
    override fun fromJSON(element: JsonElement): Int? {
        return (element as? JsonPrimitive)?.intOrNull
    }

    override fun toJSON(value: Int?): JsonElement {
        return JsonPrimitive(value)
    }

}

abstract class MetaProperty<T : Any>(private val path: List<String>) {
    init {
        require(path.isNotEmpty())
    }

    operator fun setValue(owner: DSLMeta, property: KProperty<*>, value: T?) {
        val oldValue = owner.mutableMeta.remove(path[0])
        val newValue = patchValue(oldValue, path.subList(1, path.size), value)
        owner.mutableMeta[path[0]] = newValue
    }

    operator fun getValue(owner: DSLMeta, property: KProperty<*>): T? {
        return fromJSON(getValue(owner.mutableMeta[path[0]], path.subList(1, path.size)))
    }

    private fun patchValue(oldValue: JsonElement?, path: List<String>, obj: T?): JsonElement {
        if (path.isEmpty()) {
            return toJSON(obj)
        } else {
            val name = path[0]
            return if (oldValue == null) {
                buildJsonObject { put(name, patchValue(null, path.subList(1, path.size), obj)) }
            } else {
                require(oldValue is JsonObject)
                buildJsonObject {
                    put(name, patchValue(oldValue[name], path.subList(1, path.size), obj))
                    for ((key, value) in oldValue) {
                        if (key != name) {
                            put(key, value)
                        }
                    }
                }
            }
        }
    }

    private fun getValue(j: JsonElement?, path: List<String>): JsonElement {
        return if (path.isEmpty()) {
            j!!
        } else {
            require(j != null && j is JsonObject)
            getValue(j[path[0]], path.subList(1, path.size))
        }
    }

    protected abstract fun fromJSON(element: JsonElement): T?
    protected abstract fun toJSON(value: T?): JsonElement
}

fun numDays(from: String, to: String? = null): Int {
    val fromDate = LocalDate.parse(from)
    val toDate = LocalDate.parse(to ?: today())
    return (toDate.toEpochDay() - fromDate.toEpochDay()).toInt()
}

fun today(): String {
    return LocalDate.now(ZoneId.of("Asia/Ho_Chi_Minh")).toString()
}
