package com.dah.nrs

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

        Boredom(Boredom.Completed)
    }

    Anime("Saenai Heroine no Sodatekata ♭", MAL = 30727) {
        bestGirl = "Megumi Kato"
        Impact(MegumiKato)
        Impact(SaekanoHumor)
        Impact(SaekanoMeme)

        Boredom(Boredom.Completed)
    }

    Anime("Saenai Heroine no Sodatekata Fine", MAL = 36885) {
        bestGirl = "Megumi Kato"
        Impact(MegumiKato)
        Humor(1.0)

        Boredom(Boredom.Completed)
    }

    Franchise(VGMDB_Franchise(3305), "Saenai Heroine no Sodatekata") {
        Include(MAL(23277))
        Include(MAL(30727))
        Include(MAL(36885))

        Include(VGMDB_Track(48199, 1))
        Include(VGMDB_Track(49446, 1))

        Boredom(Boredom.Completed)
    }
}
