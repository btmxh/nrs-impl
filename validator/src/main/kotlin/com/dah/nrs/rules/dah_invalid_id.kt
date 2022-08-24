package com.dah.nrs.rules

import com.dah.nrs.Data
import com.dah.nrs.ValidationRule

class dah_invalid_id(data: Data) : ValidationRule(data) {
    override fun run() {
        entries.keys.filter { id -> id.any { it != '-' && it !in 'A'..'Z' && it !in '0'..'9' } }
            .forEach { warn("Invalid entry ID: $it") }
    }
}