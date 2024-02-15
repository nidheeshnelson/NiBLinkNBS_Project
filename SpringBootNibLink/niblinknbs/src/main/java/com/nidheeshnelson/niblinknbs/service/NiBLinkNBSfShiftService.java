package com.nidheeshnelson.niblinknbs.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdCommissionPayedModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdPayedModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdSalaryModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftRequestModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSgThalukAndJobModel;
import com.nidheeshnelson.niblinknbs.model.ShiftStatus;
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
	private NiBLinkNBSeShiftModel smm;
	private NiBLinkNBSdCommissionPayedModel cpm;
	private NiBLinkNBSdPayedModel pm;
	private NiBLinkNBSdSalaryModel slm;
	Map<String, String> m;
	
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
	cpm.setStatus(ShiftStatus.NOTPAYED);
	cpm=cpr.save(cpm);
	System.out.println(cpm);
	pm.setShiftid(sm.getGeneratedshiftid());
	pm.setExpertid(sm.getExpertid());
	pm.setCustomerid(sm.getCustomerid());
	pm.setCommissionid(sm.getCommissionid());
	pm.setStatus(ShiftStatus.NOTPAYED);
	pm=pr.save(pm);
	System.out.println(pm);
	slm.setShiftid(sm.getGeneratedshiftid());
	slm.setExpertid(sm.getExpertid());
	slm.setCustomerid(sm.getCustomerid());
	slm.setCommissionid(sm.getCommissionid());
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
	for(NiBLinkNBSeShiftModel stm:sm) {
		if(stm.getShiftdate().isBefore(LocalDate.now())){
			stm.setStatus(ShiftStatus.EXPIRED);
			sr.save(stm);
		}
	}
	return sr.findByThalukcodeAndStatusAndJobcode(tj.getThalukid(), ShiftStatus.ACTIVE, tj.getJobid());
}

public NiBLinkNBSeShiftRequestModel requestShiftCustomer(NiBLinkNBSeShiftRequestModel srm) {
	srm.setStatus(ShiftStatus.PENDING);
	srm.setRequesteddatetime(LocalDateTime.now());
	srm.setShiftdate(sr.findByGeneratedshiftid(srm.getShiftid()).getShiftdate());
	srm.setShifttime(sr.findByGeneratedshiftid(srm.getShiftid()).getShifttime());
	srm=srr.save(srm);
	return srm;
}

public List<NiBLinkNBSeShiftRequestModel> allRequestByIdExpert(NiBLinkNBSeShiftRequestModel srm) {
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

public NiBLinkNBSeShiftModel acceptRequestExpert(NiBLinkNBSeShiftRequestModel srm){
	try {
	List<NiBLinkNBSeShiftRequestModel> rm=srr.findByShiftid(srm.getShiftid());
	for(NiBLinkNBSeShiftRequestModel srtm :rm) {
		if(srtm.getCustomerid().equals(srm.getCustomerid())) {
			srm.setStatus(ShiftStatus.ACCEPTED);
			srm.setAcceptorrejectdatetime(LocalDateTime.now());
			srr.save(srm);
			smm=sr.findByGeneratedshiftid(srm.getShiftid());
			smm.setCustomerid(srm.getCustomerid());
			smm.setStatus(ShiftStatus.BOOKED);
			smm.setAccepteddatetime(LocalDateTime.now());
			smm=sr.save(smm);
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
	return smm;
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

public NiBLinkNBSeShiftModel shiftStarts(String s) {
	smm=sr.findByGeneratedshiftid(s);
	smm.setStatus(ShiftStatus.RUNNING);
	return sr.save(smm);
}

public NiBLinkNBSeShiftModel shiftFinished(String s) {
	smm=sr.findByGeneratedshiftid(s);
	smm.setStatus(ShiftStatus.FINISHED);
	smm.setPayedbycustomer(smm.getSalaryPerHours()*smm.getHoursforwork());
	smm.setSalary((1-smm.getCommissionpercent()/100)*smm.getSalaryPerHours()*smm.getHoursforwork());
	smm.setCommission((smm.getCommissionpercent()/100)*smm.getSalaryPerHours()*smm.getHoursforwork());
	return sr.save(smm);
}

public NiBLinkNBSdPayedModel shiftPayed(String s) {
	try {
	pm=pr.findByShiftid(s);
	pm.setStatus(ShiftStatus.PAYED);
	pm.setCommissiondatetime(LocalDateTime.now());
	pm=pr.save(pm);
	cpm=cpr.findByShiftid(s);
	cpm.setStatus(ShiftStatus.PAYED);
	cpm.setDatetimeofcommission(LocalDateTime.now());
	cpm=cpr.save(cpm);
	slm=slr.findByShiftid(s);
	slm.setStatus(ShiftStatus.PAYED);
	slm.setSalarypayeddatetime(LocalDateTime.now());
	slm=slr.save(slm);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return pm;
}
}
