package com.nidheeshnelson.niblinknbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScBankingDetailsModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScBankingDetailsRepository;
@Service
public class NiBLinkNBSfBankingService implements NiBLinkNBSeBankingService{
	@Autowired
	private NiBLinkNBScBankingDetailsRepository br;
public NiBLinkNBScBankingDetailsModel showBank(NiBLinkNBScBankingDetailsModel bm) {
	bm=br.findByBankid(bm.getBankid());
	return bm;
}
public NiBLinkNBScBankingDetailsModel editBank(NiBLinkNBScBankingDetailsModel bm) {
	bm=br.save(bm);
	return bm;
}
}
