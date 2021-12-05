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
 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
 */
@Serializable
data class EpisodeOfCare(

    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override var id: String? = null,
    override var resourceType: ResourceType? = ResourceType.EpisodeOfCare,
    override var meta: Meta? = null,
    override var implicitRules: String? = null,
    override var language: String? = null,
    override var text: Narrative? = null,
    override var contained: List<Resource>? = null,
    override var extension: List<Extension>? = null,
    override var modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================


    /**
     * The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is tracking the Episode for funding purposes.
     */
    var identifier: List<Identifier>? = null,

    /**
     * planned | waitlist | active | onhold | finished | cancelled.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/episode-of-care-status")
    var status: EpisodeOfCareStatus? = null,

    /**
     * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).
     */
    var statusHistory: List<EpisodeOfCareStatusHistoryComponent>? = null,

    /**
     * A classification of the type of episode of care; e.g. specialist referral, disease management, type of funded care.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/episodeofcare-type")
    var type: List<CodeableConcept>? = null,

    /**
     * The list of diagnosis relevant to this episode of care.
     */
    var diagnosis: List<DiagnosisComponent>? = null,

    /**
     * The patient who is the focus of this episode of care.
     */
    var patient: Reference? = null,

    /**
     * The organization that has assumed the specific responsibilities for the specified duration.
     */
    var managingOrganization: Reference? = null,

    /**
     * The interval during which the managing organization assumes the defined responsibility.
     */
    var period: Period? = null,

    /**
     * Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.
     */
    var referralRequest: List<Reference>? = null,

    /**
     * The practitioner that is the care manager/care coordinator for this patient.
     */
    var careManager: Reference? = null,

    /**
     * The list of practitioners that may be facilitating this episode of care for specific purposes.
     */
    var team: List<Reference>? = null,

    /**
     * The set of accounts that may be used for billing for this EpisodeOfCare.
     */
    var account: List<Reference>? = null


) : DomainResource {




}


@Serializable
data class EpisodeOfCareStatusHistoryComponent(

    /**
     * planned | waitlist | active | onhold | finished | cancelled.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/episode-of-care-status")
    var status: EpisodeOfCareStatus? = null,

    /**
     * The period during this EpisodeOfCare that the specific status applied.
     */
    var period: Period? = null

)


