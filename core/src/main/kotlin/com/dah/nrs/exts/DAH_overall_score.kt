package com.dah.nrs.exts

import com.dah.nrs.core.Extension
import com.dah.nrs.core.NRSContextBuilder

class DAH_overall_score(builder: NRSContextBuilder): Extension(builder) {
    init {
        dependencies.addAll(listOf(
            DAH_factors::class.simpleName!!
        ))
    }
}