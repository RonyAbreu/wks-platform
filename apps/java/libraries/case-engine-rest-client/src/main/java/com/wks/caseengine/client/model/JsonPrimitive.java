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
 * JsonPrimitive
 */
@JsonPropertyOrder({ JsonPrimitive.JSON_PROPERTY_AS_BOOLEAN, JsonPrimitive.JSON_PROPERTY_AS_DOUBLE,
		JsonPrimitive.JSON_PROPERTY_AS_INT, JsonPrimitive.JSON_PROPERTY_AS_LONG, JsonPrimitive.JSON_PROPERTY_AS_NUMBER,
		JsonPrimitive.JSON_PROPERTY_AS_CHARACTER, JsonPrimitive.JSON_PROPERTY_AS_BIG_DECIMAL,
		JsonPrimitive.JSON_PROPERTY_AS_BIG_INTEGER, JsonPrimitive.JSON_PROPERTY_AS_STRING,
		JsonPrimitive.JSON_PROPERTY_AS_FLOAT, JsonPrimitive.JSON_PROPERTY_AS_BYTE, JsonPrimitive.JSON_PROPERTY_AS_SHORT,
		JsonPrimitive.JSON_PROPERTY_BOOLEAN, JsonPrimitive.JSON_PROPERTY_NUMBER, JsonPrimitive.JSON_PROPERTY_STRING,
		JsonPrimitive.JSON_PROPERTY_JSON_ARRAY, JsonPrimitive.JSON_PROPERTY_JSON_OBJECT,
		JsonPrimitive.JSON_PROPERTY_JSON_PRIMITIVE, JsonPrimitive.JSON_PROPERTY_AS_JSON_NULL,
		JsonPrimitive.JSON_PROPERTY_AS_JSON_PRIMITIVE, JsonPrimitive.JSON_PROPERTY_AS_JSON_OBJECT,
		JsonPrimitive.JSON_PROPERTY_AS_JSON_ARRAY, JsonPrimitive.JSON_PROPERTY_JSON_NULL })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T12:12:09.236578+01:00[Europe/Dublin]")
public class JsonPrimitive {
	public static final String JSON_PROPERTY_AS_BOOLEAN = "asBoolean";
	private Boolean asBoolean;

	public static final String JSON_PROPERTY_AS_DOUBLE = "asDouble";
	private Double asDouble;

	public static final String JSON_PROPERTY_AS_INT = "asInt";
	private Integer asInt;

	public static final String JSON_PROPERTY_AS_LONG = "asLong";
	private Long asLong;

	public static final String JSON_PROPERTY_AS_NUMBER = "asNumber";
	private BigDecimal asNumber;

	public static final String JSON_PROPERTY_AS_CHARACTER = "asCharacter";
	private String asCharacter;

	public static final String JSON_PROPERTY_AS_BIG_DECIMAL = "asBigDecimal";
	private BigDecimal asBigDecimal;

	public static final String JSON_PROPERTY_AS_BIG_INTEGER = "asBigInteger";
	private Integer asBigInteger;

	public static final String JSON_PROPERTY_AS_STRING = "asString";
	private String asString;

	public static final String JSON_PROPERTY_AS_FLOAT = "asFloat";
	private Float asFloat;

	public static final String JSON_PROPERTY_AS_BYTE = "asByte";
	private byte[] asByte;

	public static final String JSON_PROPERTY_AS_SHORT = "asShort";
	private Integer asShort;

	public static final String JSON_PROPERTY_BOOLEAN = "boolean";
	private Boolean _boolean;

	public static final String JSON_PROPERTY_NUMBER = "number";
	private Boolean number;

	public static final String JSON_PROPERTY_STRING = "string";
	private Boolean string;

	public static final String JSON_PROPERTY_JSON_ARRAY = "jsonArray";
	private Boolean jsonArray;

	public static final String JSON_PROPERTY_JSON_OBJECT = "jsonObject";
	private Boolean jsonObject;

