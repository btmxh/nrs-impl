package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.DrStone() {
    Entry {
        id = "F-VGMDB-9159"
        title = "Dr. Stone"
        // bac si da

        Entry {
            id = "A-MAL-38691"
            bestGirl = "Yuzuriha Ogawa"
            AnimeProgressOld(Boredom.Completed, 24)
            Visual(VisualKind.Animated, 0.3, 0.75)
            // "plot is good"
            AEI(2.5, Emotion.AP)
            FeatureMusic("M-VGMDB-AL-87927-1")
        }

        Contains("M-VGMDB-AL-87927-1")

        Entry {
            id = "A-MAL-40852"
            bestGirl = "Yuzuriha Ogawa"
            AnimeProgressOld(Boredom.Completed, 11)
            Visual(VisualKind.Animated, 0.3, 0.75)
            AEI(1.0, Emotion.AP)
        }

        Entry {
            id = "A-MAL-50612"
            bestGirl = "Yuzuriha Ogawa"
            AnimeProgressOld(Boredom.Completed, 1)
            Visual(VisualKind.Animated, 0.3, 0.75)
            NEI(6.0, Emotion.AP)
        }
    }

    Entry {
        id = "M-VGMDB-AL-87927"

        Visual(VisualKind.AlbumArt, 0.15, 0.2)

        SubIDEntry("1") {
            Music(2.5)
            OsuSong(personal = 1.0)
        }
    }
}
