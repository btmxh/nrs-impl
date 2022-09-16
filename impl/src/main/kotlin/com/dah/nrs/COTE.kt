package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.COTE() {
    Entry {
        id = "F-VGMDB-11581"
        title = "Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e"

        AKMEraPart2(0.6) {
            contributors["A-MAL-35507"] = 0.5
            contributors["A-MAL-51096"] = 0.5
        }

        AKMEraPart3(0.3) {
            contributors["A-MAL-35507"] = 0.5
            contributors["A-MAL-51096"] = 0.5
        }

        Entry {
            id = "A-MAL-35507"

            bestGirl = "Horikita Suzune"
            // no fuckign way she is VA'd by the glorious akari kito

            Visual(VisualKind.Animated, 0.75, 0.2)
            // plot pretty good
            AEI(5.0, Emotion.AP)
        }

        Entry {
            id = "A-MAL-51096"

            bestGirl = "Sakayanagi Arisu"
            // no fuckign way they also got the "asuiro koi moyou 3537 rosia-chan" girl
            // nice b8 m8

            // you love arisu because she's a loli
            // i love her because akm bs
            // we are not the same
            // (trust me u don't want us to be the same lmfao)

            AnimeProgressOld(Boredom.Watching, 11)
            // a lil bit worse than s1 (but still not that bad)
            Visual(VisualKind.Animated, 0.6, 0.2)

            // plot will be good
            AEI(1.0, Emotion.AP)
            KilledBy("F-VGMDB-4499", potential = 0.5, effect = 0.1)
            KilledBy("M-VGMDB-AL-76155-2", potential = 0.5, effect = 0.75)
        }
    }
}
