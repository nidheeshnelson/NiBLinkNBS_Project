package com.nidheeshnelson.niblinknbs.service;

import java.util.List;
import java.util.Map;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaJobModel;

public interface NiBLinkNBSaieJobService {
	public Map<String, String> addJob(NiBLinkNBSaJobModel jm);
	public Map<String, String> findNameOfJob(String s);
	public List<NiBLinkNBSaJobModel> jobList();
	public NiBLinkNBSaJobModel editJob(NiBLinkNBSaJobModel jm);
}