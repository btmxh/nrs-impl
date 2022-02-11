package com.dah.nrs

import kotlin.math.abs
import kotlin.math.pow

const val EPSILON = 1e-4

@JvmInline
value class ScoreVector(private val data: DoubleArray) {
    companion object {
        val ZERO = vector(0.0)
        val ONE = vector(1.0)
    }

    init {
        assert(data.size == FactorScores.size)
    }

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
    companion object {
        val ZERO = object : ScoreMatrix {
            override fun row(index: Int): ScoreVector {
                return ScoreVector.ZERO
            }
        }

        val IDENTITY: ScoreMatrix = DiagonalScoreMatrix(vector(1.0))
    }

    fun row(index: Int): ScoreVector

    operator fun times(vector: ScoreVector) = FactorScores.indices.map { dot(vector, row(it)) }.toScoreVector()

    fun toArray() : DoubleArray {
        val data = Array(FactorScores.size) { row(it) }
        return DoubleArray(FactorScores.size * FactorScores.size) {
            val row = it / FactorScores.size
            val col = it % FactorScores.size
            data[row][col]
        }
    }
}

private class DiagonalScoreMatrix(private val diagonal: ScoreVector) : ScoreMatrix {
    override fun row(index: Int): ScoreVector {
        return vector {
            this[index] = diagonal[index]
        }
    }
}

fun ScoreVector.toDiagonalMatrix(): ScoreMatrix = DiagonalScoreMatrix(this)

private class DefaultScoreMatrix(private val data: Array<ScoreVector>) : ScoreMatrix {
    init {
        assert(data.size == FactorScores.size)
    }

    override fun row(index: Int) = data[index]
}

class VectorBlock {
    private val array = DoubleArray(FactorScores.size)

    operator fun set(index: Int, value: Double) {
        array[index] = value
    }

    operator fun set(factorScore: FactorScore, value: Double) {
        set(factorScore.vectorIndex, value)
    }

    operator fun get(index: Int) = array[index]

    fun toScoreVector() = array.toScoreVector()
}

fun vector(block: VectorBlock.() -> Unit) = VectorBlock().also(block).toScoreVector()
fun vector(scalar: Double) = ScoreVector(DoubleArray(FactorScores.size) { scalar })

private fun Collection<Double>.toScoreVector() = ScoreVector(toDoubleArray())
private fun Array<Double>.toScoreVector() = ScoreVector(toDoubleArray())
private fun DoubleArray.toScoreVector() = ScoreVector(this)

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

fun mapClampThrow(
    input: Double,
    inputRange: ClosedRange<Double>,
    outputRange: ClosedRange<Double>,
    block: () -> String,
): Double {
    if(input !in inputRange) {
        error(block())
    }

    return map(input, inputRange, outputRange)
}