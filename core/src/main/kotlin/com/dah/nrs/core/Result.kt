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

    val DAH_anime_normalize_score by lazy {
        if (context.DAH_anime_normalize) {
            val baseAnimeScores = context.DAH_anime_normalize_baseAnimeScores!!
            val overallScore = DAH_overall_score_overallScore!!
            val scoreLevels = baseAnimeScores.size

            if (overallScore < baseAnimeScores.first()) {
                0.0
            } else if (overallScore > baseAnimeScores.last()) {
                (scoreLevels - 1).toDouble()
            } else {
                fun interpolate(x: Double) = x
                val index = baseAnimeScores.indexOfFirst { it > overallScore }
                require(index in 0 until scoreLevels)
                val prev = baseAnimeScores[index - 1]
                val next = baseAnimeScores[index]
                val interpolateFactor = (overallScore - prev) / (next - prev)
                index + interpolate(interpolateFactor) - 1.0
            } + 1.0
        } else null
    }
}