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

            `K-OnVisual`(VisualKind.AlbumArt)

            SubIDEntry("2") {

                // binfy's favorite osu! beatmap + sotarks made a map for him XDDDDD
                Meme(0.1, 6)
                Music(2.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-21146"

            `K-OnVisual`(VisualKind.AlbumArt)

            SubIDEntry("9") {

                Music(0.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-22848"

            `K-OnVisual`(VisualKind.AlbumArt)

            SubIDEntry("2") {
                Music(1.0)
            }
        }

        Entry {
            id = "M-VGMDB-AR-8870"

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
            bestGirl = "Nakano Azusa"

            Progress(Boredom.CompletedWithNoticeableBoredom)
            `K-OnVisual`(VisualKind.Animated)
        }

        Entry {
            id = "A-MAL-7791"
            bestGirl = "Nakano Azusa"

            Progress(Boredom.CompletedWithNoticeableBoredom)
            FeatureMusic("M-VGMDB-AL-21146-9")
            FeatureMusic("M-VGMDB-AL-22848-2")
            `K-OnVisual`(VisualKind.Animated)
        }

        Entry {
            id = "A-MAL-9617"
            bestGirl = "Nakano Azusa"

            Progress(Boredom.CompletedWithNoticeableBoredom)
            FeatureMusic("M-VGMDB-AL-21146-9")
            `K-OnVisual`(VisualKind.Animated)
        }
    }
}
