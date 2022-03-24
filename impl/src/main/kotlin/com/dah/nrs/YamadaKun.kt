package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.Boredom
import com.dah.nrs.exts.Completed
import com.dah.nrs.exts.FeatureMusic

fun DSLScope.YamadaKun() {
    Entry {
        id = "F-VGMDB-3370"
        title = "Yamada-kun to 7-nin no Majo"

        Entry {
            id = "A-MAL-28677"
            title = "Yamada-kun to 7-nin no Majo"
            bestGirl = "Shiraishi Urara"

            FeatureMusic("M-VGMDB-AL-51918-1")
            FeatureMusic("M-VGMDB-AL-52045-1")
            Boredom(Boredom.Completed)
        }

        Contains("M-VGMDB-AL-51918-1")
        Contains("M-VGMDB-AL-52045-1")
    }
}