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
            title = "Tari Tari" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 13333 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 6941 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 13333 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 13333 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Miyamoto Konatsu"

            // pa works is the best atmospheric farmer
            Cry(Emotion.CU)
            AnimeProgressOld(Boredom.Completed, 13)

            Visual(VisualKind.Animated, 0.4, 0.3)
            KilledBy("F-VGMDB-7059", potential = 0.6, effect = 0.5)
        }
    }
}
