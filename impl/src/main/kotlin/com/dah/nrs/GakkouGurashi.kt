package com.dah.nrs

fun GenerateBlock.GakkouGurashi() {
    Entry {
        id = "F-VGMDB-4000"
        title = "Gakkougurashi!"

        Entry {
            id = "M-VGMDB-AL-52993"
            title = "Friend Shitai"

            SubIDEntry("1") {
                Music(3.0)
                OsuSong(personal = 5.0)
            }
        }

        Entry {
            id = "M-44"
            title = "Gakuen Seikatsubu"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-52993")
            }
        }

        Entry {
            id = "M-VGMDB-AL-53719"
            title = "SCHOOL-LIVE! Character Song 4 / Miki Naoki (CV. Rie Takahashi) & Kurumi Ebisuzawa (CV. Ari Ozawa)"

            SubIDEntry("1", "Unhappy End World") {
                Music(5.0)
            }
        }

        Entry {
            id = "A-MAL-24765"
            title = "Gakkougurashi!"

            bestGirl = "Sakura Megumi"
            // rip Megu-nee
            Cry(Emotion.CU)
            Meme(0.2, Meme.M4_7Days)
            FeatureMusic("M-VGMDB-AL-52993-1")

            Boredom(Boredom.Completed)
        }
    }
}
