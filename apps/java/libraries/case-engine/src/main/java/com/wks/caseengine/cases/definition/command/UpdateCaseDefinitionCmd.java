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
package com.wks.caseengine.cases.definition.command;

import com.wks.caseengine.cases.definition.CaseDefinition;
import com.wks.caseengine.cases.definition.CaseDefinitionNotFoundException;
import com.wks.caseengine.command.Command;
import com.wks.caseengine.command.CommandContext;
import com.wks.caseengine.repository.DatabaseRecordNotFoundException;

import lombok.AllArgsConstructor;

/**
 * @author victor.franca
 *
 */
@AllArgsConstructor
public class UpdateCaseDefinitionCmd implements Command<CaseDefinition> {

	private String caseDefId;
	private CaseDefinition caseDefinition;

	@Override
	public CaseDefinition execute(final CommandContext commandContext) {
		try {
			commandContext.getCaseDefRepository().update(caseDefId, caseDefinition);
		} catch (DatabaseRecordNotFoundException e) {
			throw new CaseDefinitionNotFoundException(e);
		}
		return caseDefinition;
	}

}
