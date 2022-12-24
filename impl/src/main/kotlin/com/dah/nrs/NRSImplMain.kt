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
import com.dah.nrs.meme.PostModern
import com.dah.nrs.seasonal.Spring2022
import com.dah.nrs.seasonal.Summer2022
import com.dah.nrs.seasonal.Fall2022
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

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
            idMAL = 12175 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 12175 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 6682 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 12175 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Koi to Senkyo to Chocolate" // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Chisato Sumiyoshi" // generated(generate_best_girls.dart v0.1.0)

            // iirc i liked this anime's plot
            AEI(0.3, Emotion.AP)
            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.3, 0.4)
        }

        Entry {
            id = "A-MAL-12189"
            idMAL = 12189 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 12189 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 6686 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 12189 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Hyouka" // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Eru Chitanda" // generated(generate_best_girls.dart v0.1.0)

            // ig it's kinda good
            NEI(0.3, Emotion.AP)
            AnimeProgressOld(Boredom.Completed, 22)
            Visual(VisualKind.Animated, 0.5, 0.5)
        }

        Sakurasou()
        Chuunibyou()
        ImoutoIreba()
        Oregairu()
        Priconne()
        LoveLive()
        AOT()
        NagiAsu()
        GochiUsa()

        Entry {
            id = "A-MAL-21845"
            idMAL = 21845 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20591 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 8199 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 21845 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Ushinawareta Mirai wo Motomete" // generated(fill_anime_metadata.dart v0.1.1)

            // kaomeme
            bestGirl = "Kaori Sasaki" // generated(generate_best_girls.dart v0.1.0)
            // Ending did hit me
            NEI(0.5, Emotion.CU)
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
            idMAL = 28851 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20954 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 10028 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 28851 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Koe no Katachi" // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Shouko Nishimiya" // generated(generate_best_girls.dart v0.1.0)
            // Koe no Katachi has solid drama
            // But sadly, it's the first anime so there's no PADS
            // or tears
            AEI(0.3, Emotion.CU)

            // the first anime + Giap-Ngoc match = unlimited memes
            Meme(1.0, numDays("2017-05-12" /*vietnamese premiere date*/, "2017-09-15" /*sln*/))

            // gate-open literally all NRS entries
            // but it's too overkill so an impact instead
            AdditionalImpact("Gate-open anime", 1.0)
            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 1, 2.hours + 10.minutes)
            Visual(VisualKind.Animated, 0.5, 0.5)
        }

        Entry {
            id = "A-MAL-31952"
            idKitsu = 11466 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21457 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 31952 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 31952 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Kono Bijutsubu ni wa Mondai ga Aru!" // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Mizuki Usami" // generated(generate_best_girls.dart v0.1.0)
            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        ShinkaiMovies()

        Entry {
            id = "A-MAL-32729"
            idMAL = 32729 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21647 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 11844 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 32729 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Orange" // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Naho Takamiya" // generated(generate_best_girls.dart v0.1.0)

            // from nrs1
            AEI(0.25, Emotion.CU)
            AnimeProgressOld(Boredom.Completed, 13)
            Visual(VisualKind.Animated, 0.3, 0.5)
        }

        KobayashiMaidDragon()
        NewGame()
        Bandori()

        Entry {
            id = "A-MAL-33731"
            idMAL = 33731 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21878 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 12497 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 33731 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Gabriel DropOut" // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Satanichia Kurumizawa McDowell" // generated(generate_best_girls.dart v0.1.0)
            // iToddlers BTFO
            Meme(0.4, 25)

            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.6, 0.4)
        }

        Entry {
            id = "A-MAL-34240"
            idMAL = 34240 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 97731 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 12668 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 34240 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Shelter (Music)" // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Rin" // impl_overridden

            // catJAM
            Music(0.6)

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
            idMAL = 34280 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 97766 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Gamers!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 34280 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 12754 // generated(fill_anime_metadata.dart v0.1.1)

            seasonal = true // iirc

            bestGirl = "Karen Tendou" // generated(generate_best_girls.dart v0.1.0)

            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.6, 0.3)
        }

        OneRoom()
        UchiageHanabi()

        Entry {
            id = "A-MAL-34822"
            idMAL = 34822 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 98202 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13234 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 34822 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Tsuki ga Kirei" // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Akane Mizuno" // generated(generate_best_girls.dart v0.1.0)
            // ending sadge
            AEI(0.25, Emotion.CU)
            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.3, 0.5)
        }

        Entry {
            id = "A-MAL-35241"
            idMAL = 35241 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 98506 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13752 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 35241 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Konohana Kitan" // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Natsume" // generated(generate_best_girls.dart v0.1.0)

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
            idMAL = 35756 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 99131 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13722 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 35756 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Comic Girls" // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Kaoruko Moeta" // generated(generate_best_girls.dart v0.1.0)

            AnimeProgressOld(Boredom.Completed, 12)
            NEI(0.2, Emotion.AP)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        TateYuusha()
        SoraYori()

        Entry {
            id = "A-MAL-35860"
            idMAL = 35860 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 99468 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13635 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 35860 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Karakai Jouzu no Takagi-san" // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Takagi" // generated(generate_best_girls.dart v0.1.0)

            // episodic ngl
            AnimeProgressOld(Boredom.Dropped, 2)
            Visual(VisualKind.Animated, 0.3, 0.4)
        }

        Entry {
            id = "A-MAL-36038"
            idMAL = 36038 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 99726 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13703 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 36038 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Net-juu no Susume" // generated(fill_anime_metadata.dart v0.1.1)

            // lmfao
            bestGirl = "Washing Machine" // generated(generate_best_girls.dart v0.1.0)

            AnimeProgressOld(Boredom.Completed, 10)
            Visual(VisualKind.Animated, 0.3, 0.4)
        }

        Entry {
            id = "A-MAL-36098"
            idMAL = 36098 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 99750 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13723 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 36098 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Kimi no Suizou wo Tabetai" // generated(fill_anime_metadata.dart v0.1.1)

            // facebook anime lmfao
            bestGirl = "Sakura Yamauchi" // generated(generate_best_girls.dart v0.1.0)

            AnimeConsumedProgress(EntryStatus.Completed, 0.95, 1, 1.hours + 48.minutes)
            AEI(0.1, Emotion.CU)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        Entry {
            id = "A-MAL-36266"
            idMAL = 36266 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 100010 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 14137 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 36266 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Mahou Shoujo Site" // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Aya Asagiri" // generated(generate_best_girls.dart v0.1.0)

            // poor best girl
            AEI(0.2, Emotion.CU)

            // sad ending (i don't remember now lmfao)
            AEI(0.5, Emotion.CU)
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
            idMAL = 37744 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 101547 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42319 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 37744 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Isekai Cheat Magician" // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Azuma Rin" // impl_overridden

            AnimeProgressOld(Boredom.Dropped, 8)
            Visual(VisualKind.Animated, 0.6, 0.2)
        }

        Entry {
            id = "A-MAL-37926"
            idKitsu = 41336 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 37926 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Nakanohito Genome [Jikkyouchuu]" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 37926 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 102926 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Karin Sarayashiki" // generated(generate_best_girls.dart v0.1.0)
            // akari kito va lmfao

            AnimeProgressOld(Boredom.Completed, 12)
            // this was funny af (iirc), really enjoyed it
            AEI(0.6, Emotion.AP)
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
            bestGirl = "Hina Tachibana" // generated(generate_best_girls.dart v0.1.0)

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
            title = "Darwin's Game" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38656 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42260 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 105190 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38656 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Shuka Karino" // generated(generate_best_girls.dart v0.1.0)
            AnimeProgressOld(Boredom.Completed, 11)
            Visual(VisualKind.Animated, 0.3, 0.4)
            // "plot is good"
            AEI(0.5, Emotion.AP)
        }

        Entry {
            id = "A-MAL-38659"
            title = "Shinchou Yuusha: Kono Yuusha ga Ore Tueee Kuse ni Shinchou Sugiru" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38659 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42079 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 105156 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38659 // generated(fill_anime_metadata.dart v0.1.1)
            // very funny lmao
            AEI(0.5, Emotion.AP)
            // restep sequel leaked no way
            bestGirl = "Ristarte" // generated(generate_best_girls.dart v0.1.0)
            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        AoChan()

        Entry {
            id = "A-MAL-38790"
            idAniDB = 38790 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 106479 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38790 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Itai no wa Iya nano de Bougyoryoku ni Kyokufuri Shitai to Omoimasu." // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42043 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Maple" // generated(generate_best_girls.dart v0.1.0)

            KilledBy("F-VGMDB-1945", 0.2, 0.5)
            AnimeProgressOld(Boredom.Dropped, 2)
            Visual(VisualKind.Animated, 0.5, 0.2)
        }

        HelloWorld()
        RikeKoi()

        Entry {
            id = "A-MAL-39324"
            idMAL = 39324 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 107956 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42203 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 39324 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Uchi no Ko no Tame naraba, Ore wa Moshikashitara Maou mo Taoseru kamo Shirenai." // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Latina" // generated(generate_best_girls.dart v0.1.0)

            AnimeProgressOld(Boredom.Dropped, 4)
            Visual(VisualKind.Animated, 0.4, 0.4)
        }

        KoisuruAsteroid()
        AscendanceBookworm()

        Entry {
            id = "A-MAL-39523"
            idMAL = 39523 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 108388 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42222 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 39523 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Choujin Koukousei-tachi wa Isekai demo Yoyuu de Ikinuku you desu!" // generated(fill_anime_metadata.dart v0.1.1)

            // rst girl vs akm girl lol
            bestGirl = "Shinobu Sarutobi" // generated(generate_best_girls.dart v0.1.0)

            // also akari kito ed wtf
            // and the op is that osu song
            // imagine if this was in summer 2022

            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        EgaoDaika()
        D4DJ()

        Entry {
            id = "A-MAL-39790"
            idMAL = 39790 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 109287 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42342 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 39790 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Adachi to Shimamura" // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Hougetsu Shimamura" // generated(generate_best_girls.dart v0.1.0)

            AnimeProgressOld(Boredom.TempOnHold, 3)
            Visual(VisualKind.Animated, 0.65, 0.3)

            // "A PADS about freedomism
            // (basically I want to be like the girls,
            // skipping out class etc.)"
            // ADA foreshadowing lol
            MaxAEIPADS(2, Emotion.CP)
            KilledBy("F-VGMDB-2588", 0.75, 0.3)
        }

        Entry {
            id = "A-MAL-40550"
            idMAL = 40550 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 112479 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42625 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 40550 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Assault Lily: Bouquet" // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Shirai Yuyu" // himekek my beloved
            bestGirl = "Wang Yujia" // noway it's the kimi no rhapsody girl
            bestGirl = "Thi Mai Yoshimura" // generated(generate_best_girls.dart v0.1.0)

            // in all seriousness, this is quite good.
            // the 2 main girls are pretty match
            // thank you based shaft
            Visual(VisualKind.Animated, 0.6, 0.3)
            AnimeProgressOld(Boredom.Completed, 12)
            FeatureMusic("M-VGMDB-AL-101643-1")
        }

        Entry {
            id = "A-MAL-40571"
            idMAL = 40571 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 112609 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42627 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 40571 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Majo no Tabitabi" // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Elaina" // generated(generate_best_girls.dart v0.1.0)

            Visual(VisualKind.Animated, 0.4, 0.3)
            AnimeProgressOld(Boredom.Dropped, 6)
            KilledBy("F-VGMDB-2588", 0.5, 0.5)
        }

        Entry {
            id = "A-MAL-40783"
            idMAL = 40783 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 113570 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42850 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 40783 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Shachou, Battle no Jikan Desu!" // generated(fill_anime_metadata.dart v0.1.1)
            // insert hatsune miku joke here
            bestGirl = "Akari" // generated(generate_best_girls.dart v0.1.0)

            // the hatsune miku method
            AEI(0.2, Emotion.AP)
            Visual(VisualKind.Animated, 0.3, 0.3)
            AnimeProgressOld(Boredom.Completed, 12)
        }

        RentAGirlfriend()
        ToniKawa()

        Entry {
            id = "A-MAL-41619"
            idMAL = 41619 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 117343 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 43534 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 41619 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Munou na Nana" // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Nana Hiiragi" // generated(generate_best_girls.dart v0.1.0)

            Visual(VisualKind.Animated, 0.4, 0.5)
            AnimeProgressOld(Boredom.Completed, 13)
            KilledBy("F-VGMDB-2588", 0.5, 0.3)
            // plot is very good
            AEI(0.4, Emotion.AP)
        }

        Entry {
            id = "A-MAL-41930"
            idMAL = 41930 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 118419 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 43204 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 41930 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Kamisama ni Natta Hi" // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Kyouko Izanami" // generated(generate_best_girls.dart v0.1.0)

            Visual(VisualKind.Animated, 0.6, 0.4)
            AnimeProgressOld(Boredom.Dropped, 4)
            KilledBy("F-VGMDB-2588", 0.6, 0.5)
        }

        Aipura()
        Tanmoshi()

        Entry {
            id = "A-MAL-43969"
            idKitsu = 44165 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 126192 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 43969 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 43969 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Kanojo mo Kanojo" // generated(fill_anime_metadata.dart v0.1.1)
            // this is one of the only rom-coms that is
            // watched in the post-MagiReco era, which is
            // already impressive
            // but that's not enough because MagiReco S2
            // is just too good
            bestGirl = "Saki Saki" // generated(generate_best_girls.dart v0.1.0)
            Visual(VisualKind.Animated, 0.4, 0.4)
            AnimeProgressOld(Boredom.Dropped, 5)
            KilledBy("A-MAL-41530", 0.2, 0.5)
        }

        Entry {
            id = "A-MAL-46093"
            idMAL = 46093 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 128545 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44116 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 46093 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Shiroi Suna no Aquatope" // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Fuuka Miyazawa" // generated(generate_best_girls.dart v0.1.0)

            // idk tf this anime is talking about lol
            Visual(VisualKind.Animated, 0.3, 0.7)
            AnimeProgressOld(Boredom.Dropped, 16)
            KilledBy("A-MAL-41530", 0.1, 0.4)
        }

        Entry {
            id = "A-MAL-40904"
            idMAL = 40904 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 114065 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42924 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 40904 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Bokutachi no Remake" // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Eiko Kawasegawa" // generated(generate_best_girls.dart v0.1.0)
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
            idMAL = 44203 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 126546 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44174 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 44203 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Seirei Gensouki" // generated(fill_anime_metadata.dart v0.1.1)
            // kimi no rhapsody girl
            bestGirl = "Celia Claire" // generated(generate_best_girls.dart v0.1.0)

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
            AEI(0.5, Emotion.AU to 0.5, Emotion.AP to 0.5)
        }

        Entry {
            id = "A-MAL-47790"
            idMAL = 47790 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 129898 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Sekai Saikou no Ansatsusha, Isekai Kizoku ni Tensei suru" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 47790 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44393 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Dia" // generated(generate_best_girls.dart v0.1.0)

            AnimeProgressOld(Boredom.Dropped, 6)
            Visual(VisualKind.Animated, 0.5, 0.4)
            KilledBy("F-VGMDB-3245", 0.1, 0.2)
            KilledBy("F-VGMDB-7059", 0.1, 0.2)
            NEI(0.8, Emotion.AP to 1.0)
        }

        Entry {
            id = "A-MAL-48483"
            idMAL = 48483 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 131083 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44185 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 48483 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Mieruko-chan" // generated(fill_anime_metadata.dart v0.1.1)

            // "babe pls have sex with me im so horny"
            // "haha the ortensia incident"
            bestGirl = "Kyousuke Yotsuya" // generated(generate_best_girls.dart v0.1.0)

            AnimeProgressOld(Boredom.Dropped, 5)
            Visual(VisualKind.Animated, 0.3, 0.6)
            KilledBy("F-VGMDB-3245", 0.2, 0.2)
            KilledBy("F-VGMDB-7059", 0.2, 0.2)
        }

        Entry {
            id = "A-MAL-48644"
            idMAL = 48644 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 131878 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 44300 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 48644 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Gyakuten Sekai no Denchi Shoujo" // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Akagi Rin" // impl_overridden

            // denchi shoujo my fucking beloved wtf i love this so fking much
            AEI(0.5, Emotion.MP to 0.5, Emotion.AP to 0.5)
            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.4, 0.3)
            KilledBy("F-VGMDB-3245", 0.3, 0.15)
            KilledBy("F-VGMDB-7059", 0.3, 0.15)
        }

        Tenshi3P()

        Entry {
            id = "A-MAL-17919"
            idMAL = 17919 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 17919 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 7713 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 17919 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Houkago no Pleiades (TV)" // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Subaru" // generated(generate_best_girls.dart v0.1.0)

            // didn't expect mc to fall in love tho
            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.5, 0.2)
            FeatureMusic("M-VGMDB-AL-51254-1")
        }

        Kano()

        Aokana()
        ATRI()
        MiaZora()

        Cue()
        Irodori()
        JMetal()
        OsuGame()
        TariTari()
        SelePro()

        NatsuKise()

        Spring2022()
        WakeUpGirls()
        Method()
        MVLiterature()
        Atelier()

        Entry {
            id = "A-MAL-35589"
            idMAL = 35589 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 98747 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13710 // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 35589 // generated(fill_anime_metadata.dart v0.1.1)
            title = "Toji no Miko" // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Tagitsuhime" // generated(generate_best_girls.dart v0.1.0)
            // i hate my life

            AnimeProgressOld(Boredom.Completed, 24)

            // decent plot ngl
            NEI(0.8, Emotion.AP)
            Visual(VisualKind.Animated, 0.5, 0.4)
        }

        Entry {
            id = "A-MAL-38091"
            title = "Hachigatsu no Cinderella Nine (TV)" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38091 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42144 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 104989 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38091 // generated(fill_anime_metadata.dart v0.1.1)

            // haha chuchu analogy ahaha yes we are ahahdajd
            bestGirl = "Akane Ukita"

            // risuteji xi jin ping
            NEI(0.3, Emotion.CP)
            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 12)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        Entry {
            id = "A-MAL-37481"
            title = "Ongaku Shoujo (TV)" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 37481 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 41066 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 101309 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 37481 // generated(fill_anime_metadata.dart v0.1.1)

            // gyze it's the chuchu analogy girl amirite hahahaha
            bestGirl = "Kiri Mukae"

            AnimeConsumedProgress(EntryStatus.Completed, 0.8, 12)
            Visual(VisualKind.Animated, 0.5, 0.3)
        }

        Summer2022()
        WorldWitches()
        PostModern()
        Fall2022()

        WagamamaHighSpec()
        CloverDays()
        Koikake()

        KokuhakuJikkouIinkai()
    }.run {}

