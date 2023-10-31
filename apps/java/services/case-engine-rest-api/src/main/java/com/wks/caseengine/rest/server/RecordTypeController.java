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

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wks.caseengine.record.type.RecordType;
import com.wks.caseengine.record.type.RecordTypeService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("record-type")
@Tag(name = "Record Type")
public class RecordTypeController {

	@Autowired
	private RecordTypeService recordTypeService;

	@GetMapping
	public List<RecordType> find() throws Exception {
		return recordTypeService.find();
	}

	@GetMapping(value = "/{id}")
	public RecordType get(@PathVariable final String id) throws Exception {
		return recordTypeService.get(id);
	}

	@PostMapping
	public void save(@RequestBody final RecordType recordType) throws Exception {
		recordTypeService.save(recordType);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable final String id) throws Exception {
		recordTypeService.delete(id);
	}

	@PatchMapping(value = "/{id}")
	public void update(@PathVariable final String id, @RequestBody final RecordType recordType) throws Exception {
		recordTypeService.update(id, recordType);
	}

}
