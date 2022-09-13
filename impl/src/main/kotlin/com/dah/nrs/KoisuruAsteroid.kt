package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.KoisuruAsteroid() {
    Entry {
        id = "F-VGMDB-7865"
        title = "Koisuru Asteroid"

        Entry {
            id = "A-MAL-39388"
            title = "Koisuru Asteroid" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 39388 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42470 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 108092 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 39388 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Kotonoha Mira"

            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
            Visual(VisualKind.Animated, 0.8, 0.3)
            FeatureMusic("M-VGMDB-AL-93329-1")
            FeatureMusic("M-VGMDB-AL-93338-1")
        }

        Contains("M-VGMDB-AL-93329-1")
        Contains("M-VGMDB-AL-93338-1")
    }

    Entry {
        id = "M-VGMDB-AL-93338"
        title = "Yozora / Minori Suzuki" // generated(fill_music_metadata.dart v0.1.1)

        Visual(VisualKind.AlbumArt, 0.3, 0.2)

        SubIDEntry("1") {
            title = "夜空" // generated(fill_music_metadata.dart v0.1.1)
            // play the gigachad mapper's map:
            // https://osu.ppy.sh/beatmapsets/1256770#osu/2611562
            // https://osu.ppy.sh/beatmapsets/1256770#osu/2611562
            // https://osu.ppy.sh/beatmapsets/1256770#osu/2611562
            // https://osu.ppy.sh/beatmapsets/1256770#osu/2611562
            // https://osu.ppy.sh/beatmapsets/1256770#osu/2611562

            Music(5.0)
            OsuSong(personal = 4.0)
        }
    }
}
