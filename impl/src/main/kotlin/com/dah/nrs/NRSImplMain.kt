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
// M-67
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

        Entry {
            id = "A-MAL-38656"    // generated
            idMAL = 38656
            idAniList = 105190
            idKitsu = 42260
            idAniDB = 14476
            title = "Darwin's Game"
            bestGirl = "Karino Shuka"
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.3, 0.4)
            // "plot is good"
            AEI(5.0, Emotion.AP)
        }

        Entry {
            id = "A-MAL-38659"    // generated
            idMAL = 38659
            idAniList = 105156
            idKitsu = 42079
            idAniDB = 14477
            title = "Shinchou Yuusha: Kono Yuusha ga Ore Tsueee Kuse ni Shinchou Sugiru"
            // very funny lmao
            AEI(5.0, Emotion.AP)
            // restep sequel leaked no way
            bestGirl = "Ristarte"
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        AoChan()

        Entry {
            id = "A-MAL-38790"    // generated
            idMAL = 38790
            idAniList = 106479
            idKitsu = 42043
            idAniDB = 14523
            title = "Itai no wa Iya nano de Bougyoryoku ni Kyokufuri Shitai to Omoimasu."
            bestGirl = "Maple"

            KilledBy("F-VGMDB-1945", 0.2, 0.5)
            Progress(Boredom.Dropped, 2)
            Visual(VisualKind.Animated, 0.5, 0.2)
        }

        HelloWorld()
        RikeKoi()

        Entry {
            id = "A-MAL-39324"    // generated
            idMAL = 39324
            idAniList = 107956
            idKitsu = 42203
            idAniDB = 14693
            title = "Uchi no Ko no Tame naraba, Ore wa Moshikashitara Maou mo Taoseru kamo Shirenai."
            bestGirl = "Latina"

            Progress(Boredom.Dropped, 4)
            Visual(VisualKind.Animated, 0.4, 0.4)
        }

        KoisuruAsteroid()
        AscendanceBookworm()

        Entry {
            id = "A-MAL-39523"    // generated
            idMAL = 39523
            idAniList = 108388
            idKitsu = 42222
            idAniDB = 14750
            title = "Choujin Koukousei-tachi wa Isekai demo Yoyuu de Ikinuku you desu!"

            // rst girl vs akm girl lol
            bestGirl = "Sarutobi Shinobu"

            // also akari kito ed wtf
            // and the op is that osu song
            // imagine if this was in summer 2022

            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        D4DJ()

        Entry {
            id = "A-MAL-39790"    // generated
            idMAL = 39790
            idAniList = 109287
            idKitsu = 42342
            idAniDB = 14904
            title = "Adachi to Shimamura"
            bestGirl = "Shimamura Hougetsu"

            Progress(Boredom.TempOnHold, 3)
            Visual(VisualKind.Animated, 0.65, 0.3)

            // "A PADS about freedomism
            // (basically I want to be like the girls,
            // skipping out class etc.)"
            // ADA foreshadowing lol
            PADS(2, Emotion.CP)
            KilledBy("F-VGMDB-2588", 0.75, 0.3)
        }

        Entry {
            id = "A-MAL-40550"    // generated
            idMAL = 40550
            idAniList = 112479
            idKitsu = 42625
            idAniDB = 15156
            title = "Assault Lily: Bouquet"
            bestGirl = "Shirai Yuyu" // himekek my beloved
            bestGirl = "Wang Yujia" // noway it's the kimi no rhapsody girl
            bestGirl = "Yoshimura Thi Mai" // top kek

            // in all seriousness, this is quite good.
            // the 2 main girls are pretty match
            // thank you based shaft
            Visual(VisualKind.Animated, 0.6, 0.3)
            Progress(Boredom.Completed)
            FeatureMusic("M-VGMDB-AL-101643-1")
        }

        Entry {
            id = "A-MAL-40571"    // generated
            idMAL = 40571
            idAniList = 112609
            idKitsu = 42627
            idAniDB = 15202
            title = "Majo no Tabitabi"
            bestGirl = "Elaina"

            Visual(VisualKind.Animated, 0.4, 0.3)
            Progress(Boredom.Dropped, 6)
            KilledBy("F-VGMDB-2588", 0.5, 0.5)
        }

        Entry {
            id = "A-MAL-40783"    // generated
            idMAL = 40783
            idAniList = 113570
            idKitsu = 42850
            idAniDB = 15285
            title = "Shachou, Battle no Jikan Desu!"
            // insert hatsune miku joke here
            bestGirl = "Akari"

            // the hatsune miku method
            AEI(2.0, Emotion.AP)
            Visual(VisualKind.Animated, 0.3, 0.3)
            Progress(Boredom.Completed)
        }

        RentAGirlfriend()
        ToniKawa()

        Entry {
            id = "A-MAL-41619"    // generated
            idMAL = 41619
            idAniList = 117343
            idKitsu = 43534
            idAniDB = 15492
            title = "Munou na Nana"
            bestGirl = "Hiiragi Nana"

            Visual(VisualKind.Animated, 0.4, 0.5)
            Progress(Boredom.Completed)
            KilledBy("F-VGMDB-2588", 0.5, 0.3)
            // plot is very good
            AEI(4.0, Emotion.AP)
        }

        Entry {
            id = "A-MAL-41930"    // generated
            idMAL = 41930
            idAniList = 118419
            idKitsu = 43204
            idAniDB = 15559
            title = "Kamisama ni Natta Hi"
            bestGirl = "Izanami Kyouko"

            Visual(VisualKind.Animated, 0.6, 0.4)
            Progress(Boredom.Dropped, 4)
            KilledBy("F-VGMDB-2588", 0.6, 0.5)
        }

        Aipura()
        Tanmoshi()

        Entry {
            id = "A-MAL-43969"    // generated
            idMAL = 43969
            idAniList = 126192
            idKitsu = 44165
            idAniDB = 15851
            title = "Kanojo mo Kanojo"
            // this is one of the only rom-coms that is
            // watched in the post-MagiReco era, which is
            // already impressive
            // but that's not enough because MagiReco S2
            // is just too good
            bestGirl = "Saki Saki"
            Visual(VisualKind.Animated, 0.4, 0.4)
            Progress(Boredom.Dropped, 5)
            KilledBy("A-MAL-41530", 0.2, 0.5)
        }

        Entry {
            id = "A-MAL-46093"    // generated
            idMAL = 46093
            idAniList = 128545
            idKitsu = 44116
            idAniDB = 15987
            title = "Shiroi Suna no Aquatope"
            bestGirl = "Miyazawa Fuuka"

            // idk tf this anime is talking about lol
            Visual(VisualKind.Animated, 0.3, 0.7)
            Progress(Boredom.Dropped, 16)
            KilledBy("A-MAL-41530", 0.1, 0.4)
        }

        Entry {
            id = "A-MAL-40904"    // generated
            idMAL = 40904
            idAniList = 114065
            idKitsu = 42924
            idAniDB = 15320
            title = "Bokutachi no Remake"
            bestGirl = "Kawasegawa Eiko"
            // this was expected to be a good compoly
            // anime, but it doesn't care about that
            // and just march on with its plot
            Visual(VisualKind.Animated, 0.5, 0.3)
            Progress(Boredom.Completed)
            KilledBy("A-MAL-41530", 0.2, 0.2)
            FeatureMusic("M-VGMDB-AL-111089-5")
        }

        Entry {
            id = "A-MAL-44203"    // generated
            idMAL = 44203
            idAniList = 126546
            idKitsu = 44174
            idAniDB = 15875
            title = "Seirei Gensouki"
            // kimi no rhapsody girl
            bestGirl = "Claire Celia"

            // the hoan tinh anime pt.1
            // from ep 5 to 10 there's no hoan tinh madge
            Progress(Boredom.PartiallyDropped(0.25))
            Visual(VisualKind.Animated, 0.6, 0.4)
            KilledBy("A-MAL-41530", 0.1, 0.3)

            // lol
            AEI(5.0, Emotion.AU to 0.5, Emotion.AP to 0.5)
        }

        Entry {
            id = "A-MAL-47790"    // generated
            idMAL = 47790
            idAniList = 129898
            idKitsu = 44393
            idAniDB = 16055
            title = "Sekai Saikou no Ansatsusha, Isekai Kizoku ni Tensei suru"
            bestGirl = "Dia" // *insert love live sunshine joke*

            Progress(Boredom.Dropped, 6)
            Visual(VisualKind.Animated, 0.5, 0.4)
            KilledBy("F-VGMDB-3245", 0.1, 0.2)
            KilledBy("F-VGMDB-7059", 0.1, 0.2)
            NEI(8.0, Emotion.AP to 1.0)
        }

        Entry {
            id = "A-MAL-48483"    // generated
            idMAL = 48483
            idAniList = 131083
            idKitsu = 44185
            idAniDB = 16132
            title = "Mieruko-chan"

            // "babe pls have sex with me im so horny"
            // "haha the ortensia incident"
            bestGirl = "Yotsuya Kyousuke"

            Progress(Boredom.Dropped, 5)
            Visual(VisualKind.Animated, 0.3, 0.6)
            KilledBy("F-VGMDB-3245", 0.2, 0.2)
            KilledBy("F-VGMDB-7059", 0.2, 0.2)
        }

        Entry {
            id = "A-MAL-48644"    // generated
            idMAL = 48644
            idAniList = 131878
            idKitsu = 44300
            idAniDB = 16184
            title = "Gyakuten Sekai no Denchi Shoujo"
            bestGirl = "Akagi Rin"

            // denchi shoujo my fucking beloved wtf i love this so fking much
            AEI(5.0, Emotion.MP to 0.5, Emotion.AP to 0.5)
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.3)
            KilledBy("F-VGMDB-3245", 0.3, 0.15)
            KilledBy("F-VGMDB-7059", 0.3, 0.15)
        }

        Tenshi3P()

        Entry {
            id = "A-MAL-17919"    // generated
            idMAL = 17919
            idAniList = 17919
            idKitsu = 7713
            idAniDB = 10958
            title = "Houkago no Pleiades (TV)"
            bestGirl = "Subaru" // ofc it has to be mc

            // didn't expect mc to fall in love tho
            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.5, 0.2)
            FeatureMusic("M-VGMDB-AL-51254-1")
        }

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

