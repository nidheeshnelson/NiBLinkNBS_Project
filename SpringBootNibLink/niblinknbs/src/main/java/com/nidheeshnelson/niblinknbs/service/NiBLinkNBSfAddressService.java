package com.nidheeshnelson.niblinknbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScAddressRepository;

@Service
public class NiBLinkNBSfAddressService implements NiBLinkNBSaieAddressService{
	@Autowired
	private NiBLinkNBScAddressRepository ar;
	private NiBLinkNBScAddressModel am;
	public NiBLinkNBScAddressModel showAddress(String s) {
		return ar.findByAddressid(s);
	}
	
	public NiBLinkNBScAddressModel addAddress(NiBLinkNBScAddressModel am) {
		return ar.save(am);
	}
	
	public NiBLinkNBScAddressModel editAddress(NiBLinkNBScAddressModel am) {
		this.am=ar.findByAddressid(am.getAddressid());
		if(am.getCountrycode()!=null) {
			this.am.setCountrycode(am.getCountrycode());
		}
		if(am.getDistrictcode()!=null) {
			this.am.setDistrictcode(am.getDistrictcode());
		}
		if(am.getHousename()!=null) {
			this.am.setHousename(am.getHousename());
		}
		if(am.getLandmark()!=null) {
			this.am.setLandmark(am.getLandmark());
		}
		if(am.getLocalbody()!=null) {
			this.am.setLocalbody(am.getLocalbody());
		}
		if(am.getPincode()!=0) {
			this.am.setPincode(am.getPincode());
		}
		if(am.getPlace()!=null) {
			this.am.setPlace(am.getPlace());
		}
		if(am.getPostoffice()!=null) {
			this.am.setPostoffice(am.getPostoffice());
		}
		if(am.getStatecode()!=null) {
			this.am.setStatecode(am.getStatecode());
		}
		if(am.getStreet()!=null) {
			this.am.setStreet(am.getStreet());
		}
		if(am.getThalukcode()!=null) {
			this.am.setThalukcode(am.getThalukcode());
		}
		return ar.save(this.am);
	}
}
