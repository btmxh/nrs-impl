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
            id = "A-MAL-11887"
            title = "Kokoro Connect"

            Boredom(Boredom.Completed)

            FeatureMusic("M-VGMDB-AL-35431")
        }

        Entry {
            id = "A-MAL-16001"
            title = "Kokoro Connect: Michi Random"

            Boredom(Boredom.Completed)
        }
    }
}
