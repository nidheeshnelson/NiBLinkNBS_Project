package com.nidheeshnelson.niblinknbs.service;

import java.util.Map;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPaymentDetailsModel;

public interface NiBLinkNBSaiePaymentDetailsService {
	public NiBLinkNBScPaymentDetailsModel showPaymentDet (String s);
	public NiBLinkNBScPaymentDetailsModel editPaymentDet (NiBLinkNBScPaymentDetailsModel pd);
	public Map<String, String> addPaymentDet (NiBLinkNBScPaymentDetailsModel pm);
}
