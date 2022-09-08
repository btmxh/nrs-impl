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

            Visual(VisualKind.AlbumArt, 0.65, 0.3)

            SubIDEntry("1") {
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

            Visual(VisualKind.AlbumArt, 0.6, 0.25)

            SubIDEntry("1") {
                Music(5.0)
            }
        }

        Entry {
            id = "A-MAL-24765"
            title = "Gakkougurashi!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 24765 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 8644 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20754 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 24765 // generated(fill_anime_metadata.dart v0.1.1)

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
