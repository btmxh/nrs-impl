package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.ImageVocalContainFactor
import com.dah.nrs.exts.Music
import com.dah.nrs.exts.OsuSong
import com.dah.nrs.exts.Remix

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

        Contains(ImageVocalContainFactor) {
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
        Contains(ImageVocalContainFactor) {
            Contains("M-VGMDB-AL-63666")
        }
    }

    Entry {
        id = "M-VGMDB-AR-15380"
        title = "Takahashi Rie"

        Contains("M-44", 1.0 / 4)

        Contains(ImageVocalContainFactor) {
            Contains("M-VGMDB-AL-53719-1")
        }
    }

    Entry {
        id = "M-VGMDB-AR-15998"
        title = "Ozawa Ari"

        Contains("M-13", 1.0 / 2)
        Contains("M-44", 1.0 / 4)

        Contains(ImageVocalContainFactor) {
            Contains("M-VGMDB-AL-53719-1", 0.5)
            Contains("M-VGMDB-AL-82983-5")
        }
    }

    Entry {
        id = "M-VGMDB-AR-12726"
        title = "Sakura Ayane"

        Contains("M-9", 1.0 / 5)
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

        Contains("M-VGMDB-AL-37130-1", 0.2)
        Contains("M-VGMDB-AL-37130-2", 0.1)
        Contains("M-VGMDB-AL-37130-3", 0.05)

        Contains("M-VGMDB-AL-34411-11", 0.2)
    }

    Entry {
        id = "M-VGMDB-AR-15120"
        title = "keeno"

        Contains("M-VGMDB-AL-37130-4", 0.1)
        Contains("M-VGMDB-AL-37130-5", 0.1)
        Contains("M-VGMDB-AL-37130-6", 0.1)

        Contains("M-VGMDB-AL-49423-8", 0.2)

        Contains("M-VGMDB-AL-78339-2", 0.1)
    }

    Entry {
        id = "M-VGMDB-AR-17551"
        title = "Saito Shuka"

        Contains(ImageVocalContainFactor) {
            Contains("M-VGMDB-AL-97692")
        }
    }

    Entry {
        id = "M-VGMDB-AR-29323"
        title = "Maeda Kaori"

        Contains("M-VGMDB-AR-29922", NijiOldGirlContainFactor)
        Contains(ImageVocalContainFactor) {
            Contains("M-VGMDB-AL-99272-3", ImageVocalContainFactor)
        }
    }

    Entry {
        id = "M-VGMDB-AR-29640"
        title = "Onishi Aguri"

        Contains("M-VGMDB-AR-29922", NijiOldGirlContainFactor)
        Contains(ImageVocalContainFactor) {
            Contains("M-VGMDB-AL-80802-2")
            Contains("M-VGMDB-AL-87198-1")
            Contains("M-VGMDB-AL-99272-1")
            Contains("M-VGMDB-AL-112929-2")
        }
    }

    Entry {
        id = "M-VGMDB-AR-27779"
        title = "Kusunoki Tomori"

        Contains("M-VGMDB-AR-29922", NijiOldGirlContainFactor)
        Contains(ImageVocalContainFactor) {
            Contains("M-VGMDB-AL-80802-8")
            Contains("M-VGMDB-AL-87198-7")
            Contains("M-VGMDB-AL-99272-7")
        }
    }

    Entry {
        id = "M-VGMDB-AR-26954"
        title = "Tanaka Chiemi"

        Contains("M-VGMDB-AR-29922", NijiOldGirlContainFactor)
        Contains(ImageVocalContainFactor) {
            Contains("M-VGMDB-AL-80802-10")
        }
    }

    Entry {
        id = "M-VGMDB-AR-16469"
        title = "TrySail"

        Contains(ImageVocalContainFactor) {
            Entry {
                id = "M-VGMDB-AL-69147"
                title = "TAILWIND"

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

        Contains(ImageVocalContainFactor) {
            Contains("M-VGMDB-AL-23391")
            Contains("M-VGMDB-AL-41292")
            Contains("M-VGMDB-AL-89431")

            // colorful remixes
            Contains(0.5) {
                Contains("M-7")
                Contains("M-8")
            }

            Entry {
                id = "M-VGMDB-AL-77471"
                title = "CheerS"

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

        Contains(ImageVocalContainFactor) {
            Entry {
                id = "M-VGMDB-AL-41278"
                title = "lull ~Soshite Bokura wa~"

                SubIDEntry("1") {
                    Music(0.75)
                }
            }

            Entry {
                id = "M-VGMDB-AL-42900"
                title = "ebb and flow"

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

        Contains(ImageVocalContainFactor) {
            Entry {
                id = "M-VGMDB-AL-41280"
                title = "Aqua Terrarium"

                SubIDEntry("1") {
                    Music(0.75)
                }
            }

            Entry {
                id = "M-VGMDB-AL-43164"
                title = "Mitsuba no Musubime"

                SubIDEntry("1") {
                    Music(0.75)
                }
            }

            Entry {
                id = "M-VGMDB-AL-37932"
                title = "Yukitoki"

                SubIDEntry("1") {
                    Music(2.0)
                }
            }

            Entry {
                id = "M-VGMDB-AL-51516"
                title = "Harumodoki"

                SubIDEntry("1") {
                    Music(2.5)
                    Remix("M-VGMDB-AL-106577-6")
                }
            }

            Entry {
                id = "M-VGMDB-AL-96288"
                title = "Megumi no Ame"

                SubIDEntry("1") {
                    Music(3.0)
                }
            }

            Entry {
                id = "M-VGMDB-AL-70716"
                title = "over and over"

                SubIDEntry("1") {
                    Music(5.0)
                }
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-12665"
        title = "Komatsu Mikako"

        Contains(ImageVocalContainFactor) {
            Contains("M-VGMDB-AL-45187-1")
        }
    }

    Entry {
        id = "M-VGMDB-AR-18208"
        title = "Takada Yuuki"

        Contains("M-46", 0.25)
        Contains("M-17", 1.0 / 9.0)
        Contains(ImageVocalContainFactor) {
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

        Contains(ImageVocalContainFactor) {
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

        Contains(ImageVocalContainFactor) {
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

        Contains(ImageVocalContainFactor) {
            Contains("M-VGMDB-AL-48199")
        }
    }

    Entry {
        id = "M-VGMDB-AR-"
        title = "Sawai Miku"

        Contains(ImageVocalContainFactor) {
            Entry {
                id = "M-VGMDB-AL-49446"
                title = "Colorful."

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

        Contains(ImageVocalContainFactor) {
            // Sanshuu Chuugaku Yuushabu (post-Sonoko)
            Contains(1.0 / 5.0) {
                Contains("M-VGMDB-AL-114186")
            }
        }

        Contains(ImageVocalContainFactor) {
            //sora yori group
            Contains(1.0 / 4.0) {
                Contains("M-VGMDB-AL-73544")
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-10253"
        title = "Mimori Suzuko"

        Contains(ImageVocalContainFactor) {
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
        Contains(ImageVocalContainFactor) {
            Contains("M-18", 1.0 / 4.0)
            Contains("M-VGMDB-AR-32295", 1.0 / 51.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-30564"
        title = "Tono Hikaru"

        // chao e co gai hoan tinh
        Contains(ImageVocalContainFactor) {
            Contains("M-20", 1.0 / 4.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-26886"
        title = "WEAVER"

        Contains(ImageVocalContainFactor) {
            // lemur
            Entry {
                id = "M-VGMDB-AL-51918"
                title = "Kuchizuke Diamond"

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

        Contains(ImageVocalContainFactor) {
            Entry {
                id = "M-VGMDB-AL-52045"
                title = "CANDY MAGIC"

                SubIDEntry("1") {
                    Music(1.0)
                }
            }

            Entry {
                id = "M-VGMDB-AL-59371"
                title = "hare bare fanfare"

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
        Contains("M-VGMDB-AL-69257", ImageVocalContainFactor * 0.8)
    }

    Entry {
        id = "M-VGMDB-AR-15121"
        title = "Yonezu Kenshi"

        // vocal: ImageVocalContainFactor * 0.2
        // music + lyrics + arrangement: 0.5 * (1.0 - ImageVocalContainFactor)
        Contains(
            "M-VGMDB-AL-69257",
            ImageVocalContainFactor * 0.2 +
                    0.5 * (1.0 - ImageVocalContainFactor)
        )
    }

    Entry {
        id = "M-VGMDB-AL-69257"
        title = "Uchiage Hanabi"

        SubIDEntry("1") {
            Music(2.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-11952"
        title = "LiSA"

        Contains(ImageVocalContainFactor) {
            Entry {
                id = "M-VGMDB-AL-33537"
                title = "crossing field"

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

        // backing vocal for akogare future sign (tv ver.)
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

        Contains(ImageVocalContainFactor) {
            Contains("M-VGMDB-AL-47402")
        }
    }

    Entry {
        id = "M-VGMDB-AR-29251"
        title = "Iwahashi Yuka"

        // t̷̤̀h̵̙̰̒ẽ̷̥̋ ̶̺͔̌͘h̴̡̜̐̎o̴̥͉͒̊n̴͕̈́̎ǰ̷̢͜ő̸̞͎̈ủ̵͔ͅ ̴͔̘̏k̸̛͉̉a̵̯̣͑͆ŝ̴̝u̶͉̠̎̂m̵̞͛i̷͙͉͋ ̴̨̥̓ḯ̵͖̺n̷̲̉̌c̷̪̓i̴̢͎̋d̵̬͛e̸̗̓ń̷͓̤͠t̷̮̭̄̐
        Contains(ImageVocalContainFactor) {
            Contains("M-50", 1.0 / 9.0)
            Contains("M-VGMDB-AR-30829", 1.0 / 6.0)
        }
    }

    Entry {
        id = "M-VGMDB-AR-9797"
        title = "Aoi Yuki"

        Contains(ImageVocalContainFactor) {
            // petit milady
            Contains(1.0 / 2.0) {
                Entry {
                    id = "M-VGMDB-AL-78478"
                    title = "360° Hoshi no Orchestra"

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
}