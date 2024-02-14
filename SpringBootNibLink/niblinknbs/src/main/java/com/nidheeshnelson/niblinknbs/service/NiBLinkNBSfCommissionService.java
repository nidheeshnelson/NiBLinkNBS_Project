package com.nidheeshnelson.niblinknbs.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScCommissionModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScCommissionRepository;

@Service
public class NiBLinkNBSfCommissionService implements NiBLinkNBSaieCommissionService{
	@Autowired
	private NiBLinkNBScCommissionRepository cr;
	
public Map<String, String> addCommission(NiBLinkNBScCommissionModel cm){
	cm=cr.save(cm);
	cm.setGeneratedcommissionid("COM"+cm.getCommissionid());
	cm=cr.save(cm);
	return Map.of("COMMISSION", cm.getGeneratedcommissionid());
}
public List<NiBLinkNBScCommissionModel> commissionList(){
	System.out.println(cr.findAll());
	return cr.findAll();
}
}
