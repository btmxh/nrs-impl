package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.SthKara() {
    Entry {
        id = "F-VGMDB-6626"
        title = "Iroduku Sekai no Ashita kara"

        Entry {
            id = "A-MAL-37497"
            title = "Iroduku Sekai no Ashita kara"
            bestGirl = "Tsukishiro Hitomi"

            Boredom(Boredom.Completed)
            // ending was good
            AEI(2.5, Emotion.CU to 0.9, Emotion.AP to 0.1)

            FeatureMusic("M-VGMDB-AL-80341-1")
        }

        Contains("M-VGMDB-AL-80341-1")
    }

    Entry {
        id = "M-VGMDB-AL-80341"
        title = "Seventeen" // feels

        SubIDEntry("1", "17 Sai") {
            Music(5.0)
        }
    }
}