@file:Suppress("unused", "FunctionName")

package com.dah.nrs.exts

import com.dah.nrs.core.*
import com.dah.nrs.dsl.*
import kotlinx.serialization.json.addJsonObject
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import java.time.LocalDate
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.tanh
import kotlin.math.withSign

class DAH_standards(builder: NRSContextBuilder): Extension(builder) {
    init {
        dependencies.addAll(listOf(
            DAH_factors::class.simpleName!!
        ))
    }
}

data class Level(val index: Int, val name: String, val value: Double)

val Boredom.Completed
    get() = Level(0, "Completed", 1.0)
val Boredom.CompletedWithNoticeableBoredom
    get() = Level(1, "Completed with noticeable boredom", 0.5)
val Boredom.Dropped
    get() = Level(2, "Dropped", -1.0)
val Boredom.Unwatched
    get() = Level(3, "Unwatched", 0.0)
val Boredom.Watching
    get() = Level(4, "Watching", 0.75)
val Boredom.TempOnHold
    get() = Level(5, "Temporarily On-Hold", -0.5)
fun Boredom.PartiallyDropped(value: Double) = Level(6, "Partially dropped", value)

fun AcceptImpact.Impact(block: DSLImpact.() -> Unit) {
    acceptImpact(DSLImpact(context).also(block))
}

fun AcceptRelation.Relation(block: DSLRelation.() -> Unit) {
    acceptRelation(DSLRelation(context).also(block))
}

// we calculate the inverse combine of emotion contributing factors
// basically this ensures that the PADS impact score vector will have
// the following property:
// combine(PADSImpactScoreVector, Emotion.weight) = 1.0
// multiply this vector by `x` to change 1.0 to x in the above property
private fun emotionVector(context: NRSContext, vararg emotions: Pair<Emotion.Factor, Double>): ScoreVector {
    if(emotions.isEmpty()) {
        error("Empty list of emotions")
    }
    val contributingFactors = emotions.map { it.second }
    val combinedFactor = combine(contributingFactors, Emotion.weight)
    val baseScore = 1.0 / combinedFactor

    return context.vector {
        emotions.forEach { (factor, weight) -> set(factor, baseScore * weight) }
    }
}

private fun DSLImpact.emotion(baseScore: Double, vararg emotions: Pair<Emotion.Factor, Double>) {
    score = emotionVector(context, *emotions) * baseScore
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
    val padsScore = mapClampThrow(length.toDouble().coerceAtMost(5.0), 1.0..5.0, 3.0..5.0) {
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
    val mappedScore = mapClampThrow(abs(score), 0.0..10.0, 2.0..3.0) {
        "$score not in range 0..10"
    }.withSign(score)

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
    val mappedScore = mapClampThrow(abs(score), 0.0..10.0, 0.0..2.0) {
        "$score not in range 0..10"
    }.withSign(score)

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
    if(periods.isEmpty()) {
        error("Empty list of periods")
    }
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

fun AcceptImpact.EHI(block: DSLImpact.() -> Unit = {}) {
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

fun AcceptImpact.Meme(strength: Double, duration: Int, block: DSLImpact.() -> Unit = {}) {
    if (strength !in 0.0..1.0) {
        error("$strength not in range 0..1")
    }

    val durationValue = (duration.toDouble() / 120).pow(0.25)

    Impact {
        description = "Meme"
        score = vector {
            set(Emotion.AP, strength * durationValue * 3.0)
        }
        meta("type", "meme")
        meta("strength", strength)
        meta("meme_duration", duration)
        meta("meme_duration_value", durationValue)
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

fun AcceptImpact.Music(musicScore: Double, block: DSLImpact.() -> Unit = {}) {
    Impact {
        description = "Music"
        score = vector {
            set(Art.Music, mapClampThrow(musicScore, 0.0..10.0, 0.0..3.0) {
                "$musicScore not in range 0..10"
            })
        }
        meta("type", "NONSTD_music")
        meta("input_score", musicScore)
        block()
    }
}

fun MusicContainFactor(rate: Double) = rate.pow(1.0 / ChemistryBuffFactor)
fun MusicContainFactor(numEntries: Int, numContributeEntries: Int) =
    MusicContainFactor(numEntries.toDouble() / numContributeEntries)

fun AcceptImpact.OsuSong(personal: Double = 0.0, community: Double = 0.0) {
    val personalFactor = mapClampThrow(personal, 0.0..10.0, 0.0..0.5) {
        "$personal not in range 0..10"
    }

    val communityFactor = mapClampThrow(community, 0.0..10.0, 0.0..0.2) {
        "$community not in range 0..10"
    }

    Impact {
        description = "osu! song"
        score = vector {
            set(Emotion.AP, personalFactor + communityFactor)
        }
        meta("type", "NONSTD_osu_song")
        meta("personal_input", personal)
        meta("community_input", community)
        meta("personal_factor", personalFactor)
        meta("community_factor", communityFactor)
    }
}

fun AcceptRelation.Remix(id: String, block: DSLRelation.() -> Unit = {}) {
    Relation {
        references[id] = vector(0.2).toDiagonalMatrix()
        block()
    }
}

fun AcceptRelation.FeatureMusic(id: String, block: DSLRelation.() -> Unit = {}) {
    Relation {
        references[id] = vector {
            set(Art.Music, 0.2)
        }.toDiagonalMatrix()
        block()
    }
}

fun AcceptRelation.KilledBy(id: String, potential: Double, effect: Double, block: DSLRelation.() -> Unit = {}) {
    Relation {
        references[id] = (vector {
            set(Emotion.AP, 0.2)
            set(Emotion.AU, 0.1)
            set(Emotion.CP, 0.05)
            set(Emotion.CU, 0.05)
            set(Emotion.MP, 0.2)
            set(Emotion.MU, 0.1)

            set(Art.Illustration, 0.1)
            set(Art.Language, 0.1)
            set(Art.Music, 0.05)

            set(Information.Politics, 0.0)
            set(Information.GeneralInfo, 0.0)

            set(Boredom, 0.1)
            set(Additional, 0.0)
        } * potential * effect * 2.0).toDiagonalMatrix()
        block()
    }
}

@Suppress("unused")
fun AcceptRelation.GateOpen(id: String, block: DSLRelation.() -> Unit = {}) {
    // TODO: a good gateopen impl
}

const val ImageVocalContainFactor = 0.8

fun mapClampThrow(
    input: Double,
    inputRange: ClosedRange<Double>,
    outputRange: ClosedRange<Double>,
    block: () -> String,
): Double {
    if (input !in inputRange) {
        error(block())
    }

    return map(input, inputRange, outputRange)
}
