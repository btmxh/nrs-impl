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
            title = "Egao no Daika" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38544 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42001 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 104674 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38544 // generated(fill_anime_metadata.dart v0.1.1)

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
            title = "Egao no Kanata / Chiho feat. majiko" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.5, 0.3)
            SubIDEntry("1") {
                title = "Egao no Kanata" // generated(fill_music_metadata.dart v0.1.1)
                // Length source: https://osu.ppy.sh/beatmapsets/1048878#osu/2192351
                MusicConsumedProgress("3:50") // impl_overridden
                Music(0.5)
                OsuSong(personal = 0.25, community = 0.0)
            }
        }
    }
}
