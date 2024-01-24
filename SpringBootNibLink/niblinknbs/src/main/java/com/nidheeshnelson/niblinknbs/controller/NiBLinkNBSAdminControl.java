package com.nidheeshnelson.niblinknbs.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaJobModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBScAdminService;

@RestController
@CrossOrigin
public class NiBLinkNBSAdminControl {
//	@Autowired
//	private NiBLinkNBScAdminService as;
//	private List<NiBLinkNBSaJobModel> jl = new ArrayList<>();
//@GetMapping("aj")
//public NiBLinkNBSaJobModel addJob(@RequestBody NiBLinkNBSaJobModel jm){
//	jm=as.addJob(jm);
//	return jm;
//}
//@GetMapping("jl")
//public List<NiBLinkNBSaJobModel> jobList () {
//	return as.jobList();
//}
}