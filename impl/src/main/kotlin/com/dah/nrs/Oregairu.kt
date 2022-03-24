package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.Oregairu() {
    Entry {
        id = "F-VGMDB-3274"
        title = "Yahari Ore no Seishun Love Comedy wa Machigatteiru."

        Contains("M-VGMDB-AL-37932-1")
        Contains("M-VGMDB-AL-51516-1")
        Contains("M-VGMDB-AL-96288-1")

        Entry {
            id = "M-VGMDB-AL-37999"
            title = "Hello Alone"

            Music(3.0) {
                contributors["M-VGMDB-AL-37999-1"] = 0.5
                contributors["M-VGMDB-AL-37999-2"] = 0.5
            }

            SubIDEntry("1")
            SubIDEntry("2", "Hello Alone -Yui Ballade-")
        }

        Entry {
            id = "M-VGMDB-AL-51394"
            title = "Everyday World"

            Music(3.5) {
                contributors["M-VGMDB-AL-51394-1"] = 0.5
                contributors["M-VGMDB-AL-51394-3"] = 0.5
            }

            SubIDEntry("1", "Everyday World")
            SubIDEntry("3", "Everyday World -Ballade Arrange- Yui Solo Ver.")
        }

        Entry {
            id = "M-VGMDB-AL-96290"
            title = "Diamond no Jundo"

            SubIDEntry("1") {
                Music(3.0)
            }
        }

        // The Yui Depression, when I realize that the VSCC
        // (Volunteer Service Club Compoly) is not as good as
        // I thought to be.
        // Read here for more details:
        // http://yaharianalysis.x10host.com/
        // (esp. http://yaharianalysis.x10host.com/parts/Yui/index.php)
        PADS(999, Emotion.CU) {
            contributors["M-VGMDB-AL-51394-3"] = 0.05
            contributors["M-VGMDB-AL-37999-2"] = 0.05
            contributors["A-MAL-14813"] = 0.1
            contributors["A-MAL-23847"] = 0.8
        }

        // Hikism-Yukism
        Politics {
            contributors["A-MAL-14813"] = 0.6
            contributors["A-MAL-23847"] = 0.4
        }

        Meme(0.7, Meme.MMoreThan3Months) {
            contributors["A-MAL-14813"] = 0.4
            contributors["A-MAL-23847"] = 0.6
        }

        // VSCC is pretty comfy (before Yui Depression)
        NEI(6.0, Emotion.MP) {
            contributors["A-MAL-14813"] = 0.3
            contributors["A-MAL-23847"] = 0.7
        }

        Entry {
            id = "A-MAL-14813"
            title = "Yahari Ore no Seishun Love Comedy wa Machigatteiru."

            // Brain's Base drew Yukino better than Yui
            bestGirl = "Yukinoshita Yukino"

            NEI(2.5, Emotion.AP)

            FeatureMusic("M-VGMDB-AL-37932-1")
            FeatureMusic("M-VGMDB-AL-37999")

            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-23847"
            title = "Yahari Ore no Seishun Love Comedy wa Machigatteiru. Zoku"

            // feel. drew Yui better
            bestGirl = "Yuigahama Yui"

            NEI(1.5, Emotion.AP)

            // Oregairu S2 has a lot of drama that I don't even
            // understand. But it's pretty good ngl.
            // (basically atmospheric-CU farm)
            AEI(9.0, Emotion.CU)

            FeatureMusic("M-VGMDB-AL-51516-1")
            FeatureMusic("M-VGMDB-AL-51394-1")
            FeatureMusic("M-VGMDB-AL-51394-3")

            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-39547"
            title = "Yahari Ore no Seishun Love Comedy wa Machigatteiru. Kan"

            bestGirl = "Yuigahama Yui"
            seasonal = true

            Meme(0.2, Meme.M1_3Days)

            // Yui dead people arc was kinda good
            // but Oregairu is just dead
            // you can't do much about it
            AEI(4.0, Emotion.CU)
            NEI(1.0, Emotion.AP)

            // killed by lapis re lights lmao xd
            KilledBy("A-MAL-37587")

            FeatureMusic("M-VGMDB-AL-96288-1")
            FeatureMusic("M-VGMDB-AL-96290-1")

            Boredom(Boredom.Completed)
        }
    }
}
