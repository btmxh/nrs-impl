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
        SubIDEntry("3") {
            title = "1+1でQ.E.D.!!" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("3:35") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.4)
            OsuSong(personal = 0.3, community = 0.0)
        }
    }
    Entry {
        id = "M-VGMDB-AL-60475"
        title = "1HOPE SNIPER / Azusa Tadokoro [Anime Jacket Edition]" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.6)
        SubIDEntry("1") {
            title = "1HOPE SNIPER" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("3:32") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.45)
            OsuSong(personal = 0.1, community = 0.0)
        }
    }
    Entry {
        id = "M-VGMDB-AL-81136"
        title = "ADAMAS/Akai Wana (who loves it?) / LiSA [Limited Edition]" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.5, 0.5)
        SubIDEntry("1") {
            title = "ADAMAS" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("3:44") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.15)
            OsuSong(personal = 0.05, community = 0.0)
        }
    }
    Entry {
        id = "M-VGMDB-AL-5135"
        title = "AIR MAN GA TAOSENAI" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.4)
        SubIDEntry("1") {
            title = "Air Man Ga Taosenai" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("3:53") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.2)
            OsuSong(personal = 0.5, community = 0.3)
        }
    }
    Entry {
        id = "M-VGMDB-AL-43788"
        title = "Innocent Girl Theme Song & Soundtrack" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.4, 0.75)
        SubIDEntry("1") {
            title = "Art as ♡" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("3:18") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.65)
            OsuSong(personal = 0.4, community = 0.0)
        }
    }
    Entry {
        id = "M-VGMDB-AL-40263"
        title = "Love Lab Vol.2 Bonus CD" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.1, 0.2)
        SubIDEntry("1") {
            title = "Best FriendS" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("4:32") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.4)
            OsuSong(personal = 0.7, community = 0.8)
        }
    }
    Entry {
        id = "M-VGMDB-AL-79122"
        title = "BLACK CLOVER MUSIC COLLECTION Vol.2" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.3)
        SubIDEntry("1") {
            title = "Black Rover (TV-SIZE)" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("1:32") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.25)
            OsuSong(personal = 0.6, community = 0.7)
        }
    }
    Entry {
        id = "M-VGMDB-AL-71831"
        title = "COLORS POWER NI OMAKASERO! / COLORS☆SLASH [Limited Edition]" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.2)
        SubIDEntry("1") {
            title = "Colors Power ni Omakasero!" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("4:10") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.25)
        }
    }
    Entry {
        id = "M-VGMDB-AL-82981"
        title = "PRINCESS CONNECT! Re:Dive PRICONNE CHARACTER SONG 07" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.5, 0.4)
        SubIDEntry("2") {
            title = "Ding Dong Holy Night♪" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("4:18") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.45)
            OsuSong(personal = 0.5, community = 0.0)
        }
    }
    Entry {
        id = "M-VGMDB-AL-71405"
        title = "Awaken the power / Saint Aqours Snow" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.25, 0.4)
        SubIDEntry("3") {
            title = "DROPOUT!?" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("3:56") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.4)
            OsuSong(personal = 0.4, community = 0.0)
        }
    }
    Entry {
        id = "M-VGMDB-AL-81448"
        title = "Egao no Kanata / Chiho feat. majiko" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.5, 0.3)
        SubIDEntry("1") {
            title = "Egao no Kanata" // generated(fill_music_metadata.dart v0.1.1)    
            // Length source: https://osu.ppy.sh/beatmapsets/1048878#osu/2192351
            MusicConsumedProgress("3:50") // impl_overridden
            Music(0.5)
            OsuSong(personal = 0.25, community = 0.0)
        }
    }
    Entry {
        id = "M-VGMDB-AL-121238"
        title = "Shade of Mythology" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.5)
        SubIDEntry("2") {
            title = "EOS -Long Version-" // generated(fill_music_metadata.dart v0.1.1)
            // Length source: https://osu.ppy.sh/beatmapsets/160493#osu/392028
            MusicConsumedProgress("4:05") // impl_overridden
            Music(0.4)
            OsuSong(personal = 0.75, community = 0.4)
        }
    }
    Entry {
        id = "M-VGMDB-AL-60678"
        title = "PLANET//SHAPER" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.6)
        SubIDEntry("11") {
            title = "Exit This Earth's Atomosphere" // generated(fill_music_metadata.dart v0.1.1)
            // Length source: https://www.youtube.com/watch?v=QsuAKlNe_rI
            MusicConsumedProgress("5:32") // impl_overridden
            Music(0.5)
            OsuSong(personal = 0.35, community = 0.75)
        }
    }
    Entry {
        id = "M-VGMDB-AL-43924"
        title = "TOHO COMPLETE BOX" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.5)
        SubIDEntry("47") {
            title = "Frozen" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("3:20") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.45)
            OsuSong(personal = 0.5, community = 0.1)
        }
    }
    Entry {
        id = "M-VGMDB-AL-60899"
        title = "God Save The Girls / Shino Shimoji" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.2)
        SubIDEntry("1") {
            title = "God Save The Girls" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("4:19") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.45)
            OsuSong(personal = 0.25, community = 0.0)
        }
    }
    Entry {
        id = "M-VGMDB-AL-66456"
        title = "Hakkensha wa Watashi / Tapimiru" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.2)
        SubIDEntry("1") {
            title = "Hakkensha wa Watashi" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("4:32") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.4)
            OsuSong(personal = 0.25, community = 0.5)
        }
    }
    Entry {
        id = "M-VGMDB-AL-43075"
        title = "Heart Realize / Tia [Limited Edition]" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.5, 0.6)
        SubIDEntry("1") {
            title = "Heart Realize" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("4:55") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.5)
            OsuSong(personal = 0.75, community = 0.3)
        }
    }
    Entry {
        id = "M-VGMDB-AL-43222"
        title = "HIKARI / ViViD" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.1, 0.3)
        SubIDEntry("1") {
            title = "HIKARI" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("4:10") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.5)
            OsuSong(personal = 0.8, community = 0.8)
        }
    }
    Entry {
        id = "M-VGMDB-AL-95204"
        title = "TV Animation \"Hatena ☆ Illusion\" Original Soundtrack" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.6, 0.3)
        SubIDEntry("1") {
            title = "Hatena☆Illusion" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("2:50") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.5)
            OsuSong(personal = 0.3, community = 0.1)
        }
    }
    Entry {
        id = "M-VGMDB-AL-103004"
        title = "One Day / SPYAIR" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.5)
        SubIDEntry("3") {
            title = "イマジネーション" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("3:01") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.45)
            OsuSong(personal = 0.4, community = 0.2)
        }
    }
    Entry {
        id = "M-VGMDB-AL-59355"
        title = "DJ'TEKINA//SOMETHING" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.5)
        SubIDEntry("2") {
            title = "Internet bxxch (feat. YUCe')" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("5:04") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.6)
            OsuSong(personal = 0.5, community = 0.4)
        }
    }
    Entry {
        id = "M-VGMDB-AL-81535"
        title = "Duca Works 15th Anniversary BEST" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.15, 0.2)
        SubIDEntry("9") {
            title = "Kanransha ~Ano Hi to, Kinou to Kyou to Ashita to~" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("4:11") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.75)
            OsuSong(personal = 0.5, community = 0.0)
        }
    }
    Entry {
        id = "M-VGMDB-AL-62350"
        title = "TV ANIMATION LONGRIDERS! ORIGINAL SOUNDTRACK" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.4)
        SubIDEntry("1") {
            title = "♡km/h (TV size)" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("1:32") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.5)
            OsuSong(personal = 0.6, community = 0.1)
        }
    }
    Entry {
        id = "M-VGMDB-AL-67908"
        title = "Hoshizora TeaParty Extra ~\"Ai\" Hajimarimashita!~ Hoshizora Ongakukai -ORIGINAL SOUNDTRACK-" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.7, 0.7)
        SubIDEntry("1") {
            title = "ここにいるよ" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("4:34") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.65)
            OsuSong(personal = 0.6, community = 0.0)
        }
    }
    Entry {
        id = "M-VGMDB-AL-62477"
        title = "Senketsu no Chikai / Yousei Teikoku" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.6)
        SubIDEntry("3") {
            title = "Kokou no Sousei" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("5:11") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.5)
            OsuSong(personal = 0.6, community = 0.75)
        }
    }
    Entry {
        id = "M-VGMDB-AL-54932"
        title = "UNDERTALE Soundtrack" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.5)
        SubIDEntry("96") {
            title = "Last Goodbye" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("2:16") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.55)
            OsuSong(personal = 0.75, community = 0.65)
        }
    }
    Entry {
        id = "M-VGMDB-AL-116264"
        title = "LEVEL / yanaginagi × THE SIXTH LIE" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.3)
        SubIDEntry("1") {
            title = "LEVEL" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("4:13") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.65)
            OsuSong(personal = 0.25, community = 0.0)
        }
    }
    Entry {
        id = "M-VGMDB-AL-66840"
        title = "Saenai Heroine no Sodatekata Character Song Collection" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.6)
        SubIDEntry("6") {
            title = "M♭" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("3:42") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.25)
            OsuSong(personal = 0.4, community = 0.0)
        }
    }
    Entry {
        id = "M-VGMDB-AL-86010"
        title = "CLARITY / PassCode" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.5)
        SubIDEntry("3") {
            title = "Ray" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("3:49") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.6)
            OsuSong(personal = 0.5, community = 0.6)
        }
    }
    Entry {
        id = "M-VGMDB-AL-53986"
        title = "Sendan Life / Remo Prototype (CV: Yumiri Hanamori)" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.4, 0.4)
        SubIDEntry("1") {
            title = "Sendan Life" // generated(fill_music_metadata.dart v0.1.1)
            // Length source: https://osu.ppy.sh/beatmapsets/416153#osu/901854
            MusicConsumedProgress("3:52") // impl_overridden
            Music(0.5)
            OsuSong(personal = 0.7, community = 0.8)
        }
    }
    Entry {
        id = "M-VGMDB-AL-31638"
        title = "Ongaku / wac" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.2)
        SubIDEntry("9") {
            title = "Shounen Ripples" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("4:45") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.4)
            OsuSong(personal = 0.75, community = 0.2)
        }
    }
    Entry {
        id = "M-VGMDB-AL-38558"
        title = "Twilight Sky Escha & Logy no Atelier ~Tasogare no Sora no Renkinjutsushi~ Vocal Album" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.4, 0.5)
        SubIDEntry("8") {
            title = "Sky of Twilight" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("6:21") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.45)
            OsuSong(personal = 0.5, community = 0.0)
        }
    }
    Entry {
        id = "M-VGMDB-AL-67439"
        title = "crossbeats REV. Limited Premium BOX" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.2, 0.6)
        SubIDEntry("13") {
            title = "Sunglow" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("1:58") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.4)
            OsuSong(personal = 0.75, community = 0.75)
        }
    }
    Entry {
        id = "M-VGMDB-AL-46812"
        title = "The Glory Days / Tia" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.4, 0.6)
        SubIDEntry("1") {
            title = "The Glory Days" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("4:16") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.6)
            OsuSong(personal = 0.9, community = 0.7)
        }
    }
    Entry {
        id = "M-VGMDB-AL-62503"
        title = "Wagamama MIRROR HEART / Ayaka Ohashi [Aki Edition]" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.5, 0.4)
        SubIDEntry("1") {
            title = "Wagamama MIRROR HEART" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("4:34") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.45)
            OsuSong(personal = 0.9, community = 0.0)
        }
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
        SubIDEntry("16") {
            title = "Xevel" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("2:21") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.4)
            OsuSong(personal = 0.6, community = 0.8)
        }
    }
    Entry {
        id = "M-VGMDB-AL-50020"
        title = "Yomi Yori Kikoyu, Koukoku no Tou to Honoo no Shoujo." // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.3, 0.6)
        SubIDEntry("1") {
            title = "黄泉より聴こゆ、皇国の燈と焔の少女。" // generated(fill_music_metadata.dart v0.1.1)
            MusicConsumedProgress("8:20") // generated(fill_music_metadata.dart v0.1.1)
            Music(0.45)
            OsuSong(personal = 1.0, community = 1.0)
        }
    }
    Entry {
        id = "M-VGMDB-AL-43511"
        title = "yuima-ru★world / Rie Ayase" // generated(fill_music_metadata.dart v0.1.1)
        Visual(VisualKind.AlbumArt, 0.25, 0.5)
        SubIDEntry("1") {
            title = "Yuima-ru★World" // generated(fill_music_metadata.dart v0.1.1)
            // Length source: https://osu.ppy.sh/beatmapsets/1151399#osu/2403410
            MusicConsumedProgress("2:03") // impl_overridden
            Music(0.25)
            OsuSong(personal = 0.3, community = 0.75)
        }
    }
    Entry {
        id = "M-20221202T205325"
        title = "Yume Chizu"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.7)
        OsuSong(personal = 0.75, community = 0.25)
        // Length source: https://osu.ppy.sh/beatmapsets/467337#osu/999944
        MusicConsumedProgress("3:07")
    }
    Entry {
        id = "M-20221202T205227"
        title = "Yubi Bouenkyou"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.65)
        OsuSong(personal = 1.0, community = 0.8)
        // Length source: https://www.youtube.com/watch?v=p3Zuryi74ts
        MusicConsumedProgress("4:21")
    }
    Entry {
        id = "M-20221202T205118"
        title = "World's End, Girl's Rondo(Asterisk DnB Remix)"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.7)
        OsuSong(personal = 0.75, community = 0.8)
        // Length source: https://osu.ppy.sh/beatmapsets/331499
        MusicConsumedProgress("5:42")
    }
    Entry {
        id = "M-20221202T205043"
        title = "Wizard's Tower"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.3)
        OsuSong(personal = 0.75, community = 0.8)
        // Length source: https://osu.ppy.sh/beatmapsets/985788
        MusicConsumedProgress("2:40")
    }
    Entry {
        id = "M-20221202T204908"
        title = "utopia"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.5)
        OsuSong(personal = 0.8, community = 0.7)
        // Length source: https://osu.ppy.sh/beatmapsets/1117851
        MusicConsumedProgress("4:21")
    }
    Entry {
        id = "M-20221202T204859"
        title = "Uta"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.4)
        OsuSong(personal = 0.7, community = 0.9)
        // Length source: https://osu.ppy.sh/beatmapsets/410162
        MusicConsumedProgress("8:48")
    }
    Entry {
        id = "M-20221202T204820"
        title = "The Big Black"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.5)
        OsuSong(personal = 1.0, community = 1.0)
        // Length source: https://osu.ppy.sh/beatmapsets/41823
        MusicConsumedProgress("2:19")
    }
    Entry {
        id = "M-20221202T204712"
        title = "Start Again"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.4)
        OsuSong(personal = 1.0, community = 0.6)
        // Length source: https://open.spotify.com/track/7b1nJaOmQowF0ySjQuCrHw
        MusicConsumedProgress("3:14")
    }
    Entry {
        id = "M-20221202T204553"
        title = "(Foreground Eclipse) Songs Compilation"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.7)
        OsuSong(personal = 0.7, community = 0.9)
        // Length source: https://osu.ppy.sh/beatmapsets/765497
        MusicConsumedProgress("6:39")
    }
    Entry {
        id = "M-20221202T204342"
        title = "Sidetracked Day"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.5)
        OsuSong(personal = 0.9, community = 0.9)
        // Length source: https://osu.ppy.sh/beatmapsets/1008679
        MusicConsumedProgress("5:35")
    }
    Entry {
        id = "M-20221202T203918"
        title = "Shin Sekai no α"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.6)
        OsuSong(personal = 0.75, community = 0.0)
        // Length source: https://osu.ppy.sh/beatmapsets/1370577#osu/2833948
        MusicConsumedProgress("4:21")
    }
    Entry {
        id = "M-20221202T203758"
        title = "Sayonara, Adam to Eve"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.55)
        OsuSong(personal = 0.7, community = 0.0)
        // Length source: https://osu.ppy.sh/beatmapsets/981282
        MusicConsumedProgress("4:17")
    }
    Entry {
        id = "M-20221202T203633"
        title = "Sakurairo Time Capsule"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.6)
        OsuSong(personal = 0.7, community = 0.0)
        // Length source: https://osu.ppy.sh/beatmapsets/1146780
        MusicConsumedProgress("4:20")
    }
    Entry {
        id = "M-20221202T203601"
        title = "Road of Resistance"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.55)
        OsuSong(personal = 0.6, community = 0.8)
        // Length source: https://osu.ppy.sh/beatmapsets/399372
        MusicConsumedProgress("5:00")
    }
    Entry {
        id = "M-20221202T202818"
        title = "Himeringo - Ringo Uri no Utakata Shoujo"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.65)
        OsuSong(personal = 0.7, community = 0.0)
        // ayumu-era shelter lmfao
        AEI(0.9, Emotion.CU to 0.5, Emotion.MP to 0.4, Emotion.CP to 0.1)
        // Length source: https://osu.ppy.sh/beatmapsets/752073
        MusicConsumedProgress("5:32")
    }
    Entry {
        id = "M-20221202T202803"
        title = "REASON"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.5)
        OsuSong(personal = 0.5, community = 0.7)
        // Length source: https://osu.ppy.sh/beatmapsets/989540
        MusicConsumedProgress("5:27")
    }
    Entry {
        id = "M-20221202T202709"
        title = "RAISE MY SWORD"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.4)
        OsuSong(personal = 0.7, community = 0.9)
        // Length source: https://osu.ppy.sh/beatmapsets/889855
        MusicConsumedProgress("7:02")
    }
    Entry {
        id = "M-20221202T202651"
        title = "Plasma Gun"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.4)
        OsuSong(personal = 0.9, community = 0.9)
        // Length source: https://osu.ppy.sh/beatmapsets/1341551
        MusicConsumedProgress("0:58")
    }
    Entry {
        id = "M-20221202T202626"
        title = "Pink Kurage to, Sotto, Kiss o Shita."
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.6)
        OsuSong(personal = 0.25, community = 0.0)
        // Length source: https://osu.ppy.sh/beatmapsets/1491009
        MusicConsumedProgress("3:49")
    }
    Entry {
        id = "M-20221202T202617"
        title = "Pastel Subliminal & Synesthesia"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.6)
        OsuSong(personal = 0.4, community = 0.6)
        // Length source: https://osu.ppy.sh/beatmapsets/1063842
        MusicConsumedProgress("8:00")
    }
    Entry {
        id = "M-20221202T202453"
        title = "PADORU / PADORU"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.25)
        OsuSong(personal = 0.75, community = 0.75)
        // Length source: https://osu.ppy.sh/beatmapsets/1073074
        MusicConsumedProgress("0:32")
    }
    Entry {
        id = "M-20221202T202443"
        title = "chano & 40mP - Natsukoi Hanabi"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.4)
        OsuSong(personal = 0.7, community = 0.3)
        // Length source: https://www.youtube.com/watch?v=6ABGdYFQbLk
        MusicConsumedProgress("4:41")
    }
    Entry {
        id = "M-20221202T202421"
        title = "Kano - Natsu no Owari, Koi no Hajimari"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.65)
        OsuSong(personal = 0.0, community = 0.0)
        // Length source: https://www.youtube.com/watch?v=j4LoBrhN5rM
        MusicConsumedProgress("4:08")
    }
    Entry {
        id = "M-20221202T202405"
        title = "yuikonnu - Natsu no Owari, Koi no Hajimari"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.6)
        OsuSong(personal = 0.6, community = 0.1)
        // Length source: https://osu.ppy.sh/beatmapsets/206335#osu/486613
        MusicConsumedProgress("4:02")
    }
    Entry {
        id = "M-20221202T202350"
        title = "Shinonome Natsuhi (CV: Hinami Yuri) - Moratorium no Oto"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.5)
        OsuSong(personal = 0.7, community = 0.0)
        // Length source: https://www.youtube.com/watch?v=1jowaGYaes4
        MusicConsumedProgress("4:00")
    }
    Entry {
        id = "M-20221202T202334"
        title = "LeaF - Mopemope"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.4)
        OsuSong(personal = 0.6, community = 0.7)
        // Length source: https://osu.ppy.sh/beatmapsets/1097600
        MusicConsumedProgress("1:50")
    }
    Entry {
        id = "M-20221202T202313"
        title = "MIMI feat. Hatsune Miku - Mizuoto to Curtain"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.45)
        OsuSong(personal = 0.7, community = 0.0)
        // Length source: https://osu.ppy.sh/beatmapsets/1001653
        MusicConsumedProgress("2:47")
    }
    Entry {
        id = "M-20221202T202258"
        title = "nameless - Milk Crown on Sonnetica"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.6)
        OsuSong(personal = 0.6, community = 0.3)
        // Length source: https://osu.ppy.sh/beatmapsets/327557
        MusicConsumedProgress("3:33")
    }
    Entry {
        id = "M-20221202T201347"
        title = "Rin'ca - Koisuru MODE"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.6)
        OsuSong(personal = 0.5, community = 0.0)
        // Length source: https://osu.ppy.sh/beatmapsets/1457658
        MusicConsumedProgress("3:56")
    }
    Entry {
        id = "M-20221202T201210"
        title = "*namirin - Koi no Hime Hime Pettanko"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.4)
        OsuSong(personal = 0.75, community = 0.75)
        // Length source: https://www.youtube.com/watch?v=hPSQ23NRED8
        MusicConsumedProgress("4:01")
    }
    Entry {
        id = "M-20221202T201031"
        title = "YURiMental - Kinou ni Kanaderu Ashita no Uta (Cut Ver.)"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.4)
        OsuSong(personal = 0.3, community = 0.6)
        // Length source: https://www.youtube.com/watch?v=N2oWyMXWC5Y
        MusicConsumedProgress("5:03")
    }
    Entry {
        id = "M-20221202T194352"
        title = "AliA - Kakurenbo"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.7)
        OsuSong(personal = 0.5, community = 0.25)
        // Length source: https://osu.ppy.sh/beatmapsets/1466465
        MusicConsumedProgress("4:52")
    }
    Entry {
        id = "M-20221202T210619"
        title = "Tatsh - IMAGE -MATERIAL- <Version 0>"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.4)
        OsuSong(personal = 0.7, community = 0.9)
        // Length source: https://osu.ppy.sh/beatmapsets/93523
        MusicConsumedProgress("6:25")
    }
    Entry {
        id = "M-20221202T194015"
        title = "HAG - Hoshikuzu Orchestra"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.55)
        OsuSong(personal = 0.5, community = 0.0)
        // Length source: https://osu.ppy.sh/beatmapsets/804193
        MusicConsumedProgress("4:48")
    }
    Entry {
        id = "M-20221202T193932"
        title = "Minase Inori - Hoshikuzu no Contrail"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.65)
        OsuSong(personal = 0.6, community = 0.0)
        // Length source: https://osu.ppy.sh/beatmapsets/778526
        MusicConsumedProgress("4:21")
    }
    Entry {
        id = "M-20221202T193824"
        title = "Set It Off - Horrible Kids"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.4)
        OsuSong(personal = 0.5, community = 0.6)
        // Length source: https://www.youtube.com/watch?v=UlECVY129fY
        MusicConsumedProgress("3:03")
    }
    Entry {
        id = "M-20221202T193801"
        title = "GYZE - HONESTY"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.5)
        OsuSong(personal = 0.6, community = 0.9)
        // Length source: https://osu.ppy.sh/beatmapsets/586121
        MusicConsumedProgress("5:02")
    }
    Entry {
        id = "M-20221202T193602"
        title = "*namirin - Hitokoto no Kyori"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.45)
        OsuSong(personal = 0.5, community = 0.0)
        // Length source: https://osu.ppy.sh/beatmapsets/667290
        MusicConsumedProgress("3:48")
    }
    Entry {
        id = "M-20221202T193402"
        title = "Fukunaga Yoru - Hitohira no, Daisuki o,"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.65)
        OsuSong(personal = 0.1, community = 0.0)
        // Length source: https://osu.ppy.sh/beatmapsets/1614847
        MusicConsumedProgress("4:34")
    }
    Entry {
        id = "M-20221202T192736"
        title = "Ayase Rie - Hijitsuzaikei Joshitachi wa Dou Surya Ii Desu ka?"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.6)
        OsuSong(personal = 0.6, community = 0.75)
        // Length source: https://osu.ppy.sh/beatmapsets/1312124
        MusicConsumedProgress("3:19")
    }
    Entry {
        id = "M-20221202T192642"
        title = "TrySail & TRUE - High Free Spirits vs. DREAM SOLISTER"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.6)
        OsuSong(personal = 0.4, community = 0.3)
        // Length source: https://osu.ppy.sh/beatmapsets/564534
        MusicConsumedProgress("1:51")
    }
    Entry {
        id = "M-20221202T192505"
        title = "cosMo@BousouP feat.Hatsune Miku - Hatsune Miku no Shoushitsu"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.5)
        OsuSong(personal = 0.4, community = 0.0)
        // Length source: https://osu.ppy.sh/beatmapsets/125843
        MusicConsumedProgress("4:35")
    }
    Entry {
        id = "M-20221202T192314"
        title = "SOOOO - Happppy song"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.45)
        OsuSong(personal = 0.75, community = 0.75)
        // Length source: https://osu.ppy.sh/beatmapsets/1016769
        MusicConsumedProgress("5:19")
    }
    Entry {
        id = "M-20221202T192116"
        title = "Sound piercer feat. DAZBEE - Hanatachi ni Kibou o (2020 Remaster)"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.5)
        OsuSong(personal = 0.5, community = 0.5)
        // Length source: https://osu.ppy.sh/beatmapsets/1378089
        MusicConsumedProgress("2:45")
    }
    Entry {
        id = "M-20221202T191926"
        title = "Carlito - Go Go Carlito (Who's That Boy?)"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.5)
        OsuSong(personal = 0.3, community = 0.6)
        // Length source: https://osu.ppy.sh/beatmapsets/1063490
        MusicConsumedProgress("3:11")
    }
    Entry {
        id = "M-20221202T191729"
        title = "Watashi (CV: Yuuki Aoi) - Ganbare! Kumoko-san no Thema (TV Size)"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.4)
        OsuSong(personal = 0.2, community = 0.3)
        // Length source: https://www.youtube.com/watch?v=lZqbgn3SvmU
        MusicConsumedProgress("4:35")
    }
    Entry {
        id = "M-20221202T191703"
        title = "Kurokotei - Galaxy Collapse"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.3)
        OsuSong(personal = 0.3, community = 0.75)
        // Length source: https://osu.ppy.sh/beatmapsets/396221
        MusicConsumedProgress("5:54")
    }
    Entry {
        id = "M-20221202T191512"
        title = "DECO*27 - First Storm feat. Hatsune Miku"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.5)
        OsuSong(personal = 0.75, community = 0.5)
        // Length source: https://osu.ppy.sh/beatmapsets/696175
        MusicConsumedProgress("3:48")
    }
    Entry {
        id = "M-20221202T191455"
        title = "Camellia - Exit This Earth's Atomosphere (Camellia's ''PLANETARY//200STEP'' Remix)"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.5)
        OsuSong(personal = 0.6, community = 0.75)
        // Length source: https://osu.ppy.sh/beatmapsets/855677
        MusicConsumedProgress("6:31")
    }
    Entry {
        id = "M-20221202T190955"
        title = "Aline Barros - Eu Li Na Biblia (Sped Up & Cut Ver.)"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.4)
        OsuSong(personal = 0.1, community = 0.2)
        // original version is too different to be the length source
        // Length source: https://osu.ppy.sh/beatmapsets/1769206
        MusicConsumedProgress("1:36")
    }
    Entry {
        id = "M-20221202T184056"
        title = "Aitsuki Nakuru - Dramatic Star (Cut Ver.)"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.45)
        OsuSong(personal = 0.6, community = 0.0)
        // Length source: https://osu.ppy.sh/beatmapsets/925973#osu/1934098
        MusicConsumedProgress("3:45")
    }
    Entry {
        id = "M-20221202T184040"
        title = "Amatsuki - DORAEMON"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.3)
        OsuSong(personal = 0.5, community = 0.25)
        // Length source: https://osu.ppy.sh/beatmapsets/1210297#osu/2519704
        MusicConsumedProgress("3:56")
    }
    Entry {
        id = "M-20221202T210602"
        title = "KASAI HARCORES - Cycle Hit"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.5)
        // Length source: https://osu.ppy.sh/beatmapsets/636839
        MusicConsumedProgress("5:07")
    }
    Entry {
        id = "M-20221202T210558"
        title = "Mami Kawada - Contrail ~Kiseki~ (Epsilon Remix)"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.6)
        // Length source: https://osu.ppy.sh/beatmapsets/461966
        MusicConsumedProgress("5:50")
    }
    Entry {
        id = "M-20221202T182453"
        title = "Zedd - Clarity feat. Foxes (IOSYS uno DENPA Remix)"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.4)
        // Length source: https://osu.ppy.sh/beatmapsets/615644
        MusicConsumedProgress("3:24")
    }
    Entry {
        id = "M-20221127T140645"
        title = "Criticrista - Bibibeach Bibibibeach! (411 Socacore Remix)"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.7)
        // Length source: https://osu.ppy.sh/beatmapsets/1092567
        MusicConsumedProgress("4:32")
    }
    Entry {
        id = "M-20221127T140609"
        title = "S3RL - Bass Slut (Original Mix)"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.25)
        OsuSong(personal = 0.4, community = 0.1)
        // Length source: https://osu.ppy.sh/beatmapsets/983911
        MusicConsumedProgress("2:18")
    }
    Entry {
        id = "M-20221127T140415"
        title = "Mrs. GREEN APPLE - Ao to Natsu (katagiri Bootleg) (Sped Up Ver.)"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.55)
        OsuSong(personal = 0.6, community = 0.75)
        // Length source: https://osu.ppy.sh/beatmapsets/1211809
        MusicConsumedProgress("3:32")
    }
    Entry {
        id = "M-VGMDB-AL-74120"

        Visual(VisualKind.AlbumArt, 0.3, 0.5)

        SubIDEntry("1") {
            Music(0.4)
            OsuSong(personal = 0.4, community = 0.0)
            // Length source: https://osu.ppy.sh/beatmapsets/644332
            MusicConsumedProgress("1:27")
        }
    }
    Entry {
        id = "M-VGMDB-AL-54237"

        Visual(VisualKind.AlbumArt, 0.4, 0.5)

        SubIDEntry("7") {
            Music(0.45)
            OsuSong(personal = 0.75, community = 0.25)
            // Length source: https://osu.ppy.sh/beatmapsets/1188740
            MusicConsumedProgress("3:57")
        }
    }
    Entry {
        id = "M-20221127T140303"
        title = "Falconnect feat. Hatsune Miku - Akaneiro no Mahou"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.55)
        OsuSong(personal = 0.1, community = 0.0)
        // Length source: https://www.youtube.com/watch?v=UJDn-4UdwiI
        MusicConsumedProgress("4:30")
    }
    Entry {
        id = "M-20221202T210523"
        title = "MIMI feat. Hatsune Miku - Ai no Sukima (Rock Cover)"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.45)
        OsuSong(personal = 0.3, community = 0.0)
        // Length source: https://osu.ppy.sh/beatmapsets/1092468
        MusicConsumedProgress("1:31")
    }
    Entry {
        id = "M-20221127T140129"
        title = "MIMI feat. Hatsune Miku - Ai no Sukima"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.4)
        OsuSong(personal = 0.4, community = 0.0)
        // Length source: https://osu.ppy.sh/beatmapsets/1323207
        MusicConsumedProgress("3:37")
    }
    Entry {
        id = "M-20221127T140107"
        title = "sana x 000 x mary - Ai Kotoba III"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.35)
        OsuSong(personal = 0.05, community = 0.0)
        // Length source: https://osu.ppy.sh/beatmapsets/1149018
        MusicConsumedProgress("4:05")
    }
    Entry {
        id = "M-20221127T135748"
        title = "Nashimoto Ui - AaAaAaAAaAaAAa"
        ValidatorSuppress("dah-entry-no-consumed")
        Music(0.25)
        OsuSong(personal = 0.2, community = 0.0)
        // Length source: https://www.nicovideo.jp/watch/sm6816232
        MusicConsumedProgress("3:40")
    }
}
