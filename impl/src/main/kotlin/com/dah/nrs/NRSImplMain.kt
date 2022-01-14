@file:Suppress(
    "LocalVariableName",
    "FunctionName",                     // It's my DSL, idc about conventions
    "SpellCheckingInspection"           // IDEA can't understand nihongo
)

package com.dah.nrs

fun main() = generate {
    val Asterisk = Artist("M-1", "Asterisk")
    val Tamame = Artist("M-6", "tamame")
    val ClariS = Artist(VGMDB_Artist(11829), "ClariS")
    val TrySail = Artist(VGMDB_Artist(16469), "TrySail")
    val YuukiAoi = Artist(VGMDB_Artist(9797), "Yuuki Aoi")
    val NonakaAi = Artist(VGMDB_Artist(3558), "Nonaka Ai")
    val KitamuraEri = Artist(VGMDB_Artist(724), "Kitamura Eri")
    val KajiuraYuki = Artist(VGMDB_Artist(356), "Kajiura Yuki")
    val LiSA = Artist(VGMDB_Artist(11952), "LiSA")
    val ZAQ = Artist(VGMDB_Artist(12516), "ZAQ")
    val YanagiNagi = Artist(VGMDB_Artist(5524), "Yanagi Nagi")
    val Muse = Artist(VGMDB_Artist(13719), "μ's")
    val Aqours = Artist(VGMDB_Artist(17153), "Aqours")
    val Nijigaku = Artist(VGMDB_Artist(29922), "Nijigasaki High School Idol Club")
//    val Liella = Artist(VGMDB_Artist(37385), "Liella!")
    val HayamiSaori = Artist(VGMDB_Artist(6876), "Hayami Saori")
    val ToyamaNao = Artist(VGMDB_Artist(11436), "Toyama Nao")
    val SaitoShuka = Artist(VGMDB_Artist(17551), "Saito Shuka")
    val MaedaKaori = Artist(VGMDB_Artist(29323), "Maeda Kaori")
    val OnishiAguri = Artist(VGMDB_Artist(29640), "Onishi Aguri")
    val KusunokiTomori = Artist(VGMDB_Artist(27779), "Kusunoki Tomori")
    val TanakaChiemi = Artist(VGMDB_Artist(26954), "Tanaka Chiemi")

    fun GenerateBlock.`K-On!`() {
        // OSTs and shit
        val HTT = Artist(VGMDB_Artist(8870), "HO-KAGO TEA TIME")
        val DJAmaya = Artist("M-2", "DJ Amaya")

        Album(VGMDB_Album(20118), "Utauyo!!MIRACLE")
        Album(VGMDB_Album(21146), "HO-KAGO TEA TIME Second")
        Album(VGMDB_Album(22848), "Gohan wa Okazu/U&I")

        Track(VGMDB_Track(20118, 2), "Kira Kira Days", HTT) {
            Impact("Binfy's favorite osu! beatmap", Emotion.AP, 0.25)
            Impact("Sotarks made a map for him XDDDDD", Emotion.AP, 0.5)
            Music(0.7)
        }

        Track(VGMDB_Track(21146, 9), "Tenshi ni Fureta yo!", HTT)

        Track("M-3", "Tenshi ni Fureta yo! (Asterisk DnB Remix)", HTT, Asterisk) {
            Music(1.2)
            Impact("Legendary osu! song", Emotion.AP, 0.3)

            RemixOf(VGMDB_Track(21146, 9))
        }

        Track(VGMDB_Track(22848, 2), "U&I", HTT) {
            // inst is kinda good
            Music(0.1)
        }

        Track("M-4", "U&I (DJ Amaya's Angel at Dawn Remix)", HTT, DJAmaya) {
            Music(0.6)

            RemixOf(VGMDB_Track(22848, 2))
        }

        // K-On! animes

        // Kinda comfy. But not that much.
        val KOnComfy = NEI(1.0, Emotion.MP)
            .from(MAL(5680), MAL(7791), MAL(9617))
        // During my 9th grade, K-On memes basically dominate the meme world
        // (with other anime, hence the low strength)
        val KOnMeme = Meme(0.5, Meme.MMoreThan3Months)
            .from(MAL(5680), MAL(7791), MAL(9617))

        Anime("K-On!", MAL = 5680) {
            bestGirl = "Nakano Azusa"

            Impact(KOnComfy)
            // K-On is pretty boring (4.5 PMMS in NRS1)
            Boredom(Boredom.CompletedWithNoticeableBoredom)
            Impact(KOnMeme)

            // Kira Kira Days not featured in S1
        }

        Anime("K-On!!", MAL = 7791) {
            bestGirl = "Nakano Azusa"

            Impact(KOnComfy)
            // K-On is pretty boring (4.5 PMMS in NRS1)
            Boredom(Boredom.CompletedWithNoticeableBoredom)
            Impact(KOnMeme)

            FeatureMusic(VGMDB_Track(21146, 9))
            FeatureMusic(VGMDB_Track(22848, 2))
        }

        Anime("K-On! Movie", MAL = 9617) {
            bestGirl = "Nakano Azusa"

            Impact(KOnComfy)
            // K-On is pretty boring (4.5 PMMS in NRS1)
            Boredom(Boredom.Completed)
            Impact(KOnMeme)

            FeatureMusic(VGMDB_Track(21146, 9))
        }

        Franchise(VGMDB_Franchise(504), "K-On!") {
            bestGirl = "Nakano Azusa"

            Include(MAL(5680))
            Include(MAL(7791))
            Include(MAL(9617))
            Include(VGMDB_Album(20118))
            Include(VGMDB_Album(21146))
            Include(VGMDB_Album(22848))
        }
    }
    fun GenerateBlock.MadokaMagica() {
        // also include MagiReco
        val Magibeat = Artist("M-5", "Magibeat")
        Album(VGMDB_Album(30302), "Puella Magi Madoka Magica Special CD 1 Drama CD 'Memories of you'")
        Album(VGMDB_Album(24725), "Puella Magi Madoka Magica Special CD 2 Original Soundtrack I")
        Album(VGMDB_Album(39170), "Puella Magi Madoka Magica Special CD 5 Drama CD 'Farewell Story'")
        Album(VGMDB_Album(69147), "TAILWIND")
        Album(VGMDB_Album(113295),
            "Magia Record: Puella Magi Madoka☆Magica Side Story 2nd SEASON -Kakusei Zenya- Theme Song Collection")

        AlbumTrack(VGMDB_Album(23391), 1, "Connect", ClariS) {
            Music(0.5)
        }

        Track(VGMDB_Track(30302, 2), "Mata Ashita", YuukiAoi) {
            Music(0.4)
        }

        AlbumTrack(VGMDB_Album(41292), 1, "Colorful", ClariS) {
            Music(1.0)
        }

        Track("M-7", "Colorful - Magibeat Remix", ClariS, Magibeat) {
            Music(0.7)

            RemixOf(VGMDB_Track(41292, 1))
        }

        Track("M-8", "Colorful (tamame's apostate remix)", ClariS, Tamame) {
            Music(1.3)

            RemixOf(VGMDB_Track(41292, 1))
        }

        Track(VGMDB_Track(24725, 4), "Credens justitiam", KajiuraYuki) {
            Music(0.3)

            Impact("Funny headless girl's theme song", Emotion.AP, 1.0)
        }

        Track(VGMDB_Track(39170, 2), "and I'm home", KitamuraEri, NonakaAi) {
            Music(0.2)
        }

        AlbumTrack(VGMDB_Album(95029), 1, "Gomakashi", TrySail) {
            Music(1.5)
        }

        Track(VGMDB_Track(113295, 1), "Careless", ClariS) {
            Music(1.2)
        }

        Track(VGMDB_Track(69147, 1), "Kakawari", TrySail) {
            Music(1.3)
        }

        AlbumTrack(VGMDB_Album(89431), 1, "Signal", ClariS) {
            Music(1.6)
        }

        AlbumTrack(VGMDB_Album(91985), 1, "Utsuroi", TrySail) {
            Music(1.3)

            // the game
            // browiec's Wisdom
            // Misunderstanding
            // osu! 9.97⭐UTSUROI +HDDTHR 1108pp | WhiteCat
            Impact("osu! beatmap", Emotion.AP, 0.25)
        }

        val IrohaWaifu = Waifu("Tamaki Iroha", "2020-02-14" to "2020-08-14")
        val MadoMagiMeme = Meme(0.6, Meme.MMoreThan3Months)
        val MagiRecoMeme = Meme(0.9, Meme.MMoreThan3Months)
        val MagiRecoMemeS2 = Meme(0.3, Meme.M1_3Days)
        val MadoMagiFandom = Impact("MadoMagi fandom is very good (iirc)", Fandom.FandomFactor, 0.25)
        val ReStepGateOpen = GateOpen("GF-VGMDB-7059")
        val KilledByNiji = KilledBy(MAL(40879))

        Anime("Mahou Shoujo Madoka★Magica", MAL = 9756){
            bestGirl = "Kaname Madoka"

            // 32k got killed over and over, and her lover has to
            // time-travel everytime it happens
            PADS(1, Emotion.CU)

            // Kyoko's backstory
            AEI(3.0, Emotion.CU)

            Impact(MadoMagiFandom)
            Impact(MadoMagiMeme)
            Boredom(Boredom.Completed)

            // Killed by Love Live Niji
            Relation(KilledByNiji)

            FeatureMusic(VGMDB_Track(23391, 1))
            FeatureMusic(VGMDB_Track(30302, 2))
            FeatureMusic(VGMDB_Track(24725, 4))
            FeatureMusic(VGMDB_Track(39170, 2))
        }

        Anime("Mahou Shoujo Madoka★Magica Movie 3: Hangyaku no Monogatari", MAL = 11981) {
            bestGirl = "Kaname Madoka"
            // I can't understand this movie lol

            Impact(MadoMagiFandom)
            Impact(MadoMagiMeme)
            Boredom(Boredom.Completed)

            // Killed by Love Live Niji
            Relation(KilledByNiji)

            FeatureMusic(VGMDB_Track(41292, 1))
        }

        Anime("Magia Record: Mahou Shoujo Madoka★Magica Gaiden (TV)", MAL = 38256) {
            bestGirl = "Tamaki Iroha"
            // MagiReco-era is one of the most important eras in autism history
            // This is the anime that brought it to life

            // Emotional impacts are all in the game
            // (Madokami's MGS, Sana's backstory)
            Impact(IrohaWaifu)
            // Community is good
            Impact(MadoMagiFandom)
            Impact(MagiRecoMeme)
            Boredom(Boredom.Completed)

            // Gate-opened gacha games
            GateOpen("G-VGMDB-5237")
            Relation(ReStepGateOpen)

            // Killed by Love Live Niji
            Relation(KilledByNiji)

            FeatureMusic(VGMDB_Track(95029, 1))
        }

        Anime("Magia Record: Mahou Shoujo Madoka★Magica Gaiden (TV) 2nd Season", MAL = 41530) {
            bestGirl = "Tamaki Iroha"

            Impact(IrohaWaifu)
            // Community is good
            Impact(MadoMagiFandom)
            // Meme was not as good as S1
            // Well, because it's already milked
            Impact(MagiRecoMemeS2)

            Boredom(Boredom.Completed)

            Relation(KilledByNiji)

            // OP
            FeatureMusic(VGMDB_Track(113295, 1))
        }

        Game("G-VGMDB-5237", "Magia Record: Mahou Shoujo Madoka★Magica Gaiden") {
            bestGirl = "Tamaki Iroha"
            // Madokami's MGS
            // It's revealed that in 99% other universes,
            // Tamaki Ui and her friends are dead, leaving
            // Tamaki Iroha alone and (probably) depressed.
            // This made me cry
            Cry(Emotion.CU)
            PADS(999, Emotion.CU)

            // Sana's backstory
            // Basically it's very tragic.
            Cry(Emotion.CU)

            Impact(IrohaWaifu)
            // Community is good
            Impact(MadoMagiFandom)
            Impact(MagiRecoMeme)

            // Gate-opened gacha games (there is only re step in NRS tho)
            Relation(ReStepGateOpen)

            // Killed by Love Live Niji (more like the devs themselves lmfao)
            Relation(KilledByNiji)

            FeatureMusic(VGMDB_Track(69147, 11))
            FeatureMusic(VGMDB_Track(89431, 1))
            FeatureMusic(VGMDB_Track(91985, 1))
        }

        Franchise(VGMDB_Franchise(1945), "Mahou Shoujo Madoka☆Magica") {
            Include(VGMDB_Track(23391, 1))
            Include(VGMDB_Track(30302, 2))
            Include(VGMDB_Track(41292, 1))
            Include(VGMDB_Track(24725, 4))
            Include(VGMDB_Track(39170, 2))
            Include(VGMDB_Track(95029, 1))
            Include(VGMDB_Track(113295, 1))
            Include(VGMDB_Track(69147, 1))
            Include(VGMDB_Track(89431, 1))
            Include(VGMDB_Track(91985, 1))
            Include(MAL(9756))
            Include(MAL(11981))
            Include(MAL(38256))
            Include(MAL(41530))
            Include("G-VGMDB-5237")
        }
    }
    fun GenerateBlock.Idolmaster() {
        Album(VGMDB_Album(53945), "THE IDOLM@STER LIVE THE@TER DREAMERS 01 Dreaming!")
        Album(VGMDB_Album(64249), "THE IDOLM@STER CINDERELLA MASTER EVERMORE")
        Album(VGMDB_Album(78253), "THE IDOLM@STER MILLION THE@TER GENERATION 11 UNION!!")

        Track(VGMDB_Track(53945, 1), "Dreaming!") {
            Music(0.6)
            Impact("Legendary osu! beatmap", Emotion.AP, 0.3)
        }

        Track(VGMDB_Track(64249, 1), "EVERMORE (M@STER VERSION)") {
            Music(1.0)
        }

        Track(VGMDB_Track(78253, 1), "UNION!!") {
            Music(0.8)
            Impact("Legendary osu! beatmap", Emotion.AP, 0.2)
        }

        Anime("The iDOLM@STER", MAL = 10278) {
            bestGirl = "Minase Iori"
            // ending pretty sadge
            NEI(1.2, Emotion.CU)

            // idk why i gave this 6 in NRS1 but i'll nerf it to 0.3 ig.
            Music(0.3)
            Boredom(Boredom.Completed)
        }

        Anime("The iDOLM@STER Cinderella Girls", MAL = 23587) {
            bestGirl = "Ogata Chieri"
            Boredom(Boredom.Completed)
        }

        Anime("The iDOLM@STER Cinderella Girls 2nd Season", MAL = 30344) {
            bestGirl = "Ogata Chieri"
            Boredom(Boredom.Completed)
        }

        Franchise(VGMDB_Franchise(3559), "THE IDOLM@STER") {
            Include(VGMDB_Track(53945, 1))
            Include(VGMDB_Track(64249, 1))
            Include(VGMDB_Track(78253, 1))

            Include(MAL(10278))
            Include(MAL(23587))
            Include(MAL(30344))
        }
    }

    fun GenerateBlock.SwordArtOnline() {
        AlbumTrack(VGMDB_Album(33537), 1, "crossing field", LiSA) {
            Music(0.3)
        }

        Anime("Sword Art Online", MAL = 11757) {
            bestGirl = "Yuuki Asuna"
            FeatureMusic(VGMDB_Track(33537, 1))
        }

        Anime("Sword Art Online II", MAL = 21881) {
            bestGirl = "Yuuki Asuna"
        }

        Anime("Sword Art Online Movie: Ordinal Scale", MAL = 31765) {
            bestGirl = "Yuuki Asuna"
        }

        Franchise(VGMDB_Franchise(2633), "Sword Art Online") {
            Include(MAL(11757))
            Include(MAL(21881))
            Include(MAL(31765))

            Include(VGMDB_Track(33537, 1))
        }
    }

    fun GenerateBlock.KokoroConnect() {
        Album(VGMDB_Album(35431), """Kokoro Connect Original Soundtrack 2 Hito Random & Kizu Random Opening Theme Song "Kimochi Signal" / Kizu Random Ending Theme Song "Cry out"""")

        Track(VGMDB_Track(35431, 1), "Kimochi Signal") {
            Music(0.2)
        }

        val KokoroConnectDrama = AEI(3.0, Emotion.CU)

        Anime("Kokoro Connect", MAL = 11887) {
            bestGirl = "Nagase Iori"

            Impact(KokoroConnectDrama)
            FeatureMusic(VGMDB_Track(35431, 1))
            Boredom(Boredom.Completed)
        }

        Anime("Kokoro Connect: Michi Random", MAL = 16001) {
            bestGirl = "Nagase Iori"

            Impact(KokoroConnectDrama)
            Boredom(Boredom.Completed)
        }

        Franchise(VGMDB_Franchise(3483), "Kokoro Connect") {
            Include(MAL(11887))
            Include(MAL(16001))
            Include(VGMDB_Track(35431, 1))
        }
    }

    fun GenerateBlock.Sakurasou() {
        AlbumTrack(VGMDB_Album(35015), 1, "Kimi ga Yume wo Tsuretekita") {
            Music(0.7)
        }

        Anime("Sakura-sou no Pet na Kanojo", MAL = 13759) {
            bestGirl = "Mashiro Shiina"

            // This is a very good compoly story, meaning
            // there are a lot of truly sad moments in this
            // anime. But a lot records have been lost and
            // idk why I'm sad. The previous impl gave AEI(5),
            // which is equivalent to AEI(3) in this impl
            // but idc so 2.5
            AEI(2.5, Emotion.CU)

            // The group is kinda comfy ig
            NEI(1.5, Emotion.MP)

            // This and New Game! is recorded to be the
            // inspiration for me to learn programming
            Info(Information.GeneralInfo, newField = true)

            Boredom(Boredom.Completed)

            FeatureMusic(VGMDB_Track(35015, 1))
        }
    }

    fun GenerateBlock.Chuunibyou() {
        AlbumTrack(VGMDB_Album(42762), 1, "VOICE", ZAQ) {
            Music(0.1)

            Impact("osu! beatmap", Emotion.AP, 0.1)
        }

        Anime("Chuunibyou demo Koi ga Shitai!", MAL = 14741) {
            bestGirl = "Nibutani Shinka"
            // idk why
            // this is taken from NRS1
            Meme(0.15, Meme.M1_3Days)
            Humor(1.5)
            Boredom(Boredom.Completed)
        }

        Anime("Chuunibyou demo Koi ga Shitai! Ren", MAL = 18671) {
            bestGirl = "Nibutani Shinka"
            Humor(1.5)
            // Shichimiya dead people almost made me cry
            // YouTube link: https://www.youtube.com/watch?v=vFjJ6skYoxI
            AEI(3.0, Emotion.CU)
            // Shichimiya memes
            Meme(0.4, Meme.M1_2Weeks)
            Boredom(Boredom.Completed)
        }

        Anime("Chuunibyou demo Koi ga Shitai! Movie: Take On Me", MAL = 35608) {
            bestGirl = "Nibutani Shinka"
            Boredom(Boredom.Completed)
        }

        Franchise(VGMDB_Franchise(2330), "Chuunibyou demo Koi ga Shitai!") {
            Include(MAL(14741))
            Include(MAL(18671))
            Include(MAL(35608))
            Include(VGMDB_Track(42762, 1))
        }
    }

    fun GenerateBlock.Oregairu() {
        AlbumTrack(VGMDB_Album(37932), 1, "Yukitoki", YanagiNagi) {
            Music(0.6)
        }

        AlbumTrack(VGMDB_Album(51516), 1, "Harumodoki", YanagiNagi) {
            Music(0.8)
        }

        AlbumTrack(VGMDB_Album(96288), 1, "Megumi no Ame", YanagiNagi) {
            Music(0.9)
        }

        val HelloAloneMusic = Music(0.7)

        AlbumTrack(VGMDB_Album(37999), 1, "Hello Alone", HayamiSaori, ToyamaNao) {
            Impact(HelloAloneMusic)
            Impact("Sadge", Emotion.CU, 0.5)
        }

        Track(VGMDB_Track(37999, 2), "Hello Alone -Yui Ballade-", ToyamaNao) {
            Impact(HelloAloneMusic)
            Impact("Sadge", Emotion.CU, 0.5)
        }

        val EverydayWorldMusic = Music(0.6)

        AlbumTrack(VGMDB_Album(51394), 1, "Everyday World", HayamiSaori, ToyamaNao) {
            Impact(EverydayWorldMusic)
        }

        Track(VGMDB_Track(51394, 3), "Everyday World -Ballade Arrange- Yui Solo Ver.", ToyamaNao) {
            Impact(EverydayWorldMusic)
            Impact("Sadge", Emotion.CU, 0.5)
        }

        AlbumTrack(VGMDB_Album(96290), 1, "Diamond no Jundo", HayamiSaori, ToyamaNao) {
            Music(0.6)
        }

        // Oregairu has a pretty long meme reign
        // but shared with Saekano and K-On!
        val OregairuMeme = Meme(0.7, Meme.MMoreThan3Months)

        // Inspired Hikism-Yukism
        val HikismYukism = Info(Information.Politics)

        Anime("Yahari Ore no Seishun Love Comedy wa Machigatteiru.", MAL = 14813) {
            // Brain's Base drew Yukino better than Yui
            bestGirl = "Yukinoshita Yukino"

            Impact(HikismYukism)
            Impact(OregairuMeme)

            FeatureMusic(VGMDB_Track(37932, 1))
            FeatureMusic(VGMDB_Track(37999, 2))
        }

        Anime("Yahari Ore no Seishun Love Comedy wa Machigatteiru. Zoku", MAL = 23847) {
            // feel. drew Yui better
            bestGirl = "Yuigahama Yui"

            Impact(HikismYukism)
            Impact(OregairuMeme)

            // Oregairu S2 has a lot of drama that I don't even
            // understand. But it's pretty good ngl.
            AEI(3.0, Emotion.CU)

            // The Yui Depression, when I realize that the VSCC
            // (Volunteer Service Club Compoly) is not as good as
            // I thought to be.
            // Read here for more details:
            // http://yaharianalysis.x10host.com/
            // (esp. http://yaharianalysis.x10host.com/parts/Yui/index.php)
            PADS(999, Emotion.CU)

            // VSCC is pretty comfy (before Yui Depression)
            NEI(1.2, Emotion.MP)

            FeatureMusic(VGMDB_Track(51516, 1))
            FeatureMusic(VGMDB_Track(51394, 1))
            FeatureMusic(VGMDB_Track(51394, 3))
        }

        Anime("Yahari Ore no Seishun Love Comedy wa Machigatteiru. Kan", MAL = 39547) {
            bestGirl = "Yuigahama Yui"

            Meme(0.2, Meme.M1_3Days)

            // Yui dead people arc was kinda good
            // but Oregairu is just dead
            // you can't do much about it
            AEI(2.4, Emotion.CU)

            // killed by lapis re lights lmao xd
            KilledBy(MAL(37587))

            FeatureMusic(VGMDB_Track(96288, 1))
            FeatureMusic(VGMDB_Track(96290, 1))
        }

        Franchise(VGMDB_Franchise(3274), "Yahari Ore no Seishun Love Comedy wa Machigatteiru.") {
            Include(MAL(14813))
            Include(MAL(23847))
            Include(MAL(39547))
            Include(VGMDB_Track(37932, 1))
            Include(VGMDB_Track(37999, 2))
            Include(VGMDB_Track(51516, 1))
            Include(VGMDB_Track(51394, 1))
            Include(VGMDB_Track(51394, 3))
            Include(VGMDB_Track(96288, 1))
            Include(VGMDB_Track(96290, 1))
        }
    }

    fun GenerateBlock.LoveLive() {
        // u's (pls roast me dia)
        AlbumTrack(VGMDB_Album(34051), 1, "Snow halation", Muse) {
            Music(0.8)
            Impact("this song is memed heavily af + merry christmas you disgusting farmers", Emotion.AP, 0.75)
            // osu! | Will Stetson - Snow Halation (feat. BeasttrollMC)
            // [Reform's Expert] +HDDT FC 417pp
        }

        AlbumTrack(VGMDB_Album(36547), 1, "Bokura wa Ima no Naka de", Muse) {
            Music(1.0)
        }

        Album(VGMDB_Album(75504), "Music S.T.A.R.T!!")

        Track(VGMDB_Track(75504, 2), "LOVELESS WORLD", Muse) {
            Music(1.2)
        }

        // insert yuyuyu funny joke here
        AlbumTrack(VGMDB_Album(93532), 1, "A song for You! You? You!!", Muse) {
            Music(1.5)
        }

        // Aqours
        AlbumTrack(VGMDB_Album(58147), 1, "Aozora Jumping Heart", Aqours) {
            Music(0.7)
        }

        Album(VGMDB_Album(58750), "Kimeta yo Hand in Hand/Daisuki Dattara Daijoubu!")
        Track(VGMDB_Track(58750, 1), "Kimeta yo Hand in Hand", Aqours) {
            Music(0.5)
        }

        AlbumTrack(VGMDB_Album(70622), 1, "Yuuki wa Doko ni? Kimi no Mune ni!", Aqours) {
            Music(1.25)
        }

        Album(VGMDB_Album(71404), "MY MAI☆TONIGHT/MIRACLE WAVE")
        Track(VGMDB_Track(71404, 2), "MIRACLE WAVE", Aqours) {
            Music(0.6)
        }

        AlbumTrack(VGMDB_Album(78378), 1, "Thank you, FRIENDS!!", Aqours) {
            Music(1.1)
        }

        AlbumTrack(VGMDB_Album(87199), 1, "Mitaiken HORIZON", Aqours) {
            Music(0.7)
        }

        Album(VGMDB_Album(97692), "LoveLive! Sunshine!! Watanabe You First Solo Concert ALBUM ~Beginner's Sailing~")
        Track(VGMDB_Track(97692, 1), "Beginner's Sailing", SaitoShuka) {
            Music(0.5)
        }

        // Niji lmfao
        AlbumTrack(VGMDB_Album(80802), 1, "TOKIMEKI Runners", Nijigaku) {
            Music(0.8)
        }

        Track(VGMDB_Track(80802, 2), "Yume e no Ippo", OnishiAguri) {
            Music(0.1)
        }

        Track(VGMDB_Track(80802, 8), "CHASE!", KusunokiTomori) {
            Music(0.5)
        }

        Track(VGMDB_Track(80802, 10), "Dokipipo☆Emotion", TanakaChiemi) {
            Music(0.4)
        }

        AlbumTrack(VGMDB_Album(87198), 10, "Love U my friends", Nijigaku) {
            Music(0.8)
        }

        Track(VGMDB_Track(87198, 1), "Kaika Sengen", OnishiAguri) {
            Music(0.4)
        }

        Track(VGMDB_Track(87198, 7), "MELODY", KusunokiTomori) {
            Music(1.0)
        }

        AlbumTrack(VGMDB_Album(99272), 12, "Just Believe!!!", Nijigaku) {
            Music(0.9)
        }

        Track(VGMDB_Track(99272, 1), "Say Good-Bye Namida", OnishiAguri) {
            Music(0.6)
        }

        Track(VGMDB_Track(99272, 3), "Yagate Hitotsu no Monogatari", MaedaKaori) {
            Music(0.6)
        }

        Track(VGMDB_Track(99272, 7), "LIKE IT! LOVE IT!", KusunokiTomori) {
            Music(1.2)
            Impact("osu! beatmap", Emotion.AP, 0.3)
        }

        AlbumTrack(VGMDB_Album(112929), 1, "L!L!L! (Love the Life We Live)", Nijigaku)
        Track(VGMDB_Track(112929, 2), "Break The System", OnishiAguri) {
            Music(0.5)
        }

        AlbumTrack(VGMDB_Album(102276), 1, "Nijiiro Passions!", Nijigaku) {
            Music(0.3)
        }

        AlbumTrack(VGMDB_Album(102277), 1, "NEO SKY, NEO MAP!", Nijigaku) {
            Music(1.5)
        }

        Album(VGMDB_Album(102281), "Dream with You/Poppin' Up!/DIVE! / Ayumu Uehara (CV. Aguri Onishi)," +
                " Kasumi Nakasu (CV. Mayu Sagara), Setsuna Yuki (CV. Tomori Kusunoki)" +
                " from Nijigasaki High School Idol Club [Ayumu Uehara Edition]")
        Album(VGMDB_Album(104783), "Awakening Promise/Yume ga Koko kara Hajimaru yo")

        Track(VGMDB_Track(102281, 1), "Dream with You") {
            Music(0.2)

            // the song is shit
            // but it started the most colorful era in autism history
            // the ayumu era
            Impact("tobitateru dreaming sky", Emotion.AP, 1.0)
        }

        Track(VGMDB_Track(104783, 1), "Awakening Promise") {
            Music(0.15)
        }

        // Liella hasn't got any notable songs

        // Anime
        val SIPMeme = Meme(0.4, Meme.M4_7Days)
        Anime("Love Live! School Idol Project", MAL = 15051) {
            bestGirl = "Nishikino Maki"
            Impact(SIPMeme)
            FeatureMusic(VGMDB_Track(36547, 1))
            Boredom(Boredom.Completed)
        }

        Anime("Love Live! School Idol Project 2nd Season", MAL = 19111) {
            bestGirl = "Nishikino Maki"
            Impact(SIPMeme)
            FeatureMusic(VGMDB_Track(34051, 1))
            Boredom(Boredom.Completed)
        }

        Anime("Love Live! The School Idol Movie", MAL = 24997) {
            bestGirl = "Nishikino Maki"
            Impact(SIPMeme)
            Boredom(Boredom.Completed)
        }

        val SunshineMeme = Meme(0.6, Meme.M1_2Weeks)
        Anime("Love Live! Sunshine!!", MAL = 32526) {
            bestGirl = "Sakurauchi Riko"
            Impact(SunshineMeme)
            FeatureMusic(VGMDB_Track(58147, 1))
            FeatureMusic(VGMDB_Track(58750, 1))
            Boredom(Boredom.Completed)
        }

        Anime("Love Live! Sunshine!! 2nd Season", MAL = 34973) {
            bestGirl = "Sakurauchi Riko"
            Impact(SunshineMeme)
            FeatureMusic(VGMDB_Track(58147, 1))
            FeatureMusic(VGMDB_Track(70622, 1))
            Boredom(Boredom.Completed)
        }

        Anime("Love Live! Sunshine!! The School Idol Movie: Over the Rainbow", MAL = 37027) {
            bestGirl = "Sakurauchi Riko"
            Impact(SunshineMeme)
            Boredom(Boredom.Completed)
        }

        val NijiMeme = Meme(1.0, Meme.MMoreThan3Months)
        Anime("Love Live! Nijigasaki Gakuen School Idol Doukoukai", MAL = 40879) {
            bestGirl = "Uehara Ayumu"

            Impact(NijiMeme)
            Boredom(Boredom.Completed)

            // Ayumu dead people arc
            PADS(7, Emotion.CU)
            // "Soshite kimi ga shirazu ni"
            // When Ayumu-era ends, I felt depressed
            PADS(5, Emotion.CU)

            // toxic stuff with LL and shit
            NEI(2.0, Emotion.AU)

            Waifu("Uehara Ayumu", "2020-11-02" to "2020-11-02")

//            KilledBy("kano entry")

            FeatureMusic(VGMDB_Track(102276, 1))
            FeatureMusic(VGMDB_Track(102277, 1))
            FeatureMusic(VGMDB_Track(102281, 1))
            FeatureMusic(VGMDB_Track(104783, 1))
        }

        Anime("Love Live! Superstar!!", MAL = 41169) {
            // insert wakeshima kanon is shibuya kanon joke here
            bestGirl = "Arashi Chisato"
            Boredom(Boredom.TempOnHold)
            Meme(0.3, Meme.M4_7Days)
            KilledBy(MAL(41530))
        }

        Franchise(VGMDB_Franchise(2588), "Love Live!") {
            Include(MAL(15051))
            Include(MAL(19111))
            Include(MAL(24997))
            Include(MAL(32526))
            Include(MAL(34973))
            Include(MAL(37027))
            Include(MAL(40879))
            Include(MAL(41169))

            Include(VGMDB_Track(34051, 1))
            Include(VGMDB_Track(36547, 1))
            Include(VGMDB_Track(75504, 2))
            Include(VGMDB_Track(93532, 1))
            Include(VGMDB_Track(58147, 1))
            Include(VGMDB_Track(58750, 1))
            Include(VGMDB_Track(70622, 1))
            Include(VGMDB_Track(71404, 2))
            Include(VGMDB_Track(78378, 1))
            Include(VGMDB_Track(87199, 1))
            Include(VGMDB_Track(97692, 1))
            Include(VGMDB_Track(80802, 1))
            Include(VGMDB_Track(80802, 2))
            Include(VGMDB_Track(80802, 8))
            Include(VGMDB_Track(80802, 10))
            Include(VGMDB_Track(87198, 10))
            Include(VGMDB_Track(87198, 1))
            Include(VGMDB_Track(87198, 7))
            Include(VGMDB_Track(99272, 12))
            Include(VGMDB_Track(99272, 1))
            Include(VGMDB_Track(99272, 3))
            Include(VGMDB_Track(99272, 7))
            Include(VGMDB_Track(112929, 1))
            Include(VGMDB_Track(102276, 1))
            Include(VGMDB_Track(102277, 1))
            Include(VGMDB_Track(102281, 1))
            Include(VGMDB_Track(104783, 1))
        }
    }

    `K-On!`()
    MadokaMagica()
    Idolmaster()
    SwordArtOnline()
    KokoroConnect()

    Anime("Koi to Senkyo to Chocolate", MAL = 12175) {
        // iirc i liked this anime's plot
        Plot(1.2)
        Boredom(Boredom.Completed)
    }

    Anime("Hyouka", MAL = 12189) {
        // ig it's kinda good
        Plot(1.0)
        Boredom(Boredom.Completed)
    }

    Sakurasou()
    Chuunibyou()
    Oregairu()
    LoveLive()
}.run{}

