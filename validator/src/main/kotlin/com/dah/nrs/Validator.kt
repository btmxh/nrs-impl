package com.dah.nrs

import com.dah.nrs.core.ID
import com.dah.nrs.core.IMeta
import com.dah.nrs.exts.*
import com.dah.nrs.rules.*
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonPrimitive
import kotlin.math.absoluteValue
import kotlin.system.exitProcess

var exitCode = 0

class Data(
    val entries: Map<ID, IMetaEntry> = deserializeEntries(),
    val impacts: List<IMetaImpact> = deserializeImpacts(),
    val relations: List<IMetaRelation> = deserializeRelations(),
    val scores: Map<ID, IMetaScore> = deserializeScores()
)

private fun IMeta.isNotSuppressed(ruleName: String): Boolean {
    return meta["DAH_validator_suppress"]?.jsonArray?.all { it.jsonPrimitive.contentOrNull != ruleName } ?: true
}

abstract class ValidationRule(val data: Data) {
    protected val entries get() = data.entries.filterValues { it.isNotSuppressed(getName()) }
    protected val impacts get() = data.impacts.withIndex().filter { (_, it) -> it.isNotSuppressed(getName()) }
    protected val relations get() = data.relations.withIndex().filter { (_, it) -> it.isNotSuppressed(getName()) }
    protected val scores = data.scores.filterValues { it.isNotSuppressed(getName()) }

    protected fun warn(message: String) {
        exitCode = 1
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

// TODO: add rule for invalid visual impact (e.g. album art visual impact on artist entry)
fun main() {
    val data = Data()
    for (rule in listOf(
        dah_sum_contain_weight(data),
        dah_visual_checks(data),
        dah_visualless_entry(data),
        dah_no_best_girl(data),
        dah_null_entry_reference(data),
        dah_entry_no_consumed(data),
        dah_no_progress(data),
        dah_invalid_id(data),
        dah_no_title(data),
        dah_check_custom_id(data),
    )) {
        rule.run()
    }

    exitProcess(exitCode)
}