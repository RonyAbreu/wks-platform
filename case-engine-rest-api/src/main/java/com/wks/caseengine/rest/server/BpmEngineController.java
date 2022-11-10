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

import com.wks.bpm.engine.BpmEngine;
import com.wks.caseengine.bpm.BpmEngineService;

@RestController
@RequestMapping("bpm-engine")
public class BpmEngineController {

	@Autowired
	private BpmEngineService bpmEngineService;

	@GetMapping(value = "/")
	public List<BpmEngine> find() throws Exception {
		return bpmEngineService.find();
	}

	@PostMapping(value = "/")
	public BpmEngine save(@RequestBody final BpmEngine bpmEngine) throws Exception {
		return bpmEngineService.save(bpmEngine);
	}

	@PatchMapping(value = "/{bpmEngineId}")
	public BpmEngine update(@PathVariable final String bpmEngineId, @RequestBody final BpmEngine bpmEngine)
			throws Exception {
		return bpmEngineService.update(bpmEngineId, bpmEngine);
	}

	@DeleteMapping(value = "/{bpmEngineId}")
	public void delete(@PathVariable final String bpmEngineId) throws Exception {
		bpmEngineService.delete(bpmEngineId);
	}

}
