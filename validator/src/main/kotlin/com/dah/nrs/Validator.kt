package com.dah.nrs

import com.dah.nrs.core.ID
import com.dah.nrs.exts.*
import com.dah.nrs.rules.dah_sum_contain_weight
import kotlin.math.absoluteValue

class Data(
    val entries: Map<ID, IMetaEntry> = deserializeEntries(),
    val impacts: List<IMetaImpact> = deserializeImpacts(),
    val relations: List<IMetaRelation> = deserializeRelations(),
    val scores: Map<ID, IMetaScore> = deserializeScores()
)

abstract class ValidationRule(val data: Data) {
    protected val entries = data.entries
    protected val impacts = data.impacts
    protected val relations = data.relations
    protected val scores = data.scores

    protected fun warn(message: String) {
        println("[WARN] Rule ${getName()}: $message")
    }

    protected fun floatsEqual(a: Double, b: Double): Boolean {
        // TODO: replace this
        return (a - b).absoluteValue < 1e-4
    }

    abstract fun run()

    protected fun getName(): String {
        // clang-tidy inspired names
        return javaClass.simpleName.replace('_', '-')
    }
}

fun main() {
    val data = Data()
    for (rule in listOf<ValidationRule>(
        dah_sum_contain_weight(data)
    )) {
        rule.run()
    }
}