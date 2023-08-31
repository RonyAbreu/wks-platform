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
 * CaseDocument
 */
@JsonPropertyOrder({ CaseDocument.JSON_PROPERTY_NAME, CaseDocument.JSON_PROPERTY_TYPE, CaseDocument.JSON_PROPERTY_SIZE,
		CaseDocument.JSON_PROPERTY_BASE64 })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T12:12:09.236578+01:00[Europe/Dublin]")
public class CaseDocument {
	public static final String JSON_PROPERTY_NAME = "name";
	private String name;

	public static final String JSON_PROPERTY_TYPE = "type";
	private String type;

	public static final String JSON_PROPERTY_SIZE = "size";
	private String size;

	public static final String JSON_PROPERTY_BASE64 = "base64";
	private String base64;

	public CaseDocument() {
	}

	public CaseDocument name(String name) {

		this.name = name;
		return this;
	}

	/**
	 * Get name
	 *
	 * @return name
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_NAME)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getName() {
		return name;
	}

	@JsonProperty(JSON_PROPERTY_NAME)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setName(String name) {
		this.name = name;
	}

	public CaseDocument type(String type) {

		this.type = type;
		return this;
	}

	/**
	 * Get type
	 *
	 * @return type
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_TYPE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getType() {
		return type;
	}

	@JsonProperty(JSON_PROPERTY_TYPE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setType(String type) {
		this.type = type;
	}

	public CaseDocument size(String size) {

		this.size = size;
		return this;
	}

	/**
	 * Get size
	 *
	 * @return size
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_SIZE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getSize() {
		return size;
	}

	@JsonProperty(JSON_PROPERTY_SIZE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setSize(String size) {
		this.size = size;
	}

	public CaseDocument base64(String base64) {

		this.base64 = base64;
		return this;
	}

	/**
	 * Get base64
	 *
	 * @return base64
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_BASE64)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getBase64() {
		return base64;
	}

	@JsonProperty(JSON_PROPERTY_BASE64)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setBase64(String base64) {
		this.base64 = base64;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CaseDocument caseDocument = (CaseDocument) o;
		return Objects.equals(this.name, caseDocument.name) && Objects.equals(this.type, caseDocument.type)
				&& Objects.equals(this.size, caseDocument.size) && Objects.equals(this.base64, caseDocument.base64);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, type, size, base64);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CaseDocument {\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    base64: ").append(toIndentedString(base64)).append("\n");
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
