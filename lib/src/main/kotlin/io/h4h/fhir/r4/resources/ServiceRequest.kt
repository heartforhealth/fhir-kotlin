package io.h4h.fhir.r4.resources

import io.h4h.fhir.r4.base.Annotation
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
 * A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
 */
@Serializable
data class ServiceRequest(

    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override val id: String,
    override val resourceType: ResourceType = ResourceType.ServiceRequest,
    override val meta: Meta? = null,
    override val implicitRules: String? = null,
    override val language: String? = null,
    override val text: Narrative? = null,
    // override val contained: List<Resource>? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================


    /**
     * Identifiers assigned to this order instance by the orderer and/or the receiver and/or order fulfiller.
     */
    val identifier: List<Identifier>? = null,

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this ServiceRequest.
     */
    val instantiatesCanonical: List<String>? = null,

    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this ServiceRequest.
     */
    val instantiatesUri: List<String>? = null,

    /**
     * Plan/proposal/order fulfilled by this request.
     */
    val basedOn: List<Reference>? = null,

    /**
     * The request takes the place of the referenced completed or terminated request(s).
     */
    val replaces: List<Reference>? = null,

    /**
     * A shared identifier common to all service requests that were authorized more or less simultaneously by a single author, representing the composite or group identifier.
     */
    val requisition: Identifier? = null,

    /**
     * The status of the order.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/request-status")
    val status: ServiceRequestStatus? = null,

    /**
     * Whether the request is a proposal, plan, an original order or a reflex order.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/request-intent")
    val intent: ServiceRequestIntent? = null,

    /**
     * A code that classifies the service for searching, sorting and display purposes (e.g. "Surgical Procedure").
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/servicerequest-category")
    val category: List<CodeableConcept>? = null,

    /**
     * Indicates how quickly the ServiceRequest should be addressed with respect to other requests.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/request-priority")
    val priority: ServiceRequestPriority? = null,

    /**
     * Set this to true if the record is saying that the service/procedure should NOT be performed.
     */
    val doNotPerform: Boolean? = null,

    /**
     * A code that identifies a particular service (i.e., procedure, diagnostic investigation, or panel of investigations) that have been requested.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/procedure-code")
    val code: CodeableConcept? = null,

    /**
     * Additional details and instructions about the how the services are to be delivered.   For example, and order for a urinary catheter may have an order detail for an external or indwelling catheter, or an order for a bandage may require additional instructions specifying how the bandage should be applied.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/servicerequest-orderdetail")
    val orderDetail: List<CodeableConcept>? = null,

    /**
     * An amount of service being requested which can be a quantity ( for example $1,500 home modification), a ratio ( for example, 20 half day visits per month), or a range (2.0 to 1.8 Gy per fraction).
     */
    val quantityQuantity: Quantity? = null,
    val quantityRatio: Ratio? = null,
    val quantityRange: Range? = null,


    /**
     * On whom or what the service is to be performed. This is usually a human patient, but can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans).
     */
    val subject: Reference? = null,

    /**
     * An encounter that provides additional information about the healthcare context in which this request is made.
     */
    val encounter: Reference? = null,


    /**
     * The date/time at which the requested service should occur.
     */
    val occurrenceDateTime: String? = null,
    val occurrencePeriod: Period? = null,
    val occurrenceTiming: Timing? = null,


    /**
     * If a CodeableConcept is present, it indicates the pre-condition for performing the service.  For example "pain", "on flare-up", etc.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/medication-as-needed-reason")
    val asNeededBoolean: Boolean? = null,
    val asNeededCodeableConcept: CodeableConcept? = null,


    /**
     * When the request transitioned to being actionable.
     * A date, date-time or partial date (e.g. just year or year + month) as used in human communication. The format is YYYY, YYYY-MM, YYYY-MM-DD or YYYY-MM-DDThh:mm:ss+zz:zz, e.g. 2018, 1973-06, 1905-08-23, 2015-02-07T13:28:17-05:00 or 2017-01-01T00:00:00.000Z.
     */
    val authoredOn: String? = null,

    /**
     * The individual who initiated the request and has responsibility for its activation.
     */
    val requester: Reference? = null,

    /**
     * Desired type of performer for doing the requested service.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/participant-role")
    val performerType: CodeableConcept? = null,

    /**
     * The desired performer for doing the requested service.  For example, the surgeon, dermatopathologist, endoscopist, etc.
     */
    val performer: List<Reference>? = null,

    /**
     * The preferred location(s) where the procedure should actually happen in coded or free text form. E.g. at home or nursing day care center.
     */
    // @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v3-ServiceDeliveryLocationRoleType")
    val locationCode: List<CodeableConcept>? = null,

    /**
     * A reference to the the preferred location(s) where the procedure should actually happen. E.g. at home or nursing day care center.
     */
    val locationReference: List<Reference>? = null,

    /**
     * An explanation or justification for why this service is being requested in coded or textual form.   This is often for billing purposes.  May relate to the resources referred to in `supportingInfo`.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/procedure-reason")
    val reasonCode: List<CodeableConcept>? = null,

    /**
     * Indicates another resource that provides a justification for why this service is being requested.   May relate to the resources referred to in `supportingInfo`.
     */
    val reasonReference: List<Reference>? = null,

    /**
     * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be needed for delivering the requested service.
     */
    val insurance: List<Reference>? = null,

    /**
     * Additional clinical information about the patient or specimen that may influence the services or their interpretations.     This information includes diagnosis, clinical findings and other observations.  In laboratory ordering these are typically referred to as "ask at order entry questions (AOEs)".  This includes observations explicitly requested by the producer (filler) to provide context or supporting information needed to complete the order. For example,  reporting the amount of inspired oxygen for blood gas measurements.
     */
    val supportingInfo: List<Reference>? = null,

    /**
     * One or more specimens that the laboratory procedure will use.
     */
    val specimen: List<Reference>? = null,

    /**
     * Anatomic location where the procedure should be performed. This is the target site.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/body-site")
    val bodySite: List<CodeableConcept>? = null,

    /**
     * Any other notes and comments made about the service request. For example, internal billing notes.
     */
    val note: List<Annotation>? = null,

    /**
     * Instructions in terms that are understood by the patient or consumer.
     */
    val patientInstruction: String? = null,

    /**
     * Key events in the history of the request.
     */
    val relevantHistory: List<Reference>? = null

) : DomainResource


