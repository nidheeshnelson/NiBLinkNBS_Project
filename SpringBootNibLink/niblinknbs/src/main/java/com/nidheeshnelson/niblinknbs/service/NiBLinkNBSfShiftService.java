package com.nidheeshnelson.niblinknbs.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLivePaymentModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdCommissionPayedModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdPayedModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdSalaryModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftRequestModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSgIDs;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSgThalukAndJobModel;
import com.nidheeshnelson.niblinknbs.model.PaymentMode;
import com.nidheeshnelson.niblinknbs.model.ShiftStatus;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSaLivePaymentGatewayRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScCommissionRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBScPaymentDetailsRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSdCommissionPayedRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSdPaymentRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSdSalaryRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSeShiftRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSeShiftRequestRepository;

@Service
public class NiBLinkNBSfShiftService implements NiBLinkNBSaieShiftService{
	@Autowired
	private NiBLinkNBSeShiftRepository sr;
	@Autowired
	private NiBLinkNBSeShiftRequestRepository srr;
	@Autowired
	private NiBLinkNBScPaymentDetailsRepository pdr;
	@Autowired
	private NiBLinkNBScCommissionRepository cmr;
	@Autowired
	private NiBLinkNBSdCommissionPayedRepository cpr;
	@Autowired
	private NiBLinkNBSdPaymentRepository pr;
	@Autowired
	private NiBLinkNBSdSalaryRepository slr;
	@Autowired
	private NiBLinkNBSaLivePaymentGatewayRepository lpr;
	private NiBLinkNBSaLivePaymentModel lpm;
	private NiBLinkNBSeShiftModel smm= new NiBLinkNBSeShiftModel();
	private NiBLinkNBSdCommissionPayedModel cpm= new NiBLinkNBSdCommissionPayedModel();
	private NiBLinkNBSdPayedModel pm= new NiBLinkNBSdPayedModel();
	private NiBLinkNBSdSalaryModel slm = new NiBLinkNBSdSalaryModel();
	Map<String, String> m= new HashMap<String, String>();
	List<NiBLinkNBSeShiftModel> l;
	
public Map<String, String> createShiftExpert(NiBLinkNBSeShiftModel sm) {
	try {
	sm.setGenerateddatetime(LocalDateTime.now());
	sm.setStatus(ShiftStatus.ACTIVE);
	sm.setSalaryPerHours(pdr.findByPaymentid(sm.getExpertid()).getPaymentperhour());
	sm.setCommissionpercent(cmr.findByGeneratedcommissionid(pdr.findByPaymentid(sm.getExpertid()).getCommissionid()).getCommissionpersentage());
	sm.setCommissionid(pdr.findByPaymentid(sm.getExpertid()).getCommissionid());
	sm=sr.save(sm);
	sm.setGeneratedshiftid("SHIFT"+sm.getShiftid());
	sm=sr.save(sm);
	System.out.println(sm);
	cpm.setShiftid(sm.getGeneratedshiftid());
	cpm.setExpertid(sm.getExpertid());
	cpm.setCustomerid(sm.getCustomerid());
	cpm.setCommissionid(sm.getCommissionid());
	cpm.setCommissionpersentage(sm.getCommissionpercent());
	cpm.setThalukcode(sm.getThalukcode());
	cpm.setStatus(ShiftStatus.NOTPAYED);
	cpm=cpr.save(cpm);
	System.out.println(cpm);
	pm.setShiftid(sm.getGeneratedshiftid());
	pm.setExpertid(sm.getExpertid());
	pm.setCustomerid(sm.getCustomerid());
	pm.setCommissionid(sm.getCommissionid());
	pm.setThalukcode(sm.getThalukcode());
	pm.setStatus(ShiftStatus.NOTPAYED);
	pm=pr.save(pm);
	System.out.println(pm);
	slm.setShiftid(sm.getGeneratedshiftid());
	slm.setExpertid(sm.getExpertid());
	slm.setCustomerid(sm.getCustomerid());
	slm.setCommissionid(sm.getCommissionid());
	slm.setThalukcode(sm.getThalukcode());
	slm.setStatus(ShiftStatus.NOTPAYED);
	slm=slr.save(slm);
	System.out.println(slm);
	m.put("SHIFTID", sm.getGeneratedshiftid());
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return m;
}

public NiBLinkNBSeShiftModel CancelShiftExpert(String s) {
	smm=sr.findByGeneratedshiftid(s);
	smm.setStatus(ShiftStatus.CANCELLED);
	smm.setCancelleddatetime(LocalDateTime.now());
	smm=sr.save(smm);
	return smm;
}


public List<NiBLinkNBSeShiftModel> findJobShifts(NiBLinkNBSgThalukAndJobModel tj){
	List<NiBLinkNBSeShiftModel> sm=sr.findByThalukcodeAndStatusAndJobcode(tj.getThalukid(), ShiftStatus.ACTIVE, tj.getJobid());	
	System.out.println(sm);
	for(NiBLinkNBSeShiftModel stm:sm) {
		if(stm.getShiftdate().isBefore(LocalDate.now())){
			stm.setStatus(ShiftStatus.EXPIRED);
			sr.save(stm);
		}
	}
	return sr.findByThalukcodeAndStatusAndJobcode(tj.getThalukid(), ShiftStatus.ACTIVE, tj.getJobid());
}

public List<NiBLinkNBSeShiftModel> findJobShiftsByDate(NiBLinkNBSgThalukAndJobModel tj){
	List<NiBLinkNBSeShiftModel> sm=sr.findByThalukcodeAndStatusAndJobcodeAndShiftdate(tj.getThalukid(), ShiftStatus.ACTIVE, tj.getJobid(), tj.getJobdate());	
	for(NiBLinkNBSeShiftModel stm:sm) {
		if(stm.getShiftdate().isBefore(LocalDate.now())){
			stm.setStatus(ShiftStatus.EXPIRED);
			sr.save(stm);
		}
	}
	return sr.findByThalukcodeAndStatusAndJobcodeAndShiftdate(tj.getThalukid(), ShiftStatus.ACTIVE, tj.getJobid(), tj.getJobdate());
}

public Map<String,String> requestShiftCustomer(NiBLinkNBSeShiftRequestModel srm) {
	srm.setStatus(ShiftStatus.PENDING);
	srm.setRequesteddatetime(LocalDateTime.now());
	srm.setShiftdate(sr.findByGeneratedshiftid(srm.getShiftid()).getShiftdate());
	srm.setShifttime(sr.findByGeneratedshiftid(srm.getShiftid()).getShifttime());
	srm=srr.save(srm);
	System.out.println(srm);
	return Map.of("SHIFTREQID", Integer.toString(srm.getShiftrequestid()));
}

public List<NiBLinkNBSeShiftModel> allShiftsByExpertId(String expert){
	try {
	l=sr.findByExpertid(expert);
	for(NiBLinkNBSeShiftModel sm:l) {
		if(sm.getShiftdate().isBefore(LocalDate.now())) {
			if(sm.getStatus().equals(ShiftStatus.BOOKED)) {
				sm.setStatus(ShiftStatus.INCOMPLETE);
			}
			if(sm.isCustomeridNull()) {
				sm.setStatus(ShiftStatus.EXPIRED);
			}
			sm=sr.save(sm);
			System.out.println(sm);
		}
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return sr.findByExpertid(expert);
}

public List<NiBLinkNBSeShiftRequestModel> allShiftrequestsByShiftId(String shift){
	System.out.println(shift);
	return srr.findByShiftid(shift);
}

public Map<String, String> acceptRequestExpert(NiBLinkNBSgIDs srm){
	try {
	List<NiBLinkNBSeShiftRequestModel> rm=srr.findByShiftid(srm.getShiftid());
	for(NiBLinkNBSeShiftRequestModel srtm :rm) {
		if(srtm.getCustomerid().equals(srm.getCustomerid())) {
			srtm.setStatus(ShiftStatus.ACCEPTED);
			srtm.setAcceptorrejectdatetime(LocalDateTime.now());
			srtm=srr.save(srtm);
			System.out.println(srtm);
			smm=sr.findByGeneratedshiftid(srtm.getShiftid());
			smm.setCustomerid(srtm.getCustomerid());
			smm.setAddress(srtm.getAddress());
			smm.setLandmark(srtm.getLandmark());
			smm.setCustomercontact(srtm.getCustomercontact());
			smm.setCustomername(srtm.getCustomername());
			smm.setStatus(ShiftStatus.BOOKED);
			smm.setAccepteddatetime(LocalDateTime.now());
			smm=sr.save(smm);
			System.out.println(smm);
		}
		else {
			srtm.setStatus(ShiftStatus.REJECTED);
			srr.save(srtm);
		}
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return Map.of("BOOKEDID", srm.getShiftid());
}

public Map<String, String> shiftStarts(NiBLinkNBSgIDs s) {
	try {
	smm=sr.findByGeneratedshiftid(s.getShiftid());
	if(smm.getShiftdate().equals(LocalDate.now())) {
	smm.setStatus(ShiftStatus.RUNNING);
	smm=sr.save(smm);
	System.out.println(smm);
	return Map.of("SHIFTRUN", "START");
	}
	else {
		return Map.of("SHIFTRUN","STUCK");
	}
	}
	catch(Exception e) {
		System.out.println(e);
		return Map.of("SHIFTRUN","ERROR"); 
	}
}

public Map<String, String> shiftFinished(NiBLinkNBSgIDs s) {
	try {
	smm=sr.findByGeneratedshiftid(s.getShiftid());
	smm.setHoursforwork(s.getHoursforwork());
	smm.setStatus(ShiftStatus.FINISHED);
	smm.setPayedbycustomer(smm.getSalaryPerHours()*smm.getHoursforwork());
	smm.setSalary((1-smm.getCommissionpercent()/100)*smm.getSalaryPerHours()*smm.getHoursforwork());
	smm.setCommission((smm.getCommissionpercent()/100)*smm.getSalaryPerHours()*smm.getHoursforwork());
	smm=sr.save(smm);
	cpm=cpr.findByShiftid(s.getShiftid());
	cpm.setCommissionamount(smm.getCommission());
	cpm.setCustomerid(smm.getCustomerid());
	cpm=cpr.save(cpm);
	System.out.println(cpm);
	pm=pr.findByShiftid(s.getShiftid());
	pm.setPayment(smm.getPayedbycustomer());
	pm.setCustomerid(smm.getCustomerid());
	pm=pr.save(pm);
	System.out.println(pm);
	slm=slr.findByShiftid(s.getShiftid());
	slm.setSalary(smm.getSalary());
	slm.setCustomerid(smm.getCustomerid());
	slm=slr.save(slm);
	System.out.println(slm);
	System.out.println(smm);
	return Map.of("FINI","FINISHED");
	}
	catch(Exception e) {
		System.out.println(e);
		
		return Map.of("FINI","ERROR");
	}
}

public Map<String, String> shiftPayed(NiBLinkNBSaLivePaymentModel pml) {
	try {
	pm=pr.findByShiftid(pml.getShiftid());
	pm.setStatus(ShiftStatus.PAYED);
	pm.setPaymentdatetime(LocalDateTime.now());
	pm=pr.save(pm);
	System.out.println(pm);
	cpm=cpr.findByShiftid(pml.getShiftid());
	cpm.setStatus(ShiftStatus.PAYED);
	cpm.setDatetimeofcommission(LocalDateTime.now());
	cpm=cpr.save(cpm);
	System.out.println(cpm);
	lpm.setAmountsave(cpm.getCommissionamount());
	lpm.setCommissionid(cpm.getCommissionid());
	lpm.setShiftid(pml.getShiftid());
	lpm.setMode(PaymentMode.TRANSFER);
	lpm.setTransactiondatetime(LocalDateTime.now());
	lpm=lpr.save(lpm);
	System.out.println(lpm);
	lpm=null;
	slm=slr.findByShiftid(pml.getShiftid());
	slm.setStatus(ShiftStatus.PAYED);
	slm.setSalarypayeddatetime(LocalDateTime.now());
	slm=slr.save(slm);
	lpm.setAmountput(slm.getSalary());
	lpm.setShiftid(pml.getShiftid());
	lpm.setWorkerid(slm.getExpertid());
	lpm.setMode(PaymentMode.TRANSFER);
	lpm.setTransactiondatetime(LocalDateTime.now());
	lpm=lpr.save(lpm);
	System.out.println(lpm);
	return Map.of("TRANSACTION", "SUCCESS");
	}
	catch(Exception e) {
		System.out.println(e);
		return Map.of("TRANSACTION", "FAILED");
	}
}









public List<NiBLinkNBSeShiftRequestModel> allPendingRequestByIdExpert(NiBLinkNBSeShiftRequestModel srm) {
	return srr.findByExpertidAndStatusAndShiftid(srm.getExpertid(), ShiftStatus.PENDING, srm.getShiftid());
}

public List<NiBLinkNBSeShiftRequestModel> allRequestedShifts(String expertid){
	List<NiBLinkNBSeShiftRequestModel> srm = srr.findByExpertidAndStatus(expertid, ShiftStatus.PENDING);
	for(NiBLinkNBSeShiftRequestModel srml:srm) {
		if(srml.getShiftdate().isBefore(LocalDate.now())){
			srml.setStatus(ShiftStatus.EXPIRED);
			srr.save(srml);
		}
	}
	return srr.findByExpertidAndStatus(expertid, ShiftStatus.PENDING);
}



public List<NiBLinkNBSeShiftModel> allBookedShiftsExpert(String expertid){
	List<NiBLinkNBSeShiftModel> sm = sr.findByExpertidAndStatus(expertid, ShiftStatus.BOOKED);
	for(NiBLinkNBSeShiftModel nsm : sm) {
		if(nsm.getShiftdate().isBefore(LocalDate.now())) {
			nsm.setStatus(ShiftStatus.INCOMPLETE);
			nsm=sr.save(nsm);
		}
	}
	return sr.findByExpertidAndStatus(expertid, ShiftStatus.BOOKED);
}

public List<NiBLinkNBSeShiftModel> allBookedShiftsCustomer(String customerid){
	List<NiBLinkNBSeShiftModel> sm = sr.findByCustomeridAndStatus(customerid, ShiftStatus.BOOKED);
	for(NiBLinkNBSeShiftModel nsm : sm) {
		if(nsm.getShiftdate().isBefore(LocalDate.now())) {
			nsm.setStatus(ShiftStatus.INCOMPLETE);
			nsm=sr.save(nsm);
		}
	}
	return sr.findByCustomeridAndStatus(customerid, ShiftStatus.BOOKED);
}




}
