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

            bestGirl = "Rinku Aimoto" // generated(generate_best_girls.dart v0.1.0)

            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 13)
            Visual(VisualKind.Animated, 0.4, 0.75)
            FeatureMusic("M-VGMDB-AL-107257")
            FeatureMusic("M-VGMDB-AL-108580-2")
            KilledBy("F-VGMDB-2588", potential = 0.5, effect = 0.2)
        }

        Entry {
            id = "M-20220823T115611"
            title = "Happy Around!"
            ValidatorSuppress("dah-entry-no-consumed")

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-107257")
                Contains("M-VGMDB-AL-108580-2")
            }
        }

        Entry {
            id = "M-VGMDB-AL-107257"
            title = "Guruguru DJ TURN!! / Happy Around!" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.75)
            SubIDEntry("3") {
                MusicConsumedProgress("3:43") // generated(fill_music_metadata.dart v0.1.1)
                title = "Guruguru DJ TURN!!" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.35)
            }
        }

        // wtf
        Entry {
            id = "M-VGMDB-AL-108580"
            title = "D4DJ Special Disc Photon Maiden Ver." // generated(fill_music_metadata.dart v0.1.1)

            ValidatorSuppress("dah-visualless-entry")
            SubIDEntry("2") {
                title = "Brand New World" // generated(fill_music_metadata.dart v0.1.1)
                // Length source: https://d4dj.fandom.com/wiki/Brand_New_World
                MusicConsumedProgress("4:06") // impl_overridden
                Music(0.4)
            }
        }
    }
}
