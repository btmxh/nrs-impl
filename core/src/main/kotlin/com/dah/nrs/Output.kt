package com.dah.nrs

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import java.nio.file.Paths
import kotlin.io.path.Path
import kotlin.io.path.outputStream

@Serializable
class SerializableEntry(
    val id: String,
    val contains: Map<String, Double>,
) {
    constructor(entry: Entry) : this(entry.id, entry.contains)
}

@Serializable
class SerializableImpact(
    val description: String,
    val contributors: Map<String, Double>,
    val score: DoubleArray,
    val meta: JsonObject,
) {
    constructor(impact: Impact) : this(impact.description,
        impact.contributors,
        impact.score.toDoubleArray(),
        impact.meta)
}

@Serializable
class SerializableRelation(
    val description: String,
    val contributors: Map<String, Double>,
    val references: Map<String, DoubleArray>,
    val meta: JsonObject,
) {
    constructor(relation: Relation) : this(relation.description,
        relation.contributors,
        relation.references.mapValues { (_, matrix) -> matrix.toArray() },
        relation.meta)
}

@Serializable
class SerializableScore(
    val title: String,
    val impact: DoubleArray,
    val relation: DoubleArray,
    val overallVector: DoubleArray,
    val subscores: Map<String, Double>,
    val overall: Double,
) {

    constructor(title: String, score: EntryScore) : this(title, score.impact.toDoubleArray(),
        score.relation.toDoubleArray(),
        score.overallVector.toDoubleArray(),
        score.subscores.mapKeys { (subscore, _) -> subscore.name },
        score.overall)
}

fun init(any: Any?) {}

val json = Json {
    prettyPrint = true
}

inline fun <reified T> writeJson(value: T, path: String) {
    Paths.get("..", path).outputStream().bufferedWriter().use { writer ->
        writer.write(json.encodeToString(value))
    }
}

fun generate(block: GenerateScope.() -> Unit) {
    init(Emotion)
    init(Meme)
    init(Boredom)
    init(Information)
    init(Additional)

    val scope = GenerateScope().also(block)

    writeJson(scope.entries.values.map(::SerializableEntry), "entries.json")
    writeJson(scope.impacts.map(::SerializableImpact), "impacts.json")
    writeJson(scope.relations.map(::SerializableRelation), "relations.json")

    Path("../entry_graph.dot").outputStream().bufferedWriter().use { writer ->
        writer.write("digraph NRS {\n")
        scope.entries.values.forEach {
            for ((child, _) in it.contains) {
                writer.write("${it.id.replace("-", "")} -> ${child.replace("-", "")};")
                writer.newLine()
            }
        }
        writer.write("}\n")
    }

    val scores = process(scope.entries, scope.impacts, scope.relations)
    writeJson(scores.mapValues { (id, score) -> SerializableScore(scope.entries[id]?.title.toString(), score) }, "scores.json")
}