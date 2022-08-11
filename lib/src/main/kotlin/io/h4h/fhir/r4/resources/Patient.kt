package io.h4h.fhir.r4.resources

import io.h4h.fhir.r4.base.*
import io.h4h.fhir.r4.codesystems.AdministrativeGender
import kotlinx.serialization.SerialName
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
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 */
@Serializable
data class Patient(


    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override val id: String,
    override val resourceType: ResourceType = ResourceType.Patient,
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
     * An identifier for this patient.
     */
    val identifier: List<Identifier>? = null,

    /**
     * Whether this patient record is in active use.
     * Many systems use this property to mark as non-current patients, such as those that have not been seen for a period of time based on an organization's business rules.
     *
     * It is often used to filter patient lists to exclude inactive patients
     *
     * Deceased patients may also be marked as inactive for the same reasons, but may be active for some time after death.
     */
    val active: Boolean? = null,

    /**
     * A name associated with the individual.
     */
    val name: List<HumanName>? = null,

    /**
     * A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
     */
    val telecom: List<ContactPoint>? = null,

    /**
     * Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/administrative-gender")
     */
    val gender: AdministrativeGender? = null,

    /**
     * The date of birth for the individual.
     */
    val birthDate: String? = null,

    /**
     * Indicates if the individual is deceased or not.
     */
    val deceasedBoolean: Boolean? = null,
    val deceasedDateTime: String? = null,

    /**
     * An address for the individual.
     */
    val address: List<Address>? = null,

    /**
     * This field contains a patient's most recent marital (civil) status.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/marital-status")
     */
    val maritalStatus: CodeableConcept? = null,

    /**
     * Indicates whether the patient is part of a multiple (boolean) or indicates the actual birth order (integer).
     */
    val multipleBirthBoolean: Boolean? = null,
    val multipleBirthInteger: Int? = null,

    /**
     * Image of the patient.
     */
    val photo: List<Attachment>? = null,

    /**
     * A contact party (e.g. guardian, partner, friend) for the patient.
     */
    val contact: List<ContactComponent>? = null,

    /**
     * A language which may be used to communicate with the patient about his or her health.
     */
    val communication: List<PatientCommunicationComponent>? = null,

    /**
     * Patient's nominated care provider.
     */
    val generalPractitioner: List<Reference>? = null,

    /**
     * Organization that is the custodian of the patient record.
     */
    val managingOrganization: Reference? = null,


    /**
     * Link to another patient resource that concerns the same actual patient.
     */
    val link: List<PatientLinkComponent>? = null


) : DomainResource




@Serializable
enum class LinkType : CodeableEnumeration {

    /**
     * The patient resource containing this link must no longer be used. The link points forward to another patient resource that must be used in lieu of the patient resource that contains this link.
     */
    @SerialName("replaced-by")
    REPLACEDBY,

    /**
     * The patient resource containing this link is the current active patient record. The link points back to an inactive patient resource that has been merged into this resource, and should be consulted to retrieve additional referenced information.
     */
    @SerialName("replaces")
    REPLACES,

    /**
     * The patient resource containing this link is in use and valid but not considered the main source of information about a patient. The link points forward to another patient resource that should be consulted to retrieve additional patient information.
     */
    @SerialName("refer")
    REFER,

    /**
     * The patient resource containing this link is in use and valid, but points to another patient resource that is known to contain data about the same person. Data in this resource might overlap or contradict information found in the other patient resource. This link does not indicate any relative importance of the resources concerned, and both should be regarded as equally valid.
     */
    @SerialName("seealso")
    SEEALSO;


    override val code: String?
        get() = when (this) {
            REPLACEDBY -> "replaced-by"
            REPLACES -> "replaces"
            REFER -> "refer"
            SEEALSO -> "seealso"
        }

    override val system: String?
        get() = "http://hl7.org/fhir/link-type"


    override val definition: String?
        get() = when (this) {
            REPLACEDBY -> "The patient resource containing this link must no longer be used. The link points forward to another patient resource that must be used in lieu of the patient resource that contains this link."
            REPLACES -> "The patient resource containing this link is the current active patient record. The link points back to an inactive patient resource that has been merged into this resource, and should be consulted to retrieve additional referenced information."
            REFER -> "The patient resource containing this link is in use and valid but not considered the main source of information about a patient. The link points forward to another patient resource that should be consulted to retrieve additional patient information."
            SEEALSO -> "The patient resource containing this link is in use and valid, but points to another patient resource that is known to contain data about the same person. Data in this resource might overlap or contradict information found in the other patient resource. This link does not indicate any relative importance of the resources concerned, and both should be regarded as equally valid."
        }


    override val display: String?
        get() = when (this) {
            REPLACEDBY -> "Replaced-by"
            REPLACES -> "Replaces"
            REFER -> "Refer"
            SEEALSO -> "See also"
        }

}



@Serializable
data class ContactComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================


    /**
     * The nature of the relationship between the patient and the contact person.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/patient-contactrelationship")
     */
    val relationship: List<CodeableConcept>? = null,

    /**
     * A name associated with the contact person.
     */
    val name: HumanName? = null,

    /**
     * A contact detail for the person, e.g. a telephone number or an email address.
     */
    val telecom: List<ContactPoint>? = null,

    /**
     * Address for the contact person.
     */
    val address: Address? = null,

    /**
     * Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/administrative-gender")
     */
    val gender: AdministrativeGender? = null,

    /**
     * Organization on behalf of which the contact is acting or for which the contact is working.
     */
    val organization: Reference? = null,

    /**
     * The period during which this contact person or organization is valid to be contacted relating to this patient.
     */
    val period: Period? = null

) : BackboneElement



@Serializable
data class PatientCommunicationComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. "en" for English, or "en-US" for American English versus "en-EN" for England English.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/languages")
     */
    val language: CodeableConcept? = null,

    /**
     * Indicates whether or not the patient prefers this language (over other languages he masters up a certain level).
     */
    val preferred: Boolean? = null

) : BackboneElement



@Serializable
data class PatientLinkComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * The other patient resource that the link refers to.
     */
    val other: Reference? = null,

    /**
     * The type of link between this patient resource and another patient resource.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/link-type")
     */
    val type: LinkType? = null

): BackboneElement
