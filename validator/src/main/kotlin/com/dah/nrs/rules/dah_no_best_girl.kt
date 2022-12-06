package com.dah.nrs.rules

import com.dah.nrs.Data
import com.dah.nrs.ValidationRule

class dah_no_best_girl(data: Data) : ValidationRule(data) {
    override fun run() {
        entries.filterValues {
            it.id.startsWith("A")
                    || it.id.startsWith("L") || it.id.startsWith("V")
        }.filterValues {
            !it.meta.containsKey("DAH_entry_bestGirl")
        }.keys.forEach {
            warn("Entry $it has no \"bestGirl\"")
        }
    }
}
