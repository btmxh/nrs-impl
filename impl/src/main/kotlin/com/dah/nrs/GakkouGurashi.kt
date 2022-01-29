package com.dah.nrs

fun GenerateBlock.GakkouGurashi() {
    AlbumTrack(VGMDB_Album(52993), 1, "Friend Shitai", MinaseInori, MAO, OzawaAri, TakahashiRie) {
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

        Boredom(Boredom.Completed)
    }

    Franchise(VGMDB_Franchise(4000), "Gakkougurashi!") {
        Include(MAL(24765))
        Include(VGMDB_Track(52993, 1))
        Include(VGMDB_Track(53719, 1))
    }
}
