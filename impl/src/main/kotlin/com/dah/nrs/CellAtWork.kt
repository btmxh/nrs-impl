package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.CellAtWork() {
    Entry {
        id = "F-VGMDB-8677"
        title = "Hataraku Saibou"

        Entry {
            id = "A-MAL-37141"
            bestGirl = "Kesshouban" // i mean it's because the character design suck ass

            AnimeProgressOld(Boredom.Dropped, 5)
            Visual(VisualKind.Animated, 0.4, 0.1)
            FeatureMusic("M-VGMDB-AL-77471-1")
        }

        Contains("M-VGMDB-AL-77471-1")
    }
}
