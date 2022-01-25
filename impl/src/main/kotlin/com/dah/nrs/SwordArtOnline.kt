package com.dah.nrs

fun GenerateBlock.SwordArtOnline() {
    AlbumTrack(VGMDB_Album(33537), 1, "crossing field", LiSA) {
        Music(0.3)
    }

    Anime("Sword Art Online", MAL = 11757) {
        bestGirl = "Yuuki Asuna"
        FeatureMusic(VGMDB_Track(33537, 1))
        Boredom(Boredom.Completed)
    }

    Anime("Sword Art Online II", MAL = 21881) {
        bestGirl = "Yuuki Asuna"
        Boredom(Boredom.Completed)
    }

    Anime("Sword Art Online Movie: Ordinal Scale", MAL = 31765) {
        bestGirl = "Yuuki Asuna"
        Boredom(Boredom.Completed)
    }

    Franchise(VGMDB_Franchise(2633), "Sword Art Online") {
        Include(MAL(11757))
        Include(MAL(21881))
        Include(MAL(31765))

        Include(VGMDB_Track(33537, 1))
    }
}
