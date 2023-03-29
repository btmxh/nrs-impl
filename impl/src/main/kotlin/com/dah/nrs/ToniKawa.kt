package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.ToniKawa() {

    Entry {
        id = "F-VGMDB-10135"
        title = "Tonikaku Kawaii"

        Entry {
            id = "A-MAL-41389"
            title = "Tonikaku Kawaii" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 41389 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 43034 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 116267 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 41389 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Tsukasa Yuzaki" // generated(generate_best_girls.dart v0.1.0)

            Visual(VisualKind.Animated, 0.4, 0.6)
            AnimeConsumedProgress(EntryStatus.Dropped, 0.8, 1)
            Dropped()
            KilledBy("F-VGMDB-2588", 0.2, 0.5)
            FeatureMusic("M-VGMDB-AL-104618")
        }

        Entry {
            id = "M-VGMDB-AL-104618"
            title = "Koi no Uta (feat. Tsukasa Yuzaki) / Yunomi" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.6)
            SubIDEntry("1") {
                MusicConsumedProgress("3:29") // generated(fill_music_metadata.dart v0.1.1)
                title = "Koi no Uta (feat. Yuzaki Tsukasa)" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.4)
            }
        }
    }
}
