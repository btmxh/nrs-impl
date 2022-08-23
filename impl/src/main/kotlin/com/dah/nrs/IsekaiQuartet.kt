package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.IsekaiQuartet() {
    Entry {
        id = "F-1"
        title = "Isekai Quartet"

        Entry {
            id = "A-MAL-38472"    // generated
            idMAL = 38472
            idAniList = 104454
            idKitsu = 42032
            idAniDB = 14435
            title = "Isekai Quartet"
            // selecting bestGirl of this anime be like
            // template: https://imgflip.com/memetemplate/294461925/Two-Guys-Fighting-then-One-Guy-Kills-Them
            // caption:
            // "darkness (ai kayano cricri girl va)"
            // "chris + eris (suwa ayaka rst girl va)"
            // "ram (fuck re:zero tho) (murakawa rie akm girl va)
            bestGirl = "Ram"

            Visual(VisualKind.Animated, 0.3, 0.5)
            Progress(Boredom.CompletedWithNoticeableBoredom)
        }

        Entry {
            id = "A-MAL-39988"    // generated
            idMAL = 39988
            idAniList = 110178
            idKitsu = 42410
            idAniDB = 14964
            title = "Isekai Quartet 2"

            // if there is someone that murakawa rie loses to,
            // then it must be 𝐓𝐇𝐄 𝐆𝐈𝐆𝐀𝐂𝐇𝐀𝐃 𝐒𝐄𝐈𝐘𝐔𝐔,
            // or the other akm girl, i'll let rina hidaka have this just
            // to make the thing balanced
            bestGirl = "Filo"

            Visual(VisualKind.Animated, 0.3, 0.5)
            Progress(Boredom.Dropped, 4)
        }
    }
}