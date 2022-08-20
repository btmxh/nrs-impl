package com.dah.nrs.rules

import com.dah.nrs.Data
import com.dah.nrs.ValidationRule
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.contentOrNull

class dah_anime_no_boredom(data: Data) : ValidationRule(data) {
    override fun run() {
        val animes = entries.keys.filter { it.startsWith('A') }.toMutableSet()
        impacts.filter { (_, it) -> (it.meta["type"] as? JsonPrimitive)?.contentOrNull == "boredom" }
            .forEach { (_, it) -> animes.removeAll(it.contributors.keys) }
        for(anime in animes) {
            warn("Anime entry $anime doesn't have a boredom impact")
        }
    }
}