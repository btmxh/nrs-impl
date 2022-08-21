package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.SoraYori() {
    // the first CP farmer in NRS
    // but they got dropped sadge

    Entry {
        id = "F-VGMDB-7040"
        title = "Sora yori mo Tooi Basho"

        Entry {
            id = "A-MAL-35839"    // generated
            idMAL = 35839
            idAniList = 99426
            idAniDB = 13257
            idKitsu = 13615
            title = "Sora yori mo Tooi Basho"
            bestGirl = "Shiraishi Yuzuki"

            // the beginning was good, since they're making progress
            // but the last episodes (like from ep 6,7 onwards) suck
            // since they're just formulaic-episodic drama
            // (btw i haven't watch the last 3 episodes yet, so idk what
            // happened there)
            Progress(Boredom.Dropped, 9)

            // first anime to do cp-farming
            AEI(8.0, Emotion.CP)

            // the girls are comfy too
            NEI(7.5, Emotion.MP)

            Visual(VisualKind.Animated, 0.3, 0.5)

            FeatureMusic("M-VGMDB-AL-73544-1")
            FeatureMusic("M-VGMDB-AL-73544-2")
        }

        Entry {
            id = "M-VGMDB-AL-73544"
            title = "Koko kara, Koko kara"

            Visual(VisualKind.AlbumArt, 0.3, 0.5)
            SubIDEntry("1") {
                Music(5.0)
                // make v-tuber a thing (hanayori dorm bs)
                // and when hanayori bs dead, vtuber dead lmfao
                // and then hololive becomes le boat xd
            }

            SubIDEntry("2", "One Step") {
                Music(3.0)
                OsuSong(personal = 4.0, community = 0.0)
            }
        }
    }
}