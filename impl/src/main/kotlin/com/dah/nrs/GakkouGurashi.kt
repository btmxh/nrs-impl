package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.GakkouGurashi() {
    Entry {
        id = "F-VGMDB-4000"
        title = "Gakkougurashi!"

        Entry {
            id = "M-VGMDB-AL-52993"
            title = "Friend Shitai / Gakuen Seikatsubu" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.65, 0.3)

            SubIDEntry("1") {
                MusicConsumedProgress("3:38") // generated(fill_music_metadata.dart v0.1.1)
                title = "Friend Shitai" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.3)
                OsuSong(personal = 0.5)
            }
        }

        Entry {
            id = "M-44"
            title = "Gakuen Seikatsubu"
            ValidatorSuppress("dah-entry-no-consumed")

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-52993")
            }
        }

        Entry {
            id = "M-VGMDB-AL-53719"
            title = "TV Anime \"Gakkou Gurashi!\" Character Song 4 / Miki Naoki (CV. Rie Takahashi) & Kurumi Ebisuzawa (CV. Ari Ozawa)" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.6, 0.25)

            SubIDEntry("1") {
                MusicConsumedProgress("4:26") // generated(fill_music_metadata.dart v0.1.1)
                title = "アンハッピーエンドワールド" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.5)
            }
        }

        Entry {
            id = "A-MAL-24765"
            title = "Gakkougurashi!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 24765 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 8644 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20754 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 24765 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Sakura Megumi"
            // rip Megu-nee
            Cry(Emotion.CU)
            Meme(0.2, 6)
            FeatureMusic("M-VGMDB-AL-52993-1")

            Visual(VisualKind.Animated, 0.6, 0.25)

            AnimeProgressOld(Boredom.Completed, 12)
        }
    }
}
