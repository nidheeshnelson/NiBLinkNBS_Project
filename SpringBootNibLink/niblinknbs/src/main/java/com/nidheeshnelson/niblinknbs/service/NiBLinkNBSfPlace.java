package com.nidheeshnelson.niblinknbs.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfCountryModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfDistrictModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfStateModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSfThalukModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSfCountryRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSfDistrictRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSfStateRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSfThalukRepository;

@Service
public class NiBLinkNBSfPlace implements NiBLinkNBSaiePlace{
	@Autowired
	private NiBLinkNBSfCountryRepository cr;
	@Autowired
	private NiBLinkNBSfStateRepository sr;
	@Autowired
	private NiBLinkNBSfDistrictRepository dr;
	@Autowired
	private NiBLinkNBSfThalukRepository tr;

public Map<String, String> addCountry(NiBLinkNBSfCountryModel cm){
	cm=cr.save(cm);
	cm.setCountrycode("COUNT"+cm.getCountryid());
	cm=cr.save(cm);
	return Map.of("COUNTRYCODE", cm.getCountrycode());
}

public List<NiBLinkNBSfCountryModel> countryList(){
	return cr.findAll();
}



public Map<String, String> addState(NiBLinkNBSfStateModel sm){
	sm=sr.save(sm);
	sm.setStatecode("STATE"+sm.getId());
	sm=sr.save(sm);
	return Map.of("STATECODE", sm.getStatecode());
}

public Map<String, String> addDistrict(NiBLinkNBSfDistrictModel dm){
	dm=dr.save(dm);
	dm.setDistrictcode("DIST"+dm.getDistrictid());
	dm=dr.save(dm);
	return Map.of("DISTRICTCODE", dm.getDistrictcode());
}

public Map<String, String> addThaluk(NiBLinkNBSfThalukModel tm){
	tm=tr.save(tm);
	tm.setThalukcode("TALUK"+tm.getThalukid());
	tm=tr.save(tm);
	return Map.of("TALUK",tm.getThalukcode());
}

public List<NiBLinkNBSfThalukModel> talukList(NiBLinkNBSfThalukModel tm){
	return tr.findByDistrictcodeAndStatecodeAndCountrycode(tm.getDistrictcode(), tm.getStatecode(), tm.getCountrycode());
}

public List<NiBLinkNBSfDistrictModel> districtList(NiBLinkNBSfDistrictModel dm){
	return dr.findByStatecodeAndCountrycode(dm.getStatecode(), dm.getCountrycode());
}

public List<NiBLinkNBSfStateModel> stateList(NiBLinkNBSfStateModel sm){
	return sr.findByCountrycode(sm.getCountrycode());
}

public List<NiBLinkNBSfCountryModel> countryList(NiBLinkNBSfCountryModel cm){
	return cr.findAll();
}
}
