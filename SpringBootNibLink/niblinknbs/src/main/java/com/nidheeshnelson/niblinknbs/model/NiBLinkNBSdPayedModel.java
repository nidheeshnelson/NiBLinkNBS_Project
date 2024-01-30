package com.nidheeshnelson.niblinknbs.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment")
public class NiBLinkNBSdPayedModel {
	@Id
	@GeneratedValue
	private int paymentid;
	private String commissionid;
	private String shiftid;
	private String customerid;
	private String expertid;
	private LocalDateTime commissiondatetime;
	private String thalukcode;
	private boolean workfinished;
	private boolean amountpayed;
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
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
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getExpertid() {
		return expertid;
	}
	public void setExpertid(String expertid) {
		this.expertid = expertid;
	}
	public LocalDateTime getCommissiondatetime() {
		return commissiondatetime;
	}
	public void setCommissiondatetime(LocalDateTime commissiondatetime) {
		this.commissiondatetime = commissiondatetime;
	}
	public String getThalukcode() {
		return thalukcode;
	}
	public void setThalukcode(String thalukcode) {
		this.thalukcode = thalukcode;
	}
	public boolean isWorkfinished() {
		return workfinished;
	}
	public void setWorkfinished(boolean workfinished) {
		this.workfinished = workfinished;
	}
	public boolean isAmountpayed() {
		return amountpayed;
	}
	public void setAmountpayed(boolean amountpayed) {
		this.amountpayed = amountpayed;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSdPayedModel [paymentid=" + paymentid + ", commissionid=" + commissionid + ", shiftid="
				+ shiftid + ", customerid=" + customerid + ", expertid=" + expertid + ", commissiondatetime="
				+ commissiondatetime + ", thalukcode=" + thalukcode + ", workfinished=" + workfinished
				+ ", amountpayed=" + amountpayed + "]";
	}
}
