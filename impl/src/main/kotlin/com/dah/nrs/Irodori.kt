package com.dah.nrs

fun GenerateBlock.Irodori() {
    // original of irodori covers
    Album(VGMDB_Album(91187), "CHUNITHM ALL JUSTICE COLLECTION ep.I")
    Track(VGMDB_Track(91187, 35), "Endmark ni kibou to namida o soete", cosMoBousouP) {
        Music(1.0)
    }

    Track("M-28", "Brain Power", NOMA) {
        Music(0.8)
        Impact("Legendary osu! beatmap", Emotion.AP, 0.25)
    }

    // the covers themselves
    Album(VGMDB_Album(93299), "GO!GO! Chunithm♥Endmark")
    Track(VGMDB_Track(93299, 2), "Endmark ni kibou to namida o soete ~Irodorimidori arrange~", Irodorimidori) {
        Music(1.0)
        RemixOf(VGMDB_Track(91187, 35))
    }

    Album("M-29", "Maware! GO! GO! CHUNITHM") {
        Include("M-30")
        Include("M-31")
    }

    Track("M-30", "Bokura no Freedom DiVE↓", Irodorimidori) {
        Music(0.8)
        RemixOf(VGMDB_Track(34269, 12))
    }

    Track("M-31", "Zero kara hajimeru Brain Power", Irodorimidori) {
        Music(0.6)
        RemixOf("M-28")
    }

    Anime("Irodorimidori", MAL = 50267) {
        bestGirl = "idk"
        status = EntryStatus.Watching
        Boredom(Boredom.Watching)
    }

    Franchise(VGMDB_Franchise(10978), "Irodorimidori") {
        Include(MAL(50267))

        Include(VGMDB_Track(93299, 2))
        Include("M-30")
        Include("M-31")
    }

}