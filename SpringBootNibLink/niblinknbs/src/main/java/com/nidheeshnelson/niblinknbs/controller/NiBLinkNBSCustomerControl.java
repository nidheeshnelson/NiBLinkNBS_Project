package com.nidheeshnelson.niblinknbs.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftRequestModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSaieShiftService;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class NiBLinkNBSCustomerControl {
	@Autowired
	private NiBLinkNBSaieShiftService ss;
	@PostMapping("/requestshift")
	public Map<String,String> requestShift(@RequestBody NiBLinkNBSeShiftRequestModel srm) {
		System.out.println(srm);
		return ss.requestShiftCustomer(srm);
	}
}
