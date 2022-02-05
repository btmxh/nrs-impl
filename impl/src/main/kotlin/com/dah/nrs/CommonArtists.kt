@file:Suppress(
    "LocalVariableName",
    "FunctionName",                     // It's my DSL, idc about conventions
    "SpellCheckingInspection"           // IDEA can't understand nihongo
)

package com.dah.nrs

val HTT by Artist(VGMDB_Artist(8870), "HO-KAGO TEA TIME")
val DJAmaya by Artist("M-2", "DJ Amaya")
val Asterisk by Artist("M-1", "Asterisk")
val Tamame by Artist("M-6", "tamame")
val ClariS by Artist(VGMDB_Artist(11829), "ClariS")
val TrySail by Artist(VGMDB_Artist(16469), "TrySail")
val YuukiAoi by Artist(VGMDB_Artist(9797), "Yuuki Aoi")
val NonakaAi by Artist(VGMDB_Artist(3558), "Nonaka Ai")
val KitamuraEri by Artist(VGMDB_Artist(724), "Kitamura Eri")
val KajiuraYuki by Artist(VGMDB_Artist(356), "Kajiura Yuki")
val LiSA by Artist(VGMDB_Artist(11952), "LiSA")
val ZAQ by Artist(VGMDB_Artist(12516), "ZAQ")
val YanagiNagi by Artist(VGMDB_Artist(5524), "Yanagi Nagi")
val Muse by Artist(VGMDB_Artist(13719), "μ's")
val Aqours by Artist(VGMDB_Artist(17153), "Aqours")
val Nijigaku by Artist(VGMDB_Artist(29922), "Nijigasaki High School Idol Club")
//    val Liella by Artist(VGMDB_Artist(37385), "Liella!")
val HayamiSaori by Artist(VGMDB_Artist(6876), "Hayami Saori") {
    Include(Tsurezure)
}
val ToyamaNao by Artist(VGMDB_Artist(11436), "Toyama Nao")
val SaitoShuka by Artist(VGMDB_Artist(17551), "Saito Shuka") {
    Include(Aqours)
}
val MaedaKaori by Artist(VGMDB_Artist(29323), "Maeda Kaori") {
    Include(Nijigaku)
}
val OnishiAguri by Artist(VGMDB_Artist(29640), "Onishi Aguri") {
    Include(Nijigaku)
}
val KusunokiTomori by Artist(VGMDB_Artist(27779), "Kusunoki Tomori") {
    Include(Nijigaku)
}
val TanakaChiemi by Artist(VGMDB_Artist(26954), "Tanaka Chiemi") {
    Include(Nijigaku)
}
val Ray by Artist(VGMDB_Artist(13097), "Ray")
val KomatsuMikako by Artist(VGMDB_Artist(12665), "Komatsu Mikako")
val PetitRabbit by Artist("M-9", "Petit Rabbit's")
val MinaseInori by Artist(VGMDB_Artist(15361), "Minase Inori") {
    Include(PetitRabbit)
}
val LarvalStagePlanning by Artist(VGMDB_Artist(9455), "Larval Stage Planning")
val fhana by Artist(VGMDB_Artist(13857), "fhána")
val YokoyamaMasaru by Artist(VGMDB_Artist(9069), "Yokoyama Masaru")
val KayanoAi by Artist(VGMDB_Artist(10934), "Kayano Ai")
val SawaiMiku by Artist(VGMDB_Artist(11958), "Sawai Miku")
val kamaboko by Artist("M-12", "kamaboko")
val MAO by Artist(VGMDB_Artist(15350), "M·A·O")
val TakahashiRie by Artist(VGMDB_Artist(16380), "Takahashi Rie")
val OzawaAri by Artist(VGMDB_Artist(15998), "Ozawa Ari") {
    Include(Ortensia)
}
val MimoriSuzuko by Artist(VGMDB_Artist(10253), "Mimori Suzuko") {
    Include(Muse)
}
val TeruiHaruka by Artist(VGMDB_Artist(15440), "Terui Haruka")
val UchiyamaYumi by Artist(VGMDB_Artist(12766), "Uchiyama Yumi")
val KurosawaTomoyo by Artist(VGMDB_Artist(14180), "Kurosawa Tomoyo")
val NagatsumaJuri by Artist(VGMDB_Artist(15408), "Nagatsuma Juri") {
    Include(TROISANGES)
}
val HanazawaKana by Artist(VGMDB_Artist(6783), "Hanazawa Kana")
val MakinoAmane by Artist(VGMDB_Artist(29249), "Makino Amane") {
    Include(KiRaRe)
}
val KitoAkari by Artist(VGMDB_Artist(26898), "Kito Akari") {
    Include(KiRaRe)
    Include(Nijigaku)
}
val TazawaMasumi by Artist(VGMDB_Artist(15697), "Tazawa Masumi") {
    Include(KiRaRe)
}
val TachibanaMeemu by Artist(VGMDB_Artist(29250), "Tachibana Meemu") {
    Include(KiRaRe)
}
val IwahashiYuka by Artist(VGMDB_Artist(29251), "Iwahashi Yuka") {
    Include(KiRaRe)
}
val SoramiYuki by Artist(VGMDB_Artist(29252), "Sorami Yuki") {
    Include(KiRaRe)
}
val KiRaRe by Artist(VGMDB_Artist(30829), "KiRaRe")
val HanamoriYumiri by Artist(VGMDB_Artist(15999), "Hanamori Yumiri") {
    Include(Ortensia)
}
// the ortensia (2021) incident
val MineuchiTomomi by Artist(VGMDB_Artist(27612), "Mineuchi Tomomi") {
    Include(Ortensia)
}
val Ortensia by Artist("M-13", "ortensia")
val TakahashiMinami by Artist(VGMDB_Artist(16335), "Takahashi Minami") {
    Include(Stellamaris)
}
val SuwaAyaka by Artist(VGMDB_Artist(15565), "Suwa Ayaka") {
    Include(Stellamaris)
}
val TanakaAimi by Artist(VGMDB_Artist(16805), "Tanaka Aimi") {
    Include(Stellamaris)
}
val Stellamaris by Artist("M-14", "Stellamaris")
val HiokaNatsumi by Artist(VGMDB_Artist(17779), "Hioka Natsumi") {
    Include(TROISANGES)
}
val AbeRika by Artist(VGMDB_Artist(16609), "Abe Rika") {
    Include(TROISANGES)
}
val TROISANGES by Artist("M-15", "TROIS ANGES")
val YamadaNatsumi by Artist(VGMDB_Artist(23810), "Yamada Natsumi") {
    Include(Tetrarkhia)
}
val SatouMiki by Artist(VGMDB_Artist(29254), "Satou Miki") {
    Include(Tetrarkhia)
}
val TakayanagiTomoyo by Artist(VGMDB_Artist(29231), "Takayanagi Tomoyo") {
    Include(Tetrarkhia)
}
val NishidaNozomi by Artist(VGMDB_Artist(17719), "Nishida Nozomi") {
    Include(Tetrarkhia)
}
val Tetrarkhia by Artist("M-16", "Tetrarkhia")
val keeno by Artist(VGMDB_Artist(15120), "keeno")
val Deco27 by Artist(VGMDB_Artist(9559), "DECO*27")
val yuiko by Artist(VGMDB_Artist(4276), "yuiko")
// cat music is better than kirare
// nrs is not broken at all amirite
val InagawaEri by Artist(VGMDB_Artist(16166), "Inagawa Eri") {
    Include(Plasmagica)
}
val TonoHikaru by Artist(VGMDB_Artist(30564), "Tono Hikaru") {
    Include(Mashumairesh)
}
val Plasmagica by Artist("M-18", "Plasmagica")
val Tsurezure by Artist("M-19", "Tsurezurenaru Ayatsuri Mugenan")
val Mashumairesh by Artist("M-20", "Mashumairesh")
val BUDVIRGINLOGIC by Artist("M-21", "BUD VIRGIN LOGIC")
val Criticrista by Artist("M-23", "Criticrista")
val Kano by Artist(VGMDB_Artist(11666), "Kano") {
    // kano-era
    Meme(0.9, Meme.MMoreThan3Months)
}
val KoyamaHidekazu by Artist(VGMDB_Artist(25289), "Koyama Hidekazu") // aka the god nanou
val Scop by Artist(VGMDB_Artist(15119), "Scop")
// harebare fanfaRe:
val mimimemeMIMI by Artist(VGMDB_Artist(15766), "mimimemeMIMI")
val WEAVER by Artist(VGMDB_Artist(26886), "WEAVER")
val fourfolium by Artist("M-25", "fourfolium")
val AiRBLUE by Artist(VGMDB_Artist(33857), "AiRBLUE")
val Irodorimidori by Artist("M-26", "Irodorimidori")
val cosMoBousouP by Artist(VGMDB_Artist(9553), "cosMo@Bousou-P")
val xi by Artist(VGMDB_Artist(12225), "xi")
val NOMA by Artist("M-27", "NOMA")
// you may have more score than kirare
// but u r still shit cope
// filthy osugame farmer
val PoppinParty by Artist(VGMDB_Artist(27992), "Poppin'Party")
val Roselia by Artist(VGMDB_Artist(27993), "Roselia")
val PastelPalletes by Artist(VGMDB_Artist(31328), "Pastel*Palletes")
val Afterglow by Artist(VGMDB_Artist(31326), "Afterglow")
val SILENTSIREN by Artist(VGMDB_Artist(31509), "SILENT SIREN")
val Rakakun by Artist("M-34", "Rakakun")
val KANABOON by Artist(VGMDB_Artist(25291), "KANA-BOON")
val WillStetson by Artist("M-36", "Will Stetson")
val DAOKO by Artist(VGMDB_Artist(17342), "DAOKO")
val YonezuKenshi by Artist(VGMDB_Artist(15121), "Yonezu Kenshi")
val Uwasanopetals by Artist("M-38", "Uwasanopetals")
val kemu by Artist("M-40", "kemu")
val GUMI by Artist(VGMDB_Artist(37346), "GUMI")
val HatsuneMiku by Artist(VGMDB_Artist(2466), "Hatsune Miku")
val HAG by Artist("M-42", "H△G")
val ForegroundEclipse by Artist(VGMDB_Artist(8482), "Foreground Eclipse")
