package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

fun DSLScope.LoveLab() {
    Entry {
        id = "F-VGMDB-2520"
        title = "Love Lab"

        Entry {
            id = "A-MAL-16353"

            bestGirl = "Riko Kurahashi"

            Visual(VisualKind.Animated, 0.5, 0.3)
            AnimeConsumedProgress(EntryStatus.Completed, 0.9, 12)
            NEI(0.5, Emotion.AP)
            FeatureMusic("M-VGMDB-AL-40263-1")
        }

        Entry {
            id = "M-VGMDB-AL-40263"
            title = "Love Lab Vol.2 Bonus CD" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.1, 0.2)
            SubIDEntry("1") {
                title = "Best FriendS" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:32") // generated(fill_music_metadata.dart v0.1.1)
                Music(0.4)
                OsuSong(personal = 0.7, community = 0.8)
            }
        }
    }
}
