package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.OsuGame() {
    Entry {
        id = "M-VGMDB-AR-12225"
        title = "xi" // generated(fill_music_metadata.dart v0.1.1)

        Entry {
            id = "M-VGMDB-AL-34269"
            title = "Parousia" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.15, 0.4)

            // the third ayumu-era theme song
            SubIDEntry("7") {
                MusicConsumedProgress("5:11") // generated(fill_music_metadata.dart v0.1.1)
                title = "Ascension to Heaven" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.3)
            }

            SubIDEntry("12") {
                MusicConsumedProgress("4:29") // generated(fill_music_metadata.dart v0.1.1)
                title = "FREEDOM DiVE↓" // generated(fill_music_metadata.dart v0.1.1)
                // not gonna rate all of the backgrounds and shit
                Music(0.15)
                // i'm not overstreaming 222 bpm
                NEI(0.5, Emotion.AP)
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
        Music(0.4)
        MusicConsumedProgress("4:42") // impl_overridden
    }
}
