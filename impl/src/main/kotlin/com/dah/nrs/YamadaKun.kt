package com.dah.nrs

fun GenerateBlock.YamadaKun() {
    // lemur
    AlbumTrack(VGMDB_Album(51918), 1, "Kuchizuke Diamond", WEAVER) {
        Music(1.0)
        Impact("Legendary osu! beatmap", Emotion.AP, 0.5)
    }

    AlbumTrack(VGMDB_Album(52045), 1, "CANDY MAGIC", mimimemeMIMI) {
        Music(0.2)
    }

    Anime("Yamada-kun to 7-nin no Majo", MAL = 28677) {
        bestGirl = "Shiraishi Urara"

        FeatureMusic(VGMDB_Track(51918, 1))
        FeatureMusic(VGMDB_Track(52045, 1))
    }

    Franchise(VGMDB_Franchise(3370), "Yamada-kun to 7-nin no Majo") {
        Include(MAL(28677))
        Include(VGMDB_Track(51918, 1))
        Include(VGMDB_Track(52045, 1))
    }
}