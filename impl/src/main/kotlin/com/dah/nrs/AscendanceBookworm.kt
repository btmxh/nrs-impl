package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.AscendanceBookworm() {
    Entry {
        id = "F-VGMDB-7638"
        title = "Honzuki no Gekokujou: Shisho ni Naru Tame ni wa Shudan wo Erande Iraremasen"

        // world-building ig
        AEI(3.0, Emotion.AP) {
            contributors["A-MAL-39468"] = 0.3
            contributors["A-MAL-40815"] = 0.3
            contributors["A-MAL-42429"] = 0.4
        }

        Entry {
            id = "A-MAL-39468"
            title = "Honzuki no Gekokujou: Shisho ni Naru Tame ni wa Shudan wo Erandeiraremasen"
            bestGirl = "Myne"

            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        Entry {
            id = "A-MAL-40815"
            title = "Honzuki no Gekokujou: Shisho ni Naru Tame ni wa Shudan wo Erandeiraremasen 2nd Season"
            bestGirl = "Myne"

            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }

        Entry {
            id = "A-MAL-42429"
            title = "Honzuki no Gekokujou: Shisho ni Naru Tame ni wa Shudan wo Erandeiraremasen 3rd Season"
            bestGirl = "Myne"

            Progress(Boredom.Completed)
            Visual(VisualKind.Animated, 0.4, 0.5)
        }
    }
}