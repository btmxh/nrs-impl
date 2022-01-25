package com.dah.nrs

fun GenerateBlock.OnsenMusume() {
    // le funny franchise, lack content therefore low score
    // translate stuff for me if u want score to go up

    val SPRiNGS = Artist("M-17", "SPRiNGS")

    Album(VGMDB_Album(75344), "Tsuioku Kaleidoscope")
    Track(VGMDB_Track(75344, 1), "Junjou -SAKURA-", SPRiNGS) {
        Music(1.5)
    }

    AlbumTrack(VGMDB_Album(75349), 1, "Hop Step Jump!", SPRiNGS) {
        Music(1.25)
    }

    Franchise(VGMDB_Franchise(6439), "Onsen Musume") {
        Include(VGMDB_Track(75344, 1))
        Include(VGMDB_Track(75349, 1))
    }
}
