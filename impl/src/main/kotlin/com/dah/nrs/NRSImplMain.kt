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
            id = "A-MAL-12175"
            title = "Koi to Senkyo to Chocolate" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 12175 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 6682 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 12175 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 12175 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Chisato Sumiyoshi"

            // iirc i liked this anime's plot
            AEI(3.0, Emotion.AP)
            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
            Visual(VisualKind.Animated, 0.3, 0.4)
        }

        Entry {
            id = "A-MAL-12189"
            title = "Hyouka" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 12189 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 6686 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 12189 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 12189 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Chitanda Eru"

            // ig it's kinda good
            NEI(3.0, Emotion.AP)
            Progress(Boredom.Completed, 22) // generated(fill_anime_metadata.dart v0.1.1)
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
            title = "Ushinawareta Mirai wo Motomete" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 21845 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 8199 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20591 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 21845 // generated(fill_anime_metadata.dart v0.1.1)

            // kaomeme
            bestGirl = "Sasaki Kaori"
            // Ending did hit me
            NEI(5.0, Emotion.CU)
            // osuhow memes
            // This anime saved me in the Math Qualifiers lmao,
            // and VMO2020 too.
            Meme(0.3, 10)

            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
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
            title = "Koe no Katachi" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 28851 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 10028 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20954 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 28851 // generated(fill_anime_metadata.dart v0.1.1)

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
            Progress(Boredom.Completed, 1) // generated(fill_anime_metadata.dart v0.1.1)
            Visual(VisualKind.Animated, 0.5, 0.5)
        }

        Entry {
            id = "A-MAL-31952"
            title = "Kono Bijutsubu ni wa Mondai ga Aru!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 31952 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 11466 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21457 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 31952 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Usami Mizuki"
            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        ShinkaiMovies()

        Entry {
            id = "A-MAL-32729"
            title = "Orange" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 32729 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 11844 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21647 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 32729 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Takamiya Naho"

            // from nrs1
            AEI(2.5, Emotion.CU)
            Progress(Boredom.Completed, 13) // generated(fill_anime_metadata.dart v0.1.1)
            Visual(VisualKind.Animated, 0.3, 0.5)
        }

        KobayashiMaidDragon()
        NewGame()
        Bandori()

        Entry {
            id = "A-MAL-33731"
            title = "Gabriel DropOut" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 33731 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 12497 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21878 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 33731 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Satanichia Kurumizawa McDowell"
            // iToddlers BTFO
            Meme(0.4, 25)

            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
            Visual(VisualKind.Animated, 0.6, 0.4)
        }

        Entry {
            id = "A-MAL-34240"
            title = "Shelter (Music)" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 34240 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 12668 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 97731 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 34240 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Rin"

            // catJAM
            Music(6.0)

            AdditionalImpact("Short anime buff", 0.75)

            // this is very sad guys
            // no pads tho
            Cry(Emotion.CU)
            Progress(Boredom.Completed, 1) // generated(fill_anime_metadata.dart v0.1.1)
            Visual(VisualKind.Animated, 0.65, 0.35)
        }

        Entry {
            id = "A-MAL-34280"
            title = "Gamers!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 34280 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 12754 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 97766 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 34280 // generated(fill_anime_metadata.dart v0.1.1)

            seasonal = true // iirc

            bestGirl = "Tendou Karen"

            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
            Visual(VisualKind.Animated, 0.6, 0.3)
        }

        OneRoom()
        UchiageHanabi()

        Entry {
            id = "A-MAL-34822"
            title = "Tsuki ga Kirei" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 34822 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13234 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 98202 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 34822 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Mizuno Akane"
            // ending sadge
            AEI(2.5, Emotion.CU)
            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
            Visual(VisualKind.Animated, 0.3, 0.5)
        }

        Entry {
            id = "A-MAL-35241"
            title = "Konohana Kitan" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 35241 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13752 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 98506 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 35241 // generated(fill_anime_metadata.dart v0.1.1)
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
            id = "A-MAL-35756"
            title = "Comic Girls" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 35756 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13722 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 99131 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 35756 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Kaoruko Moeta"

            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
            NEI(2.0, Emotion.AP)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        TateYuusha()
        SoraYori()

        Entry {
            id = "A-MAL-35860"
            title = "Karakai Jouzu no Takagi-san" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 35860 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13635 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 99468 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 35860 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Takagi"

            // episodic ngl
            Progress(Boredom.Dropped, 12) // generated(fill_anime_metadata.dart v0.1.1)
            ValidatorSuppress("dah-uncompleted-no-progress")
            Visual(VisualKind.Animated, 0.3, 0.4)
        }

        Entry {
            id = "A-MAL-36038"
            title = "Net-juu no Susume" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 36038 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13703 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 99726 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 36038 // generated(fill_anime_metadata.dart v0.1.1)

            // lmfao
            bestGirl = "Washing Machine"

            Progress(Boredom.Completed, 10) // generated(fill_anime_metadata.dart v0.1.1)
            Visual(VisualKind.Animated, 0.3, 0.4)
        }

        Entry {
            id = "A-MAL-36098"
            title = "Kimi no Suizou wo Tabetai" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 36098 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13723 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 99750 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 36098 // generated(fill_anime_metadata.dart v0.1.1)

            // facebook anime lmfao
            bestGirl = "Yamauchi Sakura"

            Progress(Boredom.Completed, 1) // generated(fill_anime_metadata.dart v0.1.1)
            AEI(1.0, Emotion.CU)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        Entry {
            id = "A-MAL-36266"
            title = "Mahou Shoujo Site" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 36266 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 14137 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 100010 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 36266 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Asagiri Aya"

            // poor best girl
            AEI(2.0, Emotion.CU)

            // sad ending (i don't remember now lmfao)
            AEI(5.0, Emotion.CU)
            Visual(VisualKind.Animated, 0.4, 0.5)
            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
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
            title = "Isekai Cheat Magician" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 37744 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42319 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 101547 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 37744 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Azuma Rin"

            Progress(Boredom.Dropped, 8)
            Visual(VisualKind.Animated, 0.6, 0.2)
        }

        Entry {
            id = "A-MAL-37926"
            title = "Nakanohito Genome [Jikkyouchuu]" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 37926 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 41336 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 102926 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 37926 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Sarayashiki Karin"
            // akari kito va lmfao

            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
            // this was funny af (iirc), really enjoyed it
            AEI(6.0, Emotion.AP)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        ZombielandSaga()

        Entry {
            id = "A-MAL-37982"
            title = "Domestic na Kanojo" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 37982 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 41479 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 103139 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 37982 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Tachibana Hina"

            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
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
            title = "Darwin's Game" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38656 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42260 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 105190 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38656 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Karino Shuka"
            Progress(Boredom.Completed, 11) // generated(fill_anime_metadata.dart v0.1.1)
            Visual(VisualKind.Animated, 0.3, 0.4)
            // "plot is good"
            AEI(5.0, Emotion.AP)
        }

        Entry {
            id = "A-MAL-38659"
            title = "Shinchou Yuusha: Kono Yuusha ga Ore Tueee Kuse ni Shinchou Sugiru" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38659 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42079 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 105156 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38659 // generated(fill_anime_metadata.dart v0.1.1)
            // very funny lmao
            AEI(5.0, Emotion.AP)
            // restep sequel leaked no way
            bestGirl = "Ristarte"
            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        AoChan()

        Entry {
            id = "A-MAL-38790"
            title = "Itai no wa Iya nano de Bougyoryoku ni Kyokufuri Shitai to Omoimasu." // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38790 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42043 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 106479 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38790 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Maple"

            KilledBy("F-VGMDB-1945", 0.2, 0.5)
            Progress(Boredom.Dropped, 2)
            Visual(VisualKind.Animated, 0.5, 0.2)
        }

        HelloWorld()
        RikeKoi()

        Entry {
            id = "A-MAL-39324"
            title = "Uchi no Ko no Tame naraba, Ore wa Moshikashitara Maou mo Taoseru kamo Shirenai." // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 39324 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42203 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 107956 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 39324 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Latina"

            Progress(Boredom.Dropped, 4)
            Visual(VisualKind.Animated, 0.4, 0.4)
        }

        KoisuruAsteroid()
        AscendanceBookworm()

        Entry {
            id = "A-MAL-39523"
            title = "Choujin Koukousei-tachi wa Isekai demo Yoyuu de Ikinuku you desu!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 39523 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42222 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 108388 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 39523 // generated(fill_anime_metadata.dart v0.1.1)

            // rst girl vs akm girl lol
            bestGirl = "Sarutobi Shinobu"

            // also akari kito ed wtf
            // and the op is that osu song
            // imagine if this was in summer 2022

            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        D4DJ()

        Entry {
            id = "A-MAL-39790"
            title = "Adachi to Shimamura" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 39790 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42342 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 109287 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 39790 // generated(fill_anime_metadata.dart v0.1.1)
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
            id = "A-MAL-40550"
            title = "Assault Lily: Bouquet" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 40550 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42625 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 112479 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 40550 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Shirai Yuyu" // himekek my beloved
            bestGirl = "Wang Yujia" // noway it's the kimi no rhapsody girl
            bestGirl = "Yoshimura Thi Mai" // top kek

            // in all seriousness, this is quite good.
            // the 2 main girls are pretty match
            // thank you based shaft
            Visual(VisualKind.Animated, 0.6, 0.3)
            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
            FeatureMusic("M-VGMDB-AL-101643-1")
        }

        Entry {
            id = "A-MAL-40571"
            title = "Majo no Tabitabi" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 40571 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42627 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 112609 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 40571 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Elaina"

            Visual(VisualKind.Animated, 0.4, 0.3)
            Progress(Boredom.Dropped, 6)
            KilledBy("F-VGMDB-2588", 0.5, 0.5)
        }

        Entry {
            id = "A-MAL-40783"
            title = "Shachou, Battle no Jikan Desu!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 40783 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42850 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 113570 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 40783 // generated(fill_anime_metadata.dart v0.1.1)
            // insert hatsune miku joke here
            bestGirl = "Akari"

            // the hatsune miku method
            AEI(2.0, Emotion.AP)
            Visual(VisualKind.Animated, 0.3, 0.3)
            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
        }

        RentAGirlfriend()
        ToniKawa()

        Entry {
            id = "A-MAL-41619"
            title = "Munou na Nana" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 41619 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 43534 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 117343 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 41619 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Hiiragi Nana"

            Visual(VisualKind.Animated, 0.4, 0.5)
            Progress(Boredom.Completed, 13) // generated(fill_anime_metadata.dart v0.1.1)
            KilledBy("F-VGMDB-2588", 0.5, 0.3)
            // plot is very good
            AEI(4.0, Emotion.AP)
        }

        Entry {
            id = "A-MAL-41930"
            title = "Kamisama ni Natta Hi" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 41930 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 43204 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 118419 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 41930 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Izanami Kyouko"

            Visual(VisualKind.Animated, 0.6, 0.4)
            Progress(Boredom.Dropped, 4)
            KilledBy("F-VGMDB-2588", 0.6, 0.5)
        }

        Aipura()
        Tanmoshi()

        Entry {
            id = "A-MAL-43969"
            title = "Kanojo mo Kanojo" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 43969 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44165 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 126192 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 43969 // generated(fill_anime_metadata.dart v0.1.1)
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
            id = "A-MAL-46093"
            title = "Shiroi Suna no Aquatope" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 46093 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44116 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 128545 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 46093 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Miyazawa Fuuka"

            // idk tf this anime is talking about lol
            Visual(VisualKind.Animated, 0.3, 0.7)
            Progress(Boredom.Dropped, 16)
            KilledBy("A-MAL-41530", 0.1, 0.4)
        }

        Entry {
            id = "A-MAL-40904"
            title = "Bokutachi no Remake" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 40904 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42924 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 114065 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 40904 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Kawasegawa Eiko"
            // this was expected to be a good compoly
            // anime, but it doesn't care about that
            // and just march on with its plot
            Visual(VisualKind.Animated, 0.5, 0.3)
            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
            KilledBy("A-MAL-41530", 0.2, 0.2)
            FeatureMusic("M-VGMDB-AL-111089-5")
        }

        Entry {
            id = "A-MAL-44203"
            title = "Seirei Gensouki" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 44203 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44174 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 126546 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 44203 // generated(fill_anime_metadata.dart v0.1.1)
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
            id = "A-MAL-47790"
            title = "Sekai Saikou no Ansatsusha, Isekai Kizoku ni Tensei suru" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 47790 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44393 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 129898 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 47790 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Dia" // *insert love live sunshine joke*

            Progress(Boredom.Dropped, 6)
            Visual(VisualKind.Animated, 0.5, 0.4)
            KilledBy("F-VGMDB-3245", 0.1, 0.2)
            KilledBy("F-VGMDB-7059", 0.1, 0.2)
            NEI(8.0, Emotion.AP to 1.0)
        }

        Entry {
            id = "A-MAL-48483"
            title = "Mieruko-chan" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 48483 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44185 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 131083 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 48483 // generated(fill_anime_metadata.dart v0.1.1)

            // "babe pls have sex with me im so horny"
            // "haha the ortensia incident"
            bestGirl = "Yotsuya Kyousuke"

            Progress(Boredom.Dropped, 5)
            Visual(VisualKind.Animated, 0.3, 0.6)
            KilledBy("F-VGMDB-3245", 0.2, 0.2)
            KilledBy("F-VGMDB-7059", 0.2, 0.2)
        }

        Entry {
            id = "A-MAL-48644"
            title = "Gyakuten Sekai no Denchi Shoujo" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 48644 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44300 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 131878 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 48644 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Akagi Rin"

            // denchi shoujo my fucking beloved wtf i love this so fking much
            AEI(5.0, Emotion.MP to 0.5, Emotion.AP to 0.5)
            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
            Visual(VisualKind.Animated, 0.4, 0.3)
            KilledBy("F-VGMDB-3245", 0.3, 0.15)
            KilledBy("F-VGMDB-7059", 0.3, 0.15)
        }

        Tenshi3P()

        Entry {
            id = "A-MAL-17919"
            title = "Houkago no Pleiades (TV)" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 17919 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 7713 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 17919 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 17919 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Subaru" // ofc it has to be mc

            // didn't expect mc to fall in love tho
            Progress(Boredom.Completed, 12) // generated(fill_anime_metadata.dart v0.1.1)
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
            title = "Toji no Miko" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 35589 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13710 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 98747 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 35589 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Tagitsuhime"
            // i hate my life

            Progress(Boredom.Completed, 24) // generated(fill_anime_metadata.dart v0.1.1)

            // decent plot ngl
            NEI(8.0, Emotion.AP)
            Visual(VisualKind.Animated, 0.5, 0.4)
        }

        Summer2022()
        WorldWitches()
    }.run {}

