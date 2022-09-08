package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.SthKara() {
    Entry {
        id = "F-VGMDB-6626"
        title = "Iroduku Sekai no Ashita kara"

        Entry {
            id = "A-MAL-37497"
            bestGirl = "Tsukishiro Hitomi"

            Progress(Boredom.Completed)
            // ending was good
            AEI(2.5, Emotion.CU to 0.9, Emotion.AP to 0.1)

            Visual(VisualKind.Animated, 0.6, 0.5)
            FeatureMusic("M-VGMDB-AL-80341-1")
        }

        Contains("M-VGMDB-AL-80341-1")
    }

    Entry {
        id = "M-VGMDB-AL-80341"

        Visual(VisualKind.AlbumArt, 0.2, 0.3)

        SubIDEntry("1") {
            Music(5.0)
        }
    }
}
