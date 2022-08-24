package com.mmc.bpm.client.cases.instance;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mmc.bpm.client.cases.definition.CaseDefinition;
import com.mmc.bpm.client.cases.definition.event.ProcessStartEvent;
import com.mmc.bpm.client.cases.definition.event.ProcessStartEventExecutor;
import com.mmc.bpm.client.repository.DataRepository;

@Component
public class CaseInstanceServiceImpl implements CaseInstanceService {

	@Autowired
	private DataRepository dataRepository;

	@Autowired
	private CaseInstanceCreateService caseInstanceCreateService;

	@Autowired
	private ProcessStartEventExecutor processStartEventExecutor;

	@Override
	public List<CaseInstance> find() throws Exception {
		return dataRepository.findCaseInstances();
	}

	@Override
	public CaseInstance get(final String businessKey) throws Exception {
		return dataRepository.getCaseInstance(businessKey);
	}

	@Override
	// TODO how to embrace in a single transation?
	public CaseInstance create(CaseInstance caseInstance) throws Exception {

		CaseDefinition caseDefinition = dataRepository.getCaseDefinition(caseInstance.getCaseDefinitionId());

		CaseInstance newCaseInstance = caseInstanceCreateService.create(caseInstance);

		caseDefinition.getPostCaseCreateHook().getCaseEvents().forEach(event -> processStartEventExecutor
				.execute((ProcessStartEvent) event, newCaseInstance.getBusinessKey()));

		return newCaseInstance;
	}

	// TODO Should be a generic update?
	@Override
	public void updateStatus(final String businessKey, final String newStatus) throws Exception {
		dataRepository.updateCaseStatus(businessKey, newStatus);
	}

	// TODO should not allow to delete. Close or archive instead
	// Should ensure only one case is deleted - BusinessKey should be UNIQUE
	@Override
	public void delete(final String businessKey) throws Exception {
		List<CaseInstance> caseInstanceList = dataRepository.findCaseInstances().stream()
				.filter(o -> o.getBusinessKey().equals(businessKey)).collect(Collectors.toList());

		if (caseInstanceList.isEmpty()) {
			throw new CaseInstanceNotFoundException();
		}

		// TODO close/archive process in PostClose/Archive hook

		caseInstanceList.forEach(o -> {
			try {
				dataRepository.deleteCaseInstance(o);
			} catch (Exception e) {
				// TODO error handling
				e.printStackTrace();
			}
		});
	}

	public void setDataRepository(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	public void setCaseInstanceCreateService(CaseInstanceCreateService caseInstanceCreateService) {
		this.caseInstanceCreateService = caseInstanceCreateService;
	}
	
	public void setProcessStartEventExecutor(ProcessStartEventExecutor processStartEventExecutor) {
		this.processStartEventExecutor = processStartEventExecutor;
	}

}
