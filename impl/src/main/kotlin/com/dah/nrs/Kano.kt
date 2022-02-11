package com.dah.nrs

import kotlin.math.E

fun GenerateBlock.Kano() {
    // le meme artist (kano) has a very distinctive voice,
    // making her literally the best singer in j-pop
    // her voice are soft and loli-like, but it can also
    // convey a lot of emotions
    // which is what a "kano impact" is
    // (it will be represented as an NEI/AEI)

    Entry {
        id = "M-VGMDB-AR-11666"
        title = "Kano"

        Contains("M-VGMDB-AL-37130-1", 0.7)
        Contains("M-VGMDB-AL-37130-2", 0.8)
        Contains("M-VGMDB-AL-37130-3", 0.85)
        Contains("M-VGMDB-AL-37130-4", 0.8)
        Contains("M-VGMDB-AL-37130-5", 0.8)
        Contains("M-VGMDB-AL-37130-6", 0.8)

        Contains(ImageVocalContainFactor) {
            Entry {
                id = "M-VGMDB-AL-95369"
                title = "Bambino"

                SubIDEntry("1", "Hello / How are you") {
                    Music(2.0)
                    NEI(0.2, Emotion.MP)
                    Remix("M-VGMDB-AL-37130-1")
                }
            }

            Entry {
                id = "M-VGMDB-AL-34411"
                title = "Aimai Bambina"

                SubIDEntry("6", "Interviewer") {
                    Music(4.0)
                    NEI(0.3, Emotion.CU)
                }

                SubIDEntry("11", "Irony") {
                    Music(1.75)
                    NEI(0.3, Emotion.CU)
                }
            }

            Entry {
                id = "M-VGMDB-AL-42961"
                title = "Arumachi no Hakuchumu"

                Impact {
                    description = "Romance name"
                    score = vector {
                        set(Art.Language, 0.1)
                    }
                }

                SubIDEntry("6", "Mary Mary (album ver.)") {
                    Music(4.0)
                    NEI(0.5, Emotion.MP)
                }

                SubIDEntry("9", "World on Color") {
                    Music(6.0)
                    NEI(0.4, Emotion.MP)
                }
            }

            Entry {
                id = "M-VGMDB-AL-49423"
                title = "Good Hello"

                SubIDEntry("1", "Good Night Everyone") {
                    Music(4.0)
                    NEI(0.4, Emotion.CU)
                }

                SubIDEntry("8", "decide") {
                    Music(2.0)
                    NEI(0.5, Emotion.CU)
                }
            }

            Entry {
                id = "M-VGMDB-AL-51254"
                title = "Stella-rium"

                SubIDEntry("1") {
                    Music(5.0)
                    NEI(0.1, Emotion.MP)
                }
            }

            Entry {
                id = "M-VGMDB-AL-54307"
                title = "Dear Brave"

                SubIDEntry("1") {
                    Music(5.0)
                    NEI(0.2, Emotion.CU)
                }
            }

            Entry {
                id = "M-VGMDB-AL-57564"
                title = "nowhere"

                SubIDEntry("1", "Prima Stella") {
                    Music(5.0)
                    NEI(0.2, Emotion.CU)
                }

                Contains("M-VGMDB-AL-51254-1")
                Contains("M-VGMDB-AL-54307-1")
            }

            Entry {
                id = "M-VGMDB-AL-73516"
                title = "one"

                Contains("M-VGMDB-AL-34411-11")
            }

            Entry {
                id = "M-VGMDB-AL-89290"
                title = "three"

                SubIDEntry("6", "Chikyuu Saigo no Kokuhaku o") {
                    Music(3.5)
                    NEI(0.2, Emotion.CU)
                }
            }

            Entry {
                // from the album "Colorful Wonder Note", track number 8
                // and yes this is from osugame too
                id = "M-24"
                title = "Kimiiro Hanabi -album version-"

                Music(6.0)
                NEI(1.0, Emotion.CP)
            }
        }

        // kano-era
        Meme(0.9, Meme.MMoreThan3Months)
    }

    Entry {
        // the best album of all time
        // literally the perfect combination of vocal and instrumental
        id = "M-VGMDB-AL-37130"
        title = "Sukinano."

        Impact {
            description = "Album art"

            meta("type", "NONSTD_album_art")

            score = vector {
                set(Art.Illustration, 0.1)
                // the album art is kano sitting with some animals
                // which is MP-based, and it's a pretty good contrast to
                // some songs from the album (like it's not world's end
                // or sakura no zenya), which are CU-based.
                set(Emotion.MP, 0.2)
                set(Emotion.CU, 0.1)
            }

            SubIDEntry("1", "Hello / How are you (mix)") {
                Music(2.5)
                NEI(0.25, Emotion.MP)
            }

            SubIDEntry("2", "Utautai no Uta") {
                Music(8.0)
                NEI(0.3, Emotion.MP)
            }

            // the best kano song ever. period.
            // also the fourth ayumu-era theme song
            SubIDEntry("3", "[It's not] World's end") {
                Music(5.0)
                NEI(1.0, Emotion.CU)
            }

            SubIDEntry("4", "\"Nee.\"") {
                Music(2.0)
                NEI(0.5, Emotion.CU)
            }

            SubIDEntry("5", "Asayake, Kimi no Uta.") {
                Music(2.0)
                NEI(0.4, Emotion.MP)
            }

            SubIDEntry("6", "Sakura no Zenya") {
                Music(7.0)
                NEI(0.5, Emotion.CU)
            }
        }
    }

//    Album(VGMDB_Album(49423), "Good Hello")
//    Track(VGMDB_Track(49423, 1), "Good Night Everyone", Kano, KoyamaHidekazu) {
//        Music(1.25)
//        KanoImpact(0.3)
//    }
//
//    Track(VGMDB_Track(49423, 8), "decide", Kano, keeno) {
//        Music(0.8)
//        KanoImpact(0.4)
//    }
//
//    AlbumTrack(VGMDB_Album(51254), 1, "Stella-rium", Kano) {
//        Music(1.5)
//        KanoImpact(0.1, Emotion.MP)
//    }
//
//    AlbumTrack(VGMDB_Album(54307), 1, "Dear Brave", Kano) {
//        Music(1.5)
//        KanoImpact(0.1)
//    }
//
//    Album(VGMDB_Album(57564), "nowhere") {
//        Include(VGMDB_Track(51254, 1))
//        Include(VGMDB_Track(54307, 1))
//    }
//
//    Track(VGMDB_Track(57564, 1), "Prima Stella") {
//        Music(1.5)
//        KanoImpact(0.1)
//    }
//
//    Album(VGMDB_Album(73516), "one") {
//        Include(VGMDB_Track(34411, 11))
//    }
//
//    Album(VGMDB_Album(89290), "three")
//
//    Track(VGMDB_Track(89290, 6), "Chikyuu Saigo no Kokuhaku o", Kano) {
//        Music(0.5)
//        KanoImpact(0.1)
//        RemixOf("M-MAL-36631-6")
//    }
//
//    // from the album "Colorful Wonder Note", track number 8
//    // and yes this is from osugame too
//    Track("M-24", "Kimiiro Hanabi -album version-", Kano) {
//        Music(1.5)
//        KanoImpact(1.0, Emotion.CP)
//    }

    // after this, almost all of kano's songs suck
    // (if kano sees this pls keep going on the
    // path you've chosen, don't mind me)
}
