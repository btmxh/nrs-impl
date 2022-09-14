package com.dah.nrs.rules

import com.dah.nrs.Data
import com.dah.nrs.ValidationRule
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.contentOrNull

class dah_no_progress(data: Data) : ValidationRule(data) {
    override fun run() {
        entries.filter { (id, entry) ->
            val isAnime = id.startsWith('A')
            val progress = entry.meta["DAH_entry_progress"] as? JsonObject ?: return@filter false
            val status = (progress["status"] as? JsonPrimitive)?.contentOrNull
            val episode = progress["episode"] as? JsonPrimitive
            val length = progress["length_seconds"] as? JsonPrimitive
            (isAnime && (episode == null || episode is JsonNull))
                    || (length == null || length is JsonNull)
                    || status == null
        }.keys.forEach {
            warn("Uncompleted entry $it doesn't have an episode specification")
        }
    }
}