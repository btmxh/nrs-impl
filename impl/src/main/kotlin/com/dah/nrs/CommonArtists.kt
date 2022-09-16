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

        Contains("M-44", 1.0 / 4)
        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-63666")
        }
    }

    Entry {
        id = "M-VGMDB-AR-16380"

        Contains("M-44", 1.0 / 4)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-53719-1")
        }
    }

    Entry {
        id = "M-VGMDB-AR-15998"

        Contains("M-13", 1.0 / 2)
        Contains("M-44", 1.0 / 4)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-53719-1", 0.5)
            Contains("M-VGMDB-AL-82983-5")
        }
    }

    Entry {
        id = "M-VGMDB-AR-12726"

        Contains("M-9", 1.0 / 5)
        Contains("M-18", 1.0 / 4)

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-82284", 1.0 / 5.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-13211"

        Contains("M-9", 1.0 / 5)
    }

    Entry {
        id = "M-VGMDB-AR-8874"

        Contains("M-9", 1.0 / 5)
    }

    Entry {
        id = "M-VGMDB-AR-13289"

        Contains("M-9", 1.0 / 5)
    }

    Entry {
        id = "M-VGMDB-AR-13857"

        // band, so no Contains(ImageVocalContainFactor) block
        Contains("M-VGMDB-AL-62516")
        Contains("M-VGMDB-AL-110219")

        Entry {
            id = "M-VGMDB-AL-47403"

            Visual(VisualKind.AlbumArt, 0.6, 0.3)

            SubIDEntry("1") {
                Music(3.0)
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-25289"
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

        Contains("M-VGMDB-AL-37130-1", MusicInstContainFactor / 3.0)
        Contains("M-VGMDB-AL-37130-2", MusicInstContainFactor / 3.0)
        Contains("M-VGMDB-AL-37130-3", MusicInstContainFactor / 3.0)

        Contains("M-VGMDB-AL-34411-11", MusicInstContainFactor)
    }

    Entry {
        id = "M-VGMDB-AR-15120"

        Contains("M-VGMDB-AL-37130-4", MusicInstContainFactor / 3.0)
        Contains("M-VGMDB-AL-37130-5", MusicInstContainFactor / 3.0)
        Contains("M-VGMDB-AL-37130-6", MusicInstContainFactor / 3.0)

        Contains("M-VGMDB-AL-49423-8", 0.2)

        Contains("M-VGMDB-AL-78339-2", 0.1)
    }

    Entry {
        id = "M-VGMDB-AR-17551"

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-97692")
        }
    }

    Entry {
        id = "M-VGMDB-AR-29323"

        Contains("M-VGMDB-AR-29922", NijiOldGirlContainFactor)
        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-99272-3")
        }
    }

    Entry {
        id = "M-VGMDB-AR-29640"

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

        Contains("M-VGMDB-AR-29922", NijiOldGirlContainFactor)
        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-80802-10")
        }
    }

    Entry {
        id = "M-VGMDB-AR-16469"

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-69147"

                Visual(VisualKind.AlbumArt, 0.1, 0.3)

                SubIDEntry("11") {
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

                Visual(VisualKind.AlbumArt, 0.35, 0.6)
                SubIDEntry("1") {
                    Music(3.0)
                }
            }

            Entry {
                id = "M-VGMDB-AL-41292"

                Visual(VisualKind.AlbumArt, 0.1, 0.2)
                SubIDEntry("1") {
                    Music(5.0)

                    Remix("M-7")
                    Remix("M-8")
                }
            }

            Entry {
                id = "M-VGMDB-AL-89431"

                Visual(VisualKind.AlbumArt, 0.1, 0.2)
                SubIDEntry("1") {
                    Music(7.0)
                }
            }

            Entry {
                id = "M-VGMDB-AL-77471"

                Visual(VisualKind.AlbumArt, 0.1, 0.4)

                SubIDEntry("1") {
                    Music(4.0)
                    OsuSong(personal = 4.0, community = 0.0)
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
                MusicConsumedProgress("5:21")
                Music(6.5)
            }

            Entry {
                id = "M-47"
                title = "Tamame - Ebb and Flow (5 years after remix)"

                // Length source: https://osu.ppy.sh/beatmapsets/163756#osu/398882
                MusicConsumedProgress("6:19")
                Music(3.0)
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-13097"

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-41278"

                Visual(VisualKind.AlbumArt, 0.15, 0.35)

                SubIDEntry("1") {
                    Music(0.75)
                }
            }

            Entry {
                id = "M-VGMDB-AL-42900"

                Visual(VisualKind.AlbumArt, 0.15, 0.45)

                SubIDEntry("1") {
                    Music(3.5)
                    Remix("M-47")
                }

                SubIDEntry("3") {
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

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-41280"

                Visual(VisualKind.AlbumArt, 0.175, 0.45)

                SubIDEntry("1") {
                    Music(0.75)
                }
            }

            Entry {
                id = "M-VGMDB-AL-43164"

                Visual(VisualKind.AlbumArt, 0.1, 0.45)

                SubIDEntry("1") {
                    Music(0.75)
                }
            }

            Entry {
                id = "M-VGMDB-AL-37932"

                Visual(VisualKind.AlbumArt, 0.15, 0.5)

                SubIDEntry("1") {
                    Music(2.0)
                }
            }

            Entry {
                id = "M-VGMDB-AL-51516"

                Visual(VisualKind.AlbumArt, 0.1, 0.35)

                SubIDEntry("1") {
                    Music(2.5)
                    Remix("M-VGMDB-AL-106577-6")
                }
            }

            Entry {
                id = "M-VGMDB-AL-96288"

                Visual(VisualKind.AlbumArt, 0.15, 0.45)

                SubIDEntry("1") {
                    Music(3.0)
                }
            }

            Entry {
                id = "M-VGMDB-AL-70716"

                Visual(VisualKind.AlbumArt, 0.05, 0.3)

                SubIDEntry("1") {
                    Music(5.0)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-12665"

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-45187-1")
        }
    }

    Entry {
        id = "M-VGMDB-AR-18208"

        Contains("M-46", 0.25)
        Contains("M-17", 1.0 / 9.0)
        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-75344-4", 1.0 / 3.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-18231"

        Contains("M-46", 0.25)
    }

    Entry {
        id = "M-VGMDB-AR-16233"

        Contains("M-46", 0.25)
    }

    Entry {
        id = "M-VGMDB-AR-18205"

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

                Visual(VisualKind.AlbumArt, 0.15, 0.2)

                SubIDEntry("1") {
                    Music(4.0)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-26898"

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

        Contains("M-23", 1.0 / 4.0)
        AKMEraPart1(0.05)
        AKMEraPart2(0.1)
        AKMEraPart2(0.05)
    }

    Entry {
        id = "M-VGMDB-AR-11958"

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-49446"

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
        ValidatorSuppress("dah-entry-no-consumed")

        Contains("M-11", 0.5)
    }

    Entry {
        id = "M-VGMDB-AR-6783"

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

                Visual(VisualKind.AlbumArt, 0.25, 0.2)

                SubIDEntry("1") {
                    Music(3.5)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-16166"

        // le cat va
        Contains(MusicVocalImageContainFactor) {
            Contains("M-18", 1.0 / 4.0)
            Contains("M-VGMDB-AR-32295", 1.0 / 51.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-30564"

        // chao e co gai hoan tinh
        Contains(MusicVocalImageContainFactor) {
            Contains("M-20", 1.0 / 4.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-26886"

        Contains(MusicVocalImageContainFactor) {
            // lemur
            Entry {
                id = "M-VGMDB-AL-51918"

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

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-52045"

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

                Visual(VisualKind.AlbumArt, 0.5, 0.35)

                // kek
                SubIDEntry("1") {
                    Music(4.0)

                    OsuSong(personal = 6.0, community = 3.0)
                }

                SubIDEntry("3") {
                    Remix("M-VGMDB-AL-52045-1")
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-17342"

        // vocal: ImageVocalContainFactor * 0.8
        Contains("M-VGMDB-AL-69257", MusicVocalContainFactor + MusicImageContainFactor / 2)
    }

    Entry {
        id = "M-VGMDB-AR-15121"

        // vocal: ImageVocalContainFactor * 0.2
        // music + lyrics + arrangement: 0.5 * (1.0 - ImageVocalContainFactor)
        Contains(
            "M-VGMDB-AL-69257", MusicInstContainFactor + MusicImageContainFactor / 2
        )
    }

    Entry {
        id = "M-VGMDB-AL-69257"

        Visual(VisualKind.AlbumArt, 0.1, 0.2)

        SubIDEntry("1") {
            Music(2.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-11952"

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-33537"

                Visual(VisualKind.AlbumArt, 0.1, 0.2)

                SubIDEntry("1") {
                    Music(1.0)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-26614"

        Contains("M-MAL-36631")
        Contains("M-41", 0.5)
        Contains("M-43", 0.25)
    }

    Entry {
        id = "M-VGMDB-AR-4276"

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
                MusicConsumedProgress("4:08")
                Music(6.0)
            }

            Entry {
                id = "M-65"
                title = "Colorful"
                // [prismatic]
                // 1-2 1-2 1-2 1-2
                // "imagine ruining a 2013 video comment section because of 1-2 xD"
                MusicConsumedProgress("4:43")
                Music(4.5)
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

        Contains(MusicVocalImageContainFactor) {
            Contains("M-VGMDB-AL-47402")
        }
    }

    Entry {
        id = "M-VGMDB-AR-29251"

        // t̷̤̀h̵̙̰̒ẽ̷̥̋ ̶̺͔̌͘h̴̡̜̐̎o̴̥͉͒̊n̴͕̈́̎ǰ̷̢͜ő̸̞͎̈ủ̵͔ͅ ̴͔̘̏k̸̛͉̉a̵̯̣͑͆ŝ̴̝u̶͉̠̎̂m̵̞͛i̷͙͉͋ ̴̨̥̓ḯ̵͖̺n̷̲̉̌c̷̪̓i̴̢͎̋d̵̬͛e̸̗̓ń̷͓̤͠t̷̮̭̄̐
        Contains("M-50", 1.0 / 9.0)
        Contains("M-VGMDB-AR-30829", 1.0 / 6.0)
    }

    Entry {
        id = "M-VGMDB-AR-9797"

        Contains(MusicVocalImageContainFactor) {
            // petit milady
            Contains(1.0 / 2.0) {
                Entry {
                    id = "M-VGMDB-AL-78478"

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
                Music(2.5)
            }
        }
    }

    // if you think amanero being ranked is bad already
    // lol clueless

    // say goodbye to your sanity
    Entry {
        id = "M-VGMDB-AR-8480"

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
        // aka the gigachad who made akm and destroyed civilization as we know it

        Contains("M-VGMDB-AL-76155-2", MusicInstContainFactor)
        Contains("M-VGMDB-AL-74440-6", MusicInstContainFactor * 2 / 3)
        Contains("M-VGMDB-AL-108194-5", MusicInstContainFactor * 2 / 3)
    }

    Entry {
        id = "M-VGMDB-AR-6799"

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-74440"

                Visual(VisualKind.AlbumArt, 0.6, 0.3)
                SubIDEntry("6") {
                    MusicConsumedProgress("5:06") // impl_overridden
                    Music(6.0)
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
        // aka the hasegawa mii utaite

        Contains(MusicVocalImageContainFactor) {
            Entry {
                id = "M-VGMDB-AL-108194"

                Visual(VisualKind.AlbumArt, 0.4, 0.5)

                SubIDEntry("5") {
                    Music(6.0)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-30942"

        Contains(
            "M-VGMDB-AL-104618",
            MusicInstContainFactor + MusicImageContainFactor * MusicMainArtistFactor
        )
    }
}
