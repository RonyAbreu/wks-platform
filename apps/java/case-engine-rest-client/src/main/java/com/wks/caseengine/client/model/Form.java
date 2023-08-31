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
 * Form
 */
@JsonPropertyOrder({ Form.JSON_PROPERTY_KEY, Form.JSON_PROPERTY_TITLE, Form.JSON_PROPERTY_TOOL_TIP,
		Form.JSON_PROPERTY_STRUCTURE })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T12:12:09.236578+01:00[Europe/Dublin]")
public class Form {
	public static final String JSON_PROPERTY_KEY = "key";
	private String key;

	public static final String JSON_PROPERTY_TITLE = "title";
	private String title;

	public static final String JSON_PROPERTY_TOOL_TIP = "toolTip";
	private String toolTip;

	public static final String JSON_PROPERTY_STRUCTURE = "structure";
	private JsonObject structure;

	public Form() {
	}

	public Form key(String key) {

		this.key = key;
		return this;
	}

	/**
	 * Get key
	 *
	 * @return key
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_KEY)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getKey() {
		return key;
	}

	@JsonProperty(JSON_PROPERTY_KEY)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setKey(String key) {
		this.key = key;
	}

	public Form title(String title) {

		this.title = title;
		return this;
	}

	/**
	 * Get title
	 *
	 * @return title
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_TITLE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getTitle() {
		return title;
	}

	@JsonProperty(JSON_PROPERTY_TITLE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setTitle(String title) {
		this.title = title;
	}

	public Form toolTip(String toolTip) {

		this.toolTip = toolTip;
		return this;
	}

	/**
	 * Get toolTip
	 *
	 * @return toolTip
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_TOOL_TIP)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getToolTip() {
		return toolTip;
	}

	@JsonProperty(JSON_PROPERTY_TOOL_TIP)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setToolTip(String toolTip) {
		this.toolTip = toolTip;
	}

	public Form structure(JsonObject structure) {

		this.structure = structure;
		return this;
	}

	/**
	 * Get structure
	 *
	 * @return structure
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_STRUCTURE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public JsonObject getStructure() {
		return structure;
	}

	@JsonProperty(JSON_PROPERTY_STRUCTURE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setStructure(JsonObject structure) {
		this.structure = structure;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Form form = (Form) o;
		return Objects.equals(this.key, form.key) && Objects.equals(this.title, form.title)
				&& Objects.equals(this.toolTip, form.toolTip) && Objects.equals(this.structure, form.structure);
	}

	@Override
	public int hashCode() {
		return Objects.hash(key, title, toolTip, structure);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Form {\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    toolTip: ").append(toIndentedString(toolTip)).append("\n");
		sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
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
