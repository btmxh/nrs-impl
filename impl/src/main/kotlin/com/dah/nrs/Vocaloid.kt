package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.Vocaloid() {
    Entry {
        // there is no vgmdb entry for this
        // but there is a mal one kek
        id = "M-MAL-36631"
        title = "Pandora Voxx Complete"

        Visual(VisualKind.AlbumArt, 0.1, 0.2)

        SubIDEntry("6") {
            Visual(VisualKind.AnimatedMV, 0.5, 0.5)
            // the legendary fifth ayumu-era theme song

            // for some reason, this almost made me cry
            // (somewhat unrelated to ayumu shit)
            AEI(5.0, Emotion.CU)

            Music(4.25)
            Remix("M-41")
            Remix("M-43")
        }
    }

    Entry {
        id = "M-41"
        title = "Chikyuu Saigo no Kokuhaku wo (yuikonnu)"

        // yuiko version is probably the best, music-wise
        Music(6.5)
    }

    Entry {
        id = "M-43"
        title = "Chikyuu Saigo no Kokuhaku wo (HAG)"

        // quite good, but they didn't keep the orig. inst.
        Music(5.0)
    }
}