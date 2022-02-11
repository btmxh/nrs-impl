package com.dah.nrs

import kotlinx.serialization.json.JsonObject
import kotlin.math.pow

interface Impact {
    val description: String
    val contributors: Map<String, Double>
    val score: ScoreVector
    val meta: JsonObject
}

interface Relation {
    val description: String
    val contributors: Map<String, Double>
    val references: Map<String, ScoreMatrix>
    val meta: JsonObject
}

class EntryScore(val impact: ScoreVector, val relation: ScoreVector) {
    val overallVector = impact + relation
    val subscores = Subscores.associateWith {
        combine(it.factors.map { factor -> overallVector[factor.vectorIndex] }, it.weight)
    }
    val overall = subscores.values.sum()
}

class RelationStack {
    private val map = hashMapOf<String, Int>()

    companion object {
        const val MAX_REOCCURRENCES = 8
    }

    fun push(id: String): Boolean {
        val occurrences = (map[id] ?: 0) + 1
        map[id] = occurrences
        return occurrences <= MAX_REOCCURRENCES
    }

    fun pop(id: String) {
        val occurrences = map[id]
        if (occurrences == null || occurrences <= 0) {
            error("RelationStack internal error, map[id] <= 0 or map[id] == null")
        }

        if (occurrences == 1) {
            map.remove(id)
        } else {
            map[id] = occurrences - 1
        }
    }
}

const val ChemistryBuffFactor = 0.25

fun process(entries: Map<String, Entry>, impacts: List<Impact>, relations: List<Relation>): Map<String, EntryScore> {
    val impactScores = processImpacts(entries, impacts)

    val stack = RelationStack()

    fun calcRelation(id: String): ScoreVector {
        if (!stack.push(id)) {
            stack.pop(id)
            return ScoreVector.ZERO
        }

        return combineVectors(relations.map {
            val weight = getContributingWeight(it.contributors, entries, id)
            if(weight < EPSILON) {
                ScoreVector.ZERO
            } else {
                val buffedWeight = weight.pow(ChemistryBuffFactor)
                it.references.map { (reference, weightMatrix) ->
                    val relation = calcRelation(reference)
                    val overall = (impactScores[reference] ?: ScoreVector.ZERO) + relation
                    weightMatrix * overall
                }.reduce { a, b -> a + b } * buffedWeight
            }
        }).also { stack.pop(id) }
    }

    return entries.keys.associateWith { id ->
        val impact = impactScores[id] ?: ScoreVector.ZERO
        val relation = calcRelation(id)

        EntryScore(impact, relation)
    }
}

fun processImpacts(entries: Map<String, Entry>, impacts: List<Impact>): Map<String, ScoreVector> {
    return entries.keys.associateWith { id ->
        val scoreVectors = arrayListOf<ScoreVector>()

        for (impact in impacts) {
            val weight = getContributingWeight(impact.contributors, entries, id)

            if (weight > EPSILON) {
                val buffedWeight = weight.pow(ChemistryBuffFactor)
                scoreVectors.add(impact.score * buffedWeight)
            }
        }

        combineVectors(scoreVectors)
    }
}

fun getContributingWeight(contributors: Map<String, Double>, entries: Map<String, Entry>, id: String): Double {
    return contributors.entries.sumOf { (to, weight) -> maxWeight(id, to, entries) * weight }
}

fun maxWeight(from: String, to: String, entries: Map<String, Entry>): Double {
    fun maxWeightInternal(
        from: String,
        to: String,
        entries: Map<String, Entry>,
        cache: MutableMap<Pair<String, String>, Double>,
    ): Double {
        if (from == to) {
            return 1.0
        }

        cache[from to to]?.let { return it }

        val weight = entries[from]?.contains
            ?.maxOfOrNull { (childId, childWeight) -> maxWeightInternal(childId, to, entries, cache) * childWeight }
            ?: 0.0
        cache[from to to] = weight
        return weight
    }

    return maxWeightInternal(from, to, entries, hashMapOf())
}

fun combineVectors(list: List<ScoreVector>): ScoreVector {
    return vector {
        for (factor in FactorScores) {
            set(factor, combine(list.map { it[factor.vectorIndex] }, factor.weight))
        }
    }
}
