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
 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).
 */
@Serializable
data class ValueSet(


    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override val id: String,
    override val resourceType: ResourceType = ResourceType.ValueSet,
    override val meta: Meta? = null,
    override val implicitRules: String? = null,
    override val language: String? = null,
    override val text: Narrative? = null,
    // override val contained: List<Resource>? = null,
    override val extension: List<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,


    /**
     * MetadataResource requirements
     */
    override val url: String? = null,
    override val version: String? = null,
    override val name: String? = null,
    override val title: String? = null,
    override val status: PublicationStatus? = null,
    override val experimental: Boolean? = null,
    override val date: String? = null,
    override val publisher: String? = null,
    override val contact: List<ContactDetail>? = null,
    override val description: String? = null,
    override val useContext: List<UsageContext>? = null,
    override val jurisdiction: List<CodeableConcept>? = null,
    // ============================================================
    // ============================================================


    /**
     * A formal identifier that is used to identify this value set when it is represented in other formats, or referenced in a specification, model, design or an instance.
     */
    val identifier: List<Identifier>? = null,

    /**
     * If this is set to 'true', then no new versions of the content logical definition can be created.  Note: Other metadata might still change.
     */
    val immutable: Boolean? = null,

    /**
     * Explanation of why this value set is needed and why it has been designed as it has.
     */
    val purpose: String? = null,

    /**
     * A copyright statement relating to the value set and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the value set.
     */
    val copyright: String? = null,

    /**
     * A set of criteria that define the contents of the value set by including or excluding codes selected from the specified code system(s) that the value set draws from. This is also known as the Content Logical Definition (CLD).
     */
    val compose: ValueSetComposeComponent? = null,

    /**
     * A value set can also be "expanded", where the value set is turned into a simple collection of enumerated codes. This element holds the expansion, if it has been performed.
     */
    val expansion: ValueSetExpansionComponent? = null

) : MetadataResource


@Serializable
data class ValueSetComposeComponent(

    /**
     * The Locked Date is  the effective date that is used to determine the version of all referenced Code Systems and Value Set Definitions included in the compose that are not already tied to a specific version.
     */
    val lockedDate: String? = null,

    /**
     * Whether inactive codes - codes that are not approved for current use - are in the value set. If inactive = true, inactive codes are to be included in the expansion, if inactive = false, the inactive codes will not be included in the expansion. If absent, the behavior is determined by the implementation, or by the applicable $expand parameters (but generally, inactive codes would be expected to be included).
     */
    val inactive: Boolean? = null,

    /**
     * Include one or more codes from a code system or other value set(s).
     */
    val include: List<ConceptSetComponent>? = null,

    /**
     * Exclude one or more codes from the value set based on code system filters and/or other value sets.
     */
    val exclude: List<ConceptSetComponent>? = null

)


@Serializable
data class ConceptSetComponent(

    /**
     * An absolute URI which is the code system from which the selected codes come from.
     */
    val system: String? = null,

    /**
     * The version of the code system that the codes are selected from, or the special version '*' for all versions.
     */
    val version: String? = null,

    /**
     * Specifies a concept to be included or excluded.
     */
    val concept: List<ConceptReferenceComponent>? = null,

    /**
     * Select concepts by specify a matching criterion based on the properties (including relationships) defined by the system, or on filters defined by the system. If multiple filters are specified, they SHALL all be true.
     */
    val filter: List<ConceptSetFilterComponent>? = null,

    /**
     * Selects the concepts found in this value set (based on its value set definition). This is an absolute URI that is a reference to ValueSet.url.  If multiple value sets are specified this includes the union of the contents of all of the referenced value sets.
     */
    val valueSet: List<String>? = null

)


@Serializable
data class ConceptReferenceComponent(

    /**
     * Specifies a code for the concept to be included or excluded.
     */
    val code: String? = null,

    /**
     * The text to display to the user for this concept in the context of this valueset. If no display is provided, then applications using the value set use the display specified for the code by the system.
     */
    val display: String? = null,

    /**
     * Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc.
     */
    val designation: List<ConceptReferenceDesignationComponent>? = null
)


@Serializable
data class ConceptReferenceDesignationComponent(

    /**
     * The language this designation is defined for.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/languages")
    val language: String? = null,

    /**
     * A code that represents types of uses of designations.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/designation-use")
    val use: Coding? = null,

    /**
     * The text value for this designation.
     */
    val value: String? = null

)


@Serializable
data class ConceptSetFilterComponent(
    /**
     * A code that identifies a property or a filter defined in the code system.
     */
    val property: String? = null,

    /**
     * The kind of operation to perform as a part of the filter criteria.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/filter-operator")
    val op: FilterOperator? = null,

    /**
     * The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value  (if the filter represents a property defined in CodeSystem) or of the system filter value (if the filter represents a filter defined in CodeSystem) when the operation is 'regex', or one of the values (true and false), when the operation is 'exists'.
     */
    val value: String? = null
)


@Serializable
data class ValueSetExpansionComponent(

    /**
     * An identifier that uniquely identifies this expansion of the valueset, based on a unique combination of the provided parameters, the system default parameters, and the underlying system code system versions etc. Systems may re-use the same identifier as long as those factors remain the same, and the expansion is the same, but are not required to do so. This is a business identifier.
     */
    val identifier: String? = null,

    /**
     * The time at which the expansion was produced by the expanding system.
     */
    val timestamp: String? = null,

    /**
     * The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter.
     */
    val total: Int? = null,

    /**
     * If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL NOT be present.
     */
    val offset: Int? = null,

    /**
     * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.
     */
    val parameter: List<ValueSetExpansionParameterComponent>? = null,


    /**
     * The codes that are contained in the value set expansion.
     */
    val contains: List<ValueSetExpansionContainsComponent>? = null

)


@Serializable
data class ValueSetExpansionParameterComponent(

    /**
     * Name of the input parameter to the $expand operation; may be a server-assigned name for additional default or other server-supplied parameters used to control the expansion process.
     */
    val name: String? = null,

    /**
     * The value of the parameter.
     */
    val valueString: String? = null,
    val valueBoolean: Boolean? = null,
    val valueInteger: String? = null,
    val valueDecimal: String? = null,
    val valueUri: String? = null,
    val valueCode: String? = null,
    val valueDateTime: String? = null
)


@Serializable
data class ValueSetExpansionContainsComponent(

    /**
     * An absolute URI which is the code system in which the code for this item in the expansion is defined.
     */
    val system: String? = null,

    /**
     * If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value.
     */
    val abstract: Boolean? = null,

    /**
     * If the concept is inactive in the code system that defines it. Inactive codes are those that are no longer to be used, but are maintained by the code system for understanding legacy data. It might not be known or specified whether an concept is inactive (and it may depend on the context of use).
     */
    val inactive: Boolean? = null,

    /**
     * The version of the code system from this code was taken. Note that a well-maintained code system does not need the version reported, because the meaning of codes is consistent across versions. However this cannot consistently be assured, and when the meaning is not guaranteed to be consistent, the version SHOULD be exchanged.
     */
    val version: String? = null,

    /**
     * The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set.
     */
    val code: String? = null,

    /**
     * The recommended display for this item in the expansion.
     */
    val display: String? = null,

    /**
     * Additional representations for this item - other languages, aliases, specialized purposes, used for particular purposes, etc. These are relevant when the conditions of the expansion do not fix to a single correct representation.
     */
    val designation: List<ConceptReferenceDesignationComponent>? = null,

    /**
     * Other codes and entries contained under this entry in the hierarchy.
     */
    val contains: List<ValueSetExpansionContainsComponent>? = null

)
