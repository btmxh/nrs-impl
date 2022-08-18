package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.*

// imagine losing to a contentless franchise xddddddddddddd
fun DSLScope.AOT() {
    Entry {
        title = "Shingeki no Kyojin"
        id = "F-VGMDB-2931"

        // please fuck off (look at the comment section)
        // https://www.youtube.com/watch?v=kbYoJNLQEiU
        NEI(-1.0, Emotion.AP) {
            contributors["A-MAL-16498"] = 0.25
            contributors["A-MAL-25777"] = 0.25
            contributors["A-MAL-35760"] = 0.25
            contributors["A-MAL-38524"] = 0.25
        }

        Entry {
            title = "Shingeki no Kyojin"
            id = "A-MAL-16498"
            bestGirl = "Ackerman Mikasa"
            Boredom(Boredom.Completed)
            Visual(VisualKind.Animated, 0.2, 0.6)
        }

        Entry {
            title = "Shingeki no Kyojin Season 2"
            id = "A-MAL-25777"
            bestGirl = "Ackerman Mikasa"
            Boredom(Boredom.Completed)
            Visual(VisualKind.Animated, 0.2, 0.6)
        }

        Entry {
            title = "Shingeki no Kyojin Season 3"
            id = "A-MAL-35760"
            bestGirl = "Ackerman Mikasa"
            Boredom(Boredom.Completed)
            Visual(VisualKind.Animated, 0.2, 0.6)
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
            Visual(VisualKind.Animated, 0.2, 0.6)
        }
    }
}

