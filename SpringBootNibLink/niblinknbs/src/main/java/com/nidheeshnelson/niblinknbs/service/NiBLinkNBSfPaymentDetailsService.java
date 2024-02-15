package com.nidheeshnelson.niblinknbs.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPaymentDetailsModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScPaymentDetailsRepository;

@Service
public class NiBLinkNBSfPaymentDetailsService implements NiBLinkNBSaiePaymentDetailsService{
	@Autowired
	private NiBLinkNBScPaymentDetailsRepository pr;
	private NiBLinkNBScPaymentDetailsModel pm;
	public NiBLinkNBScPaymentDetailsModel showPaymentDet (String s) {
		return pr.findByPaymentid(s);
	}
	
	public Map<String, String> addPaymentDet (NiBLinkNBScPaymentDetailsModel pm) {
		pm=pr.save(pm);
		return Map.of("PAYDET",pm.getPaymentid());
	}
	
	public NiBLinkNBScPaymentDetailsModel editPaymentDet (NiBLinkNBScPaymentDetailsModel pm) {
		this.pm=pr.findByPaymentid(pm.getPaymentid());
		try {
		if(pm.getCommissionid()!=null) {
			this.pm.setCommissionid(pm.getCommissionid());
		}
		if(pm.getPaymentperhour()!=0) {
			this.pm.setPaymentperhour(pm.getPaymentperhour());
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return pr.save(this.pm);
	}
	
}
