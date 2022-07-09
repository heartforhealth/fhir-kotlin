package io.h4h.fhir.mocks

import io.h4h.fhir.r4.base.*
import io.h4h.fhir.r4.resources.Observation
import io.h4h.fhir.r4.resources.ObservationComponent
import io.h4h.fhir.utils.now
import io.h4h.fhir.utils.randomUUID
import kotlin.random.Random


object ObservationMocks {

    fun bloodPressureObservation(
        patientReference: String = randomUUID(),
    ): Observation {

        // category
        // --------------------------------
        val categoryCoding = Coding(
            code = "vital-signs",
            system = "http://terminology.hl7.org/CodeSystem/observation-category",
            display = "Vital Signs"
        )
        val categoryCodeableConcept = CodeableConcept(
            coding = mutableListOf(categoryCoding)
        )

        // code
        // --------------------------------
        val codeCoding = Coding(
            code = "85354-9",
            system = "http://loinc.org",
            display = "Blood pressure panel with all children optional"
        )
        val codeCodeableConcept = CodeableConcept(
            coding = mutableListOf(codeCoding),
            text = "Blood pressure systolic & diastolic"
        )

        // body site
        // --------------------------------
        val bodySiteCoding = Coding(
            code = "368209003",
            system = "http://snomed.info/sct",
            display = "Right arm"
        )
        val bodySiteCodeableConcept = CodeableConcept(
            coding = mutableListOf(bodySiteCoding)
        )

        // systolic
        // --------------------------------
        val systolicCoding = Coding(
            code = "8480-6",
            system = "http://loinc.org",
            display = "Systolic blood pressure"
        )
        val systolicCodeableConcept = CodeableConcept(
            coding = mutableListOf(systolicCoding)
        )

        val systolicComponent = ObservationComponent(
            code = systolicCodeableConcept,
            valueQuantity = Quantity(
                value = Random.nextDouble(100.0, 130.0),
                unit = "mmHg",
                system = "http://unitsofmeasure.org",
                code = "mm[Hg]"
            )
        )

        // diastolic
        // --------------------------------
        val diastolicCoding = Coding(
            code = "8462-4",
            system = "http://loinc.org",
            display = "Diastolic blood pressure"
        )
        val diastolicCodeableConcept = CodeableConcept(
            coding = mutableListOf(diastolicCoding)
        )

        val diastolicComponent = ObservationComponent(
            code = diastolicCodeableConcept,
            valueQuantity = Quantity(
                value = Random.nextDouble(90.0, 110.0),
                unit = "mmHg",
                system = "http://unitsofmeasure.org",
                code = "mm[Hg]"
            )
        )

        // final result
        // --------------------------------
        return Observation(
            id = randomUUID(),
            status = ObservationStatus.final,
            category = mutableListOf(categoryCodeableConcept),
            code = codeCodeableConcept,
            subject = Reference(reference = "Patient/$patientReference", identifier = Identifier(value = patientReference)),
            performer = mutableListOf(Reference(reference = "Patient/$patientReference")),
            bodySite = bodySiteCodeableConcept,
            component = mutableListOf(systolicComponent, diastolicComponent),
            device = Reference(reference = "Device/bloodPressureMonitorOmron"),

            // random date
            effectiveDateTime = now()
        )
    }

}