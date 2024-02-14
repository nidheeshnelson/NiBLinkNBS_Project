package com.nidheeshnelson.niblinknbs.service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScIdentityModel;

public interface NiBLinkNBSaieIdentityService {
	public NiBLinkNBScIdentityModel showIdentity(String s);
	public NiBLinkNBScIdentityModel editIdentity(NiBLinkNBScIdentityModel im);
	public NiBLinkNBScIdentityModel addIdentity(NiBLinkNBScIdentityModel im);
}
