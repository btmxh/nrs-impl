package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.dsl.numDays
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
                Music(2.0)
                Remix("M-62")
            }

            SubIDEntry("3", "Masshiro Start Line") {
                Music(5.0)
            }
        }

        Entry {
            id = "M-62"
            title = "Kimi no Rhapsody (DJ DEVILMINTKIRYU Remix)"
            // aka hoantinh theme song

            Music(4.0)
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
                // ^ clueless mfs

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

        // adding these songs to increase Murakawa Rie and Hidaka Rina's score lol
        // (i can't accept ayumu va to be higher than rina hidaka lol)
        Entry {
            id = "M-VGMDB-AL-95313"
            title = "How Are You?"

            SubIDEntry("1") {
                Music(6.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-95314"
            title = "Happy Happy Jump"

            SubIDEntry("1") {
                Music(5.0)
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
                Contains("M-62", 0.5)
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

    // "
    // rst-sb69 duopoly era season 2: electric boogaloo (June 3rd, 2022 onwards)
    // featuring modern vietnamese literature, esters, tien duc and more...
    // " - clueless mf doesn't know about the song

    // Asuiro Koi Moyou era (arc 1)
    // AKM is basically the "child" of rst and sb69,
    // inheriting rst's love and sb69's catjam af music
    // This arc features dumb shit like MVL (modern vietnamese literature)
    Meme(1.0, numDays("2022-06-03", "2022-07-17")) {
        val rstContribution = 0.3
        val sb69Contribution = 0.1
        val asuiroContribution = 0.6

        // before the graduation exam, this somewhat was meta
        // after the exam ends and i (probably) won't have to
        // touch this subject ever again, it died
        val mvlContribution = asuiroContribution * 0.2
        val vcapAnalogyContribution = mvlContribution * 0.4
        val ctnxAnalogyContribution = mvlContribution * 0.4
        val nldsdAnalogyContribution = mvlContribution * 0.2

        val loveLiveContribution = nldsdAnalogyContribution * 0.5
        contributors["O-2"] = nldsdAnalogyContribution * 0.5
        contributors["A-MAL-40879"] = loveLiveContribution * 0.25
        contributors["A-MAL-48916"] = loveLiveContribution * 0.35
        contributors["A-MAL-15051"] = loveLiveContribution * 0.05
        contributors["A-MAL-19111"] = loveLiveContribution * 0.05
        contributors["A-MAL-32526"] = loveLiveContribution * 0.05
        contributors["A-MAL-34973"] = loveLiveContribution * 0.05
        contributors["A-MAL-41169"] = loveLiveContribution * 0.05
        contributors["A-MAL-50203"] = loveLiveContribution * 0.05
        contributors["A-MAL-24997"] = loveLiveContribution * 0.05
        contributors["A-MAL-37027"] = loveLiveContribution * 0.05

        contributors["O-4"] = ctnxAnalogyContribution * 0.5
        contributors["A-MAL-50265"] = ctnxAnalogyContribution * 0.25
        contributors["M-VGMDB-AL-111027-10"] = ctnxAnalogyContribution * 0.25

        contributors["O-3"] = vcapAnalogyContribution * 0.6
//        contributors["_kotachi_"] = vcapAnalogyContribution * 0.2

        contributors["A-MAL-38009"] = rstContribution * 0.8
        contributors["GF-VGMDB-7059"] = rstContribution * 0.1
        // her theme song: https://www.youtube.com/watch?v=Ux5cQbO_ybw
        contributors["M-VGMDB-AR-29249"] = rstContribution * 0.01
        // the akari kito analogy lol
        contributors["M-VGMDB-AR-26898"] = rstContribution * 0.005 + vcapAnalogyContribution * 0.2

        contributors["A-MAL-27441"] = sb69Contribution * 0.25
        contributors["A-MAL-32038"] = sb69Contribution * 0.3
        contributors["A-MAL-40763"] = sb69Contribution * 0.1
        contributors["A-MAL-41520"] = sb69Contribution * 0.25
        contributors["GF-VGMDB-4499-2"] = sb69Contribution * 0.1

        contributors["M-VGMDB-AR-8480"] = asuiroContribution * 0.12
        contributors["M-VGMDB-AR-14761"] = asuiroContribution * 0.08
        contributors["M-VGMDB-AL-76155-2"] = asuiroContribution * 0.8

        // all of this shit basically spits on all other anime
        // that was unable to be meta'd for longer than a month
        // while literally a song not even 5 minutes was able
        // to turn modern culture into the shittiest hellhole ever.
    }

    // AKM era arc 2
    // seasonal anime now exists, le boat analogy is dying, etc.
    // sb69 top 1 franchise now xd
    Meme(1.0, numDays("2022-07-21")) {
        // july then comes with a bunch of new seasonal anime,
        // and some of them were infused with akm shit such as:
        // - classroom of the elite: a girl with same VA as rosia
        // was declared "potential waifu"
        // - something motokano something: another girl with same
        // VA as rosia
        // - atelier (not seasonal): have OP named "asuiro" and
        // sang by the VA of jacklyn, who also was the VA for the
        // main girl aka "botaental guaifu"
        // (and then i downloaded the game lol XDDDDDDDDDDDDD)
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
        val rstContribution = 0.05
        val sb69Contribution = 0.2
        val asuiroContribution = 0.5
        val atelierContribution = 0.15
        val coteContribution = 0.1

        contributors["M-VGMDB-AL-111027-10"] = 0.01

        contributors["A-MAL-38009"] = rstContribution * 0.8
        contributors["GF-VGMDB-7059"] = rstContribution * 0.1
        // her theme song: https://www.youtube.com/watch?v=Ux5cQbO_ybw
        contributors["M-VGMDB-AR-29249"] = rstContribution * 0.01

        contributors["A-MAL-27441"] = sb69Contribution * 0.25
        contributors["A-MAL-32038"] = sb69Contribution * 0.3
        contributors["A-MAL-40763"] = sb69Contribution * 0.1
        contributors["A-MAL-41520"] = sb69Contribution * 0.25
        contributors["GF-VGMDB-4499-2"] = sb69Contribution * 0.1

        contributors["M-VGMDB-AR-8480"] = asuiroContribution * 0.12
        contributors["M-VGMDB-AR-14761"] = asuiroContribution * 0.08
        contributors["M-VGMDB-AL-76155-2"] = asuiroContribution * 0.8

        // rosia-chan realized that le cat has so much waifu potential that
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
        contributors["A-MAL-21167"] = atelierContribution * 0.8
        contributors["G-VGMDB-3499"] = atelierContribution * 0.1
        contributors["G-VGMDB-1090"] = atelierContribution * 0.1
        contributors["A-MAL-51096"] = coteContribution * 0.8
        contributors["A-MAL-35507"] = coteContribution * 0.2
    }
}
