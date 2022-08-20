package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.Saekano() {
    Entry {
        id = "F-VGMDB-3305"
        title = "Saenai Heroine no Sodatekata"

        Entry {
            id = "M-VGMDB-AL-48199"
            title = "M♭"

            Visual(VisualKind.AlbumArt, 0.6, 0.4)

            SubIDEntry("1") {
                Music(2.0)
                OsuSong(personal = 1.0)
            }
        }

        Contains("M-VGMDB-AL-49446-1")

        WaifuUnknownPeriod("Megumi Kato", 90) {
            contributors["A-MAL-23277"] = 0.5
            contributors["A-MAL-30727"] = 0.5
        }
        Meme(0.5, 45) {
            contributors["A-MAL-23277"] = 0.5
            contributors["A-MAL-30727"] = 0.5
        }

        Entry {
            id = "A-MAL-23277"    // generated
            idMAL = 23277
            idAniList = 20657
            idAniDB = 10538
            idKitsu = 8406
            title = "Saenai Heroine no Sodatekata"
            bestGirl = "Megumi Kato"

            FeatureMusic("M-VGMDB-AL-48199-1")
            FeatureMusic("M-VGMDB-AL-49446-1")
            Boredom(Boredom.Completed)
            EHI()
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        Entry {
            id = "A-MAL-30727"    // generated
            idMAL = 30727
            idAniList = 21180
            idAniDB = 11221
            idKitsu = 10909
            title = "Saenai Heroine no Sodatekata ♭"
            bestGirl = "Megumi Kato"
            Boredom(Boredom.Completed)
            EHI()
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        Entry {
            id = "A-MAL-36885"    // generated
            idMAL = 36885
            idAniList = 100675
            idAniDB = 13626
            idKitsu = 14050
            title = "Saenai Heroine no Sodatekata Fine"
            bestGirl = "Megumi Kato"
            // humor
            NEI(2.5, Emotion.AP)
            Boredom(Boredom.Completed)
            Visual(VisualKind.Animated, 0.55, 0.3)
        }
    }

    Entry {
        id = "M-10"
        title = "Colorful. (Asterisk DnB Remix)"

        Music(2.75)
    }

    Entry {
        id = "M-11"
        title = "Colorful. (kamaboko remix)"

        Music(3.0)
    }
}
