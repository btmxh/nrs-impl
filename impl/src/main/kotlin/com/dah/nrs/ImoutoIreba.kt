package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.ImoutoIreba() {
    Entry {
        id = "F-VGMDB-5485"
        title = "Imouto sae Ireba Ii."

        Entry {
            id = "A-MAL-35413"
            bestGirl = "Miyako Shirakawa" // generated(generate_best_girls.dart v0.1.0)

            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.6, 0.2)
            NEI(0.5, Emotion.AP)
            FeatureMusic("M-VGMDB-AL-70621-1")
            GateOpen("F-VGMDB-3275")
        }

        Entry {
            id = "M-VGMDB-AL-70621"
            Visual(VisualKind.AlbumArt, 0.5, 0.2)

            SubIDEntry("1") {
                Music(0.6);
                OsuSong(personal = 0.5, community = 0.1)
            }
        }
    }
}
