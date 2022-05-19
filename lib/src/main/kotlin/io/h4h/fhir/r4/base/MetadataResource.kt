package io.h4h.fhir.r4.base

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
 * Common Ancestor declaration for conformance and knowledge artifact resources.
 */
interface MetadataResource : DomainResource {

    /**
     * An absolute URI that is used to identify this metadata resource when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this metadata resource is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the metadata resource is stored on different servers.
     */
    val url: String?

    /**
     * The identifier that is used to identify this version of the metadata resource when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the metadata resource author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
     */
    val version: String?

    /**
     * A natural language name identifying the metadata resource. This name should be usable as an identifier for the module by machine processing applications such as code generation.
     */
    val name: String?

    /**
     * A short, descriptive, user-friendly title for the metadata resource.
     */
    val title: String?

    /**
     * The status of this metadata resource. Enables tracking the life-cycle of the content.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/publication-status")
     */
    val status: PublicationStatus?

    /**
     * A Boolean value to indicate that this metadata resource is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
     */
    val experimental: Boolean?

    /**
     * The date  (and optionally time) when the metadata resource was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the metadata resource changes.
     */
    val date: String?

    /**
     * The name of the organization or individual that published the metadata resource.
     */
    val publisher: String?

    /**
     * Contact details to assist a user in finding and communicating with the publisher.
     */
    val contact: List<ContactDetail>?

    /**
     * A free text natural language description of the metadata resource from a consumer's perspective.
     */
    val description: String?

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate metadata resource instances.
     */
    val useContext: List<UsageContext>?

    /**
     * A legal or geographic region in which the metadata resource is intended to be used.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/jurisdiction")
     */
    val jurisdiction: List<CodeableConcept>?


}