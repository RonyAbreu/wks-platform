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
package com.wks.caseengine.rest.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wks.caseengine.cases.definition.service.CaseDefinitionService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("healthCheck")
@Tag(name = "Healtcheck", description = "Health check endpoint")
public class HealthCheckController {

	@Autowired
	private CaseDefinitionService caseDefinitionService;

	@GetMapping
	public String check() throws Exception {
		caseDefinitionService.find();
		return "success";
	}

}
