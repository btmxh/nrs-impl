package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

// when you are having a bad day, remember that rikekoi exists
fun DSLScope.RikeKoi() {
    Entry {
        id = "F-VGMDB-9552"
        title = "Rikei ga Koi ni Ochita no de Shoumei Shite Mita."

        // cucked by magireco lmfao
        // i'm impressed that they survived tho
        Entry {
            id = "A-MAL-38992"    // generated
            idMAL = 38992
            idAniList = 107067
            idKitsu = 42297
            idAniDB = 14590
            title = "Rikei ga Koi ni Ochita no de Shoumei shitemita."

            bestGirl = "Kotonoha Kanade" // kanaded lol

            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.25, 0.5)
            KilledBy("F-VGMDB-1945", potential = 0.5, effect = 0.75)
        }

        // then got fucked by rst's idol dystopia lol
        // rip
        Entry {
            id = "A-MAL-43470"    // generated
            idMAL = 43470
            idAniList = 125124
            idAniDB = 15788
            idKitsu = 43681
            title = "Rikei ga Koi ni Ochita no de Shoumei shitemita. Heart"

            bestGirl = "Kotonoha Kanade"

            Progress(Boredom.Dropped, 2)
            Visual(VisualKind.Animated, 0.25, 0.5)
            KilledBy("F-VGMDB-7059", potential = 0.2, effect = 0.75)
        }
    }
}