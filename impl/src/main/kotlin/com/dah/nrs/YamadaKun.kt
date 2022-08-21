package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.*

fun DSLScope.YamadaKun() {
    Entry {
        id = "F-VGMDB-3370"
        title = "Yamada-kun to 7-nin no Majo"

        Entry {
            id = "A-MAL-28677"    // generated
            idMAL = 28677
            idAniList = 20966
            idAniDB = 10955
            idKitsu = 10042
            title = "Yamada-kun to 7-nin no Majo"
            bestGirl = "Shiraishi Urara"

            FeatureMusic("M-VGMDB-AL-51918-1")
            FeatureMusic("M-VGMDB-AL-52045-1")
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        Contains("M-VGMDB-AL-51918-1")
        Contains("M-VGMDB-AL-52045-1")
    }
}