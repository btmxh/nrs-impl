package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import com.dah.nrs.meme.*

private val AllSB69Tracks = mutableListOf<String>()

private fun DSLEntry.FesALiveMusic(score: Double) {
    Music(score)
    AllSB69Tracks.add(id)
}

fun DSLScope.SB69() {
    // Almost every cat seems to enjoy catching birds.
    // But there is a cat, that wants to be a bird.
    // She wants to fly on that blue sky once painted pink.

    // In the past, there is a legendary rabbit.
    // A bunny that changed the world by flying in that sky.
    // No one expected it to be able to soar through the clouds like a bird.

    // Bunnies can fly, and so can cats.
    Entry {
        id = "F-VGMDB-4499"
        title = "Show By Rock!!"

        // in sb69 s1, s2, the cat have so much screentime, but i didn't
        // value it. and when s4 comes, the cat changed and lose screentime,
        // thus giving me nostalgia of the prequels,
        // when pmgc was the center of the franchise,
        // when rosia and retoree decided to be friends,
        // when the cat got taught a good lesson by grateful king.
        // To quote rst mfs:
        // "If that time ..." I was thinking
        // 「あの時もし...」 考えてたって
        // The days that have passed will not come back anymore
        // 過ぎた日々はもう 戻らないけど
        Cry(Emotion.CU) {
            contributors["A-MAL-41520"] = 0.5
            contributors["A-MAL-27441"] = 0.2
            contributors["A-MAL-32038"] = 0.2
            contributors["M-VGMDB-AL-51276"] = 0.1
        }
        PADS(3, Emotion.CU) {
            contributors["A-MAL-41520"] = 0.5
            contributors["A-MAL-27441"] = 0.25
            contributors["A-MAL-32038"] = 0.25
        }

        AEI(0.5, Emotion.AP) {
            contributors["A-MAL-27441"] = 0.5
            contributors["A-MAL-32038"] = 0.5
        }

        AEI(0.2, Emotion.AP) {
            contributors["A-MAL-40763"] = 0.6
            contributors["A-MAL-41520"] = 0.4
        }

        Waifu("Hijirikawa Cyan", "2022-01-15" to "2022-03-10") {
            contributors["A-MAL-27441"] = 0.35
            contributors["A-MAL-32038"] = 0.35
            contributors["A-MAL-40763"] = 0.05
            contributors["A-MAL-41520"] = 0.2
            contributors["G-VGMDB-8429"] = 0.05
        }

        KilledBy("F-VGMDB-7059", potential = 0.4, effect = 0.75) {
            contributors["A-MAL-27441"] = 0.2
            contributors["A-MAL-32038"] = 0.2
            contributors["A-MAL-40763"] = 0.2
            contributors["A-MAL-41520"] = 0.2
            contributors["G-VGMDB-8429"] = 0.2
        }

        KilledBy("O-20220415T155427", potential = 0.2, effect = 0.75) {
            contributors["A-MAL-27441"] = 0.2
            contributors["A-MAL-32038"] = 0.2
            contributors["A-MAL-40763"] = 0.2
            contributors["A-MAL-41520"] = 0.2
            contributors["G-VGMDB-8429"] = 0.2
        }

        Entry {
            id = "A-MAL-27441"
            title = "Show By Rock!!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 27441 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 9729 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20843 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 27441 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Cyan Hijirikawa" // generated(generate_best_girls.dart v0.1.0)

            FeatureMusic("M-VGMDB-AL-51276-1")
            FeatureMusic("M-VGMDB-AL-51278-1")
            FeatureMusic("M-VGMDB-AL-51706-1")
            FeatureMusic("M-VGMDB-AL-51706-2")

            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.6, 0.4)
        }

        Entry {
            id = "A-MAL-32038"
            title = "Show By Rock!! #" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 32038 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 11494 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21476 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 32038 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Cyan Hijirikawa" // generated(generate_best_girls.dart v0.1.0)

            // the lesson thingy was pretty cool ig
            AEI(0.2, Emotion.MP)

            // I almost cried at the ailane thing
            // <strikethrough>but NEI because gigachad animes don't farm tears</strikethrough>
            // didn't care didn't ask, and the NEI/AEI rework is here either way
            AEI(0.7, Emotion.MP)

            FeatureMusic("M-VGMDB-AL-61217-1")
            FeatureMusic("M-VGMDB-AL-61940-1")
            FeatureMusic("M-VGMDB-AL-61981-1")
            FeatureMusic("M-VGMDB-AL-61981-3")

            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.6, 0.4)
        }

        Entry {
            id = "A-MAL-40763"
            title = "Show By Rock!! Mashumairesh!!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 40763 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42885 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 113470 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 40763 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Himeko Mashima" // generated(generate_best_girls.dart v0.1.0)
            // main girl is hoan tinh xdddddddddd
            // chao em co gai howan tinh
            // actually the cat appeared in last ep but idc

            // my heart skipped a beat when the cat
            // appeared in last ep
            // keking
            NEI(0.75, Emotion.MP)

            FeatureMusic("M-VGMDB-AL-93440-1")
            FeatureMusic("M-VGMDB-AL-93440-3")
            FeatureMusic("M-VGMDB-AL-93441-1")

            // the screentime thing
            // mashu mp farm got fucked by the existence of the cat
            // and pmgc
            KilledBy("M-20220125T063355-2", potential = 0.75, effect = 0.75)
            Visual(VisualKind.Animated, 0.65, 0.4)

            AnimeProgressOld(Boredom.Completed, 12)
        }

        Entry {
            id = "A-MAL-41520"
            title = "Show by Rock!! Stars!!" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 41520 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 43590 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 113476 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 41520 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Hijirikawa Cyan" // aka the ayumu cat
            // aka show by rock!! banded rocking records high school idol club
            // the gen2 niji

            // although this is not watched during its release
            // to make sure sb69 not killing rst, and maybe sb69 stars
            // can pull up a niji moment, this is watched in a "seasonal"
            // way, at every 12pm saturday from 2022/1/22
            // update: shit happened and no more seasonal
            seasonal = false

            bestGirl = "Cyan Hijirikawa" // generated(generate_best_girls.dart v0.1.0)

            // bro the ayumu shit happened again xddddddddddd
            // basically in ep 1&2, the cat has little screentime,
            // and considering i have to wait 2 long weeks to watch
            // this, it's frustrating af.
            NEI(0.5, Emotion.AU)

            // basically the cat va in s4 focuses on moe more
            // than the fact that the cat is kinda reserved and shit
            // maybe chardev happened but didn't care + didn't ask for that
            AdditionalImpact("the cat va sucks in this season", -0.25)

            FeatureMusic("M-VGMDB-AL-104341-1")
            FeatureMusic("M-VGMDB-AL-104341-2")
            FeatureMusic("M-VGMDB-AL-104266-3")
            FeatureMusic("M-VGMDB-AL-104266-6")
            FeatureMusic("M-VGMDB-AL-104267-5")
            FeatureMusic("M-VGMDB-AL-100087-1")

            AnimeProgressOld(Boredom.Completed, 12)
            Visual(VisualKind.Animated, 0.65, 0.4)
        }

        // fes a live has fhana songs lmao
        FeatureMusic("M-VGMDB-AL-62516-1")
        FeatureMusic("M-VGMDB-AL-110219-1")

        Entry {
            id = "M-VGMDB-AL-100087"
            title = "How To Fly / Cyan & Howan" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.45, 0.3)
            SubIDEntry("1") {
                title = "How To Fly" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:01") // generated(fill_music_metadata.dart v0.1.1)
                // fes a live art looks a little bit weird ngl
                Visual(VisualKind.AnimatedMV, 0.45, 0.3)
                FesALiveMusic(0.35)
            }
        }

        Entry {
            id = "M-VGMDB-AL-94913"
            title = "My pace!! / Plasmagica" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.3, 0.7)

            SubIDEntry("1") {
                title = "My pace!!" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:15") // generated(fill_music_metadata.dart v0.1.1)
                // really interesting vocal
                // (somewhat resemble kano)
                FesALiveMusic(0.25)
            }
        }

        Entry {
            id = "M-VGMDB-AL-51276"
            title = "Seishun wa Non-Stop! / Plasmagica" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.6, 0.6)

            SubIDEntry("1") {
                title = "Seishun wa Non-Stop!" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:17") // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.25)

                Remix("M-20220125T063355-6")
            }

            SubIDEntry("2") {
                title = "Close to you" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("3:43") // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.4)

                Remix("M-VGMDB-AL-61981-3")
            }
        }

        Entry {
            id = "M-VGMDB-AL-51278"
            title = "Tabimichi Yoiyoi Yume Hanabi / Tsurezurenaru Ayatsuri Mugenan" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.45, 0.5)

            SubIDEntry("1") {
                title = "Tabimichi Yoiyoi Yume Hanabi" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:21") // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.3)
            }
        }

        Entry {
            id = "M-VGMDB-AL-51706"
            title = "Meikyuu DESTINY/Ryuusei Dreamline / Plasmagica" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.55, 0.4)

            SubIDEntry("1") {
                title = "Meikyuu DESTINY" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:04") // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.5)
            }

            SubIDEntry("2") {
                title = "Ryuusei Dreamline" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("3:54") // generated(fill_music_metadata.dart v0.1.1)
                // kekekekekekek
                FesALiveMusic(0.225)
            }
        }

        Entry {
            id = "M-VGMDB-AL-61217"
            title = "Heart wo Rock!! / Plasmagica" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.45, 0.4)

            SubIDEntry("1") {
                title = "Heart wo Rock!!" // generated(fill_music_metadata.dart v0.1.1)
                // Length source: https://open.spotify.com/album/4fznIWn0juYyJDhh31q0Yf
                MusicConsumedProgress("4:12") // impl_overridden
                FesALiveMusic(0.7)
            }
        }

        Entry {
            id = "M-VGMDB-AL-61940"
            title = "Schlehit Melodie/Danzai no Solitude / BUD VIRGIN LOGIC" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.4)

            SubIDEntry("1") {
                title = "Schlehit Melodie" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("3:46") // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.4)
            }
        }

        Entry {
            id = "M-VGMDB-AL-61981"
            title = "My Resolution ~Mirai e no Kizuna~ / Plasmagica" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.5, 0.4)

            SubIDEntry("1") {
                MusicConsumedProgress("5:03") // generated(fill_music_metadata.dart v0.1.1)
                title = "My Resolution ～未来への絆～" // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.5)
            }

            SubIDEntry("3") {
                MusicConsumedProgress("4:02") // generated(fill_music_metadata.dart v0.1.1)
                title = "Close to you (詩杏 ver.)" // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.35)

                NEI(0.25, Emotion.MP)
            }
        }

        Entry {
            id = "M-VGMDB-AL-59914"
            title = "Do Re Mi Fa PARTY / Plasmagica" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.35, 0.5)

            SubIDEntry("1") {
                MusicConsumedProgress("3:41") // generated(fill_music_metadata.dart v0.1.1)
                title = "ドレミファPARTY" // generated(fill_music_metadata.dart v0.1.1)
                // xd
                FesALiveMusic(0.2)
                Meme(0.1, 2)
            }
        }

        // "visual"s of hiromemes and mashiro start line are good
        NEI(0.5, Emotion.MP) {
            contributors["A-MAL-40763"] = 0.75
            contributors["M-VGMDB-AL-93440-1"] = 0.25
        }

        AEI(0.5, Emotion.CP) {
            contributors["A-MAL-40763"] = 0.75
            contributors["M-VGMDB-AL-93440-3"] = 0.25
        }

        Entry {
            id = "M-VGMDB-AL-93440"
            title = "Hiromenes/Kimi no Rhapsody / Mashumairesh!!" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.3)

            SubIDEntry("1") {
                MusicConsumedProgress("4:14") // generated(fill_music_metadata.dart v0.1.1)
                title = "Hiromenes" // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.6)
            }

            SubIDEntry("2") {
                MusicConsumedProgress("3:36") // generated(fill_music_metadata.dart v0.1.1)
                title = "Kimi no Rhapsody" // generated(fill_music_metadata.dart v0.1.1)
                // hahahahahaaha the howan tinh song
                FesALiveMusic(0.25)
                Meme(0.01, numDays("2022-04-01"))
                Remix("M-20220702T030659")
            }

            SubIDEntry("3") {
                MusicConsumedProgress("4:15") // generated(fill_music_metadata.dart v0.1.1)
                title = "Masshiro Start Line" // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.6)
            }
        }

        Entry {
            id = "M-20220702T030659"
            title = "Kimi no Rhapsody (DJ DEVILMINTKIRYU Remix)"
            // aka hoantinh theme song

            // Length source: (rip db.showbyrock.net)
            FesALiveMusic(0.4)
            MusicConsumedProgress("1:34") // impl_overridden
        }

        Entry {
            id = "M-VGMDB-AL-93441"
            title = "Yell and Response / Mashumairesh!!" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.5, 0.3)

            SubIDEntry("1") {
                MusicConsumedProgress("3:46") // generated(fill_music_metadata.dart v0.1.1)
                title = "エールアンドレスポンス" // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.2)
            }
        }

        Entry {
            id = "M-VGMDB-AL-112509"
            title = "SHOW BY ROCK!! Trigger Rock / Mashumairesh!!" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.3, 0.5)

            SubIDEntry("2") {
                MusicConsumedProgress("4:20") // generated(fill_music_metadata.dart v0.1.1)
                title = "イントロダクション" // generated(fill_music_metadata.dart v0.1.1)
                // and we will fly beyond the sky
                // let's death, you will pay
                FesALiveMusic(0.6)
            }
        }

        Entry {
            id = "M-VGMDB-AL-104341"
            title = "Do Re Mi Fa STARS!!/Hoshizora Light Story" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.6, 0.3)

            SubIDEntry("1") {
                MusicConsumedProgress("4:06") // generated(fill_music_metadata.dart v0.1.1)
                title = "Do Re Mi Fa STARS!!" // generated(fill_music_metadata.dart v0.1.1)
                // aka ceui - colorful days (mp-based franchise ver.)
                // or the counting song
                FesALiveMusic(0.5)
            }

            SubIDEntry("2") {
                title = "Hoshizora Light Story" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:05") // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.35)
            }
        }

        Entry {
            id = "M-VGMDB-AL-104266"
            title = "TV Anime \"SHOW BY ROCK!! STARS!!\" Sounyuuka Mini Album Vol.1" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.1, 0.2)

            SubIDEntry("3") {
                MusicConsumedProgress("4:10") // generated(fill_music_metadata.dart v0.1.1)
                title = "Do! It! Happy Daibouken!" // generated(fill_music_metadata.dart v0.1.1)
                // do it party reference lmfao
                FesALiveMusic(0.65)
            }

            SubIDEntry("6") {
                title = "Kyukyukyun♡Heart Shaker" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("3:15") // generated(fill_music_metadata.dart v0.1.1)
                // aaaaa co sao method thong minh the
                // co le dell ai ngau giong anh chang
                // ngau loi nhat ca doi tuyen toan
                // do co le la em toi

                FesALiveMusic(0.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-104267"
            title = "TV Anime \"SHOW BY ROCK!! STARS!!\" Sounyuuka Mini Album Vol.2" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.1, 0.2)

            SubIDEntry("5") {
                title = "EMPIRE DOMINATOR" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("3:42") // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.25)
            }

            SubIDEntry("8") {
                title = "Anokanatarium" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:46") // generated(fill_music_metadata.dart v0.1.1)
                // this was unranked all this time?????
                // lmfao
                FesALiveMusic(0.65)

                // there's no one who is cooler
                // there's no one who's like him
                // the one who shines like the sun
                // forever shining is the method
            }
        }

        Entry {
            id = "M-VGMDB-AL-61982"
            title = "Hanate! Dododon! / Criticrista" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.6, 0.4)

            SubIDEntry("1") {
                title = "Hanate! Dododon!" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("5:00") // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-118562"
            title = "Taikakusen wo Tsunaideyo / Uwasanopetals" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.6, 0.3)

            SubIDEntry("1") {
                title = "Taikakusen wo Tsunaideyo" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("3:44") // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.65)
            }
        }

        Entry {
            id = "M-VGMDB-AL-104418"
            title = "Good Day by Day / Cyan (cv. Eri Inagawa), A (cv. Saori Hayami), Ailane (cv. Ruriko Noguchi), Shibarin (cv. Marika Kohno)" // generated(fill_music_metadata.dart v0.1.1)

            // this thing:
            // https://medium-media.vgm.io/albums/81/104418/104418-9cc8d5c0abf7.jpg
            // is from the blu-ray, so it doesn't count
            ValidatorSuppress("dah-visualless-entry")

            // also sung by Ailane (cv. Ruriko Noguchi) and Shibarin (cv. Marika Kohno)
            SubIDEntry("1") {
                title = "グッデイバイデイ" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:26") // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.35)
            }

            // if u understand, u understand
            // RemixOf("M-VGMDB-AL-97688-16")
        }

        Entry {
            id = "M-VGMDB-AL-100082"
            title = "Mirai Wanted / Plasmagica" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.5)

            SubIDEntry("1") {
                title = "Mirai Wanted" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:23") // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-116297"
            title = "Bokura no Neiro / Plasmagica" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.4, 0.5)

            SubIDEntry("1") {
                title = "Bokura no Neiro" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:23") // generated(fill_music_metadata.dart v0.1.1)
                Visual(VisualKind.SemiAnimatedMV, 0.5, 0.6)
                FesALiveMusic(0.35)
            }
        }

        Entry {
            id = "M-VGMDB-AL-105612"
            title = "Mot Mot Mot / Criticrista" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.25, 0.45)

            SubIDEntry("1") {
                title = "Mot Mot Mot" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("3:42") // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.65)
            }
        }

        Entry {
            id = "M-VGMDB-AL-86315"
            title = "P SHOW BY ROCK!! CD" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.6, 0.5)

            SubIDEntry("3") {
                title = "Nyumber One! Zettai Saikyou!" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:23") // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.7)
                // welcome to the post-modern shithole where everything is political
                // NOZSP is truly the party of all time
                // chair gaming
                PostModernMeme(0.1)
            }
        }

        Entry {
            id = "M-VGMDB-AL-76155"
            title = "Loop Shiteru/Asuiro Koi Moyou / Criticrista" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.3, 0.3)

            SubIDEntry("1") {
                title = "ループしてる" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("3:45") // generated(fill_music_metadata.dart v0.1.1)
                // :tf:
                FesALiveMusic(0.25)
            }

            SubIDEntry("2") {
                title = "あすいろ恋模様" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:33") // generated(fill_music_metadata.dart v0.1.1)
                // absolute catjammer
                // cricri is just too fking based

                // Even if the world was to end in the morning
                // I wouldn’t have any regrets, because I was able to meet you
                // That’s the most of my feelings I can express
                // But it’s fine if you’re too thick to understand

                // btw kaguyashit pls fuck off from this beautiful lyrics
                // this is also known as "A-Sử-iro Koi Moyou"
                // ("vợ chồng a phủ" reference lmfao)

                // the "ai kotoba iii" of rst-sb69
                // which marks the continuation of the duopoly era
                // ^ clueless mfs

                FesALiveMusic(0.8)
                NEI(0.5, Emotion.MP)

                // (the love song parody lyrics shit of me to rst, translated to english)

                // Bởi vì khi con tim ngừng đập
                // Because when our hearts stop beating

                // chẳng phải khi ta đã chết đi trong lòng người khác
                // is not when they are no longer living in any other hearts

                // Em luôn ở đây, kề bên anh soi sáng con đường
                // You are always here, lighting the path for me.

                // Giờ đây là khi, mình tay cầm tay
                // Now it's time, we hand in hand

                // Và cùng nhau ta sẽ thắp sáng ước mơ
                // And together we will [shine our dreams] (lmfao rst song comp diff name)

                // "morbius is a movie of all time"
                AKMEraPart1(1.0)
                AKMEraPart2(1.0)
                AKMEraPart3(0.6)
            }
        }

        // adding these songs to increase Murakawa Rie and Hidaka Rina's score lol
        // (i can't accept ayumu va to be higher than rina hidaka lol)
        Entry {
            id = "M-VGMDB-AL-95313"
            title = "How Are You? / Criticrista" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.3, 0.3)

            SubIDEntry("1") {
                title = "はうあーゆー？" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:01") // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.6)
            }
        }

        Entry {
            id = "M-VGMDB-AL-95314"
            title = "Happy Happy Jump / Criticrista" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.3, 0.3)

            SubIDEntry("1") {
                title = "Happy Happy Jump" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("3:44") // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-124217"
            title = "Hoshitachi no Orchestra Parade / Mashumairesh!!" // generated(fill_music_metadata.dart v0.1.1)
            
            Visual(VisualKind.AlbumArt, 0.25, 0.4)

            SubIDEntry("1") {
                MusicConsumedProgress("3:54") // generated(fill_music_metadata.dart v0.1.1)
                title = "Hoshitachi no Orchestra Parade" // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.7)
                // cleaning koikake :tf: 
                // AEI(0.3, Emotion.MP)
            }
        }

        AEI(0.3, Emotion.MP) {
            contributors["M-VGMDB-AL-124217-1"] = 0.5
            contributors["V-VNDB-17516"] = 0.5
        }

        Entry {
            id = "M-VGMDB-AL-124215"
            title = "Koishichatta! / Criticrista" // generated(fill_music_metadata.dart v0.1.1)
            
            Visual(VisualKind.AlbumArt, 0.2, 0.3)
            SubIDEntry("1") {
                MusicConsumedProgress("4:17") // generated(fill_music_metadata.dart v0.1.1)
                title = "Koishichatta!" // generated(fill_music_metadata.dart v0.1.1)
                FesALiveMusic(0.3)
            }
        }

        Entry {
            id = "M-20220125T063355-2"
            title = "Plasmagica"
            ValidatorSuppress("dah-entry-no-consumed")

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-94913")
                Contains("M-VGMDB-AL-51276")
                Contains("M-20220125T063355-6", 0.5)
                Contains("M-VGMDB-AL-51706")
                Contains("M-VGMDB-AL-61217")
                Contains("M-VGMDB-AL-61981")
                Contains("M-VGMDB-AL-59914")
                Contains("M-VGMDB-AL-104341-1", 0.5)
                Contains("M-VGMDB-AL-104266-3")
                Contains("M-VGMDB-AL-100082")
                Contains("M-VGMDB-AL-116297")
            }
        }

        Entry {
            id = "M-20220125T063355-3"
            title = "Tsurezurenaru Ayatsuri Mugenan"
            ValidatorSuppress("dah-entry-no-consumed")

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-51278")
            }
        }

        Entry {
            id = "M-20220125T063355-4"
            title = "Mashumairesh!!"
            ValidatorSuppress("dah-entry-no-consumed")

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-93440")
                Contains("M-VGMDB-AL-93441")
                Contains("M-VGMDB-AL-104341-1", 0.5)
                Contains("M-VGMDB-AL-104341-2", 1.0)
                Contains("M-VGMDB-AL-104267-8", 1.0)
                Contains("M-20220702T030659", 0.5)
            }
        }

        Entry {
            id = "M-20220125T063355-5"
            title = "BUD VIRGIN LOGIC"
            ValidatorSuppress("dah-entry-no-consumed")

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-61940")
                Contains("M-VGMDB-AL-104267-5")
            }
        }

        Entry {
            id = "M-20220125T063355-7"
            title = "Criticrista"
            ValidatorSuppress("dah-entry-no-consumed")

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-104266-6")
                Contains("M-VGMDB-AL-61982")
                Contains("M-VGMDB-AL-105612")
                Contains("M-VGMDB-AL-86315-3")
                // when you realized that something is missing
                Contains("M-VGMDB-AL-76155")
            }
        }

        Entry {
            id = "G-VGMDB-8429"
            title = "SHOW BY ROCK!! Fes A Live"

            AllSB69Tracks.forEach { FeatureMusic(it) }
            Visual(VisualKind.GachaCardArt, 0.4, 0.3)
        }
    }

    // the famous speed-finger control map
    Entry {
        id = "M-20220125T063355-6"
        title = "Seishun wa Non-Stop! (Asterisk DnB Remix)"

        // Length source: https://soundcloud.com/asteriskbtlg/5315yun-w4-n0n-st0pasterisk-dnb-remix
        Music(0.6)
        MusicConsumedProgress("5:02") // impl_overridden
        OsuSong(personal = 0.75)
    }

    RSTSB69DuopolyEra(0.8) {
        contributors["A-MAL-27441"] = 0.25
        contributors["A-MAL-32038"] = 0.3
        contributors["A-MAL-40763"] = 0.1
        contributors["A-MAL-41520"] = 0.25
        contributors["G-VGMDB-8429"] = 0.1
    }

    AKMEraPart1(0.3) {
        contributors["A-MAL-27441"] = 0.25
        contributors["A-MAL-32038"] = 0.3
        contributors["A-MAL-40763"] = 0.1
        contributors["A-MAL-41520"] = 0.25
        contributors["G-VGMDB-8429"] = 0.1
    }

    AKMEraPart2(0.75) {
        contributors["A-MAL-27441"] = 0.25
        contributors["A-MAL-32038"] = 0.3
        contributors["A-MAL-40763"] = 0.1
        contributors["A-MAL-41520"] = 0.25
        contributors["G-VGMDB-8429"] = 0.1
    }

    AKMEraPart3(0.4) {
        contributors["A-MAL-27441"] = 0.25
        contributors["A-MAL-32038"] = 0.3
        contributors["A-MAL-40763"] = 0.1
        contributors["A-MAL-41520"] = 0.25
        contributors["G-VGMDB-8429"] = 0.1
    }
}

