package com.dah.nrs

fun GenerateBlock.Oregairu() {
    AlbumTrack(VGMDB_Album(37932), 1, "Yukitoki", YanagiNagi) {
        Music(0.6)
    }

    AlbumTrack(VGMDB_Album(51516), 1, "Harumodoki", YanagiNagi) {
        Music(0.8)
    }

    AlbumTrack(VGMDB_Album(96288), 1, "Megumi no Ame", YanagiNagi) {
        Music(0.9)
    }

    val HelloAloneMusic = Music(0.7)

    AlbumTrack(VGMDB_Album(37999), 1, "Hello Alone", HayamiSaori, ToyamaNao) {
        Impact(HelloAloneMusic)
        Impact("Sadge", Emotion.CU, 0.5)
    }

    Track(VGMDB_Track(37999, 2), "Hello Alone -Yui Ballade-", ToyamaNao) {
        Impact(HelloAloneMusic)
        Impact("Sadge", Emotion.CU, 0.5)
    }

    val EverydayWorldMusic = Music(0.6)

    AlbumTrack(VGMDB_Album(51394), 1, "Everyday World", HayamiSaori, ToyamaNao) {
        Impact(EverydayWorldMusic)
    }

    Track(VGMDB_Track(51394, 3), "Everyday World -Ballade Arrange- Yui Solo Ver.", ToyamaNao) {
        Impact(EverydayWorldMusic)
        Impact("Sadge", Emotion.CU, 0.5)
    }

    AlbumTrack(VGMDB_Album(96290), 1, "Diamond no Jundo", HayamiSaori, ToyamaNao) {
        Music(0.6)
    }

    // Oregairu has a pretty long meme reign
    // but shared with Saekano and K-On!
    val OregairuMeme = Meme(0.7, Meme.MMoreThan3Months)

    // Inspired Hikism-Yukism
    val HikismYukism = Info(Information.Politics)

    Anime("Yahari Ore no Seishun Love Comedy wa Machigatteiru.", MAL = 14813) {
        // Brain's Base drew Yukino better than Yui
        bestGirl = "Yukinoshita Yukino"

        Impact(HikismYukism)
        Impact(OregairuMeme)
        NEI(0.7, Emotion.AP)

        FeatureMusic(VGMDB_Track(37932, 1))
        FeatureMusic(VGMDB_Track(37999, 2))

        Boredom(Boredom.Completed)
    }

    Anime("Yahari Ore no Seishun Love Comedy wa Machigatteiru. Zoku", MAL = 23847) {
        // feel. drew Yui better
        bestGirl = "Yuigahama Yui"

        Impact(HikismYukism)
        Impact(OregairuMeme)
        NEI(0.4, Emotion.AP)

        // Oregairu S2 has a lot of drama that I don't even
        // understand. But it's pretty good ngl.
        AEI(3.0, Emotion.CU)

        // The Yui Depression, when I realize that the VSCC
        // (Volunteer Service Club Compoly) is not as good as
        // I thought to be.
        // Read here for more details:
        // http://yaharianalysis.x10host.com/
        // (esp. http://yaharianalysis.x10host.com/parts/Yui/index.php)
        PADS(999, Emotion.CU)

        // VSCC is pretty comfy (before Yui Depression)
        NEI(1.2, Emotion.MP)

        FeatureMusic(VGMDB_Track(51516, 1))
        FeatureMusic(VGMDB_Track(51394, 1))
        FeatureMusic(VGMDB_Track(51394, 3))

        Boredom(Boredom.Completed)
    }

    Anime("Yahari Ore no Seishun Love Comedy wa Machigatteiru. Kan", MAL = 39547) {
        bestGirl = "Yuigahama Yui"
        seasonal = true

        Meme(0.2, Meme.M1_3Days)

        // Yui dead people arc was kinda good
        // but Oregairu is just dead
        // you can't do much about it
        AEI(2.4, Emotion.CU)
        NEI(0.2, Emotion.AP)

        // killed by lapis re lights lmao xd
        KilledBy(MAL(37587))

        FeatureMusic(VGMDB_Track(96288, 1))
        FeatureMusic(VGMDB_Track(96290, 1))

        Boredom(Boredom.Completed)
    }

    Franchise(VGMDB_Franchise(3274), "Yahari Ore no Seishun Love Comedy wa Machigatteiru.") {
        Include(MAL(14813))
        Include(MAL(23847))
        Include(MAL(39547))
        Include(VGMDB_Track(37932, 1))
        Include(VGMDB_Track(37999, 2))
        Include(VGMDB_Track(51516, 1))
        Include(VGMDB_Track(51394, 1))
        Include(VGMDB_Track(51394, 3))
        Include(VGMDB_Track(96288, 1))
        Include(VGMDB_Track(96290, 1))
    }
}
