package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.D4DJ() {
    Entry {
        id = "F-VGMDB-8339"
        title = "D4DJ"

        Entry {
            id = "A-MAL-39681"    // generated
            idMAL = 39681
            idAniList = 115069
            idKitsu = 43557
            idAniDB = 14815
            title = "D4DJ: First Mix"

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
            title = "Guruguru DJ TURN!!"

            Visual(VisualKind.AlbumArt, 0.4, 0.75)
            SubIDEntry("3") {
                Music(3.5)
            }
        }

        // wtf
        Entry {
            id = "M-VGMDB-AL-108580"
            title = "D4DJ Special Disc Photon Maiden Ver. "

            ValidatorSuppress("dah-visualless-entry")
            SubIDEntry("2", "Brand New World") {
                Music(4.0)
            }
        }
    }
}