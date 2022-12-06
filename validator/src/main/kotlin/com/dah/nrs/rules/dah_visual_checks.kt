package com.dah.nrs.rules

import com.dah.nrs.Data
import com.dah.nrs.ValidationRule
import com.dah.nrs.exts.IMetaImpact
import com.dah.nrs.exts.VisualKind
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonPrimitive

class dah_visual_checks(data: Data) : ValidationRule(data) {
    private fun getVisualImpacts(kind: VisualKind): List<IndexedValue<IMetaImpact>> {
        return impacts.filter { (_, it) ->
            it.meta["type"]?.jsonPrimitive?.contentOrNull == "DAH_nonstandard_generic_visual"
                    && it.meta["kind"]?.jsonPrimitive?.contentOrNull == kind.toString()
        }
    }

    override fun run() {
        getVisualImpacts(VisualKind.AlbumArt).filter { (_, it) ->
            it.contributors.keys.any { id -> !id.startsWith("M") }
        }.forEach { (idx, it) ->
            warn(
                "Impact #$idx is an DAH_nonstandard_generic_visual impact with AlbumArt kind, but has a non-music contributor: ${
                    it.contributors.filterKeys {
                        !it.startsWith(
                            "M"
                        )
                    }
                }"
            )
        }

        getVisualImpacts(VisualKind.Animated).filter { (_, it) ->
            it.contributors.keys.any { id -> id.startsWith("M") }
        }.forEach { (idx, it) ->
            warn(
                "Impact #$idx is an DAH_nonstandard_generic_visual impact with Animated kind, but has a music contributor: ${
                    it.contributors.filterKeys {
                        it.startsWith(
                            "M"
                        )
                    }
                }"
            )
        }

    }
}
