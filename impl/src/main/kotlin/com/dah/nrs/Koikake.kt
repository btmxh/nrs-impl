package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

fun DSLScope.Koikake() {
    // THE ORTENSIA INCIDENT <<<<<<<<<<<<<<<<<< KOIKAKE DARK LORE
    // HOLY FUCK THIS IS AN ABSOLUTE BANGER
    // I LOVE THIS EROGE SO FUCKING MUCH
    // THE GREATEST EROGE OF ALL TIME

    // Winter is when love comes
    Entry {
        id = "F-20221128T123502"
        title = "Koi x Shin Ai Kanojo"

        Entry {
            id = "V-VNDB-17516"
            title = "Koi x Shin Ai Kanojo"
            // unironically better than all drama romance anime lmfao :clueless:
            // we do be living in a society tho :clueless:

            // "the cutest girl in all anime history" :clueless:
            // like what the actual fuck you can't be this cute wtf :clueless:
            // THISSHOULDNOTBEPOSSIBLE :clueless:
            bestGirl = "Himekek Sena"
            bestGirl = "Himeno Sena" // oops :clueless:
            // eroge waifu :clueless:
            Waifu("Himeno Sena", "2022-11-25" to today())

            // first 1.0 yay!!! the waifu method :clueless:
            Visual(VisualKind.VisualNovel, 1.0, 0.3)

            // what a ride :clueless:
            // really enjoyed the thing :clueless:
            // i guess i will finish it in one month :clueless:
            // (mid-term coming soon monkaW) :clueless:
            ConsumedProgress(EntryStatus.Completed, 1.0, 24.hours)

            // time to spam ei boys :clueless:
            // really good atmospheric farming ngl :clueless:
            // funnychamp :clueless:
            // ayane route omegalul + good story ngl :clueless:
            AEI(0.3, Emotion.AP)

            // eroge love ig :clueless:
            // AEI(0.5, Emotion.MP)

            NeoErogeEra(1.0)
            FeatureMusic("M-VGMDB-AL-58596")

            // sena route was so sudden wtf :sadge: :clueless:
            // Once again, Asuiro Koi Moyou predicted the future. :clueless:
            // "But our paces don’t suit each other; you’ve become even more distant" :clueless:
            // "It happened so suddenly, but from now on" :clueless:

            // "Even if our paces do not match, :clueless:
            //  If I ran with all my might, :clueless:
            //  We may be able to meet again." :clueless:
            AEI(0.8, Emotion.CU)

            // the :aware: part

            // last episode is one of the best piece of story i've ever seen
            // absolute masterpiece, i was about to cry like 10 times or sth

            // the twists
            EPI(1.0)

            // realization of the fact that main girl didn't love mc
            AEI(0.2, Emotion.AU)

            // main girl's music career, darker than the childplay "ortensia incident"
            AEI(0.2, Emotion.AU to 0.5, Emotion.MP to 0.5)

            // eroge love ig :aware:
            AEI(0.8, Emotion.MP)

            // the sadness of the story
            Cry(Emotion.CU) {
                contributors["V-VNDB-17516"] = 0.8
                contributors["M-VGMDB-AL-58596-14"] = 0.2
            }

            PADS(3, Emotion.CU to 0.5, Emotion.MP to 0.3, Emotion.AU to 0.1, Emotion.CP to 0.1) {
                contributors["V-VNDB-17516"] = 0.8
                contributors["M-VGMDB-AL-104267-3"] = 0.05
                contributors["M-VGMDB-AL-58596-14"] = 0.05
                contributors["M-VGMDB-AL-43320-8"] = 0.05
                contributors["M-VGMDB-AL-78595-16"] = 0.05
                // pack up boys, eroge is ending #ggwp
            }
        }

        Entry {
            id = "M-VGMDB-AL-58596"
            title = "KOI-KAKERU SHIN-AI KANOJO Complete Sound Tracks" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 1.0, 0.3)

            SubIDEntry("2") {
                MusicConsumedProgress("4:23") // generated(fill_music_metadata.dart v0.1.1)
                title = "記憶×ハジマリ" // generated(fill_music_metadata.dart v0.1.1)
                // chorus sucks but
                // the inst is atm-farm-pilled af
                // unironically can be meta soon :eyes:

                // gyze i found the mv for this song :skull:
                // https://www.youtube.com/watch?v=e_IIORCnBxI
                Music(0.35)
            }

            SubIDEntry("14") {
                MusicConsumedProgress("4:01") // generated(fill_music_metadata.dart v0.1.1)
                title = "東の空から始まる世界" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.6)
            }

            SubIDEntry("25") {
                MusicConsumedProgress("4:16") // generated(fill_music_metadata.dart v0.1.1)
                title = "GLORIOUS DAYS" // generated(fill_music_metadata.dart v0.1.1)
                // Resounding 🔉 far away 🚗 and beyond ✈️ is the strength 💪 of my feelings ❤️️
                // I scream 🗣 so much 🤌🏻 my chest 📦 hurts 🤕, because I want 🙋 to find 🔎 you
                // Grow 🌱 up! If there’s something 👀 I don’t want to forget 🤔, is our promise 🤞
                // This blue 🟦 sky ☁️ will always ♾️ be right 👉 here 👇
                Music(0.75)
                // NEI(Emotion.CU, 0.2)
                // :Pause: :pepeLaugh:
            }

            // classic "too lazy to rank all of the tracks"
            Music(0.6)
        }

        AEI(0.5, Emotion.CU to 0.8, Emotion.CP to 0.2) {
            contributors["M-VGMDB-AL-58596"] = 0.1
            contributors["V-VNDB-17516"] = 0.9
        }
    }
}

fun AcceptImpact.NeoErogeEra(strength: Double) {
    Meme(strength, numDays("2022-11-25"))
}

fun DSLEntry.KoikakeAEI(strength: Double, contribution: Double, vararg emotions: Pair<Emotion.Factor, Double>) {
    AEI(strength, *emotions) {
        contributors[id] = contribution
        contributors["V-VNDB-17516"] = 1.0 - contribution
    }
}

fun DSLEntry.KoikakeAEI(strength: Double, contribution: Double, emotion: Emotion.Factor) {
    KoikakeAEI(strength, contribution, emotion to 1.0)
}

fun DSLEntry.KoikakeNEI(strength: Double, contribution: Double, vararg emotions: Pair<Emotion.Factor, Double>) {
    NEI(strength, *emotions) {
        contributors[id] = contribution
        contributors["V-VNDB-17516"] = 1.0 - contribution
    }
}

fun DSLEntry.KoikakeNEI(strength: Double, contribution: Double, emotion: Emotion.Factor) {
    KoikakeNEI(strength, contribution, emotion to 1.0)
}
