package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.Bokuben() {
    Entry {
        id = "F-VGMDB-7481"
        title = "Bokutachi wa Benkyou ga Dekinai"

        Entry {
            id = "A-MAL-38186"    // generated
            idMAL = 38186
            idAniList = 103900
            idKitsu = 41956
            idAniDB = 14289
            title = "Bokutachi wa Benkyou ga Dekinai"

            bestGirl = "Mafuyu Kirisu"
            // le bang bang zenryoku i love you girl lol
            // "this is a little bit better than gotoubun"
            AEI(7.5, Emotion.AP)
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.7)
            FeatureMusic("M-VGMDB-AL-85537-1")
        }

        Entry {
            id = "A-MAL-40004"    // generated
            idMAL = 40004
            idAniList = 110229
            idKitsu = 42414
            idAniDB = 14968
            title = "Bokutachi wa Benkyou ga Dekinai!"

            bestGirl = "Furuhashi Fumino"
            // va jokes aside, fumino is best girl

            // "this is a little bit better than gotoubun" lmfao copy paste error
            // is what i'm thinking but fall 2019 is just another trash season lol
            AEI(7.0, Emotion.AP)
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.7)
            FeatureMusic("M-VGMDB-AL-88884-1")
        }

        Entry {
            id = "M-VGMDB-AL-85537"
            title = "Seishun Seminar/Never Give It Up!!"

            Visual(VisualKind.AlbumArt, 0.4, 0.7)

            SubIDEntry("1") {
                Music(2.5)
                OsuSong(personal = 2.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-88884"
            title = "Can now, Can now"

            Visual(VisualKind.AlbumArt, 0.4, 0.7)

            SubIDEntry("1") {
                Music(2.5)
                OsuSong(personal = 1.0)
            }
        }
    }
}
