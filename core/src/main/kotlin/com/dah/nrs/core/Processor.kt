package com.dah.nrs.core

import kotlin.math.pow

internal class MutableResult(
    val impacts: HashMap<Int, ScoreVector> = hashMapOf(),
    val relations: HashMap<Int, ScoreVector> = hashMapOf()
) {
    fun toResult(context: NRSContext): EntryResult {
        return EntryResult(context, impacts, relations)
    }
}

internal class Processor(private val context: NRSContext, private val data: NRSData) {
    private val getContainWeightStack = ReoccurrenceStack<Pair<ID, ID>>(1)
    private val processEntryRelationsStack = ReoccurrenceStack<ID>()

    private val results = hashMapOf<ID, MutableResult>()

    fun process(): Map<ID, EntryResult> {
        processImpacts()
        processRelations()

        return results.mapValues { (_, mutableResult) -> mutableResult.toResult(context) }
    }

    private fun getResult(id: ID): MutableResult {
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
        if (processEntryRelationsStack.push(id)) {
            for ((index, relation) in data.relations.withIndex()) {
                var relationResult = context.zeroVector()
                val contributingWeight = getContributingWeight(id, relation.contributors)
                if (contributingWeight <= EPSILON) {
                    continue
                }

                for ((reference, referenceWeight) in relation.references) {
                    if (getContainWeight(id, reference) > EPSILON) {
                        // self-relation
                        context.zeroVector()
                    } else {
                        val totalRelationScore = processEntryRelations(reference)
                        val totalImpactScore = getResult(reference).toResult(context).totalImpact

                        val referenceOverall = totalImpactScore + totalRelationScore
                        relationResult += referenceWeight * referenceOverall
                    }
                }

                if (storeRelationScores) {
                    getResult(id).relations[index] = relationResult
                }

                relationScores.add(relationResult)
            }
        }

        processEntryRelationsStack.pop(id)
        return context.combineVectors(relationScores)
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

        val pair = Pair(parent, child)
        if (getContainWeightStack.push(pair)) {
            result = ((data.entries[parent] ?: return warnNullEntry(parent).let { 0.0 })
                .children
                .maxOfOrNull { (id, weight) -> getContainWeight(id, child) * weight } ?: 0.0)
                .coerceAtMost(1.0)
        }

        getContainWeightStack.pop(pair)
        return result
    }

    private fun getContributingWeight(id: ID, contributors: Map<ID, Double>): Double {
        return contributors.map { (contributor, weight) ->
            getContainWeight(id, contributor) * weight
        }.sum().coerceAtMost(1.0)
    }
}