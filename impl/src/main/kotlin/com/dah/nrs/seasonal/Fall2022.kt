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

        // NOZSP (Number One Zettai Saikyou Party) the anime
        // average post-modern anime lol:
        // mc literally graduated from hust
        // dusk reference in that parents last words thingy
        // mc has autism (average NOZSP mf)
        // "Yes, since they want alchemists out in the country as well." - my fucking ass
        // i hate sk (and bk too lol)


        Visual(VisualKind.Animated, 0.6, 0.2)
        AnimeConsumedProgress(EntryStatus.Watching, 0.7, 4)
    }

    Entry {
        id = "A-MAL-47917"
        title = "Bocchi the Rock!" // generated(fill_anime_metadata.dart v0.1.1)
        idAniDB = 47917 // generated(fill_anime_metadata.dart v0.1.1)
        idKitsu = 44196 // generated(fill_anime_metadata.dart v0.1.1)
        idAniList = 130003 // generated(fill_anime_metadata.dart v0.1.1)
        idMAL = 47917 // generated(fill_anime_metadata.dart v0.1.1)

        // le cat is back noway!!1!1!
        // average NAP/NOZSP member
        bestGirl = "Hitori Gotou"
        // mi ưhen cloverworks

        ValidatorSuppress("dah-visualless-entry")
        AnimeConsumedProgress(EntryStatus.Watching, 0.5, 2)
    }
}
