package com.dah.nrs

import kotlinx.serialization.json.*
import java.time.LocalDate
import kotlin.math.tanh

data class Level(val index: Int, val name: String, val value: Double)

val Boredom.Completed get() = Level(0, "Completed", 1.0)
val Boredom.CompletedWithNoticeableBoredom get() = Level(1, "Completed with noticeable boredom", 0.5)
val Boredom.Dropped get() = Level(2, "Dropped", -1.0)
val Boredom.Unwatched get() = Level(3, "Unwatched", 0.0)
val Boredom.Watching get() = Level(4, "Watching", 0.75)
val Boredom.TempOnHold get() = Level(5, "Temporarily On-Hold", -0.5)
fun Boredom.PartiallyDropped(value: Double) = Level(6, "Partially dropped", value)

object Meme {
    val MLessThanADay = Level(0, "Less than a day", 0.0)
    val M1_3Days = Level(1, "1-3 Days", 0.1)
    val M4_7Days = Level(2, "4-7 Days", 0.3)
    val M1_2Weeks = Level(3, "1-2 Weeks", 0.5)
    val M2_3Weeks = Level(4, "2-3 Weeks", 0.6)
    val M3Weeks_1Month = Level(5, "3 Weeks - 1 Month", 0.7)
    val M1_2Months = Level(6, "1-2 Months", 0.8)
    val M2_3Months = Level(7, "2-3 Months", 0.9)
    val MMoreThan3Months = Level(8, "More than 3 months", 1.0)
}

fun AcceptImpact.Impact(block: DSLImpact.() -> Unit) {
    acceptImpact(DSLImpact().also(block))
}

fun AcceptRelation.Relation(block: DSLRelation.() -> Unit) {
    acceptRelation(DSLRelation().also(block))
}

// we calculate the inverse combine of emotion contributing factors
// basically this ensures that the PADS impact score vector will have
// the following property:
// combine(PADSImpactScoreVector, Emotion.weight) = 1.0
// multiply this vector by `x` to change 1.0 to x in the above property
private fun emotionVector(vararg emotions: Pair<Emotion.Factor, Double>): ScoreVector {
    val contributingFactors = emotions.map { it.second }
    val combinedFactor = combine(contributingFactors, Emotion.weight)
    val baseScore = 1.0 / combinedFactor

    return vector {
        emotions.forEach { (factor, weight) -> set(factor, baseScore * weight) }
    }
}

private fun DSLImpact.emotion(baseScore: Double, vararg emotions: Pair<Emotion.Factor, Double>) {
    score = emotionVector(*emotions) * baseScore
    meta("emotions", buildJsonObject {
        emotions.forEach { (factor, weight) -> put(factor.name, weight) }
    })
}

fun AcceptImpact.Cry(vararg emotions: Pair<Emotion.Factor, Double>, block: DSLImpact.() -> Unit = {}) {
    Impact {
        description = "Cry"
        emotion(4.0, *emotions)
        meta("type", "cry")
        block()
    }
}

fun AcceptImpact.PADS(length: Int, vararg emotions: Pair<Emotion.Factor, Double>, block: DSLImpact.() -> Unit = {}) {
    val padsScore = mapClampThrow(length.toDouble(), 1.0..5.0, 3.0..5.0) {
        "PADS too short"
    }

    Impact {
        description = "PADS"
        emotion(padsScore, *emotions)
        meta("type", "pads")
        meta("pads_length", length)
        meta("pads_score", padsScore)
        block()
    }
}

fun AcceptImpact.AEI(score: Double, vararg emotions: Pair<Emotion.Factor, Double>, block: DSLImpact.() -> Unit = {}) {
    val mappedScore = mapClampThrow(score, 0.0..10.0, 2.0..3.0) {
        "$score not in range 0..10"
    }

    Impact {
        description = "AEI"
        emotion(mappedScore, *emotions)
        meta("type", "aei")
        meta("input_score", score)
        meta("clamped_score", score)
        block()
    }
}

fun AcceptImpact.NEI(score: Double, vararg emotions: Pair<Emotion.Factor, Double>, block: DSLImpact.() -> Unit = {}) {
    val mappedScore = mapClampThrow(score, 0.0..10.0, 0.0..2.0) {
        "$score not in range 0..10"
    }

    Impact {
        description = "NEI"
        emotion(mappedScore, *emotions)
        meta("type", "nei")
        meta("input_score", score)
        meta("clamped_score", mappedScore)
        block()
    }
}

fun AcceptImpact.Cry(emotion: Emotion.Factor, block: DSLImpact.() -> Unit = {}) = Cry(emotion to 1.0) { block() }
fun AcceptImpact.PADS(length: Int, emotion: Emotion.Factor, block: DSLImpact.() -> Unit = {}) =
    PADS(length, emotion to 1.0) { block() }