	public static final String JSON_PROPERTY_JSON_PRIMITIVE = "jsonPrimitive";
	private Boolean jsonPrimitive;

	public static final String JSON_PROPERTY_AS_JSON_NULL = "asJsonNull";
	private JsonNull asJsonNull;

	public static final String JSON_PROPERTY_AS_JSON_PRIMITIVE = "asJsonPrimitive";
	private JsonPrimitive asJsonPrimitive;

	public static final String JSON_PROPERTY_AS_JSON_OBJECT = "asJsonObject";
	private JsonObject asJsonObject;

	public static final String JSON_PROPERTY_AS_JSON_ARRAY = "asJsonArray";
	private JsonArray asJsonArray;

	public static final String JSON_PROPERTY_JSON_NULL = "jsonNull";
	private Boolean jsonNull;

	public JsonPrimitive() {
	}

	public JsonPrimitive asBoolean(Boolean asBoolean) {

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

	public JsonPrimitive asDouble(Double asDouble) {

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

	public JsonPrimitive asInt(Integer asInt) {

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

	public JsonPrimitive asLong(Long asLong) {

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

	public JsonPrimitive asNumber(BigDecimal asNumber) {

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

	public JsonPrimitive asCharacter(String asCharacter) {

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

	public JsonPrimitive asBigDecimal(BigDecimal asBigDecimal) {

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

	public JsonPrimitive asBigInteger(Integer asBigInteger) {

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

	public JsonPrimitive asString(String asString) {

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

	public JsonPrimitive asFloat(Float asFloat) {

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

	public JsonPrimitive asByte(byte[] asByte) {

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

	public JsonPrimitive asShort(Integer asShort) {

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

	public JsonPrimitive _boolean(Boolean _boolean) {

		this._boolean = _boolean;
		return this;
	}

	/**
	 * Get _boolean
	 *
	 * @return _boolean
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_BOOLEAN)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getBoolean() {
		return _boolean;
	}

	@JsonProperty(JSON_PROPERTY_BOOLEAN)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setBoolean(Boolean _boolean) {
		this._boolean = _boolean;
	}

	public JsonPrimitive number(Boolean number) {

		this.number = number;
		return this;
	}

	/**
	 * Get number
	 *
	 * @return number
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_NUMBER)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getNumber() {
		return number;
	}

	@JsonProperty(JSON_PROPERTY_NUMBER)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setNumber(Boolean number) {
		this.number = number;
	}

	public JsonPrimitive string(Boolean string) {

		this.string = string;
		return this;
	}

	/**
	 * Get string
	 *
	 * @return string
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_STRING)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getString() {
		return string;
	}

	@JsonProperty(JSON_PROPERTY_STRING)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setString(Boolean string) {
		this.string = string;
	}

	public JsonPrimitive jsonArray(Boolean jsonArray) {

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

	public JsonPrimitive jsonObject(Boolean jsonObject) {

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

	public JsonPrimitive jsonPrimitive(Boolean jsonPrimitive) {

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

	public JsonPrimitive asJsonNull(JsonNull asJsonNull) {

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

	public JsonPrimitive asJsonPrimitive(JsonPrimitive asJsonPrimitive) {

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

	public JsonPrimitive asJsonObject(JsonObject asJsonObject) {

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

	public JsonPrimitive asJsonArray(JsonArray asJsonArray) {

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

	public JsonPrimitive jsonNull(Boolean jsonNull) {

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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JsonPrimitive jsonPrimitive = (JsonPrimitive) o;
		return Objects.equals(this.asBoolean, jsonPrimitive.asBoolean)
				&& Objects.equals(this.asDouble, jsonPrimitive.asDouble)
				&& Objects.equals(this.asInt, jsonPrimitive.asInt) && Objects.equals(this.asLong, jsonPrimitive.asLong)
				&& Objects.equals(this.asNumber, jsonPrimitive.asNumber)
				&& Objects.equals(this.asCharacter, jsonPrimitive.asCharacter)
				&& Objects.equals(this.asBigDecimal, jsonPrimitive.asBigDecimal)
				&& Objects.equals(this.asBigInteger, jsonPrimitive.asBigInteger)
				&& Objects.equals(this.asString, jsonPrimitive.asString)
				&& Objects.equals(this.asFloat, jsonPrimitive.asFloat)
				&& Arrays.equals(this.asByte, jsonPrimitive.asByte)
				&& Objects.equals(this.asShort, jsonPrimitive.asShort)
				&& Objects.equals(this._boolean, jsonPrimitive._boolean)
				&& Objects.equals(this.number, jsonPrimitive.number)
				&& Objects.equals(this.string, jsonPrimitive.string)
				&& Objects.equals(this.jsonArray, jsonPrimitive.jsonArray)
				&& Objects.equals(this.jsonObject, jsonPrimitive.jsonObject)
				&& Objects.equals(this.jsonPrimitive, jsonPrimitive.jsonPrimitive)
				&& Objects.equals(this.asJsonNull, jsonPrimitive.asJsonNull)
				&& Objects.equals(this.asJsonPrimitive, jsonPrimitive.asJsonPrimitive)
				&& Objects.equals(this.asJsonObject, jsonPrimitive.asJsonObject)
				&& Objects.equals(this.asJsonArray, jsonPrimitive.asJsonArray)
				&& Objects.equals(this.jsonNull, jsonPrimitive.jsonNull);
	}

	@Override
	public int hashCode() {
		return Objects.hash(asBoolean, asDouble, asInt, asLong, asNumber, asCharacter, asBigDecimal, asBigInteger,
				asString, asFloat, Arrays.hashCode(asByte), asShort, _boolean, number, string, jsonArray, jsonObject,
				jsonPrimitive, asJsonNull, asJsonPrimitive, asJsonObject, asJsonArray, jsonNull);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JsonPrimitive {\n");
		sb.append("    asBoolean: ").append(toIndentedString(asBoolean)).append("\n");
		sb.append("    asDouble: ").append(toIndentedString(asDouble)).append("\n");
		sb.append("    asInt: ").append(toIndentedString(asInt)).append("\n");
		sb.append("    asLong: ").append(toIndentedString(asLong)).append("\n");
		sb.append("    asNumber: ").append(toIndentedString(asNumber)).append("\n");
		sb.append("    asCharacter: ").append(toIndentedString(asCharacter)).append("\n");
		sb.append("    asBigDecimal: ").append(toIndentedString(asBigDecimal)).append("\n");
		sb.append("    asBigInteger: ").append(toIndentedString(asBigInteger)).append("\n");
		sb.append("    asString: ").append(toIndentedString(asString)).append("\n");
		sb.append("    asFloat: ").append(toIndentedString(asFloat)).append("\n");
		sb.append("    asByte: ").append(toIndentedString(asByte)).append("\n");
		sb.append("    asShort: ").append(toIndentedString(asShort)).append("\n");
		sb.append("    _boolean: ").append(toIndentedString(_boolean)).append("\n");
		sb.append("    number: ").append(toIndentedString(number)).append("\n");
		sb.append("    string: ").append(toIndentedString(string)).append("\n");
		sb.append("    jsonArray: ").append(toIndentedString(jsonArray)).append("\n");
		sb.append("    jsonObject: ").append(toIndentedString(jsonObject)).append("\n");
		sb.append("    jsonPrimitive: ").append(toIndentedString(jsonPrimitive)).append("\n");
		sb.append("    asJsonNull: ").append(toIndentedString(asJsonNull)).append("\n");
		sb.append("    asJsonPrimitive: ").append(toIndentedString(asJsonPrimitive)).append("\n");
		sb.append("    asJsonObject: ").append(toIndentedString(asJsonObject)).append("\n");
		sb.append("    asJsonArray: ").append(toIndentedString(asJsonArray)).append("\n");
		sb.append("    jsonNull: ").append(toIndentedString(jsonNull)).append("\n");
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
