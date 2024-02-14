package com.nidheeshnelson.niblinknbs.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftRequestModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSaieShiftService;

@RestController
@CrossOrigin
@RequestMapping("/expert")
public class NiBLinkNBSExpertControl {
	@Autowired
	private NiBLinkNBSaieShiftService ss;
@PostMapping("/shift")
public Map<String, String> createShift(@RequestBody NiBLinkNBSeShiftModel sm){
	return ss.createShiftExpert(sm);
}

@PostMapping("/cancel")
public NiBLinkNBSeShiftModel cancelShift(@RequestParam String s) {
	return ss.CancelShiftExpert(s);
}
@PostMapping("/pendingReq")
public List<NiBLinkNBSeShiftRequestModel> pendingRequest(NiBLinkNBSeShiftRequestModel srm){
	return ss.allRequestByIdExpert(srm);
}
}
