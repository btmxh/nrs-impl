package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

fun DSLScope.KageJitsu() {
    // 2023 is the year of isekai
    Entry {
        id = "F-VGMDB-9991"
        title = "Kage no Jitsuryokusha ni Naritakute!"

        // "dude mc is literally me..."
        // - every AAists (anti-appearancists) and EAAists (extreme AAists) in the NAP

        // ("... except for the fact that he is actually powerful, not like me xdddd")

        Entry {
            id = "A-MAL-48316"
            title = "Kage no Jitsuryokusha ni Naritakute!"

            bestGirl = "Sherry Barnett"
            // worse life than sena FeelsStrongMan
            // best girl discussion: https://github.com/ngoduyanh/nrs-impl-kt/discussions/380
            // got fucked himeno sena: https://github.com/ngoduyanh/nrs-impl-kt/issues/260

            // dont let her looks fool you, she is not in anyway related to the idol franchise
            // love live (:skull:), she is not rina-chan boardo (you will pay for that
            // misunderstanding incident you prick) and yandere ayumu (haha love live fandom
            // funnyChamp)

            // also she brought the anime a relatively light one-day PADS kekw
            PADS(1, Emotion.CU to 0.8, Emotion.MP to 0.2) {
                ValidatorSuppress("dah-lone-pads")
            }
            AEI(0.8, Emotion.CU to 0.8, Emotion.MP to 0.2)

            // I AM atomic
            EHI() // humor
            NEI(0.25, Emotion.AP) // plot

            Meme(0.8, numDays("2023-03-01"))
            FeatureMusic("M-VGMDB-AL-122851")

            // the 7 shadow art is meh but that individual saved the anime
            Visual(VisualKind.Animated, 0.6, 0.4)

            // binged ez clap
            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 20)
        }

        Entry {
            id = "M-VGMDB-AL-122851"
            // not anime girls :anger:, this needs correction
            Visual(VisualKind.AlbumArt, 0.2, 0.4)

            SubIDEntry("1") {
                // same composer as "WONDERFUL WORLD", "Watashi to Minna no Uta"
                // (luminous witches song W), new game's step by step up
                // :arrow_up: :arrow_up: :arrow_up: and especially :skull:
                // :warning: :rotating_light: :drumrolls:
                // nyumber
                // one
                // zettai
                // saikyou
                // (yes, that nozsist song)

                Music(0.5)
            }
        }

    }
}
