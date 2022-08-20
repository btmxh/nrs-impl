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

            Visual(VisualKind.AlbumArt, 0.4, 0.15)

            SubIDEntry("1") {
                // fuwa fuwa
                // dong do la max do
                // duy bua ham l
                // duy bua ngao l
                Music(2.0)
            }
        }

        Entry {
            id = "M-9"
            title = "Petit Rabbit's"

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-44890")
            }
        }

        Entry {
            id = "M-VGMDB-AL-55364"
            title = "Is the order a rabbit?? Chino Character Song Album: CUP OF Chino"

            Visual(VisualKind.AlbumArt, 0.5, 0.2)
            // this also includes mahou shoujo chino
            Contains("M-VGMDB-AL-54418-1")

            SubIDEntry("3", "Shinsaku no Shiawase wa Kochira!") {
                // dan dan kikoeru
                // lets go i fced the son's insane diff with dt
                // fuck sekai's insane tho
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-54418"
            title = "Gochuumon wa Mahou Shoujo desu ka? Image Song: Mahou Shoujo Chino"

            Visual(VisualKind.AlbumArt, 0.4, 0.15)
            SubIDEntry("1", "Mahou Shoujo Chino") {
                Music(2.0)
            }
        }

        Entry {
            id = "A-MAL-21273"    // generated
            idMAL = 21273
            idAniList = 20517
            idAniDB = 10262
            idKitsu = 8095
            title = "Gochuumon wa Usagi Desu ka?"
            bestGirl = "Kafuu Chino"
            // humor not that good tho
            NEI(3.0, Emotion.AP)
            Boredom(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.15)
        }
    }
}
