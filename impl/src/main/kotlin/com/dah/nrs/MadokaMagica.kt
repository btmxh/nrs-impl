package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.MadokaMagica() {
    // also include MagiReco

    Entry {
        id = "F-VGMDB-1945"
        title = "Mahou Shoujo Madoka☆Magica"

        Contains("M-VGMDB-AL-23391-1")

        Entry {
            id = "M-VGMDB-AL-30302"
            title = "Puella Magi Madoka Magica Special CD 1 Drama CD 'Memories of you'" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.35, 0.6)
            SubIDEntry("2") {
                MusicConsumedProgress("4:27") // generated(fill_music_metadata.dart v0.1.1)
                title = "Mata Ashita" // generated(fill_music_metadata.dart v0.1.1)
                Music(2.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-24725"
            title = "Puella Magi Madoka Magica Special CD 2 Original Soundtrack I" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.35, 0.6)
            SubIDEntry("4") {
                MusicConsumedProgress("1:56") // generated(fill_music_metadata.dart v0.1.1)
                title = "Believing in Justice" // generated(fill_music_metadata.dart v0.1.1)
                Music(2.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-39170"
            title = "Puella Magi Madoka Magica Special CD 5 Drama CD 'Farewell Story'" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.35, 0.6)
            SubIDEntry("2") {
                MusicConsumedProgress("2:50") // generated(fill_music_metadata.dart v0.1.1)
                title = "and I'm home" // generated(fill_music_metadata.dart v0.1.1)
                Music(1.5)
            }
        }

        Contains("M-VGMDB-AL-41292-1")
        Contains("M-VGMDB-AL-69147-11")

        Entry {
            id = "M-VGMDB-AL-113295"
            title = "TV Anime \"Magia Record: Mahou Shoujo Madoka☆Magica Gaiden 2nd SEASON -Kakusei Zenya-\" Theme Song Collection" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.5, 0.4)

            SubIDEntry("1") {
                MusicConsumedProgress("4:14") // generated(fill_music_metadata.dart v0.1.1)
                title = "ケアレス" // generated(fill_music_metadata.dart v0.1.1)
                Music(6.0)
            }
        }

        Contains("M-VGMDB-AL-89431-1")

        Entry {
            id = "M-VGMDB-AL-95029"
            title = "Gomakashi / TrySail" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.5, 0.4)

            SubIDEntry("1") {
                MusicConsumedProgress("4:11") // generated(fill_music_metadata.dart v0.1.1)
                title = "Gomakashi" // generated(fill_music_metadata.dart v0.1.1)
                Music(6.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-91985"
            title = "Utsuroi / TrySail" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.45, 0.4)

            SubIDEntry("1") {
                MusicConsumedProgress("3:49") // generated(fill_music_metadata.dart v0.1.1)
                title = "Utsuroi" // generated(fill_music_metadata.dart v0.1.1)
                // the game
                // browiec's Wisdom
                // Misunderstanding
                // osu! 9.97⭐UTSUROI +HDDTHR 1108pp | WhiteCat
                OsuSong(personal = 6.5, community = 1.0)

                Music(5.0)
            }
        }

        Meme(0.6, numDays("2019-11-01", "2020-02-15")) {
            contributors["A-MAL-9756"] = 0.8
            contributors["A-MAL-11981"] = 0.2
        }

        Entry {
            id = "A-MAL-9756"
            title = "Mahou Shoujo Madoka★Magica" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 9756 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 5853 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 9756 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 9756 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Kaname Madoka"

            // 32k got killed over and over, and her lover has to
            // time-travel everytime it happens
            PADS(1, Emotion.CU)

            // Kyoko's backstory
            AEI(9.0, Emotion.CU)

            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.35, 0.6)

            FeatureMusic("M-VGMDB-AL-23391-1")
            FeatureMusic("M-VGMDB-AL-30302-2")
            FeatureMusic("M-VGMDB-AL-24725-4")
            FeatureMusic("M-VGMDB-AL-39170-2")
        }

        Entry {
            id = "A-MAL-11981"
            title = "Mahou Shoujo Madoka★Magica Movie 3: Hangyaku no Monogatari" // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 6638 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 11981 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 11981 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Kaname Madoka"
            // I can't understand this movie lol

            AnimeProgressOld(Boredom.Completed, 1)
            Visual(VisualKind.Animated, 0.35, 0.6)

            FeatureMusic("M-VGMDB-AL-41292-1")
        }

        Waifu("Tamaki Iroha", "2020-02-14" to "2020-08-14") {
            contributors["A-MAL-38256"] = 0.5
            contributors["G-VGMDB-5237"] = 0.5
        }

        Meme(0.75, numDays("2020-02-15", "2020-08-15")) {
            contributors["A-MAL-38256"] = 0.4
            contributors["G-VGMDB-5237"] = 0.5
            contributors["A-MAL-9756"] = 0.08
            contributors["A-MAL-11981"] = 0.02
        }

        Meme(0.3, 2) {
            contributors["A-MAL-41530"] = 1.0
        }

        // magireco is kinda comfy
        NEI(7.5, Emotion.MP) {
            contributors["A-MAL-38256"] = 0.4
            contributors["G-VGMDB-5237"] = 0.4
            contributors["A-MAL-41530"] = 0.2
        }

        Entry {
            id = "G-VGMDB-5237"
            title = "Magia Record: Mahou Shoujo Madoka★Magica Gaiden"

            bestGirl = "Tamaki Iroha"
            // Madokami's MGS
            // It's revealed that in 99% other universes,
            // Tamaki Ui and her friends are dead, leaving
            // Tamaki Iroha alone and (probably) depressed.
            // This made me cry
            Cry(Emotion.CU)
            PADS(999, Emotion.CU)

            // Sana's backstory
            // Basically it's very tragic.
            Cry(Emotion.CU)
            Visual(VisualKind.Animated, 0.5, 0.4)

            // Gate-opened gacha games (there is only re step in NRS tho)
            GateOpen("GF-VGMDB-7059")

            FeatureMusic("M-VGMDB-AL-69147-11")
            FeatureMusic("M-VGMDB-AL-89431-1")
            FeatureMusic("M-VGMDB-AL-91985-1")
        }

        Entry {
            id = "A-MAL-38256"
            title = "Magia Record: Mahou Shoujo Madoka☆Magica Gaiden (TV)" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38256 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42016 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 104051 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38256 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Tamaki Iroha"
            seasonal = true
            // MagiReco-era is one of the most important eras in autism history
            // This is the anime that brought it to life

            // Emotional impacts are all in the game
            // (Madokami's MGS, Sana's backstory)
            AnimeProgressOld(Boredom.Completed, 13)
            Visual(VisualKind.Animated, 0.5, 0.4)

            // Gate-opened gacha games
            GateOpen("G-VGMDB-5237")
            GateOpen("GF-VGMDB-7059")

            FeatureMusic("M-VGMDB-AL-95029-1")
        }

        Entry {
            id = "A-MAL-41530"
            title = "Magia Record: Mahou Shoujo Madoka☆Magica Gaiden 2nd Season - Kakusei Zenya" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 41530 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 43090 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 117002 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 41530 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Tamaki Iroha"
            seasonal = true

            AnimeProgressOld(Boredom.Completed, 8)
            Visual(VisualKind.Animated, 0.5, 0.4)

            // the animation tho
            Impact {
                description = "Animation"
                score = vector {
                    set(Art.Visual, 0.5)
                    set(Emotion.AP, 0.4)
                }
            }

            // OP
            FeatureMusic("M-VGMDB-AL-113295-1")
        }

        Entry {
            id = "A-MAL-49291"
            title = "Magia Record: Mahou Shoujo Madoka☆Magica Gaiden (TV) Final Season - Asaki Yume no Akatsuki" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 49291 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44813 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 136080 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 49291 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Tamaki Iroha"
            seasonal = true

            AnimeProgressOld(Boredom.Completed, 4)
            Visual(VisualKind.Animated, 0.5, 0.4)

            // :troll-despair:
            AEI(5.0, Emotion.CU to 0.9, Emotion.MP to 0.1)

            // OP
            FeatureMusic("M-VGMDB-AL-113295-1")
            // first madomagi thing to be cucked by rst
            KilledBy("F-VGMDB-7059", potential = 0.75, effect = 0.75)
        }
    }

    Entry {
        id = "M-5"
        title = "Magibeat"
        ValidatorSuppress("dah-entry-no-consumed")

        Contains(0.5) {
            Entry {
                id = "M-7"
                title = "Colorful - Magibeat Remix"

                // Length source: https://www.nicovideo.jp/watch/sm22151925
                Music(3.5)
                MusicConsumedProgress("4:35")
            }
        }
    }
}
