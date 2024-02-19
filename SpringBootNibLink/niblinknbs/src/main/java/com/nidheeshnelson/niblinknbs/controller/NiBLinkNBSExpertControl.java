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

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSbbExpertModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBScPaymentDetailsModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftRequestModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSgThalukAndJobModel;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSaiePaymentDetailsService;
import com.nidheeshnelson.niblinknbs.service.NiBLinkNBSaieShiftService;

@RestController
@CrossOrigin
@RequestMapping("/expert")
public class NiBLinkNBSExpertControl {
	@Autowired
	private NiBLinkNBSaieShiftService ss;
	@Autowired
	private NiBLinkNBSaiePaymentDetailsService pds;
@PostMapping("/addpaymentdetails")
public Map<String, String> addPaymentDet (@RequestBody NiBLinkNBScPaymentDetailsModel pm){
	System.out.println(pm);
	return pds.addPaymentDet(pm);
}
@PostMapping("/createshift")
public Map<String, String> createShift(@RequestBody NiBLinkNBSeShiftModel sm){
	return ss.createShiftExpert(sm);
}
@PostMapping("/findjobshift")
public List<NiBLinkNBSeShiftModel> findJobShifts(@RequestBody NiBLinkNBSgThalukAndJobModel tj){
	System.out.println(tj);
	return ss.findJobShifts(tj);
}
@PostMapping("/findjobshiftbydate")
public List<NiBLinkNBSeShiftModel> findJobShiftsByDate(@RequestBody NiBLinkNBSgThalukAndJobModel tj){
	System.out.println(tj);
	return ss.findJobShiftsByDate(tj);
}
@PostMapping("/findshiftbyexpert")
public List<NiBLinkNBSeShiftModel> findShiftsByExpert(@RequestBody NiBLinkNBSbbExpertModel em){
	System.out.println(em);
	return ss.allShiftsByExpertId(em.getExpertid());
}


@PostMapping("/cancel")
public NiBLinkNBSeShiftModel cancelShift(@RequestParam String s) {
	return ss.CancelShiftExpert(s);
}
@PostMapping("/pendingReq")
public List<NiBLinkNBSeShiftRequestModel> pendingRequest(NiBLinkNBSeShiftRequestModel srm){
	return ss.allPendingRequestByIdExpert(srm);
}
}
