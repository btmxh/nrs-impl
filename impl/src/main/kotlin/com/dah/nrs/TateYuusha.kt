package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.TateYuusha() {
    Entry {
        id = "F-VGMDB-7166"
        title = "Tate no Yuusha no Nariagari"

        Entry {
            id = "A-MAL-35790"
            title = "Tate no Yuusha no Nariagari" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 35790 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13593 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 99263 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 35790 // generated(fill_anime_metadata.dart v0.1.1)
            // This became popular thanks to Reddit.
            // And yes, it's watched in the Reddit-era
            bestGirl = "Raphtalia"

            AnimeProgressOld(Boredom.Completed, 25) // generated(fill_anime_metadata.dart v0.1.1)

            // Anger when MC is treated unfairly (like Oregairu's 8man)
            NEI(5.0, Emotion.AU)
            Meme(0.5, 6)
            Visual(VisualKind.Animated, 0.5, 0.2)
        }

        Entry {
            id = "A-MAL-40356"
            title = "Tate no Yuusha no Nariagari Season 2" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 40356 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42530 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 111321 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 40356 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Raphtalia"

            AnimeProgressOld(Boredom.Dropped, 3)
            KilledBy("F-VGMDB-7059", potential = 0.2, effect = 0.75)
            Visual(VisualKind.Animated, 0.4, 0.2)
        }
    }
}
