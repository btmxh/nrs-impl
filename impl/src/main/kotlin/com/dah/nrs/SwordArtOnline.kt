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
            title = "Sword Art Online"

            bestGirl = "Yuuki Asuna"
            FeatureMusic("M-VGMDB-AL-33537-1")
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.25)
        }

        Entry {
            id = "A-MAL-21881"
            title = "Sword Art Online II"

            bestGirl = "Yuuki Asuna"
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.25)
        }

        Entry {
            id = "A-MAL-31765"
            title = "Sword Art Online Movie: Ordinal Scale"

            bestGirl = "Yuuki Asuna"
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.6, 0.25)
        }

        Contains("M-VGMDB-AL-33537-1")
    }
}
