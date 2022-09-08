package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.*

fun DSLScope.YamadaKun() {
    Entry {
        id = "F-VGMDB-3370"
        title = "Yamada-kun to 7-nin no Majo"

        Entry {
            id = "A-MAL-28677"
            title = "Yamada-kun to 7-nin no Majo (TV)" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 28677 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 10042 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20966 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 28677 // generated(fill_anime_metadata.dart v0.1.1)
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
