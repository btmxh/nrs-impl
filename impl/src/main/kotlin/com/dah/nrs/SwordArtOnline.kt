package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.*

fun DSLScope.SwordArtOnline() {
    Entry {
        id = "F-VGMDB-2633"
        title = "Sword Art Online"

        Entry {
            id = "A-MAL-11757"

            bestGirl = "Yuuki Asuna"
            FeatureMusic("M-VGMDB-AL-33537-1")
            AnimeProgressOld(Boredom.Completed, 25)
            Visual(VisualKind.Animated, 0.4, 0.25)
        }

        Entry {
            id = "A-MAL-21881"

            bestGirl = "Yuuki Asuna"
            AnimeProgressOld(Boredom.Completed, 24)
            Visual(VisualKind.Animated, 0.4, 0.25)
        }

        Entry {
            id = "A-MAL-31765"

            bestGirl = "Yuuki Asuna"
            AnimeProgressOld(Boredom.Completed, 1)
            Visual(VisualKind.Animated, 0.6, 0.25)
        }

        Contains("M-VGMDB-AL-33537-1")
    }
}
