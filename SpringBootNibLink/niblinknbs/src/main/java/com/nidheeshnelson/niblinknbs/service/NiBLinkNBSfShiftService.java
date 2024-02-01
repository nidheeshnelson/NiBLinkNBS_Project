package com.nidheeshnelson.niblinknbs.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftRequestModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSgThalukAndJobModel;
import com.nidheeshnelson.niblinknbs.model.ShiftStatus;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSeShiftRepository;
import com.nidheeshnelson.niblinknbs.repositary.NiBLinkNBSeShiftRequestRepository;

@Service
public class NiBLinkNBSfShiftService implements NiBLinkNBSeShiftService{
	@Autowired
	private NiBLinkNBSeShiftRepository sr;
	private NiBLinkNBSeShiftRequestRepository srr;
	private NiBLinkNBSeShiftModel smm = new NiBLinkNBSeShiftModel();
public NiBLinkNBSeShiftModel createShift(NiBLinkNBSeShiftModel sm) {
	sm.setGenerateddatetime(LocalDateTime.now());
	sm.setStatus(ShiftStatus.ACTIVE);
	sm=sr.save(sm);
	sm.setGeneratedshiftid("SHIFT"+sm.getShiftid());
	sm=sr.save(sm);
	return sm;
}

public List<NiBLinkNBSeShiftModel> findJobShifts(NiBLinkNBSgThalukAndJobModel tj){
	return sr.findByThalukcodeAndStatusAndJobcode(tj.getThalukid(), ShiftStatus.ACTIVE, tj.getJobid());	
}

public NiBLinkNBSeShiftRequestModel requestShift(NiBLinkNBSeShiftRequestModel srm) {
	srm.setStatus(ShiftStatus.PENDING);
	srm.setRequesteddatetime(LocalDateTime.now());
	srm=srr.save(srm);
	return srm;
}

public List<NiBLinkNBSeShiftRequestModel> allRequestedShifts(String s){
	return srr.findByExpertidAndStatus(s, ShiftStatus.PENDING);
}

public NiBLinkNBSeShiftModel acceptRequest(NiBLinkNBSeShiftRequestModel srm){
	List<NiBLinkNBSeShiftRequestModel> rm=srr.findByShiftid(srm.getShiftid());
	for(NiBLinkNBSeShiftRequestModel srtm :rm) {
		if(srtm.getCustomerid().equals(srm.getCustomerid())) {
			srm.setStatus(ShiftStatus.ACCEPTED);
			srm.setStartdatetime(LocalDateTime.now());
			srr.save(srm);
			smm=sr.findByGeneratedshiftid(srm.getShiftid());
			smm.setCustomerid(srm.getCustomerid());
			smm.setStatus(ShiftStatus.BOOKED);
			smm.setAlloteddatetime(LocalDateTime.now());
			smm=sr.save(smm);
		}
		else {
			srtm.setStatus(ShiftStatus.REJECTED);
		}
	}
	return smm;
}
}
