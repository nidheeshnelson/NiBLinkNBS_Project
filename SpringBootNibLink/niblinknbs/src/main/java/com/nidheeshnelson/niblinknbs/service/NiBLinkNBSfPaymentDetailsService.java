package com.nidheeshnelson.niblinknbs.service;

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
	
	public NiBLinkNBScPaymentDetailsModel addPaymentDet (NiBLinkNBScPaymentDetailsModel pm) {
		return pr.save(pm);
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
