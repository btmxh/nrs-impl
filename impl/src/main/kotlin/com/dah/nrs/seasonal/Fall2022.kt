package com.dah.nrs.seasonal

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.Fall2022() {
    // one of the anime seasons of all time
    // (why is boatshit everywhere i hate my life)

    // this is peak idol dystopia
    Entry {
        id = "A-MAL-49849"
        title = "Shinmai Renkinjutsushi no Tenpo Keiei" // generated(fill_anime_metadata.dart v0.1.1)
        idAniDB = 49849 // generated(fill_anime_metadata.dart v0.1.1)
        idKitsu = 45222 // generated(fill_anime_metadata.dart v0.1.1)
        idAniList = 139369 // generated(fill_anime_metadata.dart v0.1.1)
        idMAL = 49849 // generated(fill_anime_metadata.dart v0.1.1)

        // haha obligatory atelier reference
        // i hate mc btw
        bestGirl = "Reisalin Stout" // impl_overridden
        // mi ưhen lô ve li ve vi ây

        ValidatorSuppress("dah-visualless-entry")
        AnimeConsumedProgress(EntryStatus.Unwatched, 0.0, 0)
    }

    Entry {
        id = "A-MAL-47917"
        title = "Bocchi the Rock!" // generated(fill_anime_metadata.dart v0.1.1)
        idAniDB = 47917 // generated(fill_anime_metadata.dart v0.1.1)
        idKitsu = 44196 // generated(fill_anime_metadata.dart v0.1.1)
        idAniList = 130003 // generated(fill_anime_metadata.dart v0.1.1)
        idMAL = 47917 // generated(fill_anime_metadata.dart v0.1.1)

        // le cat is back noway!!1!1!
        bestGirl = "Hitori Gotou"
        // mi ưhen cloverworks

        ValidatorSuppress("dah-visualless-entry")
        AnimeConsumedProgress(EntryStatus.Unwatched, 0.0, 0)
    }
}
