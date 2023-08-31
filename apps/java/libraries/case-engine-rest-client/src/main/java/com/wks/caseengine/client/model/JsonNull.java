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

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * JsonNull
 */
@JsonPropertyOrder({ JsonNull.JSON_PROPERTY_AS_BOOLEAN, JsonNull.JSON_PROPERTY_AS_DOUBLE, JsonNull.JSON_PROPERTY_AS_INT,
		JsonNull.JSON_PROPERTY_AS_LONG, JsonNull.JSON_PROPERTY_JSON_ARRAY, JsonNull.JSON_PROPERTY_JSON_OBJECT,
		JsonNull.JSON_PROPERTY_JSON_PRIMITIVE, JsonNull.JSON_PROPERTY_AS_JSON_NULL, JsonNull.JSON_PROPERTY_AS_NUMBER,
		JsonNull.JSON_PROPERTY_AS_CHARACTER, JsonNull.JSON_PROPERTY_AS_BIG_DECIMAL,
		JsonNull.JSON_PROPERTY_AS_BIG_INTEGER, JsonNull.JSON_PROPERTY_AS_JSON_PRIMITIVE,
		JsonNull.JSON_PROPERTY_AS_JSON_OBJECT, JsonNull.JSON_PROPERTY_AS_STRING, JsonNull.JSON_PROPERTY_AS_JSON_ARRAY,
		JsonNull.JSON_PROPERTY_JSON_NULL, JsonNull.JSON_PROPERTY_AS_FLOAT, JsonNull.JSON_PROPERTY_AS_BYTE,
		JsonNull.JSON_PROPERTY_AS_SHORT })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T12:12:09.236578+01:00[Europe/Dublin]")
public class JsonNull {
	public static final String JSON_PROPERTY_AS_BOOLEAN = "asBoolean";
	private Boolean asBoolean;

	public static final String JSON_PROPERTY_AS_DOUBLE = "asDouble";
	private Double asDouble;

	public static final String JSON_PROPERTY_AS_INT = "asInt";
	private Integer asInt;

	public static final String JSON_PROPERTY_AS_LONG = "asLong";
	private Long asLong;

	public static final String JSON_PROPERTY_JSON_ARRAY = "jsonArray";
	private Boolean jsonArray;

	public static final String JSON_PROPERTY_JSON_OBJECT = "jsonObject";
	private Boolean jsonObject;

	public static final String JSON_PROPERTY_JSON_PRIMITIVE = "jsonPrimitive";
	private Boolean jsonPrimitive;

	public static final String JSON_PROPERTY_AS_JSON_NULL = "asJsonNull";
	private JsonNull asJsonNull;

	public static final String JSON_PROPERTY_AS_NUMBER = "asNumber";
	private BigDecimal asNumber;

	public static final String JSON_PROPERTY_AS_CHARACTER = "asCharacter";
	private String asCharacter;

	public static final String JSON_PROPERTY_AS_BIG_DECIMAL = "asBigDecimal";
	private BigDecimal asBigDecimal;

	public static final String JSON_PROPERTY_AS_BIG_INTEGER = "asBigInteger";
	private Integer asBigInteger;

	public static final String JSON_PROPERTY_AS_JSON_PRIMITIVE = "asJsonPrimitive";
	private JsonPrimitive asJsonPrimitive;

	public static final String JSON_PROPERTY_AS_JSON_OBJECT = "asJsonObject";
	private JsonObject asJsonObject;

	public static final String JSON_PROPERTY_AS_STRING = "asString";
	private String asString;

	public static final String JSON_PROPERTY_AS_JSON_ARRAY = "asJsonArray";
	private JsonArray asJsonArray;

	public static final String JSON_PROPERTY_JSON_NULL = "jsonNull";
	private Boolean jsonNull;

	public static final String JSON_PROPERTY_AS_FLOAT = "asFloat";
	private Float asFloat;

	public static final String JSON_PROPERTY_AS_BYTE = "asByte";
	private byte[] asByte;

	public static final String JSON_PROPERTY_AS_SHORT = "asShort";
	private Integer asShort;

	public JsonNull() {
	}

	public JsonNull asBoolean(Boolean asBoolean) {

		this.asBoolean = asBoolean;
		return this;
	}

