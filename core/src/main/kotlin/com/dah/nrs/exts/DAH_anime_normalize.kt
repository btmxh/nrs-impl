package com.dah.nrs.exts

import com.dah.nrs.core.NRSContext
import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry

fun NRSContext.DAH_anime_normalize_getBaseAnimeScores(): List<Double> {
    val scope = DSLScope(this).apply {
        Entry {
            id = "1"
            title = "MAL-1 base anime (Appalling)"

            Boredom(Boredom.Dropped)
            AdditionalImpact("This shit sucks", -2.0)
        }

        Entry {
            id = "2"
            title = "MAL-2 base anime (Horrible)"

            Boredom(Boredom.Dropped)
            AdditionalImpact("This shit sucks", -1.0)
        }

        Entry {
            id = "3"
            title = "MAL-3 base anime (Very Bad)"

            Boredom(Boredom.Dropped)
        }

        Entry {
            id = "4"
            title = "MAL-4 base anime (Bad)"

            Boredom(Boredom.TempOnHold)
        }

        Entry {
            id = "5"
            title = "MAL-5 base anime (Average)"

            Boredom(Boredom.Completed)
        }

        Entry {
            id = "6"
            title = "MAL-6 base anime (Fine)"

            Boredom(Boredom.Completed)
            NEI(2.5, Emotion.AP)
        }

        Entry {
            id = "7"
            title = "MAL-7 base anime (Good)"

            Boredom(Boredom.Completed)
            NEI(7.5, Emotion.AP)
        }

        Entry {
            id = "8"
            title = "MAL-8 base anime (Very Good)"

            Boredom(Boredom.Completed)
            Cry(Emotion.CU)
            PADS(1, Emotion.CU)
        }

        Entry {
            id = "9"
            title = "MAL-9 base anime (Great)"

            Boredom(Boredom.Completed)
            Cry(Emotion.CU)
            PADS(5, Emotion.CU)
        }

        Entry {
            id = "10"
            title = "MAL-10 base anime (Masterpiece)"

            Boredom(Boredom.Completed)
            Cry(Emotion.CU)
            PADS(5, Emotion.CU)
            PADS(5, Emotion.CP)
            AEI(7.5, Emotion.MP)
            FeatureMusic("M-1")
        }

        Entry {
            id = "M-1"
            title = "MAL-10 base anime sample music"

            Music(5.0)
        }
    }
    val results = process(scope.getData())

    val overallScores = results.mapValues { (_, it) -> it.DAH_overall_score_overallScore!! }
    return DoubleArray(10) { overallScores[(it + 1).toString()]!! }.toList()
}
