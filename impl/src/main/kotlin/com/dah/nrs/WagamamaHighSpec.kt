package com.dah.nrs

import com.dah.nrs.core.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours

fun DSLScope.WagamamaHighSpec() {
    Entry {
        id = "F-20221122T215201"
        title = "Wagamama High Spec"

        Entry {
            id = "V-VNDB-17823"
            title = "Wagamama High Spec"

            // save this for OC
            // bestGirl = "Watanuki Karen"
            bestGirl = "Rokuonji Kaoruko"

            ConsumedProgress(EntryStatus.Watching, 0.9, 3.hours)
            Visual(VisualKind.VisualNovel, 0.7, 0.3)
            NEI(0.3, Emotion.MP)
            NEI(0.4, Emotion.AP)
        }

        Entry {
            id = "M-VGMDB-AL-67632"

            Visual(VisualKind.AlbumArt, 0.6, 0.4)

            SubIDEntry("1") {
                Music(0.65)
            }
        }
    }
}