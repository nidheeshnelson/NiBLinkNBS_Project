package com.nidheeshnelson.niblinknbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScBankingDetailsModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScBankingDetailsRepository;
@Service
public class NiBLinkNBSfBankingService implements NiBLinkNBSaieBankingService{
	@Autowired
	private NiBLinkNBScBankingDetailsRepository br;
	private NiBLinkNBScBankingDetailsModel bm;
public NiBLinkNBScBankingDetailsModel showBank(String s) {
	return br.findByBankid(s);
}

public NiBLinkNBScBankingDetailsModel addBank(NiBLinkNBScBankingDetailsModel bm) {
	return br.save(bm);
}

public NiBLinkNBScBankingDetailsModel editBank(NiBLinkNBScBankingDetailsModel bm) {
	this.bm=br.findByBankid(bm.getBankid());
	try {
	if(bm.getAccountnumber()!=null) {
		this.bm.setAccountnumber(bm.getAccountnumber());
	}
	if(bm.getBank()!=null) {
		this.bm.setBank(bm.getBank());
	}
	if(bm.getBranch()!=null) {
		this.bm.setBranch(bm.getBranch());
	}
	if(bm.getIfsc()!=null) {
		this.bm.setIfsc(bm.getIfsc());
	}
	if(bm.getSecretpin()!=0) {
		this.bm.setSecretpin(bm.getSecretpin());
	}
	if(bm.getUpiid()!=null) {
		this.bm.setUpiid(bm.getUpiid());
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return br.save(this.bm);
}
}
