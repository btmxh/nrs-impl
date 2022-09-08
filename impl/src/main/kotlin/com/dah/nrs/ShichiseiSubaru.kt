package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.ShichiseiSubaru() {
    Entry {
        id = "F-VGMDB-6418"
        title = "Shichisei no Subaru"

        Entry {
            id = "A-MAL-36316"
            title = "Shichisei no Subaru"
            bestGirl = "Kuga Asahi"

            Progress(Boredom.Completed)

            // The drama in this anime is executed fairly well.
            // (It only exists in the first episodes tho)
            AEI(1.0, Emotion.CU)

            Visual(VisualKind.Animated, 0.6, 0.2)

            FeatureMusic("M-VGMDB-AL-78478-1")
        }

        Contains("M-VGMDB-AL-78478-1")
    }
}