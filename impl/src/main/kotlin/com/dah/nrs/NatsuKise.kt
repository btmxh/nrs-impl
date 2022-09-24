package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.minutes

fun DSLScope.NatsuKise() {
    Entry {
        id = "F-VGMDB-5817"
        title = "natsuiro kiseki"
        
        Entry {
            id = "A-MAL-12119"
            
            bestGirl = "Saki Mizukoshi"

            // something something rst something cp-based
            NEI(0.5, Emotion.CU to 0.5, Emotion.CP to 0.5)
            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 12)
            Visual(VisualKind.Animated, 0.5, 0.4)
        }

        Entry {
            id = "A-MAL-15431"

            bestGirl = "Saki Mizukoshi"

            AnimeConsumedProgress(EntryStatus.Completed, 0.8, 1, 7.minutes)
            Visual(VisualKind.Animated, 0.5, 0.4)
        }
    }
}