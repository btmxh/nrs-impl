package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.Bandori() {
    // gen1 sb69
    Entry {
        id = "F-VGMDB-5173"
        title = "BanG Dream!"

        Entry {
            id = "M-VGMDB-AL-60358"
            title = "STAR BEAT! ~Hoshi no Kodou~"

            SubIDEntry("1") {
                Music(4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-63624"
            title = "Tokimeki Experience!"

            SubIDEntry("1") {
                Music(1.5)
            }

            SubIDEntry("2", "1000 kai Urunda Sora") {
                Music(6.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-81504"
            title = "KIZUNA MUSIC♪"

            // based method got first prize
            // truly a gigachad
            Meme(0.75, Meme.M2_3Months) {
                contributors["M-VGMDB-AL-81504-1"] = 0.4
                contributors["M-VGMDB-AL-104673-1"] = 0.1
            }

            SubIDEntry("1") {
                // this song got memed in the rst-sb69 era because of two things
                // (update: it's still somewhat huge in arc 3 because method, but
                // bridge to dream is better cope bandofags)
                // kizuna method ("method" is a name of my junior in my High School) (major reason)
                // kizunya music (cat music is any song with the cat from sb69) (very minor reason)

                // itsuka...
                // mot ngay method, se thap sang tuong lai mai sau
                // mot bai ca, lung linh trong long cua ban voi toi
                // va roi method mang bao huy chuong vang
                // va roi method mang lai su huy hoang
                // tu hao qua em toi nguoi thap len anh cau vong
                // nguoi mang den trai tim ta
                // bau... troi... mo... uoc
                Music(5.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-111089"
            title = "Live Beyond!!"

            SubIDEntry("5", "Koko kara Saki wa Uta ni Naranai") {
                Music(4.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-74133"
            title = "CiRCLiNG"

            SubIDEntry("2", "Light Delight") {
                // naite naite
                // daite daite
                Music(6.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-95118"
            title = "Initial/Yume wo Uchinuku Shunkan ni!"

            SubIDEntry("2", "Yume wo Uchinuku Shunkan ni!") {
                Music(3.0)
                // iykyk
                Meme(0.05, Meme.M1_2Weeks)
            }
        }

        Entry {
            id = "M-VGMDB-AR-27992"
            title = "Poppin'Party"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-60358")
                Contains("M-VGMDB-AL-63624")
                Contains("M-VGMDB-AL-81504")
                Contains("M-VGMDB-AL-111089")
                Contains("M-VGMDB-AL-74133")
                Contains("M-VGMDB-AL-95118")
            }

            Contains("M-VGMDB-AL-106577-1", 0.6)
        }

        Entry {
            id = "M-VGMDB-AL-85172"
            title = "FIRE BIRD"

            SubIDEntry("1") {
                Music(3.5)
            }
        }

        Entry {
            id = "M-VGMDB-AR-27993"
            title = "Roselia"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-85172")
            }
        }

        Entry {
            id = "M-VGMDB-AR-31328"
            title = "Pastel*Palletes"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-106577-6")
                Contains("M-35", 1.0 / 3)
            }
        }

        Entry {
            id = "M-VGMDB-AR-31329"
            title = "Hello, Happy World!"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-114399-8")
            }
        }

        Entry {
            id = "M-VGMDB-AL-82743"
            title = "Y.O.L.O"

            SubIDEntry("1") {
                Music(3.5)
                OsuSong(personal = 7.0)
            }
        }

        Entry {
            id = "M-VGMDB-AR-31326"
            title = "Afterglow"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-82743")
            }
        }

        // mixed albums
        Entry {
            id = "M-VGMDB-AL-106577"
            title = "BanG Dream! Girls Band Party! Cover collection vol.5"

            SubIDEntry("1", "Cherry Bomb") {
                Music(3.0)
                OsuSong(personal = 6.0)
            }

            SubIDEntry("6", "Harumodoki") {
                Music(2.5)
                OsuSong(personal = 5.0)

                Remix("M-35")
            }
        }

        Entry {
            id = "M-VGMDB-AL-114399"
            title = "BanG Dream! Girls Band Party! Cover collection vol.6"

            SubIDEntry("8", "Silhouette") {
                Music(5.0)
                OsuSong(personal = 5.5)
            }
        }

        // bandori has some good comedy shit
        NEI(7.5, Emotion.AP) {
            // the game also contributes, so the sum of weights is not 1
            contributors["A-MAL-33573"] = 0.5
            contributors["A-MAL-37869"] = 0.3
        }

        KilledBy("A-MAL-40879") {
            contributors["A-MAL-33573"] = 0.4
            contributors["A-MAL-37869"] = 0.6
        }

        Entry {
            id = "A-MAL-33573"
            title = "BanG Dream!"
            bestGirl = "Ichigaya Arisa"
            // Ending pretty sadge
            NEI(6.0, Emotion.CU)
            // nrs1
            Meme(0.2, Meme.M4_7Days)
            Boredom(Boredom.Completed)

            FeatureMusic("M-VGMDB-AL-63624-1")

        }

        Entry {
            id = "A-MAL-37869"
            title = "BanG Dream! 2nd Season"
            bestGirl = "Ichigaya Arisa"
            // nrs1
            Meme(0.15, Meme.M1_3Days)
            // rip
            Boredom(Boredom.Dropped)
            FeatureMusic("M-VGMDB-AL-81504-1")
        }
    }

    Entry {
        id = "M-VGMDB-AR-31509"
        title = "SILENT SIREN"

        Entry {
            id = "M-32"
            title = "S"

            Entry {
                id = "M-33"
                title = "Cherry Bomb"

                Music(2.5)
                Remix("M-VGMDB-AL-106577-1")
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-25291"
        title = "KANA-BOON"

        Entry {
            id = "M-VGMDB-AL-50721"
            title = "Silhouette"

            SubIDEntry("1") {
                Music(4.0)
                Remix("M-VGMDB-AL-114399-8")
            }
        }
    }

    Entry {
        id = "M-35"
        title = "Harumodoki (Asterisk DnB Remix) [Rakakun- Edit]"

        Music(2.5)
    }
}