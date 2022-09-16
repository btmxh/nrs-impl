package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.GochiUsa() {
    Entry {
        id = "F-VGMDB-3939"
        title = "Gochuumon wa Usagi Desu ka?"

        Entry {
            id = "M-VGMDB-AL-44890"
            title = "Daydream café / Petit Rabbit's" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.15)

            SubIDEntry("1") {
                MusicConsumedProgress("3:48") // generated(fill_music_metadata.dart v0.1.1)
                title = "Daydream café" // generated(fill_music_metadata.dart v0.1.1)
                // fuwa fuwa
                // dong do la max do
                // duy bua ham l
                // duy bua ngao l
                Music(2.0)
            }
        }

        Entry {
            id = "M-9"
            title = "Petit Rabbit's"
            ValidatorSuppress("dah-entry-no-consumed")

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-44890")
            }
        }

        Entry {
            id = "M-VGMDB-AL-55364"
            title = "Gochuumon wa Usagi Desu ka?? Chino Character Song Album: cup of chino" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.5, 0.2)
            // this also includes mahou shoujo chino
            Contains("M-VGMDB-AL-54418-1")

            SubIDEntry("3") {
                MusicConsumedProgress("4:25") // generated(fill_music_metadata.dart v0.1.1)
                title = "Shinsaku no Shiawase wa Kochira!" // generated(fill_music_metadata.dart v0.1.1)
                // dan dan kikoeru
                // lets go i fced the son's insane diff with dt
                // fuck sekai's insane tho
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-54418"
            title = "Gochuumon wa Mahou Shoujo desu ka? Image Song: Mahou Shoujo Chino" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.15)
            SubIDEntry("1") {
                MusicConsumedProgress("3:52") // generated(fill_music_metadata.dart v0.1.1)
                title = "Mahou Shoujo Chino" // generated(fill_music_metadata.dart v0.1.1)
                Music(2.0)
            }
        }

        Entry {
            id = "A-MAL-21273"
            title = "Gochuumon wa Usagi Desu ka?" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 21273 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 8095 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20517 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 21273 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Kafuu Chino"
            // humor not that good tho
            NEI(3.0, Emotion.AP)
            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.4, 0.15)
        }
    }
}
