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
	private LocalDateTime paymentdatetime;
	private double payment;
	private String thalukcode;
	private ShiftStatus status;
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
	public LocalDateTime getPaymentdatetime() {
		return paymentdatetime;
	}
	public void setPaymentdatetime(LocalDateTime commissiondatetime) {
		this.paymentdatetime = commissiondatetime;
	}
	public boolean isPaymentdatetimeNull() {
		return this.paymentdatetime==null;
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
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSdPayedModel [paymentid=" + paymentid + ", commissionid=" + commissionid + ", shiftid="
				+ shiftid + ", customerid=" + customerid + ", expertid=" + expertid + ", paymentdatetime="
				+ paymentdatetime + ", payment=" + payment + ", thalukcode=" + thalukcode + ", status=" + status + "]";
	}
}
