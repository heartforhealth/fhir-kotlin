package io.h4h.fhir.r4.resources


import com.fasterxml.jackson.annotation.JsonProperty
import io.h4h.fhir.r4.base.*
import kotlinx.serialization.SerialName
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
 * A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.
 */
@Serializable
data class Device(

    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override val id: String,
    override val resourceType: String = ResourceType.Device.name,
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
     * Unique instance identifiers assigned to a device by manufacturers other organizations or owners.
     */
    val identifier: MutableList<Identifier>? = null,

    
    /**
     * The reference to the definition for the device.
     */
    val definition: Reference? = null,

    
    /**
     * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
     */
    val udiCarrier: MutableList<DeviceUdiCarrierComponent>? = null,

    
    /**
     * Status of the Device availability.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/device-status")
     */
    val status: FHIRDeviceStatus? = null,


    /**
     * Reason for the dtatus of the Device availability.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/device-status-reason")
     */
    val statusReason: MutableList<CodeableConcept>? = null,


    /**
     * The distinct identification string as required by regulation for a human cell, tissue, or cellular and tissue-based product.
     */
    val distinctIdentifier: String? = null,


    /**
     * A name of the manufacturer.
     */
    val manufacturer: String? = null,


    /**
     * The date and time when the device was manufactured.
     */
    val manufactureDate: String? = null,


    /**
     * The date and time beyond which this device is no longer valid or should not be used (if applicable).
     */
    val expirationDate: String? = null,


    /**
     * Lot number assigned by the manufacturer.
     */
    val lotNumber: String? = null,


    /**
     * The serial number assigned by the organization when the device was manufactured.
     */
    val serialNumber: String? = null,


    /**
     * This represents the manufacturer's name of the device as provided by the device, from a UDI label, or by a person describing the Device.  This typically would be used when a person provides the name(s) or when the device represents one of the names available from DeviceDefinition.
     */
    val deviceName: MutableList<DeviceDeviceNameComponent>? = null,


    /**
     * The model number for the device.
     */
    val modelNumber: String? = null,


    /**
     * The part number of the device.
     */
    val partNumber: String? = null,


    /**
     * The kind or type of device.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/device-type")
     */
    val type: CodeableConcept? = null,


    /**
     * The capabilities supported on a device, the standards to which the device conforms for a particular purpose, and used for the communication.
     */
    val specialization: MutableList<DeviceSpecializationComponent>? = null,

    
    /**
     * The actual design of the device or software version running on the device.
     */
    val version: MutableList<DeviceVersionComponent>? = null,

    
    /**
     * The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
     */
    val property: MutableList<DevicePropertyComponent>? = null,

    
    /**
     * Patient information, If the device is affixed to a person.
     */
    val patient: Reference? = null,

    
    /**
     * An organization that is responsible for the provision and ongoing maintenance of the device.
     */
    val owner: Reference? = null,

    
    /**
     * Contact details for an organization or a particular human that is responsible for the device.
     */
    val contact: MutableList<ContactPoint>? = null,

    
    /**
     * The place where the device can be found.
     */
    val location: Reference? = null,

    
    /**
     * A network address on which the device may be contacted directly.
     */
    val url: String? = null,

    
    /**
     * Descriptive information, usage information or implantation information that is not captured in an existing element.
     */
    val note: MutableList<Annotation>? = null,


    /**
     * Provides additional safety characteristics about a medical device.  For example devices containing latex.
     */
    val safety: MutableList<CodeableConcept>? = null,


    /**
     * The parent device.
     */
    val parent: Reference? = null


) : DomainResource



