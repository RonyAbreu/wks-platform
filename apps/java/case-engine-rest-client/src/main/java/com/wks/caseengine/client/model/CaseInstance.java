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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CaseInstance
 */
@JsonPropertyOrder({ CaseInstance.JSON_PROPERTY_GET_ID, CaseInstance.JSON_PROPERTY_BUSINESS_KEY,
		CaseInstance.JSON_PROPERTY_CASE_DEFINITION_ID, CaseInstance.JSON_PROPERTY_STAGE,
		CaseInstance.JSON_PROPERTY_CASE_OWNER, CaseInstance.JSON_PROPERTY_CASE_OWNER_NAME,
		CaseInstance.JSON_PROPERTY_COMMENTS, CaseInstance.JSON_PROPERTY_DOCUMENTS,
		CaseInstance.JSON_PROPERTY_ATTRIBUTES, CaseInstance.JSON_PROPERTY_STATUS, CaseInstance.JSON_PROPERTY_ID })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T12:12:09.236578+01:00[Europe/Dublin]")
public class CaseInstance {
	public static final String JSON_PROPERTY_GET_ID = "get_id";
	private String getId;

	public static final String JSON_PROPERTY_BUSINESS_KEY = "businessKey";
	private String businessKey;

	public static final String JSON_PROPERTY_CASE_DEFINITION_ID = "caseDefinitionId";
	private String caseDefinitionId;

	public static final String JSON_PROPERTY_STAGE = "stage";
	private String stage;

	public static final String JSON_PROPERTY_CASE_OWNER = "caseOwner";
	private String caseOwner;

	public static final String JSON_PROPERTY_CASE_OWNER_NAME = "caseOwnerName";
	private String caseOwnerName;

	public static final String JSON_PROPERTY_COMMENTS = "comments";
	private List<Comment> comments;

	public static final String JSON_PROPERTY_DOCUMENTS = "documents";
	private List<CaseDocument> documents;

	public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
	private List<CaseAttribute> attributes;

	/**
	 * Gets or Sets status
	 */
	public enum StatusEnum {
		WIP_CASE_STATUS("WIP_CASE_STATUS"),

		CLOSED_CASE_STATUS("CLOSED_CASE_STATUS"),

		ARCHIVED_CASE_STATUS("ARCHIVED_CASE_STATUS");

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static StatusEnum fromValue(String value) {
			for (StatusEnum b : StatusEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}
	}

	public static final String JSON_PROPERTY_STATUS = "status";
	private StatusEnum status;

	public static final String JSON_PROPERTY_ID = "id";
	private String id;

	public CaseInstance() {
	}

	public CaseInstance getId(String getId) {

		this.getId = getId;
		return this;
	}

