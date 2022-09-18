package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.Idolmaster() {
    Entry {
        id = "F-VGMDB-3559"
        title = "THE IDOLM@STER"

        Entry {
            id = "M-VGMDB-AR-32295"
            title = "765 MILLION ALLSTARS" // generated(fill_music_metadata.dart v0.1.1)

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-78253-1")
            }
        }

        Entry {
            id = "M-VGMDB-AL-53945"
            title = "THE IDOLM@STER LIVE THE@TER DREAMERS 01 Dreaming!" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.5, 0.25)
            SubIDEntry("1") {
                MusicConsumedProgress("4:38") // generated(fill_music_metadata.dart v0.1.1)
                title = "Dreaming!" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.35)
                OsuSong(personal = 0.8)
            }
        }
        Entry {
            id = "M-VGMDB-AL-64249"
            title = "THE IDOLM@STER CINDERELLA MASTER EVERMORE" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.3, 0.3)

            SubIDEntry("1") {
                MusicConsumedProgress("6:05") // generated(fill_music_metadata.dart v0.1.1)
                title = "EVERMORE (M@STER VERSION)" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.4)
            }
        }

        Entry {
            id = "M-VGMDB-AL-78253"
            title = "THE IDOLM@STER MILLION THE@TER GENERATION 11 UNION!!" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.15)

            SubIDEntry("1") {
                MusicConsumedProgress("5:29") // generated(fill_music_metadata.dart v0.1.1)
                title = "UNION!!" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.35)
                OsuSong(personal = 0.5, community = 0.2)
            }
        }

        Entry {
            id = "A-MAL-10278"
            title = "The iDOLM@STER" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 10278 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 6111 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 10278 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 10278 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Iori Minase" // generated(generate_best_girls.dart v0.1.0)
            // ending pretty sadge
            NEI(0.6, Emotion.CU)

            // funny ig
            NEI(0.75, Emotion.AP)

            // idk why i gave this 6 in NRS1 but i'll nerf it to 0.3 ig.
            Music(0.03)
            AnimeProgressOld(Boredom.Completed, 25)
            Visual(VisualKind.Animated, 0.4, 0.3)
        }

        NEI(0.25, Emotion.AP) {
            contributors["A-MAL-23587"] = 0.5
            contributors["A-MAL-30344"] = 0.5
        }

        Entry {
            id = "A-MAL-23587"
            title = "The iDOLM@STER Cinderella Girls" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 23587 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 8777 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20693 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 23587 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Chieri Ogata" // generated(generate_best_girls.dart v0.1.0)
            AnimeProgressOld(Boredom.Completed, 13)
            Visual(VisualKind.Animated, 0.5, 0.2)
        }

        Entry {
            id = "A-MAL-30344"
            title = "The iDOLM@STER Cinderella Girls 2nd Season" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 30344 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 10760 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21094 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 30344 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Chieri Ogata" // generated(generate_best_girls.dart v0.1.0)
            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.5, 0.2)
        }
    }
}
