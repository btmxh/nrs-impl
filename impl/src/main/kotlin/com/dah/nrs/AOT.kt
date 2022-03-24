package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.Boredom
import com.dah.nrs.exts.Completed
import com.dah.nrs.exts.Emotion
import com.dah.nrs.exts.NEI

// imagine almost losing a contentless franchise xddddddddddddd
fun DSLScope.AOT() {
    Entry {
        title = "Shingeki no Kyojin"
        id = "F-VGMDB-2931"

        Entry {
            title = "Shingeki no Kyojin"
            id = "A-MAL-16498"
            bestGirl = "Ackerman Mikasa"
            Boredom(Boredom.Completed)
            NEI(1.0, Emotion.AP)
        }

        Entry {
            title = "Shingeki no Kyojin Season 2"
            id = "A-MAL-25777"
            bestGirl = "Ackerman Mikasa"
            Boredom(Boredom.Completed)
            NEI(1.5, Emotion.AP)
        }

        Entry {
            title = "Shingeki no Kyojin Season 3"
            id = "A-MAL-35760"
            bestGirl = "Ackerman Mikasa"
            Boredom(Boredom.Completed)
            NEI(1.5, Emotion.AP)
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
            NEI(10.0, Emotion.AP)
        }
    }
}

