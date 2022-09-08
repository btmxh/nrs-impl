package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.Tanmoshi() {
    Entry {
        id = "F-VGMDB-9850"
        title = "Tantei wa Mou, Shindeiru."

        Entry {
            id = "A-MAL-46471"
            title = "Tantei wa Mou, Shindeiru." // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 46471 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44022 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 128712 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 46471 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Natsunagi Nagisa"

            // siesta arc is shit
            // cope
            Visual(VisualKind.Animated, 0.5, 0.3)
            Progress(Boredom.Completed)
            FeatureMusic("M-VGMDB-AL-113531")
            FeatureMusic("M-VGMDB-AL-113660")
            KilledBy("A-MAL-41530", 0.2, 0.5)
        }

        // Kano's friend's album lol
        Entry {
            id = "M-VGMDB-AL-113531"

            Visual(VisualKind.AlbumArt, 0.5, 0.3)
            SubIDEntry("1") {
                Music(4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-113660"

            Visual(VisualKind.AlbumArt, 0.5, 0.3)
            SubIDEntry("1") {
                Music(4.0)
            }
        }
    }
}
