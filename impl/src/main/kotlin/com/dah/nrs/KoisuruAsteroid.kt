package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.KoisuruAsteroid() {
    Entry {
        id = "F-VGMDB-7865"
        title = "Koisuru Asteroid"

        Entry {
            id = "A-MAL-39388"    // generated
            idMAL = 39388
            idAniList = 108092
            idKitsu = 42470
            idAniDB = 14707
            title = "Koisuru Asteroid"
            bestGirl = "Kotonoha Mira"

            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.8, 0.3)
            FeatureMusic("M-VGMDB-AL-93329-1")
            FeatureMusic("M-VGMDB-AL-93338-1")
        }

        Contains("M-VGMDB-AL-93329-1")
        Contains("M-VGMDB-AL-93338-1")
    }

    Entry {
        id = "M-VGMDB-AL-93338"
        title = "Yozora"

        Visual(VisualKind.AlbumArt, 0.3, 0.2)

        SubIDEntry("1") {
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