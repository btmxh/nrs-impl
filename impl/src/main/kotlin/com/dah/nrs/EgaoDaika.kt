package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

fun DSLScope.EgaoDaika() {
    Entry {
        id = "F-VGMDB-6946"
        title = "Egao no Daika"

        Entry {
            id = "A-MAL-38544"

            bestGirl = "Yuuki Soleil"
            // no way it's the
            // stfu it's nee we are supposed to cry about
            // himeno sena, imagine still talking about the
            // ortensia incident omegalul it's so 2022Q1

            // cool story btw
            // like it gave us a somewhat new approach to
            // like war or sth
            // like we see how the main girl as a leader have
            // to endure sth sth
            // pretty cool and sad for her ig
            // also ortensia incident

            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 12)
            Visual(VisualKind.Animated, 0.5, 0.3)
            FeatureMusic("M-VGMDB-AL-81448-1")
            AEI(0.75, Emotion.CU to 0.5, Emotion.MP to 0.25, Emotion.AP to 0.25)
        }

        Entry {
            id = "M-VGMDB-AL-81448"

            Visual(VisualKind.AlbumArt, 0.5, 0.3)
            SubIDEntry("1") {
                Music(0.5)
                OsuSong(personal = 0.2, community = 0.1)
            }
        }
    }
}
