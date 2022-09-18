package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

// 'That summer I first learned why “Love is War”'
fun DSLScope.Kaguya() {
    // i thought this was blacklisted, but it seems that was not the case
    Entry {
        id = "F-VGMDB-7021"
        title = "Kaguya-sama wa Kokurasetai ~Tensaitachi no Ren'ai Zunousen~"
        // kaguyashit my behated

        Entry {
            id = "M-VGMDB-AL-83397"
            title = "Chikatto Chika Chika♡ / Chika Fujiwara (CV. Konomi Kohara)" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.5, 0.4)

            SubIDEntry("1") {
                MusicConsumedProgress("2:58") // generated(fill_music_metadata.dart v0.1.1)
                title = "Chikatto Chika Chika♡" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.25)
                OsuSong(personal = 5.0, community = 4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-116977"
            title = "KAGUYA ♡ ULTRA BEST" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.5, 0.4)

            SubIDEntry("11") {
                MusicConsumedProgress("4:14") // generated(fill_music_metadata.dart v0.1.1)
                title = "ありがとう。" // generated(fill_music_metadata.dart v0.1.1)
                // the grass-touching experience
                Music(0.35)
            }
        }

        // but I got tired of the constant spamming of redditors
        // (more like jealous with its popularity, so it got hated)
        // also the ideology in this anime is kinda fucked.
        // and it's also kinda boring too
        // and now 6.xx became the meta, rst + sb69 top 2, le boat analogy lol
        AEI(-0.5, Emotion.AU) {
            contributors["A-MAL-37999"] = 0.25
            contributors["A-MAL-40591"] = 0.5
            contributors["A-MAL-43608"] = 0.25
        }

        Entry {
            id = "A-MAL-37999"
            title = "Kaguya-sama wa Kokurasetai: Tensai-tachi no Renai Zunousen" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 37999 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 41373 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 101921 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 37999 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Hayasaka Ai"
            // https://en.wikipedia.org/wiki/Yumiri_Hanamori#:~:text=On%20November%201%2C%202019%2C%20it%20was%20announced%20that%20Hanamori%20would%20be%20%22graduating%22%20from%20Re%3AStage!%20due%20to%20a%20knee%20injury.

            AnimeProgressOld(Boredom.Dropped, 9)
            Visual(VisualKind.Animated, 0.5, 0.4)
            FeatureMusic("M-VGMDB-AL-83397-1")
            // domestic kanojo war arc
            Meme(0.25, 90)
        }

        // these are ranked just to help to carry the AEI for s1
        // also the funny rina hidaka girl too lmfao
        Entry {
            id = "A-MAL-40591"
            title = "Kaguya-sama wa Kokurasetai? Tensai-tachi no Renai Zunousen" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 40591 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42632 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 112641 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 40591 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Kobachi Osaragi" // aka the mf who 'first learned why “Love is War”'
            // tatoe asu de sekai ga owattemo
            // koukai shinai yo kimi ni deaeta koto

            Visual(VisualKind.Animated, 0.5, 0.4)
            AnimeProgressOld(Boredom.Unwatched, 0)
            ValidatorSuppress("dah-entry-no-consumed")
        }

        Entry {
            id = "A-MAL-43608"
            title = "Kaguya-sama wa Kokurasetai: Ultra Romantic" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 43608 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 43691 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 125367 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 43608 // generated(fill_anime_metadata.dart v0.1.1)
            // imagine almost every anime losing to this shit lol y'all sucks (the MAL top 2 thing)
            // (rst still better copium)

            bestGirl = "Kobachi Osaragi" // aka the mf who 'heard somewhere that “Love strikes so suddenly”'
            // It happened so suddenly, but from now on
            // I want you to quietly listen to what I’ll say
            // Just for now I’ll say “goodbye” to my cowardly heart

            Visual(VisualKind.Animated, 0.5, 0.4)
            AnimeProgressOld(Boredom.Unwatched, 0)
            ValidatorSuppress("dah-entry-no-consumed")
        }
    }
}
