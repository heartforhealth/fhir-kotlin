package io.h4h.fhir


import io.h4h.fhir.r4.base.Resource
import io.h4h.fhir.r4.resources.Location
import io.h4h.fhir.r4.resources.Patient
import io.h4h.fhir.r4.resources.Practitioner
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass
import kotlin.test.fail


open class SerializerTest {


    fun loadResource(name: String) = javaClass.classLoader
        .getResource(name)
        ?.readText()


    // ==========================================================================
    // Kotlinx.serialization
    // ==========================================================================

    /// TODO: find a way to use polymorphic for 'contained' property
    private val module = SerializersModule {
        polymorphic(Resource::class) {
            subclass(Location::class)
            subclass(Patient::class)
            subclass(Practitioner::class)
        }
    }

    val json = Json {
        prettyPrint = true
        explicitNulls = false
        ignoreUnknownKeys = true
        encodeDefaults = true
        // serializersModule = module
        // classDiscriminator = "resourceType"
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