fun AcceptImpact.AKMEraPart1(strength: Double, block: DSLImpact.() -> Unit = {}) {
    // "
    // rst-sb69 duopoly era season 2: electric boogaloo (June 3rd, 2022 onwards)
    // featuring modern vietnamese literature, esters, tien duc and more...
    // " - clueless mf doesn't know about the song

    // Asuiro Koi Moyou era (part 1)
    // AKM is basically the "child" of rst and sb69,
    // inheriting rst's love and sb69's catjam af music
    // This arc features dumb shit like MVL (modern vietnamese literature)
    Meme(strength, numDays("2022-06-03", "2022-07-17"), block)

    // all of this shit basically spits on all other anime
    // that was unable to be meta'd for longer than a month
    // while literally a song not even 5 minutes was able
    // to turn modern culture into the shittiest hellhole ever.
}

fun AcceptImpact.AKMEraPart2(strength: Double, block: DSLImpact.() -> Unit = {}) {
    // AKM era arc 2
    // seasonal anime now exists, le boat analogy is dying, etc.
    // sb69 top 1 franchise now xd
    Meme(strength, numDays("2022-07-21", "2022-08-31"), block)
    // july then comes with a bunch of new seasonal anime,
    // and some of them were infused with akm shit such as:
    // - classroom of the elite: a girl with same VA as rosia
    // was declared "potential waifu"
    // - something motokano something: another girl with same
    // VA as rosia
    // - atelier (not seasonal): have OP named "asuiro" and
    // sang by the VA of jacklyn, who also was the VA for the
    // main girl aka "botaental guaifu" aka "mc xinh vl" aka
    // "sklol" aka "we live in a society" (btw if u can't tell
    // i'm talking about the escha logy anime)
    // (and then i downloaded the game(s) lol XDDDDDDDDDDDDD)
    // - toji no miko (not seasonal): main antagonist has the
    // same VA as rosia
    // - the idol pride unit: iiix, comsisting of:
    //   + the zenryoku i love you reijing signal girl
    //   + the glory star rst misaki sango girl
    //   + the asuiro koi moyou jacklyn girl
    // (now i finally understood why le gigachad mapper like
    // aipuru so much lol)
    // etc. (btw for somewhateverreason, all of these girls
    // VA'd by these two seiyuus have great waifu material
    // ngl, except for the iiix girls tho, oh wait, and that toji
    // no miko girl, whatever)
    // p/s: i wanna kms

    // btw no fucking way mii hasegawa covered akm:
    // https://www.youtube.com/watch?v=aDh26KX6X0s

    // rosia-chan realized that le cat has so much waifu material that
    // rosia-chan can not be her rival, even though she sang "asuiwanttodie
    // pleasesavemefromthismadness moyou", but she has learned a skill from
    // her senpai's, which is stealing content from other franchises.

    // rosia-chan had an idea, she called jacklyn-chan to discuss the matter
    // and jacklyn-chan accepted. rosia-chan and jacklyn-chan are going to
    // use the seiyuu-no-jutsu to yoink waifus.

    // jacklyn-chan, decided to give her blessings to the atelier franchise,
    // while rosia-chan, jumping on the seasonal hype train and going for
    // the COTE route.

    // both of them haven't succeeded yet, but their plan has resulted in
    // the unfunniest meme of all time: "potential waifu". this also means
    // that those franchises will have a little bit of contribution to this
    // shitty era.

    // and they got the first step right ffs fuck this crap
    // i hate atelier
    // worst game franchise of all time
    // i hate the mc
    // fuck her
    // (pls save me)
}

fun AcceptImpact.AKMEraPart3(strength: Double, block: DSLImpact.() -> Unit = {}) {
    // I heard somewhere that “Love strikes so suddenly”
    // and so suddenly it is, that atelier girl is now a fucking canon waifu
    // rip arisu tho (she is probably just a bait anyways)

    // so, post-rst culture will have another shot with waifu meta, after failing
    // with le cat because of 'lack of content'. let's hope for the best for miss
    // 15-year-old escha malier to turn this culture into absolute chaos.
    Meme(strength, numDays("2022-09-01", "2022-10-01"), block)

    // rip modern culture
    // surely this is a way for rst to force me to study calc 1 and shit
    // flags:
    // atelier dusk series being post-apocalyptic
    // https://twitter.com/SB69F/status/1575350648966479873 (sb69f dead)
    // fall 2022 shit anime season
    // me getting into uni and the rise of post-modern politics (i love NAP)

    // after the glorious days of modern culture, we will live in a society
    // where only rst and sb69 are able to benefit from it (more idol dystopia
    // let's gooooooooo)
}