	/**
	 * Get asBoolean
	 *
	 * @return asBoolean
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_BOOLEAN)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getAsBoolean() {
		return asBoolean;
	}

	@JsonProperty(JSON_PROPERTY_AS_BOOLEAN)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsBoolean(Boolean asBoolean) {
		this.asBoolean = asBoolean;
	}

	public JsonNull asDouble(Double asDouble) {

		this.asDouble = asDouble;
		return this;
	}

	/**
	 * Get asDouble
	 *
	 * @return asDouble
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_DOUBLE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Double getAsDouble() {
		return asDouble;
	}

	@JsonProperty(JSON_PROPERTY_AS_DOUBLE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsDouble(Double asDouble) {
		this.asDouble = asDouble;
	}

	public JsonNull asInt(Integer asInt) {

		this.asInt = asInt;
		return this;
	}

	/**
	 * Get asInt
	 *
	 * @return asInt
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_INT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Integer getAsInt() {
		return asInt;
	}

	@JsonProperty(JSON_PROPERTY_AS_INT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsInt(Integer asInt) {
		this.asInt = asInt;
	}

	public JsonNull asLong(Long asLong) {

		this.asLong = asLong;
		return this;
	}

	/**
	 * Get asLong
	 *
	 * @return asLong
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_LONG)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Long getAsLong() {
		return asLong;
	}

	@JsonProperty(JSON_PROPERTY_AS_LONG)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsLong(Long asLong) {
		this.asLong = asLong;
	}

	public JsonNull jsonArray(Boolean jsonArray) {

		this.jsonArray = jsonArray;
		return this;
	}

	/**
	 * Get jsonArray
	 *
	 * @return jsonArray
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_JSON_ARRAY)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getJsonArray() {
		return jsonArray;
	}

	@JsonProperty(JSON_PROPERTY_JSON_ARRAY)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setJsonArray(Boolean jsonArray) {
		this.jsonArray = jsonArray;
	}

	public JsonNull jsonObject(Boolean jsonObject) {

		this.jsonObject = jsonObject;
		return this;
	}

	/**
	 * Get jsonObject
	 *
	 * @return jsonObject
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_JSON_OBJECT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getJsonObject() {
		return jsonObject;
	}

	@JsonProperty(JSON_PROPERTY_JSON_OBJECT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setJsonObject(Boolean jsonObject) {
		this.jsonObject = jsonObject;
	}

	public JsonNull jsonPrimitive(Boolean jsonPrimitive) {

		this.jsonPrimitive = jsonPrimitive;
		return this;
	}

	/**
	 * Get jsonPrimitive
	 *
	 * @return jsonPrimitive
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_JSON_PRIMITIVE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getJsonPrimitive() {
		return jsonPrimitive;
	}

	@JsonProperty(JSON_PROPERTY_JSON_PRIMITIVE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setJsonPrimitive(Boolean jsonPrimitive) {
		this.jsonPrimitive = jsonPrimitive;
	}

	public JsonNull asJsonNull(JsonNull asJsonNull) {

		this.asJsonNull = asJsonNull;
		return this;
	}

	/**
	 * Get asJsonNull
	 *
	 * @return asJsonNull
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_JSON_NULL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public JsonNull getAsJsonNull() {
		return asJsonNull;
	}

	@JsonProperty(JSON_PROPERTY_AS_JSON_NULL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsJsonNull(JsonNull asJsonNull) {
		this.asJsonNull = asJsonNull;
	}

	public JsonNull asNumber(BigDecimal asNumber) {

		this.asNumber = asNumber;
		return this;
	}

	/**
	 * Get asNumber
	 *
	 * @return asNumber
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_NUMBER)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public BigDecimal getAsNumber() {
		return asNumber;
	}

	@JsonProperty(JSON_PROPERTY_AS_NUMBER)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsNumber(BigDecimal asNumber) {
		this.asNumber = asNumber;
	}

	public JsonNull asCharacter(String asCharacter) {

		this.asCharacter = asCharacter;
		return this;
	}

	/**
	 * Get asCharacter
	 *
	 * @return asCharacter
	 * @deprecated
	 **/
	@Deprecated
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_CHARACTER)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getAsCharacter() {
		return asCharacter;
	}

	@JsonProperty(JSON_PROPERTY_AS_CHARACTER)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsCharacter(String asCharacter) {
		this.asCharacter = asCharacter;
	}

	public JsonNull asBigDecimal(BigDecimal asBigDecimal) {

		this.asBigDecimal = asBigDecimal;
		return this;
	}

	/**
	 * Get asBigDecimal
	 *
	 * @return asBigDecimal
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_BIG_DECIMAL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public BigDecimal getAsBigDecimal() {
		return asBigDecimal;
	}

	@JsonProperty(JSON_PROPERTY_AS_BIG_DECIMAL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsBigDecimal(BigDecimal asBigDecimal) {
		this.asBigDecimal = asBigDecimal;
	}

	public JsonNull asBigInteger(Integer asBigInteger) {

		this.asBigInteger = asBigInteger;
		return this;
	}

	/**
	 * Get asBigInteger
	 *
	 * @return asBigInteger
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_BIG_INTEGER)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Integer getAsBigInteger() {
		return asBigInteger;
	}

	@JsonProperty(JSON_PROPERTY_AS_BIG_INTEGER)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsBigInteger(Integer asBigInteger) {
		this.asBigInteger = asBigInteger;
	}

	public JsonNull asJsonPrimitive(JsonPrimitive asJsonPrimitive) {

		this.asJsonPrimitive = asJsonPrimitive;
		return this;
	}

	/**
	 * Get asJsonPrimitive
	 *
	 * @return asJsonPrimitive
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_JSON_PRIMITIVE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public JsonPrimitive getAsJsonPrimitive() {
		return asJsonPrimitive;
	}

	@JsonProperty(JSON_PROPERTY_AS_JSON_PRIMITIVE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsJsonPrimitive(JsonPrimitive asJsonPrimitive) {
		this.asJsonPrimitive = asJsonPrimitive;
	}

	public JsonNull asJsonObject(JsonObject asJsonObject) {

		this.asJsonObject = asJsonObject;
		return this;
	}

	/**
	 * Get asJsonObject
	 *
	 * @return asJsonObject
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_JSON_OBJECT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public JsonObject getAsJsonObject() {
		return asJsonObject;
	}

	@JsonProperty(JSON_PROPERTY_AS_JSON_OBJECT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsJsonObject(JsonObject asJsonObject) {
		this.asJsonObject = asJsonObject;
	}

	public JsonNull asString(String asString) {

		this.asString = asString;
		return this;
	}

	/**
	 * Get asString
	 *
	 * @return asString
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_STRING)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getAsString() {
		return asString;
	}

	@JsonProperty(JSON_PROPERTY_AS_STRING)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsString(String asString) {
		this.asString = asString;
	}

	public JsonNull asJsonArray(JsonArray asJsonArray) {

		this.asJsonArray = asJsonArray;
		return this;
	}

	/**
	 * Get asJsonArray
	 *
	 * @return asJsonArray
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_JSON_ARRAY)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public JsonArray getAsJsonArray() {
		return asJsonArray;
	}

	@JsonProperty(JSON_PROPERTY_AS_JSON_ARRAY)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsJsonArray(JsonArray asJsonArray) {
		this.asJsonArray = asJsonArray;
	}

	public JsonNull jsonNull(Boolean jsonNull) {

		this.jsonNull = jsonNull;
		return this;
	}

	/**
	 * Get jsonNull
	 *
	 * @return jsonNull
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_JSON_NULL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getJsonNull() {
		return jsonNull;
	}

	@JsonProperty(JSON_PROPERTY_JSON_NULL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setJsonNull(Boolean jsonNull) {
		this.jsonNull = jsonNull;
	}

	public JsonNull asFloat(Float asFloat) {

		this.asFloat = asFloat;
		return this;
	}

	/**
	 * Get asFloat
	 *
	 * @return asFloat
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_FLOAT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Float getAsFloat() {
		return asFloat;
	}

	@JsonProperty(JSON_PROPERTY_AS_FLOAT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsFloat(Float asFloat) {
		this.asFloat = asFloat;
	}

	public JsonNull asByte(byte[] asByte) {

		this.asByte = asByte;
		return this;
	}

	/**
	 * Get asByte
	 *
	 * @return asByte
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_BYTE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public byte[] getAsByte() {
		return asByte;
	}

	@JsonProperty(JSON_PROPERTY_AS_BYTE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsByte(byte[] asByte) {
		this.asByte = asByte;
	}

	public JsonNull asShort(Integer asShort) {

		this.asShort = asShort;
		return this;
	}

	/**
	 * Get asShort
	 *
	 * @return asShort
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_AS_SHORT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Integer getAsShort() {
		return asShort;
	}

	@JsonProperty(JSON_PROPERTY_AS_SHORT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setAsShort(Integer asShort) {
		this.asShort = asShort;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JsonNull jsonNull = (JsonNull) o;
		return Objects.equals(this.asBoolean, jsonNull.asBoolean) && Objects.equals(this.asDouble, jsonNull.asDouble)
				&& Objects.equals(this.asInt, jsonNull.asInt) && Objects.equals(this.asLong, jsonNull.asLong)
				&& Objects.equals(this.jsonArray, jsonNull.jsonArray)
				&& Objects.equals(this.jsonObject, jsonNull.jsonObject)
				&& Objects.equals(this.jsonPrimitive, jsonNull.jsonPrimitive)
				&& Objects.equals(this.asJsonNull, jsonNull.asJsonNull)
				&& Objects.equals(this.asNumber, jsonNull.asNumber)
				&& Objects.equals(this.asCharacter, jsonNull.asCharacter)
				&& Objects.equals(this.asBigDecimal, jsonNull.asBigDecimal)
				&& Objects.equals(this.asBigInteger, jsonNull.asBigInteger)
				&& Objects.equals(this.asJsonPrimitive, jsonNull.asJsonPrimitive)
				&& Objects.equals(this.asJsonObject, jsonNull.asJsonObject)
				&& Objects.equals(this.asString, jsonNull.asString)
				&& Objects.equals(this.asJsonArray, jsonNull.asJsonArray)
				&& Objects.equals(this.jsonNull, jsonNull.jsonNull) && Objects.equals(this.asFloat, jsonNull.asFloat)
				&& Arrays.equals(this.asByte, jsonNull.asByte) && Objects.equals(this.asShort, jsonNull.asShort);
	}

	@Override
	public int hashCode() {
		return Objects.hash(asBoolean, asDouble, asInt, asLong, jsonArray, jsonObject, jsonPrimitive, asJsonNull,
				asNumber, asCharacter, asBigDecimal, asBigInteger, asJsonPrimitive, asJsonObject, asString, asJsonArray,
				jsonNull, asFloat, Arrays.hashCode(asByte), asShort);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JsonNull {\n");
		sb.append("    asBoolean: ").append(toIndentedString(asBoolean)).append("\n");
		sb.append("    asDouble: ").append(toIndentedString(asDouble)).append("\n");
		sb.append("    asInt: ").append(toIndentedString(asInt)).append("\n");
		sb.append("    asLong: ").append(toIndentedString(asLong)).append("\n");
		sb.append("    jsonArray: ").append(toIndentedString(jsonArray)).append("\n");
		sb.append("    jsonObject: ").append(toIndentedString(jsonObject)).append("\n");
		sb.append("    jsonPrimitive: ").append(toIndentedString(jsonPrimitive)).append("\n");
		sb.append("    asJsonNull: ").append(toIndentedString(asJsonNull)).append("\n");
		sb.append("    asNumber: ").append(toIndentedString(asNumber)).append("\n");
		sb.append("    asCharacter: ").append(toIndentedString(asCharacter)).append("\n");
		sb.append("    asBigDecimal: ").append(toIndentedString(asBigDecimal)).append("\n");
		sb.append("    asBigInteger: ").append(toIndentedString(asBigInteger)).append("\n");
		sb.append("    asJsonPrimitive: ").append(toIndentedString(asJsonPrimitive)).append("\n");
		sb.append("    asJsonObject: ").append(toIndentedString(asJsonObject)).append("\n");
		sb.append("    asString: ").append(toIndentedString(asString)).append("\n");
		sb.append("    asJsonArray: ").append(toIndentedString(asJsonArray)).append("\n");
		sb.append("    jsonNull: ").append(toIndentedString(jsonNull)).append("\n");
		sb.append("    asFloat: ").append(toIndentedString(asFloat)).append("\n");
		sb.append("    asByte: ").append(toIndentedString(asByte)).append("\n");
		sb.append("    asShort: ").append(toIndentedString(asShort)).append("\n");
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
