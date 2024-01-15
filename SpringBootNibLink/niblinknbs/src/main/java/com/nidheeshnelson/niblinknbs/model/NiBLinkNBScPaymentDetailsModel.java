package com.nidheeshnelson.niblinknbs.model;

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
	private int payment_id;
	private double paymentperhour;
	private double commission;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="admin_id")
	private NiBLinkNBSbAdminModel admin_id;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="expert_id")
	private NiBLinkNBSbExpertModel expert_id;
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
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
	public NiBLinkNBSbAdminModel getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(NiBLinkNBSbAdminModel admin_id) {
		this.admin_id = admin_id;
	}
	public NiBLinkNBSbExpertModel getExpert_id() {
		return expert_id;
	}
	public void setExpert_id(NiBLinkNBSbExpertModel expert_id) {
		this.expert_id = expert_id;
	}
	@Override
	public String toString() {
		return "NiBLinkNBScPaymentDetailsModel [payment_id=" + payment_id + ", paymentperhour=" + paymentperhour
				+ ", commission=" + commission + ", admin_id=" + admin_id + ", expert_id=" + expert_id + "]";
	}
	
}
