package com.dah.nrs.meme

import com.dah.nrs.*
import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

// strength is relatively small (it's post-modern after all)
fun AcceptImpact.PostModernMeme(strength: Double, block: DSLImpact.() -> Unit = {}) {
    Meme(strength, numDays("2022-10-01"), block)
}

fun DSLScope.PostModern() {
    // ngl these names are cool as fuck
    Entry {
        id = "O-20221003T175501-1"
        title = "Neo-Autism Party"
        PostModernMeme(0.3)
    }

    Entry {
        id = "O-20221003T175501-2"
        title = "Nyumber One! Zettai Saikyou! Party"
        PostModernMeme(0.5)
    }
}
