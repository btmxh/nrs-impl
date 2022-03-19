package com.dah.nrs

fun GenerateScope.SelePro() {
    Entry {
        id = "F-VGMDB-9703"
        title = "SELECTION PROJECT"

        Entry {
            id = "A-MAL-44275"
            title = "SELECTION PROJECT"

            Cry(Emotion.CU)
            Boredom(Boredom.Completed)

            KilledBy("F-VGMDB-7059")
        }

        Entry {
            id = "M-51"
            title = "9-tie"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-114102")
            }
        }

        Entry {
            id = "M-VGMDB-AL-114102"
            title = "SELECTION PROJECT Main Theme Song CD"

            SubIDEntry("1", "Glorious Days") {
                Music(5.0)
            }
        }
    }
}