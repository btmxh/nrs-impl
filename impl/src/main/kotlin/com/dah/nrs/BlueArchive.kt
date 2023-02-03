package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

// abandoning heisenberg uncertainty principle is the worst mistake of mankind
// abandoning heisenberg uncertainty principle is the worst mistake of mankind
// abandoning heisenberg uncertainty principle is the worst mistake of mankind
// abandoning heisenberg uncertainty principle is the worst mistake of mankind
// abandoning heisenberg uncertainty principle is the worst mistake of mankind
fun DSLScope.BlueArchive() {
    Entry {
        id = "F-VGMDB-9895"
        title = "Blue Archive"
        // "onsen but actually meta"
        // (yes the game exists but it will likely not be played for a while)

        // no way edm in 2023 pogpega
        // this is literally 2018
        Entry {
            id = "M-VGMDB-AL-126116"

            // hfiumi buff (without hfiumi base is 0.3)
            Visual(VisualKind.AlbumArt, 0.5, 0.5)
            SubIDEntry("4") {
                Music(0.4)
                // :crying emoji:
                // i love leah kate
                // https://osu.ppy.sh/beatmapsets/1933124#osu/3994310 :skull:
            }
        }

        Entry {
            id = "M-VGMDB-AL-108549"

            Visual(VisualKind.AlbumArt, 0.2, 0.3)
            SubIDEntry("1") {
                // me catjamming to the beat drop
                // :catJAMMER: :EDM: :catJAMMER: :EDM: :catJAMMER: :EDM: :catJAMMER:
                Music(0.5)
            }
        }

        RemodernizationEra(0.8) {
            contributors["M-VGMDB-AL-126116-4"] = 0.4
            contributors["M-VGMDB-AL-108549-1"] = 0.1
            contributors["F-VGMDB-9895"] = 0.5
        }
    }
}

fun AcceptImpact.RemodernizationEra(strength: Double, block: DSLImpact.() -> Unit = {}) {
    Meme(strength, numDays("2022-11-25", "2023-01-01"), block)
}

