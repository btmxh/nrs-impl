package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

fun DSLScope.Priconne() {
    Entry {
        id = "F-VGMDB-7086"
        title = "PRINCESS CONNECT!"

        Entry {
            id = "A-MAL-39292"
            title = "Princess Connect! Re:Dive" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 39292 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42892 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 107871 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 39292 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Karyl"
            Visual(VisualKind.Animated, 0.55, 0.25)
            AnimeConsumedProgress(EntryStatus.Completed, 0.9, 12)
            NEI(0.9, Emotion.AP) // funny ig
        }

        Entry {
            id = "A-MAL-42670"
            title = "Princess Connect! Re:Dive Season 2" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 42670 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 43600 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 122808 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 42670 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Karyl"
            Visual(VisualKind.Animated, 0.55, 0.25)
            AnimeConsumedProgress(EntryStatus.Completed, 0.5, 5)
            NEI(0.5, Emotion.CP) // idk lol
            NEI(0.75, Emotion.AP) // funny ig
        }

        Entry {
            id = "M-VGMDB-AL-82981"
            title = "PRINCESS CONNECT! Re:Dive PRICONNE CHARACTER SONG 07" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.5, 0.4)
            SubIDEntry("2") {
                title = "Ding Dong Holy Night♪" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:18") // generated(fill_music_metadata.dart v0.1.1)
                Music(0.45)
                OsuSong(personal = 0.5, community = 0.0)
            }
        }
    }
}
