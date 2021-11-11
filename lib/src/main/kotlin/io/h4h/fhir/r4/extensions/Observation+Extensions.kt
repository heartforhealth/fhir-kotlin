package io.h4h.fhir.r4.extensions

import io.h4h.fhir.r4.Observation
import io.h4h.fhir.r4.base.FhirException
import io.h4h.fhir.r4.base.Reference
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json



// encode to JSON
fun Observation.encode(encoder: Json): String {
    return encoder.encodeToString(this)
}


// encode to JSON
fun List<Observation>.encode(encoder: Json): String {
    return encoder.encodeToString(this)
}


// extract patient reference
val Observation.patientReference: String
    get() = this.subject?.reference
        ?: throw FhirException("FHIR Observation must contain a patient reference in {.subject.reference}")


// simplistic String representation for effective date
fun Observation.effective(): String? {
    return this.effectiveDateTime ?: this.effectiveInstant
}
