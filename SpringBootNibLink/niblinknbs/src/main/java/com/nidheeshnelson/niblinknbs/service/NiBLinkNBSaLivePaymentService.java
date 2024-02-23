package com.nidheeshnelson.niblinknbs.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSLists;
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
	private List<NiBLinkNBSdPayedModel> pm;
	private List<NiBLinkNBSLists> list=new ArrayList<NiBLinkNBSLists>();
	private NiBLinkNBSLists lis=new NiBLinkNBSLists();
	public List<NiBLinkNBSLists> totalAmount(NiBLinkNBSgIDs id) {
		try {
		pm=pr.findByCustomerid(id.getCustomerid());
		for(NiBLinkNBSdPayedModel pdm:pm) {
			if(pdm.isPaymentdatetimeNull()) {
				lis.setMss(Map.of("SHIFT", pdm.getShiftid()));
				lis.setMsd(Map.of(pdm.getShiftid(), pdm.getPayment()));
				list.add(lis);
				System.out.println(list);
			}
		}return list;
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
