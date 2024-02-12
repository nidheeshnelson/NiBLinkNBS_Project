package com.nidheeshnelson.niblinknbs.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfCountryModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfDistrictModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfStateModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSaiePlace;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class NiBLinkNBSAdminControl {
	@Autowired
	private NiBLinkNBSaiePlace p;
	@PostMapping("/addcountry")
	public Map<String, String> addCountry(@RequestBody NiBLinkNBSfCountryModel cm){
		return p.addCountry(cm);
	}
	@GetMapping("/allcountry")
	public List<NiBLinkNBSfCountryModel> countryList(){
		return p.countryList();
	}
	@PostMapping("/addstate")
	public Map<String, String> addstate(@RequestBody NiBLinkNBSfStateModel sm){
		System.out.println(sm);
		return p.addState(sm);
	}
	@GetMapping("/allstate")
	public List<NiBLinkNBSfStateModel> stateList(){
		return p.stateList();
	}
	@PostMapping("/statebycountry")
	public List<NiBLinkNBSfStateModel> stateByCountryCode(@RequestBody Map<String, String> requestBody) {
	    String countrycode = requestBody.get("countrycode");
		System.out.println(countrycode);
		return p.stateListByCountryCode(countrycode);
	}
	@PostMapping("/adddistrict")
	public Map<String, String> addstate(@RequestBody NiBLinkNBSfDistrictModel dm){
		System.out.println(dm);
		return p.addDistrict(dm);
	}
	@GetMapping("/alldistrict")
	public List<NiBLinkNBSfDistrictModel> districtList(){
		return p.districtList();
	}
	@PostMapping("/districtbystate")
	public List<NiBLinkNBSfDistrictModel> districtByStateCode(@RequestBody Map<String, String> requestBody) {
	    String statecode = requestBody.get("statecode");
		System.out.println(statecode);
		return p.districtListByStateCode(statecode);
	}
}