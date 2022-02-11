package com.dah.nrs

fun GenerateBlock.Irodori() {
    // original of irodori covers
    Entry {
        id = "M-VGMDB-AR-9553"
        title = "cosMo@Bousou-P"

        Contains("M-VGMDB-AL-91187-35")
    }

    Entry {
        id = "M-VGMDB-AL-91187"
        title = "CHUNITHM ALL JUSTICE COLLECTION ep.I"

        SubIDEntry("35", "Endmark ni kibou to namida o soete") {
            Music(3.5)
        }
    }

    Entry {
        id = "F-VGMDB-10978"
        title = "Irodorimidori"

        Entry {
            id = "A-MAL-50267"
            title = "Irodorimidori"

            Boredom(Boredom.Watching)
        }

        Entry {
            id = "M-26"
            title = "Irodorimidori"

            // times 0.6 because they are all covers
            Contains(ImageVocalContainFactor * 0.6) {
                Entry {
                    id = "M-VGMDB-AL-93299"
                    title = "GO!GO! Chunithm♥Endmark"

                    SubIDEntry("2") {
                        title = "Endmark ni kibou to namida o soete ~Irodorimidori arrange~"

                        Music(4.0)
                    }
                }

                Entry {
                    id = "M-29"
                    title = "Maware! GO! GO! CHUNITHM"

                    Entry {
                        id = "M-30"
                        title = "Bokura no Freedom DiVE↓"

                        Music(3.0)
                    }

                    Entry {
                        id = "M-31"
                        title = "Zero kara hajimeru Brain Power"

                        Music(2.5)
                    }
                }
            }
        }
    }
}