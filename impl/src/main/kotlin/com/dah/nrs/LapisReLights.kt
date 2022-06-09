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
            title = "Lapis Re:LiGHTs"

            // funny af, love live stands no chance
            EHI()
            FeatureMusic("M-VGMDB-AL-104957")
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "M-51"
            title = "LiGHTs"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-104957")
            }
        }

        Entry {
            id = "M-VGMDB-AL-104957"
            title = "700,000,000,000,000,000,000,000 no Sora de"

            SubIDEntry("1") {
                Music(4.0)
            }
        }
    }
}