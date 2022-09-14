package com.dah.nrs.exts

import com.dah.nrs.dsl.DSLEntry
import com.dah.nrs.dsl.DSLMetaImpl
import com.dah.nrs.dsl.intMeta
import kotlin.time.Duration
import kotlin.time.Duration.Companion.days
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

var DSLEntry.progress by intMeta("DAH_entry_progress")

enum class EntryStatus(val oldBoredomLevelName: String) {
    Completed("Completed"),
    Watching("Watching"),
    Dropped("Dropped"),
    OnHold("Temporarily On-Hold"),
    Unwatched("Unwatched")
}

fun DSLEntry.Progress(status: EntryStatus, length: Duration, block: DSLMetaImpl.() -> Unit = {}) {
    meta("DAH_entry_progress", DSLMetaImpl().apply {
        meta("status", status.oldBoredomLevelName)
        meta("length_seconds", length.inWholeSeconds)
        block()
    })
}

fun DSLEntry.AnimeProgress(status: EntryStatus, episodes: Int, episodeDuration: Duration = AverageAnimeEpisode) {
    Progress(status, episodeDuration * episodes) {
        meta("episode", episodes)
    }
}

fun DSLEntry.MusicConsumedProgress(lengthString: String) {
    val tokens = lengthString.split(':').map { it.toIntOrNull() }
    if(null in tokens) {
        error("unsupported lengthString")
    }

    val nums = tokens.mapNotNull { it }.reversed()
    var length = Duration.ZERO
    if(nums.size > 4) {
        error("unsupported lengthString")
    }

    if(nums.isNotEmpty()) {
        length += nums[0].seconds
    }
    if(nums.size >= 2) {
        length += nums[1].minutes
    }
    if(nums.size >= 3) {
        length += nums[2].hours
    }
    if(nums.size >= 4) {
        length += nums[3].days
    }

    ConsumedProgress(EntryStatus.Completed, 1.0, length)
}

fun DSLEntry.ConsumedProgress(status: EntryStatus, boredom: Double, length: Duration) {
    Consumed(boredom, length)
    Progress(status, length)
}

fun DSLEntry.AnimeConsumedProgress(status: EntryStatus, boredom: Double, episodes: Int, episodeDuration: Duration = AverageAnimeEpisode) {
    AnimeConsumed(boredom, episodes, episodeDuration)
    AnimeProgress(status, episodes, episodeDuration)
}
