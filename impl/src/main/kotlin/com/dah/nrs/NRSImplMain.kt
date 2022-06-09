@file:Suppress(
    "LocalVariableName",
    "FunctionName",                     // It's my DSL, idc about conventions
    "SpellCheckingInspection"           // IDEA can't understand nihongo
)

package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import com.dah.nrs.meme.Method
import com.dah.nrs.seasonal.Spring2022

// custom id counters:
// M-60
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

        Entry {
            id = "A-MAL-12175"
            title = "Koi to Senkyo to Chocolate"

            // iirc i liked this anime's plot
            AEI(3.0, Emotion.AP)
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-12189"
            title = "Hyouka"

            // ig it's kinda good
            NEI(3.0, Emotion.AP)
            Boredom(Boredom.Completed)
        }

        Sakurasou()
        Chuunibyou()
        Oregairu()
        LoveLive()
        AOT()
        NagiAsu()
        GochiUsa()

        Entry {
            id = "A-MAL-21845"
            title = "Ushinawareta Mirai wo Motomete"

            // kaomeme
            bestGirl = "Sasaki Kaori"
            // Ending did hit me
            NEI(5.0, Emotion.CU)
            // osuhow memes
            // This anime saved me in the Math Qualifiers lmao,
            // and VMO2020 too.
            Meme(0.3, 10)

            Boredom(Boredom.Completed)
        }

        SoraMethod()
        YLIA()
        Saekano()
        GakkouGurashi()
        YuYuYu()
        SB69()
        YamadaKun()
        Charlotte()

        Entry {
            id = "A-MAL-28851"
            title = "Koe no Katachi"

            bestGirl = "Nishimiya Shouko"
            // Koe no Katachi has solid drama
            // But sadly, it's the first anime so there's no PADS
            // or tears
            AEI(3.0, Emotion.CU)

            // the first anime + Giap-Ngoc match = unlimited memes
            Meme(1.0, numDays("2017-05-12" /*vietnamese priemier date*/, "2017-09-15" /*sln*/))

            // gate-open literally all NRS entries
            // but it's too overkill so an impact instead
            AdditionalImpact("Gate-open anime", 1.0)
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-31952"
            title = "Kono Bijutsubu ni wa Mondai ga Aru!"

            bestGirl = "Usami Mizuki"
            Boredom(Boredom.Completed)
        }

        KimiNawa()

        Entry {
            id = "A-MAL-32729"
            title = "Orange"

            bestGirl = "Takamiya Naho"

            // from nrs1
            AEI(2.5, Emotion.CU)
            Boredom(Boredom.Completed)
        }

        KobayashiMaidDragon()
        NewGame()
        Bandori()

        Entry {
            id = "A-MAL-33731"
            title = "Gabriel DropOut"

            bestGirl = "Satanichia Kurumizawa McDowell"
            // iToddlers BTFO
            Meme(0.4, 25)

            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-34240"
            title = "Shelter"

            bestGirl = "Rin"

            // catJAM
            Music(4.5)

            AdditionalImpact("Short anime buff", 0.75)

            // this is very sad guys
            // no pads tho
            Cry(Emotion.CU)
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-34280"
            title = "Gamers!"

            seasonal = true // iirc

            bestGirl = "Tendou Karen"

            Boredom(Boredom.Completed)
        }

        OneRoom()
        UchiageHanabi()

        Entry {
            id = "A-MAL-34822"
            title = "Tsuki ga Kirei"

            bestGirl = "Mizuno Akane"
            // ending sadge
            AEI(2.5, Emotion.CU)
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-35241"
            title = "Konohana Kitan"

            // definitely not reminding me of mashu mashu from sb69

            // this was pretty boring ngl
            // and now it's the duopoly era so
            // they got cucked
//            status = EntryStatus.Watching
            Boredom(Boredom.TempOnHold)
        }

        Entry {
            id = "A-MAL-35507"
            title = "Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e (TV)"

            bestGirl = "Horikita Suzune"
            Boredom(Boredom.Completed)
            // plot pretty good
            AEI(5.0, Emotion.AP)
        }

        JustBecause()

        Entry {
            id = "A-MAL-35756"
            title = "Comic Girls"

            Boredom(Boredom.Completed)
            NEI(2.0, Emotion.AP)
        }

        ReStage()
        OnsenMusume()
        LapisReLights()
        Kano()

        Cue()
        Irodori()
        JMetal()
        OsuGame()
        TariTari()
        SelePro()

        Spring2022()
        WakeUpGirls()
        Method()
    }.run {}

