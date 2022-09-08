package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.RentAGirlfriend() {
    Entry {
        id = "F-VGMDB-9260"
        title = "Kanojo, Okarishimasu"

        Entry {
            id = "A-MAL-40839"
            title = "Kanojo, Okarishimasu"
            bestGirl = "Sakurasawa Sumi"

            Progress(Boredom.Dropped, 1)
            Visual(VisualKind.Animated, 0.5, 0.2)
        }
    }
}