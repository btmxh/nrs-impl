package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

// this got paired with rst a lot on /a/
// which means that maybe my taste isn't that bad after all
fun DSLScope.LapisReLights() {
    Entry {
        id = "F-VGMDB-7970"
        title = "Lapis Re:LiGHTs"

        // the first idol anime of history
        // also first music cgdct except k-on
        // (k-on sucks so it doesn't count keep coping keionfags)
        Entry {
            id = "A-MAL-37587"
            title = "Lapis Re:LiGHTs" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 37587 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 41115 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 104937 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 37587 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Tiara"

            // funny af, love live stands no chance
            EHI()
            Visual(VisualKind.Animated, 0.4, 0.2)
            FeatureMusic("M-VGMDB-AL-104957")
            Progress(Boredom.Completed)
        }

        Entry {
            id = "M-51"
            title = "LiGHTs"

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-104957")
            }
        }

        Entry {
            id = "M-VGMDB-AL-104957"

            Visual(VisualKind.AlbumArt, 0.4, 0.2)

            SubIDEntry("1") {
                Music(4.0)
            }
        }
    }
}
