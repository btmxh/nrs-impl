package com.dah.nrs

fun GenerateBlock.KobayashiMaidDragon() {
    Entry {
        id = "F-VGMDB-8954"
        title = "Kobayashi-san Chi no Maid Dragon"

        Entry {
            id = "M-VGMDB-AL-62516"
            title = "Aozora no Rhapsody"

            SubIDEntry("1") {
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-110219"
            title = "Ai no Supreme!"

            SubIDEntry("1") {
                Music(4.0)
                // "why is the dude singing???" - some pp mapper
                Meme(0.05, Meme.M4_7Days)
            }
        }

        Entry {
            id = "A-MAL-33206"
            title = "Kobayashi-san Chi no Maid Dragon"
            bestGirl = "Tohru"

            // funny ig idk tbh
            NEI(7.5, Emotion.AP)

            Boredom(Boredom.Completed)
            FeatureMusic("M-VGMDB-AL-62516-1")
        }
    }
}