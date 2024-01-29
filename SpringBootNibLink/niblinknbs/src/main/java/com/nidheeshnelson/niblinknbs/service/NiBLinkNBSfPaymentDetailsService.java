package com.nidheeshnelson.niblinknbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPaymentDetailsModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScPaymentDetailsRepository;

@Service
public class NiBLinkNBSfPaymentDetailsService implements NiBLinkNBSePaymentDetailsService{
	@Autowired
	private NiBLinkNBScPaymentDetailsRepository pr;
	public NiBLinkNBScPaymentDetailsModel editPaymentDet (NiBLinkNBScPaymentDetailsModel pd) {
		System.out.println(pd);
		pd=pr.save(pd);
		return pd;
	}
	public NiBLinkNBScPaymentDetailsModel showPaymentDet (NiBLinkNBScPaymentDetailsModel pd) {
		pd=pr.findByPaymentid(pd.getPaymentid());
		return pd;
	}
}
