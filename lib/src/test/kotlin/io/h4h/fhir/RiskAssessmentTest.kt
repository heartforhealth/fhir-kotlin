package io.h4h.fhir


import io.h4h.fhir.r4.resources.RiskAssessment
import kotlin.test.Test


class RiskAssessmentTest : SerializerTest() {


    @Test fun deserializeSerializeRiskAssessment1() =
        kotlinxDeserializeSerializeResource<RiskAssessment>("riskAssessment1.json")


}
