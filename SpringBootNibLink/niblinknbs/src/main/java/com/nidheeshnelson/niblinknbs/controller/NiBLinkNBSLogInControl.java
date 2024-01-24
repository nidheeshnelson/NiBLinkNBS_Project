package com.nidheeshnelson.niblinknbs.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLogInModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbaAdminModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbcCustomerModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbbExpertModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSaLogInService;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSTypeSignInService;

@RestController
@CrossOrigin
public class NiBLinkNBSLogInControl {
	@Autowired
	private NiBLinkNBSaLogInService ls;
	private Map<String, String> mp = new HashMap<>();
	private NiBLinkNBSbcCustomerModel cm = new  NiBLinkNBSbcCustomerModel();
	private NiBLinkNBSbbExpertModel em = new NiBLinkNBSbbExpertModel();
	private NiBLinkNBSbaAdminModel am = new NiBLinkNBSbaAdminModel();
	private Object obj = new Object();
	private NiBLinkNBSTypeSignInService ts;

	@PostMapping("/sup")
	public Map<String, String> SignUp(@RequestBody NiBLinkNBSaLogInModel lm) {
		System.out.println("in signup"+lm);
		
		if(lm.getStatus()==1) {
			lm=ls.signUp(lm, ts.ADMIN);
			mp.put("ADMIN", lm.getGeneratedid());
		}
		else if(lm.getStatus()==2) {
			lm=ls.signUp(lm,ts.EXPERT);
			mp.put("EXPERT", lm.getGeneratedid());
		}
		else if(lm.getStatus()==3) {
			lm=ls.signUp(lm, ts.CUSTOMER);
			mp.put("CUSTOMER", lm.getGeneratedid());
		}
		else {
			mp.put("FAILED", "NULL");
		}
		
		return mp;
	}
	@GetMapping("/lin")
	public Map<String,String> logIn(@RequestBody NiBLinkNBSaLogInModel lm) {
//		obj = ls.signIn(lm);
//		if(obj.getClass()==cm.getClass()) {
//			cm=(NiBLinkNBSbcCustomerModel) obj;
//			mp.put("CUSTOMER", cm.getCustomer_id());
//		}
//		else if(obj.getClass()==em.getClass()) {
//			em=(NiBLinkNBSbbExpertModel) obj;
//			mp.put("EXPERT", em.getExpert_id());
//		}
//		else if(obj.getClass()==am.getClass()) {
//			am=(NiBLinkNBSbaAdminModel) obj;
//			mp.put("ADMIN", am.getAdmin_id());
//		}
//		else {
			mp.put("FAILED", "0");
//		}
		return mp;
	}
}
