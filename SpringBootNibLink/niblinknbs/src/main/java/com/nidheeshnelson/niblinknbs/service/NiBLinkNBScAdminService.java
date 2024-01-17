package com.nidheeshnelson.niblinknbs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaJobModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSaJobRepository;

@Service
public class NiBLinkNBScAdminService implements NiBLinkNBSbAdminService{
	@Autowired
private NiBLinkNBSaJobRepository jr;
	private List<NiBLinkNBSaJobModel> jl = new ArrayList<>();
	public NiBLinkNBSaJobModel addJob(NiBLinkNBSaJobModel jm){
		jm=jr.save(jm);
		return jm;
	}
	public List<NiBLinkNBSaJobModel> jobList() {
		return jr.findAll();
	}
}
