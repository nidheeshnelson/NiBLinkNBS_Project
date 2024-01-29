package com.nidheeshnelson.niblinknbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPersonalModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSePersonalService;

@RestController
@CrossOrigin
public class NiBLinkNBSPersonalControl {
	@Autowired
	private NiBLinkNBSePersonalService ps;
	@PostMapping("/epr")
	public NiBLinkNBScPersonalModel editPersonal(@RequestBody NiBLinkNBScPersonalModel pm) {
		pm=ps.editPersonal(pm);
		return pm;
	}
	@PostMapping("/spr")
	public NiBLinkNBScPersonalModel showPersonal(@RequestBody NiBLinkNBScPersonalModel pm) {
		pm=ps.showPersonal(pm);
		return pm;
	}
}
