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
// Generated on Wed, Jan 30, 2019 16:19-0500 for FHIR v4.0.0

@Serializable
enum class AdministrativeGender : CodeableEnumeration {

    /**
     * Male.
     */
    MALE,

    /**
     * Female.
     */
    FEMALE,

    /**
     * Other.
     */
    OTHER,

    /**
     * Unknown.
     */
    UNKNOWN,

    /**
     * added to help the parsers
     */
    NULL;


    override fun toCode(): String? {
        return when (this) {
            MALE -> "male"
            FEMALE -> "female"
            OTHER -> "other"
            UNKNOWN -> "unknown"
            NULL -> null
        }
    }



    override val system: String?
        get() = when (this) {
            NULL -> null
            else -> "http://hl7.org/fhir/administrative-gender"
        }


    override val definition: String?
        get() = when (this) {
            MALE -> "Male."
            FEMALE -> "Female."
            OTHER -> "Other."
            UNKNOWN -> "Unknown."
            NULL -> null
        }


    override val display: String?
        get() = when (this) {
            MALE -> "Male"
            FEMALE -> "Female"
            OTHER -> "Other"
            UNKNOWN -> "Unknown"
            NULL -> null
        }


//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): AdministrativeGender? {
//            if (codeString == null || "" == codeString) return null
//            if ("male" == codeString) return MALE
//            if ("female" == codeString) return FEMALE
//            if ("other" == codeString) return OTHER
//            if ("unknown" == codeString) return UNKNOWN
//            throw FHIRException("Unknown AdministrativeGender code '$codeString'")
//        }
//    }
}