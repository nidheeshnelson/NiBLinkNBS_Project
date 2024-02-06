package com.nidheeshnelson.niblinknbs.service;

import java.util.List;
import java.util.Map;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdPayedModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftRequestModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSgThalukAndJobModel;

public interface NiBLinkNBSeShiftService {
	public Map<String, String> createShiftExpert(NiBLinkNBSeShiftModel sm);
	public NiBLinkNBSeShiftModel CancelShiftExpert(String s);
	public List<NiBLinkNBSeShiftModel> findJobShifts(NiBLinkNBSgThalukAndJobModel tj);
	public NiBLinkNBSeShiftRequestModel requestShiftCustomer(NiBLinkNBSeShiftRequestModel srm);
	public List<NiBLinkNBSeShiftRequestModel> allRequestByIdExpert(NiBLinkNBSeShiftRequestModel srm);
	public List<NiBLinkNBSeShiftRequestModel> allRequestedShifts(String expertid);
	public NiBLinkNBSeShiftModel acceptRequestExpert(NiBLinkNBSeShiftRequestModel srm);
	public List<NiBLinkNBSeShiftModel> allBookedShiftsExpert(String expertid);
	public List<NiBLinkNBSeShiftModel> allBookedShiftsCustomer(String customerid);
	public NiBLinkNBSeShiftModel shiftStarts(String s);
	public NiBLinkNBSeShiftModel shiftFinished(String s);
	public NiBLinkNBSdPayedModel shiftPayed(String s);
}
