package io.h4h.fhir


import io.h4h.fhir.r4.resources.Patient
import kotlin.test.Test
import kotlin.test.assertEquals

class PatientTest : SerializerTest() {

    @Test
    fun deserializeSerializePatient1() =
        kotlinxDeserializeSerializeResource<Patient>("patient1.json")

    @Test
    fun `can parse local dates`() {
        val json = """
            {
              "resourceType": "Patient",
              "id": "22a50293-4c89-4091-8729-d671bd489f57",
              "active": true,
              "name": [
                {
                  "family": "Carter",
                  "given": [
                    "Shawn"
                  ]
                }
              ],
              "gender": "male",
              "birthDate": "1965-05-01T00:00:00+01:00"
            }
        """.trimIndent()

        val deserialized = json.kotlinxDeserializationTest<Patient>()
        // println("Deserialized: $deserialized")
        assertEquals("1965-04-30", deserialized.birthDate.toString())
    }


}