package com.dah.nrs

fun GenerateBlock.YuYuYu() {
    // kirare - happy typhoon and u's - a song for yuyuyu reference
    // somewhat changed da world

    val HeroClub = arrayOf(TeruiHaruka, MimoriSuzuko, UchiyamaYumi, KurosawaTomoyo, NagatsumaJuri)
    val HeroClubWithSonoko = arrayOf(*HeroClub, HanazawaKana)
    AlbumTrack(VGMDB_Album(47678), 1, "Aurora Days", *HeroClub) {
        Music(0.2)
    }

    // We May Never Meet Again, But I Will Never Forget Your Voice
    AlbumTrack(VGMDB_Album(69821), 1, "Egao no Kimi e", MimoriSuzuko) {
        Music(1.0)
    }

    Album(VGMDB_Album(114186), "Ashita no Hanatachi")
    // the glorious udon stream map
    // sonoko nogizaka46 yubi bouenkyou anime ban fate fiery extreme armin adventure sotarks new adventure
    Track(VGMDB_Track(114186, 2), "U・D・N", *HeroClubWithSonoko) {
        Music(0.8)
    }

    val YuYuYuMeme = Meme(0.8, Meme.M2_3Weeks)
    // koori chikage remained as a meme even after the death
    // of the yuyuyu franchise (blame rst for that)
    // just too based bro, rst and sb69 can't kill her
    // (but vertexes can sadge)
    val KooriChikageMeme = Meme(0.2, Meme.M1_2Months)
    val KilledByRst = KilledBy(VGMDB_Franchise(7059))

    Anime("Yuuki Yuuna wa Yuusha de Aru", MAL = 25519) {
        bestGirl = "Yuuki Yuuna"
        // The Itsuki thing made me cry I guess, but there's no PADS.
        // YouTube clip: https://www.youtube.com/watch?v=0bjxQMWXsRE
        Cry(Emotion.CU)

        // The main group is comfy af, and
        // they actually used it to make some sad things.
        // Well I cried at the other Itsuki thing
        // no clip this time
        Cry(Emotion.MP)

        Impact(YuYuYuMeme)
        Relation(KilledByRst)

        FeatureMusic(VGMDB_Track(47678, 1))

        // Second anime (after Sora no Method) to (be able to)
        // use OP/ED visual + music to strengthen the sadness.
        // (only the ending tho)
        Impact("OP/ED visual chemistry", Emotion.CU, 0.5)

        Boredom(Boredom.Completed)
    }

    // first LN entry of NRS
    LN("Nogi Wakaba wa Yuusha de Aru", MAL = 90810) {
        // Update Nov 6, 2021:
        // This LN reading progress will be paused to prioritize the anime.
        // Issue #10 will try to make both S3 and NoWaYu LN get all of the
        // scores they deserve.

        // Update Nov 12, 2021:
        // ln killed the franchise kek

        // Update Jan 17, 2022:
        // we are living in the shithole known as
        // the rst-sb69 duopoly era
        // well, at least chikage koori is still a meme

        // based best girl
        bestGirl = "Koori Chikage"

        Impact(YuYuYuMeme)
        Impact(KooriChikageMeme)

        // There are a lot of sad things in this LN
        // Firstly,
        // Shiratori Utano
        // She is used as a distraction, which is pretty cruel
        // (but that's for the greater good).
        // In the final moments, she said:
        // "I am scared. I really, truly am." (YLIA flashbacks)
        // Secondly,
        // Doi Tamako and Iyojima [Anzu]
        // They died before the group could go to a flower-viewing
        // party (idk how to describe this)
        // Thirdly,
        // Koori Chikage
        // man
        // read the shit and see it for yourself
        // man

        // Overall, this LN spams sad shit everywhere,
        // <strikethrough>(inb4 yuuna got fucked and i cried)</strikethrough>
        // that didn't happen pog
        AEI(3.0, Emotion.CU)

        Boredom(Boredom.Watching)
    }

    Anime("Yuuki Yuuna wa Yuusha de Aru: Washio Sumi no Shou", MAL = 34284) {
        // this was not taken very seriously

        // she looked like best girl ngl
        bestGirl = "Tougou Mimori" // or Sumi Washio

        FeatureMusic(VGMDB_Track(69821, 1))
        // gin's death and sonoko spamming magia are sad
        // but my pepega ass doesn't watch this shit properly
        // ffs
        NEI(1.0, Emotion.CU)

        Impact(YuYuYuMeme)

        Boredom(Boredom.Completed)
    }

    Anime("Yuuki Yuuna wa Yuusha de Aru: Yuusha no Shou", MAL = 34445) {
        // "The Michi Random of Yuuki Yuuna"
        bestGirl = "Yuuki Yuuna"

        // that conversation is peak drama
        // it captures my heart and does make
        // sense (unlike other shits)
        // The fact that Yuuki Yuuna uses the
        // tenets to argue even makes the shit
        // sadder
        // literally the vertex of drama wtf
        //                  ^
        //                  yuyuyu reference !!!11!!1
        AEI(3.0, Emotion.CU)

        Impact(YuYuYuMeme)

        Boredom(Boredom.Completed)
    }

    Anime("Yuuki Yuuna wa Yuusha de Aru: Dai Mankai no Shou", MAL = 42587) {
        seasonal = true
        bestGirl = "Yuuki Yuuna"

        // I expected this to make a new Ayumu-era (something like
        // Yuuna-era or some dumb shit like that), but it doesn't
        // give a fuck by adapting KuMeYu and NoWaYu in the first
        // 5 (for now) episodes.

        // "But when it wants to fuck up, it can't"
        // The KuMeYu episodes were meh, but in the first NoWaYu ep,
        // it's already made an emotional impact

        // E5-20:17
        // YLIA flashbacks
        NEI(1.5, Emotion.CU)
        Impact(YuYuYuMeme)
        Impact(KooriChikageMeme)

        FeatureMusic(VGMDB_Track(114186, 2))

        Boredom(Boredom.Completed)
    }

    Franchise(VGMDB_Franchise(3245), "Yuusha de Aru") {
        Include(VGMDB_Track(47678, 1))
        Include(VGMDB_Track(69821, 1))
        Include(VGMDB_Track(114186, 2))

        Include(MAL(25519))
        Include("L-MAL-90810")
        Include(MAL(34284))
        Include(MAL(34445))
        Include(MAL(42587))
    }
}
