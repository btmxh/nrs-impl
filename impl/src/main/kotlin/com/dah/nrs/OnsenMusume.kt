package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.OnsenMusume() {
    // le funny franchise, lack content therefore low score
    // translate stuff for me if u want score to go up

    Entry {
        id = "F-VGMDB-6439"
        title = "Onsen Musume"

        Entry {
            id = "M-VGMDB-AL-75349"

            Visual(VisualKind.AlbumArt, 0.75, 0.25)
            SubIDEntry("1") {
                MusicConsumedProgress("4:59") // impl_overridden
                Music(6.0)
            }
        }

        Entry {
            id = "M-17"
            title = "SPRiNGS"
            ValidatorSuppress("dah-entry-no-consumed")

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-75344-1")
                Contains("M-VGMDB-AL-75344-5")
                Contains("M-VGMDB-AL-75349")
            }
        }

        Entry {
            id = "M-VGMDB-AL-75344"

            Visual(VisualKind.AlbumArt, 0.75, 0.25)
            // Length source: https://open.spotify.com/album/7iKl9h6FUWmHhRE7tg8yJh
            SubIDEntry("1") {
                MusicConsumedProgress("3:44") // impl_overridden
                // https://www.youtube.com/watch?v=X2Q-bCS_IRs
                Visual(VisualKind.AnimatedMV, 0.75, 0.25)
                Music(5.0)
            }

            // 2-4 are subunit songs
            SubIDEntry("2") {
                MusicConsumedProgress("4:20") // impl_overridden
                Music(7.0)
            }

            SubIDEntry("3") {
                MusicConsumedProgress("4:58") // impl_overridden
                Music(4.5)
            }

            SubIDEntry("4") {
                MusicConsumedProgress("4:26") // impl_overridden
                Music(6.0)
            }

            SubIDEntry("5") {
                MusicConsumedProgress("4:01") // impl_overridden
                Music(2.0)
            }
        }

        Meme(0.3, 45)
    }
}
