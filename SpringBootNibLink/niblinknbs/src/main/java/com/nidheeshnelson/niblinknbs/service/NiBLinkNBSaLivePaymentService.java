package com.nidheeshnelson.niblinknbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLivePaymentModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdPayedModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSgIDs;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSaLivePaymentGatewayRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSdPaymentRepository;

@Service
public class NiBLinkNBSaLivePaymentService implements NiBLinkNBSaiaLivePaymentServices{
	@Autowired
	private NiBLinkNBSdPaymentRepository pr;
	@Autowired
	private NiBLinkNBSaLivePaymentGatewayRepository lpr;
	private List<NiBLinkNBSdPayedModel> pm;
	public double totalAmount(NiBLinkNBSgIDs id) {
		try {
		double d=0;
		pm=pr.findByCustomerid(id.getCustomerid());
		for(NiBLinkNBSdPayedModel pdm:pm) {
			if(pdm.isPaymentdatetimeNull()) {
				d=d+pdm.getPayment();
			}
		}return d;
		}
		catch(Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public boolean cardPayment(NiBLinkNBSaLivePaymentModel pm) {
		pm=lpr.save(pm);
		System.out.println(pm);
		return true;
	}
	public boolean netbankingPayment(NiBLinkNBSaLivePaymentModel pm) {
		pm=lpr.save(pm);
		System.out.println(pm);
		return true;
	}
	public boolean upiPayment(NiBLinkNBSaLivePaymentModel pm) {
		pm=lpr.save(pm);
		System.out.println(pm);
		return true;
	}
}
