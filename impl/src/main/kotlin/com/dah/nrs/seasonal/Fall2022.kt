package com.dah.nrs.seasonal

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.Summer2022() {
    // one of the anime seasons of all time
    // (why is boatshit everywhere i hate my life)

    // this is peak idol dystopia
    Entry {
        id = "A-MAL-49849"

        // haha obligatory atelier reference
        // i hate mc btw
        bestGirl = "Reisalin Stout" // impl_overridden
        // mi ưhen lô ve li ve vi ây

        ValidatorSuppress("dah-visualless-entry")
        AnimeConsumedProgress(EntryStatus.Unwatched, 0.0, 0)
    }

    Entry {
        id = "A-MAL-47917"

        // le cat is back noway!!1!1!
        bestGirl = "Hitori Gotou"
        // mi ưhen cloverworks

        ValidatorSuppress("dah-visualless-entry")
        AnimeConsumedProgress(EntryStatus.Unwatched, 0.0, 0)
    }
}