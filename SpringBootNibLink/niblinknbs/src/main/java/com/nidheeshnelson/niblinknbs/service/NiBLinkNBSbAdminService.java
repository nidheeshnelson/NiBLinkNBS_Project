package com.nidheeshnelson.niblinknbs.service;

import java.util.List;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaJobModel;

public interface NiBLinkNBSbAdminService {
	public NiBLinkNBSaJobModel addJob(NiBLinkNBSaJobModel jm);
	public List<NiBLinkNBSaJobModel> jobList();
}
