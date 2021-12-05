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
    override var id: String? = null,
    override var resourceType: ResourceType? = ResourceType.ObservationDefinition,
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
     * A code that classifies the general type of observation.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-category")
    var category: List<CodeableConcept>? = null,

    /**
     * Describes what will be observed. Sometimes this is called the observation "name".
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-codes")
    var code: CodeableConcept? = null,

    /**
     * A unique identifier assigned to this ObservationDefinition artifact.
     */
    var identifier: MutableList<Identifier>? = null,

    /**
     * The data types allowed for the value element of the instance observations conforming to this ObservationDefinition.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/permitted-data-type")
    var permittedDataType: List<ObservationDataType>? = null,

    /**
     * Multiple results allowed for observations conforming to this ObservationDefinition.
     */
    var multipleResultsAllowed: Boolean? = null,

    /**
     * The method or technique used to perform the observation.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-methods")
    var method: CodeableConcept? = null,

    /**
     * The preferred name to be used when reporting the results of observations conforming to this ObservationDefinition.
     */
    var preferredReportName: String? = null,

    /**
     * Characteristics for quantitative results of this observation.
     */
    var quantitativeDetails: ObservationDefinitionQuantitativeDetailsComponent? = null,

    /**
     * Multiple  ranges of results qualified by different contexts for ordinal or continuous observations conforming to this ObservationDefinition.
     */
    var qualifiedInterval: List<ObservationDefinitionQualifiedIntervalComponent>? = null,

    /**
     * The set of valid coded results for the observations  conforming to this ObservationDefinition.
     */
    var validCodedValueSet: Reference? = null,

    /**
     * The actual object that is the target of the reference (The set of valid coded results for the observations  conforming to this ObservationDefinition.)
     */
    var validCodedValueSetTarget: ValueSet? = null,

    /**
     * The set of normal coded results for the observations conforming to this ObservationDefinition.
     */
    var normalCodedValueSet: Reference? = null,

    /**
     * The actual object that is the target of the reference (The set of normal coded results for the observations conforming to this ObservationDefinition.)
     */
    var normalCodedValueSetTarget: ValueSet? = null,

    /**
     * The set of abnormal coded results for the observation conforming to this ObservationDefinition.
     */
    var abnormalCodedValueSet: Reference? = null,

    /**
     * The actual object that is the target of the reference (The set of abnormal coded results for the observation conforming to this ObservationDefinition.)
     */
    var abnormalCodedValueSetTarget: ValueSet? = null,

    /**
     * The set of critical coded results for the observation conforming to this ObservationDefinition.
     */
    var criticalCodedValueSet: Reference? = null,

    /**
     * The actual object that is the target of the reference (The set of critical coded results for the observation conforming to this ObservationDefinition.)
     */
    var criticalCodedValueSetTarget: ValueSet? = null


) : DomainResource



@Serializable
data class ObservationDefinitionQuantitativeDetailsComponent(
    /**
     * Customary unit used to report quantitative results of observations conforming to this ObservationDefinition.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/ucum-units")
    var customaryUnit: CodeableConcept? = null,

    /**
     * SI unit used to report quantitative results of observations conforming to this ObservationDefinition.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/ucum-units")
    var unit: CodeableConcept? = null,

    /**
     * Factor for converting value expressed with SI unit to value expressed with customary unit.
     */
    var conversionFactor: Double? = null,

    /**
     * Number of digits after decimal separator when the results of such observations are of type Quantity.
     */
    var decimalPrecision: Int? = null
)




@Serializable
data class ObservationDefinitionQualifiedIntervalComponent(

    /**
     * The category of interval of values for continuous or ordinal observations conforming to this ObservationDefinition.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-range-category")
    var category: ObservationRangeCategory? = null,

    /**
     * The low and high values determining the interval. There may be only one of the two.
     */
    var range: Range? = null,

    /**
     * Codes to indicate the health context the range applies to. For example, the normal or therapeutic range.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/referencerange-meaning")
    var context: CodeableConcept? = null,

    /**
     * Codes to indicate the target population this reference range applies to.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/referencerange-appliesto")
    var appliesTo: MutableList<CodeableConcept>? = null,

    /**
     * Sex of the population the range applies to.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/administrative-gender")
    var gender: AdministrativeGender? = null,

    /**
     * The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so.
     */
    var age: Range? = null,

    /**
     * The gestational age to which this reference range is applicable, in the context of pregnancy.
     */
    var gestationalAge: Range? = null,

    /**
     * Text based condition for which the reference range is valid.
     */
    var condition: String? = null


)