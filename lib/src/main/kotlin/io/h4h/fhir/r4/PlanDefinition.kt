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
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
 */
@Serializable
data class PlanDefinition(


    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override var id: String? = null,
    override var resourceType: ResourceType? = ResourceType.PlanDefinition,
    override var meta: Meta? = null,
    override var implicitRules: String? = null,
    override var language: String? = null,
    override var text: Narrative? = null,
    override var contained: List<Resource>? = null,
    override var extension: List<Extension>? = null,
    override var modifierExtension: List<Extension>? = null,


    /**
     * MetadataResource requirements
     */
    override var url: String? = null,
    override var version: String? = null,
    override var name: String? = null,
    override var title: String? = null,
    override var status: PublicationStatus? = null,
    override var experimental: Boolean? = null,
    override var date: String? = null,
    override var publisher: String? = null,
    override var contact: List<ContactDetail>? = null,
    override var description: String? = null,
    override var useContext: List<UsageContext>? = null,
    override var jurisdiction: List<CodeableConcept>? = null,
    // ============================================================
    // ============================================================

    /**
     * A formal identifier that is used to identify this plan definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
     */
    var identifier: List<Identifier>? = null,

    /**
     * An explanatory or alternate title for the plan definition giving additional information about its content.
     */
    var subtitle: String? = null,

    /**
     * A high-level category for the plan definition that distinguishes the kinds of systems that would be interested in the plan definition.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/plan-definition-type")
    var type: CodeableConcept? = null,

    /**
     * A code or group definition that describes the intended subject of the plan definition.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/subject-type")
    var subjectCodeableConcept: CodeableConcept? = null,
    var subjectReference: Reference? = null,

    /**
     * Explanation of why this plan definition is needed and why it has been designed as it has.
     */
    var purpose: String? = null,

    /**
     * A detailed description of how the plan definition is used from a clinical perspective.
     */
    var usage: String? = null,

    /**
     * A copyright statement relating to the plan definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the plan definition.
     */
    var copyright: String? = null,

    /**
     * The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
     */
    var approvalDate: String? = null,

    /**
     * The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
     */
    var lastReviewDate: String? = null,

    /**
     * The period during which the plan definition content was or is planned to be in active use.
     */
    var effectivePeriod: Period? = null,

    /**
     * Descriptive topics related to the content of the plan definition. Topics provide a high-level categorization of the definition that can be useful for filtering and searching.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/definition-topic")
    var topic: List<CodeableConcept>? = null,

    /**
     * An individiual or organization primarily involved in the creation and maintenance of the content.
     */
    var author: List<ContactDetail>? = null,

    /**
     * An individual or organization primarily responsible for internal coherence of the content.
     */
    var editor: List<ContactDetail>? = null,

    /**
     * An individual or organization primarily responsible for review of some aspect of the content.
     */
    var reviewer: List<ContactDetail>? = null,

    /**
     * An individual or organization responsible for officially endorsing the content for use in some setting.
     */
    var endorser: List<ContactDetail>? = null,

    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     */
    var relatedArtifact: List<RelatedArtifact>? = null,

    /**
     * A reference to a Library resource containing any formal logic used by the plan definition.
     */
    var library: List<String>? = null,

    /**
     * Goals that describe what the activities within the plan are intended to achieve. For example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
     */
    var goal: List<PlanDefinitionGoalComponent>? = null,

    /**
     * An action or group of actions to be taken as part of the plan.
     */
    var action: List<PlanDefinitionActionComponent>? = null

) : MetadataResource



@Serializable
data class PlanDefinitionGoalComponent(

    /**
     * Indicates a category the goal falls within.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/goal-category")
    var category: CodeableConcept? = null,

    /**
     * Human-readable and/or coded description of a specific desired objective of care, such as "control blood pressure" or "negotiate an obstacle course" or "dance with child at wedding".
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/clinical-findings")
    var description: CodeableConcept? = null,

    /**
     * Identifies the expected level of importance associated with reaching/sustaining the defined goal.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/goal-priority")
    var priority: CodeableConcept? = null,

    /**
     * The event after which the goal should begin being pursued.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/goal-start-event")
    var start: CodeableConcept? = null,

    /**
     * Identifies problems, conditions, issues, or concerns the goal is intended to address.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/condition-code")
    var addresses: List<CodeableConcept>? = null,

    /**
     * Didactic or other informational resources associated with the goal that provide further supporting information about the goal. Information resources can include inline text commentary and links to web resources.
     */
    var documentation: List<RelatedArtifact>? = null,

    /**
     * Indicates what should be done and within what timeframe.
     */
    var target: List<PlanDefinitionGoalTargetComponent>? = null

)


@Serializable
data class PlanDefinitionGoalTargetComponent(

    /**
     * The parameter whose value is to be tracked, e.g. body weight, blood pressure, or hemoglobin A1c level.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-codes")
    var measure: CodeableConcept? = null,

    /**
     * The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value.
     */
    var detailQuantity: Quantity? = null,
    var detailRange: Range? = null,
    var detailCodeableConcept: CodeableConcept? = null,

    /**
     * Indicates the timeframe after the start of the goal in which the goal should be met.
     */
    var due: Quantity? = null

)


