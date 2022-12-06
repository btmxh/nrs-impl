package com.dah.nrs.rules

import com.dah.nrs.Data
import com.dah.nrs.ValidationRule

class dah_no_title(data: Data) : ValidationRule(data) {
    override fun run() {
        entries.filterValues {
            !it.meta.containsKey("DAH_entry_title")
        }.keys.forEach {
            warn("Entry $it has no \"title\"")
        }
    }
}
