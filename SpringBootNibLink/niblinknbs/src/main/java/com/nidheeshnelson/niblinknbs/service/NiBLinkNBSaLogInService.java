package com.nidheeshnelson.niblinknbs.service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLogInModel;

public interface NiBLinkNBSaLogInService {
	public Object signUp(NiBLinkNBSaLogInModel m,NiBLinkNBSTypeSignInService ts);
	public Object signIn(NiBLinkNBSaLogInModel m);
	public NiBLinkNBSaLogInModel editUser (NiBLinkNBSaLogInModel m);
	public NiBLinkNBSaLogInModel editPassword (NiBLinkNBSaLogInModel m);
	public NiBLinkNBSaLogInModel editEmail (NiBLinkNBSaLogInModel m);
	public NiBLinkNBSaLogInModel editPhone (NiBLinkNBSaLogInModel m);
}
