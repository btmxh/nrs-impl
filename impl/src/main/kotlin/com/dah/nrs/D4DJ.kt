package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.D4DJ() {
    Entry {
        id = "F-VGMDB-8339"
        title = "D4DJ"

        Entry {
            id = "A-MAL-39681"
            title = "D4DJ: First Mix" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 39681 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 43557 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 115069 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 39681 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Aimoto Rinku"

            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.75)
            FeatureMusic("M-VGMDB-AL-107257")
            FeatureMusic("M-VGMDB-AL-108580-2")
            KilledBy("F-VGMDB-2588", potential = 0.5, effect = 0.2)
        }

        Entry {
            id = "M-66"
            title = "Happy Around!"

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-107257")
                Contains("M-VGMDB-AL-108580-2")
            }
        }

        Entry {
            id = "M-VGMDB-AL-107257"

            Visual(VisualKind.AlbumArt, 0.4, 0.75)
            SubIDEntry("3") {
                Music(3.5)
            }
        }

        // wtf
        Entry {
            id = "M-VGMDB-AL-108580"

            ValidatorSuppress("dah-visualless-entry")
            SubIDEntry("2") {
                Music(4.0)
            }
        }
    }
}
