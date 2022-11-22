package com.dah.nrs.rules

import com.dah.nrs.Data
import com.dah.nrs.ValidationRule
import java.lang.StringBuilder
import java.time.LocalDate
import java.time.format.DateTimeParseException

class dah_check_custom_id(data: Data) : ValidationRule(data) {
    override fun run() {
        entries.keys.mapNotNull { it.split('-').getOrNull(1) }
            .filter { it[0].isDigit() }
            .forEach {
                val warn = { warn("Invalid custom ID timestamp: $it") }
                val tokens = it.split('T')
                if(tokens.size != 2) {
                    warn()
                    return@forEach
                }

                val (dateToken, timeToken) = tokens
                if(!checkDateToken(dateToken) || !checkTimeToken(timeToken)) {
                    warn()
                    return@forEach
                }
            }
    }

    private fun checkDateToken(dateToken: String): Boolean {
        if(dateToken.length != 8 || dateToken.any { !it.isDigit() }) {
            return false
        }

        val dateStr = StringBuilder(dateToken)
        dateStr.insert(6, '-')
        dateStr.insert(4, '-')
        return try {
            LocalDate.parse(dateStr)
            true
        } catch (ex: DateTimeParseException) {
            false
        }
    }

    private fun checkTimeToken(timeToken: String): Boolean {
        if(timeToken.length != 6 || timeToken.any { !it.isDigit() }) {
            return false
        }

        val (hr, mn, sec) = timeToken.windowed(2, 2)
        return (hr.toInt() in 0 .. 23) && (mn.toInt() in 0 .. 59) && (sec.toInt() in 0 .. 59)
    }
}