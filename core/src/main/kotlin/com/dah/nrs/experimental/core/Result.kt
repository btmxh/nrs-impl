package com.dah.nrs.experimental.core

import com.dah.nrs.ScoreVector
import com.dah.nrs.combineVectors

data class EntryResult(val impacts: Map<Int, ScoreVector>, val relations: Map<Int, ScoreVector>) {
    val totalImpact = combineVectors(impacts.values)
    val totalRelation = combineVectors(relations.values)
    val overall = totalImpact + totalRelation
}