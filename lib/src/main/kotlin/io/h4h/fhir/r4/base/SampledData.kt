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
 * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
 */
@Serializable
data class SampledData(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override val extension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * The base quantity that a measured value of zero represents. In addition, this provides the units of the entire measurement series.
     */
    val origin: Quantity? = null,

    /**
     * The length of time between sampling times, measured in milliseconds.
     */
    val period: Double? = null,

    /**
     * A correction factor that is applied to the sampled data points before they are added to the origin.
     */
    val factor: Double? = null,

    /**
     * The lower limit of detection of the measured points. This is needed if any of the data points have the value "L" (lower than detection limit).
     */
    val lowerLimit: Double? = null,

    /**
     * The upper limit of detection of the measured points. This is needed if any of the data points have the value "U" (higher than detection limit).
     */
    val upperLimit: Double? = null,

    /**
     * The number of sample points at each time point. If this value is greater than one, then the dimensions will be interlaced - all the sample points for a point in time will be recorded at once.
     */
    val dimensions: Int? = null,

    /**
     * A series of data points which are decimal values separated by a single space (character u20). The special values "E" (error), "L" (below detection limit) and "U" (above detection limit) can also be used in place of a decimal value.
     */
    val data: String? = null


) : Element