package com.dah.nrs

fun GenerateBlock.NagiAsu() {
    AlbumTrack(VGMDB_Album(41278), 1, "lull ~Soshite Bokura wa~", Ray) {
        Music(0.2)
    }

    AlbumTrack(VGMDB_Album(41280), 1, "Aqua Terrarium", YanagiNagi) {
        Music(0.2)
    }

    AlbumTrack(VGMDB_Album(42900), 1, "ebb and flow", Ray) {
        Music(1.0)
    }

    Track(VGMDB_Track(42900, 3), "nagi", Ray) {
        Music(0.4)
    }

    AlbumTrack(VGMDB_Album(43164), 1, "Aqua Terrarium", YanagiNagi) {
        Music(0.2)
    }

    Album(VGMDB_Album(45187), "NAGI NO ASUKARA CHARACTER SONG 3")
    Track(VGMDB_Track(45187, 1), "ripple ~my first love~", KomatsuMikako) {
        Music(1.5)
    }

    Anime("Nagi no Asu kara", MAL = 16067) {
        bestGirl = "Shiodome Miuna"
        // poor best girl
        PADS(2, Emotion.CU)

        WaifuUnknownPeriod("Shiodome Miuna", 90)

        Meme(0.7, Meme.M3Weeks_1Month)

        FeatureMusic(VGMDB_Track(41278, 1))
        FeatureMusic(VGMDB_Track(41280, 1))
        FeatureMusic(VGMDB_Track(42900, 1))
        FeatureMusic(VGMDB_Track(42900, 3))
        FeatureMusic(VGMDB_Track(43164, 1))

        Boredom(Boredom.Completed)

        // a character song idk
        // FeatureMusic(VGMDB_Track(45187, 1))
    }
}
