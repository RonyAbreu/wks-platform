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
package com.wks.emailtocase.security;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.wks.api.security.context.SecurityContextTenantHolder;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public final class InjectorTenantHandlerInterceptor implements HandlerInterceptor {

	@Autowired
	private SecurityContextTenantHolder tenantHolder;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		setTenantId(request, tenantHolder);
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {
		tenantHolder.clear();
	}

	private void setTenantId(HttpServletRequest request, SecurityContextTenantHolder tenantHolder) {
		MailServerInputRequestResolver handler = new MailServerInputRequestResolver();

		Map<String, Object> params = handler.resolver(request, null);

		String tenantId = (String) params.get("org");
		if (tenantId == null || tenantId.isBlank()) {
			log.error("Could't find tenantId by subdomain, it was expected to be filled but it is empty {}", tenantId);
			throw new IllegalArgumentException("Could't find tenantId by mail server dns ");
		}

		tenantHolder.setTenantId(tenantId);
	}

}
