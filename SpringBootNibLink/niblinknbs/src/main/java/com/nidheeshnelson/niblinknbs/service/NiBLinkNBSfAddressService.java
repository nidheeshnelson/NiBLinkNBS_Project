package com.nidheeshnelson.niblinknbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScAddressRepository;

@Service
public class NiBLinkNBSfAddressService implements NiBLinkNBSeAddressService{
	@Autowired
	private NiBLinkNBScAddressRepository ar;
	private NiBLinkNBScAddressModel am;
	public NiBLinkNBScAddressModel showAddress(String s) {
		return ar.findByAddressid(s);
	}
	
	public NiBLinkNBScAddressModel addAddress(NiBLinkNBScAddressModel am) {
		am=ar.save(am);
		return am;
	}
	
	public NiBLinkNBScAddressModel editAddress(NiBLinkNBScAddressModel am) {
		this.am=ar.findByAddressid(am.getAddressid());
		if(am.getCountrycode()!=null) {
			
		}
		if(am.getDistrictcode()!=null) {
			
		}
		if(am.getHousename()!=null) {
			
		}
		if(am.getLandmark()!=null) {
			
		}
		if(am.getLocalbody()!=null) {
			
		}
		if(am.getPincode()!=0) {
			
		}
		if(am.getPlace()!=null) {
			
		}
		if(am.getPostoffice()!=null) {
			
		}
		if(am.getStatecode()!=null) {
			
		}
		if(am.getStreet()!=null) {
			
		}
		if(am.getThalukcode()!=null) {
			
		}
		return am;
	}
}
