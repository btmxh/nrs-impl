package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.ZombielandSaga() {
    Entry {
        id = "F-VGMDB-9825"
        title = "ZOMBIE LAND SAGA"
        Entry {
            id = "A-MAL-37976"
            bestGirl = "Minamoto Sakura"

            // kinda funny
            AEI(5.0, Emotion.AP)
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        Entry {
            id = "A-MAL-40174"
            bestGirl = "Minamoto Sakura"

            // the zombieland saga incident
            Progress(Boredom.Dropped, 7)
            Visual(VisualKind.Animated, 0.4, 0.5)
            KilledBy("V-VNDB-12849", 0.3, 0.2)
            FeatureMusic("M-VGMDB-AL-109368")
        }

        Entry {
            id = "M-VGMDB-AL-109368"

            Visual(VisualKind.AlbumArt, 0.4, 0.5)
            SubIDEntry("1") {
                Music(5.5)
            }
        }
    }
}
