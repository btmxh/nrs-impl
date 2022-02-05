package com.dah.nrs

fun GenerateBlock.Vocaloid() {
    // there is no vgmdb entry for this
    // but there is a mal one kek
    Album("M-MAL-36631", "Pandora Voxx Complete")
    Track("M-MAL-36631-6", "Chikyuu Saigo no Kokuhaku wo", kemu, GUMI) {
        // the legendary ending song of Ayumu-era

        // for some reason, this almost made me cry
        AEI(2.25, Emotion.CU)

        Music(1.25)
    }

    Track("M-41", "Chikyuu Saigo no Kokuhaku wo", kemu, yuiko) {
        RemixOf("M-MAL-36631-6")

        // yuiko version is probably the best, music-wise
        Music(1.75)
    }

    Track("M-43", "Chikyuu Saigo no Kokuhaku wo", kemu, HAG) {
        RemixOf("M-MAL-36631-6")

        // quite good, but they didn't keep the orig. inst.
        Music(1.5)
    }
}