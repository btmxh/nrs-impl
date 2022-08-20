package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.YuYuYu() {
    // kirare - happy typhoon and u's - a song for yuyuyu reference
    // somewhat changed da world
    // the start line of the "pleasant revolution"
    Entry {
        id = "F-VGMDB-3245"
        title = "Yuusha de Aru"

        Contains("M-VGMDB-AL-69821-1")

        Entry {
            id = "M-VGMDB-AL-47678"
            title = "Aurora Days"

            Visual(VisualKind.AlbumArt, 0.4, 0.5)

            SubIDEntry("1") {
                Music(1.5)
            }
        }

        Entry {
            id = "M-VGMDB-AL-114186"
            title = "Ashita no Hanatachi"

            Visual(VisualKind.AlbumArt, 0.3, 0.5)

            // the glorious udon stream map
            // sonoko nogizaka46 yubi bouenkyou anime ban fate fiery extreme armin adventure sotarks new adventure
            SubIDEntry("2", "U・D・N") {
                Music(4.0)
                OsuSong(personal = 3.0)
            }
        }

        Meme(0.8, numDays("2021-11-01", "2021-11-20")) {
            contributors["A-MAL-25519"] = 0.5
            contributors["L-MAL-90810"] = 0.3
            contributors["A-MAL-34284"] = 0.06
            contributors["A-MAL-34445"] = 0.08
            contributors["A-MAL-42587"] = 0.06
        }

        // yuyuyu's world building is somewhat scary ngl
        AEI(2.5, Emotion.MU) {
            contributors["A-MAL-25519"] = 0.5
            contributors["L-MAL-90810"] = 0.4
            contributors["A-MAL-34284"] = 0.05
            contributors["A-MAL-34445"] = 0.025
            contributors["A-MAL-42587"] = 0.025
        }

        // koori chikage remained as a meme even after the death
        // of the yuyuyu franchise (blame rst for that)
        // just too based bro, rst and sb69 can't kill her (Clueless)
        // (but vertexes can sadge)
        // update: what do you expect from the second best idol franchise ever,
        // (future number 1 btw) they cucked her sadge
        Meme(0.2, 45) {
            contributors["L-MAL-90810"] = 0.8
            contributors["A-MAL-42587"] = 0.2
        }

        // killed by rst
        KilledBy("F-VGMDB-7059", potential = 0.6, effect = 0.2) {
            contributors["A-MAL-25519"] = 0.5
            contributors["L-MAL-90810"] = 0.3
            contributors["A-MAL-34284"] = 0.06
            contributors["A-MAL-34445"] = 0.08
            contributors["A-MAL-42587"] = 0.06
        }

        Entry {
            id = "A-MAL-25519"    // generated
            idMAL = 25519
            idAniList = 20800
            idAniDB = 10750
            idKitsu = 8638
            title = "Yuuki Yuuna wa Yuusha de Aru"
            bestGirl = "Yuuki Yuuna"
            // The Itsuki thing made me cry I guess, but there's no PADS.
            // YouTube clip: https://www.youtube.com/watch?v=0bjxQMWXsRE
            // ye it's the shelter of yuri yuna now lmao
            Cry(Emotion.CU)

            // The main group is comfy af, and
            // they actually used it to make some sad things.
            // Well I cried at the other Itsuki thing
            // no clip this time
            Cry(Emotion.MP)

            FeatureMusic("M-VGMDB-AL-47678-1")

            // Second anime (after Sora no Method) to (be able to)
            // use OP/ED visual + music to strengthen the sadness.
            // (only the ending tho)
            AEI(2.5, Emotion.CU)
            Visual(VisualKind.Animated, 0.3, 0.5)
            Boredom(Boredom.Completed)
        }

        Entry {
            id = "L-MAL-90810"
            title = "Nogi Wakaba wa Yuusha de Aru"
            // Update Nov 6, 2021:
            // This LN reading progress will be paused to prioritize the anime.
            // Issue #10 will try to make both S3 and NoWaYu LN get all of the
            // scores they deserve.

            // Update Nov 12, 2021:
            // ln killed the franchise kek

            // Update Jan 17, 2022:
            // we are living in the shithole known as
            // the rst-sb69 duopoly era
            // well, at least chikage koori is still a meme

            // based best girl
            bestGirl = "Koori Chikage"
//            status = EntryStatus.Watching

            // There are a lot of sad things in this LN
            // Firstly,
            // Shiratori Utano
            // She is used as a distraction, which is pretty cruel
            // (but that's for the greater good).
            // In the final moments, she said:
            // "I am scared. I really, truly am." (YLIA flashbacks)
            // Secondly,
            // Doi Tamako and Iyojima [Anzu]
            // They died before the group could go to a flower-viewing
            // party (idk how to describe this)
            // Thirdly,
            // Koori Chikage
            // man
            // read the shit and see it for yourself
            // man

            // Overall, this LN spams sad shit everywhere,
            // <strikethrough>(inb4 yuuna got fucked and i cried)</strikethrough>
            // that didn't happen pog
            AEI(3.0, Emotion.CU)

            Boredom(Boredom.Completed)
            Visual(VisualKind.LightNovel, 0.15, 0.5)
        }

        Entry {
            id = "A-MAL-34284"    // generated
            idMAL = 34284
            idAniList = 100791
            idAniDB = 13728
            idKitsu = 12678
            title = "Yuuki Yuuna wa Yuusha de Aru: Washio Sumi no Shou"
            // this was not taken very seriously

            // she looked like best girl ngl
            bestGirl = "Tougou Mimori" // or Sumi Washio

            FeatureMusic("M-VGMDB-AL-69821-1")
            // gin's death (the consequences of the ortensia incident)
            // and sonoko spamming magia are sad
            // but my pepega ass doesn't watch this shit properly ffs
            NEI(5.0, Emotion.CU)

            Boredom(Boredom.Completed)
            Visual(VisualKind.Animated, 0.3, 0.5)
        }

        Entry {
            id = "A-MAL-34445"    // generated
            idMAL = 34445
            idAniList = 97769
            idAniDB = 12500
            idKitsu = 13160
            title = "Yuuki Yuuna wa Yuusha de Aru: Yuusha no Shou"
            // "The Michi Random of Yuuki Yuuna"
            bestGirl = "Yuuki Yuuna"

            // that conversation is peak drama
            // it captures my heart and does make
            // sense (unlike other shits)
            // The fact that Yuuki Yuuna uses the
            // tenets to argue even makes the shit
            // sadder
            // literally the vertex of drama wtf
            //                  ^
            //                  yuyuyu reference !!!11!!1
            AEI(3.0, Emotion.CU)

            Boredom(Boredom.Completed)
            Visual(VisualKind.Animated, 0.3, 0.5)
        }

        Entry {
            id = "A-MAL-42587"    // generated
            idMAL = 42587
            idAniList = 122292
            idAniDB = 15665
            idKitsu = 44333
            title = "Yuuki Yuuna wa Yuusha de Aru: Dai Mankai no Shou"

            seasonal = true
            bestGirl = "Yuuki Yuuna"

            // I expected this to make a new Ayumu-era (something like
            // Yuuna-era or some dumb shit like that), but it doesn't
            // give a fuck by adapting KuMeYu and NoWaYu in the first
            // 5 (for now) episodes.

            // "But when it wants to fuck up, it can't"
            // The KuMeYu episodes were meh, but in the first NoWaYu ep,
            // it's already made an emotional impact

            // E5-20:17
            // YLIA flashbacks
            NEI(7.5, Emotion.CU)

            FeatureMusic("M-VGMDB-AL-114186-2")

            Boredom(Boredom.Completed)
            Visual(VisualKind.Animated, 0.3, 0.5)
        }
    }
}
