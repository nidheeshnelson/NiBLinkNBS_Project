package com.nidheeshnelson.niblinknbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScIdentityModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScIdentityRepository;

@Service
public class NiBLinkNBSfIdentityService implements NiBLinkNBSaieIdentityService{
	@Autowired
	private NiBLinkNBScIdentityRepository ir;
	private NiBLinkNBScIdentityModel im;
	public NiBLinkNBScIdentityModel showIdentity(String s) {
		return ir.findByIdentityid(s);
	}
	
	public NiBLinkNBScIdentityModel addIdentity(NiBLinkNBScIdentityModel im) {
		return ir.save(im);
	}
	
	public NiBLinkNBScIdentityModel editIdentity(NiBLinkNBScIdentityModel im) {
		this.im=ir.findByIdentityid(im.getIdentityid());
		try {
		if(im.getAdhar()!=null) {
			this.im.setAdhar(im.getAdhar());
		}
		if(im.getElectionid()!=null) {
			this.im.setElectionid(im.getElectionid());
		}
		if(im.getIdentityid()!=null) {
			this.im.setIdentityid(im.getIdentityid());
		}
		if(im.getPancard()!=null) {
			this.im.setPancard(im.getPancard());
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return ir.save(this.im);
	}
	
}
