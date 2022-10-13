package com.wks.caseengine.rest.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.wks.caseengine.cases.definition.CaseDefinition;
import com.wks.caseengine.cases.definition.CaseDefinitionNotFoundException;
import com.wks.caseengine.cases.definition.CaseDefinitionService;

@RestController
public class CaseDefinitionController {

	@Autowired
	private CaseDefinitionService caseDefinitionService;

	@GetMapping(value = "/case-definition")
	public List<CaseDefinition> find() throws Exception {
		return caseDefinitionService.find();
	}

	@GetMapping(value = "/case-definition/{caseDefId}")
	public CaseDefinition get(@PathVariable String caseDefId) throws Exception {
		return caseDefinitionService.get(caseDefId);
	}

	@PostMapping(value = "/case-definition")
	public CaseDefinition save(@RequestBody CaseDefinition caseDefinition) throws Exception {
		return caseDefinitionService.create(caseDefinition);
	}

	@PatchMapping(value = "/case-definition/{caseDefId}")
	public CaseDefinition update(@PathVariable String caseDefId, @RequestBody CaseDefinition caseDefinition)
			throws Exception {
		return caseDefinitionService.update(caseDefId, caseDefinition);
	}

	@DeleteMapping(value = "/case-definition/{caseDefId}")
	public void delete(@PathVariable String caseDefId) throws Exception {
		try {
			caseDefinitionService.delete(caseDefId);
		} catch (CaseDefinitionNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Case Definition Not Found - " + caseDefId, e);
		}
	}

}
