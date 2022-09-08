package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.*

fun DSLScope.Charlotte() {
    Entry {
        id = "F-VGMDB-3554"
        title = "Charlotte"

        Entry {
            id = "A-MAL-28999"
            title = "Charlotte"
            bestGirl = "Nao Tomori" // ai mapper lmao

            Visual(VisualKind.Animated, 0.5, 0.1)

            PADS(3, Emotion.CU)
            Progress(Boredom.Completed)
        }
    }
}