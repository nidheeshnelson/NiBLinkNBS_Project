package com.nidheeshnelson.niblinknbs.service;

import java.util.List;
import java.util.Map;

import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSaLivePaymentModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSdPayedModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSeShiftRequestModel;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSgIDs;
import com.nidheeshnelson.niblinknbs.model.NiBLinkNBSgThalukAndJobModel;

public interface NiBLinkNBSaieShiftService {
	public Map<String, String> createShiftExpert(NiBLinkNBSeShiftModel sm);
	public NiBLinkNBSeShiftModel CancelShiftExpert(String s);
	public List<NiBLinkNBSeShiftModel> findJobShifts(NiBLinkNBSgThalukAndJobModel tj);
	public List<NiBLinkNBSeShiftModel> findJobShiftsByDate(NiBLinkNBSgThalukAndJobModel tj);
	public Map<String,String> requestShiftCustomer(NiBLinkNBSeShiftRequestModel srm);
	public List<NiBLinkNBSeShiftModel> allShiftsByExpertId(String expert);
	public List<NiBLinkNBSeShiftRequestModel> allShiftrequestsByShiftId(String shift);
	public Map<String, String> acceptRequestExpert(NiBLinkNBSgIDs srm);
	public Map<String, String> shiftStarts(NiBLinkNBSgIDs s);
	public Map<String, String> shiftFinished(NiBLinkNBSgIDs s);
	public Map<String, String> shiftPayed(NiBLinkNBSaLivePaymentModel pml);
	
	public List<NiBLinkNBSeShiftRequestModel> allPendingRequestByIdExpert(NiBLinkNBSeShiftRequestModel srm);
	public List<NiBLinkNBSeShiftRequestModel> allRequestedShifts(String expertid);
	public List<NiBLinkNBSeShiftModel> allBookedShiftsExpert(String expertid);
	public List<NiBLinkNBSeShiftModel> allBookedShiftsCustomer(String customerid);
	
}
