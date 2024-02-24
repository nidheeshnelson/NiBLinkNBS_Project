package com.nidheeshnelson.niblinknbs.service;

import java.util.Map;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbaAdminModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbbExpertModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbcCustomerModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScAddressModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScBankingDetailsModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScIdentityModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPersonalModel;

public interface NiBLinkNBSaibProfileService {
	public NiBLinkNBSbaAdminModel showAdminName(String s);
	public Map<String,String> adminName(NiBLinkNBSbaAdminModel am);
	public NiBLinkNBSbbExpertModel showExpertName(String s);
	public Map<String,String> expertName(NiBLinkNBSbbExpertModel em);
	public NiBLinkNBSbcCustomerModel showCustomerName(String s);
	public Map<String,String> customerName(NiBLinkNBSbcCustomerModel cm);
	public NiBLinkNBScAddressModel showAddress(String s);
	public Map<String,String> addressEdit(NiBLinkNBScAddressModel adm);
	public NiBLinkNBScBankingDetailsModel showBanking(String s);
	public Map<String,String> bankingEdit(NiBLinkNBScBankingDetailsModel bm);
	public NiBLinkNBScIdentityModel showIdentity(String s);
	public Map<String,String> identityEdit(NiBLinkNBScIdentityModel im);
	public NiBLinkNBScPersonalModel showPersonal(String s);
	public Map<String,String> personalEdit(NiBLinkNBScPersonalModel pm);
	
}
