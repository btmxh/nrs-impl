package com.dah.nrs.exts

import com.dah.nrs.core.Extension
import com.dah.nrs.core.NRSContextBuilder
import com.dah.nrs.core.context
import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry

class DAH_anime_normalize(builder: NRSContextBuilder) : Extension(builder) {
    init {
        dependencies.addAll(listOf(
            DAH_factors::class.simpleName!!,
            DAH_overall_score::class.simpleName!!,
            DAH_standards::class.simpleName!!
        ))
    }

    val baseAnimeScores = let {
        val dummyContext = context {
            DAH_factors = DAH_factors(this)
            DAH_overall_score = DAH_overall_score(this)
            DAH_standards = DAH_standards(this)
        }

        val scope = DSLScope(dummyContext).apply {
            Entry {
                id = "1"
                title = "MAL-1 base anime (Appalling)"

                AnimeProgressOld(Boredom.Dropped, 12)
                AdditionalImpact("This shit sucks", -2.0)
                Visual(VisualKind.Animated, 0.1, 0.2)
            }

            Entry {
                id = "2"
                title = "MAL-2 base anime (Horrible)"

                AnimeProgressOld(Boredom.Dropped, 12)
                AdditionalImpact("This shit sucks", -1.0)
                Visual(VisualKind.Animated, 0.2, 0.2)
            }

            Entry {
                id = "3"
                title = "MAL-3 base anime (Very Bad)"

                AnimeProgressOld(Boredom.Dropped, 12)
                Visual(VisualKind.Animated, 0.3, 0.2)
            }

            Entry {
                id = "4"
                title = "MAL-4 base anime (Bad)"

                AnimeProgressOld(Boredom.TempOnHold, 12)
                Visual(VisualKind.Animated, 0.3, 0.3)
            }

            Entry {
                id = "5"
                title = "MAL-5 base anime (Average)"

                AnimeProgressOld(Boredom.Completed, 12)
                Visual(VisualKind.Animated, 0.4, 0.3)
            }

            Entry {
                id = "6"
                title = "MAL-6 base anime (Fine)"

                AnimeProgressOld(Boredom.Completed, 12)
                AEI(0.1, Emotion.AP)
                Visual(VisualKind.Animated, 0.5, 0.3)
            }

            Entry {
                id = "7"
                title = "MAL-7 base anime (Good)"

                AnimeProgressOld(Boredom.Completed, 12)
                EHI()
                Visual(VisualKind.Animated, 0.5, 0.5)
            }

            Entry {
                id = "8"
                title = "MAL-8 base anime (Very Good)"

                AnimeProgressOld(Boredom.Completed, 12)
                Cry(Emotion.CU)
                PADS(3, Emotion.CU)
                EPI(0.5)
                Visual(VisualKind.Animated, 0.6, 0.5)
            }

            Entry {
                id = "9"
                title = "MAL-9 base anime (Great)"

                AnimeProgressOld(Boredom.Completed, 12)
                Cry(Emotion.CU)
                PADS(7, Emotion.CU)
                EHI()
                EPI(1.0)
                Visual(VisualKind.Animated, 0.7, 0.5)
            }

            Entry {
                id = "10"
                title = "MAL-10 base anime (Masterpiece)"

                AnimeProgressOld(Boredom.Completed, 12)
                Cry(Emotion.CU)
                PADS(10, Emotion.CU)
                PADS(5, Emotion.CP)
                AEI(0.75, Emotion.MP)
                EHI()
                EPI(1.0)
                FeatureMusic("M-1")
                FeatureMusic("M-2")
                FeatureMusic("M-3")
                FeatureMusic("M-4")
                Visual(VisualKind.Animated, 0.8, 0.5)
            }

            Entry {
                id = "M-1"
                title = "MAL-10 base anime sample music"

                Music(0.5)
            }

            Entry {
                id = "M-2"
                title = "MAL-10 base anime sample music"

                Music(0.6)
            }

            Entry {
                id = "M-3"
                title = "MAL-10 base anime sample music"

                Music(0.7)
            }

            Entry {
                id = "M-4"
                title = "MAL-10 base anime sample music"

                Music(0.8)
            }
        }

        val results = dummyContext.process(scope.getData())
        val overallScores = results.mapValues { (_, it) -> it.DAH_overall_score_overallScore!! }
        DoubleArray(10) { overallScores[(it + 1).toString()]!! }.toList()
    }
}
