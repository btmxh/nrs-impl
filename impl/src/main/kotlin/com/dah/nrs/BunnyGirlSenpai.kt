package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.BunnyGirlSenpai() {
    Entry {
        id = "F-VGMDB-6852"
        title = "Seishun Buta Yarou Series"

        Entry {
            id = "A-MAL-37450"
            bestGirl = "Makinohara Shouko"

            AnimeProgressOld(Boredom.Dropped, 9)
            // plot kinda ok
            NEI(5.0, Emotion.AP)
            Visual(VisualKind.Animated, 0.6, 0.15)
            FeatureMusic("M-VGMDB-AL-80253-1")
        }

        Contains("M-VGMDB-AL-80253-1")
    }

    Entry {
        id = "M-VGMDB-AL-80253"

        // tf is this lol
        Visual(VisualKind.AlbumArt, 0.1, 0.6)

        SubIDEntry("1") {
            Music(1.0)
        }
    }
}
