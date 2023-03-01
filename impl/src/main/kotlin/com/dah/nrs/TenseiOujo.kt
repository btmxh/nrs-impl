package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

fun DSLScope.TenseiOujo() {
    Entry {
        id = "F-VGMDB-12258"
        title = "Tensei Oujo to Tensai Reijou no Mahou Kakumei"

        Entry {
            id = "A-MAL-52736"
            title = "Tensei Oujo to Tensai Reijou no Mahou Kakumei" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 52736 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 46335 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 153629 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 52736 // generated(fill_anime_metadata.dart v0.1.1)

            // pogpega it's le cat !!1!1!!
            bestGirl = "Lainie Cyan"
            // imagine still talking about le cat like it was in arc 2
            // like bruh himeno sena exists now you fucking dumbass
            bestGirl = "Anisphia Wynn Palletia"

            AnimeConsumedProgress(EntryStatus.Watching, 1.0, 9)
            Visual(VisualKind.Animated, 0.5, 0.3)

            // the first ep already gave me chill :skull:
            AEI(0.2, Emotion.CP to 0.8, Emotion.MP to 0.2)

            // clueless mfs ^^^^
            // thank you based localism
            // thank you based localism
            // thank you based localism
            // thank you based localism
            // thank you based localism
            Cry(Emotion.CP to 0.8, Emotion.MP to 0.2) {
                contributors["A-MAL-52736"] = 0.4
                contributors["M-VGMDB-AL-124465-1"] = 0.1
                contributors["localism [null entry]"] = 0.5
            }

            FeatureMusic("M-VGMDB-AL-124465-1")
        }

        Entry {
            id = "M-VGMDB-AL-124465"

            Visual(VisualKind.AlbumArt, 0.5, 0.3)

            SubIDEntry("1") {
                Music(0.4)
            }
        }
    }
}
