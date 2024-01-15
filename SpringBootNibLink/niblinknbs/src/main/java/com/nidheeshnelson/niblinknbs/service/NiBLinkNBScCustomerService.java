package com.nidheeshnelson.niblinknbs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLogInModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSaLogInRepository;

@Service
public class NiBLinkNBScCustomerService implements NiBLinkNBSbCustomerService{
	@Autowired
	private NiBLinkNBSaLogInRepository lr;
	public NiBLinkNBSaLogInModel signUp(NiBLinkNBSaLogInModel m) {
		return lr.save(m);
	}
	public NiBLinkNBSaLogInModel editUser (NiBLinkNBSaLogInModel m) {
		NiBLinkNBSaLogInModel lm=lr.findById(m.getLog_id()).get();
		lm.setUsername(m.getUsername());
		return lr.save(lm);
	}
	public NiBLinkNBSaLogInModel editPassword (NiBLinkNBSaLogInModel m) {
		NiBLinkNBSaLogInModel lm = lr.findById(m.getLog_id()).get();
		lm.setPassword(m.getPassword());
		return lr.save(lm);
	}
	public NiBLinkNBSaLogInModel editEmail (NiBLinkNBSaLogInModel m) {
		NiBLinkNBSaLogInModel lm = lr.findById(m.getLog_id()).get();
		lm.setEmail(m.getEmail());
		return lr.save(lm);
	}
	public NiBLinkNBSaLogInModel editPhone (NiBLinkNBSaLogInModel m) {
		NiBLinkNBSaLogInModel lm = lr.findById(m.getLog_id()).get();
		lm.setPhone(m.getPhone());
		return lr.save(lm);
	}
}
