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
 * Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.
 */
@Serializable
data class Location(


    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override val id: String,
    override val resourceType: String = ResourceType.Location.name,
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
     * Unique code or number identifying the location to its users.
     */
    val identifier: List<Identifier>? = null,

    /**
     * The status property covers the general availability of the resource, not the current value which may be covered by the operationStatus, or by a schedule/slots if they are configured for the location.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/location-status")
     */
    val status: LocationStatus? = null,

    /**
     * The operational status covers operation values most relevant to beds (but can also apply to rooms/units/chairs/etc. such as an isolation unit/dialysis chair). This typically covers concepts such as contamination, housekeeping, and other activities like maintenance.
     * @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v2-0116")
     */
    val operationalStatus: Coding? = null,

    /**
     * Name of the location as used by humans. Does not need to be unique.
     */
    val name: String? = null,

    /**
     * A list of alternate names that the location is known as, or was known as, in the past.
     */
    val alias: List<String>? = null,

    /**
     * Description of the Location, which helps in finding or referencing the place.
     */
    val description: String? = null,

    /**
     * Indicates whether a resource instance represents a specific location or a class of locations.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/location-mode")
     */
    val mode: LocationMode? = null,

    /**
     * Indicates the type of function performed at the location.
     * @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v3-ServiceDeliveryLocationRoleType")
     */
    val type: List<CodeableConcept>? = null,

    /**
     * The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites.
     */
    val telecom: List<ContactPoint>? = null,

    /**
     * Physical location.
     */
    val address: Address? = null,

    /**
     * Physical form of the location, e.g. building, room, vehicle, road.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/location-physical-type")
     */
    val physicalType: CodeableConcept? = null,

    /**
     * The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML).
     */
    val position: LocationPositionComponent? = null,

    /**
     * The organization responsible for the provisioning and upkeep of the location.
     */
    val managingOrganization: Reference? = null,

    /**
     * Another Location of which this Location is physically a part of.
     */
    val partOf: Reference? = null,

    /**
     * What days/times during a week is this location usually open.
     */
    val hoursOfOperation: List<LocationHoursOfOperationComponent>? = null,

    /**
     * A description of when the locations opening ours are different to normal, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as detailed in the opening hours Times.
     */
    val availabilityExceptions: String? = null,

    /**
     * Technical endpoints providing access to services operated for the location.
     */
    val endpoint: List<Reference>? = null

) : DomainResource





@Serializable
data class LocationPositionComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below).
     */
    val longitude: Double? = null,

    /**
     * Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below).
     */
    val latitude: Double? = null,

    /**
     * Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below).
     */
    val altitude: Double? = null

) : BackboneElement


@Serializable
data class LocationHoursOfOperationComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * Indicates which days of the week are available between the start and end Times.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/days-of-week")
     */
    val daysOfWeek: List<DayOfWeek>? = null,

    /**
     * The Location is open all day.
     */
    val allDay: Boolean? = null,

    /**
     * Time that the Location opens.
     * A time during the day, in the format hh:mm:ss. There is no date specified. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored at receiver discretion.
     */
    val openingTime: String? = null,

    /**
     * Time that the Location closes.
     * A time during the day, in the format hh:mm:ss. There is no date specified. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored at receiver discretion.
     */
    val closingTime: String? = null

) : BackboneElement