package io.h4h.fhir


import io.h4h.fhir.r4.resources.Appointment
import kotlin.test.Test


class AppointmentTest : ResourceTest() {


    @Test fun deserializeSerializeQuestionnaire() =
        deserializeSerializeResource<Appointment>("appointment1.json")


}
