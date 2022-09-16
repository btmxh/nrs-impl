package com.dah.nrs

import com.dah.nrs.dsl.*
import com.dah.nrs.exts.*

fun DSLScope.WorldWitches() {
    Entry {
        id = "F-VGMDB-4639"
        title = "World Witches Series"

        Entry {
            id = "A-MAL-3667"

            bestGirl = "Eila Ilmatar Juutilainen"
            // "The fifteen-year-old top ace of the Suomus Air Force 24th Unit ..."
            // haha 15 funny amirite

            AnimeProgressOld(Boredom.Completed, 12)
            KilledBy("F-VGMDB-694", 0.25, 0.5)
            Visual(VisualKind.Animated, 0.2, 0.75)
        }

        Entry {
            id = "A-MAL-38006"

            // mc is cute
            // ngl this is a treat for our eyes
            Visual(VisualKind.Animated, 0.8, 0.05)
//        bestGirl = "Robertson Virginia"
            bestGirl = "Shibuya Inori"
            // inori is cuter fuck u

            // the ultimate L moment
            // when the happy-go-lucky idol moe girl anime has better
            // atmospheric farming than the supposed-to-be-realistic-
            // and-stuff one (meme post)
            // lolololololol
            NEI(8.0, Emotion.CU to 0.75, Emotion.CP to 0.25)

            AnimeProgressOld(Boredom.Watching, 11)
            KilledBy("F-VGMDB-4499", potential = 0.75, effect = 0.1)
            KilledBy("M-VGMDB-AL-76155-2", potential = 0.75, effect = 0.75)
            FeatureMusic("M-VGMDB-AL-120491")
            FeatureMusic("M-VGMDB-AL-120492")
        }

        Entry {
            id = "M-VGMDB-AL-116433"
            Visual(VisualKind.AlbumArt, 0.6, 0.2)

            SubIDEntry("1") {
                // the "azure reunion" of asuiro clear sky
                Music(7.0)
            }

            SubIDEntry("2") {
                Music(3.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-120491"
            Visual(VisualKind.AlbumArt, 0.75, 0.15)

            SubIDEntry("1") {

                Music(4.0)
            }
        }

        Entry {
            id = "M-VGMDB-AL-120492"
            Visual(VisualKind.AlbumArt, 0.7, 0.15)

            SubIDEntry("1") {

                Music(4.0)
            }
        }
    }
}
