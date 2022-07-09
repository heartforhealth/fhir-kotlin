package io.h4h.fhir

import io.h4h.fhir.mocks.ObservationMocks
import io.h4h.fhir.r4.base.*
import io.h4h.fhir.r4.resources.Observation
import io.h4h.fhir.r4.resources.ObservationComponent
import io.h4h.fhir.utils.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.fail

class ObservationTest : SerializerTest() {

    @Test
    fun deserializeSerializeObservation1() =
        kotlinxDeserializeSerializeResource<Observation>("observation1.json")


    @Test fun testMongoSerialization() {
        // existing Observation
        val resource = loadResource("observation1.json")
            ?: fail("expected resource 'observation1.json' in resources folder")
        val observation = json.decodeFromString<Observation>(resource)

        // serialize toBson
        val bson = observation.toBsonDocument()

        // deserialize back to Observation
        val observation1 = bson.preDeserialize().asDomainResource(Observation.serializer())
        println("Observation: $observation1")
    }


    @Test fun testMongoSerialization2() {
        // random
        val observation = ObservationMocks.bloodPressureObservation()
        println("Observation: ${json.encodeToString(observation)}")

        // toBson
        val bson = observation.toBsonDocument()
        println("Observation BSON: $bson")
    }


}


