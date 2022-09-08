package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.GakkouGurashi() {
    Entry {
        id = "F-VGMDB-4000"
        title = "Gakkougurashi!"

        Entry {
            id = "M-VGMDB-AL-52993"
            title = "Friend Shitai / Gakuen Seikatsubu" // generated by fill_metadata.dart v0.1.1

            Visual(VisualKind.AlbumArt, 0.65, 0.3)

            SubIDEntry("1") {
                title = "Friend Shitai" // generated by fill_metadata.dart v0.1.1
                Music(3.0)
                OsuSong(personal = 5.0)
            }
        }

        Entry {
            id = "M-44"
            title = "Gakuen Seikatsubu"

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-52993")
            }
        }

        Entry {
            id = "M-VGMDB-AL-53719"
            title = "TV Anime \"Gakkou Gurashi!\" Character Song 4 / Miki Naoki (CV. Rie Takahashi) & Kurumi Ebisuzawa (CV. Ari Ozawa)" // generated by fill_metadata.dart v0.1.1

            Visual(VisualKind.AlbumArt, 0.6, 0.25)

            SubIDEntry("1", "Unhappy End World") {
                title = "アンハッピーエンドワールド" // generated by fill_metadata.dart v0.1.1
                Music(5.0)
            }
        }

        Entry {
            id = "A-MAL-24765"    // generated
            idMAL = 24765
            idAniList = 20754
            idAniDB = 10697
            idKitsu = 8644
            title = "Gakkougurashi!"

            bestGirl = "Sakura Megumi"
            // rip Megu-nee
            Cry(Emotion.CU)
            Meme(0.2, 6)
            FeatureMusic("M-VGMDB-AL-52993-1")

            Visual(VisualKind.Animated, 0.6, 0.25)

            Progress(Boredom.Completed)
        }
    }
}
