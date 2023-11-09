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
package com.wks.caseengine.form;

import java.util.List;

public interface FormService {

	void save(final Form form);

	Form get(final String formKey);

	List<Form> find();

	void delete(final String formKey);

	void update(final String formKey, final Form form);

}
