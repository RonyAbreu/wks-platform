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
package com.wks.bpm.engine.camunda8.client;

import com.wks.bpm.engine.model.spi.Task;

/**
 * @author victor.franca
 *
 */
public class C8Task extends Task {

	public void setCreationDate(String creationDate) {
		this.created = creationDate;
	}

	public void setDueDate(String due) {
		this.due = due;
	}

	public void setFollowUpDate(String followUp) {
		this.followUp = followUp;
	}

	public void setProcessInstanceKey(String processInstanceKey) {
		this.processInstanceId = processInstanceKey;
	}

	public void setProcessDefinitionKey(String processInstanceKey) {
		this.processDefinitionId = processInstanceKey;
	}

	public void setTaskDefinitionId(String taskDefinitionKey) {
		this.taskDefinitionKey = taskDefinitionKey;
	}
}
