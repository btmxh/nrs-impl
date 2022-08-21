package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.*

fun DSLScope.SwordArtOnline() {
    Entry {
        id = "F-VGMDB-2633"
        title = "Sword Art Online"

        Entry {
            id = "A-MAL-11757"    // generated
            idMAL = 11757
            idAniList = 11757
            idAniDB = 8692
            idKitsu = 6589
            title = "Sword Art Online"

            bestGirl = "Yuuki Asuna"
            FeatureMusic("M-VGMDB-AL-33537-1")
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.25)
        }

        Entry {
            id = "A-MAL-21881"    // generated
            idMAL = 21881
            idAniList = 20594
            idAniDB = 10376
            idKitsu = 8174
            title = "Sword Art Online II"

            bestGirl = "Yuuki Asuna"
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.25)
        }

        Entry {
            id = "A-MAL-31765"    // generated
            idMAL = 31765
            idAniList = 21403
            idAniDB = 11681
            idKitsu = 11423
            title = "Sword Art Online Movie: Ordinal Scale"

            bestGirl = "Yuuki Asuna"
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.6, 0.25)
        }

        Contains("M-VGMDB-AL-33537-1")
    }
}
