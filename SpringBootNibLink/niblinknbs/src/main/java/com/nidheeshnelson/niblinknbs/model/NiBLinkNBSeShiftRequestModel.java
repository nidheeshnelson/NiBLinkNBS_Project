package com.nidheeshnelson.niblinknbs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

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
	private LocalDate shiftdate;
	private LocalTime shifttime;
	private LocalDateTime acceptorrejectdatetime;
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
	public LocalDate getShiftdate() {
		return shiftdate;
	}
	public void setShiftdate(LocalDate shiftdate) {
		this.shiftdate = shiftdate;
	}
	public LocalTime getShifttime() {
		return shifttime;
	}
	public void setShifttime(LocalTime shifttime) {
		this.shifttime = shifttime;
	}
	public LocalDateTime getAcceptorrejectdatetime() {
		return acceptorrejectdatetime;
	}
	public void setAcceptorrejectdatetime(LocalDateTime acceptorrejectdatetime) {
		this.acceptorrejectdatetime = acceptorrejectdatetime;
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
				+ ", requesteddatetime=" + requesteddatetime + ", shiftdate=" + shiftdate + ", shifttime=" + shifttime
				+ ", acceptorrejectdatetime=" + acceptorrejectdatetime + ", expertid=" + expertid + ", customerid="
				+ customerid + ", status=" + status + "]";
	}
	
}
