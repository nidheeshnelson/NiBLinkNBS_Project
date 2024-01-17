package com.nidheeshnelson.niblinknbs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLogInModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbAdminModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbCustomerModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbExpertModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSaLogInRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSbAdminRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSbCustomerRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSbExpertRepository;

@Service
public class NiBLinkNBSdLogInService implements NiBLinkNBSaLogInService{
	@Autowired
	private NiBLinkNBSaLogInRepository lr;
	@Autowired
	private NiBLinkNBSbAdminRepository ar;
	@Autowired
	private NiBLinkNBSbExpertRepository er;
	@Autowired
	private NiBLinkNBSbCustomerRepository cr;
	private NiBLinkNBSbCustomerModel cm = new  NiBLinkNBSbCustomerModel();
	private NiBLinkNBSbExpertModel em = new NiBLinkNBSbExpertModel();
	private NiBLinkNBSbAdminModel am = new NiBLinkNBSbAdminModel();
	private NiBLinkNBSaLogInModel lm = new NiBLinkNBSaLogInModel();
	private List<NiBLinkNBSaLogInModel> log = new ArrayList<>();
	private List<NiBLinkNBSbAdminModel> lam = new ArrayList<>();
	private List<NiBLinkNBSbExpertModel> lem = new ArrayList<>();
	private List<NiBLinkNBSbCustomerModel> lcm = new ArrayList<>();
	private Object obj=new Object();
public Object signUp(NiBLinkNBSaLogInModel m,NiBLinkNBSeTypeSignInService ts) {
		
		if(ts.equals(NiBLinkNBSeTypeSignInService.ADMIN)) {
			System.out.println("in admin signup service"+ts);
			lm=lr.save(m);
			am.setLog_id(lm);
			am=ar.save(am);
			obj=am;
		}
		else if(ts.equals(NiBLinkNBSeTypeSignInService.EXPERT)) {
			lm=lr.save(m);
			em.setLog_id(lm);
			em=er.save(em);
			obj=em;
		}
		else if(ts.equals(NiBLinkNBSeTypeSignInService.CUSTOMER)) {
			lm=lr.save(m);
			cm.setLog_id(lm);
			cm=cr.save(cm);
			obj=cm;
		}
		return obj;
	}
	public Object signIn(NiBLinkNBSaLogInModel m) {
		log = lr.findAll();
		lam = ar.findAll();
		lem = er.findAll();
		lcm = cr.findAll();
		for(NiBLinkNBSaLogInModel lg : log) {
			if(lg.getUsername().equals(m.getUsername())) {
				if(lg.getStatus()==3) {
					cm.setLog_id(lg);
					for(NiBLinkNBSbCustomerModel cg :lcm) {
						if(cm.getLog_id().equals(cg.getLog_id())) {
							obj=cg;
						}
					}
				}
				else if(lg.getStatus()==2) {
					em.setLog_id(lg);
					for(NiBLinkNBSbExpertModel eg :lem) {
						if(em.getLog_id().equals(eg.getLog_id())) {
							obj=eg;
						}
					}
				}
				else if(lg.getStatus()==1) {
					am.setLog_id(lg);
					for(NiBLinkNBSbAdminModel ag :lam) {
						if(am.getLog_id().equals(ag.getLog_id())) {
							obj=ag;
						}
					}
				}
			}
		}
		return obj;
	}
	public NiBLinkNBSaLogInModel editUser (NiBLinkNBSaLogInModel m) {
		lm=lr.findById(m.getLog_id()).get();
		lm.setUsername(m.getUsername());
		return lr.save(lm);
	}
	public NiBLinkNBSaLogInModel editPassword (NiBLinkNBSaLogInModel m) {
		lm = lr.findById(m.getLog_id()).get();
		lm.setPassword(m.getPassword());
		return lr.save(lm);
	}
	public NiBLinkNBSaLogInModel editEmail (NiBLinkNBSaLogInModel m) {
		lm = lr.findById(m.getLog_id()).get();
		lm.setEmail(m.getEmail());
		return lr.save(lm);
	}
	public NiBLinkNBSaLogInModel editPhone (NiBLinkNBSaLogInModel m) {
		lm = lr.findById(m.getLog_id()).get();
		lm.setPhone(m.getPhone());
		return lr.save(lm);
	}
}
