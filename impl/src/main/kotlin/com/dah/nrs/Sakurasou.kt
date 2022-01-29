package com.dah.nrs

fun GenerateBlock.Sakurasou() {
    AlbumTrack(VGMDB_Album(35015), 1, "Kimi ga Yume wo Tsuretekita") {
        Music(0.7)
    }

    Anime("Sakura-sou no Pet na Kanojo", MAL = 13759) {
        bestGirl = "Mashiro Shiina"

        // This is a very good compoly story, meaning
        // there are a lot of truly sad moments in this
        // anime. But a lot of records have been lost and
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

    Franchise(VGMDB_Franchise(2090), "Sakurasou no Pet na Kanojo") {
        Include(MAL(13759))
        Include(VGMDB_Track(35015, 1))
    }
}
