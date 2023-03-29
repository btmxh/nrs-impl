package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.ImoutoIreba() {
    Entry {
        id = "F-VGMDB-5485"
        title = "Imouto sae Ireba Ii."

        Entry {
            id = "A-MAL-35413"
            title = "Imouto sae Ireba Ii." // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 35413 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 11207 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 98596 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 35413 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Miyako Shirakawa" // generated(generate_best_girls.dart v0.1.0)

            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 12)
            Visual(VisualKind.Animated, 0.6, 0.2)
            NEI(0.5, Emotion.AP)
            FeatureMusic("M-VGMDB-AL-70621-1")
            GateOpen("F-VGMDB-3275")
        }

        Entry {
            id = "M-VGMDB-AL-70621"
            title = "Ashita no Kimi sae Ireba Ii. / ChouCho" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.5, 0.2)

            SubIDEntry("1") {
                MusicConsumedProgress("5:04") // generated(fill_music_metadata.dart v0.1.1)
                title = "Ashita no Kimi sae Ireba Ii." // generated(fill_music_metadata.dart v0.1.1)
                Music(0.6);
                OsuSong(personal = 0.5, community = 0.1)
            }
        }
    }
}
