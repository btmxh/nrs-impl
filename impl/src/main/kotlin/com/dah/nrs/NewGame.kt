package com.dah.nrs

fun GenerateBlock.NewGame() {
    // This and Sakura-sou is recorded to be the
    // inspiration for me to learn programming
    val InspiredProgramming = Info(Information.GeneralInfo, true)
    // pretty funny lol
    val NewGameHumor = NEI(1.0, Emotion.AP)
    val NewGameMeme = Meme(0.2, Meme.M1_3Days)

    AlbumTrack(VGMDB_Album(58627), 1, "Now Loading!!!!", fourfolium) {
        Music(1.0)
        Impact("osu! beatmap", Emotion.AP, 0.3)
    }

    AlbumTrack(VGMDB_Album(68225), 1, "STEP by STEP UP↑↑↑↑", fourfolium) {
        // mankai step by step
        // this song is legendary af
        Music(1.25)
        Impact("Legendary osu! beatmap", Emotion.AP, 0.5)
    }

    Anime("New Game!", MAL = 31953) {
        // idk who is better, aoba or yun, so one girl each season
        bestGirl = "Iijima Yun"

        Impact(NewGameHumor)
        Impact(InspiredProgramming)
        Impact(NewGameMeme)
        Boredom(Boredom.Completed)

        FeatureMusic(VGMDB_Track(58627, 1))
    }

    Anime("New Game!!", MAL = 34914) {
        // idk who is better, aoba or yun, so one girl each season
        bestGirl = "Suzukaze Aoba"

        Impact(NewGameHumor)
        Impact(InspiredProgramming)
        Impact(NewGameMeme)
        Boredom(Boredom.Completed)

        FeatureMusic(VGMDB_Track(68225, 1))
    }

    Franchise(VGMDB_Franchise(4168), "NEW GAME!") {
        Include(MAL(31953))
        Include(MAL(34914))
        Include(VGMDB_Track(58627, 1))
        Include(VGMDB_Track(68225, 1))
    }
}