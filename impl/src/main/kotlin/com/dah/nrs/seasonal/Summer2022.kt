package com.dah.nrs.seasonal

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.Summer2022() {
    // welcome to summer 2022, where everything is either an AKM reference or a
    // disguised idol anime.
    // at least the "dropped" rate will be lower than spring i think. (because idol)

    Entry {
        id = "A-MAL-50760"
        title = "Teppen!!!!!!!!!!!!!!!"

        bestGirl = "Hosono Yuzu"

        // art has some flaws, but whatever
        Boredom(Boredom.Watching)
        KilledBy("F-VGMDB-4499", potential = 0.25, effect = 0.1)
        KilledBy("M-VGMDB-AL-76155-2", potential = 0.25, effect = 0.75)
    }

    Entry {
        id = "A-MAL-41589"
        title = "Tokyo Mew Mew New ♡"

        bestGirl = "Momomiya Ichigo"

        // obligatory rst-cue studio(s) anime
        // art is "interesting" ngl
        // (basically it was somewhat decent while having 2002 character designs)
        Boredom(Boredom.Watching)
        KilledBy("F-VGMDB-4499", potential = 0.1, effect = 0.1)
        KilledBy("M-VGMDB-AL-76155-2", potential = 0.1, effect = 0.75)
    }

    Entry {
        id = "A-MAL-50917"
        title = "Prima Doll"
        // the "fuck u setsuna yuki" and "akari kito pls come back" anime
        // yep, ep 1 was ruined because of that bullcrap
        // yep, the whole anime was ruined because of that girl

        bestGirl = "Okumiya Otome"
        // ichijou ruka my beloved
        Boredom(Boredom.Watching)

        // well this is not killed by AKM and SB69, it's more like
        // kusunoki tomori ruined the anime
        NEI(-1.0, Emotion.AU)

        KilledBy("F-VGMDB-4499", potential = 0.1, effect = 0.1)
        KilledBy("M-VGMDB-AL-76155-2", potential = 0.1, effect = 0.75)
    }

    Entry {
        id = "A-MAL-49470"
        // from the creators of Seirei Gensouki (kimi no rhapsody reference)
        // and something something villager a (kimi no rhapsody reference once
        // again), introducing...
        title = "Mamahaha no Tsurego ga Motokano datta"

        // no fucking way a romcom in our lord's year + 3537 - 1515
        // > Irido, Yume                Hidaka, Rina
        // > Main                           Japanese
        // oh i see

        bestGirl = "Irido Yume"
        // self-explanatory

        // still shit anime anyways
        Boredom(Boredom.Watching)
        KilledBy("F-VGMDB-4499", potential = 0.1, effect = 0.1)
        KilledBy("M-VGMDB-AL-76155-2", potential = 0.1, effect = 0.75)
    }

    Entry {
        id = "A-MAL-${38009 - 3}"
        title = "Renmei Kuugun Koukuu Mahou Ongakutai Luminous Witches"

        // mc is cute
        // ngl this is a treat for our eyes
//        bestGirl = "Robertson Virginia"
        bestGirl = "Shibuya Inori"
        // inori is cuter fuck u

        Boredom(Boredom.Watching)
        KilledBy("F-VGMDB-4499", potential = 0.75, effect = 0.1)
        KilledBy("M-VGMDB-AL-76155-2", potential = 0.75, effect = 0.75)
    }

    Entry {
        id = "A-MAL-50999"
        title = /*Fiery's*/ "Extreme Hearts"

        bestGirl = "Kodaka Saki"
        // saki is someone that we need but we don't deserve

        // no fucking way ari ozawa and totomi mineuchi in the same anime
        // is this an ortensia incident reference????????????????????????
        // (more '?' than teppen let's go)

        // > love live VA's
        // https://www.google.com/search?q=trolldespair

        Boredom(Boredom.Watching)
        KilledBy("F-VGMDB-4499", potential = 0.5, effect = 0.1)
        KilledBy("M-VGMDB-AL-76155-2", potential = 0.5, effect = 0.75)
    }

}