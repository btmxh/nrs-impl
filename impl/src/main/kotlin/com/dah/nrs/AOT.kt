package com.dah.nrs

fun GenerateBlock.AOT() {
    Anime("Shingeki no Kyojin", MAL = 16498) {
        bestGirl = "Ackerman Mikasa"
        Boredom(Boredom.Completed)
        NEI(0.2, Emotion.AP)
    }

    Anime("Shingeki no Kyojin Season 2", MAL = 25777) {
        bestGirl = "Ackerman Mikasa"
        Boredom(Boredom.Completed)
        NEI(0.3, Emotion.AP)
    }

    Anime("Shingeki no Kyojin Season 3", MAL = 35760) {
        seasonal = true
        bestGirl = "Ackerman Mikasa"
        Boredom(Boredom.Completed)
        NEI(0.3, Emotion.AP)
    }

    // this has more score than almost all love live animes
    // and almost the same score as sb69 stars wtf.
    Anime("Shingeki no Kyojin Season 3 Part 2", MAL = 38524) {
        seasonal = true
        bestGirl = "Ackerman Mikasa"
        Boredom(Boredom.Completed)
        AEI(2.0, Emotion.AP)
    }

    // imagine almost losing a contentless franchise xddddddddddddd
    Franchise(VGMDB_Franchise(2931), "Shingeki no Kyojin") {
        Include(MAL(16498))
        Include(MAL(25777))
        Include(MAL(35760))
        Include(MAL(38524))
    }
}
