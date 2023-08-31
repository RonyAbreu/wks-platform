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
 * CaseAttribute
 */
@JsonPropertyOrder({ CaseAttribute.JSON_PROPERTY_NAME, CaseAttribute.JSON_PROPERTY_VALUE,
		CaseAttribute.JSON_PROPERTY_TYPE })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T12:12:09.236578+01:00[Europe/Dublin]")
public class CaseAttribute {
	public static final String JSON_PROPERTY_NAME = "name";
	private String name;

	public static final String JSON_PROPERTY_VALUE = "value";
	private String value;

	public static final String JSON_PROPERTY_TYPE = "type";
	private String type;

	public CaseAttribute() {
	}

	public CaseAttribute name(String name) {

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

	public CaseAttribute value(String value) {

		this.value = value;
		return this;
	}

	/**
	 * Get value
	 *
	 * @return value
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_VALUE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getValue() {
		return value;
	}

	@JsonProperty(JSON_PROPERTY_VALUE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setValue(String value) {
		this.value = value;
	}

	public CaseAttribute type(String type) {

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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CaseAttribute caseAttribute = (CaseAttribute) o;
		return Objects.equals(this.name, caseAttribute.name) && Objects.equals(this.value, caseAttribute.value)
				&& Objects.equals(this.type, caseAttribute.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, value, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CaseAttribute {\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
