package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.ToniKawa() {

    Entry {
        id = "F-VGMDB-10135"
        title = "Tonikaku Kawaii"

        Entry {
            id = "A-MAL-41389"    // generated
            idMAL = 41389
            idAniList = 116267
            idKitsu = 43034
            idAniDB = 15421
            title = "Tonikaku Kawaii"
            bestGirl = "Yuzaki Tsukasa"

            Visual(VisualKind.Animated, 0.4, 0.6)
            Progress(Boredom.Dropped, 1)
            KilledBy("F-VGMDB-2588", 0.2, 0.5)
            FeatureMusic("M-VGMDB-AL-104618")
        }

        Entry {
            id = "M-VGMDB-AL-104618"
            title = "Koi no Uta (feat. Tsukasa Yuzaki)"

            Visual(VisualKind.AlbumArt, 0.4, 0.6)
            SubIDEntry("1", "Koi no Uta (feat. Yuzaki Tsukasa)") {
                Music(4.0)
            }
        }
    }
}