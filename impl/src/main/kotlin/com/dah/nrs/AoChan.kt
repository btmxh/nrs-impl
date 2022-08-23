package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.AoChan() {
    Entry {
        id = "F-VGMDB-7175"
        title = "Midara na Ao-chan wa Benkyou ga Dekinai"

        Entry {
            id = "A-MAL-38778"    // generated
            idMAL = 38778
            idAniList = 105989
            idKitsu = 42024
            idAniDB = 14519
            title = "Midara na Ao-chan wa Benkyou ga Dekinai"
            bestGirl = "Horie Ao"
            Progress(Boredom.Dropped, 3)
            Visual(VisualKind.AnimatedShort, 0.6, 0.4)
            FeatureMusic("M-VGMDB-AL-85759-1")
        }

        Entry{
            id = "M-VGMDB-AL-85759"
            title = "WONDERFUL WONDER"
            Visual(VisualKind.AlbumArt, 0.6, 0.4)

            // simple heart dt
            SubIDEntry("1") {
                Music(1.5)
                OsuSong(personal = 4.0, community = 2.0)
            }
        }
    }

}