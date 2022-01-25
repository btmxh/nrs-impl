package com.dah.nrs

fun GenerateBlock.SoraMethod() {
    AlbumTrack(VGMDB_Album(47402), 1, "Stargazer") { // by Larvel Stage Planning
        Music(0.8)
    }

    AlbumTrack(VGMDB_Album(47403), 1, "Hoshikuzu no Interlude", fhana) {
        Music(0.8)
    }

    Anime("Sora no Method", MAL = 23209) {
        // Drama in this anime is executed pretty well.
        AEI(2.5, Emotion.CU)

        // beasttrollminecraft
        Meme(0.3, Meme.M4_7Days)


        bestGirl = "Komiya Nonoka"

        // First anime to (be able to) use OP/ED visual + music to strengthen the sadness.
        Impact("OP/ED visual chemistry", Emotion.CU, 1.0)

        // OP/ED very good too.
        FeatureMusic(VGMDB_Track(47402, 1))
        FeatureMusic(VGMDB_Track(47403, 1))

        Boredom(Boredom.Completed)
    }
}
