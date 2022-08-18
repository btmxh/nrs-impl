package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.Arifureta() {
    Entry {
        id = "F-VGMDB-6083"
        title = "Arifureta Shokugyou de Sekaisaikyou"

        Entry {
            id = "A-MAL-36882"
            title = "Arifureta Shokugyou de Sekai Saikyou"
            bestGirl = "Yue"

            Boredom(Boredom.Completed)

            // MC got dumped by his friends made me kinda angry
            NEI(2.5, Emotion.AU)
            Visual(VisualKind.Animated, 0.5, 0.1)

            FeatureMusic("M-VGMDB-AL-86592-1")
        }

        Contains("M-VGMDB-AL-86592-1")
    }

    Entry {
        id = "M-VGMDB-AL-86592"
        title = "FLARE"

        Visual(VisualKind.AlbumArt, 0.05, 0.5)
        SubIDEntry("1") {
            Music(1.0)
            OsuSong(personal = 0.1, community = 0.05)
        }
    }
}