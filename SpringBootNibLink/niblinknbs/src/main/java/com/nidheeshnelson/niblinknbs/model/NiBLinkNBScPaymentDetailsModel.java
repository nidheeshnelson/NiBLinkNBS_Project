package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment_details")
public class NiBLinkNBScPaymentDetailsModel {
	@Id
	private String paymentid;
	private double paymentperhour;
	private String commissionid;
	public String getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}
	public double getPaymentperhour() {
		return paymentperhour;
	}
	public void setPaymentperhour(double paymentperhour) {
		this.paymentperhour = paymentperhour;
	}
	public String getCommissionid() {
		return commissionid;
	}
	public void setCommissionid(String commissionid) {
		this.commissionid = commissionid;
	}
	@Override
	public String toString() {
		return "NiBLinkNBScPaymentDetailsModel [paymentid=" + paymentid + ", paymentperhour=" + paymentperhour
				+ ", commissionid=" + commissionid + "]";
	}
	
}
