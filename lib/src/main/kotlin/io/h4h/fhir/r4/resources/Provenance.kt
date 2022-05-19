package io.h4h.fhir.r4.resources

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
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 */
@Serializable
data class Provenance(

    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override val id: String,
    override val resourceType: ResourceType = ResourceType.Provenance,
    override val meta: Meta? = null,
    override val implicitRules: String? = null,
    override val language: String? = null,
    override val text: Narrative? = null,
    override val contained: List<Resource>? = null,
    override val extension: List<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.
     */
    val target: List<Reference>? = null,

    /**
     * The period during which the activity occurred.
     */
    val occurredPeriod: Period? = null,
    val occurredDateTime: String? = null,

    /**
     * The instant of time at which the activity was recorded.
     */
    val recorded: String? = null,

    /**
     * Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.
     */
    val policy: List<String>? = null,

    /**
     * Where the activity occurred, if relevant.
     */
    val location: Reference? = null,

    /**
     * The reason that the activity was taking place.
     */
    // @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v3-PurposeOfUse")
    val reason: List<CodeableConcept>? = null,

    /**
     * An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/provenance-activity-type")
    val activity: CodeableConcept? = null,

    /**
     * An actor taking a role in an activity  for which it can be assigned some degree of responsibility for the activity taking place.
     */
    val agent: List<ProvenanceAgentComponent>? = null,

    /**
     * An entity used in this activity.
     */
    val entity: List<ProvenanceEntityComponent>? = null,

    /**
     * A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.
     */
    val signature: List<Signature>? = null,


) : DomainResource





@Serializable
data class ProvenanceAgentComponent(

    /**
     * The participation the agent had with respect to the activity.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/provenance-agent-type")
    val type: CodeableConcept? = null,

    /**
     * The function of the agent with respect to the activity. The security role enabling the agent with respect to the activity.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/security-role-type")
    val role: List<CodeableConcept>? = null,

    /**
     * The individual, device or organization that participated in the event.
     */
    val who: Reference? = null,

    /**
     * The individual, device, or organization for whom the change was made.
     */
    val onBehalfOf: Reference? = null

)


@Serializable
data class ProvenanceEntityComponent(

    /**
     * How the entity was used during the activity.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/provenance-entity-role")
    val role: ProvenanceEntityRole? = null,

    /**
     * Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.
     */
    val what: Reference? = null,

    /**
     * The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity.
     */
    val agent: List<ProvenanceAgentComponent>? = null

)