package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.AEI
import com.dah.nrs.exts.Emotion
import com.dah.nrs.exts.Music
import com.dah.nrs.exts.Remix

fun DSLScope.Vocaloid() {
    Entry {
        // there is no vgmdb entry for this
        // but there is a mal one kek
        id = "M-MAL-36631"
        title = "Pandora Voxx Complete"

        SubIDEntry("6", "Chikyuu Saigo no Kokuhaku wo") {
            // the legendary fifth ayumu-era theme song

            // for some reason, this almost made me cry
            // (somewhat unrelated to ayumu shit)
            AEI(5.0, Emotion.CU)

            Music(4.25)
        }
    }

    Entry {
        id = "M-41"
        title = "Chikyuu Saigo no Kokuhaku wo (yuikonnu)"

        Remix("M-MAL-36631-6")

        // yuiko version is probably the best, music-wise
        Music(6.5)
    }

    Entry {
        id = "M-43"
        title = "Chikyuu Saigo no Kokuhaku wo (HAG)"

        Remix("M-MAL-36631-6")

        // quite good, but they didn't keep the orig. inst.
        Music(5.0)
    }
}