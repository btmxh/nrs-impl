package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.`K-On`() {
    Entry {
        id = "F-VGMDB-504"
        title = "K-On!"

        Entry {
            id = "M-VGMDB-AL-20118"
            title = "Utauyo!!MIRACLE"

            SubIDEntry("2") {
                title = "Kira Kira Days"

                // binfy's favorite osu! beatmap + sotarks made a map for him XDDDDD
                Meme(0.1, 6)
                Music(2.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-21146"
            title = "HO-KAGO TEA TIME Second"

            SubIDEntry("9") {
                title = "Tenshi ni Fureta yo!"

                Music(0.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-22848"
            title = "Gohan wa Okazu/U&I"

            SubIDEntry("2", "U&I") {
                Music(1.0)
            }
        }

        Entry {
            id = "M-VGMDB-AR-8870"
            title = "HO-KAGO TEA TIME"

            Contains(ImageVocalContainFactor) {
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
            title = "K-On!"
            bestGirl = "Nakano Azusa"

            Boredom(Boredom.CompletedWithNoticeableBoredom)
        }

        Entry {
            id = "A-MAL-7791"
            title = "K-On!!"
            bestGirl = "Nakano Azusa"

            Boredom(Boredom.CompletedWithNoticeableBoredom)
            FeatureMusic("M-VGMDB-AL-21146-9")
            FeatureMusic("M-VGMDB-AL-22848-2")
        }

        Entry {
            id = "A-MAL-9617"
            title = "K-On! Movie"

            Boredom(Boredom.CompletedWithNoticeableBoredom)
            FeatureMusic("M-VGMDB-AL-21146-9")
        }
    }
}