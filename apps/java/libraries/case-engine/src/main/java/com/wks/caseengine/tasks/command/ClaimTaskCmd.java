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
package com.wks.caseengine.tasks.command;

import com.wks.caseengine.command.Command;
import com.wks.caseengine.command.CommandContext;

import lombok.AllArgsConstructor;

/**
 * @author victor.franca
 *
 */
@AllArgsConstructor
public class ClaimTaskCmd implements Command<Void> {

	private String taskId;
	private String taskAssignee;

	@Override
	public Void execute(CommandContext commandContext) {
		commandContext.getBpmEngineClientFacade().claimTask(taskId, taskAssignee);
		return null;
	}

}
