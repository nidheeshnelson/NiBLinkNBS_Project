package com.nidheeshnelson.niblinknbs.service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLivePaymentModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSgIDs;

public interface NiBLinkNBSaiaLivePaymentServices {
	public double totalAmount(NiBLinkNBSgIDs id);
	public boolean cardPayment(NiBLinkNBSaLivePaymentModel pm);
	public boolean netbankingPayment(NiBLinkNBSaLivePaymentModel pm);
	public boolean upiPayment(NiBLinkNBSaLivePaymentModel pm);
}
