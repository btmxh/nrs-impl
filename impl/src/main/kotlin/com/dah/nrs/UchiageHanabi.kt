package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.*

fun DSLScope.UchiageHanabi() {
    Entry {
        id = "F-VGMDB-5919"
        title = "Uchiage Hanabi, Shita kara Miru ka? Yoko kara Miru ka?"

        Entry {
            id = "A-MAL-34498"
            title = "Uchiage Hanabi, Shita kara Miru ka? Yoko kara Miru ka?" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 34498 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 12794 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 97908 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 34498 // generated(fill_anime_metadata.dart v0.1.1)

            // SLN rng
            AEI(1.0, Emotion.CU)

            bestGirl = "Oikawa Nazuna"

            AnimeProgressOld(Boredom.Completed, 1) // generated(fill_anime_metadata.dart v0.1.1)

            FeatureMusic("M-VGMDB-AL-69257-1")
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        Contains("M-VGMDB-AL-69257-1")
    }
}
