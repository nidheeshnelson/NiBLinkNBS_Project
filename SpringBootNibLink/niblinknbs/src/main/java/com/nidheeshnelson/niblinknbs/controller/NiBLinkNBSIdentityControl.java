package com.nidheeshnelson.niblinknbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScIdentityModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSeIdentityService;

@RestController
@CrossOrigin
public class NiBLinkNBSIdentityControl {
	@Autowired
	private NiBLinkNBSeIdentityService is;
	@PostMapping("/edi")
	public NiBLinkNBScIdentityModel editIdentity (@RequestBody NiBLinkNBScIdentityModel im) {
		System.out.println("in identity1"+im);
		im=is.editIdentity(im);
		return im;
	}
	@PostMapping("/shi")
	public NiBLinkNBScIdentityModel showIdentity (@RequestBody NiBLinkNBScIdentityModel im) {
		im=is.showIdentity(im);
		return im;
	}
}
