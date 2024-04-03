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
package com.wks.emailtocase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = UserDetailsServiceAutoConfiguration.class)
@ComponentScan(

		basePackageClasses = { com.wks.api.security.config.ApiSecurityScan.class },

		basePackages = { "com.wks.emailtocase.config", "com.wks.emailtocase.security", "com.wks.emailtocase.server" })

public class MailToCaseApp {

	public static void main(String[] args) {
		SpringApplication.run(MailToCaseApp.class, args);
	}

}
