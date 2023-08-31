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
package com.wks.storage.service.digitalocean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wks.storage.service.BucketService;
import com.wks.storage.service.DownloadService;
import com.wks.storage.service.ServiceFactory;
import com.wks.storage.service.UploadService;

@Service("DigitalOceanServiceFactory")
public class DigitalOceanServiceFactory implements ServiceFactory {

	@Autowired
	@Qualifier("DigitalOceanBucketService")
	private BucketService bucketService;

	@Autowired
	@Qualifier("DigitalOceanDownloadService")
	private DownloadService downloadService;

	@Autowired
	@Qualifier("DigitalOceanUploadService")
	private UploadService uploadService;

	@Override
	public BucketService getBucketService() {
		return bucketService;
	}

	@Override
	public DownloadService getDownloadService() {
		return downloadService;
	}

	@Override
	public UploadService getUploadService() {
		return uploadService;
	}

}
