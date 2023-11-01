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
package com.wks.caseengine.cases.instance.service;

import com.wks.caseengine.cases.instance.CaseComment;
import com.wks.caseengine.cases.instance.CaseDocument;
import com.wks.caseengine.cases.instance.CaseInstance;
import com.wks.caseengine.cases.instance.CaseInstanceFilter;
import com.wks.caseengine.cases.instance.CaseInstanceNotFoundException;
import com.wks.caseengine.pagination.PageResult;

public interface CaseInstanceService {

	PageResult<CaseInstance> find(CaseInstanceFilter filters);

	CaseInstance get(final String businessKey) throws CaseInstanceNotFoundException;

	CaseInstance createWithValues(final CaseInstance caseInstance);

	CaseInstance createEmpty(final String caseDefinitionId);

	CaseInstance patch(final String businessKey, final CaseInstance caseInstance);

	void delete(final String businessKey) throws CaseInstanceNotFoundException;

	void saveDocument(final String businessKey, final CaseDocument document) throws CaseInstanceNotFoundException;

	void saveComment(final String businessKey, final CaseComment comment) throws CaseInstanceNotFoundException;

	void updateComment(final String businessKey, final String commentId, final String body)
			throws CaseInstanceNotFoundException;

	void deleteComment(final String businessKey, final String commentId) throws CaseInstanceNotFoundException;

}