package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.Boredom
import com.dah.nrs.exts.Completed
import com.dah.nrs.exts.FeatureMusic

fun DSLScope.SwordArtOnline() {
    Entry {
        id = "F-VGMDB-2633"
        title = "Sword Art Online"

        Entry {
            id = "A-MAL-11757"
            title = "Sword Art Online"

            bestGirl = "Yuuki Asuna"
            FeatureMusic("M-VGMDB-AL-33537-1")
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-21881"
            title = "Sword Art Online II"

            bestGirl = "Yuuki Asuna"
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-31765"
            title = "Sword Art Online Movie: Ordinal Scale"

            bestGirl = "Yuuki Asuna"
            Boredom(Boredom.Completed)
        }

        Contains("M-VGMDB-AL-33537-1")
    }
}
