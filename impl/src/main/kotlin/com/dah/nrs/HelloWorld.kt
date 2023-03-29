package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

fun DSLScope.HelloWorld() {
    Entry {
        id = "A-MAL-38816"
        title = "Hello World" // generated(fill_anime_metadata.dart v0.1.1)
        idAniDB = 38816 // generated(fill_anime_metadata.dart v0.1.1)
        idKitsu = 42030 // generated(fill_anime_metadata.dart v0.1.1)
        idAniList = 106240 // generated(fill_anime_metadata.dart v0.1.1)
        idMAL = 38816 // generated(fill_anime_metadata.dart v0.1.1)
        bestGirl = "Ichijou Ruka"
        // oh fuck
        bestGirl = "Ruri Ichigyou" // generated(generate_best_girls.dart v0.1.0)

        AnimeConsumedProgress(EntryStatus.Completed, 1.0, 1, 1.hours + 37.minutes)
        // the cg kinda help with making the anime unique lol
        Visual(VisualKind.Animated, 0.4, 0.6)
    }

    Entry {
        id = "A-MAL-40295"
        title = "Another World" // generated(fill_anime_metadata.dart v0.1.1)
        idAniDB = 40295 // generated(fill_anime_metadata.dart v0.1.1)
        idKitsu = 42527 // generated(fill_anime_metadata.dart v0.1.1)
        idAniList = 111733 // generated(fill_anime_metadata.dart v0.1.1)
        idMAL = 40295 // generated(fill_anime_metadata.dart v0.1.1)
        bestGirl = "Ruri Ichigyou" // generated(generate_best_girls.dart v0.1.0)

        AnimeConsumedProgress(EntryStatus.Completed, 1.0, 3)
        // the cg kinda help with making the anime unique lol
        Visual(VisualKind.Animated, 0.4, 0.6)
    }

    AEI(0.9, Emotion.CU) {
        contributors["A-MAL-38816"] = 0.4
        contributors["A-MAL-40295"] = 0.6
    }
}
