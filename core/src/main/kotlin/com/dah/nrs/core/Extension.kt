package com.dah.nrs.core

open class Extension(builder: NRSContextBuilder, id: String? = null, var enabled: Boolean = false) {
    val id = id ?: javaClass.simpleName

    val dependencies = hashSetOf<String>()
}

fun <E : Extension, R> E?.ifEnabled(block: (E) -> R): R? = this?.let(block)
