package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.SthKara() {
    Entry {
        id = "F-VGMDB-6626"
        title = "Iroduku Sekai no Ashita kara"

        Entry {
            id = "A-MAL-37497"
            title = "Irozuku Sekai no Ashita kara" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 37497 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 41101 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 101316 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 37497 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Tsukishiro Hitomi"

            AnimeProgressOld(Boredom.Completed, 13) // generated(fill_anime_metadata.dart v0.1.1)
            // ending was good
            AEI(2.5, Emotion.CU to 0.9, Emotion.AP to 0.1)

            Visual(VisualKind.Animated, 0.6, 0.5)
            FeatureMusic("M-VGMDB-AL-80341-1")
        }

        Contains("M-VGMDB-AL-80341-1")
    }

    Entry {
        id = "M-VGMDB-AL-80341"
        title = "17-sai / Haruka to Miyuki" // generated(fill_music_metadata.dart v0.1.1)

        Visual(VisualKind.AlbumArt, 0.2, 0.3)

        SubIDEntry("1") {
            title = "17-sai" // generated(fill_music_metadata.dart v0.1.1)
            Music(5.0)
        }
    }
}
