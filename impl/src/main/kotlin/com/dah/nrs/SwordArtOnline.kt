package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.*

fun DSLScope.SwordArtOnline() {
    Entry {
        id = "F-VGMDB-2633"
        title = "Sword Art Online"

        Entry {
            id = "A-MAL-11757"
            title = "Sword Art Online" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 11757 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 6589 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 11757 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 11757 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Yuuki Asuna"
            FeatureMusic("M-VGMDB-AL-33537-1")
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.25)
        }

        Entry {
            id = "A-MAL-21881"
            title = "Sword Art Online II" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 21881 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 8174 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20594 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 21881 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Yuuki Asuna"
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.25)
        }

        Entry {
            id = "A-MAL-31765"
            title = "Sword Art Online Movie: Ordinal Scale" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 31765 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 11423 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21403 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 31765 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Yuuki Asuna"
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.6, 0.25)
        }

        Contains("M-VGMDB-AL-33537-1")
    }
}
