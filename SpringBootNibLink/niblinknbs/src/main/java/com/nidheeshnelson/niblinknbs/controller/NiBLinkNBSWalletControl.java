package com.nidheeshnelson.niblinknbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScWalletModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSeWalletService;

@RestController
@CrossOrigin
public class NiBLinkNBSWalletControl {
	@Autowired
	private NiBLinkNBSeWalletService ws;
	@PostMapping("/ewa")
	public NiBLinkNBScWalletModel editWallet(@RequestBody NiBLinkNBScWalletModel wm) {
		wm=ws.editWallet(wm);
		return wm;
	}
	@PostMapping("/swa")
	public NiBLinkNBScWalletModel showWallet(@RequestBody NiBLinkNBScWalletModel wm) {
		wm=ws.showWallet(wm);
		return wm;
	}
}
