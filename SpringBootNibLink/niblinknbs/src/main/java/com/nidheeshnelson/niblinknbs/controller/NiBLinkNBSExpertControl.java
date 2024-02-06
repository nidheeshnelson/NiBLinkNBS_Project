package com.nidheeshnelson.niblinknbs.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSeShiftService;

@RestController
@CrossOrigin
@RequestMapping("/expert")
public class NiBLinkNBSExpertControl {
	private NiBLinkNBSeShiftService ss;
@PostMapping("/shift")
public Map<String, String> createShift(@RequestBody NiBLinkNBSeShiftModel sm){
	return ss.createShiftExpert(sm);
}

}
