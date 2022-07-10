package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.COTE() {
    Entry {
        id = "F-VGMDB-11581"
        title = "Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e"

        Entry {
            id = "A-MAL-35507"
            title = "Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e (TV)"

            bestGirl = "Horikita Suzune"
            // no fuckign way she is VA'd by the glorious akari kito

            Boredom(Boredom.Completed)
            // plot pretty good
            AEI(5.0, Emotion.AP)
        }

        Entry {
            id = "A-MAL-51096"
            title = "Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e (TV) 2nd Season"

            bestGirl = "Sakayanagi Arisu"
            // no fuckign way they also got the "asuiro koi moyou 3537 rosia-chan" girl
            Boredom(Boredom.Watching)

            // plot will be good
//            AEI(5.0, Emotion.AP)
        }
    }
}