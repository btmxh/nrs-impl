package com.dah.nrs.seasonal

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.Spring2022() {
    Entry {
        id = "A-MAL-43470"
        title = "Rikei ga Koi ni Ochita no de Shoumei shitemita. Heart"

        Boredom(Boredom.TempOnHold)
        KilledBy("F-VGMDB-7059", potential = 0.2, effect = 0.75)
    }
    Entry {
        id = "A-MAL-48363"
        title = "RPG Fudousan"

        Boredom(Boredom.TempOnHold)
        KilledBy("F-VGMDB-7059", potential = 0.25, effect = 0.75)
    }
    Entry {
        id = "A-MAL-48415"
        title = "Shijou Saikyou no Daimaou, Murabito A ni Tensei suru"

        Boredom(Boredom.TempOnHold)
        KilledBy("F-VGMDB-7059", potential = 0.1, effect = 0.75)
    }
    Entry {
        id = "A-MAL-50265"
        title = "Spy x Family"

        Boredom(Boredom.Watching)
        KilledBy("F-VGMDB-7059", potential = 0.5, effect = 0.75)
    }
    Entry {
        id = "A-MAL-40356"
        title = "Tate no Yuusha no Nariagari Season 2"

        Boredom(Boredom.TempOnHold)
        KilledBy("F-VGMDB-7059", potential = 0.2, effect = 0.75)
    }
    Entry {
        id = "A-MAL-50273"
        title = "Tomodachi Game"

        Boredom(Boredom.Watching)
        KilledBy("F-VGMDB-7059", potential = 0.15, effect = 0.75)
    }
}