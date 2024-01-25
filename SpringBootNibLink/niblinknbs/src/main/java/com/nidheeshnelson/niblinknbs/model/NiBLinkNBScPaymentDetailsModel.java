package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="payment_details")
public class NiBLinkNBScPaymentDetailsModel {
	@Id
	private String paymentid;
	private double paymentperhour;
	private double commission;
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
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	@Override
	public String toString() {
		return "NiBLinkNBScPaymentDetailsModel [paymentid=" + paymentid + ", paymentperhour="
				+ paymentperhour + ", commission=" + commission + "]";
	}
	
	
}
