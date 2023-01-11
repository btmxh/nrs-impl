package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

fun DSLScope.StellaMahou() {
    Entry {
        id = "F-VGMDB-6424"
        title = "Stella no Mahou"

        Entry {
            id = "A-MAL-32555"
            title = "Stella no Mahou" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 32555 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 11756 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21597 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 32555 // generated(fill_anime_metadata.dart v0.1.1)

            // i love music composers
            bestGirl = "Kayo Fujikawa"
            Visual(VisualKind.Animated, 0.5, 0.4)
            AnimeConsumedProgress(EntryStatus.Completed, 0.9, 12)
            NEI(0.5, Emotion.AP)
            NEI(0.2, Emotion.CP)
            FeatureMusic("M-VGMDB-AL-60899-1")
        }

        Entry {
            id = "M-VGMDB-AL-60899"
            title = "God Save The Girls / Shino Shimoji" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.2, 0.2)
            SubIDEntry("1") {
                title = "God Save The Girls" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:19") // generated(fill_music_metadata.dart v0.1.1)
                Music(0.45)
                OsuSong(personal = 0.25, community = 0.0)
            }
        }
    }
}