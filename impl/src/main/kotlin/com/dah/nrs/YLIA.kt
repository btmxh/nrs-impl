package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.YLIA() {
    Entry {
        id = "F-VGMDB-3345"
        title = "Shigatsu wa Kimi no Uso"

        Entry {
            id = "A-MAL-23273"    // generated
            idMAL = 23273
            idAniList = 20665
            idAniDB = 10539
            idKitsu = 8403
            title = "Shigatsu wa Kimi no Uso"

            bestGirl = "Miyazono Kaori"

            // YLIA is watched during the SLN days (Second-Love-Ngoc era),
            // this has lead to the connection between myself and the
            // characters.
            // This is why this anime is so sad that it achieve the maximum
            // score for an impact (weighted ofc)
            PADS(999, Emotion.CU)
            Cry(Emotion.CU)

            // The character development of Kousei Arima is connected to the
            // Personality Revolution (a result of SLN). This is why I also
            // feel hype when stuff happens. And I cried to that.
            // No PADS since it's overshadowed by the sad impact.
            Cry(Emotion.CP)

            // Also the anime itself without these historical events are still
            // very good. It's not just lucky

            // no memes because SLN era has no memes
            // it's just lIeN qUAn mOBiLe and dumb trendy shit

            FeatureMusic("M-VGMDB-AL-49046-1")
            FeatureMusic("M-VGMDB-AL-49046-18")

            Visual(VisualKind.Animated, 0.3, 0.5)

            Boredom(Boredom.Completed)
        }

        Entry {
            id = "M-VGMDB-AL-49046"
            title = "Shigatsu wa Kimi no Uso ORIGINAL SONG & SOUNDTRACK"

            Visual(VisualKind.AlbumArt, 0.4, 0.5)
            SubIDEntry("1", "Kimi wa Wasurerareru no") {
                Music(3.0)
                AEI(5.0, Emotion.CU)
            }

            SubIDEntry("18", "Yuujin A-kun wo Watashi no Bansousha ni Ninmeishimasu") {
                Music(3.0)
                AEI(5.0, Emotion.CU)
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-9069"
        title = "Yokoyama Masaru"

        Contains("M-VGMDB-AL-49046")
    }
}
