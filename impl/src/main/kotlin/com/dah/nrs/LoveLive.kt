package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.dsl.vector
import com.dah.nrs.exts.*

// niji originally has 9 girls, then shioriko, lanzhu, mia joined to make it 12
// so the contain factor of the 9 original girls will be 1.5x the new girls
// doing the math, we got these:
private const val NijiNewOldRate = 1.5
val NijiNewGirlsContainFactor = 1.0 / (9 * NijiNewOldRate + 3)
val NijiOldGirlContainFactor = NijiNewGirlsContainFactor * NijiNewOldRate

fun DSLScope.LoveLive() {
    Entry {
        id = "F-VGMDB-2588"
        title = "Love Live!"

        Entry {
            id = "M-VGMDB-AL-34051"
            title = "Snow halation"

            SubIDEntry("1") {
                Music(2.5)
                Meme(0.1, Meme.M4_7Days)
                // osu! | Will Stetson - Snow Halation (feat. BeasttrollMC)
                // [Reform's Expert] +HDDT FC 417pp
            }
        }

        Entry {
            id = "M-VGMDB-AL-36547"
            title = "Bokura wa Ima no Naka de"

            SubIDEntry("1") {
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-75504"
            title = "Music S.T.A.R.T!!"

            SubIDEntry("2", "LOVELESS WORLD") {
                Music(4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-93532"
            title = "A song for You! You? You!!"

            SubIDEntry("1") {
                Music(5.0)
            }
        }

        Entry {
            id = "M-VGMDB-AR-13719"
            title = "μ's"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-34051")
                Contains("M-VGMDB-AL-36547")
                Contains("M-VGMDB-AL-75504")
                Contains("M-VGMDB-AL-93532")
            }
        }

        Entry {
            id = "M-VGMDB-AL-58147"
            title = "Aozora Jumping Heart"

            SubIDEntry("1") {
                Music(5.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-58750"
            title = "Kimeta yo Hand in Hand/Daisuki Dattara Daijoubu!"

            SubIDEntry("1", "Kimeta yo Hand in Hand") {
                Music(3.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-70622"
            title = "Yuuki wa Doko ni? Kimi no Mune ni!"

            SubIDEntry("1") {
                Music(6.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-71404"
            title = "MY MAI☆TONIGHT/MIRACLE WAVE"

            SubIDEntry("2", "MIRACLE WAVE") {
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-78378"
            title = "Thank you, FRIENDS!!"

            SubIDEntry("1") {
                Music(5.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-87199"
            title = "Mitaiken HORIZON"

            SubIDEntry("1") {
                Music(4.5)
            }
        }


        Entry {
            id = "M-VGMDB-AR-17153"
            title = "Aqours"

            Contains(ImageVocalContainFactor) {
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
            title = "LoveLive! Sunshine!! Watanabe You First Solo Concert ALBUM ~Beginner's Sailing~"

            SubIDEntry("1", "Beginner's Sailing") {
                Music(4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-102276"
            title = "Nijiiro Passions!"

            SubIDEntry("1") {
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-102277"
            title = "NEO SKY, NEO MAP!"

            SubIDEntry("1") {
                Music(6.5)
            }
        }

        Entry {
            id = "M-VGMDB-AR-29922"
            title = "Nijigasaki High School Idol Club"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-102276")
                Contains("M-VGMDB-AL-102277")

                Contains("M-VGMDB-AL-80802-1")
                Contains("M-VGMDB-AL-87198-1")
                Contains("M-VGMDB-AL-99272-12")
            }
        }

        Entry {
            id = "M-VGMDB-AL-80802"
            title = "TOKIMEKI Runners"

            SubIDEntry("1") {
                Music(3.0)
            }

            SubIDEntry("2", "Yume e no Ippo") {
                Music(0.5)
            }

            SubIDEntry("8", "CHASE!") {
                Music(1.5)
            }

            SubIDEntry("10", "Dokipipo☆Emotion") {
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-87198"
            title = "Love U my friends"

            SubIDEntry("10") {
                Music(3.0)
            }

            SubIDEntry("1", "Kaika Sengen") {
                Music(2.0)
            }

            SubIDEntry("7", "MELODY") {
                Music(4.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-99272"
            title = "Just Believe!!!"

            SubIDEntry("12") {
                Music(4.0)
            }

            SubIDEntry("1", "Say Good-Bye Namida") {
                Music(2.5)
            }

            SubIDEntry("3", "Yagate Hitotsu no Monogatari") {
                Music(2.5)
            }

            SubIDEntry("7", "LIKE IT! LOVE IT!") {
                Music(5.5)
                OsuSong(personal = 3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-112929"
            title = "L!L!L! (Love the Life We Live)"

            SubIDEntry("2", "Break The System") {
                Music(6.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-102281"
            title = "Dream with You/Poppin' Up!/DIVE! / Ayumu Uehara (CV. Aguri Onishi)," +
                    " Kasumi Nakasu (CV. Mayu Sagara), Setsuna Yuki (CV. Tomori Kusunoki)" +
                    " from Nijigasaki High School Idol Club [Ayumu Uehara Edition]"

            // the first ayumu-era theme song
            SubIDEntry("1", "Dream with You") {
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
            title = "Awakening Promise/Yume ga Koko kara Hajimaru yo"

            SubIDEntry("1", "Awakening Promise") {
                Music(1.25)
            }
        }

        Entry {
            id = "M-VGMDB-AR-37385"
            title = "Liella!"
            // Liella hasn't got any notable songs
            // also they got fucked in the rst-sb69 duopoly era because
            // rst is a fucking nazi
        }

        // shared memes between SIP (school idol project) and Sunshine
        Meme(0.6, Meme.M2_3Weeks) {
            contributors["A-MAL-15051"] = 0.2
            contributors["A-MAL-19111"] = 0.2
            contributors["A-MAL-24997"] = 0.1
            contributors["A-MAL-32526"] = 0.2
            contributors["A-MAL-34973"] = 0.2
            contributors["A-MAL-37027"] = 0.2
        }

        // SIP humor
        NEI(7.0, Emotion.AP) {
            contributors["A-MAL-15051"] = 0.4
            contributors["A-MAL-19111"] = 0.4
            contributors["A-MAL-24997"] = 0.2
        }

        NEI(5.5, Emotion.AP) {
            contributors["A-MAL-32526"] = 0.4
            contributors["A-MAL-34973"] = 0.4
            contributors["A-MAL-37027"] = 0.2
        }

        // Anime
        Entry {
            id = "A-MAL-15051"
            title = "Love Live! School Idol Project"
            bestGirl = "Nishikino Maki"

            FeatureMusic("M-VGMDB-AL-36547-1")
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-19111"
            title = "Love Live! School Idol Project 2nd Season"
            bestGirl = "Nishikino Maki"

            FeatureMusic("M-VGMDB-AL-34051-1")
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-24997"
            title = "Love Live! School Idol Project Movie"
            bestGirl = "Nishikino Maki"

            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-32526"
            title = "Love Live! Sunshine!!"
            bestGirl = "Sakurauchi Riko"
            FeatureMusic("M-VGMDB-AL-58147-1")
            FeatureMusic("M-VGMDB-AL-58750-1")
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-34973"
            title = "Love Live! Sunshine!! 2nd Season"
            bestGirl = "Sakurauchi Riko"
            // aozora was featured in ep13
            FeatureMusic("M-VGMDB-AL-58147-1")
            FeatureMusic("M-VGMDB-AL-70622-1")
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "A-MAL-37027"
            title = "Love Live! Sunshine!! The School Idol Movie: Over the Rainbow"
            bestGirl = "Sakurauchi Riko"
            Boredom(Boredom.Completed)
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
            title = "Love Live! Nijigasaki Gakuen School Idol Doukoukai"
            bestGirl = "Uehara Ayumu"
            seasonal = true

            Meme(1.0, Meme.MMoreThan3Months)
            // pretty funny ngl, but overshadowed by the ayumu shit
            NEI(4.0, Emotion.AP)
            Boredom(Boredom.Completed)

            KilledBy("M-VGMDB-AR-11666")

            FeatureMusic("M-VGMDB-AL-102276-1")
            FeatureMusic("M-VGMDB-AL-102277-1")
            FeatureMusic("M-VGMDB-AL-102281-1")
            FeatureMusic("M-VGMDB-AL-104783-1")
        }

        Entry {
            id = "A-MAL-41169"
            title = "Love Live! Superstar!!"
            // insert wakeshima kanon is shibuya kanon joke here
            bestGirl = "Arashi Chisato"
            seasonal = true
            Boredom(Boredom.TempOnHold)
            Meme(0.3, Meme.M4_7Days)
            KilledBy("A-MAL-41530")
        }
    }

    Entry {
        // will change soon
        id = "M-45"
        title = "Snow Halation (feat. BeasttrollMC)"

        Meme(0.03, Meme.M4_7Days)
        // osu! | Will Stetson - Snow Halation (feat. BeasttrollMC)
        // [Reform's Expert] +HDDT FC 417pp
        Remix("M-VGMDB-AL-34051-1")
    }
}

