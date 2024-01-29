package com.nidheeshnelson.niblinknbs.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLogInModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaStatusModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbaAdminModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbcCustomerModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbbExpertModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSaLogInRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSaStatusRepository;
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
	@Autowired
	private NiBLinkNBSaStatusRepository sr;
	private NiBLinkNBSbcCustomerModel cm = new  NiBLinkNBSbcCustomerModel();
	private NiBLinkNBSbbExpertModel em = new NiBLinkNBSbbExpertModel();
	private NiBLinkNBSbaAdminModel am = new NiBLinkNBSbaAdminModel();
	private NiBLinkNBSaStatusModel sm = new NiBLinkNBSaStatusModel();
	private Map<String,Integer> mp = new HashMap<>();
	public NiBLinkNBSaLogInModel signUp(NiBLinkNBSaLogInModel m,NiBLinkNBSTypeSignInService ts) {
		try {
		if(ts.equals(NiBLinkNBSTypeSignInService.ADMIN)) {
			System.out.println("in admin signup service "+ts);
			m=lr.save(m);
			System.out.println("saved"+m);
			m.setGeneratedid("ADMIN"+m.getLogid());
			System.out.println(m);
			m=lr.save(m);
			sm.setNamelistid(m.getGeneratedid());
			sm.setStatus(m.getStatus());
			sm=sr.save(sm);
			System.out.println(sm);
			am.setAdminid(m.getGeneratedid());
			am=ar.save(am);
			System.out.println(am);
		}
		else if(ts.equals(NiBLinkNBSTypeSignInService.EXPERT)) {
			System.out.println("in expert signup service "+ts);
			m=lr.save(m);
			m.setGeneratedid("EXPERT"+m.getLogid());
			System.out.println(m);
			m=lr.save(m);
			sm.setNamelistid(m.getGeneratedid());
			sm.setStatus(m.getStatus());
			sm=sr.save(sm);
			em.setExpertid(m.getGeneratedid());
			er.save(em);
		}
		else if(ts.equals(NiBLinkNBSTypeSignInService.CUSTOMER)) {
			System.out.println("in customer signup service "+ts);
			m=lr.save(m);
			m.setGeneratedid("CUSTOM"+m.getLogid());
			System.out.println(m);
			m=lr.save(m);
			sm.setNamelistid(m.getGeneratedid());
			sm.setStatus(m.getStatus());
			sm=sr.save(sm);
			cm.setCustomerid(m.getGeneratedid());
			cr.save(cm);
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		return m;
		
	}
	public Map<String, Integer> logIn(NiBLinkNBSaLogInModel lm) {
		try {
		lm=lr.findByUsernameAndPassword(lm.getUsername(), lm.getPassword());
		mp.put(lm.getGeneratedid(), lm.getStatus());
		System.out.println(mp); 
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return mp;
	}
}
