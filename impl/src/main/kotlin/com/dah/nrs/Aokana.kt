package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*
import kotlin.time.Duration.Companion.hours

// imagine almost losing a contentless franchise xddddddddddddd
fun DSLScope.Aokana() {
    Entry {
        id = "F-VGMDB-4043"
        title = "Ao no Kanata no Four Rhythm"

        Entry {
            id = "V-VNDB-12849"
            title = "Ao no Kanata no Four Rhythm"

            // i still use her skin in osugame lmfao
            // (because all of the best girls post-aokana
            // lives in unpopular franchises like rst and sb69)
            bestGirl = "Asuka Kurashina" // generated(generate_best_girls.dart v0.1.0)
            // bestGirl = "Satouin Reiko" // the sango/rosia of aokana

            // the asuka route is completed
            ConsumedProgress(EntryStatus.Completed, 0.9, 10.hours)

            // Aokana made me love Asuka for like 2 weeks
            // which is good
            // also there was a PADS
            PADS(1, Emotion.MP)
            Waifu("Kurashina Asuka", "2021-06-02" to "2021-06-16")

            FeatureMusic("M-VGMDB-AL-52834")

            Visual(VisualKind.VisualNovel, 0.8, 0.1)

            // idk what is this ngl
            Meme(0.8, 25)
            KilledBy("V-VNDB-27448", 0.1, 0.1)
        }

        Entry {
            id = "M-VGMDB-AL-52834"
            title = "Ao no Kanata no Four Rhythm Vocal & Sound Collection" // generated(fill_music_metadata.dart v0.1.1)
            // too lazy to rate every single track
            Music(0.8)
            Visual(VisualKind.AlbumArt, 0.2, 0.15)
        }
        
        Entry {
            id = "M-VGMDB-AL-55828"
            title = "Contrail ~Kiseki~ / Mami Kawada" // generated(fill_music_metadata.dart v0.1.1)
            Visual(VisualKind.AlbumArt, 0.2, 0.4)
            SubIDEntry("1") {
                title = "Contrail ~Kiseki~" // generated(fill_music_metadata.dart v0.1.1)
                MusicConsumedProgress("4:39") // generated(fill_music_metadata.dart v0.1.1)
                Music(0.45)
                OsuSong(personal = 0.75, community = 0.3)
            }
        }
    }
}

