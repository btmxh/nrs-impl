package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.NagiAsu() {
    Entry {
        id = "F-VGMDB-2662"
        title = "Nagi no Asu kara"

        Contains("M-VGMDB-AL-41278-1")
        Contains("M-VGMDB-AL-41280-1")
        Contains("M-VGMDB-AL-42900-1")
        Contains("M-VGMDB-AL-42900-3")
        Contains("M-VGMDB-AL-43164-1")

        Entry {
            id = "M-VGMDB-AL-45187"
            title = "Nagi no Asukara Character Song CD3" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.4)
            SubIDEntry("1") {
                MusicConsumedProgress("4:22") // generated(fill_music_metadata.dart v0.1.1)
                title = "ripple ~my first love~" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.6)
            }
        }

        Entry {
            id = "A-MAL-16067"
            title = "Nagi no Asu kara" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 16067 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 7370 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 16067 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 16067 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Miuna Shiodome" // generated(generate_best_girls.dart v0.1.0)
            // poor best girl
            MaxAEIPADS(2, Emotion.CU)

            // there are other relationships other than the
            // love triangle of best girl and they did make
            // an impact
            NEI(0.75, Emotion.CU)

            WaifuUnknownPeriod("Shiodome Miuna", 90)
            Visual(VisualKind.Animated, 0.6, 0.6)

            Meme(0.7, 25)

            AnimeProgressOld(Boredom.Completed, 26)

            FeatureMusic("M-VGMDB-AL-41278-1")
            FeatureMusic("M-VGMDB-AL-41280-1")
            FeatureMusic("M-VGMDB-AL-42900-1")
            FeatureMusic("M-VGMDB-AL-42900-3")
            FeatureMusic("M-VGMDB-AL-43164-1")
            FeatureMusic("M-VGMDB-AL-45187")
        }
    }
}
