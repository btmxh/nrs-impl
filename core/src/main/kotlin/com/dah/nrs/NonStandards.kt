package com.dah.nrs

import kotlin.math.pow

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

fun AcceptRelation.KilledBy(id: String, block: DSLRelation.() -> Unit = {}) {
    Relation {
        references[id] = vector {
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
        }.toDiagonalMatrix()
        block()
    }
}

fun AcceptRelation.GateOpen(id: String, block: DSLRelation.() -> Unit = {}) {
    // TODO: a good gateopen impl
}

const val ImageVocalContainFactor = 0.8