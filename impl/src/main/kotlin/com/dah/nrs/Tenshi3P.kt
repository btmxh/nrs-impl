package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.Tenshi3P() {
    Entry {
        id = "F-VGMDB-5549"
        title = "Tenshi no 3P!"

        Entry {
            id = "A-MAL-34177"
            title = "Tenshi no 3P!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 34177 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 12624 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 97683 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 34177 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Toriumi Sakura"
            // OP is catJAM osugame
            // the map was made by the gigachad mapper: https://www.youtube.com/watch?v=QJJYpsA5tv8
            // fuck the ED i hate that map

            Visual(VisualKind.Animated, 0.5, 0.3)
            Progress(Boredom.Completed)
            FeatureMusic("M-VGMDB-AL-68189-1")
            FeatureMusic("M-VGMDB-AL-69018-1")
        }

        Entry {
            id = "M-VGMDB-AL-68189"

            Visual(VisualKind.AlbumArt, 0.5, 0.3)
            SubIDEntry("1") {
                Music(6.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-69018"
            Visual(VisualKind.AlbumArt, 0.5, 0.3)
            SubIDEntry("1") {
                Music(3.0)
            }
        }
    }
}
