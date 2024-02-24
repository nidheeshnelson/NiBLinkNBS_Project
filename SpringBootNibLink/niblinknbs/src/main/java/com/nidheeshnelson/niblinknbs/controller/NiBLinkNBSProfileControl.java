package com.nidheeshnelson.niblinknbs.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbaAdminModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbbExpertModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbcCustomerModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScBankingDetailsModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScIdentityModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPersonalModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSaibProfileService;

@RestController
@CrossOrigin
@RequestMapping("/profile")
public class NiBLinkNBSProfileControl {
	@Autowired
	private NiBLinkNBSaibProfileService ps;
	@PostMapping("/showadminname")
	public NiBLinkNBSbaAdminModel showAdminName(@RequestBody String s) {
		System.out.println(s);
		return ps.showAdminName(s);
	}
	@PostMapping("/editadminname")
	public Map<String,String> adminName(@RequestBody NiBLinkNBSbaAdminModel am){
		System.out.println(am);
		return ps.adminName(am);
	}
	@PostMapping("/showexpertname")
	public NiBLinkNBSbbExpertModel showExpertName(@RequestBody String s) {
		System.out.println(s);
		return ps.showExpertName(s);
	}
	@PostMapping("/editexpertname")
	public Map<String,String> expertName(@RequestBody NiBLinkNBSbbExpertModel em){
		System.out.println(em);
		return ps.expertName(em);
	}
	@PostMapping("/showcustomername")
	public NiBLinkNBSbcCustomerModel showCustomerName(@RequestBody String s) {
		System.out.println(s);
		return ps.showCustomerName(s);
	}
	@PostMapping("/editcustomername")
	public Map<String,String> customerName(@RequestBody NiBLinkNBSbcCustomerModel cm){
		System.out.println(cm);
		return ps.customerName(cm);
	}
	@PostMapping("/showaddress")
	public NiBLinkNBScAddressModel showAddress(@RequestBody String s) {
		System.out.println(s);
		return ps.showAddress(s);
	}
	@PostMapping("/editaddress")
	public Map<String,String> addressEdit(@RequestBody NiBLinkNBScAddressModel adm){
		System.out.println(adm);
		return ps.addressEdit(adm);
	}
	@PostMapping("/showbanking")
	public NiBLinkNBScBankingDetailsModel showBanking(@RequestBody String s) {
		System.out.println(s);
		return ps.showBanking(s);
	}
	@PostMapping("/editbanking")
	public Map<String,String> bankingEdit(@RequestBody NiBLinkNBScBankingDetailsModel bm){
		System.out.println(bm);
		return ps.bankingEdit(bm);
	}
	@PostMapping("/showidentity")
	public NiBLinkNBScIdentityModel showIdentity(@RequestBody String s) {
		System.out.println(s);
		return ps.showIdentity(s);
	}
	@PostMapping("/editidentity")
	public Map<String,String> identityEdit(@RequestBody NiBLinkNBScIdentityModel im){
		System.out.println(im);
		return ps.identityEdit(im);
	}
	@PostMapping("/showpersonal")
	public NiBLinkNBScPersonalModel showPersonal(@RequestBody String s) {
		System.out.println(s);
		return ps.showPersonal(s);
	}
	@PostMapping("/editpersonal")
	public Map<String,String> personalEdit(@RequestBody NiBLinkNBScPersonalModel pm){
		System.out.println(pm);
		return ps.personalEdit(pm);
	}
}
