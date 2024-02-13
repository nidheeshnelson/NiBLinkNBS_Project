package com.nidheeshnelson.niblinknbs.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScCommissionModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScCommissionRepository;

@Service
public class NiBLinkNBSfCommissionService implements NiBLinkNBSaieCommissionService{
	@Autowired
	private NiBLinkNBScCommissionRepository cr;
	private Map<String, String> m;
public Map<String, String> addCommission(NiBLinkNBScCommissionModel cm){
	cm=cr.save(cm);
	cm.setGeneratedcommissionid("COM"+cm.getCommissionid());
	cm=cr.save(cm);
	m.put("COMMISSION", cm.getGeneratedcommissionid());
	return m;
}
//public List<NiBLinkNBScCommissionModel> 
}
