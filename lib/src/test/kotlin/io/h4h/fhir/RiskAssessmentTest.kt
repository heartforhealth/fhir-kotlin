package io.h4h.fhir


import io.h4h.fhir.r4.resources.RiskAssessment
import kotlin.test.Test


class RiskAssessmentTest : ResourceTest() {


    @Test fun deserializeSerializeRiskAssessment1() =
        deserializeSerializeResource<RiskAssessment>("riskAssessment1.json")


}
