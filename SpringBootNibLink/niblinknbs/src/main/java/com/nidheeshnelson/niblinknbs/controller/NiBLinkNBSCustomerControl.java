package com.nidheeshnelson.niblinknbs.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftRequestModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSgThalukAndJobModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSaieShiftService;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class NiBLinkNBSCustomerControl {
	private NiBLinkNBSaieShiftService ss;
	@PostMapping("/findshift")
	public List<NiBLinkNBSeShiftModel> findShift(@RequestBody NiBLinkNBSgThalukAndJobModel tj){
		return ss.findJobShifts(tj);
	}
	@PostMapping("/requestshift")
	public NiBLinkNBSeShiftRequestModel requestShift(NiBLinkNBSeShiftRequestModel srm) {
		return ss.requestShiftCustomer(srm);
	}
}
