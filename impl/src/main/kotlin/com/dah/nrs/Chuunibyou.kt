package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

fun DSLScope.Chuunibyou() {
    Entry {
        id = "M-VGMDB-AR-12516"
        title = "ZAQ" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-VGMDB-AL-42762")
    }

    Entry {
        id = "F-VGMDB-2330"
        title = "Chuunibyou demo Koi ga Shitai!"

        Entry {
            id = "M-VGMDB-AL-42762"
            title = "VOICE / ZAQ" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.6, 0.2)

            SubIDEntry("1") {
                MusicConsumedProgress("4:18") // generated(fill_music_metadata.dart v0.1.1)
                title = "VOICE" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.2)
                OsuSong(personal = 0.2)
            }
        }

        // this made me laugh my ass off
        AEI(0.75, Emotion.AP) {
            contributors["A-MAL-14741"] = 0.75
            // s2 has less comedy than s1
            // because le funny dead ppl pink-haired girl
            contributors["A-MAL-18671"] = 0.25
        }

        Entry {
            id = "A-MAL-14741"
            title = "Chuunibyou demo Koi ga Shitai!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 14741 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 7160 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 14741 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 14741 // generated(fill_anime_metadata.dart v0.1.1)

            Visual(VisualKind.Animated, 0.6, 0.2)

            bestGirl = "Shinka Nibutani" // generated(generate_best_girls.dart v0.1.0)
            // idk why
            // this is taken from NRS1
            Meme(0.15, 2)
            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 12)
        }

        Entry {
            id = "A-MAL-18671"
            title = "Chuunibyou demo Koi ga Shitai! Ren" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 18671 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 7705 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 18671 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 18671 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Shinka Nibutani" // generated(generate_best_girls.dart v0.1.0)
            // Shichimiya dead people almost made me cry
            // YouTube link: https://www.youtube.com/watch?v=vFjJ6skYoxI
            AEI(1.0, Emotion.CU)
            // Shichimiya memes
            Meme(0.4, 10)
            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 12)
            Visual(VisualKind.Animated, 0.6, 0.2)

            FeatureMusic("M-VGMDB-AL-42762-1")
        }

        Entry {
            id = "A-MAL-35608"
            title = "Chuunibyou demo Koi ga Shitai! Movie: Take On Me" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 35608 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13524 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 98762 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 35608 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Shinka Nibutani" // generated(generate_best_girls.dart v0.1.0)
            AnimeConsumedProgress(EntryStatus.Completed, 0.9, 1, 1.hours + 33.minutes)
            // movie is funny, but less content than s1 and s2
            // separate from s1/2 because it was watched later
            NEI(0.75, Emotion.AP)
            Visual(VisualKind.Animated, 0.6, 0.2)
        }
    }
}
