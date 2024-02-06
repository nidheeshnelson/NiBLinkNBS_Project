package com.nidheeshnelson.niblinknbs.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaJobModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSaJobRepository;

@Service
public class NiBLinkNBSfJobService implements NiBLinkNBSeJobService{
	@Autowired
	private NiBLinkNBSaJobRepository jr;
	private NiBLinkNBSaJobModel jm = new NiBLinkNBSaJobModel();
public Map<String, String> addJob(NiBLinkNBSaJobModel jm){
	jm=jr.save(jm);
	jm.setJobcode("JOB"+jm.getJobid());
	jm=jr.save(jm);
	return Map.of("JOBID",jm.getJobcode());
}

public Map<String, String> findNameOfJob(String s){
	jm=jr.findByJobcode(s);
	return Map.of("JOBNAME",jm.getJobname());
}

public List<NiBLinkNBSaJobModel> jobList() {
	return jr.findAll();
}
}
