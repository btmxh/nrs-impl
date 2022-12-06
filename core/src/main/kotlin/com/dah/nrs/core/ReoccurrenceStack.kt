package com.dah.nrs.core

class ReoccurrenceStack<T : Any>(private val maxOccurrences: Int = 8) {
    private val data = hashMapOf<T, Int>()

    fun push(obj: T): Boolean {
        return ((data[obj] ?: 0) + 1).let { occurrences ->
            data[obj] = occurrences
            occurrences <= maxOccurrences
        }
    }

    fun pop(obj: T) {
        val occurrences = data[obj] ?: 0
        if (occurrences <= 0) {
            error()
        }

        if (occurrences == 1) {
            data.remove(obj)
        } else {
            data[obj] = occurrences - 1
        }
    }

    private fun error(): Nothing {
        throw RuntimeException("push/pop not match")
    }

}
