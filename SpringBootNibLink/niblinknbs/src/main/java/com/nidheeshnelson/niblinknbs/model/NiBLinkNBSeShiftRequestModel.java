package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Shift_requests")
public class NiBLinkNBSeShiftRequestModel {
	@Id
	@GeneratedValue
	private int shiftrequestid;
	private String shiftcode;
	private String expertid;
	private String customerid;
	private boolean accepted;
	public int getShiftrequestid() {
		return shiftrequestid;
	}
	public void setShiftrequestid(int shiftrequestid) {
		this.shiftrequestid = shiftrequestid;
	}
	public String getShiftcode() {
		return shiftcode;
	}
	public void setShiftcode(String shiftcode) {
		this.shiftcode = shiftcode;
	}
	public String getExpertid() {
		return expertid;
	}
	public void setExpertid(String expertid) {
		this.expertid = expertid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public boolean isAccepted() {
		return accepted;
	}
	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSeShiftRequestModel [shiftrequestid=" + shiftrequestid + ", shiftcode=" + shiftcode
				+ ", expertid=" + expertid + ", customerid=" + customerid + ", accepted=" + accepted + "]";
	}
	
}
