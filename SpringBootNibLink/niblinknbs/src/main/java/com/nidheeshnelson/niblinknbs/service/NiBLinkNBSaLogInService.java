package com.nidheeshnelson.niblinknbs.service;

import java.util.Map;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLogInModel;

public interface NiBLinkNBSaLogInService {
	public NiBLinkNBSaLogInModel signUp(NiBLinkNBSaLogInModel m,NiBLinkNBSTypeSignInService ts);
	public Map<String, String> logIn(NiBLinkNBSaLogInModel lm);
}
