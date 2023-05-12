package io.h4h.fhir

import io.h4h.fhir.mocks.ObservationDefinitionMocks
import io.h4h.fhir.r5.resources.ObservationDefinition
import io.h4h.fhir.utils.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlin.test.Test
import kotlin.test.fail

class ObservationDefinitionTest : SerializerTest() {

    @Test
    fun deserializeSerializeObservation1() =
        kotlinxDeserializeSerializeResource<ObservationDefinition>("observationDefinition1.json")


    @Test fun testMongoSerialization() {
        // existing Observation
        val resource = loadResource("observationDefinition1.json")
            ?: fail("expected resource 'observationDefinition1.json' in resources folder")
        val observationDefinition = json.decodeFromString<ObservationDefinition>(resource)

        // serialize toBson
        val bson = observationDefinition.toBsonDocument(ObservationDefinition.serializer())

        // deserialize back to Observation
        val observationDefinition1 = bson.preDeserialize().asDomainResource(ObservationDefinition.serializer())
        println("ObservationDefinition: $observationDefinition1")
    }


    @Test fun testMongoSerialization2() {
        // random
        val observationDefinition = ObservationDefinitionMocks.bloodPressure
        println("ObservationDefinition: ${json.encodeToString(observationDefinition)}")

        // toBson
        val bson = observationDefinition.toBsonDocument(ObservationDefinition.serializer())
        println("ObservationDefinition BSON: $bson")
    }


}


