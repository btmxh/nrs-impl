package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

fun DSLScope.SoraMethod() {
    Entry {
        id = "F-VGMDB-2894"
        // method!!!!!!! mot con nguoi dc xay dung mot
        // cach khac biet: kizuna method daisuki no uta
        // yakusoku no uta eien no uta todokeyou
        title = "Sora no Method"

        Entry {
            id = "A-MAL-23209"
            title = "Sora no Method" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 23209 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 8337 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 20672 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 23209 // generated(fill_anime_metadata.dart v0.1.1)
            bestGirl = "Komiya Nonoka"

            // Drama in this anime is executed pretty well.
            AEI(7.5, Emotion.CU)

            // beasttrollminecraft
            Meme(0.3, 6)

            // First anime to (be able to) use OP/ED visual + music to strengthen the sadness.
            AEI(5.0, Emotion.CU)

            // OP/ED very good too.
            FeatureMusic("M-VGMDB-AL-47402-1")
            FeatureMusic("M-VGMDB-AL-47403-1")

            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.6, 0.4)
        }

        Entry {
            id = "M-VGMDB-AL-47402"

            Visual(VisualKind.AlbumArt, 0.6, 0.4)
            SubIDEntry("1") {
                Music(3.0)
            }
        }

        Contains("M-VGMDB-AL-47403-1")
    }
}
