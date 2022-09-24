package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.minutes

fun DSLScope.NatsuKise() {
    Entry {
        id = "F-VGMDB-5817"
        title = "natsuiro kiseki"
        
        Entry {
            id = "A-MAL-12119"
            title = "Natsu-iro Kiseki" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 12119 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 6667 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 12119 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 12119 // generated(fill_anime_metadata.dart v0.1.1)
            
            bestGirl = "Saki Mizukoshi"

            // something something rst something cp-based
            NEI(0.5, Emotion.CU to 0.5, Emotion.CP to 0.5)
            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 12)
            Visual(VisualKind.Animated, 0.5, 0.4)
        }

        Entry {
            id = "A-MAL-15431"
            title = "Natsu-iro Kiseki: 15-kaime no Natsuyasumi" // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 7255 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 15431 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 15431 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Saki Mizukoshi"

            AnimeConsumedProgress(EntryStatus.Completed, 0.8, 1, 7.minutes)
            Visual(VisualKind.Animated, 0.5, 0.4)
        }
    }
}
