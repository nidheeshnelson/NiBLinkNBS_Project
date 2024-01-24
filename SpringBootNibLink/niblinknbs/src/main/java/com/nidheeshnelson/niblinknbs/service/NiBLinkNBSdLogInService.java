package com.nidheeshnelson.niblinknbs.service;

import java.util.ArrayList;
import java.util.List;

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

import jakarta.transaction.Transactional;

@Service
public class NiBLinkNBSdLogInService implements NiBLinkNBSaLogInService{
	@Autowired
	private NiBLinkNBSaLogInRepository lr;
	@Autowired
	private NiBLinkNBSbAdminRepository ar;
	@Autowired
	private NiBLinkNBSbExpertRepository er;
	@Autowired
	private NiBLinkNBSbCustomerRepository cr;
	@Autowired
	private NiBLinkNBScAddressRepository adr;
	@Autowired
	private NiBLinkNBSaStatusRepository sr;
	@Autowired
	private NiBLinkNBScBankingDetailsRepository br;
	@Autowired
	private NiBLinkNBScIdentityRepository ir;
	@Autowired
	private NiBLinkNBScPaymentDetailsRepository pr;
	@Autowired
	private NiBLinkNBScPersonalRepository per;
	private NiBLinkNBScWalletRepository wr;
	private NiBLinkNBSbcCustomerModel cm = new  NiBLinkNBSbcCustomerModel();
	private NiBLinkNBSbbExpertModel em = new NiBLinkNBSbbExpertModel();
	private NiBLinkNBSbaAdminModel am = new NiBLinkNBSbaAdminModel();
	private NiBLinkNBSaLogInModel lm = new NiBLinkNBSaLogInModel();
	private NiBLinkNBScAddressModel asm =new NiBLinkNBScAddressModel();
	private NiBLinkNBSaStatusModel sm = new NiBLinkNBSaStatusModel();
	private NiBLinkNBScBankingDetailsModel bm = new NiBLinkNBScBankingDetailsModel();
	private NiBLinkNBScIdentityModel im = new NiBLinkNBScIdentityModel();
	private NiBLinkNBScPaymentDetailsModel pm = new NiBLinkNBScPaymentDetailsModel();
	private NiBLinkNBScPersonalModel pem = new NiBLinkNBScPersonalModel();
	private NiBLinkNBScWalletModel wm = new NiBLinkNBScWalletModel();
	private List<NiBLinkNBSaLogInModel> log = new ArrayList<>();
	private List<NiBLinkNBSbaAdminModel> lam = new ArrayList<>();
	private List<NiBLinkNBSbbExpertModel> lem = new ArrayList<>();
	private List<NiBLinkNBSbcCustomerModel> lcm = new ArrayList<>();
	private Object obj=new Object();
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
			am.setNamelistid(sm);
			ar.save(am);
		}
		else if(ts.equals(NiBLinkNBSTypeSignInService.EXPERT)) {
			System.out.println("in expert signup service"+ts);
			m=lr.save(m);
			m.setGeneratedid("EXPERT"+m.getLogid());
			System.out.println(m);
			m=lr.save(m);
			sm.setNamelistid(m.getGeneratedid());
			sm.setStatus(m.getStatus());
			sm=sr.save(sm);
			em.setNamelistid(sm);
			em=er.save(em);
			pm.setExpertid(em);
			pm=pr.save(pm);
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
			cm.setNamelistid(sm);
			cr.save(cm);
		}
		bm.setNamelistid(sm);
		bm=br.save(bm);
		System.out.println(bm);
		asm.setNamelistid(sm);
		asm=adr.save(asm);
		System.out.println(asm);
		im.setNamelistid(sm);
		im=ir.save(im);
		System.out.println(im);
		pem.setNamelistid(sm);
		pem=per.save(pem);
		System.out.println(pem);
		wm.setNamelistid(sm);
		wm=wr.save(wm);
		System.out.println(wm);
		}catch(Exception e) {
			System.out.println(e);
		}
		return m;
		
	}
}
