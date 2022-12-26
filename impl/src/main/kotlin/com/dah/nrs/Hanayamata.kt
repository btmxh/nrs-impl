package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

fun DSLScope.Hanayamata() {
    // the good old days
    // everything was in order
    // no chaos, no unexpected meta, no neo-romance,
    // no himeno sena, no culture-loving culture
    Entry {
        id = "F-VGMDB-2924"
        title = "Hanayamata"

        Entry {
            id = "A-MAL-21681"

            bestGirl = "Naru Sekiya"

            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 12)
            Visual(VisualKind.Animated, 0.4, 0.7)

            // first ep aei
            AEI(0.2, Emotion.MP to 0.3, Emotion.CP to 0.7)
            FeatureMusic("M-VGMDB-AL-46235-1")
        }

        Entry {
            id = "M-VGMDB-AL-46235"

            Visual(VisualKind.AlbumArt, 0.4, 0.7)

            SubIDEntry("1") {
                Music(0.6)
            }
        }
    }
}
