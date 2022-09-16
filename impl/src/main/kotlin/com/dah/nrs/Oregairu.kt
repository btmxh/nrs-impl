package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.dsl.numDays
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

            Visual(VisualKind.AlbumArt, 0.3, 0.5)

            Music(3.0) {
                contributors["M-VGMDB-AL-37999-1"] = 0.5
                contributors["M-VGMDB-AL-37999-2"] = 0.5
            }

            SubIDEntry("1") {

            }

            SubIDEntry("2") {

            }
        }

        Entry {
            id = "M-VGMDB-AL-51394"

            Visual(VisualKind.AlbumArt, 0.4, 0.25)

            Music(3.5) {
                contributors["M-VGMDB-AL-51394-1"] = 0.5
                contributors["M-VGMDB-AL-51394-3"] = 0.5
            }

            SubIDEntry("1") {

            }

            SubIDEntry("3") {
                
            }
        }

        Entry {
            id = "M-VGMDB-AL-96290"

            Visual(VisualKind.AlbumArt, 0.4, 0.25)

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

        Meme(0.7, numDays("2019-07-14" /*the July 14th incident*/, "2020-01-01")) {
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

            // Brain's Base drew Yukino better than Yui
            bestGirl = "Yukinoshita Yukino"

            Visual(VisualKind.Animated, 0.25, 0.4)
            NEI(7.5, Emotion.AP)

            FeatureMusic("M-VGMDB-AL-37932-1")
            FeatureMusic("M-VGMDB-AL-37999")

            AnimeProgressOld(Boredom.Completed, 13)
        }

        Entry {
            id = "A-MAL-23847"

            // feel. drew Yui better
            bestGirl = "Yuigahama Yui"

            Visual(VisualKind.Animated, 0.4, 0.25)
            NEI(2.5, Emotion.AP)

            // Oregairu S2 has a lot of drama that I don't even
            // understand. But it's pretty good ngl.
            // (basically atmospheric-CU farm)
            AEI(9.0, Emotion.CU)

            FeatureMusic("M-VGMDB-AL-51516-1")
            FeatureMusic("M-VGMDB-AL-51394-1")
            FeatureMusic("M-VGMDB-AL-51394-3")

            AnimeProgressOld(Boredom.Completed, 13)
        }

        Entry {
            id = "A-MAL-39547"

            bestGirl = "Yuigahama Yui"
            seasonal = true

            Visual(VisualKind.Animated, 0.4, 0.25)
            Meme(0.2, 2)

            // Yui dead people arc was kinda good
            // but Oregairu is just dead
            // you can't do much about it
            AEI(4.0, Emotion.CU)
            NEI(1.0, Emotion.AP)

            // killed by lapis re lights lmao xd
            KilledBy("A-MAL-37587", potential = 0.75, effect = 0.5)

            FeatureMusic("M-VGMDB-AL-96288-1")
            FeatureMusic("M-VGMDB-AL-96290-1")

            AnimeProgressOld(Boredom.Completed, 12)
        }
    }
}
