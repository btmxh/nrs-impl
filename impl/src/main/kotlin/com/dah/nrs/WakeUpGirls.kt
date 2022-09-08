package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.WakeUpGirls() {
    // A wise man once said:
    // Every EI (emotional impact) post rst arc 1,
    // is a direct consequence of the era

    Entry {
        id = "F-VGMDB-2645"
        title = "Wake Up, Girls!"

        // this is what happen when you combine
        // atmospheric farming with idolshit
        // also watch rst
        AEI(0.0, Emotion.CU to 0.5, Emotion.CP to 0.5) {
            contributors["A-MAL-21189"] = 0.75
            contributors["A-MAL-19023"] = 0.2
            contributors["A-MAL-38009"] = 0.04
            contributors["GF-VGMDB-7059"] = 0.01
        }

        Entry {
            id = "M-VGMDB-AR-15137"

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-42945")
                Contains("M-VGMDB-AL-46042")
                Contains("M-VGMDB-AL-68276", 0.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-46042"

            Visual(VisualKind.AlbumArt, 0.4, 0.6)

            SubIDEntry("1") {
                Music(6.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-42945"

            Visual(VisualKind.AlbumArt, 0.4, 0.6)

            SubIDEntry("1") {
                Music(3.5)
            }
        }

        Entry {
            id = "A-MAL-21189"

            bestGirl = "Shimada Mayu"

            Progress(Boredom.Completed)
            // partially benefitted from rst
            KilledBy("F-VGMDB-7059", potential = 0.25, effect = 0.5)

            FeatureMusic("M-VGMDB-AL-46042-1")
            Visual(VisualKind.Animated, 0.4, 0.6)
        }

        Entry {
            id = "A-MAL-19023"

            bestGirl = "Shimada Mayu"

            Progress(Boredom.Completed)
            KilledBy("F-VGMDB-7059", potential = 0.1, effect = 0.5)
            FeatureMusic("M-VGMDB-AL-42945-1")
            Visual(VisualKind.Animated, 0.4, 0.6)
        }

        Entry {
            id = "A-MAL-28841"

            bestGirl = "Shimada Mayu"

            Progress(Boredom.Completed)
            KilledBy("F-VGMDB-7059", potential = 0.1, effect = 0.5)
            Visual(VisualKind.Animated, 0.4, 0.6)
        }

        Entry {
            id = "A-MAL-30419"

            bestGirl = "Shimada Mayu"

            Progress(Boredom.Completed)
            KilledBy("F-VGMDB-7059", potential = 0.1, effect = 0.5)
            Visual(VisualKind.Animated, 0.4, 0.6)
        }

        Entry {
            id = "A-MAL-34522"

            bestGirl = "Shimada Mayu"

            Progress(Boredom.Completed)
            KilledBy("F-VGMDB-7059", potential = 0.1, effect = 0.5)
            Visual(VisualKind.Animated, 0.3, 0.6)
        }
    }

    Entry {
        id = "M-VGMDB-AL-68276"

        // dream luck be like lmfao

        Visual(VisualKind.AlbumArt, 0.1, 0.2)

        SubIDEntry("1") {
            OsuSong(personal = 5.0, community = 1.0)
            Music(6.0)
        }
    }
}
