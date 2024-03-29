package com.nidheeshnelson.niblinknbs.service;

import java.util.List;
import java.util.Map;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfCountryModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfDistrictModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfStateModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfThalukModel;

public interface NiBLinkNBSaiePlace {
	public Map<String, String> addCountry(NiBLinkNBSfCountryModel cm);
	public List<NiBLinkNBSfCountryModel> countryList();
	public Map<String, String> addState(NiBLinkNBSfStateModel sm);
	public List<NiBLinkNBSfStateModel> stateList();
	public List<NiBLinkNBSfStateModel> stateListByCountryCode(String ccd);
	public Map<String, String> addDistrict(NiBLinkNBSfDistrictModel dm);
	public List<NiBLinkNBSfDistrictModel> districtList();
	public List<NiBLinkNBSfDistrictModel> districtListByStateCode(String statecode);
	public Map<String, String> addThaluk(NiBLinkNBSfThalukModel tm);
	public List<NiBLinkNBSfThalukModel> talukList();
	public List<NiBLinkNBSfThalukModel> talukListByDiscrictCode(String s);
	public List<NiBLinkNBSfThalukModel> talukListByCountryStateDistrict(NiBLinkNBSfThalukModel tm);
	public List<NiBLinkNBSfDistrictModel> districtList(NiBLinkNBSfDistrictModel dm);
	public List<NiBLinkNBSfStateModel> stateList(NiBLinkNBSfStateModel sm);
	public List<NiBLinkNBSfCountryModel> countryList(NiBLinkNBSfCountryModel cm);
}
