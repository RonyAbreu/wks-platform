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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ActivityInstance
 */
@JsonPropertyOrder({ ActivityInstance.JSON_PROPERTY_ID, ActivityInstance.JSON_PROPERTY_ACTIVITY_ID,
		ActivityInstance.JSON_PROPERTY_ACTIVITY_TYPE, ActivityInstance.JSON_PROPERTY_CHILD_ACTIVITY_INSTANCES })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T12:12:09.236578+01:00[Europe/Dublin]")
public class ActivityInstance {
	public static final String JSON_PROPERTY_ID = "id";
	private String id;

	public static final String JSON_PROPERTY_ACTIVITY_ID = "activityId";
	private String activityId;

	public static final String JSON_PROPERTY_ACTIVITY_TYPE = "activityType";
	private String activityType;

	public static final String JSON_PROPERTY_CHILD_ACTIVITY_INSTANCES = "childActivityInstances";
	private List<ActivityInstance> childActivityInstances;

	public ActivityInstance() {
	}

	public ActivityInstance id(String id) {

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

	public ActivityInstance activityId(String activityId) {

		this.activityId = activityId;
		return this;
	}

	/**
	 * Get activityId
	 *
	 * @return activityId
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_ACTIVITY_ID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getActivityId() {
		return activityId;
	}

	@JsonProperty(JSON_PROPERTY_ACTIVITY_ID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public ActivityInstance activityType(String activityType) {

		this.activityType = activityType;
		return this;
	}

	/**
	 * Get activityType
	 *
	 * @return activityType
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_ACTIVITY_TYPE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getActivityType() {
		return activityType;
	}

	@JsonProperty(JSON_PROPERTY_ACTIVITY_TYPE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public ActivityInstance childActivityInstances(List<ActivityInstance> childActivityInstances) {

		this.childActivityInstances = childActivityInstances;
		return this;
	}

	public ActivityInstance addChildActivityInstancesItem(ActivityInstance childActivityInstancesItem) {
		if (this.childActivityInstances == null) {
			this.childActivityInstances = new ArrayList<>();
		}
		this.childActivityInstances.add(childActivityInstancesItem);
		return this;
	}

	/**
	 * Get childActivityInstances
	 *
	 * @return childActivityInstances
	 **/
	@javax.annotation.Nullable
	@JsonProperty(JSON_PROPERTY_CHILD_ACTIVITY_INSTANCES)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public List<ActivityInstance> getChildActivityInstances() {
		return childActivityInstances;
	}

	@JsonProperty(JSON_PROPERTY_CHILD_ACTIVITY_INSTANCES)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public void setChildActivityInstances(List<ActivityInstance> childActivityInstances) {
		this.childActivityInstances = childActivityInstances;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ActivityInstance activityInstance = (ActivityInstance) o;
		return Objects.equals(this.id, activityInstance.id)
				&& Objects.equals(this.activityId, activityInstance.activityId)
				&& Objects.equals(this.activityType, activityInstance.activityType)
				&& Objects.equals(this.childActivityInstances, activityInstance.childActivityInstances);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, activityId, activityType, childActivityInstances);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ActivityInstance {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
		sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
		sb.append("    childActivityInstances: ").append(toIndentedString(childActivityInstances)).append("\n");
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
