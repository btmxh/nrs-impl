package com.dah.nrs.exts

import com.dah.nrs.core.*
import kotlinx.serialization.KSerializer
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlinx.serialization.modules.SerializersModuleBuilder
import kotlinx.serialization.modules.contextual
import kotlinx.serialization.serializer

class ScoreVectorSerializer : TransformSerializer<DoubleArray, ScoreVector>(serializer()) {
    override fun convertFrom(from: DoubleArray): ScoreVector {
        return ScoreVector(from)
    }

    override fun convertTo(to: ScoreVector): DoubleArray {
        return to.toDoubleArray()
    }
}

abstract class TransformSerializer<T, U>(private val serializer: KSerializer<T>) : KSerializer<U> {
    override val descriptor = serializer.descriptor
    override fun deserialize(decoder: Decoder): U {
        return convertFrom(serializer.deserialize(decoder))
    }

    override fun serialize(encoder: Encoder, value: U) {
        serializer.serialize(encoder, convertTo(value))
    }

    abstract fun convertFrom(from: T): U
    abstract fun convertTo(to: U): T
}

private val Any.meta get() = (this as? IMeta)?.meta ?: buildJsonObject {}

fun SerializersModuleBuilder.registerDAHJsonSerializers() {
    contextual(ScoreVectorSerializer())
}

@Suppress("FunctionName")
fun NRSContext.DAH_json_serialize(entry: IEntry): JsonObject {
    require(DAH_json)
    return buildJsonObject {
        put("id", entry.id)
        put("children", DAH_json_json!!.encodeToJsonElement(entry.children))

        if (DAH_meta) {
            put("DAH_meta_meta", entry.meta)
        }
    }
}

@Suppress("FunctionName")
fun NRSContext.DAH_json_serialize(impact: IImpact): JsonObject {
    require(DAH_json)
    return buildJsonObject {
        put("contributors", DAH_json_json!!.encodeToJsonElement(impact.contributors))
        put("score", DAH_json_json!!.encodeToJsonElement(impact.score))

        if (DAH_meta) {
            put("DAH_meta_meta", impact.meta)
        }
    }
}

@Suppress("FunctionName")
fun NRSContext.DAH_json_serialize(relation: IRelation): JsonObject {
    require(DAH_json)
    return buildJsonObject {
        put("contributors", DAH_json_json!!.encodeToJsonElement(relation.contributors))
        put(
            "references",
            DAH_json_json!!.encodeToJsonElement(relation.references.mapValues { (_, it) -> it.toArray() })
        )

        if (DAH_meta) {
            put("DAH_meta_meta", relation.meta)
        }
    }
}

@Suppress("FunctionName")
fun NRSContext.DAH_json_serialize(result: EntryResult): JsonObject {
    require(DAH_json)
    return buildJsonObject {
        put("impacts", DAH_json_json!!.encodeToJsonElement(result.impacts))
        put("relations", DAH_json_json!!.encodeToJsonElement(result.relations))
        put("totalImpact", DAH_json_json!!.encodeToJsonElement(result.totalImpact))
        put("totalRelation", DAH_json_json!!.encodeToJsonElement(result.totalRelation))
        put("overallVector", DAH_json_json!!.encodeToJsonElement(result.overallVector))

        if (DAH_overall_score) {
            put(
                "DAH_overall_score_overallScore",
                DAH_json_json!!.encodeToJsonElement(result.DAH_overall_score_overallScore)
            )
        }
    }
}