@Serializable
data class PlanDefinitionActionComponent(

    /**
     * A user-visible prefix for the action.
     */
    var prefix: String? = null,

    /**
     * The title of the action displayed to a user.
     */
    var title: String? = null,

    /**
     * A brief description of the action used to provide a summary to display to the user.
     */
    var description: String? = null,

    /**
     * A text equivalent of the action to be performed. This provides a human-interpretable description of the action when the definition is consumed by a system that might not be capable of interpreting it dynamically.
     */
    var textEquivalent: String? = null,

    /**
     * Indicates how quickly the action should be addressed with respect to other actions.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/request-priority")
    var priority: RequestPriority? = null,

    /**
     * A code that provides meaning for the action or action group. For example, a section may have a LOINC code for the section of a documentation template.
     */
    var code: List<CodeableConcept>? = null,

    /**
     * A description of why this action is necessary or appropriate.
     */
    var reason: List<CodeableConcept>? = null,

    /**
     * Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources.
     */
    var documentation: List<RelatedArtifact>? = null,

    /**
     * Identifies goals that this action supports. The reference must be to a goal element defined within this plan definition.
     */
    var goalId: List<String>? = null,

    /**
     * A code or group definition that describes the intended subject of the action and its children, if any.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/subject-type")
    var subjectCodeableConcept: CodeableConcept? = null,
    var subjectReference: Reference? = null,

    /**
     * A description of when the action should be triggered.
     */
    var trigger: List<TriggerDefinition>? = null,

    /**
     * An expression that describes applicability criteria or start/stop conditions for the action.
     */
    var condition: List<PlanDefinitionActionConditionComponent>? = null,

    /**
     * Defines input data requirements for the action.
     */
    var input: List<DataRequirement>? = null,

    /**
     * Defines the outputs of the action, if any.
     */
    var output: List<DataRequirement>? = null,

    /**
     * A relationship to another action such as "before" or "30-60 minutes after start of".
     */
    var relatedAction: List<PlanDefinitionActionRelatedActionComponent>? = null,

    /**
     * An optional value describing when the action should be performed.
     */
    var timingDateTime: String? = null,
    var timingAge: Quantity? = null,
    var timingPeriod: Period? = null,
    var timingQuantity: Quantity? = null,
    var timingRange: Range? = null,
    var timingTiming: Timing? = null,

    /**
     * Indicates who should participate in performing the action described.
     */
    var participant: List<PlanDefinitionActionParticipantComponent>? = null,

    /**
     * The type of action to perform (create, update, remove).
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/action-type")
    var type: CodeableConcept? = null,

    /**
     * Defines the grouping behavior for the action and its children.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/action-grouping-behavior")
    var groupingBehavior: ActionGroupingBehavior? = null,

    /**
     * Defines the selection behavior for the action and its children.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/action-selection-behavior")
    var selectionBehavior: ActionSelectionBehavior? = null,

    /**
     * Defines the required behavior for the action.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/action-required-behavior")
    var requiredBehavior: ActionRequiredBehavior? = null,

    /**
     * Defines whether the action should usually be preselected.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/action-precheck-behavior")
    var precheckBehavior: ActionPrecheckBehavior? = null,

    /**
     * Defines whether the action can be selected multiple times.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/action-cardinality-behavior")
    var cardinalityBehavior: ActionCardinalityBehavior? = null,

    /**
     * A reference to an ActivityDefinition that describes the action to be taken in detail, or a PlanDefinition that describes a series of actions to be taken.
     */
    var definitionCanonical: String? = null,
    var definitionUri: String? = null,

    /**
     * A reference to a StructureMap resource that defines a transform that can be executed to produce the intent resource using the ActivityDefinition instance as the input.
     */
    var transform: String? = null,

    /**
     * Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result.
     */
    var dynamicValue: List<PlanDefinitionActionDynamicValueComponent>? = null,

    /**
     * Sub actions that are contained within the action. The behavior of this action determines the functionality of the sub-actions. For example, a selection behavior of at-most-one indicates that of the sub-actions, at most one may be chosen as part of realizing the action definition.
     */
    var action: List<PlanDefinitionActionComponent>? = null

)


@Serializable
data class PlanDefinitionActionConditionComponent(

    /**
     * The kind of condition.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/action-condition-kind")
    var kind: ActionConditionKind? = null,

    /**
     * An expression that returns true or false, indicating whether the condition is satisfied.
     */
    var expression: Expression? = null

)


@Serializable
data class PlanDefinitionActionRelatedActionComponent(

    /**
     * The element id of the related action.
     */
    var actionId: String? = null,

    /**
     * The relationship of this action to the related action.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/action-relationship-type")
    var relationship: ActionRelationshipType? = null,

    /**
     * A duration or range of durations to apply to the relationship. For example, 30-60 minutes before.
     */
    var offsetDuration: Quantity? = null,
    var offsetRange: Range? = null


)


@Serializable
data class PlanDefinitionActionParticipantComponent(
    /**
     * The type of participant in the action.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/action-participant-type")
    var type: ActionParticipantType? = null,

    /**
     * The role the participant should play in performing the described action.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/action-participant-role")
    var role: CodeableConcept? = null

)


@Serializable
data class PlanDefinitionActionDynamicValueComponent(

    /**
     * The path to the element to be customized. This is the path on the resource that will hold the result of the calculation defined by the expression. The specified path SHALL be a FHIRPath resolveable on the specified target type of the ActivityDefinition, and SHALL consist only of identifiers, constant indexers, and a restricted subset of functions. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements (see the [Simple FHIRPath Profile](fhirpath.html#simple) for full details).
     */
    var path: String? = null,

    /**
     * An expression specifying the value of the customized element.
     */
    var expression: Expression? = null

)