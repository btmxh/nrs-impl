package com.dah.nrs

// the future of gen2
fun GenerateBlock.Cue() {
    Album(VGMDB_Album(115724), "Start Line/Hajimari no Kanenone ga Narihibiku Sora")
    Track(VGMDB_Track(115724, 1), "Start Line", AiRBLUE) {
        Music(1.5)
    }

    Anime("Cue!", MAL = 43735) {
        // rst has re:lighted the stage
        // and now, its juniors will take the stage to the next level
        // introducing, sb69 stars and cue!

        // lmao main girl
        // tbh there are some other girls who are decent contestants
        // for best girl, like airi, yuzuha, etc. idk
        // there is also a girl named kano lmao
        bestGirl = "Mutsuishi Haruna"
        status = EntryStatus.Watching

        // the character interaction was lacking in ep1 and ep2
        // in ep3 iirc there is some
        // and based ep4 is nothing but character interactions
        // we do a little MP farming
        NEI(0.5, Emotion.MP)

        Boredom(Boredom.Watching)

        FeatureMusic(VGMDB_Track(115724, 1))

        // duopoly shithole moment
        KilledBy(VGMDB_Franchise(4499))
        KilledBy(VGMDB_Franchise(7059))
    }

    Franchise(VGMDB_Franchise(9540), "CUE!") {
        // this franchise was first discovered while i'm listening to
        // rst songs on spotify (like onsen), therefore it's known as
        // the futuRe: of gen2
        Include(MAL(43735))

        Include(VGMDB_Track(115724, 1))
    }
}