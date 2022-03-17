@file:OptIn(InternalSerializationApi::class)

package com.dah.nrs.experimental.exts

import com.dah.nrs.experimental.core.ID
import com.dah.nrs.experimental.core.IEntry
import com.dah.nrs.experimental.core.IMeta
import com.dah.nrs.experimental.core.NRSContext
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.PolymorphicKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.*
import kotlin.reflect.KClass

abstract class BetterJsonContentPolymorphicSerializer<T : Any>(private val baseClass: KClass<T>) : KSerializer<T> {
    override val descriptor: SerialDescriptor =
        buildSerialDescriptor("JsonContentPolymorphicSerializer<${baseClass.simpleName}>", PolymorphicKind.SEALED)

    abstract override fun serialize(encoder: Encoder, value: T)

    final override fun deserialize(decoder: Decoder): T {
        val input = decoder as JsonDecoder
        val tree = input.decodeJsonElement()

        @Suppress("UNCHECKED_CAST")
        val actualSerializer = selectDeserializer(tree) as KSerializer<T>
        return input.json.decodeFromJsonElement(actualSerializer, tree)
    }

    protected abstract fun selectDeserializer(element: JsonElement): DeserializationStrategy<out T>
}

@Serializable
private data class EntryMeta(
    override val id: ID,
    override val children: Map<ID, Double>,
    override val meta: JsonObject
) : IEntry, IMeta

@Serializable
private data class EntryNoMeta(
    override val id: ID,
    override val children: Map<ID, Double>
) : IEntry

// extension DAH_json, which serializes nrs data into JSON files
class EntryJsonSerializer(private val context: NRSContext) :
    BetterJsonContentPolymorphicSerializer<IEntry>(IEntry::class) {
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out IEntry> {
        return when {
            "meta" in element.jsonObject -> EntryMeta.serializer()
            else -> EntryNoMeta.serializer()
        }
    }

    override fun serialize(encoder: Encoder, value: IEntry) {
        if (value is IMeta) {
            encoder.encodeSerializableValue(
                EntryMeta.serializer(),
                EntryMeta(value.id, value.children, value.meta)
            )
        } else {
            encoder.encodeSerializableValue(
                EntryNoMeta.serializer(),
                EntryNoMeta(value.id, value.children)
            )
        }
    }
}

//@Serializable
//private data class

