package com.nidheeshnelson.niblinknbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScIdentityModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScIdentityRepository;

@Service
public class NiBLinkNBSfIdentityService implements NiBLinkNBSeIdentityService{
	@Autowired
	private NiBLinkNBScIdentityRepository ir;
	public NiBLinkNBScIdentityModel editIdentity(NiBLinkNBScIdentityModel im) {
		System.out.println("in edit id2"+im);
		im=ir.save(im);
		return im;
	}
	public NiBLinkNBScIdentityModel showIdentity(NiBLinkNBScIdentityModel im) {
		im=ir.findByIdentityid(im.getIdentityid());
		return im;
	}
}
