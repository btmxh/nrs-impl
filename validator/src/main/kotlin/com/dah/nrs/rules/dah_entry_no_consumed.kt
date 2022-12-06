package com.dah.nrs.rules

import com.dah.nrs.Data
import com.dah.nrs.ValidationRule
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.contentOrNull

class dah_entry_no_consumed(data: Data) : ValidationRule(data) {
    override fun run() {
        val filteredEntries = entries.keys.filter {
            it.matches("[ALV]-.+".toRegex()) ||
                    it.matches("M-VGMDB-AL-\\d+-\\d+".toRegex()) ||
                    it.matches("M-\\d+".toRegex())
        }.toMutableSet()
        impacts.filter { (_, it) -> (it.meta["type"] as? JsonPrimitive)?.contentOrNull == "consumed" }
            .forEach { (_, it) -> filteredEntries.removeAll(it.contributors.keys) }
        for (entry in filteredEntries) {
            warn("Entry $entry doesn't have a Consumed impact")
        }
    }
}
