package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.*

// imagine almost losing a contentless franchise xddddddddddddd
fun DSLScope.AOT() {
    Entry {
        title = "Shingeki no Kyojin"
        id = "F-VGMDB-2931"

        // please fuck off (look at the comment section)
        // https://www.youtube.com/watch?v=kbYoJNLQEiU
        NEI(-2.0, Emotion.AP) {
            contributors["A-MAL-16498"] = 0.1
            contributors["A-MAL-25777"] = 0.1
            contributors["A-MAL-35760"] = 0.1
            contributors["A-MAL-38524"] = 0.1
        }

        Entry {
            title = "Shingeki no Kyojin"
            id = "A-MAL-16498"
            bestGirl = "Ackerman Mikasa"
            Boredom(Boredom.Completed)
        }

        Entry {
            title = "Shingeki no Kyojin Season 2"
            id = "A-MAL-25777"
            bestGirl = "Ackerman Mikasa"
            Boredom(Boredom.Completed)
        }

        Entry {
            title = "Shingeki no Kyojin Season 3"
            id = "A-MAL-35760"
            bestGirl = "Ackerman Mikasa"
            Boredom(Boredom.Completed)
        }

        // this has more score than almost all love live animes
        // and almost the same score as sb69 stars wtf.

        // aged well lmfao after the seishun wa non-stop incident
        // xddddddddddddddddddddd
        Entry {
            title = "Shingeki no Kyojin Season 3 Part 2"
            id = "A-MAL-38524"
            bestGirl = "Ackerman Mikasa"
            Boredom(Boredom.Completed)
            AEI(5.0, Emotion.AP)
        }
    }
}

