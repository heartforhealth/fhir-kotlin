package io.h4h.fhir

import ca.uhn.fhir.context.FhirContext
import ca.uhn.fhir.parser.IParser
import ca.uhn.fhir.parser.StrictErrorHandler
import com.fasterxml.jackson.databind.ObjectMapper
import io.h4h.fhir.FhirV4Parser.parser
import kotlinx.serialization.decodeFromString
import org.hl7.fhir.r4.model.Observation
import kotlin.system.measureTimeMillis
import kotlin.test.Test
import kotlin.test.fail
import kotlinx.serialization.encodeToString
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import kotlin.test.BeforeTest


// =====================================================================
// FhirV4Parser
// =====================================================================

object FhirV4Parser {
    private val ctx = FhirContext.forR4()
        .apply {
            setParserErrorHandler(StrictErrorHandler())
            println("[INFO] Configured StrictErrorHandler for FhirContext R4")
        }
    val parser: IParser = ctx.newJsonParser()
        .apply {
            setParserErrorHandler(StrictErrorHandler())
            println("[INFO] Configured StrictErrorHandler for JsonParser R4")
        }
}


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PerformanceTest: SerializerTest() {

    @BeforeAll
    private fun initialize() {
        println("[INFO] Initialized HAPI parser: ${parser.toString()}")
    }


    @Test fun hapiTest100() = hapiTest("observations-1.json", 100)
    @Test fun kotlinxTest100() = kotlinxTest("observations-1.json", 100)

    @Test fun hapiTest1000() = hapiTest("observations-1.json", 1000)
    @Test fun kotlinxTest1000() = kotlinxTest("observations-1.json", 1000)

    @Test fun hapiTest10000() = hapiTest("observations-1.json", 10000)
    @Test fun kotlinxTest10000() = kotlinxTest("observations-1.json", 10000)

    @Test fun hapiTest100000() = hapiTest("observations-1.json", 100_000)
    @Test fun kotlinxTest100000() = kotlinxTest("observations-1.json", 100_000)



    // =====================================================================
    // HAPI
    // =====================================================================

    private fun hapiTest(file: String, number: Int) {
        // split JsonArray into nodes
        val resources = loadObservations(file, number)
        /// Deserialization
        val observations = hapiDeserializationTest(resources)
        /// Serialization
        hapiSerializationTest(observations)
    }

    /// Deserialization
    private fun hapiDeserializationTest(resources: List<String>): List<Observation> {
        var observations: List<Observation> = listOf()
        measure {
            println("[HAPI] Starting deserialization test")
            observations = resources.map { parser.parseResource(Observation::class.java, it) }
            println("[HAPI] Deserialized ${observations.size} Observations")
        }
        return observations
    }


    /// Serialization
    private fun hapiSerializationTest(observations: List<Observation>): List<String> {
        var resources: List<String> = listOf()
        measure {
            println("[HAPI] Starting serialization test")
            resources = observations.map { parser.encodeResourceToString(it) }
            println("[HAPI] Serialized ${observations.size} Observations")
        }
        return resources
    }


    // =====================================================================
    // Kotlinx
    // =====================================================================

    private fun kotlinxTest(file: String, number: Int) {
        // split JsonArray into nodes
        val resources = loadObservations(file, number)
        /// Deserialization
        val observations = kotlinxDeserializationTest(resources)
        /// Serialization
        kotlinxSerializationTest(observations)
    }

    /// Deserialization
    private fun kotlinxDeserializationTest(resources: List<String>): List<io.h4h.fhir.r4.resources.Observation> {
        var observations: List<io.h4h.fhir.r4.resources.Observation> = listOf()
        measure {
            println("[Kotlinx] Starting deserialization test")
            observations = resources.map { json.decodeFromString(it) }
            println("[Kotlinx] Deserialized ${observations.size} Observations")
        }
        return observations
    }


    /// Serialization
    private fun kotlinxSerializationTest(observations: List<io.h4h.fhir.r4.resources.Observation>): List<String> {
        var resources: List<String> = listOf()
        measure {
            println("[Kotlinx] Starting serialization test")
            resources = observations.map { this.json.encodeToString(it) }
            println("[Kotlinx] Serialized ${observations.size} Observations")
        }
        return resources
    }



    // =====================================================================
    // helpers
    // =====================================================================

    /// prepares a number of serialized Observations for testing
    private fun loadObservations(file: String, number: Int): List<String> {
        val fileContents = loadResource(file) ?: fail("File '$file' could not be found in Resources")

        // split JsonArray into nodes
        return ObjectMapper()
            .readTree(fileContents)
            .map { node -> node.toString() }
            .take(number)
    }

    private fun measure(block: () -> Unit) {
        val time = measureTimeMillis {
            block()
        }
        println("[INFO] Completed block in $time ms")
        println("-----------------------------------")
    }


}


