package com.dah.nrs

fun GenerateBlock.UchiageHanabi() {
    AlbumTrack(VGMDB_Album(69257), 1, "Uchiage Hanabi", DAOKO, YonezuKenshi) {
        Music(0.5)
    }

    Anime("Uchiage Hanabi, Shita kara Miru ka? Yoko kara Miru ka?", MAL = 34498) {
        // SLN rng
        NEI(1.5, Emotion.CU)

        bestGirl = "Oikawa Nazuna"

        Boredom(Boredom.Completed)

        FeatureMusic(VGMDB_Track(69257, 1))
    }

    Franchise(VGMDB_Franchise(5919), "Uchiage Hanabi, Shita kara Miru ka? Yoko kara Miru ka?") {
        Include(MAL(34498))
        Include(VGMDB_Track(69257, 1))
    }
}