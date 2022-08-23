@file:Suppress(
    "LocalVariableName",
    "FunctionName",                     // It's my DSL, idc about conventions
    "SpellCheckingInspection"           // IDEA can't understand nihongo
)

package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import com.dah.nrs.meme.MVLiterature
import com.dah.nrs.meme.Method
import com.dah.nrs.seasonal.Spring2022
import com.dah.nrs.seasonal.Summer2022

// custom id counters:
// M-66
// A-1
// L-1
// G-1
// F-2
// O-5

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
            id = "A-MAL-12175"    // generated
            idMAL = 12175
            idAniList = 12175
            idAniDB = 8820
            idKitsu = 6682
            title = "Koi to Senkyo to Chocolate"
            bestGirl = "Chisato Sumiyoshi"

            // iirc i liked this anime's plot
            AEI(3.0, Emotion.AP)
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.3, 0.4)
        }

        Entry {
            id = "A-MAL-12189"    // generated
            idMAL = 12189
            idAniList = 12189
            idAniDB = 8855
            idKitsu = 6686
            title = "Hyouka"
            bestGirl = "Chitanda Eru"

            // ig it's kinda good
            NEI(3.0, Emotion.AP)
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.5, 0.5)
        }

        Sakurasou()
        Chuunibyou()
        Oregairu()
        LoveLive()
        AOT()
        NagiAsu()
        GochiUsa()

        Entry {
            id = "A-MAL-21845"    // generated
            idMAL = 21845
            idAniList = 20591
            idAniDB = 10372
            idKitsu = 8199
            title = "Ushinawareta Mirai wo Motomete"

            // kaomeme
            bestGirl = "Sasaki Kaori"
            // Ending did hit me
            NEI(5.0, Emotion.CU)
            // osuhow memes
            // This anime saved me in the Math Qualifiers lmao,
            // and VMO2020 too.
            Meme(0.3, 10)

            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.3, 0.4)
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
            id = "A-MAL-28851"    // generated
            idMAL = 28851
            idAniList = 20954
            idAniDB = 10937
            idKitsu = 10028
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
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.5, 0.5)
        }

        Entry {
            id = "A-MAL-31952"    // generated
            idMAL = 31952
            idAniList = 21457
            idAniDB = 11735
            idKitsu = 11466
            title = "Kono Bijutsubu ni wa Mondai ga Aru!"

            bestGirl = "Usami Mizuki"
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        KimiNawa()

        Entry {
            id = "A-MAL-32729"    // generated
            idMAL = 32729
            idAniList = 21647
            idAniDB = 11938
            idKitsu = 11844
            title = "Orange"

            bestGirl = "Takamiya Naho"

            // from nrs1
            AEI(2.5, Emotion.CU)
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.3, 0.5)
        }

        KobayashiMaidDragon()
        NewGame()
        Bandori()

        Entry {
            id = "A-MAL-33731"    // generated
            idMAL = 33731
            idAniList = 21878
            idAniDB = 12290
            idKitsu = 12497
            title = "Gabriel DropOut"

            bestGirl = "Satanichia Kurumizawa McDowell"
            // iToddlers BTFO
            Meme(0.4, 25)

            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.6, 0.4)
        }

        Entry {
            id = "A-MAL-34240"    // generated
            idMAL = 34240
            idAniList = 97731
            idAniDB = 12482
            idKitsu = 12668
            title = "Shelter"

            bestGirl = "Rin"

            // catJAM
            Music(6.0)

            AdditionalImpact("Short anime buff", 0.75)

            // this is very sad guys
            // no pads tho
            Cry(Emotion.CU)
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.65, 0.35)
        }

        Entry {
            id = "A-MAL-34280"    // generated
            idMAL = 34280
            idAniList = 97766
            idAniDB = 12494
            idKitsu = 12754
            title = "Gamers!"

            seasonal = true // iirc

            bestGirl = "Tendou Karen"

            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.6, 0.3)
        }

        OneRoom()
        UchiageHanabi()

        Entry {
            id = "A-MAL-34822"    // generated
            idMAL = 34822
            idAniList = 98202
            idAniDB = 12761
            idKitsu = 13234
            title = "Tsuki ga Kirei"

            bestGirl = "Mizuno Akane"
            // ending sadge
            AEI(2.5, Emotion.CU)
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.3, 0.5)
        }

        Entry {
            id = "A-MAL-35241"    // generated
            idMAL = 35241
            idAniList = 98506
            idAniDB = 13030
            idKitsu = 13752
            title = "Konohana Kitan"
            bestGirl = "Natsume" // rst girl my beloved

            // definitely not reminding me of mashu mashu from sb69

            // this was pretty boring ngl
            // and now it's the duopoly era so
            // they got cucked
//            status = EntryStatus.Watching
            Progress(Boredom.TempOnHold, 3)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        COTE()
        JustBecause()

        Entry {
            id = "A-MAL-35756"    // generated
            idMAL = 35756
            idAniList = 99131
            idAniDB = 13238
            idKitsu = 13722
            title = "Comic Girls"
            bestGirl = "Kaoruko Moeta"

            Progress(Boredom.Completed)
            NEI(2.0, Emotion.AP)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        TateYuusha()
        SoraYori()

        Entry {
            id = "A-MAL-35860"    // generated
            idMAL = 35860
            idAniList = 99468
            idAniDB = 13270
            idKitsu = 13635
            title = "Karakai Jouzu no Takagi-san"

            bestGirl = "Takagi"

            // episodic ngl
            Progress(Boredom.Dropped)
            ValidatorSuppress("dah-uncompleted-no-progress")
            Visual(VisualKind.Animated, 0.3, 0.4)
        }

        Entry {
            id = "A-MAL-36038"    // generated
            idMAL = 36038
            idAniList = 99726
            idAniDB = 13345
            idKitsu = 13703
            title = "Net-juu no Susume"

            // lmfao
            bestGirl = "Washing Machine"

            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.3, 0.4)
        }

        Entry {
            id = "A-MAL-36098"    // generated
            idMAL = 36098
            idAniList = 99750
            idAniDB = 13363
            idKitsu = 13723
            title = "Kimi no Suizou wo Tabetai"

            // facebook anime lmfao
            bestGirl = "Yamauchi Sakura"

            Progress(Boredom.Completed)
            AEI(1.0, Emotion.CU)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        Entry {
            id = "A-MAL-36266"    // generated
            idMAL = 36266
            idAniList = 100010
            idAniDB = 13424
            idKitsu = 14137
            title = "Mahou Shoujo Site"

            bestGirl = "Asagiri Aya"

            // poor best girl
            AEI(2.0, Emotion.CU)

            // sad ending (i don't remember now lmfao)
            AEI(5.0, Emotion.CU)
            Visual(VisualKind.Animated, 0.4, 0.5)
            Progress(Boredom.Completed)
        }

        ShichiseiSubaru()
        Arifureta()
        CellAtWork()
        Kaguya()
        BunnyGirlSenpai()
        SthKara()

        ReStage()
        OnsenMusume()
        LapisReLights()

        Entry {
            id = "A-MAL-37744"    // generated
            idMAL = 37744
            idAniList = 101547
            idKitsu = 42319
            idAniDB = 14038
            title = "Isekai Cheat Magician"
            bestGirl = "Azuma Rin"

            Progress(Boredom.Dropped, 8)
            Visual(VisualKind.Animated, 0.6, 0.2)
        }

        Entry {
            id = "A-MAL-37926"    // generated
            idMAL = 37926
            idAniList = 102926
            idKitsu = 41336
            idAniDB = 14100
            title = "Nakanohito Genome [Jikkyouchuu]"
            bestGirl = "Sarayashiki Karin"
            // akari kito va lmfao

            Progress(Boredom.Completed)
            // this was funny af (iirc), really enjoyed it
            AEI(6.0, Emotion.AP)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        ZombielandSaga()

        Entry {
            id = "A-MAL-37982"    // generated
            idMAL = 37982
            idAniList = 103139
            idKitsu = 41479
            idAniDB = 14213
            title = "Domestic na Kanojo"
            // the domestic na kanojo war lmao
            bestGirl = "Tachibana Hina"

            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.3, 0.5)
        }

        Gotoubun()
        Bokuben()
        IsekaiQuartet()

        Kano()

        Aokana()
        ATRI()

        Cue()
        Irodori()
        JMetal()
        OsuGame()
        TariTari()
        SelePro()

        Spring2022()
        WakeUpGirls()
        Method()
        MVLiterature()
        Atelier()

        Entry {
            id = "A-MAL-35589"    // generated
            idMAL = 35589
            idAniList = 98747
            idAniDB = 13172
            idKitsu = 13710
            title = "Toji no Miko"

            bestGirl = "Tagitsuhime"
            // i hate my life

            Progress(Boredom.Completed)

            // decent plot ngl
            NEI(8.0, Emotion.AP)
            Visual(VisualKind.Animated, 0.5, 0.4)
        }

        Summer2022()
    }.run {}

