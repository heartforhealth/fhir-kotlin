package io.h4h.fhir.r4.serializers


//@Serializer(forClass = BigDecimal::class)
//class BigDecimalSerializer: KSerializer<BigDecimal> {
//    override val descriptor: SerialDescriptor =
//        StringDescriptor.withName("WithCustomDefault")
//
//    override fun serialize(output: Encoder, obj: BigDecimal) {
//        output.encodeString(obj.toPlainString())
//    }
//
//    override fun deserialize(input: Decoder): BigDecimal {
//        return BigDecimal(input.decodeString())
//    }
//}