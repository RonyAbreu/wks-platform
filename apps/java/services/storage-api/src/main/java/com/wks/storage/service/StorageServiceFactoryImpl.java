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
package com.wks.storage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceFactoryImpl implements StorageServiceFactory {

	@Autowired
	@Qualifier("MinioServiceFactory")
	private ServiceFactory minio;

	@Autowired
	@Qualifier("DigitalOceanServiceFactory")
	private ServiceFactory digitalOcean;

	@Value("${driver.storage.factoryclass}")
	private String factoryClass;

	@Override
	public ServiceFactory getFactory() {
		return getFactory(factoryClass);
	}

	@Override
	public ServiceFactory getFactory(String driver) {
		if ("minio".equals(driver)) {
			return minio;
		}

		if ("do".equals(driver)) {
			return digitalOcean;
		}

		throw new IllegalArgumentException(String.format("Factory name '%s' not found", driver));
	}

}
