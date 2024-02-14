package com.nidheeshnelson.niblinknbs.service;

import java.util.List;
import java.util.Map;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScCommissionModel;

public interface NiBLinkNBSaieCommissionService {
	public Map<String, String> addCommission(NiBLinkNBScCommissionModel cm);
	public List<NiBLinkNBScCommissionModel> commissionList();
}
