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
package com.wks.caseengine.queue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueueServiceImpl implements QueueService {

	@Autowired
	private QueueRepository queueRepository;

	@Override
	public void save(Queue queue) throws Exception {
		queueRepository.save(queue);
	}

	@Override
	public Queue get(String id) throws Exception {
		return queueRepository.get(id);
	}

	@Override
	public List<Queue> find() throws Exception {
		return queueRepository.find();
	}

	@Override
	public void delete(String id) throws Exception {
		queueRepository.delete(id);
	}

	@Override
	public void update(String id, Queue queue) throws Exception {
		queueRepository.update(id, queue);
	}

}
