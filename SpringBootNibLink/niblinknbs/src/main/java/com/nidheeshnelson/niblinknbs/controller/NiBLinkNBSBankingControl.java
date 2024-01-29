package com.nidheeshnelson.niblinknbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScBankingDetailsModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSeBankingService;

@RestController
@CrossOrigin
public class NiBLinkNBSBankingControl {
	@Autowired
private NiBLinkNBSeBankingService bs;
	@PostMapping("/sbs")
	public NiBLinkNBScBankingDetailsModel showBank (@RequestBody NiBLinkNBScBankingDetailsModel bm) {
		bm=bs.showBank(bm);
		return bm;
	}
	@PostMapping("/sbe")
	public NiBLinkNBScBankingDetailsModel editBank (@RequestBody NiBLinkNBScBankingDetailsModel bm) {
		bm=bs.editBank(bm);
		return bm;
	}
	
}
