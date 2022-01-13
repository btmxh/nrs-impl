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
        Album(VGMDB_Album(23391), "Connect")
        Album(VGMDB_Album(30302), "Puella Magi Madoka Magica Special CD 1 Drama CD 'Memories of you'")
        Album(VGMDB_Album(41292), "Colorful")
        Album(VGMDB_Album(24725), "Puella Magi Madoka Magica Special CD 2 Original Soundtrack I")
        Album(VGMDB_Album(39170), "Puella Magi Madoka Magica Special CD 5 Drama CD 'Farewell Story'")
        Album(VGMDB_Album(95029), "Gomakashi")
        Album(VGMDB_Album(69147), "TAILWIND")
        Album(VGMDB_Album(91985), "Utsuroi")
        Album(VGMDB_Album(113295),
            "Magia Record: Puella Magi Madoka☆Magica Side Story 2nd SEASON -Kakusei Zenya- Theme Song Collection")

        Track(VGMDB_Track(23391, 1), "Connect", ClariS) {
            Music(0.5)
        }

        Track(VGMDB_Track(30302, 2), "Mata Ashita", YuukiAoi) {
            Music(0.4)
        }

        Track(VGMDB_Track(41292, 1), "Colorful", ClariS) {
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

        Track(VGMDB_Track(95029, 1), "Gomakashi", TrySail) {
            Music(1.5)
        }

        Track(VGMDB_Track(113295, 1), "Careless", ClariS) {
            Music(1.2)
        }

        Track(VGMDB_Track(69147, 1), "Kakawari", TrySail) {
            Music(1.3)
        }

        Track(VGMDB_Track(89431, 1), "Signal", ClariS) {
            Music(1.6)
        }

        Track(VGMDB_Track(91985, 1), "Utsuroi", TrySail) {
            Music(1.3)

            // the game
            // browiec's Wisdom
            // Misunderstanding
            // osu! 9.97⭐UTSUROI +HDDTHR 1108pp | WhiteCat
            Impact("osu! beatmap", Emotion.AP, 0.25)
        }

        val MadoMagiFandom = Impact("MadoMagi fandom is very good (iirc)", Fandom.FandomFactor, 0.25);

        Anime("Mahou Shoujo Madoka★Magica", MAL = 9756){
            bestGirl = "Kaname Madoka"

            // 32k got killed over and over, and her lover has to
            // time-travel everytime it happens
            PADS(1, Emotion.CU)

            // Kyoko's backstory
            AEI(3.0, Emotion.CU)

            Impact(MadoMagiFandom)
            Meme(0.6, Meme.MMoreThan3Months)
            Boredom(Boredom.Completed)

            // Killed by Love Live Niji
            KilledBy(MAL(40879))

            FeatureMusic(VGMDB_Track(23391, 1))
            FeatureMusic(VGMDB_Track(30302, 2))
            FeatureMusic(VGMDB_Track(24725, 4))
            FeatureMusic(VGMDB_Track(39170, 2))
        }

        Anime("Mahou Shoujo Madoka★Magica Movie 3: Hangyaku no Monogatari", MAL = 11981) {
            bestGirl = "Kaname Madoka"
            // I can't understand this movie lol

            Impact(MadoMagiFandom)
            Meme(0.6, Meme.MMoreThan3Months)
            Boredom(Boredom.Completed)

            // Killed by Love Live Niji
            KilledBy(MAL(40879))

            FeatureMusic(VGMDB_Track(41292, 1))
        }

        Anime("Magia Record: Mahou Shoujo Madoka★Magica Gaiden (TV)", MAL = 38256) {
            bestGirl = "Tamaki Iroha"
            // MagiReco-era is one of the most important eras in autism history
            // This is the anime that brought it to life

            // Emotional impacts are all in the game
            // (Madokami's MGS, Sana's backstory)
            Waifu("Tamaki Iroha", "2020-02-14" to "2020-08-14")
            // Community is good
            Impact(MadoMagiFandom)
            Meme(0.9, Meme.MMoreThan3Months)
            Boredom(Boredom.Completed)

            // Gate-opened gacha games
            GateOpen("G-VGM-5237")
            GateOpen("GF-VGM-7059")

            // Killed by Love Live Niji
            KilledBy(MAL(40879))

            FeatureMusic(VGMDB_Track(95029, 1))
        }

        Anime("Magia Record: Mahou Shoujo Madoka★Magica Gaiden (TV) 2nd Season", MAL = 41530) {
            bestGirl = "Tamaki Iroha"

            Waifu("Tamaki Iroha", "2020-02-14" to "2020-08-14")
            // Community is good
            Impact(MadoMagiFandom)
            // Meme was not as good as S1
            // Well, because it's already milked
            Meme(0.3, Meme.M1_3Days)

            Boredom(Boredom.Completed)

            // Gate-opened gacha games
            GateOpen("G-VGM-5237")
            GateOpen("GF-VGM-7059")

            KilledBy(MAL(40879))

            // OP
            FeatureMusic(VGMDB_Track(113295, 1))
        }

        Game("G-VGM-5237", "Magia Record: Mahou Shoujo Madoka★Magica Gaiden") {
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

            Waifu("Tamaki Iroha", "2020-02-14" to "2020-08-14")
            // Community is good
            Impact(MadoMagiFandom)
            Meme(0.9, Meme.MMoreThan3Months)

            // Gate-opened gacha games (there is only re step in NRS tho)
            GateOpen("GF-VGM-7059")

            // Killed by Love Live Niji (more like the devs themselves lmfao)
            KilledBy(MAL(40879))

            FeatureMusic(VGMDB_Track(69147, 11))
            FeatureMusic(VGMDB_Track(89431, 1))
            FeatureMusic(VGMDB_Track(91985, 1))
        }
    }

    `K-On!`()
    MadokaMagica()
}.run{}

