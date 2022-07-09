package io.h4h.fhir


import io.h4h.fhir.r4.resources.Appointment
import kotlin.test.Test


class AppointmentTest : SerializerTest() {


    @Test fun deserializeSerializeAppointment() =
        kotlinxDeserializeSerializeResource<Appointment>("appointment1.json")


}
