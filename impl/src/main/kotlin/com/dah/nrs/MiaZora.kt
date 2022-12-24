package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

fun DSLScope.MiaZora() {
    Entry {
        id = "F-VGMDB-5607"
        title = "Miagete Goran, Yozora no Hoshi wo"

        // average FFP miharu worshipper
        // average "Rafis | Ceui - Finest Sky [Albireo Princess] (Shizuku-)
        // +HD,DT (98.84) FC #1 | 987pp 67.99 cv. UR (His new top play)"" enjoyer

        Entry {
            id = "V-VNDB-16560"
            title = "Miagete Goran, Yozora no Hoshi o"

            bestGirl = "Saotome Miharu"
            // legends said that ffp was born because of this woman
            // if so she's worst girl /s

            // also the girls in this vn suck ngl
            // idk maybe the albireo princess girl is cute
            // but she had some caveats, i even picked hikari's
            // route first lol (i haven't finished any routes btw)

            Visual(VisualKind.VisualNovel, 0.6, 0.5)
            ConsumedProgress(EntryStatus.Dropped, 0.8, 15.hours)
            // obligatory eroge romcom humor
            NEI(0.8, Emotion.AP)
        }

        Entry {
            id = "M-VGMDB-AL-57788"

            Visual(VisualKind.AlbumArt, 0.2, 0.4)

            SubIDEntry("1") {
                Music(0.35)
                // [albireo princess]
                // hddt
                // haha
                OsuSong(personal = 0.5, community = 0.1)
            }
        }
    }
}
