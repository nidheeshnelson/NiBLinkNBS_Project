package com.nidheeshnelson.niblinknbs.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSeShiftService;

@RestController
@CrossOrigin
public class NiBLinkNBSShiftControl {
	private NiBLinkNBSeShiftService ss;
	public NiBLinkNBSeShiftModel createShift(@RequestBody NiBLinkNBSeShiftModel sm) {
		sm=ss.createShift(sm);
		return sm;
	}

}
