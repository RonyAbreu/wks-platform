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
package com.wks.caseengine.cases.definition.action;

import com.wks.caseengine.cases.instance.CaseInstance;
import com.wks.caseengine.event.Action;

public interface CaseAction extends Action {
	
	String getId();

	CaseActionType getActionType();

	void visit(CaseInstance caseInstance);
	
}
