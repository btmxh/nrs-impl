package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.Irodori() {
    // original of irodori covers
    Entry {
        id = "M-VGMDB-AR-9553"
        title = "cosMo@bousouP" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-VGMDB-AL-91187-35")
    }

    Entry {
        id = "M-VGMDB-AL-91187"
        title = "CHUNITHM ALL JUSTICE COLLECTION ep.I" // generated(fill_music_metadata.dart v0.1.1)

        Visual(VisualKind.AlbumArt, 0.05, 0.5)

        SubIDEntry("35") {
            MusicConsumedProgress("2:51") // generated(fill_music_metadata.dart v0.1.1)
            title = "エンドマークに希望と涙を添えて" // generated(fill_music_metadata.dart v0.1.1)
            Music(0.35)
            Remix("M-VGMDB-AL-93299-2")
        }
    }

    Entry {
        id = "F-VGMDB-10978"
        title = "Irodorimidori"

        Entry {
            id = "A-MAL-50267"
            title = "Irodorimidori" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 50267 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 45577 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 140950 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 50267 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Nagi Kobotoke" // generated(generate_best_girls.dart v0.1.0)

            AnimeProgressOld(Boredom.Completed, 8)
            Visual(VisualKind.AnimatedShort, 0.4, 0.2)
        }

        Entry {
            id = "M-VGMDB-AL-93299"
            title = "GO!GO! Chunithm♥Endmark / IRODORIMIDORI" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.5, 0.35)

            SubIDEntry("2") {
                title = "エンドマークに希望と涙を添えて ～イロドリミドリアレンジ～" // generated(fill_music_metadata.dart v0.1.1)
                // Length source: https://www.youtube.com/watch?v=wR-u0IRw5wc
                MusicConsumedProgress("4:35") // impl_overridden

                Music(0.4)
            }
        }

        Entry {
            id = "M-20220130T165739-2"
            title = "Maware! GO! GO! CHUNITHM"
            ValidatorSuppress("dah-entry-no-consumed")

            Visual(VisualKind.AlbumArt, 0.35, 0.4)

            Entry {
                id = "M-20220130T165739-3"
                title = "Bokura no Freedom DiVE↓"

                Visual(VisualKind.AlbumArt, 0.4, 0.45)

                // Length source: https://osu.ppy.sh/beatmapsets/1667264
                Music(0.3)
                MusicConsumedProgress("5:16") // impl_overridden
            }

            Entry {
                id = "M-20220130T165739-4"
                title = "Zero kara hajimeru Brain Power"

                // Length source: https://www.youtube.com/watch?v=iRNH_wF7nrc
                Music(0.25)
                MusicConsumedProgress("5:15") // impl_overridden
            }
        }

        Entry {
            id = "M-20220130T165739-1"
            title = "Irodorimidori"
            ValidatorSuppress("dah-entry-no-consumed")

            // times 0.6 because they are all covers
            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-93299")
                Contains("M-20220130T165739-2")
            }
        }
    }
}
