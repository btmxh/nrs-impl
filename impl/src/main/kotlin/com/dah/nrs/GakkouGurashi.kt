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