	/**
	 * Get getId
	 *
	 * @return getId
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_GET_ID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getGetId() {
		return getId;
	}

	@JsonProperty(JSON_PROPERTY_GET_ID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setGetId(String getId) {
		this.getId = getId;
	}

	public CaseInstance businessKey(String businessKey) {

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

	public CaseInstance caseDefinitionId(String caseDefinitionId) {

		this.caseDefinitionId = caseDefinitionId;
		return this;
	}

	/**
	 * Get caseDefinitionId
	 *
	 * @return caseDefinitionId
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_CASE_DEFINITION_ID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getCaseDefinitionId() {
		return caseDefinitionId;
	}

	@JsonProperty(JSON_PROPERTY_CASE_DEFINITION_ID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setCaseDefinitionId(String caseDefinitionId) {
		this.caseDefinitionId = caseDefinitionId;
	}

	public CaseInstance stage(String stage) {

		this.stage = stage;
		return this;
	}

	/**
	 * Get stage
	 *
	 * @return stage
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_STAGE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getStage() {
		return stage;
	}

	@JsonProperty(JSON_PROPERTY_STAGE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setStage(String stage) {
		this.stage = stage;
	}

	public CaseInstance caseOwner(String caseOwner) {

		this.caseOwner = caseOwner;
		return this;
	}

	/**
	 * Get caseOwner
	 *
	 * @return caseOwner
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_CASE_OWNER)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getCaseOwner() {
		return caseOwner;
	}

	@JsonProperty(JSON_PROPERTY_CASE_OWNER)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setCaseOwner(String caseOwner) {
		this.caseOwner = caseOwner;
	}

	public CaseInstance caseOwnerName(String caseOwnerName) {

		this.caseOwnerName = caseOwnerName;
		return this;
	}

	/**
	 * Get caseOwnerName
	 *
	 * @return caseOwnerName
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_CASE_OWNER_NAME)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getCaseOwnerName() {
		return caseOwnerName;
	}

	@JsonProperty(JSON_PROPERTY_CASE_OWNER_NAME)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setCaseOwnerName(String caseOwnerName) {
		this.caseOwnerName = caseOwnerName;
	}

	public CaseInstance comments(List<Comment> comments) {

		this.comments = comments;
		return this;
	}

	public CaseInstance addCommentsItem(Comment commentsItem) {
		if (this.comments == null) {
			this.comments = new ArrayList<>();
		}
		this.comments.add(commentsItem);
		return this;
	}

	/**
	 * Get comments
	 *
	 * @return comments
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_COMMENTS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public List<Comment> getComments() {
		return comments;
	}

	@JsonProperty(JSON_PROPERTY_COMMENTS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public CaseInstance documents(List<CaseDocument> documents) {

		this.documents = documents;
		return this;
	}

	public CaseInstance addDocumentsItem(CaseDocument documentsItem) {
		if (this.documents == null) {
			this.documents = new ArrayList<>();
		}
		this.documents.add(documentsItem);
		return this;
	}

	/**
	 * Get documents
	 *
	 * @return documents
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_DOCUMENTS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public List<CaseDocument> getDocuments() {
		return documents;
	}

	@JsonProperty(JSON_PROPERTY_DOCUMENTS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setDocuments(List<CaseDocument> documents) {
		this.documents = documents;
	}

	public CaseInstance attributes(List<CaseAttribute> attributes) {

		this.attributes = attributes;
		return this;
	}

	public CaseInstance addAttributesItem(CaseAttribute attributesItem) {
		if (this.attributes == null) {
			this.attributes = new ArrayList<>();
		}
		this.attributes.add(attributesItem);
		return this;
	}

	/**
	 * Get attributes
	 *
	 * @return attributes
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_ATTRIBUTES)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public List<CaseAttribute> getAttributes() {
		return attributes;
	}

	@JsonProperty(JSON_PROPERTY_ATTRIBUTES)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAttributes(List<CaseAttribute> attributes) {
		this.attributes = attributes;
	}

	public CaseInstance status(StatusEnum status) {

		this.status = status;
		return this;
	}

	/**
	 * Get status
	 *
	 * @return status
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_STATUS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public StatusEnum getStatus() {
		return status;
	}

	@JsonProperty(JSON_PROPERTY_STATUS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public CaseInstance id(String id) {

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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CaseInstance caseInstance = (CaseInstance) o;
		return Objects.equals(this.getId, caseInstance.getId)
				&& Objects.equals(this.businessKey, caseInstance.businessKey)
				&& Objects.equals(this.caseDefinitionId, caseInstance.caseDefinitionId)
				&& Objects.equals(this.stage, caseInstance.stage)
				&& Objects.equals(this.caseOwner, caseInstance.caseOwner)
				&& Objects.equals(this.caseOwnerName, caseInstance.caseOwnerName)
				&& Objects.equals(this.comments, caseInstance.comments)
				&& Objects.equals(this.documents, caseInstance.documents)
				&& Objects.equals(this.attributes, caseInstance.attributes)
				&& Objects.equals(this.status, caseInstance.status) && Objects.equals(this.id, caseInstance.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId, businessKey, caseDefinitionId, stage, caseOwner, caseOwnerName, comments, documents,
				attributes, status, id);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CaseInstance {\n");
		sb.append("    getId: ").append(toIndentedString(getId)).append("\n");
		sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
		sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
		sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
		sb.append("    caseOwner: ").append(toIndentedString(caseOwner)).append("\n");
		sb.append("    caseOwnerName: ").append(toIndentedString(caseOwnerName)).append("\n");
		sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
		sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
