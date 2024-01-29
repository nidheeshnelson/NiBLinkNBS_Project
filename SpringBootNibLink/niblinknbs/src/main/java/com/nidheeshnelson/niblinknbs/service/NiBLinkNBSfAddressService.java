package com.nidheeshnelson.niblinknbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScAddressRepository;

@Service
public class NiBLinkNBSfAddressService implements NiBLinkNBSeAddressService{
	@Autowired
	private NiBLinkNBScAddressRepository ar;
	public NiBLinkNBScAddressModel showAddress(NiBLinkNBScAddressModel am) {
		am=ar.findByAddressid(am.getAddressid());
		return am;
	}
	public NiBLinkNBScAddressModel editAddress(NiBLinkNBScAddressModel am) {
		am=ar.save(am);
		return am;
	}
}
