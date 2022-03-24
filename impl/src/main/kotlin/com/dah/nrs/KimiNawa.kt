package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.exts.AdditionalImpact
import com.dah.nrs.exts.Boredom
import com.dah.nrs.exts.Completed
import com.dah.nrs.exts.Meme

fun DSLScope.KimiNawa() {
    Entry {
        id = "F-VGMDB-4615"
        title = "Kimi no Na wa"
        // TODO: add music ig, too lazy to do that tho (and the music sucks)

        Entry {
            id = "A-MAL-32281"
            title = "Kimi no Na wa"

            bestGirl = "Miki Okudera"

            // Lam-ki - Azu-nyan memes start from here
            Meme(0.2, Meme.MMoreThan3Months)
            AdditionalImpact("Compensation for KnK-YrNa jealousy", 0.75)
            Boredom(Boredom.Completed)
        }
    }
}