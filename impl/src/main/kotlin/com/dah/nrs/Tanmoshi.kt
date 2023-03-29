package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.Tanmoshi() {
    Entry {
        id = "F-VGMDB-9850"
        title = "Tantei wa Mou, Shindeiru."

        Entry {
            id = "A-MAL-46471"
            title = "Tantei wa Mou, Shindeiru." // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 46471 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44022 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 128712 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 46471 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Nagisa Natsunagi" // generated(generate_best_girls.dart v0.1.0)

            // siesta arc is shit
            // cope
            Visual(VisualKind.Animated, 0.5, 0.3)
            AnimeConsumedProgress(EntryStatus.Completed, 0.6, 12)
            FeatureMusic("M-VGMDB-AL-113531")
            FeatureMusic("M-VGMDB-AL-113660")
            KilledBy("A-MAL-41530", 0.2, 0.5)
        }

        // Kano's friend's album lol
        Entry {
            id = "M-VGMDB-AL-113531"
            title = "Kodou / Nanakagura" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.5, 0.3)
            SubIDEntry("1") {
                MusicConsumedProgress("4:31") // generated(fill_music_metadata.dart v0.1.1)
                title = "Kodou" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.4)
            }
        }

        Entry {
            id = "M-VGMDB-AL-113660"
            title = "Koko de Ikiteru / mary & jon-YAKITORY" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.5, 0.3)
            SubIDEntry("1") {
                MusicConsumedProgress("3:22") // generated(fill_music_metadata.dart v0.1.1)
                title = "Koko de Ikiteru" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.4)
            }
        }
    }
}
