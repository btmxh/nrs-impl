package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.BunnyGirlSenpai() {
    Entry {
        id = "F-VGMDB-6852"
        title = "Seishun Buta Yarou Series"

        Entry {
            id = "A-MAL-37450"
            title = "Seishun Buta Yarou wa Bunny Girl Senpai no Yume wo Minai"
            bestGirl = "Makinohara Shouko"

            Boredom(Boredom.Dropped)
            // plot kinda ok
            NEI(5.0, Emotion.AP)
            FeatureMusic("M-VGMDB-AL-80253-1")
        }

        Contains("M-VGMDB-AL-80253-1")
    }

    Entry {
        id = "M-VGMDB-AL-80253"
        title = "Kimi no Sei"

        SubIDEntry("1") {
            Music(1.0)
        }
    }
}