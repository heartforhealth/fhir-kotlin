package io.h4h.fhir.r4.resources

import io.h4h.fhir.r4.base.*
import io.h4h.fhir.r4.codesystems.AdministrativeGender
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
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 * "http://hl7.org/fhir/StructureDefinition/Practitioner"
 */
@Serializable
data class Practitioner(


    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override val id: String,
    override val resourceType: String = ResourceType.Practitioner.name,
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
     * An identifier that applies to this person in this role.
     */
    val identifier: List<Identifier>? = null,

    /**
     * Whether this practitioner's record is in active use.
     */
    val active: Boolean? = null,

    /**
     * The name(s) associated with the practitioner.
     */
    val name: List<HumanName>? = null,

    /**
     * A contact detail for the practitioner, e.g. a telephone number or an email address.
     */
    val telecom: List<ContactPoint>? = null,

    /**
     * Address(es) of the practitioner that are not role specific (typically home address).
     * Work addresses are not typically entered in this property as they are usually role dependent.
     */
    val address: List<Address>? = null,

    /**
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     */
    val gender: AdministrativeGender? = null,

    /**
     * The date of birth for the practitioner.
     */
    val birthDate: String? = null,

    /**
     * Image of the person.
     */
    val photo: List<Attachment>? = null,

    /**
     * The official certifications, training, and licenses that authorize or otherwise pertain to the provision of care by the practitioner.  For example, a medical license issued by a medical board authorizing the practitioner to practice medicine within a certian locality.
     */
    val qualification: List<PractitionerQualificationComponent>? = null,

    /**
     * A language the practitioner can use in patient communication.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/languages")
     */
    val communication: List<CodeableConcept>? = null


) : DomainResource



@Serializable
data class PractitionerQualificationComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * An identifier that applies to this person's qualification in this role.
     */
    val identifier: List<Identifier>? = null,

    /**
     * Coded representation of the qualification.
     * @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v2-2.7-0360")
     */
    val code: CodeableConcept? = null,

    /**
     * Period during which the qualification is valid.
     */
    val period: Period? = null,

    /**
     * Organization that regulates and issues the qualification.
     */
    val issuer: Reference? = null


) : BackboneElement
