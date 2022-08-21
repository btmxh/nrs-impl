package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.KobayashiMaidDragon() {
    Entry {
        id = "F-VGMDB-8954"
        title = "Kobayashi-san Chi no Maid Dragon"

        Entry {
            id = "M-VGMDB-AL-62516"
            title = "Aozora no Rhapsody"

            Visual(VisualKind.AlbumArt, 0.6, 0.3)

            SubIDEntry("1") {
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-110219"
            title = "Ai no Supreme!"

            Visual(VisualKind.AlbumArt, 0.65, 0.3)

            SubIDEntry("1") {
                Music(4.0)
                // "why is the dude singing???" - some pp mapper
                Meme(0.05, 6)
            }
        }

        Entry {
            id = "A-MAL-33206"    // generated
            idMAL = 33206
            idAniList = 21776
            idAniDB = 12091
            idKitsu = 12243
            title = "Kobayashi-san Chi no Maid Dragon"
            bestGirl = "Tohru"

            // funny ig idk tbh
            NEI(7.5, Emotion.AP)

            Visual(VisualKind.Animated, 0.6, 0.3)

            Progress(Boredom.Completed)
            FeatureMusic("M-VGMDB-AL-62516-1")
        }
    }
}