package com.dah.nrs.core

import com.dah.nrs.exts.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlin.reflect.KProperty

@Suppress("PropertyName")
class NRSContext {
    val extensions = hashSetOf<String>()
    var factorCount: Int = 0
    private var combineVector: ScoreVector = vector {}

    var DAH_factors by extension("DAH_factors") {
        factorCount = 13
        combineVector = vector {
            listOf(Emotion, Art, Information, Boredom, Additional)
                .flatMap { it.factors }
                .forEach { set(it, it.weight) }
        }
    }
    var DAH_json by extension("DAH_json")
    var DAH_overall_score by extension("DAH_overall_score") {
        // dependency
        DAH_factors = true
    }
    var DAH_meta by extension("DAH_meta")
    var DAH_standards by extension("DAH_standards") {
        // dependency
        DAH_factors = true
    }

    val DAH_json_json by lazy {
        if (DAH_json) Json {
            prettyPrint = true
            serializersModule = SerializersModule {
                registerDAHJsonSerializers()
            }
        } else null
    }

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

class ExtensionProperty(private val name: String, private val ifEnabled: () -> Unit) {
    operator fun getValue(nrsContext: NRSContext, property: KProperty<*>): Boolean {
        return name in nrsContext.extensions
    }

    operator fun setValue(nrsContext: NRSContext, property: KProperty<*>, value: Boolean) {
        if (value) {
            if(nrsContext.extensions.add(name)) {
                ifEnabled()
            }
        } else {
            nrsContext.extensions.remove(name)
        }
    }
}

private fun extension(name: String, ifEnabled: () -> Unit = {}) = ExtensionProperty(name, ifEnabled)
