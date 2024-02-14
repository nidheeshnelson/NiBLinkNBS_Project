package com.nidheeshnelson.niblinknbs.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLogInModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaStatusModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbaAdminModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbcCustomerModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScBankingDetailsModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScIdentityModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPaymentDetailsModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPersonalModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScWalletModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbbExpertModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSaLogInRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSaStatusRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSbAdminRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSbCustomerRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSbExpertRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScAddressRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScBankingDetailsRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScIdentityRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScPaymentDetailsRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScPersonalRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScWalletRepository;

@Service
public class NiBLinkNBSdLogInService implements NiBLinkNBSaiaLogInService{
	@Autowired
	private NiBLinkNBSaLogInRepository lr;
	@Autowired
	private NiBLinkNBSbAdminRepository ar;
	@Autowired
	private NiBLinkNBSbExpertRepository er;
	@Autowired
	private NiBLinkNBSbCustomerRepository cr;
	@Autowired
	private NiBLinkNBSaStatusRepository sr;
	@Autowired
	private NiBLinkNBScAddressRepository adr;
	@Autowired
	private NiBLinkNBScBankingDetailsRepository bdr;
	@Autowired
	private NiBLinkNBScIdentityRepository ir;
	@Autowired
	private NiBLinkNBScPaymentDetailsRepository pdr;
	@Autowired
	private NiBLinkNBScPersonalRepository pr;
	@Autowired
	private NiBLinkNBScWalletRepository wr;
	private NiBLinkNBSbcCustomerModel cm = new  NiBLinkNBSbcCustomerModel();
	private NiBLinkNBSbbExpertModel em = new NiBLinkNBSbbExpertModel();
	private NiBLinkNBSbaAdminModel am = new NiBLinkNBSbaAdminModel();
	private NiBLinkNBSaStatusModel sm = new NiBLinkNBSaStatusModel();
	private NiBLinkNBScAddressModel adm = new NiBLinkNBScAddressModel();
	private NiBLinkNBScBankingDetailsModel bdm = new NiBLinkNBScBankingDetailsModel();
	private NiBLinkNBScIdentityModel idm = new NiBLinkNBScIdentityModel();
	private NiBLinkNBScPaymentDetailsModel pdm = new NiBLinkNBScPaymentDetailsModel();
	private NiBLinkNBScPersonalModel plm = new NiBLinkNBScPersonalModel();
	private NiBLinkNBScWalletModel wm = new NiBLinkNBScWalletModel();
	private Map<String, String> mp = new HashMap<>();
	public NiBLinkNBSaLogInModel signUp(NiBLinkNBSaLogInModel m,NiBLinkNBSTypeSignInService ts) {
		try {
		if(ts.equals(NiBLinkNBSTypeSignInService.ADMIN)) {
			System.out.println("in admin signup service "+ts);
			m=lr.save(m);
			System.out.println("saved"+m);
			m.setGeneratedid("ADMIN"+m.getLogid());
			System.out.println(m);
			m=lr.save(m);
			sm.setNamelistid(m.getGeneratedid());
			sm.setStatus(m.getStatus());
			sm=sr.save(sm);
			System.out.println(sm);
			am.setAdminid(m.getGeneratedid());
			am=ar.save(am);
			System.out.println(am);
		}
		else if(ts.equals(NiBLinkNBSTypeSignInService.EXPERT)) {
			System.out.println("in expert signup service "+ts);
			m=lr.save(m);
			m.setGeneratedid("EXPERT"+m.getLogid());
			System.out.println(m);
			m=lr.save(m);
			sm.setNamelistid(m.getGeneratedid());
			sm.setStatus(m.getStatus());
			sm=sr.save(sm);
			em.setExpertid(m.getGeneratedid());
			er.save(em);
			pdm.setPaymentid(m.getGeneratedid());
			pdr.save(pdm);
		}
		else if(ts.equals(NiBLinkNBSTypeSignInService.CUSTOMER)) {
			System.out.println("in customer signup service "+ts);
			m=lr.save(m);
			m.setGeneratedid("CUSTOM"+m.getLogid());
			System.out.println(m);
			m=lr.save(m);
			sm.setNamelistid(m.getGeneratedid());
			sm.setStatus(m.getStatus());
			sm=sr.save(sm);
			cm.setCustomerid(m.getGeneratedid());
			cr.save(cm);
		}
		adm.setAddressid(m.getGeneratedid());
		adr.save(adm);
		bdm.setBankid(m.getGeneratedid());
		bdr.save(bdm);
		idm.setIdentityid(m.getGeneratedid());
		ir.save(idm);
		plm.setPersonalid(m.getGeneratedid());
		pr.save(plm);
		wm.setWalletid(m.getGeneratedid());
		wr.save(wm);
		}catch(Exception e) {
			System.out.println(e);
		}
		return m;
	}
	public Map<String, String> logIn(NiBLinkNBSaLogInModel lm) {
		try {
		lm=lr.findByUsernameAndPassword(lm.getUsername(), lm.getPassword());
		mp.put("ID", lm.getGeneratedid());
		System.out.println(mp ); 
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return mp;
	}
}
