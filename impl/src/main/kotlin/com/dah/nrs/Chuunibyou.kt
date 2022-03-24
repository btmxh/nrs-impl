package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.Chuunibyou() {
    Entry {
        id = "M-VGMDB-AR-12516"
        title = "ZAQ"

        Contains("M-VGMDB-AL-42762")
    }

    Entry {
        id = "F-VGMDB-2330"
        title = "Chuunibyou demo Koi ga Shitai!"

        Entry {
            id = "M-VGMDB-AL-42762"
            title = "VOICE"

            SubIDEntry("1") {
                Music(2.0)
                OsuSong(personal = 2.0)
            }
        }

        // this made me laugh my ass off
        NEI(7.5, Emotion.AP) {
            contributors["A-MAL-14741"] = 0.75
            // s2 has less comedy than s1
            // because le funny dead ppl pink-haired girl
            contributors["A-MAL-18671"] = 0.25
        }

        Entry {
            id = "A-MAL-14741"
            title = "Chuunibyou demo Koi ga Shitai!"

            bestGirl = "Nibutani Shinka"
            // idk why
            // this is taken from NRS1
            Meme(0.15, Meme.M1_3Days)
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-18671"
            title = "Chuunibyou demo Koi ga Shitai! Ren"
            bestGirl = "Nibutani Shinka"
            // Shichimiya dead people almost made me cry
            // YouTube link: https://www.youtube.com/watch?v=vFjJ6skYoxI
            AEI(10.0, Emotion.CU)
            // Shichimiya memes
            Meme(0.4, Meme.M1_2Weeks)
            Boredom(Boredom.Completed)

            FeatureMusic("M-VGMDB-AL-42762-1")
        }

        Entry {
            id = "A-MAL-35608"
            title = "Chuunibyou demo Koi ga Shitai! Movie: Take On Me"
            bestGirl = "Nibutani Shinka"
            Boredom(Boredom.Completed)
            // movie is funny, but less content than s1 and s2
            // separate from s1/2 because it was watched later
            NEI(2.5, Emotion.AP)
        }
    }
}
