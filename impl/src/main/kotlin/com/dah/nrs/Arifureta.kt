package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.Arifureta() {
    Entry {
        id = "F-VGMDB-6083"
        title = "Arifureta Shokugyou de Sekaisaikyou"

        Entry {
            id = "A-MAL-36882"
            title = "Arifureta Shokugyou de Sekai Saikyou" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 36882 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 14043 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 100668 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 36882 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Yue"

            Progress(Boredom.Completed)

            // MC got dumped by his friends made me kinda angry
            NEI(2.5, Emotion.AU)
            Visual(VisualKind.Animated, 0.5, 0.1)

            FeatureMusic("M-VGMDB-AL-86592-1")
        }

        Contains("M-VGMDB-AL-86592-1")
    }

    Entry {
        id = "M-VGMDB-AL-86592"

        Visual(VisualKind.AlbumArt, 0.05, 0.5)
        SubIDEntry("1") {
            Music(1.0)
            OsuSong(personal = 1.0, community = 0.5)
        }
    }
}
