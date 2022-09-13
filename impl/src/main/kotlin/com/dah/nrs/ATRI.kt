package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.ATRI() {
    // the funny visual novel that got fucked by e2e lmfao
    Entry {
        id = "F-VGMDB-8817"
        title = "ATRI -My Dear Moments-"

        Entry {
            id = "V-VNDB-27448"
            title = "ATRI -My Dear Moments-"

            bestGirl = "Atri"
            // wait wtf
            // minamo's va is the same person as aone's va
            // based rst reference

            // sad plot twist thingy
            AEI(8.0, Emotion.CU to 0.8, Emotion.AP to 0.2)
            AnimeProgressOld(Boredom.TempOnHold)
            ValidatorSuppress("dah-uncompleted-no-progress")

            Visual(VisualKind.VisualNovel, 0.7, 0.15)

            Meme(0.5, 10)
            FeatureMusic("M-VGMDB-AL-100754")
        }

        Entry {
            id = "M-VGMDB-AL-100754"
            title = "ATRI -My Dear Moments- Original Soundtrack" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.7, 0.15)

            // like the aokana soundtrack album
            Music(6.0)
        }
    }
}
