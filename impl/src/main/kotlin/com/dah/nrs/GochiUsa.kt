package com.dah.nrs

fun GenerateBlock.GochiUsa() {
    AlbumTrack(VGMDB_Album(44890), 1, "Daydream café", PetitRabbit) {
        // fuwa fuwa
        // dong do la max do
        // duy bua ham l
        // duy bua ngao l
        Music(1.2)
    }

    Album(VGMDB_Album(55364), "Is the order a rabbit?? Chino Character Song Album: CUP OF Chino") {
        // this also includes mahou shoujo chino
        Include(VGMDB_Track(54418, 1))
    }

    Track(VGMDB_Track(55364, 3), "Shinsaku no Shiawase wa Kochira!", MinaseInori) {
        // dan dan kikoeru
        // lets go i fced the son's insane diff with dt
        Music(0.9)
    }

    Album(VGMDB_Album(54418), "Gochuumon wa Mahou Shoujo desu ka? Image Song: Mahou Shoujo Chino")

    Track(VGMDB_Track(54418, 1), "Mahou Shoujo Chino", MinaseInori) {
        Music(0.5)
    }

    Anime("Gochuumon wa Usagi Desu ka?", MAL = 21273) {
        Boredom(Boredom.Completed)
    }

    Franchise(VGMDB_Franchise(3939), "Gochuumon wa Usagi Desu ka?") {
        Include(MAL(21273))
        Include(VGMDB_Track(54418, 1))
        Include(VGMDB_Track(55364, 3))
    }
}
