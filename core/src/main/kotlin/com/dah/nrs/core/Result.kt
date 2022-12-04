package com.dah.nrs.core

import com.dah.nrs.exts.*

@Suppress("PropertyName")
class EntryResult(context: NRSContext, val totalImpact: ScoreVector, val totalRelation: ScoreVector) {
    val overallVector = totalImpact + totalRelation

    val DAH_overall_score_overallScore by lazy {
        context.DAH_overall_score.ifEnabled {
            listOf(Emotion, Art, Boredom, Additional)
                .sumOf { combine(it.factors.map { factor -> overallVector[factor.vectorIndex] }, it.weight) }
        }
    }

    val DAH_anime_normalize_score by lazy {
        context.DAH_anime_normalize.ifEnabled {
            val baseAnimeScores = it.baseAnimeScores
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
        }
    }
}
