package com.dah.nrs

fun GenerateBlock.Kano() {
    // le meme artist (kano) has a very distinctive voice,
    // making her literally the best singer in j-pop
    // her voice are soft and loli-like, but it can also
    // convey a lot of emotions
    // which is what a "kano impact" is
    fun EntryBlock.KanoImpact(score: Double, emotion: FactorScore = Emotion.CU): Impact {
        return NEI(score, emotion)
    }

    Album(VGMDB_Album(95369), "Bambino")
    Track(VGMDB_Track(95369, 1), "Hello / How are you", Kano, KoyamaHidekazu) {
        Music(0.6)
        KanoImpact(0.2)
    }

    // based
    Album(VGMDB_Album(37130), "Sukinano.")

    Track(VGMDB_Track(37130, 1), "Hello / How are you (mix)", Kano, KoyamaHidekazu, Scop) {
        Music(0.7)
        KanoImpact(0.25)
        RemixOf(VGMDB_Track(95369, 1))
    }

    Track(VGMDB_Track(37130, 2), "Utautai no Uta", Kano, KoyamaHidekazu, Scop) {
        Music(2.0)
        KanoImpact(0.3, Emotion.MP)
    }

    // the best kano song ever. period.
    Track(VGMDB_Track(37130, 3), "[It's not] World's end", Kano, KoyamaHidekazu, Scop) {
        Music(1.5)
        KanoImpact(1.0)
    }

    Track(VGMDB_Track(37130, 4), "\"Nee.\"", Kano, KoyamaHidekazu, keeno) {
        Music(0.5)
        KanoImpact(0.5)
    }

    Track(VGMDB_Track(37130, 5), "Asayake, Kimi no Uta.", Kano, KoyamaHidekazu, keeno) {
        Music(0.75)
        KanoImpact(0.15)
    }

    Track(VGMDB_Track(37130, 6), "Sakura no Zenya", Kano, KoyamaHidekazu, keeno) {
        Music(1.75)
        KanoImpact(0.3)
    }

    Album(VGMDB_Album(34411), "Aimai Bambina")
    Track(VGMDB_Track(34411, 6), "Interviewer", Kano) {
        Music(1.25)
        KanoImpact(0.3)
    }

    Track(VGMDB_Track(34411, 11), "Irony", Kano, Scop) {
        Music(0.75)
        KanoImpact(0.3)
    }

    Album(VGMDB_Album(42961), "Arumachi no Hakuchumu")
    Track(VGMDB_Track(42961, 6), "Mary Mary (album ver.)", Kano) {
        Music(1.25)
        KanoImpact(0.2, Emotion.MP)
    }

    Track(VGMDB_Track(42961, 9), "World on Color", Kano) {
        Music(1.75)
        KanoImpact(0.25, Emotion.MP)
    }

    Album(VGMDB_Album(49423), "Good Hello")
    Track(VGMDB_Track(49423, 1), "Good Night Everyone", Kano, KoyamaHidekazu) {
        Music(1.25)
        KanoImpact(0.3)
    }

    Track(VGMDB_Track(49423, 8), "decide", Kano, keeno) {
        Music(0.8)
        KanoImpact(0.4)
    }

    AlbumTrack(VGMDB_Album(51254), 1, "Stella-rium", Kano) {
        Music(1.5)
        KanoImpact(0.1, Emotion.MP)
    }

    AlbumTrack(VGMDB_Album(54307), 1, "Dear Brave", Kano) {
        Music(1.5)
        KanoImpact(0.1)
    }

    Album(VGMDB_Album(57564), "nowhere") {
        Include(VGMDB_Track(51254, 1))
        Include(VGMDB_Track(54307, 1))
    }

    Track(VGMDB_Track(57564, 1), "Prima Stella") {
        Music(1.5)
        KanoImpact(0.1)
    }

    Album(VGMDB_Album(73516), "one") {
        Include(VGMDB_Track(34411, 11))
    }

    Album(VGMDB_Album(89290), "three")

    Track(VGMDB_Track(89290, 6), "Chikyuu Saigo no Kokuhaku o", Kano) {
        Music(0.5)
        KanoImpact(0.1)

        // TODO: gate open chikyuu saigo, the last ayumu theme song
    }

    // from the album "Colorful Wonder Note", track number 8
    // and yes this is from osugame too
    Track("M-24", "Kimiiro Hanabi -album version-", Kano) {
        Music(1.5)
        KanoImpact(1.0, Emotion.CP)
    }

    // after this, almost all of kano's songs suck
    // (if kano sees this pls keep going on the
    // path you've chosen, don't mind me)
}
