package com.dah.nrs.exts

import com.dah.nrs.core.*

class DAH_factors(builder: NRSContextBuilder) : Extension(builder) {
    init {
        builder.factorCount = 11
        builder.combineVector = builder.vector {
            listOf(Emotion, Art, Boredom, Additional)
                .flatMap { it.factors }
                .forEach { set(it, it.weight) }
        }
    }
}

interface Subscore {
    val name: String get() = javaClass.simpleName
    val factors: List<FactorScore>
    val weight: Double
}

interface FactorScore {
    val name: String get() = javaClass.simpleName
    val weight: Double
    val vectorIndex: Int
}

sealed class FactorScoreImpl(override val weight: Double, override val vectorIndex: Int) : FactorScore

sealed class SubscoreImpl(override val weight: Double = 1.0) : Subscore {
    abstract override val factors: List<FactorScore>
}

sealed class OneFactorSubscore(override val vectorIndex: Int, override val weight: Double = 1.0) : FactorScore,
    Subscore {
    override val name: String get() = super<Subscore>.name
    override val factors: List<FactorScore> get() = listOf(this)
}

object Emotion : SubscoreImpl(0.6) {
    open class Factor(weight: Double, vectorIndex: Int) : FactorScoreImpl(weight, vectorIndex)
    object ActivatedUnpleasant : Factor(0.3, 0)
    object ActivatedPleasant : Factor(0.4, 1)
    object ModerateUnpleasant : Factor(0.35, 2)
    object ModeratePleasant : Factor(0.35, 3)
    object CalmingUnpleasant : Factor(0.4, 4)
    object CalmingPleasant : Factor(0.5, 5)

    val AU = ActivatedUnpleasant
    val AP = ActivatedPleasant
    val MU = ModerateUnpleasant
    val MP = ModeratePleasant
    val CU = CalmingUnpleasant
    val CP = CalmingPleasant

    override val factors = listOf(AU, AP, MU, MP, CU, CP)
}

object Art : SubscoreImpl(0.7) {
    open class Factor(weight: Double, vectorIndex: Int) : FactorScoreImpl(weight, vectorIndex)
    object Language : Factor(0.4, 6)
    object Visual : Factor(0.1, 7)
    object Music : Factor(0.3, 8)

    val L = Language
    val V = Visual
    val M = Music
    override val factors = listOf(L, V, M)
}

object Boredom : OneFactorSubscore(9, 0.05)
object Additional : OneFactorSubscore(10)

fun VectorBlock.set(factorScore: FactorScore, score: Double) = set(factorScore.vectorIndex, score)
