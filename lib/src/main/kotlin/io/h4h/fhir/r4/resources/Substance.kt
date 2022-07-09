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
    override val id: String,
    override val resourceType: ResourceType = ResourceType.Substance,
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
     * Unique identifier for the substance.
     */
    val identifier: List<Identifier>? = null,

    /**
     * A code to indicate if the substance is actively used.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/substance-status")
    val status: FHIRSubstanceStatus? = null,

    /**
     * A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/substance-category")
    val category: List<CodeableConcept>? = null,

    /**
     * A code (or set of codes) that identify this substance.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/substance-code")
    val code: CodeableConcept? = null,

    /**
     * A description of the substance - its appearance, handling requirements, and other usage notes.
     */
    val description: String? = null,

    /**
     * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.
     */
    val instance: List<SubstanceInstanceComponent>? = null,

    /**
     * A substance can be composed of other substances.
     */
    val ingredient: List<SubstanceIngredientComponent>? = null


) : DomainResource





@Serializable
data class SubstanceInstanceComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * Identifier associated with the package/container (usually a label affixed directly).
     */
    val identifier: Identifier? = null,

    /**
     * When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
     * DateTimeType
     */
    val expiry: String? = null,

    /**
     * The amount of the substance.
     */
    val quantity: Quantity? = null

) : BackboneElement


@Serializable
data class SubstanceIngredientComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * The amount of the ingredient in the substance - a concentration ratio.
     */
    val quantity: Ratio? = null,

    /**
     * Another substance that is a component of this substance.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/substance-code")
    val substanceCodeableConcept: CodeableConcept? = null,
    val substanceReference: Reference? = null

) : BackboneElement
