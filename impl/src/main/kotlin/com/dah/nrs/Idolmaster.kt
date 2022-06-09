package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.Idolmaster() {
    Entry {
        id = "F-VGMDB-3559"
        title = "THE IDOLM@STER"

        Entry {
            id = "M-VGMDB-AR-32295"
            title = "765 MILLION ALLSTARS"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-78253-1")
            }
        }

        Entry {
            id = "M-VGMDB-AL-53945"
            title = "THE IDOLM@STER LIVE THE@TER DREAMERS 01 Dreaming!"

            SubIDEntry("1") {
                Music(3.5)
                OsuSong(personal = 8.0)
            }
        }
        Entry {
            id = "M-VGMDB-AL-64249"
            title = "THE IDOLM@STER CINDERELLA MASTER EVERMORE"

            SubIDEntry("1") {
                Music(4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-78253"
            title = "THE IDOLM@STER MILLION THE@TER GENERATION 11 UNION!!"

            SubIDEntry("1") {
                Music(3.5)
                OsuSong(personal = 5.0, community = 2.0)
            }
        }

        Entry {
            id = "A-MAL-10278"
            title = "The iDOLM@STER"
            bestGirl = "Minase Iori"
            // ending pretty sadge
            NEI(6.0, Emotion.CU)

            // funny ig
            NEI(5.0, Emotion.AP)

            // idk why i gave this 6 in NRS1 but i'll nerf it to 0.3 ig.
            Music(0.3)
            Boredom(Boredom.Completed)
        }

        NEI(2.5, Emotion.AP) {
            contributors["A-MAL-23587"] = 0.5
            contributors["A-MAL-30344"] = 0.5
        }

        Entry {
            id = "A-MAL-23587"
            title = "The iDOLM@STER Cinderella Girls"
            bestGirl = "Ogata Chieri"
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-30344"
            title = "The iDOLM@STER Cinderella Girls 2nd Season"
            bestGirl = "Ogata Chieri"
            Boredom(Boredom.Completed)
        }
    }
}
