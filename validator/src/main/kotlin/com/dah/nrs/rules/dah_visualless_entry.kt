package com.dah.nrs.rules

import com.dah.nrs.Data
import com.dah.nrs.ValidationRule
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonPrimitive

class dah_visualless_entry(data: Data) : ValidationRule(data) {
    override fun run() {
        val entries = HashMap(entries)
        impacts.filter {
            it.meta["type"]?.jsonPrimitive?.contentOrNull == "DAH_nonstandard_generic_visual"
        }.forEach { entries.keys.removeAll(it.contributors.keys) }

        entries.keys.filter {
            it.startsWith("A")
                    || it.startsWith("L")
                    || it.startsWith("V")
                    || it.startsWith("G")
        }.forEach { warn("Entry $it doesn't have any visual impact") }
    }
}