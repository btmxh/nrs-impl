package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

// when you are having a bad day, remember that rikekoi exists
fun DSLScope.RikeKoi() {
    Entry {
        id = "F-VGMDB-9552"
        title = "Rikei ga Koi ni Ochita no de Shoumei Shite Mita."

        // cucked by magireco lmfao
        // i'm impressed that they survived tho
        Entry {
            id = "A-MAL-38992"
            title = "Rikei ga Koi ni Ochita no de Shoumei shitemita." // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38992 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42297 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 107067 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38992 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Kotonoha Kanade" // generated(generate_best_girls.dart v0.1.0)

            AnimeConsumedProgress(EntryStatus.Completed, 0.75, 12)
            Visual(VisualKind.Animated, 0.25, 0.5)
            KilledBy("F-VGMDB-1945", potential = 0.5, effect = 0.75)
        }

        // then got fucked by rst's idol dystopia lol
        // rip
        Entry {
            id = "A-MAL-43470"
            title = "Rikei ga Koi ni Ochita no de Shoumei shitemita. Heart" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 43470 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 43681 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 125124 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 43470 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Kotonoha Kanade" // generated(generate_best_girls.dart v0.1.0)

            AnimeConsumedProgress(EntryStatus.Dropped, 0.5, 2)
            Dropped()
            Visual(VisualKind.Animated, 0.25, 0.5)
            KilledBy("F-VGMDB-7059", potential = 0.2, effect = 0.75)
        }
    }
}
