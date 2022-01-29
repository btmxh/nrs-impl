package com.dah.nrs

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
    val MagiRecoComfy = NEI(1.0, Emotion.MP)

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
        Impact(MagiRecoComfy)
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
        // not that comfy
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
        Impact(MagiRecoComfy)
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