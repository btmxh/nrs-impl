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
        NEI(7.5, Emotion.AP) {
            contributors["A-MAL-23277"] = 0.5
            contributors["A-MAL-30727"] = 0.5
        }
        Meme(0.5, 45) {
            contributors["A-MAL-23277"] = 0.5
            contributors["A-MAL-30727"] = 0.5
        }

        Entry {
            id = "A-MAL-23277"
            title = "Saenai Heroine no Sodatekata"

            FeatureMusic("M-VGMDB-AL-48199-1")
            FeatureMusic("M-VGMDB-AL-49446-1")
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-30727"
            title = "Saenai Heroine no Sodatekata ♭"
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-36885"
            title = "Saenai Heroine no Sodatekata Fine"
            // humor
            NEI(1.25, Emotion.AP)
            Boredom(Boredom.Completed)
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
