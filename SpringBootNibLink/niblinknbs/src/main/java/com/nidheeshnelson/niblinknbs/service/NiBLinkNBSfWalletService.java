package com.nidheeshnelson.niblinknbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScWalletModel;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScWalletRepository;
@Service
public class NiBLinkNBSfWalletService implements NiBLinkNBSeWalletService{
	@Autowired
	private NiBLinkNBScWalletRepository wr;
public NiBLinkNBScWalletModel editWallet(NiBLinkNBScWalletModel wm) {
	wm=wr.save(wm);
	return wm;
}
public NiBLinkNBScWalletModel showWallet(NiBLinkNBScWalletModel wm) {
	wm=wr.findByWalletid(wm.getWalletid());
	return wm;
}
}
