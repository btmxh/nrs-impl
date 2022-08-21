package com.dah.nrs.rules

import com.dah.nrs.Data
import com.dah.nrs.ValidationRule
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.contentOrNull

class dah_uncompleted_no_progress(data: Data) : ValidationRule(data) {
    override fun run() {
        entries.filter {
            val progress = it.value.meta["DAH_entry_progress"] as? JsonObject ?: return@filter false
            val status = (progress["status"] as? JsonPrimitive)?.contentOrNull
            val episode = progress["episode"] as? JsonPrimitive
            status != null && !status.startsWith("Completed") && status != "Unwatched"
                    && (episode == null || episode is JsonNull)
        }.keys.forEach {
            warn("Uncompleted entry $it doesn't have an episode specification")
        }
    }
}