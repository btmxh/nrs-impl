package com.dah.nrs

import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlin.math.max

interface Meta {
    val mutableMeta: MutableMap<String, JsonElement>
    val metaValue get() = JsonObject(mutableMeta)

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

    fun meta(key: String, value: Meta?) {
        meta(key, value?.metaValue ?: JsonNull)
    }
}

open class MetaImpl : Meta {
    override val mutableMeta = mutableMapOf<String, JsonElement>()
}

class DSLImpact : MetaImpl(), Impact {
    override var description = ""
    override val contributors = mutableMapOf<String, Double>()
    override var score = ScoreVector.ZERO
    override val meta get() = metaValue
}

class DSLRelation : MetaImpl(), Relation {
    override var description = ""
    override val contributors = mutableMapOf<String, Double>()
    override val references = mutableMapOf<String, ScoreMatrix>()
    override val meta get() = metaValue
}

interface AcceptImpact {
    fun acceptImpact(impact: DSLImpact)
}

interface AcceptRelation {
    fun acceptRelation(relation: DSLRelation)
}

interface AcceptEntry {
    val root: GenerateScope?
    fun acceptEntry(entry: Entry)
}

interface AcceptIRE : AcceptImpact, AcceptRelation, AcceptEntry

interface AcceptEntryContains : AcceptEntry {
    override val root: GenerateScope? get() = null
    val entry: Entry
    val globalContainsFactor: Double

    override fun acceptEntry(entry: Entry) {
        root?.acceptEntry(entry)
        acceptEntry(entry, 1.0)
    }

    fun acceptEntryID(childId: String, containsFactor: Double) {
        entry.contains[childId] = globalContainsFactor * containsFactor
    }

    fun acceptEntry(child: Entry, containsFactor: Double) {
        acceptEntryID(child.id, containsFactor)
    }
}

class GenerateScope : AcceptIRE {
    val entries = hashMapOf<String, Entry>()
    val impacts = arrayListOf<Impact>()
    val relations = arrayListOf<Relation>()

    override val root: GenerateScope get() = this

    override fun acceptImpact(impact: DSLImpact) {
        impacts.add(impact)
    }

    override fun acceptRelation(relation: DSLRelation) {
        relations.add(relation)
    }

    override fun acceptEntry(entry: Entry) {
        entries[entry.id] = entry
    }
}

class Entry(override val root: GenerateScope?) : AcceptIRE, AcceptEntryContains, Meta {
    var id: String = ""
    var title: String = ""
    var bestGirl: String = ""
    val contains = mutableMapOf<String, Double>()

    override val globalContainsFactor = 1.0
    override val entry = this
    override val mutableMeta = mutableMapOf<String, JsonElement>()

    override fun acceptImpact(impact: DSLImpact) {
        root?.acceptImpact(impact)
        if (impact.contributors.isEmpty()) {
            impact.contributors[id] = 1.0
        }
    }

    override fun acceptRelation(relation: DSLRelation) {
        root?.acceptRelation(relation)
        if (relation.contributors.isEmpty()) {
            relation.contributors[id] = 1.0
        }
    }
}

class ContainsScope(
    override val root: GenerateScope?,
    override val entry: Entry,
    override val globalContainsFactor: Double,
) : AcceptEntryContains

fun AcceptEntry.Entry(block: Entry.() -> Unit = {}): Entry {
    return Entry(root).also(block).also { acceptEntry(it) }
}

fun AcceptEntryContains.SubID(suffix: String) = "${entry.id}-$suffix"

fun AcceptEntryContains.SubIDEntry(idSuffix: String, title: String = entry.title, block: Entry.() -> Unit = {}): Entry {
    return Entry {
        this.id = this@SubIDEntry.SubID(idSuffix)
        this.title = title
        block()
    }
}

fun AcceptEntryContains.Contains(id: String, containsFactor: Double = 1.0) {
    acceptEntryID(id, containsFactor)
}

fun AcceptEntryContains.Contains(containsFactor: Double, block: ContainsScope.() -> Unit = {}) {
    ContainsScope(root, entry, globalContainsFactor * containsFactor).also(block)
}
