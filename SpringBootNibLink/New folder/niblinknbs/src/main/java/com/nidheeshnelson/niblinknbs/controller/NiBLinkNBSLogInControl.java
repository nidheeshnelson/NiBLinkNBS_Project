package com.nidheeshnelson.niblinknbs.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLogInModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSaiaLogInService;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSTypeSignInService;

@RestController
@CrossOrigin
@RequestMapping("/log")
public class NiBLinkNBSLogInControl {
	@Autowired
	private NiBLinkNBSaiaLogInService ls;
	private Map<String, Integer> mp = new HashMap<>();
	@PostMapping("/sup")
	public Map<String, Integer> SignUp(@RequestBody NiBLinkNBSaLogInModel lm) {
		System.out.println("in signup"+lm);
		try {
		if(lm.getStatus()==1) {
			lm=ls.signUp(lm, NiBLinkNBSTypeSignInService.ADMIN);
			mp.put(lm.getGeneratedid(), lm.getStatus());
		}
		else if(lm.getStatus()==2) {
			lm=ls.signUp(lm,NiBLinkNBSTypeSignInService.EXPERT);
			mp.put(lm.getGeneratedid(), lm.getStatus());
		}
		else if(lm.getStatus()==3) {
			lm=ls.signUp(lm, NiBLinkNBSTypeSignInService.CUSTOMER);
			mp.put(lm.getGeneratedid(), lm.getStatus());
		}
		else {
			mp.put("FAILED", 0);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return mp;
	}
	@PostMapping("/lgn")
	public Map<String, String> logIn(@RequestBody NiBLinkNBSaLogInModel lm) {
		
		return ls.logIn(lm);
	}
}
