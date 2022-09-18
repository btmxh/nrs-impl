package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.OneRoom() {
    // (1) - - - - - - - (2)
    // (1)        (1)       (1)
    //    \        |        /
    //     \       |       /
    //      \      |      /
    //      (2)   (2)   (2)

    Entry {
        id = "F-VGMDB-6434"
        title = "OneRoom"

        Entry {
            id = "M-VGMDB-AL-63666"
            title = "harumachi clover / Yui Hanasaka (CV: M·A·O)" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.5, 0.25)
            SubIDEntry("1") {
                MusicConsumedProgress("4:06") // generated(fill_music_metadata.dart v0.1.1)
                title = "Harumachi Clover" // generated(fill_music_metadata.dart v0.1.1)
                // ME NO MAE NO TOBIRA O AKETARA HARU KAZE
                // TORI TACHI MO KIGI DE MACHIAWASE
                // KIMI E MUKAU SHINGOU AOZORA IRO
                // KAKE DAZEBA II
                // USOTSUKI KAKURITSU RON TOKA
                // ICHI PURASU ICHI GA MUGEN TOKA
                // OSHIETE KURETA KIMI TO SAGASHI NI YUKOU
                // H A R U M A C H I   K U R O B A A A
                Music(0.35)
                OsuSong(personal = 0.6, community = 0.8)
                Remix("M-37")
            }
        }

        Entry {
            id = "A-MAL-34392"
            title = "One Room" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 34392 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 12758 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 97857 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 34392 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Hanasaka Yui"
            seasonal = true

            AnimeProgressOld(Boredom.Dropped, 4)
            Visual(VisualKind.Animated, 0.5, 0.25)
            FeatureMusic("M-VGMDB-AL-63666-1")
        }
    }

    Entry {
        id = "M-37"
        title = "Harumachi Clover (Swing Arrangement) [Dictate Edit]"

        // Length source: https://www.youtube.com/watch?v=2OfJYisHbkI
        Music(0.3)
        MusicConsumedProgress("0:36") // impl_overriden
        OsuSong(personal = 0.6, community = 0.8)
    }
}
