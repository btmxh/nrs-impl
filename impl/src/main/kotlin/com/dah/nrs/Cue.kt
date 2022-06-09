package com.dah.nrs

import com.dah.nrs.dsl.DSLScope
import com.dah.nrs.dsl.Entry
import com.dah.nrs.dsl.SubIDEntry
import com.dah.nrs.exts.*

// the futuRe: of gen2
fun DSLScope.Cue() {
    Entry {
        id = "F-VGMDB-9540"
        title = "CUE!"

        // this franchise was first discovered while i'm listening to
        // rst songs on spotify (like onsen), therefore it's known as
        // the futuRe: of gen2
        Entry {
            id = "A-MAL-43735"
            title = "Cue!"
            // rst has re:lighted the stage
            // and now, its juniors will take the stage to the next level
            // introducing, sb69 stars and cue!

            // lmao main girl
            // tbh there are some other girls who are decent contestants
            // for best girl, like airi, yuzuha, etc. idk
            // there is also a girl named kano lmao
            bestGirl = "Mutsuishi Haruna"

            // the character interaction was lacking in ep1 and ep2
            // in ep3 iirc there is some
            // and based ep4 is nothing but character interactions
            // we do a little MP farming
            // ok airi and yuzuha is wholesome af
            // ep 11 almost made me cry
            // and i was somewhat moved by ep 10
            AEI(2.0, Emotion.MP to 0.9, Emotion.CP to 0.1)

            // comedy was weak ngl
            NEI(5.0, Emotion.AP)

            Boredom(Boredom.Watching)

            FeatureMusic("M-VGMDB-AL-115724-1")

            // duopoly shithole moment
            KilledBy("F-VGMDB-4499", potential = 0.25, effect = 0.25)
            KilledBy("F-VGMDB-7059", potential = 0.25, effect = 0.75)
        }

        Entry {
            id = "M-VGMDB-AL-115724"
            title = "Start Line/Hajimari no Kanenone ga Narihibiku Sora"

            SubIDEntry("1", "Start Line") {
                Music(7.5)
            }

            SubIDEntry("2", "Hajimari no Kanenone ga Narihibiku Sora") {
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AR-33857"
            title = "AiRBLUE"

            Contains(ImageVocalContainFactor) {
                Contains("M-VGMDB-AL-115724")
            }
        }
    }
}