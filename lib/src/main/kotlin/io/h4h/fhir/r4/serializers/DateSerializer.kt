package io.h4h.fhir.r4.serializers


import io.h4h.fhir.r4.extensions.parseDateThrowing
import io.h4h.fhir.r4.extensions.toIsoString
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.util.Date


@Serializer(forClass = Date::class)
object DateSerializerISOString : KSerializer<Date> {

    /// we are serializing the Date as String
    override val descriptor = PrimitiveSerialDescriptor("Date", PrimitiveKind.STRING)

    /// encode using UTC ISO 8601 format
    override fun serialize(encoder: Encoder, value: Date) {
        encoder.encodeString(value.toIsoString())
    }

    /// decode using UTC ISO 8601 format
    override fun deserialize(decoder: Decoder): Date {
        return decoder.decodeString().parseDateThrowing()
    }

}


object DateSerializerLong : KSerializer<Date> {
    override val descriptor = PrimitiveSerialDescriptor("Date", PrimitiveKind.LONG)
    override fun serialize(encoder: Encoder, value: Date) = encoder.encodeLong(value.time)
    override fun deserialize(decoder: Decoder): Date = Date(decoder.decodeLong())
}
