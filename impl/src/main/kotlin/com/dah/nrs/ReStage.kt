package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

// gee-zay honesty
// where is the glorious rst

// watch rst and buy the bluray
private val AllRstTracks = mutableListOf<String>()
fun DSLEntry.TrackMusic(score: Double) {
    Music(score)
    AllRstTracks.add(id)
}

// only 0.15 NRS score from Love Live Niji
// top 1 anime doable LETSGO
// this is the first step of our global (oricon) domination plan
fun DSLScope.ReStage() {
    // changed da world

    // A sky, filled with colors, which was painted by a girl.
    // She changed everything.
    // She gave me power, reason to live, and most importantly,
    // the urge to sing.

    // For the first time, I recorded my own voice, singing her songs.

    // But then.
    // It was all gone.
    // The stage was then just a lifeless world.
    // The light went out, and no one was there.

    // But,
    // Like a book that was closed opened up
    // rst has changed da world.

    // rst-sb69 dse (Jan 10 - Mar 10, 2022)
    Meme(1.2, numDays("2022-01-10", "2022-03-10")) {
        val rstContribution = 0.35
        val sb69Contribution = 0.45

        contributors["A-MAL-38009"] = rstContribution * 0.9
        contributors["GF-VGMDB-7059"] = rstContribution * 0.1

        contributors["A-MAL-27441"] = sb69Contribution * 0.25
        contributors["A-MAL-32038"] = sb69Contribution * 0.3
        contributors["A-MAL-40763"] = sb69Contribution * 0.1
        contributors["A-MAL-41520"] = sb69Contribution * 0.25
        contributors["GF-VGMDB-4499-2"] = sb69Contribution * 0.1

        // method
        contributors["O-1"] = 0.2
    }

    // rst-only eras (Nov 2021 - Jan 10, 2022 and Mar 10, 2022 to June 3rd, 2022)
    Meme(0.95, numDays("2021-11-20", "2022-01-10") + numDays("2022-03-10", "2022-06-03")) {
        // time to nerf (fragment) rst boys
        contributors["A-MAL-38009"] = 0.65
        contributors["GF-VGMDB-7059"] = 0.1
        contributors["M-VGMDB-AR-29249"] = 0.01

        // method
        contributors["O-1"] = 0.15
    }

    // overture: shelter incident
    AEI(5.0, Emotion.CP) {
        contributors["M-VGMDB-AL-89363-2"] = 0.4
        contributors["A-MAL-38009"] = 0.6
    }

    // ed visual slaps
    AEI(2.5, Emotion.CP) {
        contributors["M-VGMDB-AL-78532-1"] = 0.25
        contributors["A-MAL-38009"] = 0.75
    }

    Entry {
        id = "F-VGMDB-7059"
        title = "Re:STAGE!"

        Entry {
            id = "A-MAL-38009"
            title = "Re:Stage! Dream Days♪"

            // pasta inc
            // "watch re:stage" - sun tzu, the art of war
            // Do you ever felt that your life has been a little boring Re:cently? Do you think that theRe: is nothing left in this world to be exploRe:d, theRe:foRe: making your life meaningless? If you think so, you have come to the right place. By doing this simple trick, you will decRe:ase your suicide rate by 200%.
            // In this capitalist world, everything is dominated by wealth. People fell for stupid stars stuffs like NFTs, shitcoins, etc. Tech companies are becoming moRe: and moRe: souless everyday. FRe:e softwaRe: activists aRe: now called pedophiles, open source people aRe: full of SJWs. The situation is a lot worse in social medias. People farming karma on HN, Re:ddit, cancelling each other on the bird app, hacking each other's account and then saying dumb stuff like:
            // You can't rely on one, even a small light
            // If you hold hands, you see, it will change to a constellation
            // Such a scenery that cannot be seen alone is born
            // Even on a dark road that seems to be lost
            // You can use that light as a landmark and step forward.
            // This world needs a Re:set. Maybe a solar storm will do the work, leaving self-proclaimed "data scientist" with their programmer socks with no job opportunities, giving back wealth to the non-tech people, who have been suffering in the last 20 years or so.
            // Now, let's fly to a country in East Asia, Japan. Its economy is quite stable, although the nation has been suffering from various population issues. Re:garding cultuRe:, Japanese people has a rich otaku cultuRe:, with a tRe:mendous amount of anime, manga, video games, etc. But theRe: has been a noticable degradation of those things' quality.
            // Take 2D idol franchises for example (we aRe: gonna also include stuff like band anime, such as bandori and k-on), the game concepts aRe: very Re:petitive. Rhythm games like bandori, d4dj or prosekai aRe: just reskins of osu mania, and without official custom beatmap support (you have to go to some weird site and download a weird app to play custom maps, cringe). SIFAS (sigh) is not even a rhythm game, lapis Re: light is 3d magiRe:co, idoly pride is (rip kanda sayaka), an idol training app or sth idk.
            // Tonikaku Anyways, as people who type stuff to make the computer do stuff, while listening and simping for some 2D girls that aRe: not even Re:al, we aRe: fucked.
            // That's what I felt befoRe: the moment.
            // And after that, my life has changed, foRe:ver.
            // Just like girls meet love, gazing into the same dRe:am under the same sky, grab the hand and stood up, pRe:paRe: for a passionate and juvenile-technoplanet attempt, I have become a new person, and the world has turned into an atarashii sekai.
            // And that moment is what I will never forget. I'm suRe: that this feeling will continue throughout four seasons. Yes, I'm suRe: of it.
            // Do you want the same thing to happen to yourself?
            // Do you want to start a new era, an era with only sweet youthful days of dRe:ams and passion, and without the pain you have been suffering?
            // A long time ago, my favorite osu! player, mRe:kk (also known as rushia1, sakamata1, plswatchRe:stage1, watchitifnotkys1, watchitoryouaRe:goingtothebackroomsanddieonlevel727wheRe:theyplayangelyellfor800hoursstraight1), set a pRe:tty impRe:ssive scoRe: on the map KiRaRe - 367Days, mapped by the gigachad mapper, _kotachi_. The play Re:warded him with 924 performance points. But what make me wonder is the title of the song. As everyone (including people that doesn't watch re:stage kill yourself you don't deserve to live, i swear i will kill all of your family, and fuck yo mama befoRe: that) know, a common year consists of 365 days, and a leap one has 366 days. TheRe: aRe: no years with 367 days, which is what the title is saying.
            // I listened to the song and felt in love with it. The vocal was perfect, the instrumental was a masterpiece. Just like a singer has sung: "te o no bashite", this song is the basest song ever I've heard.
            // But it didn't stop theRe:.
            // I checked out other KiRaRe's songs, and to my surprise, they aRe: all bangers (well except winter jewels that song sucks, but still better than vocaloid shit with edgy background of miku being a cRe:atuRe: that drink blood and shitty Re:petitive instrumental which got moRe: views than all KiRaRe's songs combined).
            // Then I looked at other units.
            // ortensia, which consists of two lesbians girls who can't live without each other. The song "Yes, We Are!" filled my mind with jumps.
            // Stellamaris, no it's not a stella-re:um Re:feRe:nce, ... their song aRe: mediocRe: (but still better than some weird songs with edgy vocal and a cringe hopping girl which got moRe: views than all KiRaRe's songs combined).
            // But theRe: is a chiisana problem, the franchise is kind of underrated. It doesn't have a subRe:ddit, its discord server is small (but comfy and based). I want to do something about this.
            // This is why you, can change the world, by shilling this franchise. Just copy this RE:ADME (or the github link) and spam it in any comment section you can see. By doing that, the franchise will grow, and the possibility for Re:Stage season 2 will incRe:ase, which will give us moRe: based content.
            // To conclude, let me quote some people:
            // “You've gotta dance like theRe:'s nobody watching,
            // Love like you'll never be hurt,
            // Sing like theRe:'s nobody listening,
            // And watch Re:Stage.”
            // ― William W. Purkey
            // “Without Re:Stage, life would be a mistake.”
            // ― Friedrich Nietzsche, Twilight of the Idols
            // (koRe: wa satiRe: desu, if you can't see that you should Re:take elementary school)

            // here's another one
            // guys did you see that, it's her, my favorite school idol of all time, tsukisaka sayu!
            // wdym by kanata konoe, who tf is that? i only know sayu! sayu is my love,
            // she saved me from my one-year-old depression and showed me how beautiful this world is.
            // and her unit, kirare, is such a beautiful unit with perfect chemistry.
            // imagine watching love live and getting fucked in the ass by lantis cocksuckers
            // xdddddddddddddddd

            // buy the new bluray guys, i'm sure that buying this will stop the russia-ukraine war
            // https://www.amazon.co.jp/Re-%E3%82%B9%E3%83%86%E3%83%BC%E3%82%B8-%E3%83%AF%E3%83%B3%E3%83%9E%E3%83%B3%E3%83%A9%E3%82%A4%E3%83%96%E3%80%8CChain-Dream%E3%80%8D-Blu-ray/dp/B09MZ8L66Q
            // also pls go to the rst live stage thing:
            // https://rst-project.com/event/event-1/
            // https://rst-project.com/event/event-1/
            // https://rst-project.com/event/event-1/
            // rip "new unit" hypothesis is dead rip sadge
            // but surely they'll debut in the second live stage thing right (clueless)

            // go to pop up shop now
            // https://srgym.official.ec/p/00001

            // for rst shills <3: https://www.google.com/search?q=grass&tbm=isch
            bestGirl = "Shikimiya Mana" // aka the kano destroyer
            // her seiyuu is the GINGACHAD seiyuu amane makino btw
            // follow her pls: https://twitter.com/makinoamane
            // follow her pls: https://twitter.com/makinoamane
            // follow her pls: https://twitter.com/makinoamane
            // follow her pls: https://twitter.com/makinoamane
            // follow her pls: https://twitter.com/makinoamane

            // the re stage niji incident
//            PADS(5, Emotion.MP)
            PADS(1, Emotion.MP)

            // 4chan loved rst, which is heartwarming af
            AEI(3.0, Emotion.MP)

            // rst lore
//            NEI(9.0, Emotion.AP)

            // inverse heisenberg and its consequences
            // (MU is from rst dark lore, the "maybe the ortensia incident is not just about
            // broken legs" bs, look at the iceberg for more shit like that)
            // (AU is from the anime's "Heisenberg Uncertainty Principle", which states that
            // the more popular an anime is, the more hated it is by me)
            AEI(2.5, Emotion.MU to 0.5, Emotion.AU to 0.5)

            // this was funny af
            // expected from a purely mpap-based idol anime
            AEI(6.0, Emotion.AP)

            // for the first time, i felt like i'm actually holding a glowstick,
            // waving it, and wish the best for the girls performing
            // rst redefined what an idol anime is
            // before rst, idol anime is just music + cgdct
            // but after this glorious franchise, it's also MP-farm, and more importantly
            // it's what all idol fans feel, the feeling of wanting the girls to success
            // tl;dr: the father analogy
            AEI(10.0, Emotion.CU to 0.5, Emotion.CP to 0.5)

            // also rst abused heisenberg and cucked love live and princess connect, as well as
            // blacklisted shit like aot or kimetsu no yaiba lmfao

            FeatureMusic("M-VGMDB-AL-89363-1")
            FeatureMusic("M-VGMDB-AL-89363-2")
            FeatureMusic("M-VGMDB-AL-78532-1")
            FeatureMusic("M-VGMDB-AL-89364-3")
            FeatureMusic("M-VGMDB-AL-78516-1")
            FeatureMusic("M-VGMDB-AL-78764-1")
            FeatureMusic("M-VGMDB-AL-78515-1")

            // rst changed da world
            // fun fact:
            // rst (mf) and onsen vgmdb franchise id is literally
            // next to each other
            // wtf??????
            // (6439 and 6438)
            GateOpen("F-VGMDB-6439")
            GateOpen("F-VGMDB-4499")

            Boredom(Boredom.Completed)
        }

        Entry {
            id = "M-VGMDB-AL-78536"
            title = "Startin' My Re:STAGE!!"

            SubIDEntry("2") {
                TrackMusic(1.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-78534"
            title = "Remembers!"

            SubIDEntry("1") {
                TrackMusic(3.0)
                // haha funny centuRe: reference
                Meme(0.05, 6)
            }

            SubIDEntry("2", "Kimi ni Okuru Angel Yell") {
                // the angel yell incident
                TrackMusic(7.5)
                Meme(0.2, 10)
            }
        }

        Entry {
            id = "M-VGMDB-AL-78575"
            title = "Natsu no Yakusoku"

            SubIDEntry("1") {
                TrackMusic(1.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-78532"
            title = "Akogare Future Sign"

            SubIDEntry("1") {
                TrackMusic(3.0)
            }

            // track 2
            Contains("M-VGMDB-AL-78575-1")
        }

        Entry {
            id = "M-VGMDB-AL-78530"
            title = "KiRaRhythm"

            SubIDEntry("1", "Do it!! PARTY!!") {
                // do it happy daibouken reference
                TrackMusic(5.0)
            }

            Contains("M-VGMDB-AL-78534-1")
            Contains("M-VGMDB-AL-78534-2")
            Contains("M-VGMDB-AL-78575-1")
            Contains("M-VGMDB-AL-78532-1")
            Contains("M-VGMDB-AL-78536-2")
        }

        Entry {
            id = "M-VGMDB-AL-78516"
            title = "SENSEI Sensation"

            SubIDEntry("1") {
                // [plasmagunstepgica]
                TrackMusic(3.0)
                OsuSong(personal = 0.2)
            }
        }

        Entry {
            id = "M-VGMDB-AL-78764"
            title = "367Days"

            SubIDEntry("1") {
                // THE FUNNY NUMBER, WHEN YOU FUCKING SEE IT
                // (definitely not a cheap copy of osu's 727)
                Meme(0.05, 45)

                // the song that started it all
                // https://www.youtube.com/watch?v=9nbo5smhj8M
                // [9.06⭐Live] rushia1 | KiRaRe - 367Days [Over the Dreams] +HDDT 95.81% {#4 1005pp 1❌} - osu!
                OsuSong(personal = 5.0)

                TrackMusic(5.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-84229"
            title = "HAPPY TYPHOON"

            SubIDEntry("1") {
                TrackMusic(0.8)
            }

            SubIDEntry("2", "Stereo Life") {
                // yozora ni kagayaku yume no ryuusei wa
                // kek
                TrackMusic(1.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-86622"
            title = "Re:STAGE! DREAM DAYS♪ SONG SERIES 1: Don't think, smile!!"

            SubIDEntry("1", "Don't think, smile!!") {
                TrackMusic(2.5)
            }

            SubIDEntry("2", "Akogare Future Sign (Piano Strings Arrange)") {
                TrackMusic(2.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-89363"
            title = "Re:STAGE! DREAM DAYS♪ SONG SERIES 5 INSERT SONG MINI ALBUM: DRe:AMER KiRaRe ver."

            Contains("M-VGMDB-AL-78516-1")
            Contains("M-VGMDB-AL-78764-1")

            SubIDEntry("1", "Kirameki Future") {
                // ca truong chuyen deu luon luon khiep so
                // mot nguoi diet het moi tuong lai uoc mo
                // xinh dep bac nhat tren thai binh que to
                // co gai hoan love luon khien cho ca truong chuyen don dau
                TrackMusic(4.5)
            }

            SubIDEntry("2", "OvertuRe:") {
                // meme lyrics xddd
                // I can't rely on one
                // 一つじゃ頼りない

                // Even a small light
                // 小さな明かりでも

                // If you hold hands
                // 手を取り合えばほら

                // To change to a constellation
                // 星座に変わってくように
                // I can't see it alone
                // 一人じゃ見れない

                // Such a landscape is born
                // そんな景色が生まれてく

                // Any wall turns into a door
                // どんな壁も 扉に変わる

                // I can say so now
                // 今ならそう 言い切れるんだ

                // I met you and started to move
                // キミと出会い 動き出した

                // Our Re: Stage!
                // 私たちの Re:ステージ！

                // ty based _kotachi_ and [Karcher] (and other mapsets too, but i haven't played them)
                // for [It's KiRaRe!!!!], [G11K's Insane] and [Cute Mana]
                // also my cut ver. sucks KEKW
                OsuSong(personal = 6.0)

                // one day, just like KiRaRe with this song,
                // the girls will shine and overtake the number 1 of Oricon ranking
                // demon slayer? more like got slayed by rst lmao xddddd
                // love live? more like love die because you got cucked by rst xddddddd KEKW ING
                // we will be on the top and people will have to smoke COPIUM just like me rn
                TrackMusic(8.0)
            }
        }

        Entry {
            id = "M-VGMDB-AR-30829"
            title = "KiRaRe"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-78536")
                Contains("M-VGMDB-AL-78534")
                Contains("M-VGMDB-AL-78575")
                Contains("M-VGMDB-AL-78532")
                Contains("M-VGMDB-AL-78530-1")
                Contains("M-VGMDB-AL-78516")
                Contains("M-VGMDB-AL-78764")
                Contains("M-VGMDB-AL-84229")
                Contains("M-VGMDB-AL-86622")
                Contains("M-VGMDB-AL-89363")
                Contains("M-VGMDB-AL-104673-5")
                Contains("M-VGMDB-AL-122232")
            }
        }

        Entry {
            id = "M-VGMDB-AL-89364"
            title = "Re:STAGE! DREAM DAYS♪ SONG SERIES 6 INSERT SONG MINI ALBUM: DRe:AMER ortensia ver."

            Contains("M-VGMDB-AL-89363-1")
            Contains("M-VGMDB-AL-89363-2")
            Contains("M-VGMDB-AL-78520-1")

            SubIDEntry("3", "Yes, We Are!!!") {
                TrackMusic(3.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-78520"
            title = "Purple Rays"

            SubIDEntry("1") {
                TrackMusic(3.0)
            }

            SubIDEntry("2", "Dear My Friend") {
                TrackMusic(4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-78339"
            title = "＊Heart Confusion＊"

            SubIDEntry("1") {
                TrackMusic(1.0)
            }

            SubIDEntry("2", "crave") {
                // gigachad keeno:
                // >doesn't give a shit about multimedia franchises
                // >still makes a song for rst anyway, but other franchises get none
                // >refuses to elaborate further
                // >leaves
                TrackMusic(2.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-82983"
            title = "Pullulate"

            Contains("M-VGMDB-AL-78339-1")
            Contains("M-VGMDB-AL-78339-2")
            Contains("M-VGMDB-AL-78520-1")
            Contains("M-VGMDB-AL-78520-2")

            SubIDEntry("5", "Ano ne") {
                TrackMusic(2.0)
            }
        }

        Entry {
            // cri-cri of rst
            // not even close tho
            id = "M-13"
            title = "ortensia"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-89364-3")
                Contains("M-VGMDB-AL-78520")
                Contains("M-VGMDB-AL-78339")
                Contains("M-VGMDB-AL-82983")
                Contains("M-VGMDB-AL-104673-2")
                Contains("M-59")
            }
        }

        Entry {
            id = "M-VGMDB-AL-82369"
            title = "Q.E.D."

            SubIDEntry("1", "InFiction") {
                TrackMusic(4.5)
            }

            SubIDEntry("8", "DESERT BLACK FLOWER") {
                TrackMusic(7.5)
            }
        }

        Entry {
            id = "M-14"
            title = "Stellamaris"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-82369-1")
                Contains("M-VGMDB-AL-104673-1")
            }
        }

        Entry {
            id = "M-15"
            title = "TROIS ANGES"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-104673-3")
            }
        }

        Entry {
            id = "M-VGMDB-AL-78515"
            title = "Raise Your Fist"

            SubIDEntry("1", "Canaria") {
                TrackMusic(6.0)
            }
        }

        Entry {
            id = "M-16"
            title = "Tetrarkhia"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-78515")
                Contains("M-VGMDB-AL-104673-4")
            }
        }

        Entry {
            id = "M-VGMDB-AL-109271-48"
            title = "Watashitachi, Shiki o Asobun Desu!!"

            // i mapped and tried to shill it on:
            // - sotarks map roasting
            // - btmc map requests
            // (both failed lmfao)
            TrackMusic(8.0)

            // hige driver composed and arranged this btw
            // (ye the dude who make dadadadadada)
        }

        Entry {
            id = "M-VGMDB-AL-104673"
            title = "Re:STAGE! CONCEPT MINI ALBUM: Chain of Dream"
            // aka method appreciation album

            SubIDEntry("1", "Bridge to Dream") {
                // method, la method
                // nguoi ma mang lai nhung dieu ma ta tin
                // method
                // toa sang len nhu anh sao, dep biet bao
                // method, la method
                // la nguoi mang niem tin hi vong cho toi
                // se mang lai biet bao su huy hoang

                TrackMusic(7.0)
            }

            SubIDEntry("2", "Re:Rays") {
                TrackMusic(5.0)
            }

            SubIDEntry("3", "Tomorrow Melodies") {
                // do chinh la method
                // nguoi dan ong da khien ca truong,
                // ca truong chuyen da luon lo so

                TrackMusic(7.0)
            }

            SubIDEntry("4", "Pins&Needles") {
                TrackMusic(4.5)
            }

            SubIDEntry("5", "We Remember") {
                // ngau loi vai ra
                // nay nhat minh oi nay nhat minh oi
                // tai vi sao a qua ngau
                // (the gian d ai sanh bang)

                TrackMusic(3.0)
            }
        }

        // 4th anniversary songs
        // these new songs are "saved" for future use, therefore their
        // scores are not that high rn
        // (except for the absolute banger clematis)
        Entry {
            id = "M-VGMDB-AL-120845"
            // https://linkco.re/5XDmDcHp
            title = "Sin City"
            // aka sussin city

            SubIDEntry("1") {
                TrackMusic(3.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-120844"
            // https://linkco.re/AM0HVHA5
            title = "Chiguhagu Melody"
            // aka mismatched melody

            // ty for going back based akari kito
            SubIDEntry("1") {
                TrackMusic(2.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-120842"
            // https://linkco.re/YShsnTEb
            title = "Unison Monologue"
            // aka the 330 bpm song but actually an alt-165 bpm one

            SubIDEntry("1") {
                TrackMusic(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-120836"
            title = "Ginga no Shizuku"
            // le gingachad seiyuu

            SubIDEntry("1") {
                TrackMusic(1.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-121168"
            title = "Clematis"
            // catjam tho
            // no one's like the "intelligent update", no one's like the king (clap x2)
            // shining like the dawn, scared the whole high school (clap x2)
            // singing the hope, of tomorrow, of the future
            // the legend will shine and we'll all rise

            // the numbers wtf
            // https://www.youtube.com/watch?v=hj_4YAVmmuI

            SubIDEntry("1") {
                TrackMusic(6.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-122232"
            title = "Ideal/Idol"
            // inb4 the "i'd like to interject for a moment,
            // what ur refering to as idol, is in fact ideal/idol..." pasta

            SubIDEntry("1") {
                TrackMusic(1.5)
            }
        }

        Entry {
            id = "M-59"
            title = "Amaoto Fanfare"
            // inb4 ortensia banger
            // based ortensia is back with an absolute catjammer
            // https://www.youtube.com/watch?v=bYwwlGeauS4&t=3038s

            // will be decided after full song release
            TrackMusic(2.5)
        }

        Entry {
            id = "M-48"
            title = "Re:STAGE! ALL IDOL"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-109271-48")
            }
        }

        // Entry {
        //     id = ""
        //     title = "Re:Stage! Prism Step Concept Album: Reboot"
        //     // pre-register the new album now
        //     // https://twitter.com/rst_project/status/1550075801852588032
        // }

        Entry {
            id = "GF-VGMDB-7059"
            title = "Re:Stage! Prism Step"

            GateOpen("F-VGMDB-6439")
            GateOpen("F-VGMDB-4499")

            AllRstTracks.forEach { FeatureMusic(it) }
        }

        KilledBy("F-VGMDB-4499", potential = 0.4, effect = 0.9) {
            contributors["A-MAL-38009"] = 0.8
            contributors["GF-VGMDB-7059"] = 0.2
        }

        // r/osuplace stuff
        KilledBy("M-52", potential = 0.4, effect = 0.9) {
            contributors["A-MAL-38009"] = 0.8
            contributors["GF-VGMDB-7059"] = 0.2
        }

        KilledBy("O-1", potential = 0.2, effect = 0.75) {
            contributors["A-MAL-38009"] = 0.8
            contributors["GF-VGMDB-7059"] = 0.2
        }
    }

    // the "watch rst" anime

    // "
    // for the first time, i felt like i'm actually holding a glowstick,
    // waving it, and wish the best for the girls performing
    // rst redefined what an idol anime is
    // before rst, idol anime is just music + cgdct
    // but after this glorious franchise, it's also MP-farm, and more importantly
    // it's what all idol fans feel, the feeling of wanting the girls to success
    // " - me in the rst anime part
    // this is literally the plot of this anime lmfao
    Entry {
        id = "A-MAL-37890"
        title = "Oshi ga Budoukan Ittekuretara Shinu"
        // aka "If RST can overtake Love Live in the Oricon ranking, I can die happy"
        bestGirl = "Shikimiya Maina"
        // oops
        bestGirl = "Ichii Maina"

        Boredom(Boredom.Watching)

        // as always (low potential because rst actually helped oshibudo tho,
        // but it's still a kill)
        KilledBy("F-VGMDB-7059", potential = 0.25, effect = 0.5)
    }

    AEI(10.0, Emotion.CP to 0.9, Emotion.MP to 0.1) {
        contributors["A-MAL-37890"] = 0.5
        contributors["A-MAL-38009"] = 0.45
        contributors["GF-VGMDB-7059"] = 0.05
    }

    Entry {
        id = "M-53"
        title = "Re:STAGE! Songs Compilation"
        // kek 69 min song comp
        // TODO: add the 48 songs here

        // the ultimate mapping project, aka the 367000pp project
        // https://osu.ppy.sh/beatmapsets/1716294#osu/3506938
    }
}
