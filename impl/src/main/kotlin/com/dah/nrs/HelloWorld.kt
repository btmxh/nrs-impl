package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.HelloWorld() {
    Entry {
        id = "A-MAL-38816"
        bestGirl = "Ichijou Ruka"
        // oh fuck
        bestGirl = "Ichigyou Ruri"

        AnimeProgressOld(Boredom.Completed, 1)
        // the cg kinda help with making the anime unique lol
        Visual(VisualKind.Animated, 0.4, 0.6)
    }

    Entry {
        id = "A-MAL-40295"
        bestGirl = "Ichigyou Ruri"

        AnimeProgressOld(Boredom.Completed, 3)
        // the cg kinda help with making the anime unique lol
        Visual(VisualKind.Animated, 0.4, 0.6)
    }

    AEI(9.0, Emotion.CU) {
        contributors["A-MAL-38816"] = 0.4
        contributors["A-MAL-40295"] = 0.6
    }
}
