package com.nidheeshnelson.niblinknbs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaJobModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbaAdminModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSaJobRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSbAdminRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScAddressRepository;

@Service
public class NiBLinkNBScAdminService implements NiBLinkNBSbAdminService{
//	@Autowired
//private NiBLinkNBSaJobRepository jr;
//	@Autowired
//	private NiBLinkNBSbAdminRepository ar;
//	
////	private NiBLinkNBSfAddressService2 ads= new NiBLinkNBSfAddressService2();
//	private NiBLinkNBScAddressModel adr = new NiBLinkNBScAddressModel();
//	private List<NiBLinkNBSbaAdminModel> al = new ArrayList<>();
//	private NiBLinkNBSbaAdminModel admm = new NiBLinkNBSbaAdminModel();
//	private List<NiBLinkNBSaJobModel> jl = new ArrayList<>();
//	public NiBLinkNBSaJobModel addJob(NiBLinkNBSaJobModel jm){
//		jm=jr.save(jm);
//		return jm;
//	}
//	public List<NiBLinkNBSaJobModel> jobList() {
//		return jr.findAll();
//	}
//	public NiBLinkNBScAddressModel adminAddress(NiBLinkNBScAddressModel am,NiBLinkNBScAddressModel asm ) {
//		al=ar.findAll();
//		for(NiBLinkNBSbAdminModel adm:al) {
//			admm.setAdmin_id(adm.getAdmin_id());
//			adr.setAdmin_id(admm);
//			if(adr.getAdmin_id().equals(am.getAdmin_id())){
//				am=ads.edit(am, asm);
//					}
//			else{am=null;}}
//		return am;
//		
//	}
}
