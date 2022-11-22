package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours

fun DSLScope.CloverDays() {
    Entry {
        id = "F-20221122T195753"
        title = "Clover Day's"

        Entry {
            id = "V-VNDB-13325"
            title = "Clover Day's"
            bestGirl = "Rindou Tsubame"
            // anri and [anzu] is cute too ig
            // hekiru ngl is also good
            // i think this is the best char design vn ever idk
            // so many routes to choose lol

            ConsumedProgress(EntryStatus.Watching, 1.0, 3.hours)
            Visual(VisualKind.VisualNovel, 0.6, 0.4)
            NEI(0.5, Emotion.MP)
            NEI(0.25, Emotion.AP)
            FeatureMusic("M-VGMDB-AL-45544-40")
        }

        Entry {
            id = "M-VGMDB-AL-45544"
            title = "Clover Day's ORIGINAL SOUNDTRACKS" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.6, 0.4)

            SubIDEntry("40") {
                MusicConsumedProgress("4:32") // generated(fill_music_metadata.dart v0.1.1)
                title = "Clover Day's full ver." // generated(fill_music_metadata.dart v0.1.1)
                Music(0.5)
                OsuSong(personal = 0.8, community = 0.2)
            }
        }
    }
}
