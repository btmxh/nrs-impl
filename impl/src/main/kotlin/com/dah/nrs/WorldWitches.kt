package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.WorldWitches() {
    Entry {
        id = "F-VGMDB-4639"
        title = "World Witches Series"

        Entry {
            id = "A-MAL-3667"
            title = "Strike Witches" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 3667 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 3179 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 3667 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 3667 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Eila Ilmatar Juutilainen" // generated(generate_best_girls.dart v0.1.0)
            // "The fifteen-year-old top ace of the Suomus Air Force 24th Unit ..."
            // haha 15 funny amirite

            AnimeProgressOld(Boredom.Completed, 12)
            KilledBy("F-VGMDB-694", 0.25, 0.5)
            Visual(VisualKind.Animated, 0.2, 0.75)
        }

        Entry {
            id = "A-MAL-38006"
            title = "Renmei Kuugun Koukuu Mahou Ongakutai Luminous Witches" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38006 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44227 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 103118 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38006 // generated(fill_anime_metadata.dart v0.1.1)

            // mc is cute
            // ngl this is a treat for our eyes
            Visual(VisualKind.Animated, 0.8, 0.05)
//        bestGirl = "Robertson Virginia"
            bestGirl = "Inori Shibuya" // generated(generate_best_girls.dart v0.1.0)
            // inori is cuter fuck u

            // the ultimate L moment
            // when the happy-go-lucky idol moe girl anime has better
            // atmospheric farming than the supposed-to-be-realistic-
            // and-stuff one (meme post)
            // lolololololol

            // the "selection project" of summer 2022
            AEI(0.8, Emotion.CU to 0.9, Emotion.CP to 0.1)

            AnimeProgressOld(Boredom.Watching, 11)
            KilledBy("F-VGMDB-4499", potential = 0.75, effect = 0.1)
            KilledBy("M-VGMDB-AL-76155-2", potential = 0.75, effect = 0.75)
            FeatureMusic("M-VGMDB-AL-120491")
            FeatureMusic("M-VGMDB-AL-120492")
        }

        Entry {
            id = "M-VGMDB-AL-116433"
            title = "My Shining Light / Luminous Witches" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.6, 0.2)

            SubIDEntry("1") {
                MusicConsumedProgress("4:40") // generated(fill_music_metadata.dart v0.1.1)
                title = "My Shining Light" // generated(fill_music_metadata.dart v0.1.1)
                // the "azure reunion" of asuiro clear sky
                Music(0.7)
            }

            SubIDEntry("2") {
                MusicConsumedProgress("4:18") // generated(fill_music_metadata.dart v0.1.1)
                title = "Luminossense" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.3)
            }
        }

        Entry {
            id = "M-VGMDB-AL-120491"
            title = "WONDERFUL WORLD / Luminous Witches" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.75, 0.15)

            SubIDEntry("1") {
                MusicConsumedProgress("3:58") // generated(fill_music_metadata.dart v0.1.1)
                title = "WONDERFUL WORLD" // generated(fill_music_metadata.dart v0.1.1)

                Music(0.4)
            }
        }

        Entry {
            id = "M-VGMDB-AL-120492"
            title = "Watashi to Minna no Uta / Luminous Witches" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.7, 0.15)

            SubIDEntry("1") {
                MusicConsumedProgress("4:24") // generated(fill_music_metadata.dart v0.1.1)
                title = "Watashi to Minna no Uta" // generated(fill_music_metadata.dart v0.1.1)

                Music(0.4)
            }
        }
    }
}
