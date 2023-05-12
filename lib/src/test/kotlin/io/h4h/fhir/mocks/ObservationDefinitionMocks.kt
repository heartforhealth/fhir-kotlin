package io.h4h.fhir.mocks

import io.h4h.fhir.r4.base.ObservationDataType
import io.h4h.fhir.r5.resources.ObservationDefinition
import io.h4h.fhir.r5.resources.ObservationDefinitionComponent
import io.h4h.terminology.Concepts
import io.h4h.terminology.Observations
import io.h4h.terminology.Units
import java.util.UUID


object ObservationDefinitionMocks {


    /// Blood Pressure ObservationDefinition with 3 components
    val bloodPressure: ObservationDefinition
        get() {

            val systolicComponent = ObservationDefinitionComponent(
                code = Observations.BloodPressureSystolic.codeableConcept,
                permittedDataType = listOf(ObservationDataType.QUANTITY),
                permittedUnit = listOf(Units.mmHg.coding)
            )

            val diastolicComponent = ObservationDefinitionComponent(
                code = Observations.BloodPressureDiastolic.codeableConcept,
                permittedDataType = listOf(ObservationDataType.QUANTITY),
                permittedUnit = listOf(Units.mmHg.coding)
            )

            val heartRateComponent = ObservationDefinitionComponent(
                code = Observations.HeartRate.codeableConcept,
                permittedDataType = listOf(ObservationDataType.QUANTITY),
                permittedUnit = listOf(Units.Bpm.coding)
            )

            return ObservationDefinition(
                id = UUID.randomUUID().toString(),
                name = Observations.BloodPressurePanel.name,
                title = Observations.BloodPressurePanel.display,
                publisher = "Heart for Health ICT B.V.",
                category = listOf(Concepts.VitalSignsCategory.codeableConcept),
                code = Observations.BloodPressurePanel.codeableConcept,
                // measure with BPM
                method = Concepts.BloodPressureMonitor.codeableConcept,

                // child components
                component = listOf(systolicComponent, diastolicComponent, heartRateComponent)
            )
        }


}