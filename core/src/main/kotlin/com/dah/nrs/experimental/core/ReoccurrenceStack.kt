package com.dah.nrs.experimental.core

class ReoccurrenceStack<T: Any>(val maxOccurrences: Int = 8) {
    val data = hashMapOf<T, Int>()
    var latest: T? = null

    fun push(obj: T): Boolean {
        return ((data[obj] ?: 0) + 1).let { occurrences ->
            data[obj] = occurrences
            latest = obj
            occurrences < maxOccurrences
        }
    }

    fun pop() {
        val localLatest = latest ?: error()
        val occurrences = data[localLatest] ?: 0
        if(occurrences <= 0) {
            error()
        }

        if(occurrences == 1) {
            data.remove(localLatest)
        } else {
            data[localLatest] = occurrences - 1
        }
    }

    private fun error(): Nothing {
        throw RuntimeException("push/pop not match")
    }

}