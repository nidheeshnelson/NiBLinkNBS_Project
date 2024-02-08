package com.nidheeshnelson.niblinknbs.service;

import java.util.List;
import java.util.Map;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfCountryModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfDistrictModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfStateModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfThalukModel;

public interface NiBLinkNBSaiePlace {
	public Map<String, String> addCountry(NiBLinkNBSfCountryModel cm);
	public Map<String, String> addState(NiBLinkNBSfStateModel sm);
	public Map<String, String> addDistrict(NiBLinkNBSfDistrictModel dm);
	public Map<String, String> addThaluk(NiBLinkNBSfThalukModel tm);
	public List<NiBLinkNBSfThalukModel> talukList(NiBLinkNBSfThalukModel tm);
	public List<NiBLinkNBSfDistrictModel> districtList(NiBLinkNBSfDistrictModel dm);
	public List<NiBLinkNBSfStateModel> stateList(NiBLinkNBSfStateModel sm);
	public List<NiBLinkNBSfCountryModel> countryList(NiBLinkNBSfCountryModel cm);
}
