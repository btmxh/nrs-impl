package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

fun DSLScope.Nakineko() {
    // i hate himeno sena
    Entry {
        id = "F-VGMDB-8433"
        title = "Nakitai Watashi wa Neko wo Kaburu"

        Entry {
            id = "A-MAL-41168"
            title = "Nakitai Watashi wa Neko wo Kaburu" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 41168 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42965 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 114963 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 41168 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Nakitai Watashi wa Neko wo Kaburu" // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Miyo Sasaki"
            // main girl pretty pog btw
            // i mean not as much as sena but whatever

            // cool story bro
            Visual(VisualKind.Animated, 0.6, 0.4)
            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 1, 1.hours + 44.minutes)
            AEI(0.1, Emotion.MP to 0.5, Emotion.CU to 0.5)
            FeatureMusic("M-VGMDB-AL-99082-1")
        }

        Entry {
            id = "M-VGMDB-AL-99082"
            title = "Hana ni Bourei / Yorushika" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.2, 0.3)

            SubIDEntry("1") {
                MusicConsumedProgress("4:00") // generated(fill_music_metadata.dart v0.1.1)
                title = "Hana ni Bourei" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.6)
            }
        }
    }
}
