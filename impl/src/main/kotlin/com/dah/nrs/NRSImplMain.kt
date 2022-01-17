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
    val Ray = Artist(VGMDB_Artist(13097), "Ray")
    val KomatsuMikako = Artist(VGMDB_Artist(12665), "Komatsu Mikako")
    val PetitRabbit = Artist("M-9", "Petit Rabbit's")
    val MinaseInori = Artist(VGMDB_Artist(15361), "Minase Inori")
    val fhana = Artist(VGMDB_Artist(13857), "fhána")
    val YokoyamaMasaru = Artist(VGMDB_Artist(9069), "Yokoyama Masaru")
    val KayanoAi = Artist(VGMDB_Artist(10934), "Kayano Ai")
    val SawaiMiku = Artist(VGMDB_Artist(11958), "Sawai Miku")
    val kamaboko = Artist("M-12", "kamaboko")
    val MAO = Artist(VGMDB_Artist(15350), "M·A·O")
    val TakahashiRie = Artist(VGMDB_Artist(16380), "Takahashi Rie")
    val OzawaAri = Artist(VGMDB_Artist(15998), "Ozawa Ari")
    val MimoriSuzuko = Artist(VGMDB_Artist(10253), "Mimori Suzuko")
    val TeruiHaruka = Artist(VGMDB_Artist(15440), "Terui Haruka")
    val UchiyamaYumi = Artist(VGMDB_Artist(12766), "Uchiyama Yumi")
    val KurosawaTomoyo = Artist(VGMDB_Artist(14180), "Kurosawa Tomoyo")
    val NagatsumaJuri = Artist(VGMDB_Artist(15408), "Nagatsuma Juri")
    val HanazawaKana = Artist(VGMDB_Artist(6783), "Hanazawa Kana")
    val MakinoAmane = Artist(VGMDB_Artist(29249), "Makino Amane")
    val KitoAkari = Artist(VGMDB_Artist(26898), "Kito Akari")
    val TazawaMasumi = Artist(VGMDB_Artist(15697), "Tazawa Masumi")
    val TachibanaMeemu = Artist(VGMDB_Artist(29250), "Tachibana Meemu")
    val IwahashiYuka = Artist(VGMDB_Artist(29251), "Iwahashi Yuka")
    val SoramiYuki = Artist(VGMDB_Artist(15697), "Sorami Yuki")
    val KiRaRe = Artist(VGMDB_Artist(30829), "KiRaRe")
    val HanamoriYumiri = Artist(VGMDB_Artist(15999), "Hanamori Yumiri")
    // the ortensia (2021) incident
    val MineuchiTomomi = Artist(VGMDB_Artist(27612), "Mineuchi Tomomi")
    val Ortensia = Artist("M-13", "ortensia")
    val TakahashiMinami = Artist(VGMDB_Artist(16335), "Takahashi Minami")
    val SuwaAyaka = Artist(VGMDB_Artist(15565), "Suwa Ayaka")
    val TanakaAimi = Artist(VGMDB_Artist(16805), "Tanaka Aimi")
    val Stellamaris = Artist("M-14", "Stellamaris")
    val HiokaNatsumi = Artist(VGMDB_Artist(17779), "Hioka Natsumi")
    val AbeRika = Artist(VGMDB_Artist(16609), "Abe Rika")
    val TROISANGES = Artist("M-15", "TROIS ANGES")
    val YamadaNatsumi = Artist(VGMDB_Artist(23810), "Yamada Natsumi")
    val SatouMiki = Artist(VGMDB_Artist(29254), "Satou Miki")
    val TakayanagiTomoyo = Artist(VGMDB_Artist(29231), "Takayanagi Tomoyo")
    val NishidaNozomi = Artist(VGMDB_Artist(17719), "Nishida Nozomi")
    val Tetrarkhia = Artist("M-16", "Tetrarkhia")
    val keeno = Artist(VGMDB_Artist(15120), "keeno")
    val Deco27 = Artist(VGMDB_Artist(9559), "DECO*27")
    val yuiko = Artist(VGMDB_Artist(4276), "yuiko")


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
            seasonal = true
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
            seasonal = true

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
            seasonal = true

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
            seasonal = true

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
            seasonal = true
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
    fun GenerateBlock.NagiAsu() {
        AlbumTrack(VGMDB_Album(41278), 1, "lull ~Soshite Bokura wa~", Ray) {
            Music(0.2)
        }

        AlbumTrack(VGMDB_Album(41280), 1, "Aqua Terrarium", YanagiNagi) {
            Music(0.2)
        }

        AlbumTrack(VGMDB_Album(42900), 1, "ebb and flow", Ray) {
            Music(1.0)
        }

        Track(VGMDB_Track(42900, 3), "nagi", Ray) {
            Music(0.4)
        }

        AlbumTrack(VGMDB_Album(43164), 1, "Aqua Terrarium", YanagiNagi) {
            Music(0.2)
        }

        Album(VGMDB_Album(45187), "NAGI NO ASUKARA CHARACTER SONG 3")
        Track(VGMDB_Track(45187, 1), "ripple ~my first love~", KomatsuMikako) {
            Music(1.5)
        }

        Anime("Nagi no Asu kara", MAL = 16067) {
            bestGirl = "Shiodome Miuna"
            // poor best girl
            PADS(2, Emotion.CU)

            WaifuUnknownPeriod("Shiodome Miuna", 90)

            Meme(0.7, Meme.M3Weeks_1Month)

            FeatureMusic(VGMDB_Track(41278, 1))
            FeatureMusic(VGMDB_Track(41280, 1))
            FeatureMusic(VGMDB_Track(42900, 1))
            FeatureMusic(VGMDB_Track(42900, 3))
            FeatureMusic(VGMDB_Track(43164, 1))

            // a character song idk
            // FeatureMusic(VGMDB_Track(45187, 1))
        }
    }
    fun GenerateBlock.AOT() {
        Anime("Shingeki no Kyojin", MAL = 16498) {
            bestGirl = "Ackerman Mikasa"
        }

        Anime("Shingeki no Kyojin Season 2", MAL = 25777) {
            bestGirl = "Ackerman Mikasa"
        }

        Anime("Shingeki no Kyojin Season 3", MAL = 35760) {
            seasonal = true
            bestGirl = "Ackerman Mikasa"
        }

        Anime("Shingeki no Kyojin Season 3 Part 2", MAL = 38524) {
            seasonal = true
            bestGirl = "Ackerman Mikasa"
        }

        Franchise(VGMDB_Franchise(2931), "Shingeki no Kyojin") {
            Include(MAL(16498))
            Include(MAL(25777))
            Include(MAL(35760))
            Include(MAL(38524))
        }
    }
    fun GenerateBlock.GochiUsa() {
        AlbumTrack(VGMDB_Album(44890), 1, "Daydream café", PetitRabbit) {
            // fuwa fuwa
            // dong do la max do
            // duy bua ham l
            // duy bua ngao l
            Music(1.2)
        }

        Album(VGMDB_Album(55364), "Is the order a rabbit?? Chino Character Song Album: CUP OF Chino") {
            // this also includes mahou shoujo chino
            Include(VGMDB_Track(54418, 1))
        }

        Track(VGMDB_Track(55364, 3), "Shinsaku no Shiawase wa Kochira!", MinaseInori) {
            // dan dan kikoeru
            // lets go i fced the son's insane diff with dt
            Music(0.9)
        }

        Album(VGMDB_Album(54418), "Gochuumon wa Mahou Shoujo desu ka? Image Song: Mahou Shoujo Chino")

        Track(VGMDB_Track(54418, 1), "Mahou Shoujo Chino", MinaseInori) {
            Music(0.5)
        }

        Anime("Gochuumon wa Usagi Desu ka?", MAL = 21273) {
            Boredom(Boredom.Completed)
        }

        Franchise(VGMDB_Franchise(3939), "Gochuumon wa Usagi Desu ka?") {
            Include(MAL(21273))
            Include(VGMDB_Track(54418, 1))
            Include(VGMDB_Track(55364, 3))
        }
    }
    fun GenerateBlock.SoraMethod() {
        AlbumTrack(VGMDB_Album(47402), 1, "Stargazer") { // by Larvel Stage Planning
            Music(0.8)
        }

        AlbumTrack(VGMDB_Album(47403), 1, "Hoshikuzu no Interlude", fhana) {
            Music(0.8)
        }

        Anime("Sora no Method", MAL = 23209) {
            // Drama in this anime is executed pretty well.
            AEI(2.5, Emotion.CU)

            // beasttrollminecraft
            Meme(0.3, Meme.M4_7Days)


            bestGirl = "Komiya Nonoka"

            // First anime to (be able to) use OP/ED visual + music to strengthen the sadness.
            Impact("OP/ED visual chemistry", Emotion.CU, 1.0)

            // OP/ED very good too.
            FeatureMusic(VGMDB_Track(47402, 1))
            FeatureMusic(VGMDB_Track(47403, 1))
        }
    }
    fun GenerateBlock.YLIA() {
        Album(VGMDB_Album(49046), "Shigatsu wa Kimi no Uso ORIGINAL SONG & SOUNDTRACK")

        Track(VGMDB_Track(49046, 1), "Kimi wa Wasurerareru no", YokoyamaMasaru) {
            Music(1.0)
            NEI(1.0, Emotion.CU)
        }

        Track(VGMDB_Track(49046, 18), "Yuujin A-kun wo Watashi no Bansousha ni Ninmeishimasu", YokoyamaMasaru) {
            Music(1.0)
            NEI(1.0, Emotion.CU)
        }

        Anime("Shigatsu wa Kimi no Uso", MAL = 23273) {
            bestGirl = "Miyazono Kaori"

            // YLIA is watched during the SLN days (Second-Love-Ngoc era),
            // this has lead to the connection between myself and the
            // characters.
            // This is why this anime is so sad that it achieve the maximum
            // score for an impact (weighted ofc)
            PADS(999, Emotion.CU)
            Cry(Emotion.CU)

            // The character development of Kousei Arima is connected to the
            // Personality Revolution (a result of SLN). This is why I also
            // feel hype when stuff happens. And I cried to that.
            // No PADS since it's overshadowed by the sad impact.
            Cry(Emotion.CP)

            // Also the anime itself without these historical events are still
            // very good. It's not just lucky

            // no memes because SLN era has no memes
            // it's just lIeN qUAn mOBiLe and dumb trendy shit

            FeatureMusic(VGMDB_Track(49046, 1))
            FeatureMusic(VGMDB_Track(49046, 18))
        }
    }
    fun GenerateBlock.Saekano() {
        val MegumiKato = WaifuUnknownPeriod("Megumi Kato", 90)
        val SaekanoHumor = Humor(3.0)
        val SaekanoMeme = Meme(0.5, Meme.M1_2Months)

        AlbumTrack(VGMDB_Album(48199), 1, "M♭", KayanoAi) {
            Music(0.5)
            Impact("Legendary osu! song", Emotion.AP, 0.1)
        }

        AlbumTrack(VGMDB_Album(49446), 1, "Colorful.", SawaiMiku) {
            Music(0.8)
        }

        Track("M-10", "Colorful. (Asterisk DnB Remix)", SawaiMiku, Asterisk) {
            Music(0.9)
        }

        Track("M-11", "Colorful. (kamaboko remix)", SawaiMiku, kamaboko) {
            Music(1.2)
            // meta'd in the first days of hiki-yuki autism
            Impact("Meta'd in the first days of HYA", Emotion.AP, 0.5)
        }

        Anime("Saenai Heroine no Sodatekata", MAL = 23277) {
            bestGirl = "Megumi Kato"
            Impact(MegumiKato)
            Impact(SaekanoHumor)
            Impact(SaekanoMeme)

            FeatureMusic(VGMDB_Track(48199, 1))
            FeatureMusic(VGMDB_Track(49446, 1))
        }

        Anime("Saenai Heroine no Sodatekata ♭", MAL = 30727) {
            bestGirl = "Megumi Kato"
            Impact(MegumiKato)
            Impact(SaekanoHumor)
            Impact(SaekanoMeme)
        }

        Anime("Saenai Heroine no Sodatekata Fine", MAL = 36885) {
            bestGirl = "Megumi Kato"
            Impact(MegumiKato)
            Humor(1.0)
        }

        Franchise(VGMDB_Franchise(3305), "Saenai Heroine no Sodatekata") {
            Include(MAL(23277))
            Include(MAL(30727))
            Include(MAL(36885))

            Include(VGMDB_Track(48199, 1))
            Include(VGMDB_Track(49446, 1))
        }
    }
    fun GenerateBlock.GakkouGurashi() {
        val GakuenSeikatsubu = arrayOf(MinaseInori, MAO, OzawaAri, TakahashiRie)
        AlbumTrack(VGMDB_Album(52993), 1, "Friend Shitai", *GakuenSeikatsubu) {
            Music(0.8)
        }

        Album(VGMDB_Album(53719), "SCHOOL-LIVE! Character Song 4 / Miki Naoki (CV. Rie Takahashi) & Kurumi Ebisuzawa (CV. Ari Ozawa)")
        Track(VGMDB_Track(53719, 1), "Unhappy End World", TakahashiRie, OzawaAri) {
            Music(1.25)
        }

        Anime("Gakkougurashi!", MAL = 24765) {
            bestGirl = "Sakura Megumi"
            // rip Megu-nee
            Cry(Emotion.CU)
            Meme(0.2, Meme.M4_7Days)
            FeatureMusic(VGMDB_Track(53719, 1))
        }
    }
    fun GenerateBlock.YuYuYu() {
        // kirare - happy typhoon and u's - a song for yuyuyu reference
        // somewhat changed da world

        val HeroClub = arrayOf(TeruiHaruka, MimoriSuzuko, UchiyamaYumi, KurosawaTomoyo, NagatsumaJuri)
        val HeroClub2 = arrayOf(*HeroClub, HanazawaKana)
        AlbumTrack(VGMDB_Album(47678), 1, "Aurora Days", *HeroClub) {
            Music(0.2)
        }

        // We May Never Meet Again, But I Will Never Forget Your Voice
        AlbumTrack(VGMDB_Album(69821), 1, "Egao no Kimi e", MimoriSuzuko) {
            Music(1.0)
        }

        Album(VGMDB_Album(114186), "Ashita no Hanatachi")
        // the glorious udon stream map
        // sonoko nogizaka46 yubi bouenkyou anime ban fate fiery extreme armin adventure sotarks new adventure
        Track(VGMDB_Track(114186, 2), "U・D・N", *HeroClub2) {
            Music(0.8)
        }

        val YuYuYuMeme = Meme(0.8, Meme.M2_3Weeks)
        // koori chikage remained as a meme even after the death
        // of the yuyuyu franchise (blame rst for that)
        // just too based bro, rst and sb69 can't kill her
        val KooriChikageMeme = Meme(0.2, Meme.M1_2Months)
        val KilledByRst = KilledBy(VGMDB_Franchise(6438))

        Anime("Yuuki Yuuna wa Yuusha de Aru", MAL = 25519) {
            bestGirl = "Yuuki Yuuna"
            // The Itsuki thing made me cry I guess, but there's no PADS.
            // YouTube clip: https://www.youtube.com/watch?v=0bjxQMWXsRE
            Cry(Emotion.CU)

            // The main group is comfy af, and
            // they actually used it to make some sad things.
            // Well I cried at the other Itsuki thing
            // no clip this time
            Cry(Emotion.MP)

            Impact(YuYuYuMeme)
            Relation(KilledByRst)

            FeatureMusic(VGMDB_Track(47678, 1))

            // Second anime (after Sora no Method) to (be able to)
            // use OP/ED visual + music to strengthen the sadness.
            // (only the ending tho)
            Impact("OP/ED visual chemistry", Emotion.CU, 0.5)
        }

        // first LN entry of NRS
        LN("Nogi Wakaba wa Yuusha de Aru", MAL = 90810) {
            // Update Nov 6, 2021:
            // This LN reading progress will be paused to prioritize the anime.
            // Issue #10 will try to make both S3 and NoWaYu LN get all of the
            // scores they deserve.

            // Update Nov 12, 2021:
            // ln killed the franchise kek

            // Update Jan 17, 2022:
            // we are living in the shithole known as
            // the rst-sb69 duopoly era
            // well, at least chikage koori is still a meme

            // based best girl
            bestGirl = "Koori Chikage"

            Impact(YuYuYuMeme)
            Impact(KooriChikageMeme)

            // There are a lot of sad things in this LN
            // Firstly,
            // Shiratori Utano
            // She is used as a distraction, which is pretty cruel
            // (but that's for the greater good).
            // In the final moments, she said:
            // "I am scared. I really, truly am." (YLIA flashbacks)
            // Secondly,
            // Doi Tamako and Iyojima [Anzu]
            // They died before the group could go to a flower-viewing
            // party (idk how to describe this)
            // Thirdly,
            // Koori Chikage
            // man
            // read the shit and see it for yourself
            // man

            // Overall, this LN spams sad shit everywhere,
            // <strikethrough>(inb4 yuuna got fucked and i cried)</strikethrough>
            // that didn't happen pog
            AEI(3.0, Emotion.CU)
        }

        Anime("Yuuki Yuuna wa Yuusha de Aru: Washio Sumi no Shou", MAL = 34284) {
            // this was not taken very seriously

            // she looked like best girl ngl
            bestGirl = "Tougou Mimori" // or Sumi Washio

            FeatureMusic(VGMDB_Track(69821, 1))
            // gin's death and sonoko spamming magia are sad
            // but my pepega ass doesn't watch this shit properly
            // ffs
            NEI(1.0, Emotion.CU)

            Impact(YuYuYuMeme)
        }

        Anime("Yuuki Yuuna wa Yuusha de Aru: Yuusha no Shou", MAL = 34445) {
            // "The Michi Random of Yuuki Yuuna"
            bestGirl = "Yuuki Yuuna"

            // that conversation is peak drama
            // it captures my heart and does make
            // sense (unlike other shits)
            // The fact that Yuuki Yuuna uses the
            // tenets to argue even makes the shit
            // sadder
            // literally the vertex of drama wtf
            //                  ^
            //                  yuyuyu reference !!!11!!1
            AEI(3.0, Emotion.CU)

            Impact(YuYuYuMeme)
        }

        Anime("Yuuki Yuuna wa Yuusha de Aru: Dai Mankai no Shou", MAL = 42587) {
            seasonal = true
            bestGirl = "Yuuki Yuuna"

            // I expected this to make a new Ayumu-era (something like
            // Yuuna-era or some dumb shit like that), but it doesn't
            // give a fuck by adapting KuMeYu and NoWaYu in the first
            // 5 (for now) episodes.

            // "But when it wants to fuck up, it can't"
            // The KuMeYu episodes were meh, but in the first NoWaYu ep,
            // it's already made an emotional impact

            // E5-20:17
            // YLIA flashbacks
            NEI(1.5, Emotion.CU)
            Impact(YuYuYuMeme)
            Impact(KooriChikageMeme)

            FeatureMusic(VGMDB_Track(114186, 2))
        }

        Franchise(VGMDB_Franchise(3245), "Yuusha de Aru") {
            Include(VGMDB_Track(47678, 1))
            Include(VGMDB_Track(69821, 1))
            Include(VGMDB_Track(114186, 2))

            Include(MAL(25519))
            Include("L-MAL-90810")
            Include(MAL(34284))
            Include(MAL(34445))
            Include(MAL(42587))
        }
    }
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

        val ReStageMeme = Meme(0.7, Meme.M2_3Months)
        val GateOpenOnsen = GateOpen(VGMDB_Franchise(6839))
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
    AOT()
    NagiAsu()
    GochiUsa()

    Anime("Ushinawareta Mirai wo Motomete", MAL = 21845) {
        // kaomeme
        bestGirl = "Sasaki Kaori"
        // Ending did hit me
        NEI(1.25, Emotion.CU)
        // osuhow memes
        // This anime saved me in the Math Qualifiers lmao,
        // and VMO2020 too.
        Meme(0.3, Meme.M1_2Weeks)
    }

    SoraMethod()
    YLIA()
    Saekano()
    GakkouGurashi()
    YuYuYu()
    ReStage()

}.run{}

