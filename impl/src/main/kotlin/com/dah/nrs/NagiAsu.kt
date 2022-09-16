package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.NagiAsu() {
    Entry {
        id = "F-VGMDB-2662"
        title = "Nagi no Asu kara"

        Contains("M-VGMDB-AL-41278-1")
        Contains("M-VGMDB-AL-41280-1")
        Contains("M-VGMDB-AL-42900-1")
        Contains("M-VGMDB-AL-42900-3")
        Contains("M-VGMDB-AL-43164-1")

        Entry {
            id = "M-VGMDB-AL-45187"

            Visual(VisualKind.AlbumArt, 0.4, 0.4)
            SubIDEntry("1") {
                Music(6.0)
            }
        }

        Entry {
            id = "A-MAL-16067"

            bestGirl = "Shiodome Miuna"
            // poor best girl
            PADS(2, Emotion.CU)

            // there are other relationships other than the
            // love triangle of best girl and they did make
            // an impact
            NEI(7.5, Emotion.CU)

            WaifuUnknownPeriod("Shiodome Miuna", 90)
            Visual(VisualKind.Animated, 0.6, 0.6)

            Meme(0.7, 25)

            AnimeProgressOld(Boredom.Completed, 26)

            FeatureMusic("M-VGMDB-AL-41278-1")
            FeatureMusic("M-VGMDB-AL-41280-1")
            FeatureMusic("M-VGMDB-AL-42900-1")
            FeatureMusic("M-VGMDB-AL-42900-3")
            FeatureMusic("M-VGMDB-AL-43164-1")
            FeatureMusic("M-VGMDB-AL-45187")
        }
    }
}
