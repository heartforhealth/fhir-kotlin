package io.h4h.fhir


import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*
import kotlin.test.fail


open class SerializerTest {


    fun loadResource(name: String) = javaClass.classLoader
        .getResource(name)
        ?.readText()


    // ==========================================================================
    // Kotlinx.serialization
    // ==========================================================================

    val json = Json {
        prettyPrint = true
        explicitNulls = false
        ignoreUnknownKeys = true
        encodeDefaults = true
    }


    inline fun <reified T: Any> T.kotlinxSerializationTest(): String {
        val string = json.encodeToString(this)
        println("[Kotlinx] Serialized: $string")
        return string
    }


    inline fun <reified T: Any> String.kotlinxDeserializationTest(): T {
        val data = json.decodeFromString<T>(this)
        println("[Kotlinx] Deserialized: $data")
        return data
    }


    inline fun <reified T: Any> kotlinxDeserializeSerializeResource(resource: String) {
        val json = javaClass.classLoader
            .getResource(resource)
            ?.readText()
            ?: fail("Resource '$resource' could not be found")

        // deserialize
        val deserialized = json.kotlinxDeserializationTest<T>()
        // serialize back
        deserialized.kotlinxSerializationTest()
    }


    inline fun <reified T: Any> T.kotlinxSerializeDeserializeResource(): T {
        // serialize
        val serialized = this.kotlinxSerializationTest()

        // deserialize back
        return serialized.kotlinxDeserializationTest<T>()
    }




}