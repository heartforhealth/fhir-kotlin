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
 * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.
 */

@Serializable
data class Organization(

    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override val id: String,
    override val resourceType: ResourceType = ResourceType.Organization,
    override val meta: Meta? = null,
    override val implicitRules: String? = null,
    override val language: String? = null,
    override val text: Narrative? = null,
    // override val contained: List<Resource>? = null,
    override val extension: List<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================


    /**
     * Identifier for the organization that is used to identify the organization across multiple disparate systems.
     */
    val identifier: List<Identifier>? = null,

    /**
     * Whether the organization's record is still in active use.
     */
    val active: Boolean? = null,

    /**
     * The kind(s) of organization that this is.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/organization-type")
    val type: List<CodeableConcept>? = null,

    /**
     * A name associated with the organization.
     */
    val name: String? = null,

    /**
     * A list of alternate names that the organization is known as, or was known as in the past.
     */
    val alias: List<String>? = null,

    /**
     * A contact detail for the organization.
     */
    val telecom: List<ContactPoint>? = null,

    /**
     * An address for the organization.
     */
    val address: List<Address>? = null,

    /**
     * The organization of which this organization forms a part.
     */
    val partOf: Reference? = null,

    /**
     * Contact for the organization for a certain purpose.
     */
    val contact: List<OrganizationContactComponent>? = null,

    /**
     * Technical endpoints providing access to services operated for the organization.
     */
    val endpoint: List<Reference?>? = null


) : DomainResource


@Serializable
data class OrganizationContactComponent(

    /**
     * Indicates a purpose for which the contact can be reached.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/contactentity-type")
    val purpose: CodeableConcept? = null,

    /**
     * A name associated with the contact.
     */
    val name: HumanName? = null,

    /**
     * A contact detail (e.g. a telephone number or an email address) by which the party may be contacted.
     */
    val telecom: List<ContactPoint>? = null,

    /**
     * Visiting or postal addresses for the contact.
     */
    val address: Address? = null

)