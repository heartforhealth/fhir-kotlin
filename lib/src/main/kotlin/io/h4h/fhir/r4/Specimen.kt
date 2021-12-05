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
 * A sample to be used for analysis.
 */
@Serializable
data class Specimen(

    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override var id: String? = null,
    override var resourceType: ResourceType? = ResourceType.Specimen,
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
     * Id for specimen.
     */
    var identifier: List<Identifier>? = null,

    /**
     * The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.
     */
    var accessionIdentifier: Identifier? = null,

    /**
     * The availability of the specimen.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/specimen-status")
    var status: SpecimenStatus? = null,

    /**
     * The kind of material that forms the specimen.
     */
    // @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v2-0487")
    var type: CodeableConcept? = null,

    /**
     * Where the specimen came from. This may be from patient(s), from a location (e.g., the source of an environmental sample), or a sampling of a substance or a device.
     */
    var subject: Reference? = null,

    /**
     * Time when specimen was received for processing or testing.
     * DateTimeType
     */
    var receivedTime: String? = null,

    /**
     * Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.
     */
    var parent: List<Reference>? = null,

    /**
     * Details concerning a service request that required a specimen to be collected.
     */
    var request: List<Reference>? = null,

    /**
     * Details concerning the specimen collection.
     */
    var collection: SpecimenCollectionComponent? = null,

    /**
     * Details concerning processing and processing steps for the specimen.
     */
    var processing: List<SpecimenProcessingComponent>? = null,

    /**
     * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
     */
    var container: List<SpecimenContainerComponent>? = null,

    /**
     * A mode or state of being that describes the nature of the specimen.
     */
    // @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v2-0493")
    var condition: List<CodeableConcept>? = null,

    /**
     * To communicate any details or issues about the specimen or during the specimen collection. (for example: broken vial, sent with patient, frozen).
     */
    var note: List<Annotation>? = null


)  : DomainResource {



}


@Serializable
data class SpecimenCollectionComponent(
    /**
     * Person who collected the specimen.
     */
    var collector: Reference? = null,

    /**
     * Time when specimen was collected from subject - the physiologically relevant time.
     */
    var collectedDateTime: String? = null,
    var collectedPeriod: Period? = null,


    /**
     * The span of time over which the collection of a specimen occurred.
     */
    var duration: Quantity? = null,

    /**
     * The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample.
     */
    var quantity: Quantity? = null,

    /**
     * A coded value specifying the technique that is used to perform the procedure.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/specimen-collection-method")
    var method: CodeableConcept? = null,

    /**
     * Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/body-site")
    var bodySite: CodeableConcept? = null,

    /**
     * Abstinence or reduction from some or all food, drink, or both, for a period of time prior to sample collection.
     */
    // @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v2-0916")
    var fastingStatusCodeableConcept: CodeableConcept? = null,
    var fastingStatusDuration: Quantity? = null

)

@Serializable
data class SpecimenProcessingComponent(
    /**
     * Textual description of procedure.
     */
    var description: String? = null,

    /**
     * A coded value specifying the procedure used to process the specimen.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/specimen-processing-procedure")
    var procedure: CodeableConcept? = null,

    /**
     * Material used in the processing step.
     */
    var additive: List<Reference>? = null,

    /**
     * A record of the time or period when the specimen processing occurred.  For example the time of sample fixation or the period of time the sample was in formalin.
     */
    var timeDateTime: String? = null,
    var timePeriod: Period? = null

)

@Serializable
data class SpecimenContainerComponent(

    /**
     * Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances.
     */
    var identifier: List<Identifier>? = null,

    /**
     * Textual description of the container.
     */
    var description: String? = null,

    /**
     * The type of container associated with the specimen (e.g. slide, aliquot, etc.).
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/specimen-container-type")
    var type: CodeableConcept? = null,

    /**
     * The capacity (volume or other measure) the container may contain.
     */
    var capacity: Quantity? = null,

    /**
     * The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type.
     */
    var specimenQuantity: Quantity? = null,

    /**
     * Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
     */
    // @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v2-0371")
    var additiveCodeableConcept: CodeableConcept? = null,
    var additiveReference: Reference? = null

)
