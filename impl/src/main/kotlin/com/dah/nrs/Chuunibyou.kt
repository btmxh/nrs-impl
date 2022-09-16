package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.Chuunibyou() {
    Entry {
        id = "M-VGMDB-AR-12516"

        Contains("M-VGMDB-AL-42762")
    }

    Entry {
        id = "F-VGMDB-2330"
        title = "Chuunibyou demo Koi ga Shitai!"

        Entry {
            id = "M-VGMDB-AL-42762"

            Visual(VisualKind.AlbumArt, 0.6, 0.2)

            SubIDEntry("1") {
                Music(2.0)
                OsuSong(personal = 2.0)
            }
        }

        // this made me laugh my ass off
        AEI(7.5, Emotion.AP) {
            contributors["A-MAL-14741"] = 0.75
            // s2 has less comedy than s1
            // because le funny dead ppl pink-haired girl
            contributors["A-MAL-18671"] = 0.25
        }

        Entry {
            id = "A-MAL-14741"

            Visual(VisualKind.Animated, 0.6, 0.2)

            bestGirl = "Nibutani Shinka"
            // idk why
            // this is taken from NRS1
            Meme(0.15, 2)
            AnimeProgressOld(Boredom.Completed, 12)
        }

        Entry {
            id = "A-MAL-18671"
            bestGirl = "Nibutani Shinka"
            // Shichimiya dead people almost made me cry
            // YouTube link: https://www.youtube.com/watch?v=vFjJ6skYoxI
            AEI(10.0, Emotion.CU)
            // Shichimiya memes
            Meme(0.4, 10)
            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.6, 0.2)

            FeatureMusic("M-VGMDB-AL-42762-1")
        }

        Entry {
            id = "A-MAL-35608"
            bestGirl = "Nibutani Shinka"
            AnimeProgressOld(Boredom.Completed, 1)
            // movie is funny, but less content than s1 and s2
            // separate from s1/2 because it was watched later
            NEI(7.5, Emotion.AP)
            Visual(VisualKind.Animated, 0.6, 0.2)
        }
    }
}
