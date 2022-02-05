package com.dah.nrs

fun GenerateBlock.Metal() {
    AlbumTrack(VGMDB_Album(97601), 1, "Truths, Ironies, The Secret Lyrics") {
        Music(1.0)
        Impact("""this song is a cover of the famous is she owen u.n
        i was strongly impressed when i listened to the covers by
        cool&create silverforest s-sync arts and sound holic
        but its hard to rearrange cuz its melody's so complex
        one more day before you go one more night everybody dance it away
        swinging arms jumping bodies dont stop even if night's out
        (stream part)
        i wrote this song in a hurry
        i know this lyric is funny
        i wish at least one of you like this song thats all""".trimIndent(), Art.Language, 0.2)
    }

    Album(VGMDB_Album(43320), "Stories That Last Through The Sleepless Nights") {
        Include(VGMDB_Track(97601, 1))
        // this and HAG - Shoujotachi no Owaranai Yoru (lit. Everlasting Night of Teenage Girls)
        // somewhat showed an image of "happy nights" in Ayumu-era
        Impact("Ayumu-era Romance Image", Art.Language, 0.1)
    }

    Track(VGMDB_Album(43320), "Wandering, Never Wondering (There Exists A Shade)", ForegroundEclipse) {
        Music(0.7)
    }

    Track(VGMDB_Album(43320), "From Under Cover (Caught Up In A Love Song)", ForegroundEclipse) {
        Music(1.0)
    }

    // the second ayumu-era theme song
    Track(VGMDB_Album(43320), "Storytellers", ForegroundEclipse) {
        Music(1.5)
    }
}