package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.KokoroConnect() {
    Entry {
        id = "F-VGMDB-3483"
        title = "Kokoro Connect"

        Entry {
            id = "M-VGMDB-AL-35431"
            title =
                """Kokoro Connect Original Soundtrack 2 Hito Random & Kizu Random Opening Theme Song "Kimochi Signal" / Kizu Random Ending Theme Song "Cry out""""

            Visual(VisualKind.AlbumArt, 0.4, 0.3)

            SubIDEntry("1", "Kimochi Signal") {
                Music(1.5)
            }
        }

        // drama
        AEI(9.0, Emotion.CU) {
            contributors["A-MAL-11887"] = 0.5
            contributors["A-MAL-16001"] = 0.5
        }

        // comfy compoly
        NEI(1.0, Emotion.MP) {
            contributors["A-MAL-11887"] = 0.75
            contributors["A-MAL-16001"] = 0.25
        }

        // plot
        AEI(5.0, Emotion.AP) {
            contributors["A-MAL-11887"] = 0.6
            contributors["A-MAL-16001"] = 0.4
        }

        Entry {
            id = "A-MAL-11887"    // generated
            idMAL = 11887
            idAniList = 11887
            idAniDB = 8742
            idKitsu = 6626
            title = "Kokoro Connect"
            bestGirl = "Nagase Iori"

            Boredom(Boredom.Completed)

            Visual(VisualKind.Animated, 0.4, 0.3)

            FeatureMusic("M-VGMDB-AL-35431")
        }

        Entry {
            id = "A-MAL-16001"    // generated
            idMAL = 16001
            idAniList = 16001
            idKitsu = 7355
            title = "Kokoro Connect: Michi Random"
            bestGirl = "Nagase Iori"

            Boredom(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.3)
        }
    }
}
