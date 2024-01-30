package com.nidheeshnelson.niblinknbs.model;

import java.time.LocalDateTime;
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
	private String shiftid;
	private LocalDateTime requesteddatetime;
	private LocalDateTime startdatetime;
	private String expertid;
	private String customerid;
	private ShiftStatus status;
	public int getShiftrequestid() {
		return shiftrequestid;
	}
	public void setShiftrequestid(int shiftrequestid) {
		this.shiftrequestid = shiftrequestid;
	}
	public String getShiftid() {
		return shiftid;
	}
	public void setShiftid(String shiftid) {
		this.shiftid = shiftid;
	}
	public LocalDateTime getRequesteddatetime() {
		return requesteddatetime;
	}
	public void setRequesteddatetime(LocalDateTime requesteddatetime) {
		this.requesteddatetime = requesteddatetime;
	}
	public LocalDateTime getStartdatetime() {
		return startdatetime;
	}
	public void setStartdatetime(LocalDateTime startdatetime) {
		this.startdatetime = startdatetime;
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
	public ShiftStatus getStatus() {
		return status;
	}
	public void setStatus(ShiftStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSeShiftRequestModel [shiftrequestid=" + shiftrequestid + ", shiftid=" + shiftid
				+ ", requesteddatetime=" + requesteddatetime + ", startdatetime=" + startdatetime + ", expertid="
				+ expertid + ", customerid=" + customerid + ", status=" + status + "]";
	}
	
}
