package com.nidheeshnelson.niblinknbs.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbaAdminModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbbExpertModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbcCustomerModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScBankingDetailsModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScIdentityModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPersonalModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSbAdminRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSbCustomerRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSbExpertRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScAddressRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScBankingDetailsRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScIdentityRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScPersonalRepository;

@Service
public class NiBLinkNBSbProfileService implements NiBLinkNBSaibProfileService{
	@Autowired
	private NiBLinkNBSbAdminRepository ar;
	@Autowired
	private NiBLinkNBSbExpertRepository er;
	@Autowired
	private NiBLinkNBSbCustomerRepository cr;
	@Autowired
	private NiBLinkNBScAddressRepository adr;
	@Autowired
	private NiBLinkNBScBankingDetailsRepository bdr;
	@Autowired
	private NiBLinkNBScIdentityRepository ir;
	@Autowired
	private NiBLinkNBScPersonalRepository pr;
	private NiBLinkNBSbaAdminModel adm=new NiBLinkNBSbaAdminModel();
	private NiBLinkNBSbbExpertModel exm=new NiBLinkNBSbbExpertModel();
	private NiBLinkNBSbcCustomerModel crm=new NiBLinkNBSbcCustomerModel();
	private NiBLinkNBScAddressModel arm = new NiBLinkNBScAddressModel();
	private NiBLinkNBScBankingDetailsModel bdm = new NiBLinkNBScBankingDetailsModel();
	private NiBLinkNBScIdentityModel idm = new NiBLinkNBScIdentityModel();
	private NiBLinkNBScPersonalModel prm = new NiBLinkNBScPersonalModel();
	public NiBLinkNBSbaAdminModel showAdminName(String s) {
		return ar.findByAdminid(s);
	}
	public Map<String,String> adminName(NiBLinkNBSbaAdminModel am){
		try {
			adm=ar.findByAdminid(am.getAdminid());
			if(!am.isFirstnameNull()) {
			adm.setFirstname(am.getFirstname());
			}
			if(!am.isMiddlenameNull()) {
			adm.setMiddlename(am.getMiddlename());
			}
			if(!am.isLastnameNull()) {
			adm.setLastname(am.getLastname());
			}
			adm=ar.save(adm);
			System.out.println(adm);
			return Map.of("NAME","SUCCESS");
		}catch(Exception e) {
			System.out.println(e);
			return Map.of("NAME","FAILED");
		}
	}
	public NiBLinkNBSbbExpertModel showExpertName(String s) {
		return er.findByExpertid(s);
	}
	public Map<String,String> expertName(NiBLinkNBSbbExpertModel em){
		try {
			exm=er.findByExpertid(em.getExpertid());
			if(!em.isFirstnameNull()) {
			exm.setFirstname(em.getFirstname());
			}
			if(!em.isMiddlenameNull()) {
			exm.setMiddlename(em.getMiddlename());
			}
			if(!em.isLastnameNull()) {
			exm.setLastname(em.getLastname());
			}
			exm=er.save(exm);
			System.out.println(exm);
			return Map.of("NAME","SUCCESS");
		}catch(Exception e) {
			System.out.println(e);
			return Map.of("NAME","FAILED");
		}
	}
	public NiBLinkNBSbcCustomerModel showCustomerName(String s) {
		return cr.findByCustomerid(s);
	}
	public Map<String,String> customerName(NiBLinkNBSbcCustomerModel cm){
		try {
			crm=cr.findByCustomerid(cm.getCustomerid());
			if(!cm.isFirstnameNull()) {
			crm.setFirstname(cm.getFirstname());
			}
			if(!cm.isMiddlenameNull()) {
			crm.setMiddlename(cm.getMiddlename());
			}
			if(!cm.isLastnameNull()) {
			crm.setLastname(cm.getLastname());
			}
			crm=cr.save(null);
			System.out.println(crm);
			return Map.of("NAME","SUCCESS");
		}catch(Exception e) {
			System.out.println(e);
			return Map.of("NAME","FAILED");
		}
	}
	public NiBLinkNBScAddressModel showAddress(String s) {
		return adr.findByAddressid(s);
	}
	public Map<String,String> addressEdit(NiBLinkNBScAddressModel adm){
		try {
			arm=adr.findByAddressid(adm.getAddressid());
			if(!adm.isCountrycodeNull()) {
			arm.setCountrycode(adm.getCountrycode());
			}
			if(!adm.isDistrictcodeNull()) {
			arm.setDistrictcode(adm.getDistrictcode());
			}
			if(!adm.isHousenameNull()) {
			arm.setHousename(adm.getHousename());
			}
			if(!adm.isLandmarkNull()) {
			arm.setLandmark(adm.getLandmark());
			}
			if(!adm.isLocalbodyNull()) {
			arm.setLocalbody(adm.getLocalbody());
			}
			if(!adm.isPincodeNull()) {
			arm.setPincode(adm.getPincode());
			}
			if(!adm.isPlaceNull()) {
			arm.setPlace(adm.getPlace());
			}
			if(!adm.isPostofficeNull()) {
			arm.setPostoffice(adm.getPostoffice());
			}
			if(!adm.isStatecodeNull()) {
			arm.setStatecode(adm.getStatecode());
			}
			if(!adm.isStreetNull()) {
			arm.setStreet(adm.getStreet());
			}
			if(!adm.isThalukcodeNull()) {
			arm.setThalukcode(adm.getThalukcode());
			}
			arm=adr.save(arm);
			System.out.println(arm);
			return Map.of("ADDRESS","SUCCESS");
		}catch(Exception e) {
			System.out.println(e);
			return Map.of("ADDRESS","FAILED");
		}
	}
	public NiBLinkNBScBankingDetailsModel showBanking(String s) {
		return bdr.findByBankid(s);
	}
	public Map<String,String> bankingEdit(NiBLinkNBScBankingDetailsModel bm){
		try {
			bdm=bdr.findByBankid(bm.getBankid());
			if(!bm.isAccountnumberNull()) {
			bdm.setAccountnumber(bm.getAccountnumber());
			}
			if(!bm.isBankNull()) {
			bdm.setBank(bm.getBank());
			}
			if(!bm.isBranchNull()) {
			bdm.setBranch(bm.getBranch());
			}
			if(!bm.isIfscNull()) {
			bdm.setIfsc(bm.getIfsc());
			}
			if(!bm.isSecretpinNull()) {
			bdm.setSecretpin(bm.getSecretpin());
			}
			if(!bm.isUpiidNull()) {
			bdm.setUpiid(bm.getUpiid());
			}
			bdm=bdr.save(bdm);
			System.out.println(bdm);
			return Map.of("BANK","SUCCESS");
		}catch(Exception e) {
			System.out.println(e);
			return Map.of("BANK","FAILED");
		}
	}
	public NiBLinkNBScIdentityModel showIdentity(String s) {
		return ir.findByIdentityid(s);
	}
	public Map<String,String> identityEdit(NiBLinkNBScIdentityModel im){
		try {
			idm=ir.findByIdentityid(im.getIdentityid());
			if(!im.isAdharNull()) {
			idm.setAdhar(im.getAdhar());
			}
			if(!im.isElectionidNull()) {
			idm.setElectionid(im.getElectionid());
			}
			if(!im.isPancardNull()) {
			idm.setPancard(im.getPancard());
			}
			idm=ir.save(idm);
			System.out.println(idm);
			return Map.of("IDENTITY","SUCCESS");
		}catch(Exception e) {
			System.out.println(e);
			return Map.of("IDENTITY","FAILED");
		}
	}
	public NiBLinkNBScPersonalModel showPersonal(String s) {
		return pr.findByPersonalid(s);
	}
	public Map<String,String> personalEdit(NiBLinkNBScPersonalModel pm){
		try {
			prm=pr.findByPersonalid(pm.getPersonalid());
			if(!pm.isAgeNull()) {
			prm.setAge(pm.getAge());
			}
			if(!pm.isChildrenNull()) {
			prm.setChildren(pm.getChildren());
			}
			if(!pm.isDateofbirthNull()) {
			prm.setDateofbirth(pm.getDateofbirth());
			}
			if(!pm.isFatherNull()) {
			prm.setFather(pm.getFather());
			}
			if(!pm.isGenderNull()) {
			prm.setGender(pm.getGender());
			}
			if(!pm.isMotherNull()) {
			prm.setMother(pm.getMother());
			}
			if(!pm.isSpouseNull()) {
			prm.setSpouse(pm.getSpouse());
			}
			prm=pr.save(prm);
			System.out.println(prm);
			return Map.of("PERSONAL","SUCCESS");
		}catch(Exception e) {
			System.out.println(e);
			return Map.of("PERSONAL","FAILED");
		}
	}

}
