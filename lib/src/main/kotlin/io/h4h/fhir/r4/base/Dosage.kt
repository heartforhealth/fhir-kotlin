package io.h4h.fhir.r4.base


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
 * Indicates how the medication is/was taken or should be taken by the patient.
 */
@Serializable
data class Dosage(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    
    /**
     * Indicates the order in which the dosage instructions should be applied or interpreted.
     */
    val sequence: Int? = null,


    /**
     * Free text dosage instructions e.g. SIG.
     */
    val text: String? = null,


    /**
     * Supplemental instructions to the patient on how to take the medication  (e.g. "with meals" or"take half to one hour before food") or warnings for the patient about the medication (e.g. "may cause drowsiness" or "avoid exposure of skin to direct sunlight or sunlamps").
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/additional-instruction-codes")
     */
    val additionalInstruction: MutableList<CodeableConcept>? = null,


    /**
     * Instructions in terms that are understood by the patient or consumer.
     */
    val patientInstruction: String? = null,


    /**
     * When medication should be administered.
     */
    val timing: Timing? = null,


    /**
     * Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/medication-as-needed-reason")
     */
    val asNeededBoolean: Boolean? = null,
    val asNeededCodeableConcept: CodeableConcept? = null,


    /**
     * Body site to administer to.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/approach-site-codes")
     */
    val site: CodeableConcept? = null,


    /**
     * How drug should enter body.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/route-codes")
     */
    val route: CodeableConcept? = null,


    /**
     * Technique for administering medication.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/administration-method-codes")
     */
    val method: CodeableConcept? = null,


    /**
     * The amount of medication administered.
     */
    val doseAndRate: MutableList<DosageDoseAndRateComponent>? = null,


    /**
     * Upper limit on medication per unit of time.
     */
    val maxDosePerPeriod: Ratio? = null,


    /**
     * Upper limit on medication per administration.
     */
    val maxDosePerAdministration: Quantity? = null,


    /**
     * Upper limit on medication per lifetime of the patient.
     */
    val maxDosePerLifetime: Quantity? = null

): BackboneElement



@Serializable
data class DosageDoseAndRateComponent(

    // ============================================================
    // Element requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * The kind of dose or rate specified, for example, ordered or calculated.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/dose-rate-type")
     */
    val type: CodeableConcept? = null,

    /**
     * Amount of medication per dose.
     */
    val doseRange: Range? = null,
    val doseQuantity: Quantity? = null,

    /**
     * Amount of medication per unit of time.
     */
    val rateRatio: Ratio? = null,
    val rateRange: Range? = null,
    val rateQuantity: Quantity? = null,

): Element
