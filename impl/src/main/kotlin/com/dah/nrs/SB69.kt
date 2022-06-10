package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

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

        AEI(5.0, Emotion.AP) {
            contributors["A-MAL-27441"] = 0.5
            contributors["A-MAL-32038"] = 0.5
        }

        AEI(2.0, Emotion.AP) {
            contributors["A-MAL-40763"] = 0.6
            contributors["A-MAL-41520"] = 0.4
        }

        Waifu("Hijirikawa Cyan", "2022-01-15" to "2022-03-10") {
            contributors["A-MAL-27441"] = 0.35
            contributors["A-MAL-32038"] = 0.35
            contributors["A-MAL-40763"] = 0.05
            contributors["A-MAL-41520"] = 0.2
            contributors["GF-VGMDB-4499-2"] = 0.05
        }

        KilledBy("F-VGMDB-7059", potential = 0.4, effect = 0.75) {
            contributors["A-MAL-27441"] = 0.2
            contributors["A-MAL-32038"] = 0.2
            contributors["A-MAL-40763"] = 0.2
            contributors["A-MAL-41520"] = 0.2
            contributors["GF-VGMDB-4499-2"] = 0.2
        }

        KilledBy("O-1", potential = 0.2, effect = 0.75) {
            contributors["A-MAL-27441"] = 0.2
            contributors["A-MAL-32038"] = 0.2
            contributors["A-MAL-40763"] = 0.2
            contributors["A-MAL-41520"] = 0.2
            contributors["GF-VGMDB-4499-2"] = 0.2
        }

        Entry {
            id = "A-MAL-27441"
            title = "Show by Rock!!"
            bestGirl = "Hijirikawa Cyan" // aka the ayumu cat

            FeatureMusic("M-VGMDB-AL-51276-1")
            FeatureMusic("M-VGMDB-AL-51278-1")
            FeatureMusic("M-VGMDB-AL-51706-1")
            FeatureMusic("M-VGMDB-AL-51706-2")

            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-32038"
            title = "Show by Rock!! #"
            bestGirl = "Hijirikawa Cyan" // aka the ayumu cat

            // the lesson thingy was pretty cool ig
            AEI(2.0, Emotion.MP)

            // I almost cried at the ailane thing
            // <strikethrough>but NEI because gigachad animes don't farm tears</strikethrough>
            // didn't care didn't ask, and the NEI/AEI rework is here either way
            AEI(7.0, Emotion.MP)

            FeatureMusic("M-VGMDB-AL-61217-1")
            FeatureMusic("M-VGMDB-AL-61940-1")
            FeatureMusic("M-VGMDB-AL-61981-1")
            FeatureMusic("M-VGMDB-AL-61981-3")

            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-40763"
            title = "Show By Rock!! Mashumairesh!!"
            bestGirl = "Mashima Himeko" // aka himekek
            // main girl is hoan tinh xdddddddddd
            // chao em co gai howan tinh
            // actually the cat appeared in last ep but idc

            // my heart skipped a beat when the cat
            // appeared in last ep
            // keking
            NEI(7.5, Emotion.MP)

            FeatureMusic("M-VGMDB-AL-93440-1")
            FeatureMusic("M-VGMDB-AL-93440-3")
            FeatureMusic("M-VGMDB-AL-93441-1")

            // the screentime thing
            // mashu mp farm got fucked by the existence of the cat
            // and pmgc
            KilledBy("M-18", potential = 0.75, effect = 0.75)

            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-41520"
            title = "Show by Rock!! Stars!!"
            bestGirl = "Hijirikawa Cyan" // aka the ayumu cat
            // aka show by rock!! banded rocking records high school idol club
            // the gen2 niji

            // although this is not watched during its release
            // to make sure sb69 not killing rst, and maybe sb69 stars
            // can pull up a niji moment, this is watched in a "seasonal"
            // way, at every 12pm saturday from 2022/1/22
            // update: shit happened and no more seasonal
            seasonal = false

            bestGirl = "Hijirikawa Cyan" // cats can fly

            // bro the ayumu shit happened again xddddddddddd
            // basically in ep 1&2, the cat has little screentime,
            // and considering i have to wait 2 long weeks to watch
            // this, it's frustrating af.
            NEI(5.0, Emotion.AU)

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

            Boredom(Boredom.Completed)
        }

        // fes a live has fhana songs lmao
        FeatureMusic("M-VGMDB-AL-62516-1")
        FeatureMusic("M-VGMDB-AL-110219-1")

        Entry {
            id = "M-VGMDB-AL-100087"
            title = "How To Fly"

            SubIDEntry("1") {
                Music(2.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-94913"
            title = "My pace!!"

            SubIDEntry("1") {
                // really interesting vocal
                // (somewhat resemble kano)
                Music(2.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-51276"
            title = "Seishun wa Non-Stop!"

            SubIDEntry("1") {
                Music(2.5)

                Remix("M-22")
            }

            SubIDEntry("2", "Close to you") {
                Music(3.0)

                Remix("M-VGMDB-AL-61981-3")
            }
        }

        Entry {
            id = "M-VGMDB-AL-51278"
            title = "Tabiji Yoiyoi Yume Hanabi"

            SubIDEntry("1") {
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-51706"
            title = "Meikyuu DESTINY/Ryuusei Dreamline"

            SubIDEntry("1", "Meikyuu DESTINY") {
                Music(5.0)
            }

            SubIDEntry("2", "Ryuusei Dreamline") {
                // kekekekekekek
                Music(2.25)
            }
        }

        Entry {
            id = "M-VGMDB-AL-61217"
            title = "Heart wo Rock!!"

            SubIDEntry("1") {
                Music(7.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-61940"
            title = "Schlehit Melodie/Danzai no Solitude"

            SubIDEntry("1", "Schlehit Melodie") {
                Music(4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-61981"
            title = "My Resolution ~Mirai e no Kizuna~"

            SubIDEntry("1") {
                Music(5.0)
            }

            SubIDEntry("3", "Close to you (Cyan ver.)") {
                Music(3.0)

                NEI(2.5, Emotion.MP)
            }
        }

        Entry {
            id = "M-VGMDB-AL-59914"
            title = "Do Re Mi Fa PARTY"

            SubIDEntry("1") {
                // xd
                Music(1.25)
                Meme(0.1, 2)
            }
        }

        // visuals of hiromemes and mashiro start line are good
        NEI(5.0, Emotion.MP) {
            contributors["A-MAL-40763"] = 0.75
            contributors["M-VGMDB-AL-93440-1"] = 0.25
        }

        AEI(5.0, Emotion.CP) {
            contributors["A-MAL-40763"] = 0.75
            contributors["M-VGMDB-AL-93440-3"] = 0.25
        }

        Entry {
            id = "M-VGMDB-AL-93440"
            title = "Hiromenes/Kimi no Rhapsody"

            SubIDEntry("1", "Hiromenes") {
                Music(5.0)
            }

            SubIDEntry("2", "Kimi no Rhapsody") {
                Music(1.0)
            }

            SubIDEntry("3", "Masshiro Start Line") {
                Music(5.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-93441"
            title = "Yell and Response"

            SubIDEntry("1") {
                Music(2.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-104341"
            title = "Do Re Mi Fa STARS!!/Hoshizora Light Story"

            SubIDEntry("1", "Do Re Mi Fa STARS!!") {
                // aka ceui - colorful days (mp-based franchise ver.)
                // or the counting song
                Music(5.0)
            }

            SubIDEntry("2", "Hoshizora Light Story") {
                Music(2.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-104266"
            title = "SHOW BY ROCK!! STARS!! INSERT SONG MINI ALBUM Vol.1"

            SubIDEntry("3", "Do! It! Happy Daibouken!") {
                // do it party reference lmfao
                Music(6.5)
            }

            SubIDEntry("6", "Kyukyukyun♡Heart Shaker") {
                // aaaaa co sao method thong minh the
                // co le dell ai ngau giong anh chang
                // ngau loi nhat ca doi tuyen toan
                // do co le la em toi

                Music(5.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-104267"
            title = "SHOW BY ROCK!! STARS!! INSERT SONG MINI ALBUM Vol.2"

            SubIDEntry("5", "EMPIRE DOMINATOR") {
                Music(2.5)
            }

            SubIDEntry("8", "Anokanatarium") {
                // this was unranked all this time?????
                // lmfao
                Music(6.5)
                
                // there's no one who is cooler
                // there's no one who's like him
                // the one who shines like the sun
                // forever shining is the method
            }
        }

        Entry {
            id = "M-VGMDB-AL-61982"
            title = "Hanate! Dododon!"

            SubIDEntry("1") {
                Music(5.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-118562"
            title = "Taikakusen wo Tsunaideyo"

            SubIDEntry("1") {
                Music(5.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-104418"
            title = "Good Day by Day"

            // also sung by Ailane (cv. Ruriko Noguchi) and Shibarin (cv. Marika Kohno)
            SubIDEntry("1") {
                Music(2.5)
            }

            // if u understand, u understand
            // RemixOf("M-VGMDB-AL-97688-16")
        }

        Entry {
            id = "M-VGMDB-AL-100082"
            title = "Mirai Wanted"

            SubIDEntry("1") {
                Music(4.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-116297"
            title = "Bokura no Neiro"

            SubIDEntry("1") {
                Music(2.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-105612"
            title = "Mot Mot Mot"

            SubIDEntry("1") {
                Music(5.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-86315-3"
            title = "P SHOW BY ROCK!!"

            SubIDEntry("3", "Nyumber One! Zettai Saikyou!") {
                Music(7.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-76155"
            title = "Loop Shiteru/Asuiro Koi Moyou"

            SubIDEntry("2", "Asuiro Koi Moyou") {
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

                Music(8.0)

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


            }
        }

        Entry {
            id = "M-18"
            title = "Plasmagica"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-94913")
                Contains("M-VGMDB-AL-51276")
                Contains("M-22", 0.5)
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
            id = "M-19"
            title = "Tsurezurenaru Ayatsuri Mugenan"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-51278")
            }
        }

        Entry {
            id = "M-20"
            title = "Mashumairesh!!"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-93440")
                Contains("M-VGMDB-AL-93441")
                Contains("M-VGMDB-AL-104341-1", 0.5)
                Contains("M-VGMDB-AL-104341-2", 1.0)
                Contains("M-VGMDB-AL-104267-8", 1.0)
            }
        }

        Entry {
            id = "M-21"
            title = "BUD VIRGIN LOGIC"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-61940")
                Contains("M-VGMDB-AL-104267-5")
            }
        }

        Entry {
            id = "M-23"
            title = "Criticrista"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-104266-6")
                Contains("M-VGMDB-AL-61982")
                Contains("M-VGMDB-AL-105612")
                Contains("M-VGMDB-AL-86315-3")
                Contains("M-VGMDB-AL-76155")
            }
        }
    }

    // the famous speed-finger control map
    Entry {
        id = "M-22"
        title = "Seishun wa Non-Stop! (Asterisk DnB Remix)"

        Music(6.0)
        OsuSong(personal = 7.5)
    }
}
