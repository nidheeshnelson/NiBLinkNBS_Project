package com.nidheeshnelson.niblinknbs.service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPaymentDetailsModel;

public interface NiBLinkNBSaiePaymentDetailsService {
	public NiBLinkNBScPaymentDetailsModel showPaymentDet (String s);
	public NiBLinkNBScPaymentDetailsModel editPaymentDet (NiBLinkNBScPaymentDetailsModel pd);
	public NiBLinkNBScPaymentDetailsModel addPaymentDet (NiBLinkNBScPaymentDetailsModel pm);
}
