package com.nidheeshnelson.niblinknbs.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

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
public class NiBLinkNBSfShiftService implements NiBLinkNBSeShiftService{
	@Autowired
	private NiBLinkNBSeShiftRepository sr;
	private NiBLinkNBSeShiftRequestRepository srr;
	private NiBLinkNBScPaymentDetailsRepository pdr;
	private NiBLinkNBScCommissionRepository cmr;
	private NiBLinkNBSdCommissionPayedRepository cpr;
	private NiBLinkNBSdPaymentRepository pr;
	private NiBLinkNBSdSalaryRepository slr;
	private NiBLinkNBSeShiftModel smm = new NiBLinkNBSeShiftModel();
	private NiBLinkNBSdCommissionPayedModel cpm = new NiBLinkNBSdCommissionPayedModel();
	private NiBLinkNBSdPayedModel pm = new NiBLinkNBSdPayedModel();
	private NiBLinkNBSdSalaryModel sm = new NiBLinkNBSdSalaryModel();
	
public NiBLinkNBSeShiftModel createShiftExpert(NiBLinkNBSeShiftModel sm) {
	sm.setGenerateddatetime(LocalDateTime.now());
	sm.setStatus(ShiftStatus.ACTIVE);
	sm.setSalaryPerHours(pdr.findByPaymentid(sm.getExpertid()).getPaymentperhour());
	sm.setCommissionpercent(cmr.findByGeneratedcommissionid(pdr.findByPaymentid(sm.getExpertid()).getCommissionid()).getCommissionpersentage());
	sm=sr.save(sm);
	sm.setGeneratedshiftid("SHIFT"+sm.getShiftid());
	sm=sr.save(sm);
	cpm.setShiftid(sm.getGeneratedshiftid());
	cpm.setExpertid(sm.getExpertid());
	cpm.setCustomerid(sm.getCustomerid());
	cpm=cpr.save(cpm);
	pm.setShiftid(sm.getGeneratedshiftid());
	pm.setExpertid(sm.getExpertid());
	pm.setCustomerid(sm.getCustomerid());
	
	return sm;
}

public NiBLinkNBSeShiftModel CancelShiftExpert(NiBLinkNBSeShiftModel sm) {
	sm.setStatus(ShiftStatus.CANCELLED);
	return sm;
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
	srm=srr.save(srm);
	return srm;
}

public List<NiBLinkNBSeShiftRequestModel> allRequestedShifts(String expertid){
	return srr.findByExpertidAndStatus(expertid, ShiftStatus.PENDING);
}

public List<NiBLinkNBSeShiftRequestModel> acceptRequestExpert(NiBLinkNBSeShiftRequestModel srm){
	List<NiBLinkNBSeShiftRequestModel> rm=srr.findByShiftid(srm.getShiftid());
	for(NiBLinkNBSeShiftRequestModel srtm :rm) {
		if(srtm.getCustomerid().equals(srm.getCustomerid())) {
			srm.setStatus(ShiftStatus.ACCEPTED);
			srm.setAcceptorrejectdatetime(null);
			srr.save(srm);
			smm=sr.findByGeneratedshiftid(srm.getShiftid());
			smm.setCustomerid(srm.getCustomerid());
			smm.setStatus(ShiftStatus.BOOKED);
			smm.setAccepteddatetime(null);
			smm=sr.save(smm);
		}
		else {
			srtm.setStatus(ShiftStatus.REJECTED);
		}
	}
	return srr.findByExpertidAndStatus(srm.getExpertid(), ShiftStatus.PENDING);
}

public List<NiBLinkNBSeShiftModel> allBookedShiftsExpert(String expertid){
	return sr.findByExpertidAndStatus(expertid, ShiftStatus.BOOKED);
}

public List<NiBLinkNBSeShiftModel> allBookedShiftsCustomer(String customerid){
	return sr.findByCustomeridAndStatus(customerid, ShiftStatus.BOOKED);
}

public NiBLinkNBSeShiftModel shiftStarts(NiBLinkNBSeShiftModel sm) {
	sm.setStatus(ShiftStatus.RUNNING);
	return sr.save(sm);
}

public NiBLinkNBSeShiftModel shiftFinished(NiBLinkNBSeShiftModel sm) {
	sm.setStatus(ShiftStatus.FINISHED);
	sm.setPayedbycustomer(sm.getSalaryPerHours()*sm.getHoursforwork());
	sm.setSalary((1-sm.getCommissionpercent()/100)*sm.getSalaryPerHours()*sm.getHoursforwork());
	sm.setCommission((sm.getCommissionpercent()/100)*sm.getSalaryPerHours()*sm.getHoursforwork());
	return sr.save(sm);
}

public NiBLinkNBSeShiftModel shiftPayed(NiBLinkNBSeShiftModel sm) {
	
	return sm;
}
}
