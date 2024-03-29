package com.nidheeshnelson.niblinknbs.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class NiBLinkNBSdSalaryModel {
	@Id
	@GeneratedValue
	private int salaryid;
	private String commissionid;
	private String shiftid;
	private String expertid;
	private String customerid;
	private String thalukcode;
	private LocalDateTime salarypayeddatetime;
	private ShiftStatus status;
	public int getSalaryid() {
		return salaryid;
	}
	public void setSalaryid(int salaryid) {
		this.salaryid = salaryid;
	}
	public String getCommissionid() {
		return commissionid;
	}
	public void setCommissionid(String commissionid) {
		this.commissionid = commissionid;
	}
	public String getShiftid() {
		return shiftid;
	}
	public void setShiftid(String shiftid) {
		this.shiftid = shiftid;
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
	public String getThalukcode() {
		return thalukcode;
	}
	public void setThalukcode(String thalukcode) {
		this.thalukcode = thalukcode;
	}
	public LocalDateTime getSalarypayeddatetime() {
		return salarypayeddatetime;
	}
	public void setSalarypayeddatetime(LocalDateTime salarypayeddatetime) {
		this.salarypayeddatetime = salarypayeddatetime;
	}
		public ShiftStatus getStatus() {
		return status;
	}
	public void setStatus(ShiftStatus status) {
		this.status = status;
	}
		@Override
		public String toString() {
			return "NiBLinkNBSdSalaryModel [salaryid=" + salaryid + ", commissionid=" + commissionid + ", shiftid="
					+ shiftid + ", expertid=" + expertid + ", customerid=" + customerid + ", thalukcode=" + thalukcode
					+ ", salarypayeddatetime=" + salarypayeddatetime + ", status=" + status + "]";
		}
	
}
