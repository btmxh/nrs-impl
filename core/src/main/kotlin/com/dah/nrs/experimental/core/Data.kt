package com.dah.nrs.experimental.core

import com.dah.nrs.ScoreMatrix
import com.dah.nrs.ScoreVector
import kotlinx.serialization.json.JsonObject

typealias ID = String
data class NRSData(val entries: Map<ID, IEntry>, val impacts: List<IImpact>, val relations: List<IRelation>)

interface IEntry {
    val id: ID
    val children: Map<ID, Double>
}

interface IImpact {
    val contributors: Map<ID, Double>
    val score: ScoreVector
}

interface IRelation {
    val contributors: Map<ID, Double>
    val references: Map<ID, ScoreMatrix>
}

interface IMeta {
    val meta: JsonObject
}

