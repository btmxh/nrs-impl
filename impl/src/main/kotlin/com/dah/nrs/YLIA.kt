package com.dah.nrs

fun GenerateBlock.YLIA() {
    Album(VGMDB_Album(49046), "Shigatsu wa Kimi no Uso ORIGINAL SONG & SOUNDTRACK")

    Track(VGMDB_Track(49046, 1), "Kimi wa Wasurerareru no", YokoyamaMasaru) {
        Music(1.0)
        NEI(1.0, Emotion.CU)
    }

    Track(VGMDB_Track(49046, 18), "Yuujin A-kun wo Watashi no Bansousha ni Ninmeishimasu", YokoyamaMasaru) {
        Music(1.0)
        NEI(1.0, Emotion.CU)
    }

    Anime("Shigatsu wa Kimi no Uso", MAL = 23273) {
        bestGirl = "Miyazono Kaori"

        // YLIA is watched during the SLN days (Second-Love-Ngoc era),
        // this has lead to the connection between myself and the
        // characters.
        // This is why this anime is so sad that it achieve the maximum
        // score for an impact (weighted ofc)
        PADS(999, Emotion.CU)
        Cry(Emotion.CU)

        // The character development of Kousei Arima is connected to the
        // Personality Revolution (a result of SLN). This is why I also
        // feel hype when stuff happens. And I cried to that.
        // No PADS since it's overshadowed by the sad impact.
        Cry(Emotion.CP)

        // Also the anime itself without these historical events are still
        // very good. It's not just lucky

        // no memes because SLN era has no memes
        // it's just lIeN qUAn mOBiLe and dumb trendy shit

        FeatureMusic(VGMDB_Track(49046, 1))
        FeatureMusic(VGMDB_Track(49046, 18))

        Boredom(Boredom.Completed)
    }

    Franchise(VGMDB_Franchise(3345), "Shigatsu wa Kimi no Uso") {
        Include(MAL(23273))
        Include(VGMDB_Track(49046, 1))
        Include(VGMDB_Track(49046, 18))
    }
}
