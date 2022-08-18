package com.dah.nrs.rules

import com.dah.nrs.Data
import com.dah.nrs.ValidationRule

class dah_sum_contain_weight(data: Data) : ValidationRule(data) {
    override fun run(
    ) {
        impacts.forEachIndexed { idx, impact ->
            impact.contributors.values.sum().takeIf { !floatsEqual(it, 1.0) }?.let {
                warn("Impact #$idx has contribution weight sum $it != 1.0")
            }
        }
        relations.forEachIndexed { idx, relation ->
            relation.contributors.values.sum().takeIf { !floatsEqual(it, 1.0) }?.let {
                warn("Relation #$idx has contribution weight sum $it != 1.0")
            }
        }
    }
}