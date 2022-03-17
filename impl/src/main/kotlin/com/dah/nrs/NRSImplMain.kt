@file:Suppress(
    "LocalVariableName",
    "FunctionName",                     // It's my DSL, idc about conventions
    "SpellCheckingInspection"           // IDEA can't understand nihongo
)

package com.dah.nrs

// custom id counters:
// M-50
// A-1
// L-1
// G-1
// F-1

fun main() =
    generate {
        CommonArtists()
        Vocaloid()
        `K-On`()
        MadokaMagica()
        Idolmaster()
        SwordArtOnline()
        KokoroConnect()
//
//    Anime("Koi to Senkyo to Chocolate", MAL = 12175) {
//        // iirc i liked this anime's plot
//        NEI(1.0, Emotion.AP)
//        Boredom(Boredom.Completed)
//    }
//
//    Anime("Hyouka", MAL = 12189) {
//        // ig it's kinda good
//        NEI(0.75, Emotion.AP)
//        Boredom(Boredom.Completed)
//    }
//
        Sakurasou()
        Chuunibyou()
        Oregairu()
        LoveLive()
        AOT()
        NagiAsu()
        GochiUsa()
//
//    Anime("Ushinawareta Mirai wo Motomete", MAL = 21845) {
//        // kaomeme
//        bestGirl = "Sasaki Kaori"
//        // Ending did hit me
//        NEI(1.25, Emotion.CU)
//        // osuhow memes
//        // This anime saved me in the Math Qualifiers lmao,
//        // and VMO2020 too.
//        Meme(0.3, Meme.M1_2Weeks)
//
//        Boredom(Boredom.Completed)
//    }
//
        SoraMethod()
        YLIA()
        Saekano()
        GakkouGurashi()
        YuYuYu()
        SB69()
        YamadaKun()
        Charlotte()
//
//    Anime("Koe no Katachi", MAL = 28851) {
//        bestGirl = "Nishimiya Shouko"
//        // Koe no Katachi has solid drama
//        // But sadly, it's the first anime so there's no PADS
//        // or tears
//        AEI(3.0, Emotion.CU)
//
//        // the first anime + Giap-Ngoc match = unlimited memes
//        Meme(1.0, Meme.MMoreThan3Months)
//
//        // gate-open literally all NRS entries
//        // but it's too overkill so an impact instead
//        Impact("Gate-open anime", Additional.AdditionalFactor, 1.0)
//        Boredom(Boredom.Completed)
//    }
//
//    Anime("Kono Bijutsubu ni wa Mondai ga Aru!", MAL = 31952) {
//        bestGirl = "Usami Mizuki"
//        Boredom(Boredom.Completed)
//    }
//
        KimiNawa()
//
//    Anime("Orange", MAL = 32729) {
//        bestGirl = "Takamiya Naho"
//
//        // from nrs1
//        AEI(2.5, Emotion.CU)
//        Boredom(Boredom.Completed)
//    }
//
        KobayashiMaidDragon()
        NewGame()
        Bandori()
//
//    Anime("Gabriel DropOut", MAL = 33731) {
//        bestGirl = "Satanichia Kurumizawa McDowell"
//        // iToddlers BTFO
//        Meme(0.4, Meme.M3Weeks_1Month)
//
//        Boredom(Boredom.Completed)
//    }
//
//    Anime("Shelter", MAL = 34240) {
//        bestGirl = "Rin"
//
//        // catJAM
//        Music(1.25)
//
//        Impact("Short anime buff", Additional.AdditionalFactor, 0.75)
//
//        // this is very sad guys
//        // no pads tho
//        Cry(Emotion.CU)
//        Boredom(Boredom.Completed)
//    }
//
//    Anime("Gamers!", MAL = 34280) {
//        seasonal = true // iirc
//
//        bestGirl = "Tendou Karen"
//
//        Boredom(Boredom.Completed)
//    }
//
        OneRoom()
        UchiageHanabi()
//
//    Anime("Tsuki ga Kirei", MAL = 34822) {
//        bestGirl = "Mizuno Akane"
//        // ending sadge
//        AEI(2.5, Emotion.CU)
//        Boredom(Boredom.Completed)
//    }
//
//    Anime("Konohana Kitan", MAL = 35241) {
//        // definitely not reminding me of mashu mashu from sb69
//
//        // this was pretty boring ngl
//        // and now it's the duopoly era so
//        // they got cucked
//        status = EntryStatus.Watching
//        Boredom(Boredom.TempOnHold)
//    }
//
//    Anime("Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e (TV)", MAL = 35507) {
//        bestGirl = "Horikita Suzune"
//        Boredom(Boredom.Completed)
//        // plot pretty good
//        NEI(2.0, Emotion.AP)
//    }
//
        ReStage()
        OnsenMusume()
        Kano()

        Cue()
        Irodori()
        JMetal()
        OsuGame()
        TariTari()
    }.run {}

