package io.h4h.fhir.r5.resources

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
 * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
 */

@Serializable
data class ObservationDefinition(


    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override val id: String,
    override val resourceType: ResourceType = ResourceType.ObservationDefinition,
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
     * Logical canonical URL to reference this ObservationDefinition (globally unique)
     * */
    val url: String? = null,

    /**
     * Business version of the ObservationDefinition
     * */
    val version: String? = null,

    /**
     * Name for this ObservationDefinition (computer friendly)
     * */
    val name: String? = null,

    /**
     * Name for this ObservationDefinition (human friendly)
     * */
    val title: String? = null,

    /**
     * The current state of the ObservationDefinition.
     * */
    val status: PublicationStatus? = null,

    /**
     * A flag to indicate that this ObservationDefinition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
     * */
    val experimental: Boolean? = null,

    /**
     * The date (and optionally time) when the ObservationDefinition was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the ObservationDefinition changes.
     * */
    val date: String? = null,

    /**
     * Helps establish the "authority/credibility" of the ObservationDefinition. May also allow for contact.
     */
    val publisher: Reference? = null,

    /**
     * Contact details to assist a user in finding and communicating with the publisher.
     * */
    val contact: List<ContactDetail>? = null,

    /**
     * Natural language description of the ObservationDefinition
     * */
    val description: String? = null,

    /**
     * Content intends to support these contexts
     * */
    val useContext: List<UsageContext>? = null,

    /**
     * Intended jurisdiction for this ObservationDefinition (if applicable)
     * */
    val jurisdiction: List<CodeableConcept>? = null,

    /**
     * Why this ObservationDefinition is defined
     * */
    val purpose: String? = null,

    /**
     * Use and/or publishing restrictions
     * */
    val copyright: String? = null,

    /**
     * When ObservationDefinition was approved by publisher
     * */
    val approvalDate: String? = null,

    /**
     * Date on which the asset content was last reviewed
     * */
    val lastReviewDate: String? = null,

    /**
     * The effective date range for the ObservationDefinition
     * */
    val effectivePeriod: Period? = null,

    /**
     * Based on FHIR definition of another observation
     * */
    val derivedFromCanonical: List<String>? = null,

    /**
     * Based on external definition
     * */
    val derivedFromUri: List<String>? = null,

    /**
     * Type of subject for the defined observation
     * */
    val subject: List<CodeableConcept>? = null,

    /**
     * Desired kind of performer for such kind of observation
     * */
    val performerType: CodeableConcept? = null,

    /**
     * Body part to be observed
     * */
    val bodySite: CodeableConcept? = null,

    /**
     * Kind of specimen used by this type of observation
     * */
    val specimen: List<Reference>? = null,

    /**
     * Measurement device or model of device
     * */
    val device: List<Reference>? = null,



    // ============================================================
    // common with R4
    // ============================================================


    /**
     * A code that classifies the general type of observation.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-category")
     */
    val category: List<CodeableConcept>? = null,

    /**
     * Describes what will be observed. Sometimes this is called the observation "name".
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-codes")
     */
    val code: CodeableConcept? = null,

    /**
     * A unique identifier assigned to this ObservationDefinition artifact.
     */
    val identifier: MutableList<Identifier>? = null,

    /**
     * The data types allowed for the value element of the instance observations conforming to this ObservationDefinition.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/permitted-data-type")
     */
    val permittedDataType: List<ObservationDataType>? = null,

    /**
     * Multiple results allowed for observations conforming to this ObservationDefinition.
     */
    val multipleResultsAllowed: Boolean? = null,

    /**
     * The method or technique used to perform the observation.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-methods")
     */
    val method: CodeableConcept? = null,

    /**
     * The preferred name to be used when reporting the results of observations conforming to this ObservationDefinition.
     */
    val preferredReportName: String? = null,

    /**
     * Characteristics for quantitative results of this observation.
     */
    val quantitativeDetails: ObservationDefinitionQuantitativeDetailsComponent? = null,

    /**
     * A set of qualified values associated with a context and a set of conditions - provides a range for quantitative and ordinal observations and a collection of value sets for qualitative observations.
     */
    val qualifiedValue: List<ObservationDefinitionQualifiedValueComponent>? = null,

    /**
     * This ObservationDefinition defines a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group.
     * */
    val hasMember: List<Reference>? = null,

    /**
     * Some observations have multiple component observations, expressed as separate code value pairs.
     * */
    val component: List<ObservationDefinitionComponent>? = null


) : DomainResource



@Serializable
data class ObservationDefinitionQuantitativeDetailsComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * Customary unit used to report quantitative results of observations conforming to this ObservationDefinition.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/ucum-units")
     */
    val customaryUnit: CodeableConcept? = null,

    /**
     * SI unit used to report quantitative results of observations conforming to this ObservationDefinition.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/ucum-units")
     */
    val unit: CodeableConcept? = null,

    /**
     * Factor for converting value expressed with SI unit to value expressed with customary unit.
     */
    val conversionFactor: Double? = null,

    /**
     * Number of digits after decimal separator when the results of such observations are of type Quantity.
     */
    val decimalPrecision: Int? = null

) : BackboneElement



@Serializable
data class ObservationDefinitionQualifiedValueComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * The range of values defined for continuous or ordinal observations that match the criteria of this set of qualified values.
     */
    val range: Range? = null,

    /**
     * The category of interval of values for continuous or ordinal observations conforming to this ObservationDefinition.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-range-category")
     */
    val rangeCategory: ObservationRangeCategory? = null,

    /**
     * A concept defining the context for this set of qualified values.
     */
    val context: CodeableConcept? = null,

    /**
     * Codes to indicate the target population this reference range applies to.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/referencerange-appliesto")
     */
    val appliesTo: MutableList<CodeableConcept>? = null,

    /**
     * Sex of the population the range applies to.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/administrative-gender")
     */
    val gender: AdministrativeGender? = null,

    /**
     * The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so.
     */
    val age: Range? = null,

    /**
     * The gestational age to which this reference range is applicable, in the context of pregnancy.
     */
    val gestationalAge: Range? = null,

    /**
     * Text based condition for which the reference range is valid.
     */
    val condition: String? = null,

    /**
     * The set of valid coded results for the observations conforming to this ObservationDefinition.
     */
    val validCodedValueSet: String? = null,

    /**
     * The set of normal coded results for the observations conforming to this ObservationDefinition.
     */
    val normalCodedValueSet: String? = null,

    /**
     * The set of abnormal coded results for the observation conforming to this ObservationDefinition.
     */
    val abnormalCodedValueSet: String? = null,

    /**
     * The set of critical coded results for the observation conforming to this ObservationDefinition.
     */
    val criticalCodedValueSet: String? = null,


) : BackboneElement



@Serializable
data class ObservationDefinitionComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================


    /**
     * Describes what will be observed. Sometimes this is called the observation "name".
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-codes")
     */
    val code: CodeableConcept? = null,


    /**
     * The data types allowed for the value element of the instance observations conforming to this ObservationDefinition.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/permitted-data-type")
     */
    val permittedDataType: List<ObservationDataType>? = null,


    /**
     * Characteristics for quantitative results of this observation.
     */
    val quantitativeDetails: ObservationDefinitionQuantitativeDetailsComponent? = null,

    /**
     * A set of qualified values associated with a context and a set of conditions - provides a range for quantitative and ordinal observations and a collection of value sets for qualitative observations.
     */
    val qualifiedValue: List<ObservationDefinitionQualifiedValueComponent>? = null


) : BackboneElement