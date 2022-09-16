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
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

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
            id = "A-MAL-12175"
            bestGirl = "Chisato Sumiyoshi"

            // iirc i liked this anime's plot
            AEI(3.0, Emotion.AP)
            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.3, 0.4)
        }

        Entry {
            id = "A-MAL-12189"
            bestGirl = "Chitanda Eru"

            // ig it's kinda good
            NEI(3.0, Emotion.AP)
            AnimeProgressOld(Boredom.Completed, 22)
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
            id = "A-MAL-21845"

            // kaomeme
            bestGirl = "Sasaki Kaori"
            // Ending did hit me
            NEI(5.0, Emotion.CU)
            // osuhow memes
            // This anime saved me in the Math Qualifiers lmao,
            // and VMO2020 too.
            Meme(0.3, 10)

            AnimeProgressOld(Boredom.Completed, 12)
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
            id = "A-MAL-28851"

            bestGirl = "Nishimiya Shouko"
            // Koe no Katachi has solid drama
            // But sadly, it's the first anime so there's no PADS
            // or tears
            AEI(3.0, Emotion.CU)

            // the first anime + Giap-Ngoc match = unlimited memes
            Meme(1.0, numDays("2017-05-12" /*vietnamese premiere date*/, "2017-09-15" /*sln*/))

            // gate-open literally all NRS entries
            // but it's too overkill so an impact instead
            AdditionalImpact("Gate-open anime", 1.0)
            AnimeProgressOld(Boredom.Completed, 1)
            Visual(VisualKind.Animated, 0.5, 0.5)
        }

        Entry {
            id = "A-MAL-31952"

            bestGirl = "Usami Mizuki"
            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        ShinkaiMovies()

        Entry {
            id = "A-MAL-32729"

            bestGirl = "Takamiya Naho"

            // from nrs1
            AEI(2.5, Emotion.CU)
            AnimeProgressOld(Boredom.Completed, 13)
            Visual(VisualKind.Animated, 0.3, 0.5)
        }

        KobayashiMaidDragon()
        NewGame()
        Bandori()

        Entry {
            id = "A-MAL-33731"

            bestGirl = "Satanichia Kurumizawa McDowell"
            // iToddlers BTFO
            Meme(0.4, 25)

            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.6, 0.4)
        }

        Entry {
            id = "A-MAL-34240"

            bestGirl = "Rin"

            // catJAM
            Music(6.0)

            AdditionalImpact("Short anime buff", 0.75)

            // this is very sad guys
            // no pads tho
            Cry(Emotion.CU)
            // https://www.youtube.com/watch?v=fzQ6gRAEoy0
            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 1, 6.minutes + 6.seconds)
            Visual(VisualKind.Animated, 0.65, 0.35)
        }

        Entry {
            id = "A-MAL-34280"

            seasonal = true // iirc

            bestGirl = "Tendou Karen"

            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.6, 0.3)
        }

        OneRoom()
        UchiageHanabi()

        Entry {
            id = "A-MAL-34822"

            bestGirl = "Mizuno Akane"
            // ending sadge
            AEI(2.5, Emotion.CU)
            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.3, 0.5)
        }

        Entry {
            id = "A-MAL-35241"
            bestGirl = "Natsume" // rst girl my beloved

            // definitely not reminding me of mashu mashu from sb69

            // this was pretty boring ngl
            // and now it's the duopoly era so
            // they got cucked
//            status = EntryStatus.Watching
            AnimeProgressOld(Boredom.TempOnHold, 3)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        COTE()
        JustBecause()

        Entry {
            id = "A-MAL-35756"
            bestGirl = "Kaoruko Moeta"

            AnimeProgressOld(Boredom.Completed, 12)
            NEI(2.0, Emotion.AP)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        TateYuusha()
        SoraYori()

        Entry {
            id = "A-MAL-35860"

            bestGirl = "Takagi"

            // episodic ngl
            AnimeProgressOld(Boredom.Dropped, 2)
            Visual(VisualKind.Animated, 0.3, 0.4)
        }

        Entry {
            id = "A-MAL-36038"

            // lmfao
            bestGirl = "Washing Machine"

            AnimeProgressOld(Boredom.Completed, 10)
            Visual(VisualKind.Animated, 0.3, 0.4)
        }

        Entry {
            id = "A-MAL-36098"

            // facebook anime lmfao
            bestGirl = "Yamauchi Sakura"

            AnimeProgressOld(Boredom.Completed, 1)
            AEI(1.0, Emotion.CU)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        Entry {
            id = "A-MAL-36266"

            bestGirl = "Asagiri Aya"

            // poor best girl
            AEI(2.0, Emotion.CU)

            // sad ending (i don't remember now lmfao)
            AEI(5.0, Emotion.CU)
            Visual(VisualKind.Animated, 0.4, 0.5)
            AnimeProgressOld(Boredom.Completed, 12)
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
            id = "A-MAL-37744"
            bestGirl = "Azuma Rin"

            AnimeProgressOld(Boredom.Dropped, 8)
            Visual(VisualKind.Animated, 0.6, 0.2)
        }

        Entry {
            id = "A-MAL-37926"
            bestGirl = "Sarayashiki Karin"
            // akari kito va lmfao

            AnimeProgressOld(Boredom.Completed, 12)
            // this was funny af (iirc), really enjoyed it
            AEI(6.0, Emotion.AP)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        ZombielandSaga()

        Entry {
            id = "A-MAL-37982"
            bestGirl = "Tachibana Hina"

            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.3, 0.5)

            // the domestic na kanojo war lmao
            Meme(0.8, 90)
        }

        Gotoubun()
        Bokuben()
        IsekaiQuartet()
        DrStone()

        Entry {
            id = "A-MAL-38656"
            bestGirl = "Karino Shuka"
            AnimeProgressOld(Boredom.Completed, 11)
            Visual(VisualKind.Animated, 0.3, 0.4)
            // "plot is good"
            AEI(5.0, Emotion.AP)
        }

        Entry {
            id = "A-MAL-38659"
            // very funny lmao
            AEI(5.0, Emotion.AP)
            // restep sequel leaked no way
            bestGirl = "Ristarte"
            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        AoChan()

        Entry {
            id = "A-MAL-38790"
            bestGirl = "Maple"

            KilledBy("F-VGMDB-1945", 0.2, 0.5)
            AnimeProgressOld(Boredom.Dropped, 2)
            Visual(VisualKind.Animated, 0.5, 0.2)
        }

        HelloWorld()
        RikeKoi()

        Entry {
            id = "A-MAL-39324"
            bestGirl = "Latina"

            AnimeProgressOld(Boredom.Dropped, 4)
            Visual(VisualKind.Animated, 0.4, 0.4)
        }

        KoisuruAsteroid()
        AscendanceBookworm()

        Entry {
            id = "A-MAL-39523"

            // rst girl vs akm girl lol
            bestGirl = "Sarutobi Shinobu"

            // also akari kito ed wtf
            // and the op is that osu song
            // imagine if this was in summer 2022

            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        D4DJ()

        Entry {
            id = "A-MAL-39790"
            bestGirl = "Shimamura Hougetsu"

            AnimeProgressOld(Boredom.TempOnHold, 3)
            Visual(VisualKind.Animated, 0.65, 0.3)

            // "A PADS about freedomism
            // (basically I want to be like the girls,
            // skipping out class etc.)"
            // ADA foreshadowing lol
            PADS(2, Emotion.CP)
            KilledBy("F-VGMDB-2588", 0.75, 0.3)
        }

        Entry {
            id = "A-MAL-40550"
            bestGirl = "Shirai Yuyu" // himekek my beloved
            bestGirl = "Wang Yujia" // noway it's the kimi no rhapsody girl
            bestGirl = "Yoshimura Thi Mai" // top kek

            // in all seriousness, this is quite good.
            // the 2 main girls are pretty match
            // thank you based shaft
            Visual(VisualKind.Animated, 0.6, 0.3)
            AnimeProgressOld(Boredom.Completed, 12)
            FeatureMusic("M-VGMDB-AL-101643-1")
        }

        Entry {
            id = "A-MAL-40571"
            bestGirl = "Elaina"

            Visual(VisualKind.Animated, 0.4, 0.3)
            AnimeProgressOld(Boredom.Dropped, 6)
            KilledBy("F-VGMDB-2588", 0.5, 0.5)
        }

        Entry {
            id = "A-MAL-40783"
            // insert hatsune miku joke here
            bestGirl = "Akari"

            // the hatsune miku method
            AEI(2.0, Emotion.AP)
            Visual(VisualKind.Animated, 0.3, 0.3)
            AnimeProgressOld(Boredom.Completed, 12)
        }

        RentAGirlfriend()
        ToniKawa()

        Entry {
            id = "A-MAL-41619"
            bestGirl = "Hiiragi Nana"

            Visual(VisualKind.Animated, 0.4, 0.5)
            AnimeProgressOld(Boredom.Completed, 13)
            KilledBy("F-VGMDB-2588", 0.5, 0.3)
            // plot is very good
            AEI(4.0, Emotion.AP)
        }

        Entry {
            id = "A-MAL-41930"
            bestGirl = "Izanami Kyouko"

            Visual(VisualKind.Animated, 0.6, 0.4)
            AnimeProgressOld(Boredom.Dropped, 4)
            KilledBy("F-VGMDB-2588", 0.6, 0.5)
        }

        Aipura()
        Tanmoshi()

        Entry {
            id = "A-MAL-43969"
            // this is one of the only rom-coms that is
            // watched in the post-MagiReco era, which is
            // already impressive
            // but that's not enough because MagiReco S2
            // is just too good
            bestGirl = "Saki Saki"
            Visual(VisualKind.Animated, 0.4, 0.4)
            AnimeProgressOld(Boredom.Dropped, 5)
            KilledBy("A-MAL-41530", 0.2, 0.5)
        }

        Entry {
            id = "A-MAL-46093"
            bestGirl = "Miyazawa Fuuka"

            // idk tf this anime is talking about lol
            Visual(VisualKind.Animated, 0.3, 0.7)
            AnimeProgressOld(Boredom.Dropped, 16)
            KilledBy("A-MAL-41530", 0.1, 0.4)
        }

        Entry {
            id = "A-MAL-40904"
            bestGirl = "Kawasegawa Eiko"
            // this was expected to be a good compoly
            // anime, but it doesn't care about that
            // and just march on with its plot
            Visual(VisualKind.Animated, 0.5, 0.3)
            AnimeProgressOld(Boredom.Completed, 12)
            KilledBy("A-MAL-41530", 0.2, 0.2)
            FeatureMusic("M-VGMDB-AL-111089-5")
        }

        Entry {
            id = "A-MAL-44203"
            // kimi no rhapsody girl
            bestGirl = "Claire Celia"

            // the hoan tinh anime pt.1
            // from ep 5 to 10 there's no hoan tinh madge
//            AnimeProgress(Boredom.PartiallyDropped(0.25))
            // i finished ep12, but e5-10 hasn't been watched
            AnimeConsumed(1.0, 6)
            AnimeProgress(EntryStatus.Dropped, 12)
            Dropped()

            Visual(VisualKind.Animated, 0.6, 0.4)
            KilledBy("A-MAL-41530", 0.1, 0.3)

            // lol
            AEI(5.0, Emotion.AU to 0.5, Emotion.AP to 0.5)
        }

        Entry {
            id = "A-MAL-47790"
            bestGirl = "Dia" // *insert love live sunshine joke*

            AnimeProgressOld(Boredom.Dropped, 6)
            Visual(VisualKind.Animated, 0.5, 0.4)
            KilledBy("F-VGMDB-3245", 0.1, 0.2)
            KilledBy("F-VGMDB-7059", 0.1, 0.2)
            NEI(8.0, Emotion.AP to 1.0)
        }

        Entry {
            id = "A-MAL-48483"

            // "babe pls have sex with me im so horny"
            // "haha the ortensia incident"
            bestGirl = "Yotsuya Kyousuke"

            AnimeProgressOld(Boredom.Dropped, 5)
            Visual(VisualKind.Animated, 0.3, 0.6)
            KilledBy("F-VGMDB-3245", 0.2, 0.2)
            KilledBy("F-VGMDB-7059", 0.2, 0.2)
        }

        Entry {
            id = "A-MAL-48644"
            bestGirl = "Akagi Rin"

            // denchi shoujo my fucking beloved wtf i love this so fking much
            AEI(5.0, Emotion.MP to 0.5, Emotion.AP to 0.5)
            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.4, 0.3)
            KilledBy("F-VGMDB-3245", 0.3, 0.15)
            KilledBy("F-VGMDB-7059", 0.3, 0.15)
        }

        Tenshi3P()

        Entry {
            id = "A-MAL-17919"
            bestGirl = "Subaru" // ofc it has to be mc

            // didn't expect mc to fall in love tho
            AnimeProgressOld(Boredom.Completed, 12)
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
            id = "A-MAL-35589"

            bestGirl = "Tagitsuhime"
            // i hate my life

            AnimeProgressOld(Boredom.Completed, 24)

            // decent plot ngl
            NEI(8.0, Emotion.AP)
            Visual(VisualKind.Animated, 0.5, 0.4)
        }

        Summer2022()
        WorldWitches()
    }.run {}

