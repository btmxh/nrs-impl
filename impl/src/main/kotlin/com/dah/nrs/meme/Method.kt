package com.dah.nrs.meme

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.Method() {
    Entry {
        id = "O-1"
        title = "VMO 2022 Era"
        bestGirl = "method"

        // From mid Jan 2022 onwards
        Meme(0.8, numDays("2022-01-15")) {
            contributors["O-1"] = 1.0
            contributors["M-VGMDB-AL-81504-1"] = 0.3
        }
    }
}