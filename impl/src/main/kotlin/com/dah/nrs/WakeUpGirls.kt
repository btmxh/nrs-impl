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
            title = "Wake Up, Girls!"

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-42945")
                Contains("M-VGMDB-AL-46042")
                Contains("M-VGMDB-AL-68276", 0.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-46042"
            title = "Tachiagare!"

            Visual(VisualKind.AlbumArt, 0.4, 0.6)

            SubIDEntry("1") {
                Music(6.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-42945"
            title = "7 Girls War"

            Visual(VisualKind.AlbumArt, 0.4, 0.6)

            SubIDEntry("1") {
                Music(3.5)
            }
        }

        Entry {
            id = "A-MAL-21189"
            title = "Wake Up, Girls! Shichinin no Idol"

            Boredom(Boredom.Completed)
            // partially benefitted from rst
            KilledBy("F-VGMDB-7059", potential = 0.25, effect = 0.5)

            FeatureMusic("M-VGMDB-AL-46042-1")
            Visual(VisualKind.Animated, 0.4, 0.6)
        }

        Entry {
            id = "A-MAL-19023"
            title = "Wake Up, Girls!"

            Boredom(Boredom.Completed)
            KilledBy("F-VGMDB-7059", potential = 0.1, effect = 0.5)
            FeatureMusic("M-VGMDB-AL-42945-1")
            Visual(VisualKind.Animated, 0.4, 0.6)
        }

        Entry {
            id = "A-MAL-28841"
            title = "Wake Up, Girls! Seishun no Kage"

            Boredom(Boredom.Completed)
            KilledBy("F-VGMDB-7059", potential = 0.1, effect = 0.5)
            Visual(VisualKind.Animated, 0.4, 0.6)
        }

        Entry {
            id = "A-MAL-30419"
            title = "Wake Up, Girls! Beyond the Bottom"

            Boredom(Boredom.Completed)
            KilledBy("F-VGMDB-7059", potential = 0.1, effect = 0.5)
            Visual(VisualKind.Animated, 0.4, 0.6)
        }

        Entry {
            id = "A-MAL-34522"
            title = "Wake Up, Girls! Shin Shou"

            Boredom(Boredom.Completed)
            KilledBy("F-VGMDB-7059", potential = 0.1, effect = 0.5)
            Visual(VisualKind.Animated, 0.3, 0.6)
        }
    }

    Entry {
        id = "M-VGMDB-AL-68276"

        // dream luck be like lmfao
        title = "One In A Billion" // [Fantasy]

        Visual(VisualKind.AlbumArt, 0.1, 0.2)

        SubIDEntry("1") {
            OsuSong(personal = 0.5, community = 0.1)
            Music(6.0)
        }
    }
}