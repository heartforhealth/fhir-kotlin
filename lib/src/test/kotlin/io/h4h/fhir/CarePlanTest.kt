package io.h4h.fhir


import io.h4h.fhir.r4.resources.CarePlan
import kotlin.test.Test


class CarePlanTest : ResourceTest() {


    @Test
    fun deserializeSerializeCarePlan1() =
        deserializeSerializeResource<CarePlan>("carePlan1.json")

    @Test
    fun deserializeSerializeCarePlan2() =
        deserializeSerializeResource<CarePlan>("carePlan2.json")


}