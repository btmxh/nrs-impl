package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.*

fun DSLScope.TariTari() {
    Entry {
        id = "F-VGMDB-4296"
        title = "TARI TARI"

        Entry {
            id = "A-MAL-13333"
            title = "Tari Tari"

            bestGirl = "Miyamoto Konatsu"

            // pa works is the best atmospheric farmer
            Cry(Emotion.CU)
            Boredom(Boredom.Completed)

            KilledBy("F-VGMDB-7059")
        }
    }
}