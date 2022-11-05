package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.CommonArtists() {
    Entry {
        id = "M-1"
        title = "Asterisk"
        ValidatorSuppress("dah-entry-no-consumed")

        Contains("M-35", 1.0 / 3)
        Contains("M-10", 0.5)
        Contains("M-22", 0.5)
    }

    Entry {
        id = "M-34"
        title = "Rakakun"
        ValidatorSuppress("dah-entry-no-consumed")

        Contains("M-35", 1.0 / 3)
    }

    Entry {
        id = "M-VGMDB-AR-15361"
        title = "Inori Minase" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-9", 1.0 / 5)
        Contains("M-44", 1.0 / 4)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-54418-1")
            Contains("M-VGMDB-AL-55364-3")

            //sora yori group
            Contains(1.0 / 4.0) {
                Contains("M-VGMDB-AL-73544")
            }

            Contains("M-VGMDB-AL-82284", 1.0 / 5.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-15350"
        title = "M·A·O" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-44", 1.0 / 4)
        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-63666")
        }
    }

    Entry {
        id = "M-VGMDB-AR-16380"
        title = "Rie Takahashi" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-44", 1.0 / 4)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-53719-1")
        }
    }

    Entry {
        id = "M-VGMDB-AR-15998"
        title = "Ari Ozawa" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-13", 1.0 / 2)
        Contains("M-44", 1.0 / 4)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-53719-1", 0.5)
            Contains("M-VGMDB-AL-82983-5")
        }
    }

    Entry {
        id = "M-VGMDB-AR-12726"
        title = "Ayane Sakura" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-9", 1.0 / 5)
        Contains("M-18", 1.0 / 4)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-82284", 1.0 / 5.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-13211"
        title = "Risa Taneda" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-9", 1.0 / 5)
    }

    Entry {
        id = "M-VGMDB-AR-8874"
        title = "Satomi Sato" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-9", 1.0 / 5)
    }

    Entry {
        id = "M-VGMDB-AR-13289"
        title = "Maaya Uchida" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-9", 1.0 / 5)
    }

    Entry {
        id = "M-VGMDB-AR-13857"
        title = "fhána" // generated(fill_music_metadata.dart v0.1.1)

        // band, so no Contains(ImageVocalContainFactor) block
        Contains("M-VGMDB-AL-62516")
        Contains("M-VGMDB-AL-110219")

        Entry {
            id = "M-VGMDB-AL-47403"
            title = "Hoshikuzu no Interlude / fhána" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.6, 0.3)

            SubIDEntry("1") {
                title = "Hoshikuzu no Interlude" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("6:27") // generated(fill_music_metadata.dart v0.1.1)
                Music(0.3)
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-25289"
        title = "Hidekazu Koyama" // generated(fill_music_metadata.dart v0.1.1)
        // aka the god nanou

        Contains("M-VGMDB-AL-37130-1", 0.1)
        Contains("M-VGMDB-AL-37130-2", 0.1)
        Contains("M-VGMDB-AL-37130-3", 0.05)
        Contains("M-VGMDB-AL-37130-4", 0.1)
        Contains("M-VGMDB-AL-37130-5", 0.1)
        Contains("M-VGMDB-AL-37130-6", 0.1)

        Contains("M-VGMDB-AL-49423-1", 0.2)
    }

    Entry {
        id = "M-VGMDB-AR-15119"
        title = "Scop" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-VGMDB-AL-37130-1", MusicInstContainFactor / 3.0)
        Contains("M-VGMDB-AL-37130-2", MusicInstContainFactor / 3.0)
        Contains("M-VGMDB-AL-37130-3", MusicInstContainFactor / 3.0)

        Contains("M-VGMDB-AL-34411-11", MusicInstContainFactor)
    }

    Entry {
        id = "M-VGMDB-AR-15120"
        title = "keeno" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-VGMDB-AL-37130-4", MusicInstContainFactor / 3.0)
        Contains("M-VGMDB-AL-37130-5", MusicInstContainFactor / 3.0)
        Contains("M-VGMDB-AL-37130-6", MusicInstContainFactor / 3.0)

        Contains("M-VGMDB-AL-49423-8", 0.2)

        Contains("M-VGMDB-AL-78339-2", 0.1)
    }

    Entry {
        id = "M-VGMDB-AR-17551"
        title = "Shuka Saito" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-97692")
        }
    }

    Entry {
        id = "M-VGMDB-AR-29323"
        title = "Kaori Maeda" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-VGMDB-AR-29922", NijiOldGirlContainFactor)
        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-99272-3")
        }
    }

    Entry {
        id = "M-VGMDB-AR-29640"
        title = "Aguri Onishi" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-VGMDB-AR-29922", NijiOldGirlContainFactor)
        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-80802-2")
            Contains("M-VGMDB-AL-87198-1")
            Contains("M-VGMDB-AL-99272-1")
            Contains("M-VGMDB-AL-112929-2")
        }
    }

    Entry {
        id = "M-VGMDB-AR-27779"
        title = "Tomori Kusunoki" // generated(fill_music_metadata.dart v0.1.1)
        // the prima doll destroyer
        // also that isekai anime destroyer too lmfaooooo

        Contains("M-VGMDB-AR-29922", NijiOldGirlContainFactor)
        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-80802-8")
            Contains("M-VGMDB-AL-87198-7")
            Contains("M-VGMDB-AL-99272-7")
        }
    }

    Entry {
        id = "M-VGMDB-AR-26954"
        title = "Chiemi Tanaka" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-VGMDB-AR-29922", NijiOldGirlContainFactor)
        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-80802-10")
        }
    }

    Entry {
        id = "M-VGMDB-AR-16469"
        title = "TrySail" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-69147"
                title = "TAILWIND / TrySail" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.1, 0.3)

                SubIDEntry("11") {
                    title = "かかわり" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:25") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.6)
                }
            }

            Contains("M-VGMDB-AL-89431")
            Contains("M-VGMDB-AL-95029")

            // 765 MILLION ALLSTARS
            Contains("M-VGMDB-AR-32295", 3.0 / 51.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-11829"
        title = "ClariS" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-23391")
            Contains("M-VGMDB-AL-41292")
            Contains("M-VGMDB-AL-89431")

            // colorful remixes
            Contains(0.5) {
                Contains("M-7")
                Contains("M-8")
            }

            Entry {
                id = "M-VGMDB-AL-23391"
                title = "Connect / ClariS" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.35, 0.6)
                SubIDEntry("1") {
                    title = "Connect" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:32") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.3)
                }
            }

            Entry {
                id = "M-VGMDB-AL-41292"
                title = "Colorful / ClariS" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.1, 0.2)
                SubIDEntry("1") {
                    MusicConsumedProgress("4:30") // generated(fill_music_metadata.dart v0.1.1)
                    title = "カラフル" // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.5)

                    Remix("M-7")
                    Remix("M-8")
                }
            }

            Entry {
                id = "M-VGMDB-AL-89431"
                title = "Signal / ClariS" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.1, 0.2)
                SubIDEntry("1") {
                    title = "シグナル" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("3:43") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.7)
                }
            }

            Entry {
                id = "M-VGMDB-AL-77471"
                title = "CheerS / ClariS" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.1, 0.4)

                SubIDEntry("1") {
                    MusicConsumedProgress("4:02") // generated(fill_music_metadata.dart v0.1.1)
                    title = "CheerS" // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.4)
                    OsuSong(personal = 0.4, community = 0.0)
                }
            }
        }
    }

    Entry {
        id = "M-6"
        title = "tamame"
        ValidatorSuppress("dah-entry-no-consumed")

        Contains(0.5) {
            Entry {
                id = "M-8"
                title = "Colorful (tamame's apostate remix)"

                // Length source: https://osu.ppy.sh/beatmapsets/866938#osu/1812393
                MusicConsumedProgress("5:21") // impl_overridden
                Music(0.65)
            }

            Entry {
                id = "M-47"
                title = "Tamame - Ebb and Flow (5 years after remix)"

                // Length source: https://osu.ppy.sh/beatmapsets/163756#osu/398882
                MusicConsumedProgress("6:19") // impl_overridden
                Music(0.3)
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-13097"
        title = "Ray" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-41278"
                title = "lull ~Soshite Bokura wa~ / Ray" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.15, 0.35)

                SubIDEntry("1") {
                    MusicConsumedProgress("4:56") // generated(fill_music_metadata.dart v0.1.1)
                    title = "lull ~Soshite Bokura wa~" // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.075)
                }
            }

            Entry {
                id = "M-VGMDB-AL-42900"
                title = "ebb and flow / Ray" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.15, 0.45)

                SubIDEntry("1") {
                    MusicConsumedProgress("4:17") // generated(fill_music_metadata.dart v0.1.1)
                    title = "ebb and flow" // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.35)
                    Remix("M-47")
                }

                SubIDEntry("3") {
                    MusicConsumedProgress("4:40") // generated(fill_music_metadata.dart v0.1.1)
                    title = "nagi" // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.12)
                }
            }

            Contains(0.5) {
                Contains("M-47")
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-5524"
        title = "yanaginagi" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-41280"
                title = "Aqua Terrarium / yanaginagi" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.175, 0.45)

                SubIDEntry("1") {
                    title = "アクアテラリウム" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:58") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.075)
                }
            }

            Entry {
                id = "M-VGMDB-AL-43164"
                title = "Mitsuba no Musubime / yanaginagi" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.1, 0.45)

                SubIDEntry("1") {
                    MusicConsumedProgress("4:56") // generated(fill_music_metadata.dart v0.1.1)
                    title = "Mitsuba no Musubime" // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.075)
                }
            }

            Entry {
                id = "M-VGMDB-AL-37932"
                title = "Yukitoki / yanaginagi" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.15, 0.5)

                SubIDEntry("1") {
                    title = "Yukitoki" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:29") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.2)
                }
            }

            Entry {
                id = "M-VGMDB-AL-51516"
                title = "Harumodoki / yanaginagi" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.1, 0.35)

                SubIDEntry("1") {
                    MusicConsumedProgress("4:30") // generated(fill_music_metadata.dart v0.1.1)
                    title = "Harumodoki" // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.25)
                    Remix("M-VGMDB-AL-106577-6")
                }
            }

            Entry {
                id = "M-VGMDB-AL-96288"
                title = "Megumi no Ame / yanaginagi" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.15, 0.45)

                SubIDEntry("1") {
                    title = "芽ぐみの雨" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:41") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.3)
                }
            }

            Entry {
                id = "M-VGMDB-AL-70716"
                title = "over and over / yanaginagi" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.05, 0.3)

                SubIDEntry("1") {
                    title = "over and over" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:54") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.5)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-12665"
        title = "Mikako Komatsu" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-45187-1")
        }
    }

    Entry {
        id = "M-VGMDB-AR-18208"
        title = "Yuuki Takada" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-46", 0.25)
        Contains("M-17", 1.0 / 9.0)
        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-75344-4", 1.0 / 3.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-18231"
        title = "Megumi Yamaguchi" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-46", 0.25)
    }

    Entry {
        id = "M-VGMDB-AR-16233"
        title = "Megumi Toda" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-46", 0.25)
    }

    Entry {
        id = "M-VGMDB-AR-18205"
        title = "Ayumi Takeo" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-46", 0.25)
    }

    Entry {
        id = "M-36"
        title = "Will Stetson"
        ValidatorSuppress("dah-entry-no-consumed")

        Contains("M-37", 0.3)
        Contains("M-45", 0.45)
    }

    Entry {
        id = "M-VGMDB-AR-6876"
        title = "Saori Hayami" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            // oregairu songs
            Contains(0.5) {
                Contains("M-VGMDB-AL-37999-1")
                Contains("M-VGMDB-AL-51394-1")
                Contains("M-VGMDB-AL-96290-1")
            }

            //sora yori group
            Contains(1.0 / 4.0) {
                Contains("M-VGMDB-AL-73544")
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-11436"
        title = "Nao Toyama" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            // oregairu songs
            Contains(0.5) {
                Contains("M-VGMDB-AL-37999-1")
                Contains("M-VGMDB-AL-51394-1")
                Contains("M-VGMDB-AL-96290-1")
            }

            // oregairu solo songs
            Contains("M-VGMDB-AL-51394-3")
            Contains("M-VGMDB-AL-37999-2")

            Entry {
                id = "M-VGMDB-AL-93329"
                title = "Aruite Ikou! / Nao Toyama" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.15, 0.2)

                SubIDEntry("1") {
                    MusicConsumedProgress("4:24") // generated(fill_music_metadata.dart v0.1.1)
                    title = "Aruite Ikou!" // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.4)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-26898"
        title = "Akari Kito" // generated(fill_music_metadata.dart v0.1.1)

        // known as the va of sayu
        // wtf do you mean by kanata???
        // *insert high-copium pasta about love live < rst but in reality it's the opposite*

        Contains("M-VGMDB-AR-30829", 1.0 / 6.0)
        Contains("M-VGMDB-AR-29922", NijiOldGirlContainFactor)

        Contains(
            "M-VGMDB-AL-104618",
            MusicVocalContainFactor + MusicImageContainFactor * MusicFeatArtistFactor
        )

        // the akari kito analogy lol
        AKMEraPart1(0.05)
    }

    Entry {
        id = "M-VGMDB-AR-10934"
        title = "Ai Kayano" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-23", 1.0 / 4.0)
        AKMEraPart1(0.05)
        AKMEraPart2(0.1)
        AKMEraPart2(0.05)
    }

    Entry {
        id = "M-VGMDB-AR-11958"
        title = "Miku Sawai" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-49446"
                title = "Colorful. / Miku Sawai" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.1, 0.2)

                SubIDEntry("1") {
                    MusicConsumedProgress("4:16") // generated(fill_music_metadata.dart v0.1.1)
                    title = "Colorful." // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.25)
                }
            }

            Contains("M-10", 0.5)
            Contains("M-11", 0.5)
        }
    }

    Entry {
        id = "M-12"
        title = "kamaboko"
        ValidatorSuppress("dah-entry-no-consumed")

        Contains("M-11", 0.5)
    }

    Entry {
        id = "M-VGMDB-AR-6783"
        title = "Kana Hanazawa" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            // Sanshuu Chuugaku Yuushabu (post-Sonoko)
            Contains(1.0 / 5.0) {
                Contains("M-VGMDB-AL-114186")
            }
            //sora yori group
            Contains(1.0 / 4.0) {
                Contains("M-VGMDB-AL-73544")
            }

            Contains("M-VGMDB-AL-82284", 1.0 / 5.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-10253"
        title = "Suzuko Mimori" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            // Sanshuu Chuugaku Yuushabu (pre-Sonoko)
            Contains(1.0 / 4.0) {
                Contains("M-VGMDB-AL-47678")
            }

            // post-Sonoko
            Contains(1.0 / 5.0) {
                Contains("M-VGMDB-AL-114186")
            }

            // We May Never Meet Again, But I Will Never Forget Your Voice
            Entry {
                id = "M-VGMDB-AL-69821"
                title = "Egao no Kimi e / Suzuko Mimori" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.25, 0.2)

                SubIDEntry("1") {
                    MusicConsumedProgress("3:54") // generated(fill_music_metadata.dart v0.1.1)
                    title = "Egao no Kimi e" // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.35)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-16166"
        title = "Eri Inagawa" // generated(fill_music_metadata.dart v0.1.1)

        // le cat va
        Contains(MusicVocalImageContainFactor) {
            Contains("M-18", 1.0 / 4.0)
            Contains("M-VGMDB-AR-32295", 1.0 / 51.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-30564"
        title = "Hikaru Tono" // generated(fill_music_metadata.dart v0.1.1)

        // chao e co gai hoan tinh
        Contains(MusicVocalImageContainFactor) {
            Contains("M-20", 1.0 / 4.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-26886"
        title = "WEAVER" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            // lemur
            Entry {
                id = "M-VGMDB-AL-51918"
                title = "Kuchizuke Diamond / WEAVER" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.1, 0.25)

                SubIDEntry("1") {
                    title = "Kuchizuke Diamond" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("3:57") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.35)
                    OsuSong(personal = 0.4, community = 0.5)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-15766"
        title = "mimimemeMIMI" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-52045"
                title = "CANDY MAGIC / mimimemeMIMI [Yuki Takao Edition]" // generated(fill_music_metadata.dart v0.1.1)

                // yuki takao version: https://vgmdb.net/album/52045
                Visual(VisualKind.AlbumArt, 0.1, 0.3)
                // mememememememe version: https://vgmdb.net/album/52046
                Visual(VisualKind.AlbumArt, 0.3, 0.35)

                SubIDEntry("1") {
                    title = "CANDY MAGIC" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:36") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.1)
                }
            }

            Entry {
                id = "M-VGMDB-AL-59371"
                title = "hare bare fanfare / mimimemeMIMI" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.5, 0.35)

                // kek
                SubIDEntry("1") {
                    title = "hare bare fanfare" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("3:38") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.4)

                    OsuSong(personal = 0.6, community = 0.3)
                }

                SubIDEntry("3") {
                    MusicConsumedProgress("0:57") // generated(fill_music_metadata.dart v0.1.1)
                    title = "CANDY MAGIC ~Piano Live Version~" // generated(fill_music_metadata.dart v0.1.1)
                    Remix("M-VGMDB-AL-52045-1")
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-17342"
        title = "DAOKO" // generated(fill_music_metadata.dart v0.1.1)

        // vocal: ImageVocalContainFactor * 0.8
        Contains("M-VGMDB-AL-69257", MusicVocalContainFactor + MusicImageContainFactor / 2)
    }

    Entry {
        id = "M-VGMDB-AR-15121"
        title = "Kenshi Yonezu" // generated(fill_music_metadata.dart v0.1.1)

        // vocal: ImageVocalContainFactor * 0.2
        // music + lyrics + arrangement: 0.5 * (1.0 - ImageVocalContainFactor)
        Contains(
            "M-VGMDB-AL-69257", MusicInstContainFactor + MusicImageContainFactor / 2
        )
    }

    Entry {
        id = "M-VGMDB-AL-69257"
        title = "Uchiage Hanabi / DAOKO" // generated(fill_music_metadata.dart v0.1.1)

        Visual(VisualKind.AlbumArt, 0.1, 0.2)

        SubIDEntry("1") {
            title = "Uchiage Hanabi" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("4:49") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.2)
        }
    }

    Entry {
        id = "M-VGMDB-AR-11952"
        title = "LiSA" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-33537"
                title = "crossing field / LiSA" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.1, 0.2)

                SubIDEntry("1") {
                    title = "crossing field" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("4:09") // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.1)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-26614"
        title = "kemu" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-MAL-36631")
        Contains("M-41", 0.5)
        Contains("M-43", 0.25)
    }

    Entry {
        id = "M-VGMDB-AR-4276"
        title = "yuiko" // generated(fill_music_metadata.dart v0.1.1)

        Contains("M-41", 0.5)

        // backing vocal for akogare future sign (piano arrange ver.)
        Contains("M-VGMDB-AL-86622-2", 0.05)
    }

    Entry {
        id = "M-42"
        title = "H△G"
        ValidatorSuppress("dah-entry-no-consumed")

        Contains("M-43", 0.75)

        Entry {
            id = "M-63"
            title = "Everlasting Night of Teenage Girls"
            ValidatorSuppress("dah-entry-no-consumed")

            // Length source: https://open.spotify.com/album/2ztJCuDBki1rNOEi2TrH2W
            Entry {
                id = "M-64"
                title = "Shoujotachi no Owaranai Yoru"
                MusicConsumedProgress("4:08") // impl_overridden
                Music(0.6)
            }

            Entry {
                id = "M-65"
                title = "Colorful"
                // [prismatic]
                // 1-2 1-2 1-2 1-2
                // "imagine ruining a 2013 video comment section because of 1-2 xD"
                MusicConsumedProgress("4:43")
                Music(0.45)
                // cringeworthy material: https://www.youtube.com/watch?v=_3aqQaH9AWM (it's me who made that)
            }
        }
    }

    Entry {
        id = "M-44"
        title = "Chiho"
        ValidatorSuppress("dah-entry-no-consumed")

        Contains("M-42", 0.5)
    }

    Entry {
        id = "M-VGMDB-AR-9455"
        title = "Larval Stage Planning" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-47402")
        }
    }

    Entry {
        id = "M-VGMDB-AR-29251"
        title = "Yuka Iwahashi" // generated(fill_music_metadata.dart v0.1.1)

        // t̷̤̀h̵̙̰̒ẽ̷̥̋ ̶̺͔̌͘h̴̡̜̐̎o̴̥͉͒̊n̴͕̈́̎ǰ̷̢͜ő̸̞͎̈ủ̵͔ͅ ̴͔̘̏k̸̛͉̉a̵̯̣͑͆ŝ̴̝u̶͉̠̎̂m̵̞͛i̷͙͉͋ ̴̨̥̓ḯ̵͖̺n̷̲̉̌c̷̪̓i̴̢͎̋d̵̬͛e̸̗̓ń̷͓̤͠t̷̮̭̄̐
        Contains("M-50", 1.0 / 9.0)
        Contains("M-VGMDB-AR-30829", 1.0 / 6.0)
    }

    Entry {
        id = "M-VGMDB-AR-9797"
        title = "Aoi Yuki" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            // petit milady
            Contains(1.0 / 2.0) {
                Entry {
                    id = "M-VGMDB-AL-78478"
                    title = "360° Hoshi no Orchestra / petit milady" // generated(fill_music_metadata.dart v0.1.1)

                    Visual(VisualKind.AlbumArt, 0.15, 0.2)

                    SubIDEntry("1") {
                        title = "360° Hoshi no Orchestra" // generated(fill_music_metadata.dart v0.1.1)
                        MusicConsumedProgress("5:02") // generated(fill_music_metadata.dart v0.1.1)
                        // coco's Insane
                        // Akito's Insane
                        // ailv's Insane
                        // Seto's Insane
                        // Trynna's Insane
                        // Doj's Insane
                        // Insane
                        // osugame
                        Music(0.25)
                        OsuSong(personal = 0.6, community = 0.0)
                    }
                }
            }

            Contains("M-VGMDB-AL-30302-2")
        }
    }

    Entry {
        id = "M-VGMDB-AR-29249"
        title = "Amane Makino" // generated(fill_music_metadata.dart v0.1.1)

        // le gigachad seiyuu herself
        // such a true sigma chad

        // rst shit
        Contains("M-VGMDB-AR-30829", 1.0 / 6.0)

        // we live in a society
        // we live in a society
        // we live in a society
        // we live in a society
        // we live in a society
        // rst shills are truly on another level of stupidity
        Contains(0.5) {
            Entry {
                id = "M-60"
                title = "Cobalt Memories (Amane Makino ver.)"
                // https://www.youtube.com/watch?v=_IWGubxbp1k

                // rst shills when their dumb lore goes deeper than their gf's pussy

                // her voice kinda fits with the song ngl
                // new kano inc (jk)
                MusicConsumedProgress("4:28")
                Music(0.25)
            }
        }
    }

    // if you think amanero being ranked is bad already
    // lol clueless

    // say goodbye to your sanity
    Entry {
        id = "M-VGMDB-AR-8480"
        title = "Rina Hidaka" // generated(fill_music_metadata.dart v0.1.1)

        AKMEraPart1(0.3)
        AKMEraPart2(0.35)
        AKMEraPart3(0.3)
        // (not the whole cricri unit)
        Contains("M-23", 0.25)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-95314")
            Contains("M-VGMDB-AL-116977-11")
            Contains("M-VGMDB-AL-76155", 0.25)
            // additional 0.25 because every song on this album
            // is sung by rosia and another girl
        }
    }

    Entry {
        id = "M-VGMDB-AR-14761"
        title = "Rie Murakawa" // generated(fill_music_metadata.dart v0.1.1)
        // congrats u have escaped the fate of a cricri girl
        // now prepare to be a new seasonal waifu va lol

        AKMEraPart1(0.2)
        AKMEraPart2(0.3)
        AKMEraPart3(0.3)
        // additional 0.25 because akm is sung by rosia and jacklyn
        // (not the whole cricri unit)
        Contains("M-23", 0.25)
        // 765
        Contains("M-VGMDB-AR-32295", 1.0 / 51.0)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-95313")
            Contains("M-VGMDB-AL-45361-1")
            Contains("M-VGMDB-AL-76155-2", 0.25)
        }
    }

    Entry {
        id = "M-VGMDB-AR-29487"
        title = "Takahiro Yuba" // generated(fill_music_metadata.dart v0.1.1)
        // aka the gigachad who made akm and destroyed civilization as we know it

        Contains("M-VGMDB-AL-76155-2", MusicInstContainFactor)
        Contains("M-VGMDB-AL-74440-6", MusicInstContainFactor * 2 / 3)
        Contains("M-VGMDB-AL-108194-5", MusicInstContainFactor * 2 / 3)
    }

    Entry {
        id = "M-VGMDB-AR-6799"
        title = "nayuta" // generated(fill_music_metadata.dart v0.1.1)

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-74440"
                title = "Sora ni Kakaru Kimi no Koe." // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.6, 0.3)
                SubIDEntry("6") {
                    title = "Azure Reunion" // generated(fill_music_metadata.dart v0.1.1)
                    MusicConsumedProgress("5:06") // impl_overridden
                    Music(0.6)
                    Remix("M-VGMDB-AL-108194-5")
                }
            }
        }

        Contains(MusicInstContainFactor / 3) {
            Contains("M-VGMDB-AL-74440-6")
            Contains("M-VGMDB-AL-108194-5")
        }
    }

    Entry {
        id = "M-VGMDB-AR-8196"
        title = "Nanahira" // generated(fill_music_metadata.dart v0.1.1)
        // aka the hasegawa mii utaite

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-108194"
                title = "Nanairo Ribbon / Nanahira x nayuta" // generated(fill_music_metadata.dart v0.1.1)

                Visual(VisualKind.AlbumArt, 0.4, 0.5)

                SubIDEntry("5") {
                    MusicConsumedProgress("5:06") // generated(fill_music_metadata.dart v0.1.1)
                    title = "Azure Reunion" // generated(fill_music_metadata.dart v0.1.1)
                    Music(0.6)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-30942"
        title = "Yunomi" // generated(fill_music_metadata.dart v0.1.1)

        Contains(
            "M-VGMDB-AL-104618",
            MusicInstContainFactor + MusicImageContainFactor * MusicMainArtistFactor
        )
    }

    Entry {
        id = "M-VGMDB-AR-3240"
        
        Contains("M-VGMDB-AL-59535-9", MusicVocalImageContainFactor)
        Contains("M-VGMDB-AL-78595-16", MusicVocalImageContainFactor)
        Contains("M-VGMDB-AL-33518-2", MusicVocalImageContainFactor)
    }
}
