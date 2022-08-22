package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.COTE() {
    Entry {
        id = "F-VGMDB-11581"
        title = "Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e"

        Entry {
            id = "A-MAL-35507"    // generated
            idMAL = 35507
            idAniList = 98659
            idAniDB = 13153
            idKitsu = 13503
            title = "Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e (TV)"

            bestGirl = "Horikita Suzune"
            // no fuckign way she is VA'd by the glorious akari kito

            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.75, 0.2)
            // plot pretty good
            AEI(5.0, Emotion.AP)
        }

        Entry {
            id = "A-MAL-51096"    // generated
            idMAL = 51096
            idAniList = 145545
            idAniDB = 17208
            idKitsu = 45925
            title = "Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e (TV) 2nd Season"

            bestGirl = "Sakayanagi Arisu"
            // no fuckign way they also got the "asuiro koi moyou 3537 rosia-chan" girl

            // you love arisu because she's a loli
            // i love her because akm bs
            // we are not the same
            // (trust me u don't want us to be the same lmfao)

            Progress(Boredom.Watching, 7)
            // a lil bit worse than s1 (but still not that bad)
            Visual(VisualKind.Animated, 0.6, 0.2)

            // plot will be good
            AEI(1.0, Emotion.AP)
            KilledBy("F-VGMDB-4499", potential = 0.5, effect = 0.1)
            KilledBy("M-VGMDB-AL-76155-2", potential = 0.5, effect = 0.75)
        }
    }
}