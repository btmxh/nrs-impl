package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.OsuGame() {
    Entry {
        id = "M-VGMDB-AR-12225"
        title = "xi" // generated(fill_music_metadata.dart v0.1.1)

        Entry {
            id = "M-VGMDB-AL-34269"
            title = "Parousia" // generated(fill_music_metadata.dart v0.1.1)

            Visual(VisualKind.AlbumArt, 0.15, 0.4)

            // the third ayumu-era theme song
            SubIDEntry("7") {
                MusicConsumedProgress("5:11") // generated(fill_music_metadata.dart v0.1.1)
                title = "Ascension to Heaven" // generated(fill_music_metadata.dart v0.1.1)
                Music(0.3)
            }

            SubIDEntry("12") {
                MusicConsumedProgress("4:29") // generated(fill_music_metadata.dart v0.1.1)
                title = "FREEDOM DiVE↓" // generated(fill_music_metadata.dart v0.1.1)
                // not gonna rate all of the backgrounds and shit
                Music(0.15)
                // i'm not overstreaming 222 bpm
                NEI(0.5, Emotion.AP)
                OsuSong(personal = 0.2, community = 0.8)
            }
        }
    }

    Entry {
        id = "M-20220410T181408"
        title = "United (L.A.O.S Remix)"

        // we kicked a kid, united
        // r/osuplace stuff
        Meme(0.5, 6)
        OsuSong(personal = 0.2, community = 0.8)

        // Length source: https://www.youtube.com/watch?v=rnWXN8m6drc
        Music(0.4)
        MusicConsumedProgress("4:42") // impl_overridden
    }

    Entry {
        id = "M-VGMDB-AL-49508"
        title = "Tsukinami / Kanon Wakeshima" // generated(fill_music_metadata.dart v0.1.1)

        Visual(VisualKind.AlbumArt, 0.25, 0.5)
        SubIDEntry("2") {
            title = "ツキナミ" // generated(fill_music_metadata.dart v0.1.1)
            Music(0.4)
            // Length source: https://osu.ppy.sh/beatmapsets/896080#osu/1872396
            MusicConsumedProgress("4:44") // impl_overridden
        }
    }

    Entry {
        id = "M-VGMDB-AL-79187"
        title = "Kisses and Kills / THE ORAL CIGARETTES" // generated(fill_music_metadata.dart v0.1.1)

        Visual(VisualKind.AlbumArt, 0.1, 0.2)
        SubIDEntry("1") {
            MusicConsumedProgress("2:19") // generated(fill_music_metadata.dart v0.1.1)
            title = "もういいかい?" // generated(fill_music_metadata.dart v0.1.1)
            Music(0.4)
        }
    }

    Entry {
        id = "M-VGMDB-AL-52234"
        title = "HANASAKI WORK SPRING! COMPLETE SOUNDTRACK" // generated(fill_music_metadata.dart v0.1.1)

        Visual(VisualKind.AlbumArt, 0.5, 0.5)
        SubIDEntry("1") {
            MusicConsumedProgress("4:12") // generated(fill_music_metadata.dart v0.1.1)
            title = "Girl meets Love" // generated(fill_music_metadata.dart v0.1.1)
            Music(0.5)
            // haha tranny duy bua
            Meme(0.01, numDays("2021-06-01"))
        }
    }

    Entry {
        id = "M-VGMDB-AL-33518"
        title = "Irotoridori no Hikari Theme Songs Plus" // generated(fill_music_metadata.dart v0.1.1)

        Visual(VisualKind.AlbumArt, 0.4, 0.6)
        SubIDEntry("2") {
            MusicConsumedProgress("4:31") // generated(fill_music_metadata.dart v0.1.1)
            title = "COLORFUL DAYS!!" // generated(fill_music_metadata.dart v0.1.1)
            Music(0.7)
        }
    }

    Entry {
        id = "M-VGMDB-AL-78595"
        title = "AstralAir no Shiroki Towa - ETERNAL BEST -" // generated(fill_music_metadata.dart v0.1.1)

        Visual(VisualKind.AlbumArt, 0.4, 0.6)
        SubIDEntry("16") {
            MusicConsumedProgress("6:10") // generated(fill_music_metadata.dart v0.1.1)
            title = "Dreams come true -Hana Saki Hokoru, Chikyuu no Moto de-" // generated(fill_music_metadata.dart v0.1.1)
            Music(0.55)
        }
    }

    Entry {
        id = "M-VGMDB-AL-66742"
        title = "HARUOTO ALICE*GRAM -THEME SONG COLLECTION!3-" // generated(fill_music_metadata.dart v0.1.1)

        Visual(VisualKind.AlbumArt, 0.5, 0.3)
        SubIDEntry("1") {
            MusicConsumedProgress("4:24") // generated(fill_music_metadata.dart v0.1.1)
            title = "Haruoto＊Bell fullver." // generated(fill_music_metadata.dart v0.1.1)
            Music(0.65)
        }
    }
    Entry {
        id = "M-VGMDB-AL-99204"
        title = "SMASH The PAINT!! / Nijisanji" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.3)
    }
    Entry {
        id = "M-VGMDB-AL-60475"
        title = "1HOPE SNIPER / Azusa Tadokoro [Anime Jacket Edition]" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.6)
    }
    Entry {
        id = "M-VGMDB-AL-81136"
        title = "ADAMAS/Akai Wana (who loves it?) / LiSA [Limited Edition]" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.5, 0.5)
    }
    Entry {
        id = "M-VGMDB-AL-5135"
        title = "AIR MAN GA TAOSENAI" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.4)
    }
    Entry {
        id = "M-VGMDB-AL-43788"
        title = "Innocent Girl Theme Song & Soundtrack" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.4, 0.75)
    }
    Entry {
        id = "M-VGMDB-AL-40263"
        title = "Love Lab Vol.2 Bonus CD" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.1, 0.2)
    }
    Entry {
        id = "M-VGMDB-AL-79122"
        title = "BLACK CLOVER MUSIC COLLECTION Vol.2" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.3)
    }
    Entry {
        id = "M-VGMDB-AL-71831"
        title = "COLORS POWER NI OMAKASERO! / COLORS☆SLASH [Limited Edition]" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.2)
    }
    Entry {
        id = "M-VGMDB-AL-82981"
        title = "PRINCESS CONNECT! Re:Dive PRICONNE CHARACTER SONG 07" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.5, 0.4)
    }
    Entry {
        id = "M-VGMDB-AL-71405"
        title = "Awaken the power / Saint Aqours Snow" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.25, 0.4)
    }
    Entry {
        id = "M-VGMDB-AL-81448"
        title = "Egao no Kanata / Chiho feat. majiko" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.5, 0.3)
    }
    Entry {
        id = "M-VGMDB-AL-121238"
        title = "Shade of Mythology" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.5)
    }
    Entry {
        id = "M-VGMDB-AL-60678"
        title = "PLANET//SHAPER" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.6)
    }
    Entry {
        id = "M-VGMDB-AL-43924"
        title = "TOHO COMPLETE BOX" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.5)
    }
    Entry {
        id = "M-VGMDB-AL-60899"
        title = "God Save The Girls / Shino Shimoji" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.2)
    }
    Entry {
        id = "M-VGMDB-AL-66456"
        title = "Hakkensha wa Watashi / Tapimiru" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.2)
    }
    Entry {
        id = "M-VGMDB-AL-43075"
        title = "Heart Realize / Tia [Limited Edition]" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.5, 0.6)
    }
    Entry {
        id = "M-VGMDB-AL-43222"
        title = "HIKARI / ViViD" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.1, 0.3)
    }
    Entry {
        id = "M-VGMDB-AL-95204"
        title = "TV Animation \"Hatena ☆ Illusion\" Original Soundtrack" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.6, 0.3)
    }
    Entry {
        id = "M-VGMDB-AL-103004"
        title = "One Day / SPYAIR" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.5)
    }
    Entry {
        id = "M-VGMDB-AL-59355"
        title = "DJ'TEKINA//SOMETHING" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.5)
    }
    Entry {
        id = "M-VGMDB-AL-81535"
        title = "Duca Works 15th Anniversary BEST" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.15, 0.2)
    }
    Entry {
        id = "M-VGMDB-AL-62350"
        title = "TV ANIMATION LONGRIDERS! ORIGINAL SOUNDTRACK" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.4)
    }
    Entry {
        id = "M-VGMDB-AL-67908"
        title = "Hoshizora TeaParty Extra ~\"Ai\" Hajimarimashita!~ Hoshizora Ongakukai -ORIGINAL SOUNDTRACK-" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.7, 0.7)
    }
    Entry {
        id = "M-VGMDB-AL-62477"
        title = "Senketsu no Chikai / Yousei Teikoku" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.6)
    }
    Entry {
        id = "M-VGMDB-AL-54932"
        title = "UNDERTALE Soundtrack" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.5)
    }
    Entry {
        id = "M-VGMDB-AL-116264"
        title = "LEVEL / yanaginagi × THE SIXTH LIE" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.3)
    }
    Entry {
        id = "M-VGMDB-AL-66840"
        title = "Saenai Heroine no Sodatekata Character Song Collection" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.6)
    }
    Entry {
        id = "M-VGMDB-AL-86010"
        title = "CLARITY / PassCode" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.5)
    }
    Entry {
        id = "M-VGMDB-AL-53986"
        title = "Sendan Life / Remo Prototype (CV: Yumiri Hanamori)" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.4, 0.4)
    }
    Entry {
        id = "M-VGMDB-AL-31638"
        title = "Ongaku / wac" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.2)
    }
    Entry {
        id = "M-VGMDB-AL-38558"
        title = "Twilight Sky Escha & Logy no Atelier ~Tasogare no Sora no Renkinjutsushi~ Vocal Album" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.4, 0.5)
    }
    Entry {
        id = "M-VGMDB-AL-67439"
        title = "crossbeats REV. Limited Premium BOX" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.6)
    }
    Entry {
        id = "M-VGMDB-AL-46812"
        title = "The Glory Days / Tia" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.4, 0.6)
    }
    Entry {
        id = "M-VGMDB-AL-62503"
        title = "Wagamama MIRROR HEART / Ayaka Ohashi [Aki Edition]" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.5, 0.4)
    }
    Entry {
        id = "M-VGMDB-AL-85759"
        title = "WONDERFUL WONDER / EDOGA-SULLIVAN" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.6, 0.4)
    }
    Entry {
        id = "M-VGMDB-AL-103012"
        title = "CHUNITHM ALL JUSTICE COLLECTION ep. II" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.1, 0.3)
    }
    Entry {
        id = "M-VGMDB-AL-50020"
        title = "Yomi Yori Kikoyu, Koukoku no Tou to Honoo no Shoujo." // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.6)
    }
    Entry {
        id = "M-VGMDB-AL-43511"
        title = "yuima-ru★world / Rie Ayase" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.25, 0.5)
    }
}
