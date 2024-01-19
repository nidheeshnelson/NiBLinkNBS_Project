package com.nidheeshnelson.niblinknbs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScAddressRepository;

@Service
public class NiBLinkNBSfAddressService implements NiBLinkNBSeAddressService{
	@Autowired
	private NiBLinkNBScAddressRepository ar;
	List<NiBLinkNBScAddressModel> al = new ArrayList<>();
	public NiBLinkNBScAddressModel addAddress(NiBLinkNBScAddressModel am) {
		return ar.save(am);
	}
	public NiBLinkNBScAddressModel editAddress(NiBLinkNBScAddressModel am) {
		al=ar.findAll();
		for(NiBLinkNBScAddressModel asm :al) {
			if(am.getAdmin_id() != null) {
				if(asm.getAdmin_id().equals(am.getAdmin_id())){
					if(am.getHousename()!=null) {
						asm.setHousename(am.getHousename());
					}
					if(am.getStreet()!=null) {
						asm.setStreet(am.getStreet());
					}
					if(am.getLandmark()!=null) {
						asm.setLandmark(am.getLandmark());
					}
					if(am.getPlace()!=null) {
						asm.setPlace(am.getPlace());
					}
					if(am.getPostoffice()!=null) {
						asm.setPostoffice(am.getPostoffice());
					}
					if(am.getPincode()!=0) {
						asm.setPincode(am.getPincode());
					}
					if(am.getLocalbody()!=null) {
						asm.setLocalbody(am.getLocalbody());
					}
					if(am.getThaluk()!=null) {
						asm.setThaluk(am.getThaluk());
					}
					if(am.getDistrict()!=null) {
						asm.setDistrict(am.getDistrict());
					}
					if(am.getState()!=null) {
						asm.setState(am.getState());
					}
					if(am.getCountry()!=null) {
						asm.setCountry(am.getCountry());
					}
				}
			}
		}
		return ar.save(am);
	}
	public List<NiBLinkNBScAddressModel> addressList(){
		return ar.findAll();
	}
}
