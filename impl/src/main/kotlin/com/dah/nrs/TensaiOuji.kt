package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

fun DSLScope.TensaiOuji() {
    Entry {
        id = "F-VGMDB-10006"
        title = "Tensai Ouji no Akaji Kokka Saiseijutsu"

        Entry {
            id = "A-MAL-47159"
            title = "Tensai Ouji no Akaji Kokka Saisei Jutsu"

            bestGirl = "Ninym Ralei"

            // ngl main girl and mc relationship is wholesome af
            NEI(0.5, Emotion.MP)

            AnimeConsumedProgress(EntryStatus.Completed, 0.8, 12)
            Visual(VisualKind.Animated, 0.5, 0.3)

            // cool plot ig
            NEI(0.8, Emotion.AP)

            // arc 2 rst-sb69 era
            KilledBy("F-VGMDB-9540", 0.05, 0.05)
            KilledBy("F-VGMDB-7059", 0.05, 0.05)
            KilledBy("F-VGMDB-4499", 0.05, 0.2)
        }

        Entry {
            id = "M-VGMDB-AL-116264"

            Visual(VisualKind.AlbumArt, 0.3, 0.3)

            SubIDEntry("1") {
                Music(0.5)
            }
        }
    }
}
