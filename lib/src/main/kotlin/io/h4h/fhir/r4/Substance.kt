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
 * A homogeneous material with a definite composition.
 */
@Serializable
data class Substance(


    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override var id: String? = null,
    override var resourceType: ResourceType? = ResourceType.Substance,
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
     * Unique identifier for the substance.
     */
    var identifier: List<Identifier>? = null,

    /**
     * A code to indicate if the substance is actively used.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/substance-status")
    var status: FHIRSubstanceStatus? = null,

    /**
     * A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/substance-category")
    var category: List<CodeableConcept>? = null,

    /**
     * A code (or set of codes) that identify this substance.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/substance-code")
    var code: CodeableConcept? = null,

    /**
     * A description of the substance - its appearance, handling requirements, and other usage notes.
     */
    var description: String? = null,

    /**
     * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.
     */
    var instance: List<SubstanceInstanceComponent>? = null,

    /**
     * A substance can be composed of other substances.
     */
    var ingredient: List<SubstanceIngredientComponent>? = null


) : DomainResource {


}


@Serializable
data class SubstanceInstanceComponent(

    /**
     * Identifier associated with the package/container (usually a label affixed directly).
     */
    var identifier: Identifier? = null,

    /**
     * When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
     * DateTimeType
     */
    var expiry: String? = null,

    /**
     * The amount of the substance.
     */
    var quantity: Quantity? = null

)


@Serializable
data class SubstanceIngredientComponent(
    /**
     * The amount of the ingredient in the substance - a concentration ratio.
     */
    var quantity: Ratio? = null,

    /**
     * Another substance that is a component of this substance.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/substance-code")
    var substanceCodeableConcept: CodeableConcept? = null,
    var substanceReference: Reference? = null

)
