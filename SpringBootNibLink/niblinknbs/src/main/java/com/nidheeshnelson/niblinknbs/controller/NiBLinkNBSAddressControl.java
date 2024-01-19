package com.nidheeshnelson.niblinknbs.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSfAddressService;

@RestController
@CrossOrigin
public class NiBLinkNBSAddressControl {
	@Autowired
	private NiBLinkNBSfAddressService as;
	private Map<String, Integer> mp = new HashMap<>();
	private NiBLinkNBScAddressModel adm = new NiBLinkNBScAddressModel();
	@GetMapping("/ads")
	public Map<String, Integer> addAddress(@RequestBody NiBLinkNBScAddressModel am){
		am=as.addAddress(am);
		if(am.getAddress_id()!=0) {
			mp.put("ADDRESS_ID", am.getAddress_id());
		}
		else {
			mp.put("FAILED", 0);
		}
		return mp;
	}
	@GetMapping("/eds")
	public Map<String, Integer> editAddress(@RequestBody NiBLinkNBScAddressModel am){
		adm=as.editAddress(am);
		if(adm!=null) {
			mp.put("ADDRESS_ID", adm.getAddress_id());
		}
		else {
			mp.put("FAILED", 0);
		}
		return mp;
	}
	@GetMapping("adl")
	public List<NiBLinkNBScAddressModel> addressList (){
		return as.addressList();
	}
}
