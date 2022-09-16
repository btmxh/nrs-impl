package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

// niji originally has 9 girls, then shioriko, lanzhu, mia joined to make it 12
// so the contain factor of the 9 original girls will be 1.5x the new girls
// doing the math, we got these:
private const val NijiNewOldRate = 1.5
const val NijiNewGirlsContainFactor = 1.0 / (9 * NijiNewOldRate + 3)
const val NijiOldGirlContainFactor = NijiNewGirlsContainFactor * NijiNewOldRate

fun DSLScope.LoveLive() {
    Entry {
        id = "F-VGMDB-2588"
        title = "Love Live!"

        Entry {
            id = "M-VGMDB-AL-34051"

            Visual(VisualKind.AlbumArt, 0.1, 0.5)

            SubIDEntry("1") {
                Music(2.5)
                Meme(0.1, 6)
                // osu! | Will Stetson - Snow Halation (feat. BeasttrollMC)
                // [Reform's Expert] +HDDT FC 417pp
            }
        }

        Entry {
            id = "M-VGMDB-AL-36547"

            Visual(VisualKind.AlbumArt, 0.25, 0.4)

            SubIDEntry("1") {
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-75504"

            Visual(VisualKind.AlbumArt, 0.2, 0.4)

            SubIDEntry("2") {
                Music(4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-93532"

            Visual(VisualKind.AlbumArt, 0.25, 0.4)

            SubIDEntry("1") {
                Music(5.0)
            }
        }

        Entry {
            id = "M-VGMDB-AR-13719"

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-34051")
                Contains("M-VGMDB-AL-36547")
                Contains("M-VGMDB-AL-75504")
                Contains("M-VGMDB-AL-93532")
            }
        }

        Entry {
            id = "M-VGMDB-AL-58147"

            Visual(VisualKind.AlbumArt, 0.25, 0.4)

            SubIDEntry("1") {
                Music(4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-58750"

            Visual(VisualKind.AlbumArt, 0.25, 0.4)

            SubIDEntry("1") {
                Music(3.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-70622"

            Visual(VisualKind.AlbumArt, 0.25, 0.4)

            SubIDEntry("1") {
                Music(6.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-71404"

            Visual(VisualKind.AlbumArt, 0.25, 0.4)

            SubIDEntry("2") {
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-78378"

            Visual(VisualKind.AlbumArt, 0.25, 0.4)

            SubIDEntry("1") {
                Music(3.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-87199"

            Visual(VisualKind.AlbumArt, 0.25, 0.4)

            SubIDEntry("1") {
                Music(4.5)
            }
        }


        Entry {
            id = "M-VGMDB-AR-17153"

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-58147")
                Contains("M-VGMDB-AL-58750")
                Contains("M-VGMDB-AL-70622")
                Contains("M-VGMDB-AL-71404")
                Contains("M-VGMDB-AL-78378")
                Contains("M-VGMDB-AL-87199")
            }
        }

        Entry {
            id = "M-VGMDB-AL-97692"

            Visual(VisualKind.AlbumArt, 0.2, 0.4)

            SubIDEntry("1") {
                Music(4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-102276"

            Visual(VisualKind.AlbumArt, 0.6, 0.25)

            SubIDEntry("1") {
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-102277"

            Visual(VisualKind.AlbumArt, 0.6, 0.25)

            SubIDEntry("1") {
                Music(6.5)
            }
        }

        Entry {
            id = "M-VGMDB-AR-29922"

            Contains(MusicVocalImageContainFactor) {
                Contains("M-VGMDB-AL-102276")
                Contains("M-VGMDB-AL-102277")

                Contains("M-VGMDB-AL-80802-1")
                Contains("M-VGMDB-AL-87198-1")
                Contains("M-VGMDB-AL-99272-12")
            }
        }

        Entry {
            id = "M-VGMDB-AL-80802"

            Visual(VisualKind.AlbumArt, 0.3, 0.6)

            SubIDEntry("1") {
                Music(3.0)
            }

            SubIDEntry("2") {
                Music(0.5)
            }

            SubIDEntry("8") {
                Music(1.5)
            }

            SubIDEntry("10") {
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-87198"

            Visual(VisualKind.AlbumArt, 0.3, 0.6)

            SubIDEntry("10") {
                Music(3.0)
            }

            SubIDEntry("1") {
                Music(2.0)
            }

            SubIDEntry("7") {
                Music(4.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-99272"

            Visual(VisualKind.AlbumArt, 0.3, 0.6)

            SubIDEntry("12") {
                Music(4.0)
            }

            SubIDEntry("1") {
                Music(2.5)
            }

            SubIDEntry("3") {
                Music(2.5)
            }

            SubIDEntry("7") {
                Music(5.5)
                OsuSong(personal = 3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-112929"

            Visual(VisualKind.AlbumArt, 0.3, 0.6)

            SubIDEntry("2") {
                Music(4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-102281"
                    " Kasumi Nakasu (CV. Mayu Sagara), Setsuna Yuki (CV. Tomori Kusunoki)" +
                    " from Nijigasaki High School Idol Club [Ayumu Uehara Edition]"

            Visual(VisualKind.AlbumArt, 0.65, 0.25)

            // the first ayumu-era theme song
            SubIDEntry("1") {
                Music(1.0)
                Impact {
                    // the song is shit
                    // but it started the most colorful era in autism history
                    // the ayumu era
                    description = "tobitateru dreaming sky"
                    score = vector {
                        set(Emotion.AP, 0.5)
                    }
                }
            }
        }

        Entry {
            id = "M-VGMDB-AL-104783"

            Visual(VisualKind.AlbumArt, 0.65, 0.25)

            SubIDEntry("1") {
                Music(1.25)
            }
        }

        Entry {
            id = "M-VGMDB-AR-37385"
            // Liella hasn't got any notable songs
            // also they got fucked in the rst-sb69 duopoly era because
            // rst is a fucking nazi
        }

        // shared memes between SIP (school idol project) and Sunshine
        Meme(0.6, 18) {
            contributors["A-MAL-15051"] = 0.2
            contributors["A-MAL-19111"] = 0.2
            contributors["A-MAL-24997"] = 0.1
            contributors["A-MAL-32526"] = 0.2
            contributors["A-MAL-34973"] = 0.2
            contributors["A-MAL-37027"] = 0.1
        }

        // le "song da" analogy
        AKMEraPart1(0.05) {
            contributors["A-MAL-40879"] = 0.25
            contributors["A-MAL-48916"] = 0.35
            contributors["A-MAL-15051"] = 0.05
            contributors["A-MAL-19111"] = 0.05
            contributors["A-MAL-32526"] = 0.05
            contributors["A-MAL-34973"] = 0.05
            contributors["A-MAL-41169"] = 0.05
            contributors["A-MAL-50203"] = 0.05
            contributors["A-MAL-24997"] = 0.05
            contributors["A-MAL-37027"] = 0.05
        }

        // SIP humor
        AEI(8.0, Emotion.AP) {
            contributors["A-MAL-15051"] = 0.4
            contributors["A-MAL-19111"] = 0.4
            contributors["A-MAL-24997"] = 0.2
        }

        AEI(2.5, Emotion.AP) {
            contributors["A-MAL-32526"] = 0.4
            contributors["A-MAL-34973"] = 0.4
            contributors["A-MAL-37027"] = 0.2
        }

        // Anime
        Entry {
            id = "A-MAL-15051"
            bestGirl = "Nishikino Maki"

            FeatureMusic("M-VGMDB-AL-36547-1")
            KilledBy("F-VGMDB-7059", potential = 0.1, effect = 1.0)
            Visual(VisualKind.Animated, 0.25, 0.4)
        }

        Entry {
            id = "A-MAL-19111"
            bestGirl = "Nishikino Maki"

            FeatureMusic("M-VGMDB-AL-34051-1")
            KilledBy("F-VGMDB-7059", potential = 0.1, effect = 1.0)
            Visual(VisualKind.Animated, 0.25, 0.4)
        }

        Entry {
            id = "A-MAL-24997"
            bestGirl = "Nishikino Maki"

            KilledBy("F-VGMDB-7059", potential = 0.1, effect = 1.0)
            Visual(VisualKind.Animated, 0.25, 0.4)
        }

        Entry {
            id = "A-MAL-32526"
            bestGirl = "Sakurauchi Riko"
            FeatureMusic("M-VGMDB-AL-58147-1")
            FeatureMusic("M-VGMDB-AL-58750-1")
            KilledBy("F-VGMDB-7059", potential = 0.15, effect = 1.0)
            Visual(VisualKind.Animated, 0.25, 0.4)
        }

        Entry {
            id = "A-MAL-34973"
            bestGirl = "Sakurauchi Riko"
            // aozora was featured in ep13
            FeatureMusic("M-VGMDB-AL-58147-1")
            FeatureMusic("M-VGMDB-AL-70622-1")
            KilledBy("F-VGMDB-7059", potential = 0.15, effect = 1.0)
            Visual(VisualKind.Animated, 0.25, 0.4)
        }

        Entry {
            id = "A-MAL-37027"
            bestGirl = "Sakurauchi Riko"
            KilledBy("F-VGMDB-7059", potential = 0.15, effect = 1.0)
            Visual(VisualKind.Animated, 0.25, 0.4)
        }

        // niji arcs

        // arc 1 - the girl who changed the world
        Waifu("Uehara Ayumu", "2020-11-02" to "2021-02-15") {
            contributors["A-MAL-40879"] = 0.9
            contributors["M-VGMDB-AL-102281-1"] = 0.1
        }

        // arc 2 - the girl without screentime
        NEI(8.0, Emotion.AU to 0.5, Emotion.CU to 0.4, Emotion.AP to 0.1) {
            contributors["A-MAL-40879"] = 0.8
            contributors["M-VGMDB-AL-43320-8"] = 0.1
            contributors["M-VGMDB-AL-34269-7"] = 0.1
        }

        // arc 3 - the ayumu dead people arc
        // niji got carried hard by kano in this arc
        PADS(7, Emotion.CU) {
            contributors["A-MAL-40879"] = 0.6
            contributors["M-VGMDB-AL-37130-3"] = 0.4
        }

        // arc 4 - and then, the world has ended
        // "Soshite kimi ga shirazu ni"
        // When Ayumu-era ends, I felt depressed
        PADS(5, Emotion.CU) {
            contributors["A-MAL-40879"] = 0.7
            contributors["M-MAL-36631-6"] = 0.15
            contributors["M-41"] = 0.075
            contributors["M-43"] = 0.05
            contributors["M-VGMDB-AL-89290-6"] = 0.025
        }

        Entry {
            id = "A-MAL-40879"
            bestGirl = "Uehara Ayumu"
            seasonal = true

            // pretty funny ngl, but overshadowed by the ayumu shit
            AEI(4.0, Emotion.AP)
            Visual(VisualKind.Animated, 0.6, 0.25)

            Meme(1.0, numDays("2020-10-17" /*airtime of episode 3*/, "2021-02-01"))

            KilledBy("M-VGMDB-AR-11666", potential = 0.3, effect = 0.5)
            KilledBy("F-VGMDB-7059", potential = 0.15, effect = 1.0)

            FeatureMusic("M-VGMDB-AL-102276-1")
            FeatureMusic("M-VGMDB-AL-102277-1")
            FeatureMusic("M-VGMDB-AL-102281-1")
            FeatureMusic("M-VGMDB-AL-104783-1")
        }

        Entry {
            id = "A-MAL-41169"
            // insert wakeshima kanon is shibuya kanon joke here
            bestGirl = "Arashi Chisato"
            seasonal = true
            AnimeProgressOld(Boredom.TempOnHold, 7)
            Meme(0.3, 6)
            KilledBy("A-MAL-41530", potential = 0.6, effect = 0.25)
            KilledBy("F-VGMDB-7059", potential = 0.6, effect = 1.0)
            Visual(VisualKind.Animated, 0.6, 0.25)
        }

        NEI(7.5, Emotion.AP) {
            // guys did you see that, it's her, my favorite school idol of all time,
            // tsukisaka sayu! wdym by kanata konoe, who tf is that? i only know sayu!
            // sayu is my love, she saved me from my one-year-old depression and showed
            // me how beautiful this world is. and her unit, kirare, is such a beautiful
            // unit with perfect chemistry. imagine watching love live and getting fucked
            // in the ass by lantis cocksuckers xdddddddddddddddd
            // all niji funny shits come from konoe kanata references
            contributors["A-MAL-48916"] = 0.5
            contributors["A-MAL-38009"] = 0.4
            contributors["GF-VGMDB-7059"] = 0.1
        }

        // it has to happen
        // sorry love live fans, rst got them
        // i tried to watch niji in peace, but i failed
        // the leftover hate from s1 and the heisenberg bs from s2 is just too much
        // update: the azuna episode kinda did its thing
        NEI(-5.0, Emotion.MU to 0.5, Emotion.AU to 0.5) {
            contributors["A-MAL-40879"] = 0.3
            contributors["A-MAL-48916"] = 0.6
            contributors["A-MAL-15051"] = 0.1 / 6
            contributors["A-MAL-19111"] = 0.1 / 6
            contributors["A-MAL-24997"] = 0.1 / 6
            contributors["A-MAL-32526"] = 0.1 / 6
            contributors["A-MAL-34973"] = 0.1 / 6
            contributors["A-MAL-37027"] = 0.1 / 6
        }

        Entry {
            id = "A-MAL-48916"

            bestGirl = "Kanata Konoe"

            // jk
            bestGirl = "Uehara Ayumu"
            Visual(VisualKind.Animated, 0.6, 0.25)

            // lol after all this time xddddddddddd
            AnimeProgressOld(Boredom.Dropped, 3)
            KilledBy("F-VGMDB-7059", potential = 0.8, effect = 1.0)
        }

        Entry {
            id = "A-MAL-50203"

            bestGirl = "Arashi Chisato"
            KilledBy("A-MAL-41530", potential = 0.6, effect = 0.25)
            KilledBy("F-VGMDB-7059", potential = 0.6, effect = 1.0)
            Visual(VisualKind.Animated, 0.6, 0.25)
            ValidatorSuppress("dah-entry-no-consumed")
        }
    }

    Entry {
        id = "M-45"
        title = "Snow Halation (feat. BeasttrollMC)"

        Meme(0.03, 6)
        // osu! | Will Stetson - Snow Halation (feat. BeasttrollMC)
        // [Reform's Expert] +HDDT FC 417pp
        Remix("M-VGMDB-AL-34051-1")

        // hmm should i pick the dt length or the normal length :tf:
        // Length source: https://www.youtube.com/watch?v=m6bYJ17psmg
        MusicConsumedProgress("1:56")
    }
}

