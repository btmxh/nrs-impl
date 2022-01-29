package com.dah.nrs

fun GenerateBlock.`K-On`() {
    // OSTs and shit
    Album(VGMDB_Album(20118), "Utauyo!!MIRACLE")
    Album(VGMDB_Album(21146), "HO-KAGO TEA TIME Second")
    Album(VGMDB_Album(22848), "Gohan wa Okazu/U&I")

    Track(VGMDB_Track(20118, 2), "Kira Kira Days", HTT) {
        Impact("Binfy's favorite osu! beatmap", Emotion.AP, 0.25)
        Impact("Sotarks made a map for him XDDDDD", Emotion.AP, 0.5)
        Music(0.7)
    }

    Track(VGMDB_Track(21146, 9), "Tenshi ni Fureta yo!", HTT)

    Track("M-3", "Tenshi ni Fureta yo! (Asterisk DnB Remix)", HTT, Asterisk) {
        Music(1.2)
        Impact("Legendary osu! song", Emotion.AP, 0.3)

        RemixOf(VGMDB_Track(21146, 9))
    }

    Track(VGMDB_Track(22848, 2), "U&I", HTT) {
        // inst is kinda good
        Music(0.1)
    }

    Track("M-4", "U&I (DJ Amaya's Angel at Dawn Remix)", HTT, DJAmaya) {
        Music(0.6)

        RemixOf(VGMDB_Track(22848, 2))
    }

    // K-On! animes

    // Kinda comfy. But not that much.
    val KOnComfy = NEI(1.0, Emotion.MP)
        .from(MAL(5680), MAL(7791), MAL(9617))
    val KOnHumor = NEI(0.5, Emotion.AP)
    // During my 9th grade, K-On memes basically dominate the meme world
    // (with other anime, hence the low strength)
    val KOnMeme = Meme(0.5, Meme.MMoreThan3Months)
        .from(MAL(5680), MAL(7791), MAL(9617))

    Anime("K-On!", MAL = 5680) {
        bestGirl = "Nakano Azusa"

        Impact(KOnComfy)
        // K-On is pretty boring (4.5 PMMS in NRS1)
        Boredom(Boredom.CompletedWithNoticeableBoredom)
        Impact(KOnMeme)
        Impact(KOnHumor)

        // Kira Kira Days not featured in S1
    }

    Anime("K-On!!", MAL = 7791) {
        bestGirl = "Nakano Azusa"

        Impact(KOnComfy)
        // K-On is pretty boring (4.5 PMMS in NRS1)
        Boredom(Boredom.CompletedWithNoticeableBoredom)
        Impact(KOnMeme)
        Impact(KOnHumor)

        FeatureMusic(VGMDB_Track(21146, 9))
        FeatureMusic(VGMDB_Track(22848, 2))
    }

    Anime("K-On! Movie", MAL = 9617) {
        bestGirl = "Nakano Azusa"

        Impact(KOnComfy)
        // K-On is pretty boring (4.5 PMMS in NRS1)
        Boredom(Boredom.Completed)
        Impact(KOnMeme)
        Impact(KOnHumor)

        FeatureMusic(VGMDB_Track(21146, 9))
    }

    Franchise(VGMDB_Franchise(504), "K-On!") {
        bestGirl = "Nakano Azusa"

        Include(MAL(5680))
        Include(MAL(7791))
        Include(MAL(9617))
        Include(VGMDB_Album(20118))
        Include(VGMDB_Album(21146))
        Include(VGMDB_Album(22848))
    }
}