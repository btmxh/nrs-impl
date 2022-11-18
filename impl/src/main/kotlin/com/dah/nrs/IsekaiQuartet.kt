package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.IsekaiQuartet() {
    Entry {
        id = "F-20220823T083245"
        title = "Isekai Quartet"

        Entry {
            id = "A-MAL-38472"
            title = "Isekai Quartet" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 38472 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42032 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 104454 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 38472 // generated(fill_anime_metadata.dart v0.1.1)
            // selecting bestGirl of this anime be like
            // template: https://imgflip.com/memetemplate/294461925/Two-Guys-Fighting-then-One-Guy-Kills-Them
            // caption:
            // "darkness (ai kayano cricri girl va)"
            // "chris + eris (suwa ayaka rst girl va)"
            // "ram (fuck re:zero tho) (murakawa rie akm girl va)
            bestGirl = "Ram" // generated(generate_best_girls.dart v0.1.0)

            Visual(VisualKind.Animated, 0.3, 0.5)
            AnimeProgressOld(Boredom.CompletedWithNoticeableBoredom, 12)
        }

        Entry {
            id = "A-MAL-39988"
            title = "Isekai Quartet 2" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 39988 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 42410 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 110178 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 39988 // generated(fill_anime_metadata.dart v0.1.1)

            // if there is someone that murakawa rie loses to,
            // then it must be 𝐓𝐇𝐄 𝐆𝐈𝐆𝐀𝐂𝐇𝐀𝐃 𝐒𝐄𝐈𝐘𝐔𝐔,
            // or the other akm girl, i'll let rina hidaka have this just
            // to make the thing balanced
            bestGirl = "Filo" // generated(generate_best_girls.dart v0.1.0)

            Visual(VisualKind.Animated, 0.3, 0.5)
            AnimeProgressOld(Boredom.Dropped, 4)
        }
    }
}
