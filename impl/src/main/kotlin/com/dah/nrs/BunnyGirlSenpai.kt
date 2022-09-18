package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.BunnyGirlSenpai() {
    Entry {
        id = "F-VGMDB-6852"
        title = "Seishun Buta Yarou Series"

        Entry {
            id = "A-MAL-37450"
            title = "Seishun Buta Yarou wa Bunny Girl Senpai no Yume wo Minai" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 37450 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 41056 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 101291 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 37450 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Makinohara Shouko"

            AnimeProgressOld(Boredom.Dropped, 9)
            // plot kinda ok
            NEI(0.5, Emotion.AP)
            Visual(VisualKind.Animated, 0.6, 0.15)
            FeatureMusic("M-VGMDB-AL-80253-1")
        }

        Contains("M-VGMDB-AL-80253-1")
    }

    Entry {
        id = "M-VGMDB-AL-80253"
        title = "Kimi no Sei / the peggies" // generated(fill_music_metadata.dart v0.1.1)

        // tf is this lol
        Visual(VisualKind.AlbumArt, 0.1, 0.6)

        SubIDEntry("1") {
            MusicConsumedProgress("4:24") // generated(fill_music_metadata.dart v0.1.1)
            title = "Kimi no Sei" // generated(fill_music_metadata.dart v0.1.1)
            Music(1.0)
        }
    }
}
