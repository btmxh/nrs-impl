package com.dah.nrs.rules

import com.dah.nrs.Data
import com.dah.nrs.ValidationRule
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.contentOrNull

class dah_lone_pads(data: Data) : ValidationRule(data) {
    override fun run() {
        impacts.forEach { (idx, impact) ->
            impact.takeIf { (it.meta["type"] as? JsonPrimitive)?.contentOrNull == "pads" }?.let {
                warn("Impact #$idx was a lone PADS impact (PADS with no accompanying EIs)")
            }
        }
    }
}
