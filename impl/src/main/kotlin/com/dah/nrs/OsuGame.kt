package com.dah.nrs

import com.dah.nrs.dsl.*
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
                OsuSong(personal = 0.2, community = 0.8)
            }
        }
    }

    Entry {
        id = "M-52"
        title = "United (L.A.O.S Remix)"

        // we kicked a kid, united
        // r/osuplace stuff
        Meme(0.5, 6)
        OsuSong(personal = 0.2, community = 0.8)

        // Length source: https://www.youtube.com/watch?v=rnWXN8m6drc
        Music(0.4)
        MusicConsumedProgress("4:42") // impl_overridden
    }

    Entry {
        id = "M-VGMDB-AL-49508"
        title = "Tsukinami / Kanon Wakeshima" // generated(fill_music_metadata.dart v0.1.1)

        Visual(VisualKind.AlbumArt, 0.25, 0.5)
        SubIDEntry("2") {
            title = "ツキナミ" // generated(fill_music_metadata.dart v0.1.1)
            Music(0.4)
            // Length source: https://osu.ppy.sh/beatmapsets/896080#osu/1872396
            MusicConsumedProgress("4:44") // impl_overridden
        }
    }

    Entry {
        id = "M-VGMDB-AL-79187"
        title = "Kisses and Kills / THE ORAL CIGARETTES" // generated(fill_music_metadata.dart v0.1.1)

        Visual(VisualKind.AlbumArt, 0.1, 0.2)
        SubIDEntry("1") {
            MusicConsumedProgress("2:19") // generated(fill_music_metadata.dart v0.1.1)
            title = "もういいかい?" // generated(fill_music_metadata.dart v0.1.1)
            Music(0.4)
        }
    }

    Entry {
        id = "M-VGMDB-AL-52234"
        title = "HANASAKI WORK SPRING! COMPLETE SOUNDTRACK" // generated(fill_music_metadata.dart v0.1.1)

        Visual(VisualKind.AlbumArt, 0.5, 0.5)
        SubIDEntry("1") {
            MusicConsumedProgress("4:12") // generated(fill_music_metadata.dart v0.1.1)
            title = "Girl meets Love" // generated(fill_music_metadata.dart v0.1.1)
            Music(0.5)
            // haha tranny duy bua
            Meme(0.01, numDays("2021-06-01"))
        }
    }

    Entry {
        id = "M-VGMDB-AL-33518"
        title = "Irotoridori no Hikari Theme Songs Plus" // generated(fill_music_metadata.dart v0.1.1)

        Visual(VisualKind.AlbumArt, 0.4, 0.6)
        SubIDEntry("2") {
            MusicConsumedProgress("4:31") // generated(fill_music_metadata.dart v0.1.1)
            title = "COLORFUL DAYS!!" // generated(fill_music_metadata.dart v0.1.1)
            Music(0.7)
        }
    }

    Entry {
        id = "M-VGMDB-AL-78595"
        title = "AstralAir no Shiroki Towa - ETERNAL BEST -" // generated(fill_music_metadata.dart v0.1.1)

        Visual(VisualKind.AlbumArt, 0.4, 0.6)
        SubIDEntry("16") {
            MusicConsumedProgress("6:10") // generated(fill_music_metadata.dart v0.1.1)
            title = "Dreams come true -Hana Saki Hokoru, Chikyuu no Moto de-" // generated(fill_music_metadata.dart v0.1.1)
            Music(0.55)
        }
    }
}
