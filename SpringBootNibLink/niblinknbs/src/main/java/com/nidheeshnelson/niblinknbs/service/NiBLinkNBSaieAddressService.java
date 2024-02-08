package com.nidheeshnelson.niblinknbs.service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;

public interface NiBLinkNBSaieAddressService {
	public NiBLinkNBScAddressModel showAddress(String s);
	public NiBLinkNBScAddressModel addAddress(NiBLinkNBScAddressModel am);
	public NiBLinkNBScAddressModel editAddress(NiBLinkNBScAddressModel am);
}
