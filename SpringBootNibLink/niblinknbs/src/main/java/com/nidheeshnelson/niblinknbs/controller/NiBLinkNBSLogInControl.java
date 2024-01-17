package com.nidheeshnelson.niblinknbs.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLogInModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbAdminModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbCustomerModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbExpertModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSaLogInService;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSeTypeSignInService;

@RestController
@CrossOrigin
public class NiBLinkNBSLogInControl {
	@Autowired
	private NiBLinkNBSaLogInService ls;
	private Map<String, Integer> mp = new HashMap<>();
	private NiBLinkNBSbCustomerModel cm = new  NiBLinkNBSbCustomerModel();
	private NiBLinkNBSbExpertModel em = new NiBLinkNBSbExpertModel();
	private NiBLinkNBSbAdminModel am = new NiBLinkNBSbAdminModel();
	private Object obj = new Object();
	private NiBLinkNBSeTypeSignInService ts;

	@GetMapping("/sp")
	public Map<String, Integer> SignUp(@RequestBody NiBLinkNBSaLogInModel lm) {
		System.out.println("in signup"+lm);
		if(lm.getStatus()==1) {
			obj=ls.signUp(lm, ts.ADMIN);
			am=(NiBLinkNBSbAdminModel) obj;
			mp.put("ADMIN", am.getAdmin_id());
		}
		else if(lm.getStatus()==2) {
			obj=ls.signUp(lm,ts.EXPERT);
			em= (NiBLinkNBSbExpertModel) obj;
			mp.put("EXPERT", em.getExpert_id());
		}
		else if(lm.getStatus()==3) {
			obj=ls.signUp(lm, ts.CUSTOMER);
			cm= (NiBLinkNBSbCustomerModel) obj;
			mp.put("CUSTOMER", cm.getCustomer_id());
		}
		else {
			mp.put("FAILED", 0);
		}
		return mp;
	}
	@GetMapping("/")
	public String logIn(@RequestBody NiBLinkNBSaLogInModel lm) {
		obj = ls.signIn(lm);
		if(obj.getClass()==cm.getClass()) {
			
		}
		else if(obj.getClass()==em.getClass()) {
			
		}
		else if(obj.getClass()==am.getClass()) {
			
		}
		return null;
	}
}
