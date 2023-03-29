package com.dah.nrs.rules

import com.dah.nrs.Data
import com.dah.nrs.ValidationRule
import com.dah.nrs.core.*
import com.dah.nrs.exts.*
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.contentOrNull

class dah_no_dropped_impact(data: Data) : ValidationRule(data) {
    override fun run() {
        val droppedEntries = impacts
            .filter {  (_, it) -> (it.meta["type"] as? JsonPrimitive)?.contentOrNull == "dropped" }
            .flatMap {  (_, it) -> it.contributors.keys }
            .toSet()
        entries.filterValues {
            val progress = it.meta["DAH_entry_progress"] as? JsonObject ?: return@filterValues false
            val status = (progress["status"] as? JsonPrimitive)?.contentOrNull
            status == "Dropped" && it.id !in droppedEntries
        }.keys.forEach {
            warn("Entry $it has `Dropped` progress but no `dropped` impacts")
        }
    }
}
