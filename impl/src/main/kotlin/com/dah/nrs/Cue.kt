package com.dah.nrs

// the futuRe: of gen2
fun GenerateBlock.Cue() {
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
            NEI(0.5, Emotion.MP)

            // in ep5 there is some comedy
            NEI(0.25, Emotion.AP)

            Boredom(Boredom.Watching)

            FeatureMusic("M-VGMDB-115724-1")

            // duopoly shithole moment
            KilledBy("F-VGMDB-4499")
            KilledBy("F-VGMDB-7059")
        }

        Entry {
            id = "M-VGMDB-AL-115724"
            title = "Start Line/Hajimari no Kanenone ga Narihibiku Sora"

            SubIDEntry("1", "Start Line") {
                Music(7.5)
            }
        }
    }
}