package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.CellAtWork() {
    Entry {
        id = "F-VGMDB-8677"
        title = "Hataraku Saibou"

        Entry {
            id = "A-MAL-37141"
            title = "Hataraku Saibou" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 37141 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 14212 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 100977 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 37141 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Kesshouban" // i mean it's because the character design suck ass

            Progress(Boredom.Dropped)
            ValidatorSuppress("dah-uncompleted-no-progress")
            Visual(VisualKind.Animated, 0.4, 0.1)
            FeatureMusic("M-VGMDB-AL-77471-1")
        }

        Contains("M-VGMDB-AL-77471-1")
    }
}
