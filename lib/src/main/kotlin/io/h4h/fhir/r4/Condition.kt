package io.h4h.fhir.r4

import io.h4h.fhir.r4.base.*
import kotlinx.serialization.Serializable


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/
// Generated on Tue, May 12, 2020 07:26+1000 for FHIR v4.0.1


/**
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
 */
@Serializable
data class Condition(


    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override var id: String? = null,
    override var resourceType: ResourceType? = ResourceType.Condition,
    override var meta: Meta? = null,
    override var implicitRules: String? = null,
    override var language: String? = null,
    override var text: Narrative? = null,
    override var contained: MutableList<Resource>? = null,
    override var extension: MutableList<Extension>? = null,
    override var modifierExtension: MutableList<Extension>? = null,
    // ============================================================
    // ============================================================


    /**
     * Business identifiers assigned to this condition by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     */
    var identifier: MutableList<Identifier>? = null,

    /**
     * The clinical status of the condition.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/condition-clinical")
    var clinicalStatus: CodeableConcept? = null,

    /**
     * The verification status to support the clinical status of the condition.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/condition-ver-status")
    var verificationStatus: CodeableConcept? = null,

    /**
     * A category assigned to the condition.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/condition-category")
    var category: MutableList<CodeableConcept>? = null,

    /**
     * A subjective assessment of the severity of the condition as evaluated by the clinician.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/condition-severity")
    var severity: CodeableConcept? = null,

    /**
     * Identification of the condition, problem or diagnosis.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/condition-code")
    var code: CodeableConcept? = null,

    /**
     * The anatomical location where this condition manifests itself.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/body-site")
    var bodySite: MutableList<CodeableConcept>? = null,

    /**
     * Indicates the patient or group who the condition record is associated with.
     */
    var subject: Reference? = null,

    /**
     * The Encounter during which this Condition was created or to which the creation of this record is tightly associated.
     */
    var encounter: Reference? = null,

    /**
     * Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
     */
    var onsetDateTime: String? = null,
    var onsetAge: Quantity? = null,
    var onsetPeriod: Period? = null,
    var onsetRange: Range? = null,
    var onsetString: String? = null,


    /**
     * The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
     */
    var abatementDateTime: String? = null,
    var abatementAge: Quantity? = null,
    var abatementPeriod: Period? = null,
    var abatementRange: Range? = null,
    var abatementString: String? = null,


    /**
     * The recordedDate represents when this particular Condition record was created in the system, which is often a system-generated date.
     * A date, date-time or partial date (e.g. just year or year + month) as used in human communication. The format is YYYY, YYYY-MM, YYYY-MM-DD or YYYY-MM-DDThh:mm:ss+zz:zz, e.g. 2018, 1973-06, 1905-08-23, 2015-02-07T13:28:17-05:00 or 2017-01-01T00:00:00.000Z.
     */
    var recordedDate: String? = null,

    /**
     * Individual who recorded the record and takes responsibility for its content.
     */
    var recorder: Reference? = null,

    /**
     * Individual who is making the condition statement.
     */
    var asserter: Reference? = null,

    /**
     * Clinical stage or grade of a condition. May include formal severity assessments.
     */
    var stage: MutableList<ConditionStageComponent>? = null,

    /**
     * Supporting evidence / manifestations that are the basis of the Condition's verification status, such as evidence that confirmed or refuted the condition.
     */
    var evidence: MutableList<ConditionEvidenceComponent>? = null,

    /**
     * Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.
     */
    var note: MutableList<Annotation>? = null


) : DomainResource {



}


@Serializable
data class ConditionStageComponent(

    /**
     * A simple summary of the stage such as "Stage 3". The determination of the stage is disease-specific.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/condition-stage")
    var summary: CodeableConcept? = null,

    /**
     * Reference to a formal record of the evidence on which the staging assessment is based.
     */
    var assessment: MutableList<Reference>? = null,

    /**
     * The kind of staging, such as pathological or clinical staging.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/condition-stage-type")
    var type: CodeableConcept? = null

)


@Serializable
data class ConditionEvidenceComponent(

    /**
     * A manifestation or symptom that led to the recording of this condition.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/manifestation-or-symptom")
    var code: MutableList<CodeableConcept>? = null,

    /**
     * Links to other relevant information, including pathology reports.
     */
    var detail: MutableList<Reference>? = null

)
