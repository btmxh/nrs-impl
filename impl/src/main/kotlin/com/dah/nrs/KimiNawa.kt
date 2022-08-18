package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.KimiNawa() {
    Entry {
        id = "F-VGMDB-4615"
        title = "Kimi no Na wa"
        // TODO: add music ig, too lazy to do that tho (and the music sucks)

        Entry {
            id = "A-MAL-32281"
            title = "Kimi no Na wa"

            Visual(VisualKind.Animated, 0.75, 0.75)

            bestGirl = "Miki Okudera"
            AdditionalImpact("Compensation for KnK-YrNa jealousy", 0.75)
            Boredom(Boredom.Completed)
        }
    }
}