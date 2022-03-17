package com.dah.nrs.experimental.core

import kotlin.reflect.KProperty

class NRSContext {
    val extensions = hashSetOf<String>()

    var DAH_id by extension("DAH_id")
    var DAH_factors by extension("DAH_factors")
    var DAH_descriptions by extension("DAH_descriptions")
    var DAH_codegen by extension("DAH_codegen")
    var DAH_json by extension("DAH_json")

    fun process(data: NRSData) = Processor(this, data).process()
}

class ExtensionProperty(val name: String) {
    operator fun getValue(nrsContext: NRSContext, property: KProperty<*>): Boolean {
        return name in nrsContext.extensions
    }

    operator fun setValue(nrsContext: NRSContext, property: KProperty<*>, value: Boolean) {
        if(value) {
            nrsContext.extensions.add(name)
        } else {
            nrsContext.extensions.remove(name)
        }
    }
}

private fun extension(name: String) = ExtensionProperty(name)