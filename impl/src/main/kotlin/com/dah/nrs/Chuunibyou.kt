package com.dah.nrs

fun GenerateBlock.Chuunibyou() {
    AlbumTrack(VGMDB_Album(42762), 1, "VOICE", ZAQ) {
        Music(0.1)

        Impact("osu! beatmap", Emotion.AP, 0.1)
    }

    Anime("Chuunibyou demo Koi ga Shitai!", MAL = 14741) {
        bestGirl = "Nibutani Shinka"
        // idk why
        // this is taken from NRS1
        Meme(0.15, Meme.M1_3Days)
        // this made me laugh my ass off
        NEI(1.0, Emotion.AP)
        Boredom(Boredom.Completed)
    }

    Anime("Chuunibyou demo Koi ga Shitai! Ren", MAL = 18671) {
        bestGirl = "Nibutani Shinka"
        // this made me laugh my ass off
        // but s2 has less comedy than s1
        // because le funny dead ppl pink-haired girl
        NEI(0.75, Emotion.AP)
        // Shichimiya dead people almost made me cry
        // YouTube link: https://www.youtube.com/watch?v=vFjJ6skYoxI
        AEI(3.0, Emotion.CU)
        // Shichimiya memes
        Meme(0.4, Meme.M1_2Weeks)
        Boredom(Boredom.Completed)
    }

    Anime("Chuunibyou demo Koi ga Shitai! Movie: Take On Me", MAL = 35608) {
        bestGirl = "Nibutani Shinka"
        Boredom(Boredom.Completed)
        // movie is funny, but still less content
        // than s1 and s2
        NEI(0.5, Emotion.AP)
    }

    Franchise(VGMDB_Franchise(2330), "Chuunibyou demo Koi ga Shitai!") {
        Include(MAL(14741))
        Include(MAL(18671))
        Include(MAL(35608))
        Include(VGMDB_Track(42762, 1))
    }
}
