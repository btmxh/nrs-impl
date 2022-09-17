package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.*

fun DSLScope.Charlotte() {
    Entry {
        id = "F-VGMDB-3554"
        title = "Charlotte"

        Entry {
            id = "A-MAL-28999"
            title = "Charlotte" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 28999 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 10103 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20997 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 28999 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Nao Tomori" // ai mapper lmao

            Visual(VisualKind.Animated, 0.5, 0.1)

            PADS(3, Emotion.CU)
            AnimeProgressOld(Boredom.Completed, 13)
        }
    }
}
