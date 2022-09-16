package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

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
                title = "Kirakira Days" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("3:40") // generated(fill_music_metadata.dart v0.1.1)

                // binfy's favorite osu! beatmap + sotarks made a map for him XDDDDD
                Meme(0.1, 6)
                Music(2.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-21146"
            title = "HO-KAGO TEA TIME Second / HO-KAGO TEA TIME" // generated(fill_music_metadata.dart v0.1.1)

            `K-OnVisual`(VisualKind.AlbumArt)

            SubIDEntry("9") {
                title = "Tenshi ni Fureta yo!" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:42") // generated(fill_music_metadata.dart v0.1.1)

                Music(0.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-22848"
            title = "Gohan wa Okazu/U&I / HO-KAGO TEA TIME" // generated(fill_music_metadata.dart v0.1.1)

            `K-OnVisual`(VisualKind.AlbumArt)

            SubIDEntry("2") {
                title = "U&I" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:36") // generated(fill_music_metadata.dart v0.1.1)
                Music(1.0)
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
        NEI(5.0, Emotion.MP) {
            contributors["A-MAL-5680"] = 0.4
            contributors["A-MAL-7791"] = 0.4
            contributors["A-MAL-9617"] = 0.2
        }

        // humor
        NEI(2.5, Emotion.AP) {
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
            bestGirl = "Nakano Azusa"

            AnimeProgressOld(Boredom.CompletedWithNoticeableBoredom, 13)
            `K-OnVisual`(VisualKind.Animated)
        }

        Entry {
            id = "A-MAL-7791"
            title = "K-On!!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 7791 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 5124 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 7791 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 7791 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Nakano Azusa"

            AnimeProgressOld(Boredom.CompletedWithNoticeableBoredom, 26)
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
            bestGirl = "Nakano Azusa"

            AnimeProgressOld(Boredom.CompletedWithNoticeableBoredom, 1)
            FeatureMusic("M-VGMDB-AL-21146-9")
            `K-OnVisual`(VisualKind.Animated)
        }
    }
}
