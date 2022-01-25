package com.dah.nrs

fun GenerateBlock.Idolmaster() {
    Album(VGMDB_Album(53945), "THE IDOLM@STER LIVE THE@TER DREAMERS 01 Dreaming!")
    Album(VGMDB_Album(64249), "THE IDOLM@STER CINDERELLA MASTER EVERMORE")
    Album(VGMDB_Album(78253), "THE IDOLM@STER MILLION THE@TER GENERATION 11 UNION!!")

    Track(VGMDB_Track(53945, 1), "Dreaming!") {
        Music(0.6)
        Impact("Legendary osu! beatmap", Emotion.AP, 0.3)
    }

    Track(VGMDB_Track(64249, 1), "EVERMORE (M@STER VERSION)") {
        Music(1.0)
    }

    Track(VGMDB_Track(78253, 1), "UNION!!") {
        Music(0.8)
        Impact("Legendary osu! beatmap", Emotion.AP, 0.2)
    }

    Anime("The iDOLM@STER", MAL = 10278) {
        bestGirl = "Minase Iori"
        // ending pretty sadge
        NEI(1.2, Emotion.CU)

        // idk why i gave this 6 in NRS1 but i'll nerf it to 0.3 ig.
        Music(0.3)
        Boredom(Boredom.Completed)
    }

    Anime("The iDOLM@STER Cinderella Girls", MAL = 23587) {
        bestGirl = "Ogata Chieri"
        Boredom(Boredom.Completed)
    }

    Anime("The iDOLM@STER Cinderella Girls 2nd Season", MAL = 30344) {
        bestGirl = "Ogata Chieri"
        Boredom(Boredom.Completed)
    }

    Franchise(VGMDB_Franchise(3559), "THE IDOLM@STER") {
        Include(VGMDB_Track(53945, 1))
        Include(VGMDB_Track(64249, 1))
        Include(VGMDB_Track(78253, 1))

        Include(MAL(10278))
        Include(MAL(23587))
        Include(MAL(30344))
    }
}
