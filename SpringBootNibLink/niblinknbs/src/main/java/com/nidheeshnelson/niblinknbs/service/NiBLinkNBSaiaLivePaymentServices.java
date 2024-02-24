package com.nidheeshnelson.niblinknbs.service;

import java.util.List;
import java.util.Map;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLivePaymentModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSgIDs;

public interface NiBLinkNBSaiaLivePaymentServices {
	public List<NiBLinkNBSgIDs> totalAmount(NiBLinkNBSgIDs id);
	public Map<String, String> cardPayment(NiBLinkNBSaLivePaymentModel pm);
	public Map<String, String> netbankingPayment(NiBLinkNBSaLivePaymentModel pm);
	public Map<String, String> upiPayment(NiBLinkNBSaLivePaymentModel pm);
}
