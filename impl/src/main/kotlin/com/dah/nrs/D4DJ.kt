package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.D4DJ() {
    Entry {
        id = "F-VGMDB-8339"
        title = "D4DJ"

        Entry {
            id = "A-MAL-39681"

            bestGirl = "Aimoto Rinku"

            AnimeProgressOld(Boredom.Completed, 13)
            Visual(VisualKind.Animated, 0.4, 0.75)
            FeatureMusic("M-VGMDB-AL-107257")
            FeatureMusic("M-VGMDB-AL-108580-2")
            KilledBy("F-VGMDB-2588", potential = 0.5, effect = 0.2)
        }

        Entry {
            id = "M-66"
            title = "Happy Around!"
            ValidatorSuppress("dah-entry-no-consumed")

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
                // Length source: https://d4dj.fandom.com/wiki/Brand_New_World
                MusicConsumedProgress("4:06") // impl_overridden
                Music(4.0)
            }
        }
    }
}
