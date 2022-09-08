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
            title = "Saenai heroine no sodate-kata Character Image Song M♭ / Megumi Kato" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.6, 0.4)

            SubIDEntry("1") {
                title = "M♭" // generated(fill_music_metadata.dart v0.1.1)
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

        // domestic kanojo war arc
        Meme(0.75, 90) {
            contributors["A-MAL-23277"] = 0.5
            contributors["A-MAL-30727"] = 0.5
        }

        Entry {
            id = "A-MAL-23277"
            title = "Saenai Heroine no Sodatekata" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 23277 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 8406 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20657 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 23277 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Megumi Kato"

            FeatureMusic("M-VGMDB-AL-48199-1")
            FeatureMusic("M-VGMDB-AL-49446-1")
            Progress(Boredom.Completed)
            EHI()
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        Entry {
            id = "A-MAL-30727"
            title = "Saenai Heroine no Sodatekata ♭" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 30727 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 10909 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21180 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 30727 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Megumi Kato"
            Progress(Boredom.Completed)
            EHI()
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        Entry {
            id = "A-MAL-36885"
            title = "Saenai Heroine no Sodatekata Fine" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 36885 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 14050 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 100675 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 36885 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Megumi Kato"
            // humor
            NEI(2.5, Emotion.AP)
            Progress(Boredom.Completed)
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
