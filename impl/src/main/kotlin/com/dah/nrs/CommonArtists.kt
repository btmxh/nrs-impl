package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.CommonArtists() {
    Entry {
        id = "M-1"
        title = "Asterisk"

        Contains("M-35", 1.0 / 3)
        Contains("M-10", 0.5)
        Contains("M-22", 0.5)
    }

    Entry {
        id = "M-34"
        title = "Rakakun"

        Contains("M-35", 1.0 / 3)
    }

    Entry {
        id = "M-VGMDB-AR-15361"
        title = "Minase Inori"

        Contains("M-9", 1.0 / 5)
        Contains("M-44", 1.0 / 4)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-54418-1")
            Contains("M-VGMDB-AL-55364-3")

            //sora yori group
            Contains(1.0 / 4.0) {
                Contains("M-VGMDB-AL-73544")
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-15350"
        title = "M·A·O"

        Contains("M-44", 1.0 / 4)
        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-63666")
        }
    }

    Entry {
        id = "M-VGMDB-AR-15380"
        title = "Takahashi Rie"

        Contains("M-44", 1.0 / 4)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-53719-1")
        }
    }

    Entry {
        id = "M-VGMDB-AR-15998"
        title = "Ozawa Ari"

        Contains("M-13", 1.0 / 2)
        Contains("M-44", 1.0 / 4)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-53719-1", 0.5)
            Contains("M-VGMDB-AL-82983-5")
        }
    }

    Entry {
        id = "M-VGMDB-AR-12726"
        title = "Sakura Ayane"

        Contains("M-9", 1.0 / 5)
        Contains("M-18", 1.0 / 4)
    }

    Entry {
        id = "M-VGMDB-AR-13211"
        title = "Taneda Risa"

        Contains("M-9", 1.0 / 5)
    }

    Entry {
        id = "M-VGMDB-AR-8874"
        title = "Sato Satomi"

        Contains("M-9", 1.0 / 5)
    }

    Entry {
        id = "M-VGMDB-AR-13289"
        title = "Uchida Maaya"

        Contains("M-9", 1.0 / 5)
    }

    Entry {
        id = "M-VGMDB-AR-13857"
        title = "fhána"

        // band, so no Contains(ImageVocalContainFactor) block
        Contains("M-VGMDB-AL-62516")
        Contains("M-VGMDB-AL-110219")

        Entry {
            id = "M-VGMDB-AL-47403"
            title = "Hoshikuzu no Interlude"

            Visual(VisualKind.AlbumArt, 0.6, 0.3)

            SubIDEntry("1") {
                Music(3.0)
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-25289"
        title = "Koyama Hidekazu"
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
        title = "Scop"

        Contains("M-VGMDB-AL-37130-1", MusicInstContainFactor / 3.0)
        Contains("M-VGMDB-AL-37130-2", MusicInstContainFactor / 3.0)
        Contains("M-VGMDB-AL-37130-3", MusicInstContainFactor / 3.0)

        Contains("M-VGMDB-AL-34411-11", MusicInstContainFactor)
    }

    Entry {
        id = "M-VGMDB-AR-15120"
        title = "keeno"

        Contains("M-VGMDB-AL-37130-4", MusicInstContainFactor / 3.0)
        Contains("M-VGMDB-AL-37130-5", MusicInstContainFactor / 3.0)
        Contains("M-VGMDB-AL-37130-6", MusicInstContainFactor / 3.0)

        Contains("M-VGMDB-AL-49423-8", 0.2)

        Contains("M-VGMDB-AL-78339-2", 0.1)
    }

    Entry {
        id = "M-VGMDB-AR-17551"
        title = "Saito Shuka"

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-97692")
        }
    }

    Entry {
        id = "M-VGMDB-AR-29323"
        title = "Maeda Kaori"

        Contains("M-VGMDB-AR-29922", NijiOldGirlContainFactor)
        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-99272-3")
        }
    }

    Entry {
        id = "M-VGMDB-AR-29640"
        title = "Onishi Aguri"

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
        title = "Kusunoki Tomori"
        // the prima doll destroyer

        Contains("M-VGMDB-AR-29922", NijiOldGirlContainFactor)
        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-80802-8")
            Contains("M-VGMDB-AL-87198-7")
            Contains("M-VGMDB-AL-99272-7")
        }
    }

    Entry {
        id = "M-VGMDB-AR-26954"
        title = "Tanaka Chiemi"

        Contains("M-VGMDB-AR-29922", NijiOldGirlContainFactor)
        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-80802-10")
        }
    }

    Entry {
        id = "M-VGMDB-AR-16469"
        title = "TrySail"

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-69147"
                title = "TAILWIND"

                Visual(VisualKind.AlbumArt, 0.1, 0.3)

                SubIDEntry("11", "Kakawari") {
                    Music(6.0)
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
        title = "ClariS"

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
                title = "Connect"

                Visual(VisualKind.AlbumArt, 0.35, 0.6)
                SubIDEntry("1") {
                    Music(3.0)
                }
            }

            Entry {
                id = "M-VGMDB-AL-41292"
                title = "Colorful"

                Visual(VisualKind.AlbumArt, 0.1, 0.2)
                SubIDEntry("1") {
                    Music(5.0)

                    Remix("M-7")
                    Remix("M-8")
                }
            }

            Entry {
                id = "M-VGMDB-AL-89431"
                title = "Signal"

                Visual(VisualKind.AlbumArt, 0.1, 0.2)
                SubIDEntry("1") {
                    Music(7.0)
                }
            }

            Entry {
                id = "M-VGMDB-AL-77471"
                title = "CheerS"

                Visual(VisualKind.AlbumArt, 0.1, 0.4)

                SubIDEntry("1") {
                    Music(4.0)
                    OsuSong(personal = 0.4, community = 0.0)
                }
            }
        }
    }

    Entry {
        id = "M-6"
        title = "tamame"

        Contains(0.5) {
            Entry {
                id = "M-8"
                title = "Colorful (tamame's apostate remix)"

                Music(6.5)
            }

            Entry {
                id = "M-47"
                title = "Tamame - Ebb and Flow (5 years after remix)"

                Music(3.0)
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-13097"
        title = "Ray"

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-41278"
                title = "lull ~Soshite Bokura wa~"

                Visual(VisualKind.AlbumArt, 0.15, 0.35)

                SubIDEntry("1") {
                    Music(0.75)
                }
            }

            Entry {
                id = "M-VGMDB-AL-42900"
                title = "ebb and flow"

                Visual(VisualKind.AlbumArt, 0.15, 0.45)

                SubIDEntry("1") {
                    Music(3.5)
                    Remix("M-47")
                }

                SubIDEntry("3", "nagi") {
                    Music(1.2)
                }
            }

            Contains(0.5) {
                Contains("M-47")
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-5524"
        title = "yanaginagi"

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-41280"
                title = "Aqua Terrarium"

                Visual(VisualKind.AlbumArt, 0.175, 0.45)

                SubIDEntry("1") {
                    Music(0.75)
                }
            }

            Entry {
                id = "M-VGMDB-AL-43164"
                title = "Mitsuba no Musubime"

                Visual(VisualKind.AlbumArt, 0.1, 0.45)

                SubIDEntry("1") {
                    Music(0.75)
                }
            }

            Entry {
                id = "M-VGMDB-AL-37932"
                title = "Yukitoki"

                Visual(VisualKind.AlbumArt, 0.15, 0.5)

                SubIDEntry("1") {
                    Music(2.0)
                }
            }

            Entry {
                id = "M-VGMDB-AL-51516"
                title = "Harumodoki"

                Visual(VisualKind.AlbumArt, 0.1, 0.35)

                SubIDEntry("1") {
                    Music(2.5)
                    Remix("M-VGMDB-AL-106577-6")
                }
            }

            Entry {
                id = "M-VGMDB-AL-96288"
                title = "Megumi no Ame"

                Visual(VisualKind.AlbumArt, 0.15, 0.45)

                SubIDEntry("1") {
                    Music(3.0)
                }
            }

            Entry {
                id = "M-VGMDB-AL-70716"
                title = "over and over"

                Visual(VisualKind.AlbumArt, 0.05, 0.3)

                SubIDEntry("1") {
                    Music(5.0)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-12665"
        title = "Komatsu Mikako"

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-45187-1")
        }
    }

    Entry {
        id = "M-VGMDB-AR-18208"
        title = "Takada Yuuki"

        Contains("M-46", 0.25)
        Contains("M-17", 1.0 / 9.0)
        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-75344-4", 1.0 / 3.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-18231"
        title = "Yamaguchi Megumi"

        Contains("M-46", 0.25)
    }

    Entry {
        id = "M-VGMDB-AR-16233"
        title = "Toda Megumi"

        Contains("M-46", 0.25)
    }

    Entry {
        id = "M-VGMDB-AR-18205"
        title = "Takeo Ayumi"

        Contains("M-46", 0.25)
    }

    Entry {
        id = "M-36"
        title = "Will Stetson"

        Contains("M-37", 0.3)
        Contains("M-45", 0.45)
    }

    Entry {
        id = "M-VGMDB-AR-6876"
        title = "Hayami Saori"

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
        title = "Toyama Nao"

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
        }
    }

    Entry {
        id = "M-VGMDB-AR-26898"
        title = "Kito Akari"

        // known as the va of sayu
        // wtf do you mean by kanata???
        // *insert high-copium pasta about love live < rst but in reality it's the opposite*

        Contains("M-VGMDB-AR-30829", 1.0 / 6.0)
        Contains("M-VGMDB-AR-29922", NijiOldGirlContainFactor)
    }

    Entry {
        id = "M-VGMDB-AR-10934"
        title = "Kayano Ai"

        Contains("M-23", 1.0 / 4.0)
    }

    Entry {
        id = "M-VGMDB-AR-11958"
        title = "Sawai Miku"

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-49446"
                title = "Colorful."

                Visual(VisualKind.AlbumArt, 0.1, 0.2)

                SubIDEntry("1") {
                    Music(2.5)
                }
            }

            Contains("M-10", 0.5)
            Contains("M-11", 0.5)
        }
    }

    Entry {
        id = "M-12"
        title = "kamaboko"

        Contains("M-11", 0.5)
    }

    Entry {
        id = "M-VGMDB-AR-6783"
        title = "Hanazawa Kana"

        Contains(MusicVocalImageContainFactor) {
            // Sanshuu Chuugaku Yuushabu (post-Sonoko)
            Contains(1.0 / 5.0) {
                Contains("M-VGMDB-AL-114186")
            }
            //sora yori group
            Contains(1.0 / 4.0) {
                Contains("M-VGMDB-AL-73544")
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-10253"
        title = "Mimori Suzuko"

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
                title = "Egao no Kimi e"

                Visual(VisualKind.AlbumArt, 0.25, 0.2)

                SubIDEntry("1") {
                    Music(3.5)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-16166"
        title = "Inagawa Eri"

        // le cat va
        Contains(MusicVocalImageContainFactor) {
            Contains("M-18", 1.0 / 4.0)
            Contains("M-VGMDB-AR-32295", 1.0 / 51.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-30564"
        title = "Tono Hikaru"

        // chao e co gai hoan tinh
        Contains(MusicVocalImageContainFactor) {
            Contains("M-20", 1.0 / 4.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-26886"
        title = "WEAVER"

        Contains(MusicVocalImageContainFactor) {
            // lemur
            Entry {
                id = "M-VGMDB-AL-51918"
                title = "Kuchizuke Diamond"

                Visual(VisualKind.AlbumArt, 0.1, 0.25)

                SubIDEntry("1") {
                    Music(3.5)
                    OsuSong(personal = 4.0, community = 5.0)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-15766"
        title = "mimimemeMIMI"

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-52045"
                title = "CANDY MAGIC"

                // yuki takao version: https://vgmdb.net/album/52045
                Visual(VisualKind.AlbumArt, 0.1, 0.3)
                // mememememememe version: https://vgmdb.net/album/52046
                Visual(VisualKind.AlbumArt, 0.3, 0.35)

                SubIDEntry("1") {
                    Music(1.0)
                }
            }

            Entry {
                id = "M-VGMDB-AL-59371"
                title = "hare bare fanfare"

                Visual(VisualKind.AlbumArt, 0.5, 0.35)

                // kek
                SubIDEntry("1") {
                    Music(4.0)

                    OsuSong(personal = 6.0, community = 3.0)
                }

                SubIDEntry("3", "CANDY MAGIC ~Piano Live Version~") {
                    Remix("M-VGMDB-AL-52045-1")
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-17342"
        title = "DAOKO"

        // vocal: ImageVocalContainFactor * 0.8
        Contains("M-VGMDB-AL-69257", MusicVocalContainFactor + MusicImageContainFactor / 2)
    }

    Entry {
        id = "M-VGMDB-AR-15121"
        title = "Yonezu Kenshi"

        // vocal: ImageVocalContainFactor * 0.2
        // music + lyrics + arrangement: 0.5 * (1.0 - ImageVocalContainFactor)
        Contains(
            "M-VGMDB-AL-69257", MusicInstContainFactor + MusicImageContainFactor / 2
        )
    }

    Entry {
        id = "M-VGMDB-AL-69257"
        title = "Uchiage Hanabi"

        Visual(VisualKind.AlbumArt, 0.1, 0.2)

        SubIDEntry("1") {
            Music(2.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-11952"
        title = "LiSA"

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-33537"
                title = "crossing field"

                Visual(VisualKind.AlbumArt, 0.1, 0.2)

                SubIDEntry("1") {
                    Music(1.0)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-26614"
        title = "kemu"

        Contains("M-MAL-36631")
        Contains("M-41", 0.5)
        Contains("M-43", 0.25)
    }

    Entry {
        id = "M-VGMDB-AR-4276"
        title = "yuiko"

        Contains("M-41", 0.5)

        // backing vocal for akogare future sign (piano arrange ver.)
        Contains("M-VGMDB-AL-86622-2", 0.05)
    }

    Entry {
        id = "M-42"
        title = "H△G"

        Contains("M-43", 0.75)
    }

    Entry {
        id = "M-44"
        title = "Chiho"

        Contains("M-42", 0.5)
    }

    Entry {
        id = "M-VGMDB-AR-9455"
        title = "Larval Stage Planning"

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-47402")
        }
    }

    Entry {
        id = "M-VGMDB-AR-29251"
        title = "Iwahashi Yuka"

        // t̷̤̀h̵̙̰̒ẽ̷̥̋ ̶̺͔̌͘h̴̡̜̐̎o̴̥͉͒̊n̴͕̈́̎ǰ̷̢͜ő̸̞͎̈ủ̵͔ͅ ̴͔̘̏k̸̛͉̉a̵̯̣͑͆ŝ̴̝u̶͉̠̎̂m̵̞͛i̷͙͉͋ ̴̨̥̓ḯ̵͖̺n̷̲̉̌c̷̪̓i̴̢͎̋d̵̬͛e̸̗̓ń̷͓̤͠t̷̮̭̄̐
        Contains("M-50", 1.0 / 9.0)
        Contains("M-VGMDB-AR-30829", 1.0 / 6.0)
    }

    Entry {
        id = "M-VGMDB-AR-9797"
        title = "Yuki Aoi"

        Contains(MusicVocalImageContainFactor) {
            // petit milady
            Contains(1.0 / 2.0) {
                Entry {
                    id = "M-VGMDB-AL-78478"
                    title = "360° Hoshi no Orchestra"

                    Visual(VisualKind.AlbumArt, 0.15, 0.2)

                    SubIDEntry("1") {
                        // coco's Insane
                        // Akito's Insane
                        // ailv's Insane
                        // Seto's Insane
                        // Trynna's Insane
                        // Doj's Insane
                        // Insane
                        // osugame
                        Music(2.5)
                        OsuSong(personal = 6.0, community = 0.0)
                    }
                }
            }

            Contains("M-VGMDB-AL-30302-2")
        }
    }

    Entry {
        id = "M-VGMDB-AR-29249"
        title = "Makino Amane"

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
                Music(2.5)
            }
        }
    }

    // if you think amanero being ranked is bad already
    // lol clueless

    // say goodbye to your sanity
    Entry {
        id = "M-VGMDB-AR-8480"
        title = "Hidaka Rina"

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
        title = "Murakawa Rie"

        Contains("M-23", 0.25)
        // 765
        Contains("M-VGMDB-AR-32295", 1.0 / 51.0)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-95313")
            Contains("M-VGMDB-AL-45361-1")
            Contains("M-VGMDB-AL-76155-2", 0.25)
            // additional 0.25 because akm is sung by rosia and jacklyn
            // (not the whole cricri unit)
        }
    }

    Entry {
        id = "M-VGMDB-AR-29487"
        title = "Takahiro Yuba"
        // aka the gigachad who made akm and destroyed civilization as we know it

        // NRS is broken and we all know it
        Contains("M-VGMDB-AL-76155-2", 0.15)
        Contains("M-VGMDB-AL-74440-6", 0.15)
        Contains("M-VGMDB-AL-108194-5", 0.15)
    }

    Entry {
        id = "M-VGMDB-AR-6799"
        title = "nayuta"

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-74440"
                title = "Sora ni Kakaru Kimi no Koe."

                Visual(VisualKind.AlbumArt, 0.6, 0.3)
                SubIDEntry("6", "Azure Reunion") {
                    Music(6.0)
                    Remix("M-VGMDB-AL-108194-5")
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-8196"
        title = "Nanahira"
        // aka the hasegawa mii utaite

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-108194"
                title = "Nanairo Ribbon"

                Visual(VisualKind.AlbumArt, 0.4, 0.5)

                SubIDEntry("5", "Azure Reunion") {
                    Music(6.0)
                }
            }
        }
    }
}
