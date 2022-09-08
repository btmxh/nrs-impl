package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.ZombielandSaga() {
    Entry {
        id = "F-VGMDB-9825"
        title = "ZOMBIE LAND SAGA"
        Entry {
            id = "A-MAL-37976"
            title = "Zombieland Saga" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 37976 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 41459 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 103871 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 37976 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Minamoto Sakura"

            // kinda funny
            AEI(5.0, Emotion.AP)
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        Entry {
            id = "A-MAL-40174"
            title = "Zombieland Saga: Revenge" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 40174 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42467 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 110733 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 40174 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Minamoto Sakura"

            // the zombieland saga incident
            Progress(Boredom.Dropped, 7)
            Visual(VisualKind.Animated, 0.4, 0.5)
            KilledBy("V-VNDB-12849", 0.3, 0.2)
            FeatureMusic("M-VGMDB-AL-109367")
        }

        Entry {
            id = "M-VGMDB-AL-109367"
            title = "Taiga yo Tomo ni Naite Kure/Nope!!!!!" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.5)
            SubIDEntry("1") {
                title = "Taiga yo Tomo ni Naite Kure" // generated(fill_music_metadata.dart v0.1.1)
                Music(5.5)
            }
        }
    }
}
