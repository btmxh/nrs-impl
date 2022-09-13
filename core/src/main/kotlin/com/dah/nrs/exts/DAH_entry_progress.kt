package com.dah.nrs.exts

import com.dah.nrs.dsl.DSLEntry
import com.dah.nrs.dsl.DSLMetaImpl
import com.dah.nrs.dsl.intMeta
import kotlin.time.Duration

var DSLEntry.progress by intMeta("DAH_entry_progress")

enum class EntryStatus(val oldBoredomLevelName: String) {
    Completed("Completed"),
    Watching("Watching"),
    Dropped("Dropped"),
    OnHold("TempOnHold"),
    Unwatched("Unwatched")
}

fun DSLEntry.Progress(status: EntryStatus, length: Duration, block: DSLMetaImpl.() -> Unit = {}) {
    meta("DAH_entry_progress", DSLMetaImpl().apply {
        meta("status", status.oldBoredomLevelName)
        meta("length_seconds", length.inWholeSeconds)
        block()
    })
}

fun DSLEntry.AnimeProgress(status: EntryStatus, episodes: Int) {
    Progress(status, AverageAnimeEpisode * episodes) {
        meta("episode", episodes)
    }
}

fun DSLEntry.ConsumedProgress(status: EntryStatus, boredom: Double, length: Duration) {
    Consumed(boredom, length)
    Progress(status, length)
}

fun DSLEntry.AnimeConsumedProgress(status: EntryStatus, boredom: Double, episodes: Int) {
    AnimeConsumed(boredom, episodes)
    AnimeProgress(status, episodes)
}
