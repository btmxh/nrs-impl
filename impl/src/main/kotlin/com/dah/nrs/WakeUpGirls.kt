package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.WakeUpGirls() {
    // A wise man once said:
    // Every EI (emotional impact) post rst arc 1,
    // is a direct consequence of the era

    Entry {
        id = "F-VGMDB-2645"
        title = "Wake Up, Girls!"

        // this is what happen when you combine
        // atmospheric farming with idolshit
        // also watch rst
        AEI(0.0, Emotion.CU to 0.5, Emotion.CP to 0.5) {
            contributors["A-MAL-21189"] = 0.75
            contributors["A-MAL-19023"] = 0.2
            contributors["A-MAL-38009"] = 0.04
            contributors["GF-VGMDB-7059"] = 0.01
        }

        Entry {
            id = "M-VGMDB-AR-15137"
            title = "Wake Up, Girls!" // generated(fill_music_metadata.dart v0.1.1)

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-42945")
                Contains("M-VGMDB-AL-46042")
                Contains("M-VGMDB-AL-68276", 0.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-46042"
            title = "Tachiagare! / Wake Up, Girls!" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.6)

            SubIDEntry("1") {
                title = "Tachiagare!" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:54") // generated(fill_music_metadata.dart v0.1.1)
                Music(6.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-42945"
            title = "7 Girls War / Wake Up, Girls!" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.6)

            SubIDEntry("1") {
                title = "7 Girls War" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("5:07") // generated(fill_music_metadata.dart v0.1.1)
                Music(3.5)
            }
        }

        Entry {
            id = "A-MAL-21189"
            title = "Wake Up, Girls! Shichinin no Idol" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 21189 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 8200 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20512 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 21189 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Shimada Mayu"

            AnimeProgressOld(Boredom.Completed, 1)
            // partially benefitted from rst
            KilledBy("F-VGMDB-7059", potential = 0.25, effect = 0.5)

            FeatureMusic("M-VGMDB-AL-46042-1")
            Visual(VisualKind.Animated, 0.4, 0.6)
        }

        Entry {
            id = "A-MAL-19023"
            title = "Wake Up, Girls!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 19023 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 7774 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 19023 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 19023 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Shimada Mayu"

            AnimeProgressOld(Boredom.Completed, 12)
            KilledBy("F-VGMDB-7059", potential = 0.1, effect = 0.5)
            FeatureMusic("M-VGMDB-AL-42945-1")
            Visual(VisualKind.Animated, 0.4, 0.6)
        }

        Entry {
            id = "A-MAL-28841"
            title = "Wake Up, Girls! Seishun no Kage" // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 10068 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20989 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 28841 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Shimada Mayu"

            AnimeProgressOld(Boredom.Completed, 1)
            KilledBy("F-VGMDB-7059", potential = 0.1, effect = 0.5)
            Visual(VisualKind.Animated, 0.4, 0.6)
        }

        Entry {
            id = "A-MAL-30419"
            title = "Wake Up, Girls! Beyond the Bottom" // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 10845 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21107 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 30419 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Shimada Mayu"

            AnimeProgressOld(Boredom.Completed, 1)
            KilledBy("F-VGMDB-7059", potential = 0.1, effect = 0.5)
            Visual(VisualKind.Animated, 0.4, 0.6)
        }

        Entry {
            id = "A-MAL-34522"
            title = "Wake Up, Girls! Shin Shou" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 34522 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13707 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 97933 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 34522 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Shimada Mayu"

            AnimeProgressOld(Boredom.Completed, 12)
            KilledBy("F-VGMDB-7059", potential = 0.1, effect = 0.5)
            Visual(VisualKind.Animated, 0.3, 0.6)
        }
    }

    Entry {
        id = "M-VGMDB-AL-68276"
        title = "One In A Billion / Wake Up, May'n! [Limited Edition]" // generated(fill_music_metadata.dart v0.1.1)

        // dream luck be like lmfao

        Visual(VisualKind.AlbumArt, 0.1, 0.2)

        SubIDEntry("1") {
            title = "One In A Billion" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("4:17") // generated(fill_music_metadata.dart v0.1.1)
            OsuSong(personal = 5.0, community = 1.0)
            Music(6.0)
        }
    }
}
