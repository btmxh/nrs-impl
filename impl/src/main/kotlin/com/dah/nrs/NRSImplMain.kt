@file:Suppress(
    "LocalVariableName",
    "FunctionName",                     // It's my DSL, idc about conventions
    "SpellCheckingInspection"           // IDEA can't understand nihongo
)

package com.dah.nrs

fun main() = generate {
    `K-On`()
    MadokaMagica()
    Idolmaster()
    SwordArtOnline()
    KokoroConnect()

    Anime("Koi to Senkyo to Chocolate", MAL = 12175) {
        // iirc i liked this anime's plot
        NEI(1.0, Emotion.AP)
        Boredom(Boredom.Completed)
    }

    Anime("Hyouka", MAL = 12189) {
        // ig it's kinda good
        NEI(0.75, Emotion.AP)
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
    YamadaKun()

    Anime("Koe no Katachi", MAL = 28851) {
        bestGirl = "Nishimiya Shouko"
        // Koe no Katachi has solid drama
        // But sadly, it's the first anime so there's no PADS
        // or tears
        AEI(3.0, Emotion.CU)

        // the first anime + Giap-Ngoc match = unlimited memes
        Meme(1.0, Meme.MMoreThan3Months)

        // gate-open literally all NRS entries
        // but it's too overkill so an impact instead
        Impact("Gate-open anime", Additional.AdditionalFactor, 1.0)
    }

    ReStage()
    OnsenMusume()
    SB69()
    Kano()
}.run{}

