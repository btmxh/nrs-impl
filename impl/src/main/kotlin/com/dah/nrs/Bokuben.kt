package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.Bokuben() {
    Entry {
        id = "F-VGMDB-7481"
        title = "Bokutachi wa Benkyou ga Dekinai"

        Entry {
            id = "A-MAL-38186"
            title = "Bokutachi wa Benkyou ga Dekinai" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38186 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 41956 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 103900 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38186 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Mafuyu Kirisu" // generated(generate_best_girls.dart v0.1.0)
            // le bang bang zenryoku i love you girl lol
            // "this is a little bit better than gotoubun"
            AEI(0.75, Emotion.AP)
            AnimeProgressOld(Boredom.Completed, 13)
            Visual(VisualKind.Animated, 0.4, 0.7)
            FeatureMusic("M-VGMDB-AL-85537-1")
        }

        Entry {
            id = "A-MAL-40004"
            title = "Bokutachi wa Benkyou ga Dekinai!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 40004 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42414 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 110229 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 40004 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Fumino Furuhashi" // generated(generate_best_girls.dart v0.1.0)
            // va jokes aside, fumino is best girl

            // "this is a little bit better than gotoubun" lmfao copy paste error
            // is what i'm thinking but fall 2019 is just another trash season lol
            AEI(0.7, Emotion.AP)
            AnimeProgressOld(Boredom.Completed, 13)
            Visual(VisualKind.Animated, 0.4, 0.7)
            FeatureMusic("M-VGMDB-AL-88884-1")
        }

        Entry {
            id = "M-VGMDB-AL-85537"
            title = "Seishun Seminar/Never Give It Up!! / Study" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.7)

            SubIDEntry("1") {
                MusicConsumedProgress("4:15") // generated(fill_music_metadata.dart v0.1.1)
                title = "Seishun Seminar" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.25)
                OsuSong(personal = 0.2)
            }
        }

        Entry {
            id = "M-VGMDB-AL-88884"
            title = "Can now, Can now / Study" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.7)

            SubIDEntry("1") {
                MusicConsumedProgress("4:02") // generated(fill_music_metadata.dart v0.1.1)
                title = "Can now, Can now" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.25)
                OsuSong(personal = 0.1)
            }
        }
    }
}
