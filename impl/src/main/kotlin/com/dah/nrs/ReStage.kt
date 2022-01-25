package com.dah.nrs

fun GenerateBlock.ReStage() {
    // changed da world

    // A sky, filled with colors.
    // It was painted by a girl, and her name is Uehara Ayumu.

    // She changed everything.
    // She gave me power, reason to live, and most importantly,
    // the urge to sing.

    // For the first time, I recorded my own voice, singing her songs.

    // But then.
    // It was all gone.
    // The stage was then just a liveless world.
    // The light went out, and no one was there.

    // But,
    // Like a book that was closed opened up
    // rst has changed da world.

    val AllKiRaRe = arrayOf(KiRaRe, MakinoAmane, KitoAkari, TazawaMasumi, TachibanaMeemu, IwahashiYuka, SoramiYuki)
    val AllOrtensia = arrayOf(Ortensia, OzawaAri, HanamoriYumiri, MineuchiTomomi)
    val AllStellamaris = arrayOf(Stellamaris, TakahashiMinami, SuwaAyaka, TanakaAimi)
    val AllTROISANGES = arrayOf(TROISANGES, HiokaNatsumi, AbeRika, NagatsumaJuri)
    val AllTetrarkhia = arrayOf(Tetrarkhia, YamadaNatsumi, SatouMiki, TakayanagiTomoyo, NishidaNozomi)

    val ReStageTracks = arrayListOf<String>()
    fun AddTrack(album: Int, trackNum: Int) {
        ReStageTracks.add(VGMDB_Track(album, trackNum))
    }

    AddTrack(78536, 1)
    AlbumTrack(VGMDB_Album(78536), 1, "Startin' My Re:STAGE!!", *AllKiRaRe) {
        Music(0.3)
    }

    AddTrack(78534, 1)
    AlbumTrack(VGMDB_Album(78534), 1, "Remembers!", *AllKiRaRe) {
        Music(0.3)
        Impact("century man reference", Emotion.AP, 0.1)
    }

    AddTrack(78534, 2)
    Track(VGMDB_Track(78534, 2), "Kimi ni Okuru Angel Yell", *AllKiRaRe) {
        // not only is this song a banger, but it also has like literally 1 trillion memes
        // like the incident
        // yell and response
        // kimi ni okuru in that pgmc ballad song lyrics
        // and some other stuff i don't remember
        Music(2.0)
    }

    AddTrack(78575, 1)
    AlbumTrack(VGMDB_Album(78575), 1, "Natsu no Yakusoku", *AllKiRaRe) {
        Music(0.6)
    }

    Album(VGMDB_Album(78532), "Akogare Future Sign") {
        // includes natsu no yakusoku
        Include(VGMDB_Track(78575, 1))
    }

    AddTrack(78532, 1)
    Track(VGMDB_Track(78532, 1), "Akogare Future Sign", *AllKiRaRe) {
        Music(0.8)
    }

    AddTrack(78525, 1)
    AlbumTrack(VGMDB_Album(78525), 1, "FlowerS ~Tonari de Saku Hana no you ni~", *AllOrtensia) {
        Music(0.4)
    }

    AddTrack(78525, 1)
    Track(VGMDB_Track(78525, 2), "Dream a gate", *AllOrtensia) {
        Music(0.4)
    }

    AddTrack(78522, 1)
    AlbumTrack(VGMDB_Album(78522), 1, "Stage of Star", *AllStellamaris) {
        Music(0.5)
    }

    AddTrack(78522, 2)
    Track(VGMDB_Track(78522, 2), "Koi wa Fusion", *AllStellamaris) {
        Music(0.45)
    }

    Album(VGMDB_Album(78530), "KiRaRhythm") {
        Include(VGMDB_Track(78534, 1))
        Include(VGMDB_Track(78534, 2))
        Include(VGMDB_Track(78575, 1))
        Include(VGMDB_Track(78532, 1))
        Include(VGMDB_Track(78536, 1))
    }

    AddTrack(78530, 1)
    Track(VGMDB_Track(78530, 1), "Do it!! PARTY!!", *AllKiRaRe) {
        Music(1.5)
    }

    AddTrack(78520, 1)
    AlbumTrack(VGMDB_Album(78520), 1, "Purple Rays", *AllOrtensia) {
        Music(1.0)
    }

    AddTrack(78520, 2)
    Track(VGMDB_Track(78520, 2), "Dear My Friend", *AllOrtensia) {
        Music(1.25)
        Impact("dear my friend ld", Emotion.AP, 0.2)
    }

    AddTrack(78518, 1)
    AlbumTrack(VGMDB_Album(78518), 1, "Secret Dream", *AllStellamaris) {
        Music(0.1)
    }

    AddTrack(78518, 2)
    Track(VGMDB_Track(78518, 2), "Realize", *AllStellamaris) {
        Music(0.1)
    }

    AddTrack(78528, 1)
    AlbumTrack(VGMDB_Album(78528), 1, "Fearless Girl", *AllTetrarkhia) {
        Music(0.5)
    }

    AddTrack(78528, 2)
    Track(VGMDB_Track(78528, 2), "Shine On Me!!", *AllTetrarkhia) {
        Music(0.4)
    }

    AddTrack(78516, 1)
    AlbumTrack(VGMDB_Album(78516), 1, "SENSEI Sensation", *AllKiRaRe) {
        Music(0.9)
    }

    Album(VGMDB_Album(78515), "Raise Your Fist") {
        Include(VGMDB_Track(78528, 1))
        Include(VGMDB_Track(78528, 2))
    }

    AddTrack(78515, 1)
    Track(VGMDB_Track(78515, 1), "Canaria", *AllTetrarkhia) {
        Music(1.6)
    }

    AddTrack(78339, 1)
    AlbumTrack(VGMDB_Album(78339), 1, "*Heart Confusion*", *AllOrtensia) {
        Music(0.3)
    }

    AddTrack(78339, 2)
    Track(VGMDB_Track(78339, 2), "crave", *AllOrtensia, keeno) {
        Music(0.6)
    }

    AddTrack(78764, 1)
    AlbumTrack(VGMDB_Album(78764), 1, "367Days", *AllKiRaRe) {
        // the new funny number
        Music(1.5)
    }

    Album(VGMDB_Album(82983), "Pullulate") {
        Include(VGMDB_Track(78339, 1))
        Include(VGMDB_Track(78339, 2))
        Include(VGMDB_Track(78525, 1))
        Include(VGMDB_Track(78525, 2))
        Include(VGMDB_Track(78520, 1))
        Include(VGMDB_Track(78520, 2))
    }

    AddTrack(82983, 5)
    Track(VGMDB_Track(82983, 5), "Ano ne", OzawaAri, Deco27) {
        Music(1.25)
    }

    AddTrack(84229, 1)
    AlbumTrack(VGMDB_Album(84229), 1, "HAPPY TYPHOON", *AllKiRaRe) {
        Music(0.2)
    }

    AddTrack(84229, 1)
    Track(VGMDB_Track(84229, 2), "Stereo Life", *AllKiRaRe) {
        Music(0.3)
    }

    Album(VGMDB_Album(86622), "Re:STAGE! DREAM DAYS♪ SONG SERIES 1: Don't think, smile!!")
    AddTrack(86622, 1)
    Track(VGMDB_Track(86622, 1), "Don't think, smile!!", *AllKiRaRe) {
        Music(0.75)
    }

    AddTrack(86622, 2)
    Track(VGMDB_Track(86622, 2), "Akogare Future Sign (Piano Strings Arrange)", *AllKiRaRe, yuiko) {
        Music(0.6)
    }

    Album(VGMDB_Album(89363), "Re:STAGE! DREAM DAYS♪ SONG SERIES 5 INSERT SONG MINI ALBUM: DRe:AMER KiRaRe ver.") {
        Include(VGMDB_Track(78516, 1))
        Include(VGMDB_Track(78764, 1))
    }

    AddTrack(89363, 1)
    Track(VGMDB_Track(89363, 1), "Kirameki Future", *AllKiRaRe) {
        Music(1.5)
    }

    AddTrack(89363, 2)
    Track(VGMDB_Track(89363, 2), "OvertuRe:", *AllKiRaRe) {
        Music(2.0)
    }

    Album(VGMDB_Album(89364), "Re:STAGE! DREAM DAYS♪ SONG SERIES 6 INSERT SONG MINI ALBUM: DRe:AMER ortensia ver.") {
        Include(VGMDB_Track(89363, 1))
        Include(VGMDB_Track(89363, 2))
        Include(VGMDB_Track(78520, 1))
    }

    AddTrack(89364, 3)
    Track(VGMDB_Track(89364, 3), "Yes, We Are!!!", *AllOrtensia) {
        // pp 1-2 1-2
        Music(1.0)
    }

    Album(VGMDB_Album(109271), "Re:STAGE! THE BEST") {
        // Disc 1
        Include(VGMDB_Track(78536, 1))
        Include(VGMDB_Track(78534, 1))
        Include(VGMDB_Track(78534, 2))
        Include(VGMDB_Track(78532, 1))
        Include(VGMDB_Track(78575, 1))
        Include(VGMDB_Track(78525, 1))
        Include(VGMDB_Track(78525, 2))
        Include(VGMDB_Track(78522, 1))
        Include(VGMDB_Track(78522, 2))
        Include(VGMDB_Track(78530, 1))
        Include(VGMDB_Track(78520, 1))
        Include(VGMDB_Track(78520, 2))
        Include(VGMDB_Track(78518, 1))
        Include(VGMDB_Track(78518, 2))
        // Disc 2
        Include(VGMDB_Track(78528, 1))
        Include(VGMDB_Track(78528, 2))
        Include(VGMDB_Track(78516, 1))
        Include(VGMDB_Track(78515, 1))
        Include(VGMDB_Track(78339, 1))
        Include(VGMDB_Track(78339, 2))
        Include(VGMDB_Track(78764, 1))
        // Disc 3
        Include(VGMDB_Track(84229, 1))
        Include(VGMDB_Track(84229, 2))
        Include(VGMDB_Track(86622, 1))
        Include(VGMDB_Track(89363, 1))
        Include(VGMDB_Track(89363, 2))
        Include(VGMDB_Track(89364, 3))
    }

    Track(VGMDB_Track(109271, 48), "Watashitachi, Shiki o Asobun Desu!!",
        *AllKiRaRe, *AllOrtensia, *AllStellamaris, *AllTROISANGES, *AllTetrarkhia) {
        Music(2.0)
    }

    val ReStageMeme = Meme(0.8, Meme.M2_3Months)
    val GateOpenOnsen = GateOpen(VGMDB_Franchise(6439))
    val GateOpenSB69 = GateOpen(VGMDB_Franchise(4499))
    val KilledBySB69 = KilledBy(VGMDB_Franchise(4499))

    Anime("Re:Stage! Dream Days♪", MAL = 38009) {
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

        bestGirl = "Shikimiya Mana" // aka the kano destroyer

        // the re stage niji incident
        PADS(1, Emotion.MP)

        // rst era
        Impact(ReStageMeme)

        FeatureMusic(VGMDB_Track(89363, 1))
        FeatureMusic(VGMDB_Track(89363, 2))
        FeatureMusic(VGMDB_Track(78532, 1))
        FeatureMusic(VGMDB_Track(89364, 3))
        FeatureMusic(VGMDB_Track(78516, 1))
        FeatureMusic(VGMDB_Track(78764, 1))

        // rst changed da world
        // fun fact:
        // rst and onsen vgmdb franchise id is literally
        // next to each other
        // wtf??????
        // (6439 and 6438)
        Relation(GateOpenOnsen)
        Relation(GateOpenSB69)
        Relation(KilledBySB69)

        Boredom(Boredom.Completed)
    }

    Game("GF-VGMDB-7059", "Re:Stage! Prism Step") {
        bestGirl = "Shikimiya Mana" // aka the kano destroyer

        Impact(ReStageMeme)
        Relation(GateOpenOnsen)
        Relation(GateOpenSB69)
        Relation(KilledBySB69)

        ReStageTracks.forEach { FeatureMusic(it) }
    }

    Franchise(VGMDB_Franchise(7059), "Re:STAGE!") {
        Include(MAL(38009))
        Include("GF-VGMDB-7059")

        ReStageTracks.forEach { Include(it) }
    }
}
