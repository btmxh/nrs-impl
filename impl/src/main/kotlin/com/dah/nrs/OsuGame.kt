package com.dah.nrs

fun GenerateBlock.OsuGame() {
    Entry {
        id = "M-VGMDB-AR-12225"
        title = "xi"

        Entry {
            id = "M-VGMDB-AL-34269"
            title = "Parousia"

            // the third ayumu-era theme song
            SubIDEntry("7", "Ascension to Heaven") {
                Music(4.0)
            }

            SubIDEntry("12", "FREEDOM DiVE↓") {
                Music(0.6)
                // i'm not overstreaming 222 bpm
                NEI(2.0, Emotion.AP)
                OsuSong(personal = 2.0, community = 8.0)
            }
        }
    }
}