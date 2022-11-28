package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

fun DSLScope.Koikake() {
    Entry {
        id = "F-20221128T123502"
        title = "Koi x Shin Ai Kanojo"

        Entry {
            id = "V-VNDB-17516"
            title = "Koi x Shin Ai Kanojo"
            // unironically better than all drama romance anime lmfao
            // we do be living in a society tho

            // "the cutest girl in all anime history"
            // like what the actual fuck you can't be this cute wtf
            // THISSHOULDNOTBEPOSSIBLE
            bestGirl = "Himekek Sena"
            bestGirl = "Himeno Sena" // oops
            // eroge waifu
            Waifu("Himeno Sena", "2022-11-25" to "2022-11-27")

            // first 1.0 yay!!! the waifu method
            Visual(VisualKind.VisualNovel, 1.0, 0.3)

            // what a ride (the ride hasn't ended btw)
            // really enjoyed the thing
            // i guess i will finish it in one month
            // (mid-term coming soon monkaW)
            ConsumedProgress(EntryStatus.Watching, 1.0, 10.hours)

            // time to spam ei boys
            // really good atmospheric farming ngl
            // funnychamp
            NEI(0.8, Emotion.AP)

            // eroge love ig
            AEI(0.5, Emotion.MP)
            FeatureMusic("M-VGMDB-AL-58596")
        }

        Entry {
            id = "M-VGMDB-AL-58596"
            title = "KOI-KAKERU SHIN-AI KANOJO Complete Sound Tracks" // generated(fill_music_metadata.dart v0.1.1)
            
            Visual(VisualKind.AlbumArt, 1.0, 0.3)

            SubIDEntry("2") {
                MusicConsumedProgress("4:23") // generated(fill_music_metadata.dart v0.1.1)
                title = "記憶×ハジマリ" // generated(fill_music_metadata.dart v0.1.1)
                // chorus sucks but
                // the inst is atm-farm-pilled af
                // unironically can be meta soon :eyes:
                Music(0.35)
            }

            // classic "too lazy to rank all of the tracks"
            Music(0.6)
        }

        AEI(0.5, Emotion.CU to 0.8, Emotion.CP to 0.2) {
            contributors["M-VGMDB-AL-58596"] = 0.1
            contributors["V-VNDB-17516"] = 0.9
        }
    }
}
