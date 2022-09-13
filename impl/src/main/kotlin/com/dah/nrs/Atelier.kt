package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours

fun DSLScope.Atelier() {
    // Asuiro Koi Moyou and its consequences have been a disaster for our modern culture
    Entry {
        // fuck this shit
        // https://atelier.fandom.com/wiki/Miruca_Crotze
        // https://atelier.fandom.com/wiki/Escha_Malier
        // https://atelier.fandom.com/wiki/Luis_Bester

        id = "F-VGMDB-694"
        title = "Atelier"

        AKMEraPart2(0.75) {
            contributors["A-MAL-21167"] = 0.4
            contributors["G-VGMDB-1880"] = 0.3
            contributors["G-VGMDB-1090"] = 0.2
            contributors["G-VGMDB-3499"] = 0.1
        }

        AKMEraPart3(1.0) {
            contributors["A-MAL-21167"] = 0.4
            contributors["G-VGMDB-1880"] = 0.3
            contributors["G-VGMDB-1090"] = 0.2
            contributors["G-VGMDB-3499"] = 0.1
        }

        EHI {
            contributors["A-MAL-21167"] = 0.4
            contributors["G-VGMDB-1880"] = 0.35
            contributors["G-VGMDB-1090"] = 0.25
        }
        // press f to pay respect for our tranny (me)
        // rip (btw i started the escha logy game on my birthday lol)
        // fuck
        // fuck
        // fuck
        // fuck
        // fuck
        // fuck
        // fuck
        // fuck
        // fuck
        // fuck
        // fuck
        // fuck
        // fuck
        // fuck
        // fuck
        // truly one of the anime girls of all time
        Waifu("Malier Escha", "2022-08-31" to today()) {
            contributors["A-MAL-21167"] = 0.2
            contributors["G-VGMDB-1880"] = 0.8
        }

        Entry {
            id = "A-MAL-21167"
            title = "Escha & Logy no Atelier: Tasogare no Sora no Renkinjutsushi" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 21167 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 8091 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20506 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 21167 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Malier Escha"

            // this is watched in parallel with that hina ridaka romocom seasonal show
            // for the ultimate "aufripe ioek yoamou" experience
            AnimeProgressOld(Boredom.Watching, 10)

            // ep 10 is an absolute banger xdddddddddddddddddddd
            // (mc crying, ortensia incident, "the daughter of the life-skill god",
            // harry maguire, nio tạ, rst dd reference, aKoGarE pls fuck off, etc.)
            // also the linca method too xd

            // this anime somewhat feels like those rst-inspired-CP-based anime ngl
            // (first ep)
            // NEI(3.0, Emotion.CP)

            FeatureMusic("M-VGMDB-AL-45361-1")

            Visual(VisualKind.Animated, 0.4, 0.25)

            // ig this is killed somewhat similarly to luminous witches
            KilledBy("F-VGMDB-7059", potential = 0.5, effect = 0.25)
        }

        Entry {
            id = "M-VGMDB-AL-45361"
            title = "Escha & Logy no Atelier ~Tasogare no Sora no Renkinjutsushi~ Original Soundtrack the Animation" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.25)
            SubIDEntry("1") {
                title = "アスイロ" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:45") // generated(fill_music_metadata.dart v0.1.1)
                // STOP POSTING ABOUT Asuiro Koi Moyou! I'M TIRED OF SEEING IT!
                // MY FRIENDS ON TIKTOK SEND ME Rina Hidaka, ON DISCORD IT'S FUCKING Rie Marukawa!
                // I was in a server, right? and ALL OF THE CHANNELS were just Criticrista stuff.
                // I-I showed a new anime to my girlfriend and t-the OP when I read the title
                // and I said "haha its an asuiro koi moyou reference omegalul kOUkAi sHinAi yO kImI NI dEAeTa kOTo"
                // I fucking looked at a osugame jump pattern and said "THAT'S A SHIT MOYOU"
                // (TL note: "moyou" is "pattern" in japanese)
                // I looked at my penis I think of that girl from cote with the same VA as rosia-chan 3537
                // and I go "Arisu? More like Asuir" AAAAAAAAAAAAAAHGESFG

                // all of that aside, this song slaps
                Music(6.0)
            }
        }

        Entry {
            // i started the game oops
            id = "G-VGMDB-3499"
            title = "Sophie no Atelier ~Fushigi na Hon no Renkinjutsushi~"

            // Romaji name is canon
//            title = "Atelier Sophie ~The Alchemist of the Mysterious Book~"

            bestGirl = "Wise Spirit"
            // "sach cho" my beloved

            Visual(VisualKind.RPG3DGame, 0.5, 0.4)
            Visual(VisualKind.VisualNovel, 0.4, 0.3)
            // based on ayesha since i "deleted" atelier sophie
            ConsumedProgress(EntryStatus.Completed, 1.0, 50.hours)
        }

        Entry {
            id = "G-VGMDB-1090"
            title = "Ayesha no Atelier: Tasogare no Daichi no Renkinjutsushi"
            // "not even at the start line"

//            bestGirl = "Harry Maguire"
//            bestGirl = "Fred dai de"
            // atelier games visual comes in two part
            Visual(VisualKind.RPG3DGame, 0.6, 0.4)
            Visual(VisualKind.VisualNovel, 0.5, 0.3)
            // it's actually something like 99hrs, but i afk'd
            // (too lazy to turn off the pc) a lot idk
            ConsumedProgress(EntryStatus.Completed, 1.0, 50.hours)

            // i hate "bủ nio" (it's a meme lol)
            NEI(8.0, Emotion.AU to 0.5, Emotion.AP to 0.5)
        }

        Entry {
            id = "G-VGMDB-1880"
            title = "Escha & Logy no Atelier ~Tasogare no Sora no Renkinjutsushi~"
            // fucking finally

            bestGirl = "Malier Escha"
            // I heard somewhere that “Love strikes so suddenly”
            // I thought I was indifferent and I held back my feelings

            // obligatory potential waifu buff
            Visual(VisualKind.RPG3DGame, 0.7, 0.4)
            Visual(VisualKind.VisualNovel, 0.6, 0.3)
            ConsumedProgress(EntryStatus.Completed, 1.0, 80.hours)
        }
    }
}