@Serializable
data class DeviceUdiCarrierComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * The device identifier (DI) is a mandatory, fixed portion of a UDI that identifies the labeler and the specific version or model of a device.
     */
    val deviceIdentifier: String? = null,


    /**
     * Organization that is charged with issuing UDIs for devices.  For example, the US FDA issuers include :
     * 1) GS1:
     * http://hl7.org/fhir/NamingSystem/gs1-di,
     * 2) HIBCC:
     * http://hl7.org/fhir/NamingSystem/hibcc-dI,
     * 3) ICCBBA for blood containers:
     * http://hl7.org/fhir/NamingSystem/iccbba-blood-di,
     * 4) ICCBA for other devices:
     * http://hl7.org/fhir/NamingSystem/iccbba-other-di.
     */
    val issuer: String? = null,


    /**
     * The identity of the authoritative source for UDI generation within a  jurisdiction.  All UDIs are globally unique within a single namespace with the appropriate repository uri as the system.  For example,  UDIs of devices managed in the U.S. by the FDA, the value is  http://hl7.org/fhir/NamingSystem/fda-udi.
     */
    val jurisdiction: String? = null,


    /**
     * The full UDI carrier of the Automatic Identification and Data Capture (AIDC) technology representation of the barcode string as printed on the packaging of the device - e.g., a barcode or RFID.   Because of limitations on character sets in XML and the need to round-trip JSON data through XML, AIDC Formats *SHALL* be base64 encoded.
     */
    val carrierAIDC: String? = null,


    /**
     * The full UDI carrier as the human readable form (HRF) representation of the barcode string as printed on the packaging of the device.
     */
    val carrierHRF: String? = null,


    /**
     * A coded entry to indicate how the data was entered.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/udi-entry-type")
     */
    val entryType: UDIEntryType? = null

) : BackboneElement



@Serializable
data class DeviceDeviceNameComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================


    /**
     * The name of the device.
     */
    val name: String? = null,


    /**
     * The type of deviceName.
     * UDILabelName | UserFriendlyName | PatientReportedName | ManufactureDeviceName | ModelName.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/device-nametype")
     */
    val type: DeviceNameType? = null

) : BackboneElement



@Serializable
data class DeviceSpecializationComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================


    /**
     * The standard that is used to operate and communicate.
     */
    val systemType: CodeableConcept? = null,


    /**
     * The version of the standard that is used to operate and communicate.
     */
    val version: String? = null

) : BackboneElement



@Serializable
data class DeviceVersionComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================


    /**
     * The type of the device version.
     */
    val type: CodeableConcept? = null,


    /**
     * A single component of the device version.
     */
    val component: Identifier? = null,


    /**
     * The version text.
     */
    val value: String? = null

) : BackboneElement



@Serializable
data class DevicePropertyComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================


    /**
     * Code that specifies the property DeviceDefinitionPropertyCode (Extensible).
     */
    val type: CodeableConcept? = null,


    /**
     * Property value as a quantity.
     */
    val valueQuantity: MutableList<Quantity>? = null,


    /**
     * Property value as a code, e.g., NTP4 (synced to NTP).
     */
    val valueCode: MutableList<CodeableConcept>? = null

) : BackboneElement



@Serializable
enum class UDIEntryType: CodeableEnumeration {

    /**
     * a barcodescanner captured the data from the device label.
     */
    @SerialName("barcode")
    @JsonProperty("barcode")
    BARCODE,

    /**
     * An RFID chip reader captured the data from the device label.
     */
    @SerialName("rfid")
    @JsonProperty("rfid")
    RFID,

    /**
     * The data was read from the label by a person and manually entered. (e.g.  via a keyboard).
     */
    @SerialName("manual")
    @JsonProperty("manual")
    MANUAL,

    /**
     * The data originated from a patient's implant card and was read by an operator.
     */
    @SerialName("card")
    @JsonProperty("card")
    CARD,

    /**
     * The data originated from a patient source and was not directly scanned or read from a label or card.
     */
    @SerialName("self-reported")
    @JsonProperty("self-reported")
    SELFREPORTED,

    /**
     * The method of data capture has not been determined.
     */
    @SerialName("unknown")
    @JsonProperty("unknown")
    UNKNOWN;


    override val code: String
        get() = when (this) {
            BARCODE -> "barcode"
            RFID -> "rfid"
            MANUAL -> "manual"
            CARD -> "card"
            SELFREPORTED -> "self-reported"
            UNKNOWN -> "unknown"
        }


    override val system: String
        get() = "http://hl7.org/fhir/udi-entry-type"


