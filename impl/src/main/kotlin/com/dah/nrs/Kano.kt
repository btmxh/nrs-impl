package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.Kano() {
    // le meme artist (kano) has a very distinctive voice,
    // making her literally the best singer in j-pop
    // her voice are soft and loli-like, but it can also
    // convey a lot of emotions
    // which is what a "kano impact" is
    // (it will be represented as an NEI/AEI)

    Entry {
        id = "M-VGMDB-AR-11666"
        title = "Kano" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-95369"
                title = "Bambino / Kano" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.2, 0.5)

                SubIDEntry("1") {
                    title = "ハロ/ハワユ" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:48") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.2)
                    NEI(0.1, Emotion.MP)
                    Remix("M-VGMDB-AL-37130-1")
                }
            }

            Entry {
                id = "M-VGMDB-AL-34411"
                title = "Aimai Bambina / Kano" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.35, 0.4)

                SubIDEntry("6") {
                    MusicConsumedProgress("4:27") // generated(fill_music_metadata.dart v0.1.1)
                    title = "インタビュア" // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.4)
                    NEI(0.15, Emotion.CU)
                }

                SubIDEntry("11") {
                    title = "アイロニ" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:10") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.175)
                    NEI(0.15, Emotion.CU)
                }
            }

            Entry {
                id = "M-VGMDB-AL-42961"
                title = "Aru Machi no Hakuchuumu / Kano" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.25, 0.5)

                Impact {
                    description = "Romance name"
                    score = vector {
                        set(Art.Language, 0.1)
                    }
                }

                SubIDEntry("6") {
                    title = "メリーメリー álbum ver." // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:35") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.4)
                    NEI(0.25, Emotion.MP)
                }

                SubIDEntry("9") {
                    MusicConsumedProgress("4:39") // generated(fill_music_metadata.dart v0.1.1)
                    title = "World on Color" // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.6)
                    NEI(0.2, Emotion.MP)
                    OsuSong(personal = 0.1, community = 0.0)
                }
            }

            Entry {
                id = "M-VGMDB-AL-49423"
                title = "Good Hello / Kano" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.55, 0.45)

                SubIDEntry("1") {
                    title = "グッドナイトエヴリワン" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("5:49") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.4)
                    NEI(0.2, Emotion.CU)
                }

                SubIDEntry("8") {
                    MusicConsumedProgress("5:54") // generated(fill_music_metadata.dart v0.1.1)
                    title = "decide" // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.2)
                    NEI(0.25, Emotion.CU)
                }
            }

            Entry {
                id = "M-VGMDB-AL-51254"
                title = "Stella-rium / Kano" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.5, 0.4)
                Visual(VisualKind.SemiAnimatedMV, 0.5, 0.3)

                SubIDEntry("1") {
                    MusicConsumedProgress("4:08") // generated(fill_music_metadata.dart v0.1.1)
                    title = "Stella-rium" // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.5)
                    NEI(0.5, Emotion.MP)
                }
            }

            Entry {
                id = "M-VGMDB-AL-54307"
                title = "Dear Brave / Kano" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.2, 0.6)
                Visual(VisualKind.AnimatedMV, 0.6, 0.4)

                SubIDEntry("1") {
                    title = "ディアブレイブ" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:19") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.5)
                    NEI(0.1, Emotion.CU)
                }
            }

            Entry {
                id = "M-VGMDB-AL-57564"
                title = "nowhere / Kano" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.4, 0.5)

                SubIDEntry("1") {
                    title = "Prima Stella" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:26") // generated(fill_music_metadata.dart v0.1.1)
                    Visual(VisualKind.SemiAnimatedMV, 0.5, 0.3)
                    Music(0.5)
                    NEI(0.1, Emotion.CU)
                }

                Contains("M-VGMDB-AL-51254-1")
                Contains("M-VGMDB-AL-54307-1")
                SubIDEntry("7") {
                    title = "Walk This Way!" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:08") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.4)
                    OsuSong(personal = 0.6, community = 0.3)
                }
            }

            Entry {
                id = "M-VGMDB-AL-73516"
                title = "one / Kano" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.4, 0.5)

                Contains("M-VGMDB-AL-34411-11")
            }

            Entry {
                id = "M-VGMDB-AL-89290"
                title = "three / Kano" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.4, 0.5)

                SubIDEntry("6") {
                    title = "地球最後の告白を" // generated(fill_music_metadata.dart v0.1.1)
                    // https://www.youtube.com/watch?v=paVYNlZ5Xuk
                    MusicConsumedProgress("4:33") // impl_overridden
                    Music(0.3)
                    NEI(0.1, Emotion.CU)

                    Remix("M-MAL-36631-6")
                }
            }

            Entry {
                // from the album "Colorful Wonder Note", track number 8
                // and yes this is from osugame too
                id = "M-20220130T032649"
                title = "Kimiiro Hanabi -album version-"

                // Length source: https://osu.ppy.sh/beatmapsets/514772#osu/1093352
                Music(0.6)
                MusicConsumedProgress("4:19") // impl_overridden
                NEI(0.5, Emotion.CP)

                // I HATE HIMENO SENA
                // I HATE HIMENO SENA
                // I HATE HIMENO SENA
                // I HATE HIMENO SENA
                // I HATE HIMENO SENA
                // https://github.com/ngoduyanh/nrs-impl-kt/discussions/298#discussioncomment-4410011
                Cry(Emotion.CU) {
                    contributors["M-20220130T032649"] = 0.65
                    contributors["V-VNDB-17516"] = 0.35
                }
            }

            Entry {
                // the best album of all time
                // literally the perfect combination of vocal and instrumental
                id = "M-VGMDB-AL-37130"
                title = "Suki na no. / Kano" // generated(fill_music_metadata.dart v0.1.1)

                // the album art is kano sitting with some animals
                // which is MP-based, and it's a pretty good contrast to
                // some songs from the album (like it's not world's end
                // or sakura no zenya), which are CU-based.
                Visual(VisualKind.AlbumArt, 0.4, 0.7)
                NEI(0.2, Emotion.MP to 0.6, Emotion.CU to 0.4)
                // crossfade thing: https://www.nicovideo.jp/watch/sm19702966
                Visual(VisualKind.AnimatedMV, 0.3, 0.65)

//        Impact {
//            description = "Album art"
//
//            meta("type", "NONSTD_album_art")
//
//            score = vector {
//                set(Art.Visual, 0.1)
//                set(Emotion.MP, 0.2)
//                set(Emotion.CU, 0.1)
//            }
//        }

                SubIDEntry("1") {
                    title = "ハロ/ハワユ" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:50") // generated(fill_music_metadata.dart v0.1.1)
                    // the original MV is for the mix version
                    // https://www.nicovideo.jp/watch/sm19687208
                    Visual(VisualKind.SemiAnimatedMV, 0.35, 0.6)
                    Music(0.25)
                    NEI(0.125, Emotion.MP)
                }

                SubIDEntry("2") {
                    title = "うたうたいのうた" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:39") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.8)
                    NEI(0.15, Emotion.MP)
                }

                // the best kano song ever. period.
                // also the fourth ayumu-era theme song
                SubIDEntry("3") {
                    MusicConsumedProgress("5:36") // generated(fill_music_metadata.dart v0.1.1)
                    title = "[It's not] World's end" // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.5)
                    NEI(0.5, Emotion.CU)
                }

                SubIDEntry("4") {
                    title = "「ねぇ。」" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("6:23") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.2)
                    NEI(0.25, Emotion.CU)
                }

                SubIDEntry("5") {
                    title = "朝焼け、君の唄。" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("5:08") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.2)
                    NEI(0.2, Emotion.MP)
                }

                SubIDEntry("6") {
                    title = "サクラノ前夜" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("6:00") // generated(fill_music_metadata.dart v0.1.1)
                    Visual(VisualKind.AnimatedMV, 0.35, 0.6)
                    Music(0.7)
                    NEI(0.25, Emotion.CU)
                }
            }
            // after this, almost all of kano's songs suck
            // (if kano sees this pls keep going on the
            // path you've chosen, don't mind me)

            // oh except for this, i forgor
            Entry {
                id = "M-20220317T064137-5"
                title = "Sore wa Kitto Natsudatta"

                Visual(VisualKind.AnimatedMV, 0.35, 0.7)
                // 210 bpm spaced bursts
                OsuSong(personal = 0.5)

                // Length source: https://www.youtube.com/watch?v=ZkDEkUf6jlg
                Music(0.5)
                MusicConsumedProgress("3:29") // impl_overridden
            }
        }

        Entry {
            id = "M-20221202T204728"
            title = "Sukisuki Zecchoushou"
            ValidatorSuppress("dah-entry-no-consumed")
            Music(0.4)
            OsuSong(personal = 0.6, community = 0.4)
            // Length source: https://osu.ppy.sh/beatmapsets/484532
            MusicConsumedProgress("3:33")
        }

        Entry {
            id = "M-20221202T203758"
            title = "Sayonara, Adam to Eve"
            ValidatorSuppress("dah-entry-no-consumed")
            Music(0.55)
            OsuSong(personal = 0.7, community = 0.0)
            // Length source: https://osu.ppy.sh/beatmapsets/981282
            MusicConsumedProgress("4:17")
        }

        Entry {
            id = "M-20221202T202421"
            title = "Natsu no Owari, Koi no Hajimari (Kano)"
            ValidatorSuppress("dah-entry-no-consumed")
            Music(0.65)
            OsuSong(personal = 0.0, community = 0.0)
            // Length source: https://www.youtube.com/watch?v=j4LoBrhN5rM
            MusicConsumedProgress("4:08")
        }

        // kano-era
        Meme(0.8, numDays("2020-11-01", "2021-04-01"))
    }
}
