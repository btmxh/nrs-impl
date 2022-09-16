package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.Irodori() {
    // original of irodori covers
    Entry {
        id = "M-VGMDB-AR-9553"

        Contains("M-VGMDB-AL-91187-35")
    }

    Entry {
        id = "M-VGMDB-AL-91187"

        Visual(VisualKind.AlbumArt, 0.05, 0.5)

        SubIDEntry("35") {
            Music(3.5)
            Remix("M-VGMDB-AL-93299-2")
        }
    }

    Entry {
        id = "F-VGMDB-10978"
        title = "Irodorimidori"

        Entry {
            id = "A-MAL-50267"
            bestGirl = "Nagi Kobotoke"

            AnimeProgressOld(Boredom.Completed, 8)
            Visual(VisualKind.AnimatedShort, 0.4, 0.2)
        }

        Entry {
            id = "M-VGMDB-AL-93299"

            Visual(VisualKind.AlbumArt, 0.5, 0.35)

            SubIDEntry("2") {
                // Length source: https://www.youtube.com/watch?v=wR-u0IRw5wc
                MusicConsumedProgress("4:35") // impl_overridden

                Music(4.0)
            }
        }

        Entry {
            id = "M-29"
            title = "Maware! GO! GO! CHUNITHM"
            ValidatorSuppress("dah-entry-no-consumed")

            Visual(VisualKind.AlbumArt, 0.35, 0.4)

            Entry {
                id = "M-30"
                title = "Bokura no Freedom DiVE↓"

                Visual(VisualKind.AlbumArt, 0.4, 0.45)

                // Length source: https://osu.ppy.sh/beatmapsets/1667264
                Music(3.0) // impl_overridden
                MusicConsumedProgress("5:16")
            }

            Entry {
                id = "M-31"
                title = "Zero kara hajimeru Brain Power"

                // Length source: https://www.youtube.com/watch?v=iRNH_wF7nrc
                Music(2.5) // impl_overridden
                MusicConsumedProgress("5:15")
            }
        }

        Entry {
            id = "M-26"
            title = "Irodorimidori"
            ValidatorSuppress("dah-entry-no-consumed")

            // times 0.6 because they are all covers
            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-93299")
                Contains("M-29")
            }
        }
    }
}
