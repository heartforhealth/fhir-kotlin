package io.h4h.fhir.r4.serializers

import io.h4h.fhir.r4.extensions.toLocalDate
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder


/**
 * Custom serializer for LocalDate that fallbacks to Long for deserialization
 * */
@Serializer(forClass = LocalDate::class)
object LocalDateSerializer : KSerializer<LocalDate> {

    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("LocalDateStringLong", PrimitiveKind.STRING)


    override fun serialize(encoder: Encoder, value: LocalDate) {
        encoder.encodeString(value.toString())
    }


    override fun deserialize(decoder: Decoder): LocalDate {
        val value = decoder.decodeString()

        return try {
            // first try to decode String -> LocalDate
            LocalDate.parse(value)
        } catch (stringException: Exception) {
            try {
                // fallback to String -> Instant -> LocalDate
                Instant.parse(value).toLocalDate()
            } catch (instantException: Exception) {
                // throw further
                throw SerializationException(instantException)
            }
        }
    }


}