    override val definition: String?
        get() = when (this) {
            BARCODE -> "a barcodescanner captured the data from the device label."
            RFID -> "An RFID chip reader captured the data from the device label."
            MANUAL -> "The data was read from the label by a person and manually entered. (e.g.  via a keyboard)."
            CARD -> "The data originated from a patient's implant card and was read by an operator."
            SELFREPORTED -> "The data originated from a patient source and was not directly scanned or read from a label or card."
            UNKNOWN -> "The method of data capture has not been determined."
        }


    override val display: String?
        get() = when (this) {
            BARCODE -> "Barcode"
            RFID -> "RFID"
            MANUAL -> "Manual"
            CARD -> "Card"
            SELFREPORTED -> "Self Reported"
            UNKNOWN -> "Unknown"
        }

}


@Serializable
enum class FHIRDeviceStatus: CodeableEnumeration {

    /**
     * The device is available for use.  Note: For *implanted devices*  this means that the device is implanted in the patient.
     */
    @SerialName("active")
    @JsonProperty("active")
    ACTIVE,

    /**
     * The device is no longer available for use (e.g. lost, expired, damaged).  Note: For *implanted devices*  this means that the device has been removed from the patient.
     */
    @SerialName("inactive")
    @JsonProperty("inactive")
    INACTIVE,

    /**
     * The device was entered in error and voided.
     */
    @SerialName("entered-in-error")
    @JsonProperty("entered-in-error")
    ENTEREDINERROR,

    /**
     * The status of the device has not been determined.
     */
    @SerialName("unknown")
    @JsonProperty("unknown")
    UNKNOWN;


    override val code: String
        get() = when (this) {
            ACTIVE -> "active"
            INACTIVE -> "inactive"
            ENTEREDINERROR -> "entered-in-error"
            UNKNOWN -> "unknown"
        }


    override val system: String
        get() = "http://hl7.org/fhir/device-status"


    override val definition: String?
        get() = when (this) {
            ACTIVE -> "The device is available for use.  Note: For *implanted devices*  this means that the device is implanted in the patient."
            INACTIVE -> "The device is no longer available for use (e.g. lost, expired, damaged).  Note: For *implanted devices*  this means that the device has been removed from the patient."
            ENTEREDINERROR -> "The device was entered in error and voided."
            UNKNOWN -> "The status of the device has not been determined."
        }


    override val display: String?
        get() = when (this) {
            ACTIVE -> "Active"
            INACTIVE -> "Inactive"
            ENTEREDINERROR -> "Entered in Error"
            UNKNOWN -> "Unknown"
        }

}


@Serializable
enum class DeviceNameType : CodeableEnumeration {

    /**
     * UDI Label name.
     */
    @SerialName("udi-label-name")
    @JsonProperty("udi-label-name")
    UDILABELNAME,

    /**
     * User Friendly name.
     */
    @SerialName("user-friendly-name")
    @JsonProperty("user-friendly-name")
    USERFRIENDLYNAME,

    /**
     * Patient Reported name.
     */
    @SerialName("patient-reported-name")
    @JsonProperty("patient-reported-name")
    PATIENTREPORTEDNAME,

    /**
     * Manufacturer name.
     */
    @SerialName("manufacturer-name")
    @JsonProperty("manufacturer-name")
    MANUFACTURERNAME,

    /**
     * Model name.
     */
    @SerialName("model-name")
    @JsonProperty("model-name")
    MODELNAME,

    /**
     * other.
     */
    @SerialName("other")
    @JsonProperty("other")
    OTHER;



    override val code: String
        get() = when (this) {
            UDILABELNAME -> "udi-label-name"
            USERFRIENDLYNAME -> "user-friendly-name"
            PATIENTREPORTEDNAME -> "patient-reported-name"
            MANUFACTURERNAME -> "manufacturer-name"
            MODELNAME -> "model-name"
            OTHER -> "other"
        }


    override val system: String
        get() = "http://hl7.org/fhir/device-nametype"


    override val definition: String?
        get() = display


    override val display: String?
        get() = when (this) {
            UDILABELNAME -> "UDI Label name"
            USERFRIENDLYNAME -> "User Friendly name"
            PATIENTREPORTEDNAME -> "Patient Reported name"
            MANUFACTURERNAME -> "Manufacturer name"
            MODELNAME -> "Model name"
            OTHER -> "other"
        }

}

