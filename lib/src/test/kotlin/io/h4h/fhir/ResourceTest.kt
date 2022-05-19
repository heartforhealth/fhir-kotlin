package io.h4h.fhir

import io.h4h.fhir.r4.base.Resource
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*



open class ResourceTest {

    val json = Json {
        prettyPrint = true
        explicitNulls = false
        ignoreUnknownKeys = true
        encodeDefaults = true
    }

    fun loadResource(name: String) = javaClass.classLoader
        .getResource(name)
        ?.readText()


    inline fun <reified T: Resource> deserializeSerializeResource(name: String) {
        val resource = loadResource(name)
            ?: throw Error("expected resource '$name' in resources folder")

        val data = json.decodeFromString<T>(resource)
        println(data)
        val string = json.encodeToString(data)
        println(string)
    }


}