package com.dah.nrs.core

import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min
import kotlin.math.pow
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

const val ChemistryBuffFactor = 0.6

class CalculationEntry(val entry: IEntry) {
    val containMap = hashMapOf<ID, Double>()
    var containMapInit = false
    var impactScore = null as ScoreVector?

    val relations = ArrayList<Pair<IRelation, Double>>()
    var relationScore = null as ScoreVector?
}

internal class Processor(private val context: NRSContext, private val data: NRSData) {
    private val getContainWeightStack = ReoccurrenceStack<Pair<ID, ID>>(1)
    private val processEntryRelationsStack = ReoccurrenceStack<ID>()
    private val entries = data.entries.mapValues { (_, it) -> CalculationEntry(it) }

    @OptIn(ExperimentalTime::class)
    fun process(): Map<ID, EntryResult> {
        println(measureTime { solveContainWeight() })
        println(measureTime { calculateImpactScore() })
        println(measureTime { fillRelationReferences() })
        println(measureTime { calculateRelationScore() })

        return entries.mapValues { (_, id) -> EntryResult(context, id.impactScore!!, id.relationScore!!) }
    }

    private fun solveContainWeightSingle(calcEntry: CalculationEntry, stack: MutableList<ID>) {
        if (calcEntry.containMapInit) {
            return
        }

        if (calcEntry.entry.id in stack) {
            error("Circular entry containment: $stack")
        }

        stack.add(calcEntry.entry.id)
        for ((childId, childWeight) in calcEntry.entry.children) {
            val child = entries[childId]!!
            solveContainWeightSingle(child, stack)
            assert(child.containMapInit)
            calcEntry.containMap[childId] = childWeight
            for ((grandchildId, grandchildWeight) in child.containMap) {
                calcEntry.containMap[grandchildId] =
                    min(1.0, (calcEntry.containMap[grandchildId] ?: 0.0) + grandchildWeight * childWeight)
            }
        }
        stack.removeLast()
        calcEntry.containMapInit = true
    }

    private fun solveContainWeight() {
        for ((_, entry) in entries) {
            solveContainWeightSingle(entry, LinkedList())
        }
    }

    private fun calculateImpactScore() {
        for ((id, entry) in entries) {
            val impactScores = data.impacts.flatMap {
                val weight = it.contributors.entries.sumOf { (contribId, contribWeight) ->
                    contribWeight * if (contribId == id) {
                        1.0
                    } else {
                        entry.containMap[contribId] ?: 0.0
                    }
                }.coerceAtMost(1.0)
                if (weight > 0.0) {
                    listOf(it.score * buffWeight(weight))
                } else {
                    emptyList()
                }
            }

            entry.impactScore = context.combineVectors(impactScores)
        }
    }

    private fun fillRelationReferences() {
        for ((id, entry) in entries) {
            data.relations.map {
                val weight = it.contributors.entries.sumOf { (contribId, contribWeight) ->
                    contribWeight * if (id == contribId) {
                        1.0
                    } else {
                        entry.containMap[contribId] ?: 0.0
                    }
                }.coerceAtMost(1.0)

                Pair(it, buffWeight(weight))
            }
                .filter { (_, weight) -> weight > 0.0 }
                .toCollection(entry.relations)
        }
    }

    private fun calculateRelationScore() {
        for (entry in entries.values) {
            entry.relationScore = calculateRelationScoreSingle(entry, ReoccurrenceStack())
        }
    }

    private fun calculateRelationScoreSingle(entry: CalculationEntry, stack: ReoccurrenceStack<ID>): ScoreVector {
        val relationScores = arrayListOf<ScoreVector>()
        if (stack.push(entry.entry.id)) {
            for ((relation, contributeWeight) in entry.relations) {
                val relationScore = relation.references.map { (referencedId, referenceWeight) ->
                    val referenced = entries[referencedId]!!
                    val referencedRelationScore = calculateRelationScoreSingle(referenced, stack)
                    val referencedOverallScore = referenced.impactScore!! + referencedRelationScore
                    referenceWeight * referencedOverallScore
                }.reduceOrNull { v1, v2 -> v1 + v2 }
                relationScore?.let { relationScores.add(it * contributeWeight) }
            }
        }

        stack.pop(entry.entry.id)
        return context.combineVectors(relationScores)
    }

    private fun buffWeight(weight: Double): Double {
        return weight.pow(ChemistryBuffFactor)
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