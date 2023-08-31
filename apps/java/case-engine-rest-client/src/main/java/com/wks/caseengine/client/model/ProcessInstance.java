/*
 * WKS Platform - Open-Source Project
 * 
 * This file is part of the WKS Platform, an open-source project developed by WKS Power.
 * 
 * WKS Platform is licensed under the MIT License.
 * 
 * © 2021 WKS Power. All rights reserved.
 * 
 * For licensing information, see the LICENSE file in the root directory of the project.
 */

package com.wks.caseengine.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ProcessInstance
 */
@JsonPropertyOrder({ ProcessInstance.JSON_PROPERTY_ID, ProcessInstance.JSON_PROPERTY_BUSINESS_KEY,
		ProcessInstance.JSON_PROPERTY_DEFINITION_ID, ProcessInstance.JSON_PROPERTY_CASE_INSTANCE_ID,
		ProcessInstance.JSON_PROPERTY_ENDED, ProcessInstance.JSON_PROPERTY_SUSPENDED,
		ProcessInstance.JSON_PROPERTY_TENANT_ID, ProcessInstance.JSON_PROPERTY_VARIABLES })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T12:12:09.236578+01:00[Europe/Dublin]")
public class ProcessInstance {
	public static final String JSON_PROPERTY_ID = "id";
	private String id;

	public static final String JSON_PROPERTY_BUSINESS_KEY = "businessKey";
	private String businessKey;

	public static final String JSON_PROPERTY_DEFINITION_ID = "definitionId";
	private String definitionId;

	public static final String JSON_PROPERTY_CASE_INSTANCE_ID = "caseInstanceId";
	private String caseInstanceId;

	public static final String JSON_PROPERTY_ENDED = "ended";
	private Boolean ended;

	public static final String JSON_PROPERTY_SUSPENDED = "suspended";
	private Boolean suspended;

	public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
	private String tenantId;

	public static final String JSON_PROPERTY_VARIABLES = "variables";
	private JsonObject variables;

	public ProcessInstance() {
	}

	public ProcessInstance id(String id) {

		this.id = id;
		return this;
	}

	/**
	 * Get id
	 *
	 * @return id
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_ID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getId() {
		return id;
	}

	@JsonProperty(JSON_PROPERTY_ID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setId(String id) {
		this.id = id;
	}

	public ProcessInstance businessKey(String businessKey) {

		this.businessKey = businessKey;
		return this;
	}

	/**
	 * Get businessKey
	 *
	 * @return businessKey
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_BUSINESS_KEY)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getBusinessKey() {
		return businessKey;
	}

	@JsonProperty(JSON_PROPERTY_BUSINESS_KEY)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public ProcessInstance definitionId(String definitionId) {

		this.definitionId = definitionId;
		return this;
	}

	/**
	 * Get definitionId
	 *
	 * @return definitionId
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_DEFINITION_ID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getDefinitionId() {
		return definitionId;
	}

	@JsonProperty(JSON_PROPERTY_DEFINITION_ID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setDefinitionId(String definitionId) {
		this.definitionId = definitionId;
	}

	public ProcessInstance caseInstanceId(String caseInstanceId) {

		this.caseInstanceId = caseInstanceId;
		return this;
	}

	/**
	 * Get caseInstanceId
	 *
	 * @return caseInstanceId
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getCaseInstanceId() {
		return caseInstanceId;
	}

	@JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setCaseInstanceId(String caseInstanceId) {
		this.caseInstanceId = caseInstanceId;
	}

	public ProcessInstance ended(Boolean ended) {

		this.ended = ended;
		return this;
	}

	/**
	 * Get ended
	 *
	 * @return ended
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_ENDED)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getEnded() {
		return ended;
	}

	@JsonProperty(JSON_PROPERTY_ENDED)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setEnded(Boolean ended) {
		this.ended = ended;
	}

	public ProcessInstance suspended(Boolean suspended) {

		this.suspended = suspended;
		return this;
	}

	/**
	 * Get suspended
	 *
	 * @return suspended
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_SUSPENDED)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getSuspended() {
		return suspended;
	}

	@JsonProperty(JSON_PROPERTY_SUSPENDED)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setSuspended(Boolean suspended) {
		this.suspended = suspended;
	}

	public ProcessInstance tenantId(String tenantId) {

		this.tenantId = tenantId;
		return this;
	}

	/**
	 * Get tenantId
	 *
	 * @return tenantId
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_TENANT_ID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getTenantId() {
		return tenantId;
	}

	@JsonProperty(JSON_PROPERTY_TENANT_ID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public ProcessInstance variables(JsonObject variables) {

		this.variables = variables;
		return this;
	}

	/**
	 * Get variables
	 *
	 * @return variables
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_VARIABLES)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public JsonObject getVariables() {
		return variables;
	}

	@JsonProperty(JSON_PROPERTY_VARIABLES)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setVariables(JsonObject variables) {
		this.variables = variables;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProcessInstance processInstance = (ProcessInstance) o;
		return Objects.equals(this.id, processInstance.id)
				&& Objects.equals(this.businessKey, processInstance.businessKey)
				&& Objects.equals(this.definitionId, processInstance.definitionId)
				&& Objects.equals(this.caseInstanceId, processInstance.caseInstanceId)
				&& Objects.equals(this.ended, processInstance.ended)
				&& Objects.equals(this.suspended, processInstance.suspended)
				&& Objects.equals(this.tenantId, processInstance.tenantId)
				&& Objects.equals(this.variables, processInstance.variables);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, businessKey, definitionId, caseInstanceId, ended, suspended, tenantId, variables);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProcessInstance {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
		sb.append("    definitionId: ").append(toIndentedString(definitionId)).append("\n");
		sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
		sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
		sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
		sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
		sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
