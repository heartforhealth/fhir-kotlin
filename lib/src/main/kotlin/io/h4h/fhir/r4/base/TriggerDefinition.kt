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
 * A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
 */

@Serializable
data class TriggerDefinition(

    /**
     * The type of triggering event.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/trigger-type")
    var type: TriggerType? = null,

    /**
     * A formal name for the event. This may be an absolute URI that identifies the event formally (e.g. from a trigger registry), or a simple relative URI that identifies the event in a local context.
     */
    var name: String? = null,

    /**
     * The timing of the event (if this is a periodic trigger).
     */
    var timingTiming: Timing? = null,
    var timingReference: Reference? = null,
    var timingDate: String? = null,
    var timingDateTime: String? = null,


    /**
     * The triggering data of the event (if this is a data trigger). If more than one data is requirement is specified, then all the data requirements must be true.
     */
    var data: List<DataRequirement>? = null,

    /**
     * A boolean-valued expression that is evaluated in the context of the container of the trigger definition and returns whether or not the trigger fires.
     */
    var condition: Expression? = null

)