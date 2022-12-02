package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.Vocaloid() {
    Entry {
        // there is no vgmdb entry for this
        // but there is a mal one kek
        id = "M-MAL-36631"
        title = "Pandora Voxx Complete"

        Visual(VisualKind.AlbumArt, 0.1, 0.2)

        SubIDEntry("6") {
            title = "Chikyuu Saigo no Kokuhaku wo"
            Visual(VisualKind.AnimatedMV, 0.5, 0.5)
            // the legendary fifth ayumu-era theme song

            // for some reason, this almost made me cry
            // (somewhat unrelated to ayumu shit)
            AEI(0.5, Emotion.CU)

            // Length source: https://www.nicovideo.jp/watch/sm18198019
            Music(0.425)
            MusicConsumedProgress("4:32") // impl_overridden
            Remix("M-20220205T023322-1")
            Remix("M-20220205T023322-3")
        }
    }

    Entry {
        id = "M-20220205T023322-1"
        title = "Chikyuu Saigo no Kokuhaku wo (yuikonnu)"

        // yuiko version is probably the best, music-wise
        // Length source: https://www.nicovideo.jp/watch/sm20429546
        Music(0.65)
        MusicConsumedProgress("4:32") // impl_overridden
    }

    Entry {
        id = "M-20220205T023322-3"
        title = "Chikyuu Saigo no Kokuhaku wo (HAG)"

        // quite good, but they didn't keep the orig. inst.
        // Length source: https://open.spotify.com/album/57fYw02YKyHnr1rQ15Ynkx
        Music(0.5)
        MusicConsumedProgress("4:23") // impl_overridden
    }

    Entry {
        id = "M-20221115T105859"
        title = "AI"

        Visual(VisualKind.SemiAnimatedMV, 0.6, 0.5)
        // Length source: https://osu.ppy.sh/beatmapsets/955580
        MusicConsumedProgress("4:23")
        Music(0.65)
        OsuSong(personal = 0.8, community = 0.0)
    }

    Entry {
        id = "M-VGMDB-AL-97732"
        title = "HATSUNE MIKU PROJECT DIVA MEGA39'S 10TH ANNIVERSARY COLLECTION" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.3)
        SubIDEntry("73") {
            title = "shake it!" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("3:47") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.3)
            OsuSong(personal = 0.6, community = 0.6)
        }
        SubIDEntry("90") {
            title = "Hand in Hand" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("2:57") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.4)
        }
        SubIDEntry("95") {
            title = "ヒバナ" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("3:27") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.4)
            OsuSong(personal = 0.5, community = 0.5)
        }
    }
}
