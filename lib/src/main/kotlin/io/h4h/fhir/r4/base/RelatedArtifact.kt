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
 * Related artifacts such as additional documentation, justification, or bibliographic references.
 */

@Serializable
data class RelatedArtifact(

    /**
     * The type of relationship to the related artifact.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/related-artifact-type")
     */
    val type: RelatedArtifactType? = null,

    /**
     * A short label that can be used to reference the citation from elsewhere in the containing artifact, such as a footnote index.
     */
    val label: String? = null,

    /**
     * A brief description of the document or knowledge resource being referenced, suitable for display to a consumer.
     */
    val display: String? = null,

    /**
     * A bibliographic citation for the related artifact. This text SHOULD be formatted according to an accepted citation format.
     */
    val citation: String? = null,

    /**
     * A url for the artifact that can be followed to access the actual content.
     */
    val url: String? = null,

    /**
     * The document being referenced, represented as an attachment. This is exclusive with the resource element.
     */
    val document: Attachment? = null,

    /**
     * The related resource, such as a library, value set, profile, or other knowledge resource.
     */
    val resource: String? = null

)