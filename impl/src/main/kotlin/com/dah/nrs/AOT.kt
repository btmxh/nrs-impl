package com.dah.nrs

fun GenerateBlock.AOT() {
    Anime("Shingeki no Kyojin", MAL = 16498) {
        bestGirl = "Ackerman Mikasa"
        Boredom(Boredom.Completed)
    }

    Anime("Shingeki no Kyojin Season 2", MAL = 25777) {
        bestGirl = "Ackerman Mikasa"
        Boredom(Boredom.Completed)
    }

    Anime("Shingeki no Kyojin Season 3", MAL = 35760) {
        seasonal = true
        bestGirl = "Ackerman Mikasa"
        Boredom(Boredom.Completed)
    }

    Anime("Shingeki no Kyojin Season 3 Part 2", MAL = 38524) {
        seasonal = true
        bestGirl = "Ackerman Mikasa"
        Boredom(Boredom.Completed)
    }

    Franchise(VGMDB_Franchise(2931), "Shingeki no Kyojin") {
        Include(MAL(16498))
        Include(MAL(25777))
        Include(MAL(35760))
        Include(MAL(38524))
    }
}
