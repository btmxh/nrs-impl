package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.TateYuusha() {
    Entry {
        id = "F-VGMDB-7166"
        title = "Tate no Yuusha no Nariagari"

        Entry {
            id = "A-MAL-35790"
            title = "Tate no Yuusha no Nariagari"
            // This became popular thanks to Reddit.
            // And yes, it's watched in the Reddit-era
            bestGirl = "Raphtalia"

            Boredom(Boredom.Completed)

            // Anger when MC is treated unfairly (like Oregairu's 8man)
            NEI(5.0, Emotion.AU)
            Meme(0.5, 6)
            Visual(VisualKind.Animated, 0.5, 0.2)
        }

        Entry {
            id = "A-MAL-40356"
            title = "Tate no Yuusha no Nariagari Season 2"
            bestGirl = "Raphtalia"

            Boredom(Boredom.Dropped)
            KilledBy("F-VGMDB-7059", potential = 0.2, effect = 0.75)
            Visual(VisualKind.Animated, 0.4, 0.2)
        }
    }
}