package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.AscendanceBookworm() {
    Entry {
        id = "F-VGMDB-7638"
        title = "Honzuki no Gekokujou: Shisho ni Naru Tame ni wa Shudan wo Erande Iraremasen"

        // world-building ig
        AEI(0.3, Emotion.AP) {
            contributors["A-MAL-39468"] = 0.3
            contributors["A-MAL-40815"] = 0.3
            contributors["A-MAL-42429"] = 0.4
        }

        Entry {
            id = "A-MAL-39468"
            title = "Honzuki no Gekokujou: Shisho ni Naru Tame ni wa Shudan wo Erandeiraremasen" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 39468 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42241 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 108268 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 39468 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Myne" // generated(generate_best_girls.dart v0.1.0)

            AnimeProgressOld(Boredom.Completed, 14)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        Entry {
            id = "A-MAL-40815"
            title = "Honzuki no Gekokujou: Shisho ni Naru Tame ni wa Shudan wo Erandeiraremasen 2nd Season" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 40815 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42838 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 113693 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 40815 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Myne" // generated(generate_best_girls.dart v0.1.0)

            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        Entry {
            id = "A-MAL-42429"
            title = "Honzuki no Gekokujou: Shisho ni Naru Tame ni wa Shudan wo Erandeiraremasen 3rd Season" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 42429 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 43607 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 121176 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 42429 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Myne" // generated(generate_best_girls.dart v0.1.0)

            AnimeProgressOld(Boredom.Completed, 10)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }
    }
}
