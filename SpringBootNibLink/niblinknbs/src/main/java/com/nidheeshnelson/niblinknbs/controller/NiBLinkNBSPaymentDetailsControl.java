package com.nidheeshnelson.niblinknbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPaymentDetailsModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSePaymentDetailsService;

@RestController
@CrossOrigin
public class NiBLinkNBSPaymentDetailsControl {
	@Autowired
	private NiBLinkNBSePaymentDetailsService ps;
	@PostMapping("/epdm")
	public NiBLinkNBScPaymentDetailsModel editPaymentDet(@RequestBody NiBLinkNBScPaymentDetailsModel pd) {
		System.out.println(pd);
		pd=ps.editPaymentDet(pd);
		return pd;
	}
	@PostMapping("/spdm")
	public NiBLinkNBScPaymentDetailsModel showPaymentDet(@RequestBody NiBLinkNBScPaymentDetailsModel pd) {
		pd=ps.showPaymentDet(pd);
		return pd;
	}

}
