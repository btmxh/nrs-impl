package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.OsuGame() {
    Entry {
        id = "M-VGMDB-AR-12225"

        Entry {
            id = "M-VGMDB-AL-34269"

            Visual(VisualKind.AlbumArt, 0.15, 0.4)

            // the third ayumu-era theme song
            SubIDEntry("7") {
                Music(3.0)
            }

            SubIDEntry("12") {
                // not gonna rate all of the backgrounds and shit
                Music(1.5)
                // i'm not overstreaming 222 bpm
                NEI(5.0, Emotion.AP)
                OsuSong(personal = 2.0, community = 8.0)
            }
        }
    }

    Entry {
        id = "M-52"
        title = "United (L.A.O.S Remix)"

        // we kicked a kid, united
        // r/osuplace stuff
        Meme(0.5, 6)
        OsuSong(personal = 2.0, community = 8.0)

        // Length source: https://www.youtube.com/watch?v=rnWXN8m6drc
        Music(4.0)
        MusicConsumedProgress("4:42") // impl_overridden
    }
}
