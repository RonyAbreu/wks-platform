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

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.vote.UnanimousBased;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.wks.api.security.HandlerInputResolver;
import com.wks.api.security.OpenPolicyAuthzEnforcer;

@Configuration
public class ApiSecurityConfig {

	@Value("${opa.url}")
	private String opaUrl;

	@Autowired
	private ApiKeyAuthzEnforcer apiKeyAuthzEnforcer;

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable().authorizeRequests().filterSecurityInterceptorOncePerRequest(false)
				.anyRequest().authenticated().accessDecisionManager(accessDecisionManager());
		return http.build();
	}

	@Bean
	public AccessDecisionManager accessDecisionManager() {
		HandlerInputResolver handle = new MailServerInputRequestResolver();
		OpenPolicyAuthzEnforcer enforcer = new OpenPolicyAuthzEnforcer(opaUrl, handle);
		return new UnanimousBased(Arrays.asList(enforcer, apiKeyAuthzEnforcer));
	}

}