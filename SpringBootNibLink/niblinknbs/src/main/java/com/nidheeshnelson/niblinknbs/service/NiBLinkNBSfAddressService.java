package com.nidheeshnelson.niblinknbs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbaAdminModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbcCustomerModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbbExpertModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSbAdminRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSbCustomerRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSbExpertRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScAddressRepository;

@Service
public class NiBLinkNBSfAddressService implements NiBLinkNBSeAddressService{
	@Autowired
	private NiBLinkNBScAddressRepository ar;
	@Autowired
	private NiBLinkNBSbAdminRepository adr;
	@Autowired
	private NiBLinkNBSbExpertRepository exr;
	@Autowired
	private NiBLinkNBSbCustomerRepository csr;
	
//	private NiBLinkNBScAdminService adms=new NiBLinkNBScAdminService();
//	private NiBLinkNBSfAddressService  self=new NiBLinkNBSfAddressService();
	private List<NiBLinkNBScAddressModel> al = new ArrayList<>();
	private List<NiBLinkNBSbaAdminModel> adl=new ArrayList<>();
	private List<NiBLinkNBSbbExpertModel> edl=new ArrayList<>();
	private List<NiBLinkNBSbcCustomerModel> cdl=new ArrayList<>();
	private NiBLinkNBSbaAdminModel amd=new NiBLinkNBSbaAdminModel();
	private NiBLinkNBSbaAdminModel amd2=new NiBLinkNBSbaAdminModel();
	private NiBLinkNBScAddressModel adsm=new NiBLinkNBScAddressModel();
	private NiBLinkNBSbcCustomerModel cmd=new NiBLinkNBSbcCustomerModel();
	private NiBLinkNBSbbExpertModel emd=new NiBLinkNBSbbExpertModel();
//	public NiBLinkNBScAddressModel addAddress(NiBLinkNBScAddressModel am) {
//		return ar.save(am);
//	}
//	public NiBLinkNBScAddressModel findAdmin(NiBLinkNBScAddressModel am) {
		
//		al=ar.findAll();
//		for(NiBLinkNBScAddressModel asm :al) {
//			amd=asm.getAdmin_id();
//			amd2=am.getAdmin_id();
//			System.out.println(amd+"hii"+amd2);
//			if(amd!=null) {
//			try {
//				
//			if(amd!=null&&amd.getAdmin_id()==(amd2.getAdmin_id())) {
//				am=asm;
//			}
//		}catch(Exception e) {
//				System.out.println(e);}
//			}
//		}
//		return am;
//	}
//	public NiBLinkNBScAddressModel edit(NiBLinkNBScAddressModel am) {
//		return am;
//	}
//	public NiBLinkNBScAddressModel editAddress(NiBLinkNBScAddressModel am) {
//		System.out.println(am);
//		al=ar.findAll();
//		for(NiBLinkNBScAddressModel asm :al) {
//			System.out.println("service"+asm);
//			if(am.getAdmin_id() != null) {
//				am=adms.adminAddress(am, asm);
//						}
//			else if(am.getExpert_id()!=null){
//				am=self.expertAddress(am, asm);
//						}
//			else if(am.getCustomer_id()!=null) {
//				am=self.customerAddress(am, asm);
//						}
//			else {
//				am=null;
//			}
//		}
//		return am;
//	}
//	public NiBLinkNBScAddressModel adminAddress(NiBLinkNBScAddressModel am,NiBLinkNBScAddressModel asm ) {
//		adl=adr.findAll();
//		for(NiBLinkNBSbAdminModel adm:adl) {
//			amd.setAdmin_id(adm.getAdmin_id());
//			adsm.setAdmin_id(amd);
//			if(adsm.getAdmin_id().equals(am.getAdmin_id())){
//				am=self.edit(am, asm);
//					}
//			else{am=null;}}
//		return am;
//		
//	}
//	public NiBLinkNBScAddressModel expertAddress(NiBLinkNBScAddressModel am, NiBLinkNBScAddressModel asm) {
//		edl=exr.findAll();
//		for(NiBLinkNBSbExpertModel exm: edl) {
//			emd.setExpert_id(exm.getExpert_id());
//			adsm.setExpert_id(emd);
//			if(adsm.getExpert_id().equals(am.getExpert_id())) {
//				am=self.edit(am, asm);
//				}
//		else {am=null;}
//			}
//		return am;
//	}
//	public NiBLinkNBScAddressModel customerAddress(NiBLinkNBScAddressModel am,NiBLinkNBScAddressModel asm) {
//		cdl=csr.findAll();
//		for(NiBLinkNBSbCustomerModel csm: cdl) {
//			cmd.setCustomer_id(csm.getCustomer_id());
//			adsm.setCustomer_id(cmd);
//			if(adsm.getCustomer_id().equals(am.getCustomer_id())) {
//				am= self.edit(am, asm);
//					}
//			else{am=null;}}
//		return am;
//	}
//	public NiBLinkNBScAddressModel edit(NiBLinkNBScAddressModel am, NiBLinkNBScAddressModel asm) {
//		if(am.getHousename()!=null) {
//			asm.setHousename(am.getHousename());
//			}
//			if(am.getStreet()!=null) {
//			asm.setStreet(am.getStreet());
//			}
//			if(am.getLandmark()!=null) {
//			asm.setLandmark(am.getLandmark());
//			}
//			if(am.getPlace()!=null) {
//			asm.setPlace(am.getPlace());
//			}
//			if(am.getPostoffice()!=null) {
//			asm.setPostoffice(am.getPostoffice());
//			}
//			if(am.getPincode()!=0) {
//			asm.setPincode(am.getPincode());
//			}
//			if(am.getLocalbody()!=null) {
//			asm.setLocalbody(am.getLocalbody());
//			}
//			if(am.getThaluk()!=null) {
//			asm.setThaluk(am.getThaluk());
//			}
//			if(am.getDistrict()!=null) {
//			asm.setDistrict(am.getDistrict());
//			}
//			if(am.getState()!=null) {
//			asm.setState(am.getState());
//			}
//			if(am.getCountry()!=null) {
//			asm.setCountry(am.getCountry());
//			}
//			return ar.save(asm);
//	}
//	public List<NiBLinkNBScAddressModel> addressList(){
//		return ar.findAll();
//	}
}
