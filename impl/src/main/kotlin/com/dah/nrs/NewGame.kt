package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.NewGame() {
    Entry {
        id = "F-VGMDB-4168"
        title = "NEW GAME!"

        // humor
        AEI(2.5, Emotion.AP) {
            contributors["A-MAL-31953"] = 0.5
            contributors["A-MAL-34914"] = 0.5
        }

        Meme(0.2, 2) {
            contributors["A-MAL-31953"] = 0.5
            contributors["A-MAL-34914"] = 0.5
        }

        InterestField(true) {
            contributors["A-MAL-31953"] = 0.25
            contributors["A-MAL-34914"] = 0.25
            contributors["A-MAL-13759"] = 0.5
        }

        Entry {
            id = "A-MAL-31953"
            // idk who is better, aoba or yun, so one girl each season
            bestGirl = "Iijima Yun"

            Visual(VisualKind.Animated, 0.7, 0.3)

            FeatureMusic("M-VGMDB-AL-58627-1")
        }

        Entry {
            id = "A-MAL-34914"
            // idk who is better, aoba or yun, so one girl each season
            bestGirl = "Suzukaze Aoba"

            Visual(VisualKind.Animated, 0.7, 0.3)

            FeatureMusic("M-VGMDB-AL-68225-1")
        }

        Entry {
            id = "M-46"
            title = "fourfolium"
            ValidatorSuppress("dah-entry-no-consumed")

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-58627")
                Contains("M-VGMDB-AL-68225")
            }
        }

        Entry {
            id = "M-VGMDB-AL-58627"

            Visual(VisualKind.AlbumArt, 0.7, 0.3)
            SubIDEntry("1") {
                Music(4.0)
                OsuSong(personal = 4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-68225"

            Visual(VisualKind.AlbumArt, 0.7, 0.3)
            SubIDEntry("1") {
                // mankai step by step
                // this song is legendary af
                Music(5.0)
                OsuSong(personal = 8.0)
            }
        }
    }
}
