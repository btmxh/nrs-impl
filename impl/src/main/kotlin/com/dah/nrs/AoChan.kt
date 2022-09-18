package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.AoChan() {
    Entry {
        id = "F-VGMDB-7175"
        title = "Midara na Ao-chan wa Benkyou ga Dekinai"

        Entry {
            id = "A-MAL-38778"
            title = "Midara na Ao-chan wa Benkyou ga Dekinai" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38778 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42024 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 105989 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38778 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Ao Horie" // generated(generate_best_girls.dart v0.1.0)
            AnimeProgressOld(Boredom.Dropped, 3)
            Visual(VisualKind.AnimatedShort, 0.6, 0.4)
            FeatureMusic("M-VGMDB-AL-85759-1")
        }

        Entry{
            id = "M-VGMDB-AL-85759"
            title = "WONDERFUL WONDER / EDOGA-SULLIVAN" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.6, 0.4)

            // simple heart dt
            SubIDEntry("1") {
                MusicConsumedProgress("3:03") // generated(fill_music_metadata.dart v0.1.1)
                title = "WONDERFUL WONDER" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.15)
                OsuSong(personal = 0.4, community = 0.2)
            }
        }
    }

}
