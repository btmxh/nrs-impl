package com.dah.nrs.experimental.core

import com.dah.nrs.EPSILON
import com.dah.nrs.ScoreVector
import com.dah.nrs.combineVectors
import kotlin.math.pow

internal class MutableResult(
    val impacts: HashMap<Int, ScoreVector> = hashMapOf(),
    val relations: HashMap<Int, ScoreVector> = hashMapOf()
) {
    fun toResult(): EntryResult {
        return EntryResult(impacts, relations)
    }
}

internal class Processor(val context: NRSContext, val data: NRSData) {
    val getContainWeightStack = ReoccurrenceStack<Pair<ID, ID>>(1)
    val processEntryRelationsStack = ReoccurrenceStack<ID>()

    val results = hashMapOf<ID, MutableResult>()

    fun process(): Map<ID, EntryResult> {
        processImpacts()
        processRelations()

        return results.mapValues { (_, mutableResult) -> mutableResult.toResult() }
    }

    fun getResult(id: ID): MutableResult {
        return results.getOrPut(id, ::MutableResult)
    }

    private fun processImpacts() {
        for ((id, _) in data.entries) {
            val result = getResult(id)
            for ((index, impact) in data.impacts.withIndex()) {
                val weight = getContributingWeight(id, impact.contributors)
                if (weight > EPSILON) {
                    result.impacts[index] = impact.score * buffWeight(weight)
                }
            }
        }
    }

    private fun processRelations() {
        for ((id, _) in data.entries) {
            processEntryRelations(id, true)
        }
    }

    private fun processEntryRelations(id: ID, storeRelationScores: Boolean = false): ScoreVector {
        val relationScores = arrayListOf<ScoreVector>()
        if(processEntryRelationsStack.push(id)) {
            for ((index, relation) in data.relations.withIndex()) {
                var relationResult = ScoreVector.ZERO
                val contributingWeight = getContributingWeight(id, relation.contributors)
                if (contributingWeight <= EPSILON) {
                    continue
                }

                for ((reference, referenceWeight) in relation.references) {
                    if (getContainWeight(id, reference) > EPSILON) {
                        // self-relation
                        ScoreVector.ZERO
                    } else {
                        val totalRelationScore = processEntryRelations(reference)
                        val totalImpactScore = getResult(reference).toResult().totalImpact

                        val referenceOverall = totalImpactScore + totalRelationScore
                        relationResult += referenceWeight * referenceOverall
                    }
                }

                if(storeRelationScores) {
                    getResult(id).relations[index] = relationResult
                }

                relationScores.add(relationResult)
            }
        }

        processEntryRelationsStack.pop()
        return combineVectors(relationScores)
    }

    private fun buffWeight(weight: Double): Double {
        return weight.pow(0.25)
    }

    private fun warnNullEntry(id: ID) {
        println("WARN: Null entry $id")
    }

    private fun getContainWeight(parent: ID, child: ID): Double {
        var result = 0.0
        if (parent == child) {
            return 1.0
        }

        if (getContainWeightStack.push(Pair(parent, child))) {
            result = (data.entries[parent] ?: return warnNullEntry(parent).let { 0.0 })
                .children
                .maxOf { (id, weight) -> getContainWeight(id, child) * weight }
                .coerceAtMost(1.0)
        }

        getContainWeightStack.pop()
        return result
    }

    private fun getContributingWeight(id: ID, contributors: Map<ID, Double>): Double {
        return contributors.map { (contributor, weight) ->
            getContainWeight(id, contributor) * weight
        }.sum().coerceAtMost(1.0)
    }
}