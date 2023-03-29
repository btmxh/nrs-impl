package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

private fun AcceptImpact.`K-OnVisual`(kind: VisualKind) {
    Visual(kind, 0.65, 0.2)
}

fun DSLScope.`K-On`() {
    Entry {
        id = "F-VGMDB-504"
        title = "K-On!"

        Entry {
            id = "M-VGMDB-AL-20118"
            title = "Utauyo!!MIRACLE / HO-KAGO TEA TIME" // generated(fill_music_metadata.dart v0.1.1)

            `K-OnVisual`(VisualKind.AlbumArt)

            SubIDEntry("2") {
                MusicConsumedProgress("3:40") // generated(fill_music_metadata.dart v0.1.1)
                title = "Kirakira Days" // generated(fill_music_metadata.dart v0.1.1)

                // binfy's favorite osu! beatmap + sotarks made a map for him XDDDDD
                Meme(0.1, 6)
                Music(0.25)
            }
        }

        Entry {
            id = "M-VGMDB-AL-21146"
            title = "HO-KAGO TEA TIME Second / HO-KAGO TEA TIME" // generated(fill_music_metadata.dart v0.1.1)

            `K-OnVisual`(VisualKind.AlbumArt)

            SubIDEntry("9") {
                MusicConsumedProgress("4:42") // generated(fill_music_metadata.dart v0.1.1)
                title = "Tenshi ni Fureta yo!" // generated(fill_music_metadata.dart v0.1.1)

                Music(0.05)
            }
        }

        Entry {
            id = "M-VGMDB-AL-22848"
            title = "Gohan wa Okazu/U&I / HO-KAGO TEA TIME" // generated(fill_music_metadata.dart v0.1.1)

            `K-OnVisual`(VisualKind.AlbumArt)

            SubIDEntry("2") {
                MusicConsumedProgress("4:36") // generated(fill_music_metadata.dart v0.1.1)
                title = "U&I" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.1)
            }
        }

        Entry {
            id = "M-VGMDB-AR-8870"
            title = "HO-KAGO TEA TIME" // generated(fill_music_metadata.dart v0.1.1)

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-20118")
                Contains("M-VGMDB-AL-21146")
                Contains("M-VGMDB-AL-22848")
            }
        }

        // Kinda comfy. But not that much.
        NEI(0.5, Emotion.MP) {
            contributors["A-MAL-5680"] = 0.4
            contributors["A-MAL-7791"] = 0.4
            contributors["A-MAL-9617"] = 0.2
        }

        // humor
        NEI(0.25, Emotion.AP) {
            contributors["A-MAL-5680"] = 0.4
            contributors["A-MAL-7791"] = 0.4
            contributors["A-MAL-9617"] = 0.2
        }

        Meme(0.5, 120) {
            contributors["A-MAL-5680"] = 0.35
            contributors["A-MAL-7791"] = 0.35
            contributors["A-MAL-9617"] = 0.15
            contributors["A-MAL-32281"] = 0.15
        }

        Entry {
            id = "A-MAL-5680"
            title = "K-On!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 5680 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 4240 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 5680 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 5680 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Azusa Nakano" // generated(generate_best_girls.dart v0.1.0)

            AnimeConsumedProgress(EntryStatus.Completed, 0.6, 12)
            `K-OnVisual`(VisualKind.Animated)
        }

        Entry {
            id = "A-MAL-7791"
            title = "K-On!!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 7791 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 5124 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 7791 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 7791 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Azusa Nakano" // generated(generate_best_girls.dart v0.1.0)

            AnimeConsumedProgress(EntryStatus.Completed, 0.6, 26)
            FeatureMusic("M-VGMDB-AL-21146-9")
            FeatureMusic("M-VGMDB-AL-22848-2")
            `K-OnVisual`(VisualKind.Animated)
        }

        Entry {
            id = "A-MAL-9617"
            title = "K-On! Movie" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 9617 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 5810 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 9617 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 9617 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Azusa Nakano" // generated(generate_best_girls.dart v0.1.0)

            AnimeConsumedProgress(EntryStatus.Completed, 0.85, 1, 1.hours + 50.minutes)
            FeatureMusic("M-VGMDB-AL-21146-9")
            `K-OnVisual`(VisualKind.Animated)
        }
    }
}
