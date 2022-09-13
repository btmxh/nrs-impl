package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.ShinkaiMovies() {
    Entry {
        id = "F-VGMDB-4615"
        title = "Kimi no Na wa"
        // TODO: add music ig, too lazy to do that tho (and the music sucks)

        Entry {
            id = "A-MAL-32281"
            title = "Kimi no Na wa." // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 32281 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 11614 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21519 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 32281 // generated(fill_anime_metadata.dart v0.1.1)

            Visual(VisualKind.Animated, 0.75, 0.75)

            bestGirl = "Miki Okudera"
            AdditionalImpact("Compensation for KnK-YrNa jealousy", 0.75)
            Progress(Boredom.Completed, 1) // generated(fill_anime_metadata.dart v0.1.1)
        }
    }

    Entry {
        id = "F-VGMDB-7292"
        title = "Tenki no Ko"

        Entry {
            id = "A-MAL-38826"
            title = "Tenki no Ko" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38826 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42028 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 106286 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38826 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Amano Hina"

            Visual(VisualKind.Animated, 0.75, 0.75)
            Progress(Boredom.Completed, 1) // generated(fill_anime_metadata.dart v0.1.1)
            FeatureMusic("M-VGMDB-AL-87003")
        }

        Entry {
            id = "M-VGMDB-AL-87003"
            title = "Tenki no Ko / RADWIMPS" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.5, 0.5)
            SubIDEntry("28") {
                title = "Grand Escape (Movie edit) feat, Miura Toko" // generated(fill_music_metadata.dart v0.1.1)
                Music(5.0)
                OsuSong(personal = 4.0)
            }
        }
    }
}
