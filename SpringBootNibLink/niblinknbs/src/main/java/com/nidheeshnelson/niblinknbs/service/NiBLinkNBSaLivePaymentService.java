package com.nidheeshnelson.niblinknbs.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLivePaymentModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdPayedModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSgIDs;
import com.nidheeshnelson.niblinknbs.model.PaymentMode;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSaLivePaymentGatewayRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSdPaymentRepository;

@Service
public class NiBLinkNBSaLivePaymentService implements NiBLinkNBSaiaLivePaymentServices{
	@Autowired
	private NiBLinkNBSdPaymentRepository pr;
	@Autowired
	private NiBLinkNBSaLivePaymentGatewayRepository lpr;
	private NiBLinkNBSgIDs id = new NiBLinkNBSgIDs();
	private List<NiBLinkNBSgIDs> idl = new ArrayList<NiBLinkNBSgIDs>();
	private List<NiBLinkNBSdPayedModel> pm;
	public List<NiBLinkNBSgIDs> totalAmount(NiBLinkNBSgIDs id) {
		try {
		pm=pr.findByCustomerid(id.getCustomerid());
		for(NiBLinkNBSdPayedModel pdm:pm) {
			if(pdm.isPaymentdatetimeNull()) {
				this.id.setShiftid(pdm.getShiftid());
				this.id.setHoursforwork(pdm.getPayment());
				idl.add(this.id);
				System.out.println(idl);
			}
		}return idl;
		}
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
	public Map<String, String> cardPayment(NiBLinkNBSaLivePaymentModel pm) {
		pm.setTransactiondatetime(LocalDateTime.now());
		pm.setMode(PaymentMode.CARD);
		pm=lpr.save(pm);
		System.out.println(pm);
		return Map.of("TRANSACTION", Integer.toString(pm.getLivepaymentid()));
	}
	public Map<String, String> netbankingPayment(NiBLinkNBSaLivePaymentModel pm) {
		pm.setTransactiondatetime(LocalDateTime.now());
		pm.setMode(PaymentMode.NETBANK);
		pm=lpr.save(pm);
		System.out.println(pm);
		return Map.of("TRANSACTION", Integer.toString(pm.getLivepaymentid()));
	}
	public Map<String, String> upiPayment(NiBLinkNBSaLivePaymentModel pm) {
		pm.setTransactiondatetime(LocalDateTime.now());
		pm.setMode(PaymentMode.UPI);
		pm=lpr.save(pm);
		System.out.println(pm);
		return Map.of("TRANSACTION", Integer.toString(pm.getLivepaymentid()));
	}
}
