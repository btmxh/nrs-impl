package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.Irodori() {
    // original of irodori covers
    Entry {
        id = "M-VGMDB-AR-9553"
        title = "cosMo@Bousou-P"

        Contains("M-VGMDB-AL-91187-35")
    }

    Entry {
        id = "M-VGMDB-AL-91187"
        title = "CHUNITHM ALL JUSTICE COLLECTION ep.I"

        Visual(VisualKind.AlbumArt, 0.05, 0.5)

        SubIDEntry("35", "Endmark ni kibou to namida o soete") {
            Music(3.5)
            Remix("M-VGMDB-AL-93299-2")
        }
    }

    Entry {
        id = "F-VGMDB-10978"
        title = "Irodorimidori"

        Entry {
            id = "A-MAL-50267"    // generated
            idMAL = 50267
            idAniList = 140950
            idAniDB = 16950
            idKitsu = 45577
            title = "Irodorimidori"
            bestGirl = "Nagi Kobotoke"

            Progress(Boredom.Completed)
            Visual(VisualKind.AnimatedShort, 0.4, 0.2)
        }

        Entry {
            id = "M-VGMDB-AL-93299"
            title = "GO!GO! Chunithm♥Endmark"

            Visual(VisualKind.AlbumArt, 0.5, 0.35)

            SubIDEntry("2") {
                title = "Endmark ni kibou to namida o soete ~Irodorimidori arrange~"

                Music(4.0)
            }
        }

        Entry {
            id = "M-29"
            title = "Maware! GO! GO! CHUNITHM"

            Visual(VisualKind.AlbumArt, 0.35, 0.4)

            Entry {
                id = "M-30"
                title = "Bokura no Freedom DiVE↓"

                Visual(VisualKind.AlbumArt, 0.4, 0.45)

                Music(3.0)
            }

            Entry {
                id = "M-31"
                title = "Zero kara hajimeru Brain Power"

                Music(2.5)
            }
        }

        Entry {
            id = "M-26"
            title = "Irodorimidori"

            // times 0.6 because they are all covers
            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-93299")
                Contains("M-29")
            }
        }
    }
}