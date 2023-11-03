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
package com.wks.caseengine.rest.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author victor.franca
 *
 */
@Getter
@AllArgsConstructor
public class ErrorResponse {

	private final String error;
	private final String errorMessage;

}
