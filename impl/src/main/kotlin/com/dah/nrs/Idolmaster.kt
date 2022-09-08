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

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-78253-1")
            }
        }

        Entry {
            id = "M-VGMDB-AL-53945"

            Visual(VisualKind.AlbumArt, 0.5, 0.25)
            SubIDEntry("1") {
                Music(3.5)
                OsuSong(personal = 8.0)
            }
        }
        Entry {
            id = "M-VGMDB-AL-64249"

            Visual(VisualKind.AlbumArt, 0.3, 0.3)

            SubIDEntry("1") {
                Music(4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-78253"

            Visual(VisualKind.AlbumArt, 0.4, 0.15)

            SubIDEntry("1") {
                Music(3.5)
                OsuSong(personal = 5.0, community = 2.0)
            }
        }

        Entry {
            id = "A-MAL-10278"
            bestGirl = "Minase Iori"
            // ending pretty sadge
            NEI(6.0, Emotion.CU)

            // funny ig
            NEI(7.5, Emotion.AP)

            // idk why i gave this 6 in NRS1 but i'll nerf it to 0.3 ig.
            Music(0.3)
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.3)
        }

        NEI(2.5, Emotion.AP) {
            contributors["A-MAL-23587"] = 0.5
            contributors["A-MAL-30344"] = 0.5
        }

        Entry {
            id = "A-MAL-23587"
            bestGirl = "Ogata Chieri"
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.5, 0.2)
        }

        Entry {
            id = "A-MAL-30344"
            bestGirl = "Ogata Chieri"
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.5, 0.2)
        }
    }
}
