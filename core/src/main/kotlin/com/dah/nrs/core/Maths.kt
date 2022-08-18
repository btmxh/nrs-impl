package com.dah.nrs.core

import kotlinx.serialization.json.*
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

const val EPSILON = 1e-4

class ScoreVector(private val data: DoubleArray) {
    val dimensions get() = data.size

    private fun compWise(other: ScoreVector, callback: (first: Double, second: Double) -> Double) =
        data.zip(other.data).map { (first, second) -> callback(first, second) }.toScoreVector()

    operator fun times(other: ScoreVector) = compWise(other) { first, second -> first * second }
    operator fun plus(other: ScoreVector) = compWise(other) { first, second -> first + second }
    operator fun minus(other: ScoreVector) = compWise(other) { first, second -> first - second }

    operator fun times(factor: Double) = data.map { it * factor }.toScoreVector()
    operator fun plus(factor: Double) = data.map { it + factor }.toScoreVector()
    operator fun minus(factor: Double) = data.map { it - factor }.toScoreVector()

    fun sum() = data.sum()
    operator fun get(index: Int) = data[index]

    fun toDoubleArray(): DoubleArray {
        return DoubleArray(data.size) { data[it] }
    }
}

fun dot(v1: ScoreVector, v2: ScoreVector) = (v1 * v2).sum()

interface ScoreMatrix {
    val dimensions: Int
    fun row(index: Int): ScoreVector

    operator fun times(vector: ScoreVector): ScoreVector {
        return (0 until dimensions)
            .map { dot(vector, row(it)) }
            .toScoreVector()
    }

    fun toArray(): DoubleArray {
        val data = Array(dimensions) { row(it) }
        return DoubleArray(dimensions * dimensions) {
            val row = it / dimensions
            val col = it % dimensions
            data[row][col]
        }
    }

    fun toJSON(json: Json): JsonElement {
        return buildJsonObject {
            put("kind", "regular")
            put("data", json.encodeToJsonElement(toArray()))
        }
    }
}

private class DiagonalScoreMatrix(private val diagonal: ScoreVector) : ScoreMatrix {
    override fun row(index: Int): ScoreVector {
        return ScoreVector(DoubleArray(diagonal.dimensions) { if (it == index) diagonal[it] else 0.0 })
    }

    override val dimensions: Int
        get() = diagonal.dimensions

    override fun times(vector: ScoreVector): ScoreVector = diagonal * vector

    override fun toJSON(json: Json): JsonElement {
        return buildJsonObject {
            put("kind", "diagonal")
            put("data", json.encodeToJsonElement(diagonal.toDoubleArray()))
        }
    }
}

fun ScoreVector.toDiagonalMatrix(): ScoreMatrix = DiagonalScoreMatrix(this)
fun DoubleArray.toScoreMatrix(context: NRSContext? = null): ScoreMatrix {
    if (context != null) {
        assert(size == context.factorCount * context.factorCount)
    }
    val factorCount = context?.factorCount ?: sqrt(size.toDouble()).toInt()
    if (factorCount * factorCount != size) {
        error("Unable to retrieve dimension from matrix (matrix size is not a square number)")
    }
    return DefaultScoreMatrix(
        asIterable().windowed(factorCount, factorCount).map { it.toScoreVector() }.toTypedArray()
    )
}

private class DefaultScoreMatrix(private val data: Array<ScoreVector>) : ScoreMatrix {
    override val dimensions: Int = data.size

    override fun row(index: Int) = data[index]
}

class VectorBlock(dimension: Int) {
    private val array = DoubleArray(dimension)

    operator fun set(index: Int, value: Double) {
        array[index] = value
    }

    operator fun get(index: Int) = array[index]

    fun toScoreVector() = array.toScoreVector()
}

fun NRSContext.vector(block: VectorBlock.() -> Unit) = VectorBlock(factorCount).also(block).toScoreVector()
fun NRSContextBuilder.vector(block: VectorBlock.() -> Unit) = VectorBlock(factorCount).also(block).toScoreVector()
fun NRSContext.vector(scalar: Double) = ScoreVector(DoubleArray(factorCount) { scalar })
fun NRSContextBuilder.vector(scalar: Double) = ScoreVector(DoubleArray(factorCount) { scalar })

private fun Collection<Double>.toScoreVector() = ScoreVector(toDoubleArray())
private fun Array<Double>.toScoreVector() = ScoreVector(toDoubleArray())
private fun DoubleArray.toScoreVector() = ScoreVector(this)

//fun DoubleArray.toScoreMatrix(): ScoreMatrix = DefaultScoreMatrix(window)

fun combine(arr: Collection<Double>, weight: Double): Double {
    val pos = arr.filter { it > 0 }
    val negAbs = arr.filter { it < 0 }.map { abs(it) }
    fun combineUnsigned(arr: List<Double>, weight: Double): Double {
        if (weight < EPSILON) {
            return arr.maxOrNull() ?: 0.0
        }
        val theWeight = weight
        val invWeight = 1.0 / theWeight
        return arr.sumOf { it.pow(invWeight) }.pow(theWeight)
    }
    return combineUnsigned(pos, weight) - combineUnsigned(negAbs, weight)
}

fun map(input: Double, inputRange: ClosedRange<Double>, outputRange: ClosedRange<Double>): Double {
    val lerpFactor = (input.coerceIn(inputRange) - inputRange.start) / (inputRange.endInclusive - inputRange.start)
    return (outputRange.endInclusive - outputRange.start) * lerpFactor + outputRange.start
}