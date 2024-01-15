package com.nidheeshnelson.niblinknbs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLogInModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbAdminModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbCustomerModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbExpertModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSaLogInRepository;

@Service
public class NiBLinkNBSdLogIn implements NiBLinkNBSaService{
	private NiBLinkNBSaLogInRepository lr;
	public Object signIn(NiBLinkNBSaLogInModel m) {
		List<NiBLinkNBSaLogInModel> log = new ArrayList<>();
		log = lr.findAll();
		Object o=null;
		for(NiBLinkNBSaLogInModel lg : log) {
			if(lg.getUsername().equals(m.getUsername())) {
				if(lg.getCustomer_id() != null) {
					NiBLinkNBSbCustomerModel cm = new  NiBLinkNBSbCustomerModel();
					cm.setLog_id(lg);
					o= cm;
				}
				else if(lg.getExpert_id()!= null) {
					NiBLinkNBSbExpertModel em = new NiBLinkNBSbExpertModel();
					em.setLog_id(lg);
					o= em;
				}
				else if(lg.getAdmin_id()!= null) {
					NiBLinkNBSbAdminModel am = new NiBLinkNBSbAdminModel();
					am.setLog_id(lg);
					o=am;
				}
			}
			
		}
		return o;
		
	}
}
