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
	@GeneratedValue
	private int paymentid;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "experttid",referencedColumnName = "expertid")
	private NiBLinkNBSbbExpertModel expertid;
	private double paymentperhour;
	private double commission;
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public NiBLinkNBSbbExpertModel getExpertid() {
		return expertid;
	}
	public void setExpertid(NiBLinkNBSbbExpertModel expert) {
		this.expertid = expert;
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
		return "NiBLinkNBScPaymentDetailsModel [paymentid=" + paymentid + ", expertid=" + expertid + ", paymentperhour="
				+ paymentperhour + ", commission=" + commission + "]";
	}
	
	
}
