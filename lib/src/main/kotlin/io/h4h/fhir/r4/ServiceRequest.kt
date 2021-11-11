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
    override var id: String? = null,
    override var resourceType: ResourceType? = ResourceType.ServiceRequest,
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
     * Identifiers assigned to this order instance by the orderer and/or the receiver and/or order fulfiller.
     */
    var identifier: MutableList<Identifier>? = null,

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this ServiceRequest.
     */
    var instantiatesCanonical: MutableList<String>? = null,

    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this ServiceRequest.
     */
    var instantiatesUri: MutableList<String>? = null,

    /**
     * Plan/proposal/order fulfilled by this request.
     */
    var basedOn: MutableList<Reference>? = null,

    /**
     * The request takes the place of the referenced completed or terminated request(s).
     */
    var replaces: MutableList<Reference>? = null,

    /**
     * A shared identifier common to all service requests that were authorized more or less simultaneously by a single author, representing the composite or group identifier.
     */
    var requisition: Identifier? = null,

    /**
     * The status of the order.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/request-status")
    var status: ServiceRequestStatus? = null,

    /**
     * Whether the request is a proposal, plan, an original order or a reflex order.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/request-intent")
    var intent: ServiceRequestIntent? = null,

    /**
     * A code that classifies the service for searching, sorting and display purposes (e.g. "Surgical Procedure").
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/servicerequest-category")
    var category: MutableList<CodeableConcept>? = null,

    /**
     * Indicates how quickly the ServiceRequest should be addressed with respect to other requests.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/request-priority")
    var priority: ServiceRequestPriority? = null,

    /**
     * Set this to true if the record is saying that the service/procedure should NOT be performed.
     */
    var doNotPerform: Boolean? = null,

    /**
     * A code that identifies a particular service (i.e., procedure, diagnostic investigation, or panel of investigations) that have been requested.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/procedure-code")
    var code: CodeableConcept? = null,

    /**
     * Additional details and instructions about the how the services are to be delivered.   For example, and order for a urinary catheter may have an order detail for an external or indwelling catheter, or an order for a bandage may require additional instructions specifying how the bandage should be applied.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/servicerequest-orderdetail")
    var orderDetail: MutableList<CodeableConcept>? = null,

    /**
     * An amount of service being requested which can be a quantity ( for example $1,500 home modification), a ratio ( for example, 20 half day visits per month), or a range (2.0 to 1.8 Gy per fraction).
     */
    var quantityQuantity: Quantity? = null,
    var quantityRatio: Ratio? = null,
    var quantityRange: Range? = null,


    /**
     * On whom or what the service is to be performed. This is usually a human patient, but can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans).
     */
    var subject: Reference? = null,

    /**
     * An encounter that provides additional information about the healthcare context in which this request is made.
     */
    var encounter: Reference? = null,


    /**
     * The date/time at which the requested service should occur.
     */
    var occurrenceDateTime: String? = null,
    var occurrencePeriod: Period? = null,
    var occurrenceTiming: Timing? = null,


    /**
     * If a CodeableConcept is present, it indicates the pre-condition for performing the service.  For example "pain", "on flare-up", etc.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/medication-as-needed-reason")
    var asNeededBoolean: Boolean? = null,
    var asNeededCodeableConcept: CodeableConcept? = null,


    /**
     * When the request transitioned to being actionable.
     * A date, date-time or partial date (e.g. just year or year + month) as used in human communication. The format is YYYY, YYYY-MM, YYYY-MM-DD or YYYY-MM-DDThh:mm:ss+zz:zz, e.g. 2018, 1973-06, 1905-08-23, 2015-02-07T13:28:17-05:00 or 2017-01-01T00:00:00.000Z.
     */
    var authoredOn: String? = null,

    /**
     * The individual who initiated the request and has responsibility for its activation.
     */
    var requester: Reference? = null,

    /**
     * Desired type of performer for doing the requested service.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/participant-role")
    var performerType: CodeableConcept? = null,

    /**
     * The desired performer for doing the requested service.  For example, the surgeon, dermatopathologist, endoscopist, etc.
     */
    var performer: MutableList<Reference>? = null,

    /**
     * The preferred location(s) where the procedure should actually happen in coded or free text form. E.g. at home or nursing day care center.
     */
    // @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v3-ServiceDeliveryLocationRoleType")
    var locationCode: MutableList<CodeableConcept>? = null,

    /**
     * A reference to the the preferred location(s) where the procedure should actually happen. E.g. at home or nursing day care center.
     */
    var locationReference: MutableList<Reference>? = null,

    /**
     * An explanation or justification for why this service is being requested in coded or textual form.   This is often for billing purposes.  May relate to the resources referred to in `supportingInfo`.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/procedure-reason")
    var reasonCode: MutableList<CodeableConcept>? = null,

    /**
     * Indicates another resource that provides a justification for why this service is being requested.   May relate to the resources referred to in `supportingInfo`.
     */
    var reasonReference: MutableList<Reference>? = null,

    /**
     * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be needed for delivering the requested service.
     */
    var insurance: MutableList<Reference>? = null,

    /**
     * Additional clinical information about the patient or specimen that may influence the services or their interpretations.     This information includes diagnosis, clinical findings and other observations.  In laboratory ordering these are typically referred to as "ask at order entry questions (AOEs)".  This includes observations explicitly requested by the producer (filler) to provide context or supporting information needed to complete the order. For example,  reporting the amount of inspired oxygen for blood gas measurements.
     */
    var supportingInfo: MutableList<Reference>? = null,

    /**
     * One or more specimens that the laboratory procedure will use.
     */
    var specimen: MutableList<Reference>? = null,

    /**
     * Anatomic location where the procedure should be performed. This is the target site.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/body-site")
    var bodySite: MutableList<CodeableConcept>? = null,

    /**
     * Any other notes and comments made about the service request. For example, internal billing notes.
     */
    var note: MutableList<Annotation>? = null,

    /**
     * Instructions in terms that are understood by the patient or consumer.
     */
    var patientInstruction: String? = null,

    /**
     * Key events in the history of the request.
     */
    var relevantHistory: MutableList<Reference>? = null

) : DomainResource {


}