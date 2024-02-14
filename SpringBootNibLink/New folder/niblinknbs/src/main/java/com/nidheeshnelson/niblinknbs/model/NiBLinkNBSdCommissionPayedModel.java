package com.nidheeshnelson.niblinknbs.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="commission_details")
public class NiBLinkNBSdCommissionPayedModel {
	@Id
	@GeneratedValue
	private int commissionpayedid;
	private String commissionid;
	private String shiftid;
	private String expertid;
	private String customerid;
	private double commissionpersentage;
	private double commissionamount;
	private LocalDateTime datetimeofcommission;
	private String thalukcode;
	private ShiftStatus status;
	public int getCommissionpayedid() {
		return commissionpayedid;
	}
	public void setCommissionpayedid(int commissionpayedid) {
		this.commissionpayedid = commissionpayedid;
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
	public double getCommissionpersentage() {
		return commissionpersentage;
	}
	public void setCommissionpersentage(double commissionpersentage) {
		this.commissionpersentage = commissionpersentage;
	}
	public double getCommissionamount() {
		return commissionamount;
	}
	public void setCommissionamount(double commissionamount) {
		this.commissionamount = commissionamount;
	}
	public LocalDateTime getDatetimeofcommission() {
		return datetimeofcommission;
	}
	public void setDatetimeofcommission(LocalDateTime datetimeofcommission) {
		this.datetimeofcommission = datetimeofcommission;
	}
	public String getThalukcode() {
		return thalukcode;
	}
	public void setThalukcode(String thalukcode) {
		this.thalukcode = thalukcode;
	}
	public ShiftStatus getStatus() {
		return status;
	}
	public void setStatus(ShiftStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSdCommissionPayedModel [commissionpayedid=" + commissionpayedid + ", commissionid="
				+ commissionid + ", shiftid=" + shiftid + ", expertid=" + expertid + ", customerid=" + customerid
				+ ", commissionpersentage=" + commissionpersentage + ", commissionamount=" + commissionamount
				+ ", datetimeofcommission=" + datetimeofcommission + ", thalukcode=" + thalukcode + ", status=" + status
				+ "]";
	}
}
