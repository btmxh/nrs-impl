package com.dah.nrs.core

import com.dah.nrs.exts.*

@Suppress("PropertyName")
class EntryResult(context: NRSContext, val impacts: Map<Int, ScoreVector>, val relations: Map<Int, ScoreVector>) {
    val totalImpact = context.combineVectors(impacts.values)
    val totalRelation = context.combineVectors(relations.values)
    val overallVector = totalImpact + totalRelation

    val DAH_overall_score_overallScore by lazy {
        if (context.DAH_overall_score) {
            listOf(Emotion, Art, Information, Boredom, Additional)
                .sumOf { combine(it.factors.map { factor -> overallVector[factor.vectorIndex] }, it.weight) }
        } else null
    }
}