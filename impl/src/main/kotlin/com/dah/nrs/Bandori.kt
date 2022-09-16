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

            Visual(VisualKind.AlbumArt, 0.5, 0.1)

            SubIDEntry("1") {
                Music(4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-63624"

            Visual(VisualKind.AlbumArt, 0.25, 0.2)

            SubIDEntry("1") {
                Music(1.5)
            }

            SubIDEntry("2") {
                Music(6.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-81504"

            Visual(VisualKind.AlbumArt, 0.15, 0.4)

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

            Visual(VisualKind.AlbumArt, 0.6, 0.15)

            SubIDEntry("5") {
                Music(4.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-74133"

            Visual(VisualKind.AlbumArt, 0.35, 0.15)

            SubIDEntry("2") {
                // naite naite
                // daite daite
                Music(6.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-95118"

            // special edition: https://vgmdb.net/album/95118
            Visual(VisualKind.AlbumArt, 0.35, 0.15)
            // kirakira ver: https://vgmdb.net/album/92053
            Visual(VisualKind.AlbumArt, 0.3, 0.15)
            // dokidoki ver: https://vgmdb.net/album/92051
            Visual(VisualKind.AlbumArt, 0.45, 0.1)

            SubIDEntry("2") {
                Music(3.0)
                // iykyk
                Meme(0.05, 10)
            }
        }

        Entry {
            id = "M-VGMDB-AR-27992"

            Contains(MusicVocalImageContainFactor) {
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

            Visual(VisualKind.AlbumArt, 0.2, 0.6)

            SubIDEntry("1") {
                Music(3.5)
            }
        }

        Entry {
            id = "M-VGMDB-AR-27993"

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-85172")
            }
        }

        Entry {
            id = "M-VGMDB-AR-31328"

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-106577-6")
                Contains("M-35", 1.0 / 3)
            }
        }

        Entry {
            id = "M-VGMDB-AR-31329"

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-114399-8")
            }
        }

        Entry {
            id = "M-VGMDB-AL-82743"

            Visual(VisualKind.AlbumArt, 0.25, 0.15)

            SubIDEntry("1") {
                Music(3.5)
                OsuSong(personal = 7.0)
            }
        }

        Entry {
            id = "M-VGMDB-AR-31326"

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-82743")
            }
        }

        // mixed albums
        Entry {
            id = "M-VGMDB-AL-106577"

            Visual(VisualKind.AlbumArt, 0.5, 0.1)

            SubIDEntry("1") {
                Music(3.0)
                OsuSong(personal = 6.0)
            }

            SubIDEntry("6") {
                Music(2.5)
                OsuSong(personal = 5.0)

                Remix("M-35")
            }
        }

        Entry {
            id = "M-VGMDB-AL-114399"

            Visual(VisualKind.AlbumArt, 0.45, 0.1)

            SubIDEntry("8") {
                Music(5.0)
                OsuSong(personal = 5.5)
            }
        }

        Entry {
            id = "M-VGMDB-AR-31336"

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-101643")
            }
        }

        Entry {
            id = "M-VGMDB-AL-101643"

            Visual(VisualKind.AlbumArt, 0.2, 0.3)
            SubIDEntry("1") {
                Music(4.0)
            }
        }

        // bandori has some good comedy shit
        AEI(2.0, Emotion.AP) {
            contributors["A-MAL-33573"] = 0.5
            contributors["A-MAL-37869"] = 0.3
            contributors["G-VGMDB-5172 [null entry]"] = 0.2
        }

        Entry {
            id = "A-MAL-33573"
            bestGirl = "Ichigaya Arisa"
            // Ending pretty sadge
            AEI(2.0, Emotion.CU)
            // nrs1
            Meme(0.2, 6)
            AnimeProgressOld(Boredom.Completed, 13)

            Visual(VisualKind.Animated, 0.4, 0.4)

            FeatureMusic("M-VGMDB-AL-63624-1")
            KilledBy("F-VGMDB-2588", potential = 0.5, effect = 0.5)
        }

        Entry {
            id = "A-MAL-37869"
            bestGirl = "Ichigaya Arisa"
            // nrs1
            Meme(0.15, 2)

            // cg lmfao
            Visual(VisualKind.Animated, 0.15, 0.5)
            // rip
            AnimeProgressOld(Boredom.Dropped, 6)
            FeatureMusic("M-VGMDB-AL-81504-1")
            KilledBy("F-VGMDB-2588", potential = 0.2, effect = 0.5)
        }
    }

    Entry {
        id = "M-VGMDB-AR-31509"

        Entry {
            id = "M-32"
            title = "S"
            ValidatorSuppress("dah-entry-no-consumed")

            // 3d girl ew /s
            Visual(VisualKind.AlbumArt, 0.1, 0.15)

            Entry {
                id = "M-33"
                title = "Cherry Bomb"

                // Length source: https://open.spotify.com/track/5KhTHcY2WuCHy21jhxTFAP
                MusicConsumedProgress("4:05") // impl_overridden
                Music(2.5)
                Remix("M-VGMDB-AL-106577-1")
            }
        }
    }

    Entry {
        id = "M-VGMDB-AR-25291"

        Entry {
            id = "M-VGMDB-AL-50723"

            // 3d men ew /s
            Visual(VisualKind.AlbumArt, 0.08, 0.175)

            SubIDEntry("1") {
                Music(4.0)
                Remix("M-VGMDB-AL-114399-8")
            }
        }
    }

    Entry {
        id = "M-35"
        title = "Harumodoki (Asterisk DnB Remix) [Rakakun- Edit]"

        // Length source: https://osu.ppy.sh/beatmapsets/1034608#osu/2163138
        MusicConsumedProgress("2:15") // impl_overridden
        Music(2.5)
    }
}
