package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.Boredom
import com.dah.nrs.exts.Completed
import com.dah.nrs.exts.Emotion
import com.dah.nrs.exts.PADS

fun DSLScope.Charlotte() {
    Entry {
        id = "F-VGMDB-3554"
        title = "Charlotte"

        Entry {
            id = "A-MAL-28999"
            title = "Charlotte"
            bestGirl = "Nao Tomori" // ai mapper lmao

            PADS(3, Emotion.CU)
            Boredom(Boredom.Completed)
        }
    }
}