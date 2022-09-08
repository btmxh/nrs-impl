package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.AoChan() {
    Entry {
        id = "F-VGMDB-7175"
        title = "Midara na Ao-chan wa Benkyou ga Dekinai"

        Entry {
            id = "A-MAL-38778"
            title = "Midara na Ao-chan wa Benkyou ga Dekinai" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38778 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42024 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 105989 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38778 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Horie Ao"
            Progress(Boredom.Dropped, 3)
            Visual(VisualKind.AnimatedShort, 0.6, 0.4)
            FeatureMusic("M-VGMDB-AL-85759-1")
        }

        Entry{
            id = "M-VGMDB-AL-85759"
            Visual(VisualKind.AlbumArt, 0.6, 0.4)

            // simple heart dt
            SubIDEntry("1") {
                Music(1.5)
                OsuSong(personal = 4.0, community = 2.0)
            }
        }
    }

}