fun AcceptImpact.AEI(score: Double, emotion: Emotion.Factor, block: DSLImpact.() -> Unit = {}) =
    AEI(score, emotion to 1.0) { block() }
fun AcceptImpact.NEI(score: Double, emotion: Emotion.Factor, block: DSLImpact.() -> Unit = {}) =
    NEI(score, emotion to 1.0) { block() }

fun AcceptImpact.Waifu(name: String, vararg periods: Pair<String, String>, block: DSLImpact.() -> Unit = {}) {
    val days = periods.sumOf {
        try {
            val from = LocalDate.parse(it.first)
            val to = LocalDate.parse(it.second)
            val days = to.toEpochDay() - from.toEpochDay()
            if (days < 0) {
                error("Found a waifu period with from > to")
            }
            days
        } catch (e: Exception) {
            e.printStackTrace()
            error("Can't parse waifu periods")
        }
    }

    WaifuUnknownPeriod(name, days.toInt()) {
        meta("periods", buildJsonArray {
            periods.forEach {
                addJsonObject {
                    put("from", it.first)
                    put("to", it.second)
                }
            }
        })
        block()
    }
}

fun AcceptImpact.WaifuUnknownPeriod(name: String, days: Int, block: DSLImpact.() -> Unit = {}) {
    val waifuScore = 1.5 * tanh(days.toDouble() / 60)

    Impact {
        description = "Waifu"
        score = vector {
            set(Emotion.MP, waifuScore)
        }
        meta("type", "waifu")
        meta("name", name)
        meta("length_in_days", days)
        block()
    }
}

fun AcceptImpact.EHI(block: DSLImpact.() -> Unit) {
    Impact {
        description = "EHI"
        score = vector {
            set(Emotion.AP, 3.5)
        }
        meta("type", "ehi")
        block()
    }
}

fun AcceptImpact.EPI(plotScore: Double, block: DSLImpact.() -> Unit = {}) {
    Impact {
        description = "EPI"
        score = vector {
            set(Emotion.AP, mapClampThrow(plotScore, 0.0..10.0, 3.5..4.5) {
                "$score not in range 0..10"
            })
        }
        meta("type", "epi")
        meta("input_score", plotScore)
        block()
    }
}

fun AcceptImpact.Jumpscare(block: DSLImpact.() -> Unit = {}) {
    Impact {
        description = "Jumpscare"
        score = vector {
            set(Emotion.MU, 1.0)
        }
        meta("type", "jumpscare")
        block()
    }
}

// horror
fun AcceptImpact.SleeplessNight(block: DSLImpact.() -> Unit = {}) {
    Impact {
        description = "Sleepless Night (Horror)"
        score = vector {
            set(Emotion.MU, 4.0)
        }
        meta("type", "sleepless_night_horror")
        block()
    }
}

fun AcceptImpact.Politics(block: DSLImpact.() -> Unit = {}) {
    Impact {
        description = "Inspired political discovery"
        score = vector {
            set(Information.Politics, 0.75)
        }
        meta("type", "politics_inspiration")
        block()
    }
}

fun AcceptImpact.InterestField(newField: Boolean, block: DSLImpact.() -> Unit = {}) {
    Impact {
        description = "Made me interested in a field"
        score = vector {
            set(Information.GeneralInfo, if (newField) 2.0 else 1.0)
        }
        meta("type", "field_interest_gateopen")
        meta("new_field", newField)
        block()
    }
}

fun AcceptImpact.Boredom(boredomLevel: Level, block: DSLImpact.() -> Unit = {}) {
    Impact {
        description = "Boredom: ${boredomLevel.name}"
        score = vector {
            set(Boredom, boredomLevel.value)
        }
        meta("type", "boredom")
        meta("boredom_level", boredomLevel.index)
        meta("boredom_level_name", boredomLevel.name)
        block()
    }
}

fun AcceptImpact.Meme(strength: Double, duration: Level, block: DSLImpact.() -> Unit = {}) {
    Impact {
        description = "Meme"
        score = vector {
            set(Emotion.AP, strength * duration.value * 3.0)
        }
        meta("type", "meme")
        meta("strength", strength)
        meta("meme_duration", duration.index)
        meta("meme_duration_name", duration.name)
        meta("meme_duration_value", duration.value)
        block()
    }
}

fun AcceptImpact.AdditionalImpact(description: String, value: Double, block: DSLImpact.() -> Unit = {}) {
    Impact {
        this.description = description
        score = vector {
            set(Additional, value)
        }
        meta("type", "additional")
        block()
    }
}
