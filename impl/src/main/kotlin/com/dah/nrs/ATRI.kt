package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.ATRI() {
    // the funny visual novel that got fucked by e2e lmfao
    Entry {
        id = "F-VGMDB-8817"
        title = "ATRI -My Dear Moments-"

        Entry {
            id = "V-VNDB-27448"
            title = "ATRI -My Dear Moments-"

            bestGirl = "Atri"
            // wait wtf
            // minamo's va is the same person as aone's va
            // based rst reference

            // sad plot twist thingy
            AEI(8.0, Emotion.CU to 0.8, Emotion.AP to 0.2)
            Boredom(Boredom.TempOnHold)

            Meme(0.5, 10)
            FeatureMusic("M-VGMDB-AL-100754")
        }

        Entry {
            id = "M-VGMDB-AL-100754"
            title = "ATRI -My Dear Moments- Original Soundtrack"

            // like the aokana soundtrack album
            Music(6.0)
        }
    }
}