package com.nidheeshnelson.niblinknbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSeAddressService;

@RestController
@CrossOrigin
public class NiBLinkNBSAddressControl {
	@Autowired
	private NiBLinkNBSeAddressService as;
	@PostMapping("/shad")
	public NiBLinkNBScAddressModel showAddress(@RequestBody NiBLinkNBScAddressModel am) {
		am=as.showAddress(am);
		return am;
	}
	@PostMapping("/edad")
	public NiBLinkNBScAddressModel editAddress(@RequestBody NiBLinkNBScAddressModel am) {
		am=as.editAddress(am);
		return am;
	}
}
