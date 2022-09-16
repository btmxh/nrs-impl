package com.dah.nrs.seasonal

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.Summer2022() {
    // welcome to summer 2022, where everything is either an AKM reference or a
    // disguised idol anime.
    // at least the "dropped" rate will be lower than spring i think. (because idol)
    // goodbye mr teppen and prima doll lol
    // (the prima doll incident)

    Entry {
        id = "A-MAL-50760"

        bestGirl = "Hosono Yuzu"

        // art has some flaws, but whatever
        Visual(VisualKind.Animated, 0.4, 0.4)
        // bye lol
        AnimeProgressOld(Boredom.Dropped, 4)
        KilledBy("F-VGMDB-4499", potential = 0.25, effect = 0.1)
        KilledBy("M-VGMDB-AL-76155-2", potential = 0.25, effect = 0.75)
    }

    Entry {
        id = "A-MAL-41589"

        bestGirl = "Momomiya Ichigo"

        // obligatory rst-cue studio(s) anime
        // art is "interesting" ngl
        // (basically it was somewhat decent while having 2002 character designs)
        Visual(VisualKind.Animated, 0.4, 0.85)

        // the rescue mission succeeded let's goooooo
        AnimeProgressOld(Boredom.Watching, 9)
        KilledBy("F-VGMDB-4499", potential = 0.1, effect = 0.1)
        KilledBy("M-VGMDB-AL-76155-2", potential = 0.1, effect = 0.75)
    }

    Entry {
        id = "A-MAL-50917"
        // the "fuck u setsuna yuki" and "akari kito pls come back" anime
        // yep, ep 1 was ruined because of that bullcrap
        // yep, the whole anime was ruined because of that girl

        bestGirl = "Okumiya Otome"
        // ichijou ruka my beloved (she can't save this anime sadge)

        // the prima doll incident
        AnimeProgressOld(Boredom.Dropped, 4)

        // somewhat unique and cute at the same time ngl
        // but still good luck with that -1.0 boredom lol xddddddddddd
        Visual(VisualKind.Animated, 0.75, 0.3)

        NEI(-1.0, Emotion.AU)

        // well this is not killed by AKM and SB69, it's more like
        // kusunoki tomori ruined the anime
        KilledBy("F-VGMDB-4499", potential = 0.1, effect = 0.1)
        KilledBy("M-VGMDB-AL-76155-2", potential = 0.1, effect = 0.75)

        // kusunoki tomori - the prima doll destroyer
    }

    Entry {
        id = "A-MAL-49470"
        // from the creators of Seirei Gensouki (kimi no rhapsody reference)
        // and something something villager a (kimi no rhapsody reference once
        // again), introducing...

        // no fucking way a romcom in our lord's year + 3537 - 1515
        // > Irido, Yume                Hidaka, Rina
        // > Main                           Japanese
        // oh i see

        bestGirl = "Irido Yume"
        // self-explanatory

        // good art (the rosia girl looks breedable af)
        Visual(VisualKind.Animated, 0.65, 0.2)

        // still shit anime anyways
        // lmfao they used "inverse-killedby" method to not be dropped
        AnimeProgressOld(Boredom.Watching, 11)
        // no way they made an reference to the "mc cried" atelier bs
        // based rosia-chan and her baits
        // brb watching the anime of the season
        KilledBy("F-VGMDB-4499", potential = 0.1, effect = 0.1)
        KilledBy("M-VGMDB-AL-76155-2", potential = 0.1, effect = 0.75)
    }

    Entry {
        id = "A-MAL-50999"

        bestGirl = "Kodaka Saki"
        // saki is someone that we need but we don't deserve

        // no fucking way ari ozawa and totomi mineuchi in the same anime
        // is this an ortensia incident reference????????????????????????
        // (more '?' than teppen let's go)

        // the ari ozawa girl actually experienced an ortensia incident LMFAO
        // xddddddddddddddddddddddd

        // > love live VA's
        // https://www.google.com/search?q=trolldespair

        // "I'm a mechanic, and Michelle is in R&D"
        // FUCK YOU GET OUT OF MY HEAD FUCK YOU GET OUT OF MY HEAD FUCK YOU GET
        // OUT OF MY HEAD FUCK YOU GET OUT OF MY HEAD FUCK YOU GET OUT OF MY HEAD
        // FUCK YOU GET OUT OF MY HEAD FUCK YOU GET OUT OF MY HEAD FUCK YOU GET
        // OUT OF MY HEAD FUCK YOU GET OUT OF MY HEAD FUCK YOU GET OUT OF MY HEAD
        // FUCK YOU GET OUT OF MY HEAD FUCK YOU GET OUT OF MY HEAD

        Visual(VisualKind.Animated, 0.5, 0.1)

        AnimeProgressOld(Boredom.Watching, 10)
        KilledBy("F-VGMDB-4499", potential = 0.5, effect = 0.1)
        KilledBy("M-VGMDB-AL-76155-2", potential = 0.5, effect = 0.75)
    }

    Entry {
        id = "A-MAL-50221"

        bestGirl = "Seibu Rio"
        // lmfao himekek VA
        // they even got her to sing a ballad omegalul
        // (they know about her songs in sb69 these cheeky mfs)

        // https://www.youtube.com/watch?v=2mFt7arKiNE
        Visual(VisualKind.Animated, 0.4, 0.5)
        AnimeProgressOld(Boredom.Watching, 7)
        KilledBy("F-VGMDB-4499", potential = 0.65, effect = 0.1)
        KilledBy("M-VGMDB-AL-76155-2", potential = 0.65, effect = 0.75)
    }

}
