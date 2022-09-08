package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.JustBecause() {
    Entry {
        id = "F-VGMDB-5678"
        title = "Just Because!"

        Entry {
            id = "A-MAL-35639"
            bestGirl = "Natsume Mio"

            Progress(Boredom.Completed)
            // Pretty decent drama
            AEI(5.0, Emotion.CU)
            FeatureMusic("M-VGMDB-AL-70716-1")
            Visual(VisualKind.Animated, 0.4, 0.6)
        }

        Contains("M-VGMDB-AL-70716-1")
    }
}
