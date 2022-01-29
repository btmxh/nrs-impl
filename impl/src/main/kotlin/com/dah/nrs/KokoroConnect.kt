package com.dah.nrs

fun GenerateBlock.KokoroConnect() {
    Album(VGMDB_Album(35431), """Kokoro Connect Original Soundtrack 2 Hito Random & Kizu Random Opening Theme Song "Kimochi Signal" / Kizu Random Ending Theme Song "Cry out"""")

    Track(VGMDB_Track(35431, 1), "Kimochi Signal") {
        Music(0.2)
    }

    val KokoroConnectDrama = AEI(3.0, Emotion.CU)
    val KKCComfyCompoly = NEI(0.2, Emotion.MP)
    val KKCPlot = NEI(0.5, Emotion.AP)

    Anime("Kokoro Connect", MAL = 11887) {
        bestGirl = "Nagase Iori"

        Impact(KokoroConnectDrama)
        Impact(KKCComfyCompoly)
        Impact(KKCPlot)
        Boredom(Boredom.Completed)

        FeatureMusic(VGMDB_Track(35431, 1))
    }

    Anime("Kokoro Connect: Michi Random", MAL = 16001) {
        bestGirl = "Nagase Iori"

        Impact(KokoroConnectDrama)
        Impact(KKCComfyCompoly)
        Impact(KKCPlot)
        Boredom(Boredom.Completed)
    }

    Franchise(VGMDB_Franchise(3483), "Kokoro Connect") {
        Include(MAL(11887))
        Include(MAL(16001))
        Include(VGMDB_Track(35431, 1))
    }
}
