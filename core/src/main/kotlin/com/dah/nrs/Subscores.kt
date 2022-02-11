package com.dah.nrs

import kotlin.properties.Delegates

interface Subscore {
    val name: String get() = javaClass.simpleName
    val factors: List<FactorScore>
    val weight: Double
}

interface FactorScore {
    val parent: Subscore
    val name: String
    val weight: Double
    var vectorIndex: Int
}

class FactorScoreImpl(override val parent: Subscore, override val name: String, override val weight: Double) :
    FactorScore {
    override var vectorIndex by Delegates.notNull<Int>()
}

sealed class SubscoreImpl(override val weight: Double = 1.0) : Subscore {
    override val factors = arrayListOf<FactorScore>()
    fun factor(name: String = this.name, weight: Double = this.weight) {
        factors.add(FactorScoreImpl(this, name, weight))
    }
}

sealed class OneFactorSubscore(override val weight: Double = 1.0) : FactorScore, Subscore {
    override val parent: Subscore get() = this
    override val name: String = javaClass.simpleName
    override var vectorIndex by Delegates.notNull<Int>()
    override val factors: List<FactorScore> get() = listOf(this)
}

object Emotion : SubscoreImpl(0.6) {
    class Factor(
        override val name: String,
        override val weight: Double,
        override var vectorIndex: Int = 0,
        override val parent: Emotion = this,
    ) : FactorScore {
        init {
            parent.factors.add(this)
        }
    }

    val ActivatedUnpleasant = Factor("ActivatedUnpleasant", 0.3)
    val ActivatedPleasant = Factor("ActivatedPleasant", 0.4)
    val ModerateUnpleasant = Factor("ModerateUnpleasant", 0.35)
    val ModeratePleasant = Factor("ModeratePleasant", 0.35)
    val CalmingUnpleasant = Factor("CalmingUnpleasant", 0.4)
    val CalmingPleasant = Factor("CalmingPleasant", 0.5)

    val AU = ActivatedUnpleasant
    val AP = ActivatedPleasant
    val MU = ModerateUnpleasant
    val MP = ModeratePleasant
    val CU = CalmingUnpleasant
    val CP = CalmingPleasant
}

object Art : SubscoreImpl(0.4) {
    class Factor(
        override val name: String,
        override val weight: Double,
        override var vectorIndex: Int = 0,
        override val parent: Art = this,
    ) : FactorScore {
        init {
            parent.factors.add(this)
        }
    }

    val Language = Factor("Language", 0.3)
    val Illustration = Factor("Illustration", 0.3)
    val Music = Factor("Music", 0.4)

    val L = Language
    val I = Illustration
    val M = Music
}

object Information : SubscoreImpl(0.5) {
    class Factor(
        override val name: String,
        override val weight: Double,
        override var vectorIndex: Int = 0,
        override val parent: Information = this,
    ) : FactorScore {
        init {
            parent.factors.add(this)
        }
    }

    val Politics = Factor("Politics", 0.7)
    val GeneralInfo = Factor("GeneralInfo", 0.5)
}

object Boredom : OneFactorSubscore(0.0)
object Additional : OneFactorSubscore()

val Subscores = listOf(
    Emotion,
    Art,
    Information,
    Boredom,
    Additional
)

val FactorScores = Subscores.flatMap { it.factors }
    .also {
        for ((index, factorScore) in it.withIndex()) {
            factorScore.vectorIndex = index
        }
    }
