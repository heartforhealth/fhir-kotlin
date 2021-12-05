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
 * For referring to data content defined in other formats.
 */

@Serializable
data class Attachment(
    
    /**
     * Identifies the type of the data in the attachment and allows a method to be chosen to interpret or render the data. Includes mime type parameters such as charset where appropriate.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/mimetypes")
    var contentType: String? = null,

    /**
     * The human language of the content. The value can be any valid value according to BCP 47.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/languages")
    var language: String? = null,

    /**
     * The actual data of the attachment - a sequence of bytes, base64 encoded.
     */
    var data: String? = null,

    /**
     * A location where the data can be accessed.
     */
    var url: String? = null,

    /**
     * The number of bytes of data that make up this attachment (before base64 encoding, if that is done).
     */
    var size: Int? = null,

    /**
     * The calculated hash of the data using SHA-1. Represented using base64.
     */
    var hash: String? = null,

    /**
     * A label or set of text to display in place of the data.
     */
    var title: String? = null,

    /**
     * The date that the attachment was first created.
     */
    var creation: String? = null

)