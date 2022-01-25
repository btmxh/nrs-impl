@file:Suppress(
    "LocalVariableName",
    "FunctionName",                     // It's my DSL, idc about conventions
    "SpellCheckingInspection"           // IDEA can't understand nihongo
)

package com.dah.nrs

fun main() = generate {
    `K-On!`()
    MadokaMagica()
    Idolmaster()
    SwordArtOnline()
    KokoroConnect()

    Anime("Koi to Senkyo to Chocolate", MAL = 12175) {
        // iirc i liked this anime's plot
        Plot(1.2)
        Boredom(Boredom.Completed)
    }

    Anime("Hyouka", MAL = 12189) {
        // ig it's kinda good
        Plot(1.0)
        Boredom(Boredom.Completed)
    }

    Sakurasou()
    Chuunibyou()
    Oregairu()
    LoveLive()
    AOT()
    NagiAsu()
    GochiUsa()

    Anime("Ushinawareta Mirai wo Motomete", MAL = 21845) {
        // kaomeme
        bestGirl = "Sasaki Kaori"
        // Ending did hit me
        NEI(1.25, Emotion.CU)
        // osuhow memes
        // This anime saved me in the Math Qualifiers lmao,
        // and VMO2020 too.
        Meme(0.3, Meme.M1_2Weeks)

        Boredom(Boredom.Completed)
    }

    SoraMethod()
    YLIA()
    Saekano()
    GakkouGurashi()
    YuYuYu()
    ReStage()
    OnsenMusume()
    SB69()
    Kano()
}.run{}

