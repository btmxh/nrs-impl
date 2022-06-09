package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.ImageVocalContainFactor
import com.dah.nrs.exts.Meme
import com.dah.nrs.exts.Music

fun DSLScope.OnsenMusume() {
    // le funny franchise, lack content therefore low score
    // translate stuff for me if u want score to go up

    Entry {
        id = "F-VGMDB-6439"
        title = "Onsen Musume"

        Entry {
            id = "M-VGMDB-AL-75349"
            title = "Hop Step Jump!"

            SubIDEntry("1") {
                Music(6.0)
            }
        }

        Entry {
            id = "M-17"
            title = "SPRiNGS"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-75344-1")
                Contains("M-VGMDB-AL-75344-5")
                Contains("M-VGMDB-AL-75349")
            }
        }

        Entry {
            id = "M-VGMDB-AL-75344"
            title = "Tsuioku Kaleidoscope"

            SubIDEntry("1", "Junjou -SAKURA-") {
                Music(6.0)
            }

            // 2-4 are subunit songs
            SubIDEntry("2", "Romance no Ringo") {
                Music(7.0)
            }

            SubIDEntry("3", "SILENT VOICES") {
                Music(5.5)
            }

            SubIDEntry("4", "Ohayou Japonika") {
                Music(5.0)
            }

            SubIDEntry("5", "Sayonara Hanabi") {
                Music(1.0)
            }
        }

        Meme(0.3, 45)
    }
}
