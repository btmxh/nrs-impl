package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.GochiUsa() {
    Entry {
        id = "F-VGMDB-3939"
        title = "Gochuumon wa Usagi Desu ka?"

        Entry {
            id = "M-VGMDB-AL-44890"
            title = "Daydream café"

            SubIDEntry("1") {
                // fuwa fuwa
                // dong do la max do
                // duy bua ham l
                // duy bua ngao l
                Music(1.2)
            }
        }

        Entry {
            id = "M-9"
            title = "Petit Rabbit's"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-44890")
            }
        }

        Entry {
            id = "M-VGMDB-AL-55364"
            title = "Is the order a rabbit?? Chino Character Song Album: CUP OF Chino"

            // this also includes mahou shoujo chino
            Contains("M-VGMDB-AL-54418-1")

            SubIDEntry("3", "Shinsaku no Shiawase wa Kochira!") {
                // dan dan kikoeru
                // lets go i fced the son's insane diff with dt
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-54418"
            title = "Gochuumon wa Mahou Shoujo desu ka? Image Song: Mahou Shoujo Chino"

            SubIDEntry("1", "Mahou Shoujo Chino") {
                Music(2.0)
            }
        }

        Entry {
            id = "A-MAL-21273"
            title = "Gochuumon wa Usagi Desu ka?"
            // humor not that good tho
            NEI(3.0, Emotion.AP)
            Boredom(Boredom.Completed)
        }
    }
}
