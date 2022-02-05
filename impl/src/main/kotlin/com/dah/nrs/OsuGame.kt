package com.dah.nrs

fun GenerateBlock.OsuGame() {
    Album(VGMDB_Album(34269), "Parousia")
    Track(VGMDB_Track(34269, 12), "FREEDOM DiVE↓", xi) {
        Music(0.6)
        Impact("i'm not overstreaming 222 bpm", Emotion.AP, 0.1)
        Impact("Legendary osu! beatmap", Emotion.AP, 0.4)
    }

    // the third ayumu-era theme song
    Track(VGMDB_Track(34269, 7), "Ascension to Heaven", xi) {
        Music(0.8)
    }
}