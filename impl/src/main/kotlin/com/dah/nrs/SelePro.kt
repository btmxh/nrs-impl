package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.SelePro() {
    Entry {
        id = "F-VGMDB-9703"
        title = "SELECTION PROJECT"

        Entry {
            id = "A-MAL-44275"
            title = "Selection Project" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 44275 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44211 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 126790 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 44275 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Uta Koizumi" // generated(generate_best_girls.dart v0.1.0)

            Cry(Emotion.CU)
            AnimeProgressOld(Boredom.Completed, 13)
            Visual(VisualKind.Animated, 0.5, 0.3)

            KilledBy("F-VGMDB-7059", potential = 0.25, effect = 0.5)
            KilledBy("F-VGMDB-3245", potential = 0.25, effect = 0.8)
        }

        Entry {
            id = "M-50"
            title = "9-tie"
            ValidatorSuppress("dah-entry-no-consumed")

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-114102")
            }
        }

        Entry {
            id = "M-VGMDB-AL-114102"
            title = "SELECTION PROJECT Main Theme Song CD" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.5, 0.3)
            SubIDEntry("1") {
                MusicConsumedProgress("3:54") // generated(fill_music_metadata.dart v0.1.1)
                title = "Glorious Days" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-115010"
            title = "SELECTION PROJECT CHARACTER SONG CD 03" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.3, 0.3)
            SubIDEntry("1") {
                MusicConsumedProgress("Unknown") // generated(fill_music_metadata.dart v0.1.1)
                title = "ENDROLL" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("3:53")
                Music(0.4)
            }
        }
    }
}
