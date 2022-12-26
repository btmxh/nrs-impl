package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

fun DSLScope.KokuhakuJikkouIinkai() {
    // holy fuck how many of these songs have been heard by me in osu! bro
    // also i hate himeno sena
    // (sena narumi is cool tho)
    Entry {
        id = "F-VGMDB-4192"
        title = "Kokuhaku Jikkou Iinkai"

        // checkout this cool honeyworks map :tf:
        // https://osu.ppy.sh/beatmapsets/1684004#mania/3440927
        // and this song too
        // https://www.youtube.com/watch?v=MpMtiNf4fPw
        // wtf they even made an eroge????
        // https://vndb.org/v17516

        Entry {
            id = "M-VGMDB-AR-14655"
            title = "HoneyWorks" // generated(fill_music_metadata.dart v0.1.1)
            // these ppl are responsible for so many osu! songs wtf

            // * with honeyworks
            Contains(MusicInstContainFactor + MusicImageContainFactor * 0.5) {
                Entry {
                    id = "M-VGMDB-AL-53266"
                    title = "Pride Kakumei / CHiCO with HoneyWorks" // generated(fill_music_metadata.dart v0.1.1)

                    Visual(VisualKind.AlbumArt, 0.2, 0.5)
                    SubIDEntry("1") {
                        MusicConsumedProgress("3:55") // generated(fill_music_metadata.dart v0.1.1)
                        title = "Pride Kakumei" // generated(fill_music_metadata.dart v0.1.1)
                        Music(0.4)
                        OsuSong(personal = 0.5, community = 0.0)
                        Visual(VisualKind.SemiAnimatedMV, 0.5, 0.5)
                    }
                }

                Entry {
                    id = "M-VGMDB-AL-50202"
                    title = "Ai no Scenario / CHiCO with HoneyWorks" // generated(fill_music_metadata.dart v0.1.1)

                    Visual(VisualKind.AlbumArt, 0.2, 0.5)
                    SubIDEntry("1") {
                        MusicConsumedProgress("4:18") // generated(fill_music_metadata.dart v0.1.1)
                        title = "Ai no Scenario" // generated(fill_music_metadata.dart v0.1.1)
                        Music(0.4)
                        // monstrata's "海色 vs. アイのシナリオ" :skull:
                        OsuSong(personal = 0.6, community = 0.2)
                        Visual(VisualKind.SemiAnimatedMV, 0.5, 0.5)
                    }
                }

                Entry {
                    id = "M-VGMDB-AL-61577"
                    title = "Senpai. / HoneyWorks meets TrySail" // generated(fill_music_metadata.dart v0.1.1)

                    Visual(VisualKind.AlbumArt, 0.1, 0.3)
                    SubIDEntry("1") {
                        MusicConsumedProgress("5:14") // generated(fill_music_metadata.dart v0.1.1)
                        title = "Senpai." // generated(fill_music_metadata.dart v0.1.1)
                        Music(0.5)
                        OsuSong(personal = 0.6, community = 0.0)
                        Visual(VisualKind.SemiAnimatedMV, 0.5, 0.5)
                    }
                }

                Entry {
                    id = "M-VGMDB-AL-73678"
                    title = "Nostalgic Rainfall / CHiCO with HoneyWorks" // generated(fill_music_metadata.dart v0.1.1)

                    Visual(VisualKind.AlbumArt, 0.2, 0.5)
                    SubIDEntry("1") {
                        MusicConsumedProgress("3:58") // generated(fill_music_metadata.dart v0.1.1)
                        title = "ノスタルジックレインフォール" // generated(fill_music_metadata.dart v0.1.1)
                        Music(0.3)
                        OsuSong(personal = 0.3, community = 0.0)
                        Visual(VisualKind.SemiAnimatedMV, 0.5, 0.5)
                    }
                }

                Entry {
                    id = "M-VGMDB-AL-74820"
                    title = "Watashi wo Someru I no Uta / CHiCO with HoneyWorks" // generated(fill_music_metadata.dart v0.1.1)

                    Visual(VisualKind.AlbumArt, 0.2, 0.5)
                    SubIDEntry("1") {
                        MusicConsumedProgress("4:27") // generated(fill_music_metadata.dart v0.1.1)
                        title = "Watashi Idol Sengen" // generated(fill_music_metadata.dart v0.1.1)
                        Music(0.4)
                        OsuSong(personal = 0.8, community = 0.0)
                        Visual(VisualKind.SemiAnimatedMV, 0.5, 0.5)
                    }
                }

                Entry {
                    id = "M-VGMDB-AL-54636"
                    title = "Kotoba no Iranai Yakusoku/Akatsukizukuyo / sana/HoneyWorks" // generated(fill_music_metadata.dart v0.1.1)

                    Visual(VisualKind.AlbumArt, 0.3, 0.5)
                    SubIDEntry("2") {
                        MusicConsumedProgress("4:42") // generated(fill_music_metadata.dart v0.1.1)
                        title = "Akatsukizukuyo" // generated(fill_music_metadata.dart v0.1.1)
                        Music(0.45)
                        OsuSong(personal = 0.5, community = 0.5)
                        // [taeyang's extra]
                        Visual(VisualKind.SemiAnimatedMV, 0.5, 0.5)
                    }
                }

                Entry {
                    id = "M-VGMDB-AL-46039"
                    title = "Sekai wa Koi ni Ochiteiru / CHiCO with HoneyWorks [Limited Edition]" // generated(fill_music_metadata.dart v0.1.1)

                    Visual(VisualKind.AlbumArt, 0.4, 0.4)
                    SubIDEntry("2") {
                        MusicConsumedProgress("4:00") // generated(fill_music_metadata.dart v0.1.1)
                        title = "color" // generated(fill_music_metadata.dart v0.1.1)
                        Music(0.3)
                        OsuSong(personal = 0.4, community = 0.0)
                    }
                }

                Entry {
                    id = "M-VGMDB-AL-92983"
                    title = "Kessen Spirit / CHiCO with HoneyWorks [CHiCO with HoneyWorks Edition]" // generated(fill_music_metadata.dart v0.1.1)

                    Visual(VisualKind.AlbumArt, 0.2, 0.5)
                    SubIDEntry("1") {
                        MusicConsumedProgress("4:32") // generated(fill_music_metadata.dart v0.1.1)
                        title = "決戦スピリット" // generated(fill_music_metadata.dart v0.1.1)
                        Music(0.5)
                        OsuSong(personal = 0.3, community = 0.0)
                        Visual(VisualKind.SemiAnimatedMV, 0.5, 0.5)
                    }
                }
            }

            Contains(MusicInstContainFactor + MusicImageContainFactor) {
                Entry {
                    // https://lovecommittee.fandom.com/wiki/Boku_Ja_Dame_Desu_ka%3F_~Kokuhaku_Jikkou_Iinkai_Character_Song_Collection~
                    id = "M-20221225T010305"
                    title = "Boku Ja Dame Desu ka? ~Kokuhaku Jikkou Iinkai Character Song Collection~"

                    Visual(VisualKind.AlbumArt, 0.3, 0.5)
                    Entry {
                        id = "M-20221225T015443"
                        title = "Kokuhaku Rival Sengen"
                        // Length source: https://osu.ppy.sh/beatmapsets/301561#osu/676193
                        MusicConsumedProgress("3:49")
                        Music(0.2)
                        OsuSong(personal = 0.2, community = 0.0)
                        Visual(VisualKind.SemiAnimatedMV, 0.5, 0.5)
                    }

                    Entry {
                        id = "M-20221225T015456"
                        title = "Ima Suki ni Naru."
                        // Length source: https://www.youtube.com/watch?v=WqlpuarOvq8
                        MusicConsumedProgress("4:19")
                        Music(0.4)
                        // such a fucking iconic song
                        OsuSong(personal = 1.0, community = 0.0)
                        Visual(VisualKind.SemiAnimatedMV, 0.5, 0.5)
                    }

                    Entry {
                        id = "M-20221225T015505"
                        title = "Miraizu"
                        // Length source: https://open.spotify.com/track/08GL8ARBGmSFRMqj8oQbkZ
                        MusicConsumedProgress("3:29")
                        Music(0.45)
                        OsuSong(personal = 0.3, community = 0.1)
                    }
                }

                Entry {
                    id = "M-VGMDB-AL-91835"
                    title = "Sukisugite Yabai. ~Kokuhaku Jikkou Iinkai Character Song Collection~" // generated(fill_music_metadata.dart v0.1.1)

                    Visual(VisualKind.AlbumArt, 0.3, 0.5)

                    SubIDEntry("4") {
                        MusicConsumedProgress("4:22") // generated(fill_music_metadata.dart v0.1.1)
                        title = "Watashi no Tenshi feat. Narumi Sena" // generated(fill_music_metadata.dart v0.1.1)
                        Music(0.45)
                        OsuSong(personal = 0.3, community = 0.1)
                        Visual(VisualKind.SemiAnimatedMV, 0.5, 0.5)
                    }
                }

                Entry {
                    id = "M-VGMDB-AL-120871"
                    title = "Docchi no kiss ka, Erabe yo. / LIP×LIP [COMPLETE BOX]" // generated(fill_music_metadata.dart v0.1.1)

                    Visual(VisualKind.AlbumArt, 0.15, 0.5)

                    SubIDEntry("5") {
                        MusicConsumedProgress("4:03") // generated(fill_music_metadata.dart v0.1.1)
                        title = "ノンファンタジー" // generated(fill_music_metadata.dart v0.1.1)
                        Music(0.3)
                        OsuSong(personal = 0.4, community = 0.0)
                        Visual(VisualKind.SemiAnimatedMV, 0.5, 0.5)
                    }

                    SubIDEntry("10") {
                        MusicConsumedProgress("4:03") // generated(fill_music_metadata.dart v0.1.1)
                        title = "小さなライオン feat.南(ふてニャン/CV:豊永利行)" // generated(fill_music_metadata.dart v0.1.1)
                        Music(0.4)
                        OsuSong(personal = 0.4, community = 0.0)
                        Visual(VisualKind.SemiAnimatedMV, 0.5, 0.5)
                    }
                }
            }
        }

        Entry {
            id = "A-MAL-31245"
            title = "Zutto Mae kara Suki deshita.: Kokuhaku Jikkou Iinkai" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 31245 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 11204 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21296 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 31245 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Miou Aida"
            Visual(VisualKind.Animated, 0.4, 0.7)
            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 1, 1.hours + 3.minutes)
            NEI(0.5, Emotion.AP)
            NEI(0.2, Emotion.MP)
        }

        Entry {
            id = "A-MAL-33036"
            title = "Suki ni Naru Sono Shunkan wo.: Kokuhaku Jikkou Iinkai" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 33036 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 12001 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 21757 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 33036 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Miou Aida"
            Visual(VisualKind.Animated, 0.4, 0.7)
            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 1, 1.hours + 3.minutes)
            NEI(0.2, Emotion.AP)
            AEI(0.1, Emotion.MP to 0.3, Emotion.CU to 0.7)
            FeatureMusic("M-VGMDB-AL-61577-1")
            FeatureMusic("M-20221225T015456")
        }

        Entry {
            id = "A-MAL-36220"
            title = "Itsudatte Bokura no Koi wa 10 cm Datta." // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 36220 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 13788 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 98977 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 36220 // generated(fill_anime_metadata.dart v0.1.1)

            bestGirl = "Miou Aida"
            Visual(VisualKind.Animated, 0.4, 0.7)
            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 6)
            NEI(0.2, Emotion.AP)
            // classic atm farm idk
            AEI(0.3, Emotion.MP to 0.3, Emotion.CU to 0.7)
            FeatureMusic("M-VGMDB-AL-120871-5")
        }

        Entry {
            id = "A-MAL-49692"
            title = "Heroine Tarumono! Kiraware Heroine to Naisho no Oshigoto" // generated(fill_anime_metadata.dart v0.1.1)
            idAniDB = 49692 // generated(fill_anime_metadata.dart v0.1.1)
            idKitsu = 45031 // generated(fill_anime_metadata.dart v0.1.1)
            idAniList = 138459 // generated(fill_anime_metadata.dart v0.1.1)
            idMAL = 49692 // generated(fill_anime_metadata.dart v0.1.1)

            // who is best girl gyze?

            // is it the "no way himeno sena osu skin" girl?
            // context: https://www.youtube.com/watch?v=BqHqZN9hoNo
            bestGirl = "Setoguchi Hina"

            // is it the "no way (not himeno) sena from koikakerushinaikanojo" girl?
            bestGirl = "Narumi Sena"

            // jk main girl it is then
            // (she run and what a coincidence the nozsp is supposed to run too!)
            bestGirl = "Hiyori Suzumi"

            // speedrun this in one night lol
            AnimeConsumedProgress(EntryStatus.Completed, 1.0, 12)
            Visual(VisualKind.Animated, 0.4, 0.6)

            // main girl's friend betraying her was somewhat unexpected ig
            NEI(0.1, Emotion.AP)

            // funnychamp
            NEI(0.8, Emotion.AP)

            // no way post-modern (not rst-inspired) cp-based anime!1!
            NEI(0.5, Emotion.CP)
        }
    }
}
