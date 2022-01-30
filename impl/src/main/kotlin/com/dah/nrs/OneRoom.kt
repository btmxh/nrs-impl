package com.dah.nrs

fun GenerateBlock.OneRoom() {
    // (1) - - - - - - - (2)
    // (1)        (1)
    //    \        |
    //     \       |
    //      \      |
    //      (2)   (2)

    AlbumTrack(VGMDB_Album(63666), 1, "harumachi clover", MAO) {
        // ME NO MAE NO TOBIRA O AKETARA HARU KAZE
        // TORI TACHI MO KIGI DE MACHIAWASE
        // KIMI E MUKAU SHINGOU AOZORA IRO
        // KAKE DAZEBA II
        // USOTSUKI KAKURITSU RON TOKA
        // ICHI PURASU ICHI GA MUGEN TOKA
        // OSHIETE KURETA KIMI TO SAGASHI NI YUKOU
        // H A R U M A C H I   K U R O B A A A
        Music(0.75)
        Impact("1-2 1-2 1-2", Emotion.AP, 0.75)
    }

    Track("M-37", "Harumachi Clover (Swing Arrangement) [Dictate Edit]", WillStetson) {
        Music(0.25)
        Impact("1-2 1-2 1-2", Emotion.AP, 0.75)
    }

    Anime("One Room", MAL = 34392) {
        bestGirl = "Hanasaka Yui"
        seasonal = true
        Boredom(Boredom.Dropped)
        FeatureMusic(VGMDB_Track(63666, 1))
    }

    Franchise(VGMDB_Franchise(6434), "OneRoom") {
        Include(MAL(34392))
        Include(VGMDB_Track(63666, 1))
    }
}