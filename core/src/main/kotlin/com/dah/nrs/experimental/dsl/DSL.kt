package com.dah.nrs.experimental.dsl

import com.dah.nrs.ScoreMatrix
import com.dah.nrs.ScoreVector
import com.dah.nrs.experimental.core.ID
import com.dah.nrs.experimental.core.IMeta
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

interface DSLMeta: IMeta {
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

class DSLImpact : DSLMetaImpl() {
    val contributors = mutableMapOf<String, Double>()
    var score = ScoreVector.ZERO
}

class DSLRelation : DSLMetaImpl() {
    val contributors = mutableMapOf<String, Double>()
    val references = mutableMapOf<String, ScoreMatrix>()
}

interface AcceptImpact {
    fun acceptImpact(impact: DSLImpact)
}

interface AcceptRelation {
    fun acceptRelation(relation: DSLRelation)
}

interface AcceptEntry {
    val root: DSLScope?
    fun acceptEntry(entry: DSLEntry)
}

interface AcceptIRE : AcceptImpact, AcceptRelation, AcceptEntry

interface AcceptEntryContains : AcceptEntry {
    val entry: DSLEntry
    val globalContainsFactor: Double

    override fun acceptEntry(entry: DSLEntry) {
        root?.acceptEntry(entry)
        acceptEntry(entry, 1.0)
    }

    fun acceptEntry(child: DSLEntry, containsFactor: Double) {
        acceptEntryID(child.id, containsFactor)
    }

    fun acceptEntryID(childId: String, containsFactor: Double) {
        entry.contains[childId] = globalContainsFactor * containsFactor
    }

    fun Contains(containsFactor: Double, block: AcceptEntryContains.() -> Unit): DSLContainScope {
        return DSLContainScope(root, entry, globalContainsFactor * containsFactor)
            .also(block)
    }
}

class DSLScope : AcceptIRE {
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
}

class DSLEntry(override val root: DSLScope?) : AcceptIRE, AcceptEntryContains, DSLMeta {
    var id: String = ""
    var title: String = ""
    var bestGirl: String = ""
    var seasonal: Boolean = false
    val contains = mutableMapOf<String, Double>()

    override val entry: DSLEntry get() = this
    override val globalContainsFactor: Double get() = 1.0
    override val mutableMeta = hashMapOf<String, JsonElement>()

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

class DSLContainScope(
    override val root: DSLScope?,
    override val entry: DSLEntry,
    override val globalContainsFactor: Double
) : AcceptEntryContains
