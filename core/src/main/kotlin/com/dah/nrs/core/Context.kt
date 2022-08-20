package com.dah.nrs.core

import com.dah.nrs.exts.*
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty
import kotlin.reflect.full.memberProperties

@Suppress("PropertyName")
class NRSContext(
    val factorCount: Int,
    val combineVector: ScoreVector,
    val DAH_factors: DAH_factors?,
    val DAH_serialize: DAH_serialize?,
    val DAH_serialize_json: DAH_serialize_json?,
    val DAH_overall_score: DAH_overall_score?,
    val DAH_standards: DAH_standards?,
    val DAH_anime_normalize: DAH_anime_normalize?
) {
    fun process(data: NRSData) = Processor(this, data).process()

    fun combineVectors(vectors: Collection<ScoreVector>): ScoreVector {
        return vector {
            for (i in 0 until factorCount) {
                set(i, combine(vectors.map { it[i] }, combineVector[i]))
            }
        }
    }

    fun zeroVector(): ScoreVector {
        return vector {}
    }
}

class NRSContextBuilder {
    var DAH_factors = null as DAH_factors?
    var DAH_serialize = null as DAH_serialize?
    var DAH_serialize_json = null as DAH_serialize_json?
    var DAH_overall_score = null as DAH_overall_score?
    var DAH_standards = null as DAH_standards?
    var DAH_anime_normalize = null as DAH_anime_normalize?
    var factorCount = 0
    var combineVector = vector {}

    fun build(): NRSContext {
        checkExtensions(
            DAH_factors,
            DAH_serialize,
            DAH_serialize_json,
            DAH_overall_score,
            DAH_standards,
            DAH_anime_normalize
        )
        return NRSContext(
            factorCount,
            combineVector,
            DAH_factors,
            DAH_serialize,
            DAH_serialize_json,
            DAH_overall_score,
            DAH_standards,
            DAH_anime_normalize
        )
    }

    private fun checkExtensions(vararg exts: Extension?) {
        for(ext in exts) {
            ext?.dependencies?.forEach { require(isEnabled(it)) { "dependency $it of $ext is not enabled" } }
        }
    }

    fun isEnabled(ext: String): Boolean {
        return NRSContextBuilder::class.memberProperties
            .filterIsInstance<KMutableProperty1<NRSContextBuilder, Extension>>()
            .firstOrNull { it.name == ext }
            ?.get(this) != null
    }
}

fun context(block: NRSContextBuilder.() -> Unit) = NRSContextBuilder().also(block).build()
