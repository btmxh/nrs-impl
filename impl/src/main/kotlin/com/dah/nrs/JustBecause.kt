package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.JustBecause() {
    Entry {
        id = "F-VGMDB-5678"
        title = "Just Because!"
        bestGirl = "Natsume Mio"

        Entry {
            id = "A-MAL-35639"
            title = "Just Because!"

            // Pretty decent drama
            AEI(5.0, Emotion.CU)
            FeatureMusic("M-VGMDB-AL-70716-1")
        }

        Contains("M-VGMDB-AL-70716-1")
    }
}