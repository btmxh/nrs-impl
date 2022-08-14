@file:JvmName("DAH_serializeKt")

package com.dah.nrs.exts

import com.dah.nrs.core.*
import kotlinx.serialization.KSerializer
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.*
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.SerializersModuleBuilder
import kotlinx.serialization.modules.contextual
import kotlinx.serialization.serializer

class DAH_serialize_json(builder: NRSContextBuilder) : Extension(builder) {
    init {
        dependencies.addAll(
            listOf(
                DAH_serialize::class.simpleName!!
            )
        )
    }

    val json = Json {
        prettyPrint = true
        serializersModule = SerializersModule {
            registerDAHJsonSerializers()
        }
    }
}

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
    return buildJsonObject {
        put("id", entry.id)
        put("children", DAH_serialize_json!!.json.encodeToJsonElement(entry.children))

        DAH_meta.ifEnabled {
            put("DAH_meta", entry.meta)
        }
    }
}

@Suppress("FunctionName")
fun NRSContext.DAH_json_serialize(impact: IImpact): JsonObject {
    return buildJsonObject {
        put("contributors", DAH_serialize_json!!.json.encodeToJsonElement(impact.contributors))
        put("score", DAH_serialize_json.json.encodeToJsonElement(impact.score))

        DAH_meta.ifEnabled {
            put("DAH_meta", impact.meta)
        }
    }
}

@Suppress("FunctionName")
fun NRSContext.DAH_json_serialize(relation: IRelation): JsonObject {
    return buildJsonObject {
        put("contributors", DAH_serialize_json!!.json.encodeToJsonElement(relation.contributors))
        put(
            "references",
            DAH_serialize_json.json.encodeToJsonElement(relation.references.mapValues { (_, it) -> it.toJSON(DAH_serialize_json.json) })
        )

        DAH_meta.ifEnabled {
            put("DAH_meta", relation.meta)
        }
    }
}

@Suppress("FunctionName")
fun NRSContext.DAH_json_serialize(result: EntryResult): JsonObject {
    return buildJsonObject {
        put("totalImpact", DAH_serialize_json!!.json.encodeToJsonElement(result.totalImpact))
        put("totalRelation", DAH_serialize_json.json.encodeToJsonElement(result.totalRelation))
        put("overallVector", DAH_serialize_json.json.encodeToJsonElement(result.overallVector))

        put("DAH_meta", buildJsonObject {
            DAH_overall_score.ifEnabled {
                put("DAH_overall_score", result.DAH_overall_score_overallScore)
            }

            DAH_anime_normalize.ifEnabled {
                put(
                    "DAH_anime_normalize",
                    buildJsonObject {
                        put("score", result.DAH_anime_normalize_score!!)
                    }
                )
            }
        })
    }
}
