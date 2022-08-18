package com.dah.nrs.rules

import com.dah.nrs.Data
import com.dah.nrs.ValidationRule
import com.dah.nrs.core.ID

class dah_null_entry_reference(data: Data) : ValidationRule(data) {
    private fun isNullEntryID(id: ID): Boolean {
        return !id.contains("[null entry]") && id !in entries
    }

    override fun run() {
        impacts.map { (idx, it) -> Pair(idx, it.contributors.keys.filter(this::isNullEntryID)) }
            .filter { (_, it) -> it.isNotEmpty() }
            .forEach { (idx, it) ->
                warn("Impact #$idx has null contributor(s): $it")
            }

        relations.map { (idx, it) -> Pair(idx, it.contributors.keys.filter(this::isNullEntryID)) }
            .filter { (_, it) -> it.isNotEmpty() }
            .forEach { (idx, it) ->
                warn("Relation #$idx has null contributor(s): $it")
            }

        relations.map { (idx, it) -> Pair(idx, it.references.keys.filter(this::isNullEntryID)) }
            .filter { (_, it) -> it.isNotEmpty() }
            .forEach { (idx, it) ->
                warn("Relation #$idx has null reference(s): $it")
            }
    }
}