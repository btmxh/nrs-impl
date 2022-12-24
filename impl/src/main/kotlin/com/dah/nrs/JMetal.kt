package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.dsl.vector
import com.dah.nrs.exts.*

fun DSLScope.JMetal() {
    Entry {
        id = "M-VGMDB-AR-8482"
        title = "Foreground Eclipse" // generated(fill_music_metadata.dart v0.1.1)

        Entry {
            id = "M-VGMDB-AL-97601"
            title = "Truths, Ironies, The Secret Lyrics" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.15, 0.3)

            SubIDEntry("1") {
                MusicConsumedProgress("3:37") // generated(fill_music_metadata.dart v0.1.1)
                title = "Truths, Ironies, The Secret Lyrics" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.3)
                Impact {
                    description = """this song is a cover of the famous is she owen u.n
                    i was strongly impressed when i listened to the covers by
                    cool&create silverforest s-sync arts and sound holic
                    but its hard to rearrange cuz its melody's so complex
                    one more day before you go one more night everybody dance it away
                    swinging arms jumping bodies dont stop even if night's out
                    (stream part)
                    i wrote this song in a hurry
                    i know this lyric is funny
                    i wish at least one of you like this song thats all""".trimIndent()
                    score = vector {
                        set(Art.Language, 0.2)
                    }
                }
            }
        }

        // this and HAG - Shoujotachi no Owaranai Yoru (lit. Everlasting Night of Teenage Girls)
        // somewhat reflect an image of "happy nights" in Ayumu-era
        Impact {
            description = "Ayumu-era Romance Image"
            score = vector {
                set(Art.Language, 0.1)
            }

            contributors["M-VGMDB-AL-43320"] = 0.4
            contributors["M-20220818T163913-2"] = 0.6
        }

        Entry {
            id = "M-VGMDB-AL-43320"
            title = "Stories That Last Through The Sleepless Nights" // generated(fill_music_metadata.dart v0.1.1)

            Contains("M-VGMDB-AL-97601-1")
            Visual(VisualKind.AlbumArt, 0.25, 0.4)

            SubIDEntry("4") {
                MusicConsumedProgress("4:33") // generated(fill_music_metadata.dart v0.1.1)
                title = "Wandering, Never Wondering (There Exists A Shade)" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.25)
            }

            SubIDEntry("7") {
                MusicConsumedProgress("3:27") // generated(fill_music_metadata.dart v0.1.1)
                title = "From Under Cover (Caught Up In A Love Song)" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.4)
            }

            // the second ayumu-era theme song
            SubIDEntry("8") {
                MusicConsumedProgress("3:57") // generated(fill_music_metadata.dart v0.1.1)
                title = "Storytellers" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.5)

                KoikakeNEI(0.8, 0.75, Emotion.AU to 0.5, Emotion.MP to 0.5)
            }
        }
    }

    Entry {
        id = "M-20221224T220452"
        title = "Release Hallucination"

        Entry {
            id = "M-VGMDB-AL-80229"
            title = "Chronostasis" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.2, 0.4)

            SubIDEntry("1") {
                title = "Chronostasis" // generated(fill_music_metadata.dart v0.1.1)
                // Length source: https://open.spotify.com/album/4i78h7toisyjWPGXwXmWr9
                MusicConsumedProgress("6:22") // impl_overridden
                Music(0.4)
                OsuSong(0.0, 0.3)
            }
        }

        Entry {
            id = "M-20221224T220636"
            title = "Imperfection of Imaginary Number"

            SubIDEntry("3") {
                title = "I.F."
                // Length source: https://open.spotify.com/album/71Im3HkxyIk8OypYiE9aBR
                MusicConsumedProgress("6:58")
                Music(0.5)
                OsuSong(0.1, 0.4)
            }
        }
    }
}
