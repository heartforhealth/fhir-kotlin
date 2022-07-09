package io.h4h.fhir


import io.h4h.fhir.r4.resources.CarePlan
import kotlin.test.Test


class CarePlanTest : SerializerTest() {


    @Test
    fun deserializeSerializeCarePlan1() =
        kotlinxDeserializeSerializeResource<CarePlan>("carePlan1.json")

    @Test
    fun deserializeSerializeCarePlan2() =
        kotlinxDeserializeSerializeResource<CarePlan>("carePlan2.json")


}