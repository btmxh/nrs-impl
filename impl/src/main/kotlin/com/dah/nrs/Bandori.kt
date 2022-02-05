package com.dah.nrs

fun GenerateBlock.Bandori() {
    // gen1 sb69

    AlbumTrack(VGMDB_Album(60358), 1, "STAR BEAT! ~Hoshi no Kodou~", PoppinParty) {
        Music(1.25)
    }

    AlbumTrack(VGMDB_Album(63624), 1, "Tokimeki Experience!", PoppinParty) {
        Music(0.75)
    }

    Track(VGMDB_Track(63624, 2), "1000 kai Urunda Sora", PoppinParty) {
        Music(1.75)
    }

    // cherry bomb stuff
    Album("M-32", "S") {
        Include("M-33")
    }
    
    Track("M-33", "Cherry Bomb", SILENTSIREN) {
        Music(0.75)
    }

    Album(VGMDB_Album(106577), "BanG Dream! Girls Band Party! Cover collection vol.5")
    Track(VGMDB_Track(106577, 1), "Cherry Bomb", PoppinParty) {
        Music(1.0)
        Impact("Legendary osu! beatmap", Emotion.AP, 0.5)
        RemixOf("M-33")
    }

    AlbumTrack(VGMDB_Album(85172), 1, "FIRE BIRD", Roselia) {
        Music(1.0)
    }

    Track(VGMDB_Track(106577, 6), "Harumodoki", PastelPalletes) {
        Music(0.7)
        RemixOf(VGMDB_Track(51516, 1))
    }

    Track("M-35", "Harumodoki (Asterisk DnB Remix) [Rakakun- Edit]", PastelPalletes, Asterisk, Rakakun) {
        Music(0.7)
        RemixOf(VGMDB_Track(51516, 1))
        RemixOf(VGMDB_Track(106577, 6))
    }

    AlbumTrack(VGMDB_Album(81504), 1, "KIZUNA MUSIC♪", PoppinParty) {
        Music(1.5)
        Impact("kizunya method", Emotion.AP, 0.4)
    }

    Album(VGMDB_Album(111089), "Live Beyond!!")
    Track(VGMDB_Track(111089, 5), "Koko kara Saki wa Uta ni Naranai", PoppinParty) {
        // The Sweet Youthful Days Of Dreams And Passion
        Music(1.25)
    }

    Album(VGMDB_Album(74133), "CiRCLiNG")
    Track(VGMDB_Track(74133, 2), "Light Delight", PoppinParty) {
        // naite naite
        // daite daite
        // searching for the light delight
        Music(1.5)
    }

    AlbumTrack(VGMDB_Album(50723), 1, "Silhouette", KANABOON) {
        Music(1.0)
    }

    Album(VGMDB_Album(114399), "BanG Dream! Girls Band Party! Cover collection vol.6")
    Track(VGMDB_Track(114399, 8), "Silhouette") {
        Music(1.25)
        Impact("Legendary osu! beatmap", Emotion.AP, 0.25)
    }

    AlbumTrack(VGMDB_Album(82743), 1, "Y.O.L.O", Afterglow) {
        Music(0.75)
        Impact("Legendary osu! beatmap", Emotion.AP, 0.25)
    }

    Album(VGMDB_Album(95118), "Initial/Yume wo Uchinuku Shunkan ni!")
    Track(VGMDB_Track(95118, 2), "Yume wo Uchinuku Shunkan ni!", PoppinParty) {
        Music(0.75)
    }

    // bandori has some good comedy shit
    val BandoriHumor = NEI(1.5, Emotion.AP)

    Anime("BanG Dream!", MAL = 33573) {
        bestGirl = "Ichigaya Arisa"
        // Ending pretty sadge
        NEI(1.25, Emotion.CU)
        // nrs1
        Meme(0.2, Meme.M4_7Days)
        Boredom(Boredom.Completed)
        Impact(BandoriHumor)

        FeatureMusic(VGMDB_Track(63624, 1))

        KilledBy(MAL(40879))
    }

    Anime("BanG Dream! 2nd Season", MAL = 37869) {
        bestGirl = "Ichigaya Arisa"
        // nrs1
        Meme(0.15, Meme.M1_3Days)
        // rip
        Boredom(Boredom.Dropped)
        Impact(BandoriHumor)

        FeatureMusic(VGMDB_Track(81504, 1))

        KilledBy(MAL(40879))
    }

    Franchise(VGMDB_Franchise(5173), "BanG Dream!") {
        Include(MAL(33573))
        Include(MAL(37869))

        Include(VGMDB_Track(60358, 1))
        Include(VGMDB_Track(63624, 1))
        Include(VGMDB_Track(63624, 2))
        Include(VGMDB_Track(106577, 1))
        Include(VGMDB_Track(85172, 1))
        Include(VGMDB_Track(106577, 6))
        Include(VGMDB_Track(81504, 1))
        Include(VGMDB_Track(111089, 5))
        Include(VGMDB_Track(74133, 2))
        Include(VGMDB_Track(114399, 8))
        Include(VGMDB_Track(82743, 1))
        Include(VGMDB_Track(95118, 2))
    }

}