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
            id = "A-MAL-44275"    // generated
            idMAL = 44275
            idAniList = 126790
            idAniDB = 15904
            idKitsu = 44211
            title = "SELECTION PROJECT"
            bestGirl = "Koizumi Uta"

            Cry(Emotion.CU)
            Boredom(Boredom.Completed)
            Visual(VisualKind.Animated, 0.5, 0.3)

            KilledBy("F-VGMDB-7059", potential = 0.25, effect = 0.5)
            KilledBy("F-VGMDB-3245", potential = 0.25, effect = 0.8)
        }

        Entry {
            id = "M-50"
            title = "9-tie"

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-114102")
            }
        }

        Entry {
            id = "M-VGMDB-AL-114102"
            title = "SELECTION PROJECT Main Theme Song CD"

            Visual(VisualKind.AlbumArt, 0.5, 0.3)
            SubIDEntry("1", "Glorious Days") {
                Music(5.0)
            }
        }
    }
}