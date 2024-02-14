package com.nidheeshnelson.niblinknbs.service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScBankingDetailsModel;

public interface NiBLinkNBSaieBankingService {
	public NiBLinkNBScBankingDetailsModel showBank(String s);
	public NiBLinkNBScBankingDetailsModel editBank(NiBLinkNBScBankingDetailsModel bm);
	public NiBLinkNBScBankingDetailsModel addBank(NiBLinkNBScBankingDetailsModel bm);
}
