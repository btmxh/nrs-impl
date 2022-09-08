package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.DrStone() {
    Entry {
        id = "F-VGMDB-9159"
        title = "Dr. Stone"
        // bac si da

        Entry {
            id = "A-MAL-38691"
            title = "Dr. Stone" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38691 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42080 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 105333 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38691 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Yuzuriha Ogawa"
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.3, 0.75)
            // "plot is good"
            AEI(2.5, Emotion.AP)
            FeatureMusic("M-VGMDB-AL-87927-1")
        }

        Contains("M-VGMDB-AL-87927-1")

        Entry {
            id = "A-MAL-40852"
            title = "Dr. Stone: Stone Wars" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 40852 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42867 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 113936 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 40852 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Yuzuriha Ogawa"
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.3, 0.75)
            AEI(1.0, Emotion.AP)
        }

        Entry {
            id = "A-MAL-50612"
            title = "Dr. Stone: Ryuusui" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 50612 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 45615 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 142876 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 50612 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Yuzuriha Ogawa"
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.3, 0.75)
            NEI(6.0, Emotion.AP)
        }
    }

    Entry {
        id = "M-VGMDB-AL-87927"

        Visual(VisualKind.AlbumArt, 0.15, 0.2)

        SubIDEntry("1") {
            Music(2.5)
            OsuSong(personal = 1.0)
        }
    }
}
