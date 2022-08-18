package com.dah.nrs.exts

import com.dah.nrs.core.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.modules.SerializersModule
import java.nio.file.Path
import kotlin.io.path.Path
import kotlin.io.path.readText

@Serializable
private class ScoreMatrixDeserializeHelper(
    val kind: String,
    val data: DoubleArray
) {
    fun toMatrix(): ScoreMatrix {
        return when (kind) {
            "diagonal" -> ScoreVector(data).toDiagonalMatrix()
            else -> data.toScoreMatrix()
        }
    }
}

class MetaImpl(val data: JsonObject) : IMeta {
    override val meta: JsonObject
        get() = data
}

@Serializable
private class ImpactImpl(
    override val contributors: Map<ID, Double>,
    @Serializable(with = ScoreVectorSerializer::class)
    override val score: ScoreVector,
    @SerialName("DAH_meta")
    override val meta: JsonObject
) : IMetaImpact

interface IMetaImpact : IMeta, IImpact

@Serializable
private class RelationDeserializeHelper(
    val contributors: Map<ID, Double>,
    val references: Map<ID, ScoreMatrixDeserializeHelper>,
    val DAH_meta: JsonObject
)

private class RelationImpl(helper: RelationDeserializeHelper) : IMetaRelation {
    override val meta: JsonObject = helper.DAH_meta
    override val contributors: Map<ID, Double> = helper.contributors
    override val references: Map<ID, ScoreMatrix> = helper.references.mapValues { (_, m) -> m.toMatrix() }
}

interface IMetaRelation : IMeta, IRelation

@Serializable
private class EntryImpl(
    override val id: ID,
    override val children: Map<ID, Double>,
    @SerialName("DAH_meta") override val meta: JsonObject
) : IMetaEntry

interface IMetaEntry : IMeta, IEntry

@Serializable
private class ScoreImpl(
    @Serializable(with = ScoreVectorSerializer::class)
    override val totalImpact: ScoreVector,
    @Serializable(with = ScoreVectorSerializer::class)
    override val totalRelation: ScoreVector,
    @Serializable(with = ScoreVectorSerializer::class)
    @SerialName("overallVector")
    override val overallScore: ScoreVector,
    @SerialName("DAH_meta")
    override val meta: JsonObject,
) : IMetaScore

interface IMetaScore : IMeta {
    val totalImpact: ScoreVector
    val totalRelation: ScoreVector
    val overallScore: ScoreVector
}

private val json = Json {
    serializersModule = SerializersModule {
        registerDAHJsonSerializers()
    }
}

private inline fun <reified T> deserializeJSON(path: Path): T {
    return json.decodeFromString(path.readText())
}

fun deserializeEntries(path: Path = Path("output/entries.json")): Map<ID, IMetaEntry> {
    return deserializeJSON<Map<ID, EntryImpl>>(path)
}

fun deserializeImpacts(path: Path = Path("output/impacts.json")): List<IMetaImpact> {
    return deserializeJSON<List<ImpactImpl>>(path)
}

fun deserializeRelations(path: Path = Path("output/relations.json")): List<IMetaRelation> {
    return deserializeJSON<List<RelationDeserializeHelper>>(path).map { RelationImpl(it) }
}

fun deserializeScores(path: Path = Path("output/scores.json")): Map<ID, IMetaScore> {
    return deserializeJSON<Map<ID, ScoreImpl>>(path)
}
