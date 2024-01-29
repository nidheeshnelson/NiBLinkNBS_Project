package com.nidheeshnelson.niblinknbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPersonalModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScPersonalRepository;

@Service
public class NiBLinkNBSfPersonalService implements NiBLinkNBSePersonalService{
	@Autowired
	private NiBLinkNBScPersonalRepository pr;
	public NiBLinkNBScPersonalModel editPersonal(NiBLinkNBScPersonalModel pm) {
		pm=pr.save(pm);
		return pm;
	}
	public NiBLinkNBScPersonalModel showPersonal(NiBLinkNBScPersonalModel pm) {
		pm=pr.findByPersonalid(pm.getPersonalid());
		return pm;
	}
}
