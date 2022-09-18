package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.NewGame() {
    Entry {
        id = "F-VGMDB-4168"
        title = "NEW GAME!"

        // humor
        AEI(0.25, Emotion.AP) {
            contributors["A-MAL-31953"] = 0.5
            contributors["A-MAL-34914"] = 0.5
        }

        Meme(0.2, 2) {
            contributors["A-MAL-31953"] = 0.5
            contributors["A-MAL-34914"] = 0.5
        }

        InterestField(true) {
            contributors["A-MAL-31953"] = 0.25
            contributors["A-MAL-34914"] = 0.25
            contributors["A-MAL-13759"] = 0.5
        }

        Entry {
            id = "A-MAL-31953"
            title = "New Game!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 31953 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 11467 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21455 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 31953 // generated(fill_anime_metadata.dart v0.1.1)
            // idk who is better, aoba or yun, so one girl each season
            bestGirl = "Iijima Yun"

            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.7, 0.3)

            FeatureMusic("M-VGMDB-AL-58627-1")
        }

        Entry {
            id = "A-MAL-34914"
            title = "New Game!!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 34914 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13236 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 98292 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 34914 // generated(fill_anime_metadata.dart v0.1.1)
            // idk who is better, aoba or yun, so one girl each season
            bestGirl = "Suzukaze Aoba"

            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.7, 0.3)

            FeatureMusic("M-VGMDB-AL-68225-1")
        }

        Entry {
            id = "M-46"
            title = "fourfolium"
            ValidatorSuppress("dah-entry-no-consumed")

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-58627")
                Contains("M-VGMDB-AL-68225")
            }
        }

        Entry {
            id = "M-VGMDB-AL-58627"
            title = "Now Loading!!!! / fourfolium" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.7, 0.3)
            SubIDEntry("1") {
                MusicConsumedProgress("4:13") // generated(fill_music_metadata.dart v0.1.1)
                title = "Now Loading!!!!" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.4)
                OsuSong(personal = 0.4)
            }
        }

        Entry {
            id = "M-VGMDB-AL-68225"
            title = "STEP by STEP UP↑↑↑↑ / fourfolium" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.7, 0.3)
            SubIDEntry("1") {
                MusicConsumedProgress("4:12") // generated(fill_music_metadata.dart v0.1.1)
                title = "STEP by STEP UP↑↑↑↑" // generated(fill_music_metadata.dart v0.1.1)
                // mankai step by step
                // this song is legendary af
                Music(0.5)
                OsuSong(personal = 0.8)
            }
        }
    }
}
