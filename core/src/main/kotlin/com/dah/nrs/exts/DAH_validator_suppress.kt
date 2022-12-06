package com.dah.nrs.exts

import com.dah.nrs.dsl.DSLMeta
import kotlinx.serialization.json.add
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.jsonArray

fun DSLMeta.ValidatorSuppress(vararg rules: String) {
    meta("DAH_validator_suppress", buildJsonArray {
        meta["DAH_validator_suppress"]?.jsonArray?.forEach { add(it) }
        rules.forEach { add(it) }
    })
}
