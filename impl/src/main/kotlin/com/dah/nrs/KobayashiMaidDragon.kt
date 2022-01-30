package com.dah.nrs

fun GenerateBlock.KobayashiMaidDragon() {
    AlbumTrack(VGMDB_Album(62516), 1, "Aozora no Rhapsody", fhana) {
        Music(0.75)
    }

    AlbumTrack(VGMDB_Album(110219), 1, "Ai no Supreme!", fhana) {
        Music(1.0)
        Impact("\"why is the dude singing???\" - some pp mapper", Emotion.AP, 0.5)
    }

    Anime("Kobayashi-san Chi no Maid Dragon", MAL = 33206) {
        bestGirl = "Tohru"
        // funny ig idk tbh
        NEI(0.3, Emotion.AP)

        Boredom(Boredom.Completed)
        FeatureMusic(VGMDB_Track(62516, 1))
    }

    Franchise(VGMDB_Franchise(8954), "Kobayashi-san Chi no Maid Dragon") {
        Include(MAL(33206))

        Include(VGMDB_Track(62516, 1))
        Include(VGMDB_Track(110219, 1))
    }
}