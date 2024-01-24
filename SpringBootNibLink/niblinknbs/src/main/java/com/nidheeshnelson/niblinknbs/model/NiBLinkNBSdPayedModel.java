package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="payment")
public class NiBLinkNBSdPayedModel {
	@Id
	@GeneratedValue
	private int payment_id;
//	@ManyToOne
//	@JoinColumn(name="customer_id")
//	private NiBLinkNBSbcCustomerModel customer_id;
//	public int getPayment_id() {
//		return payment_id;
//	}
//	public void setPayment_id(int payment_id) {
//		this.payment_id = payment_id;
//	}
//	public NiBLinkNBSbcCustomerModel getCustomer_id() {
//		return customer_id;
//	}
//	public void setCustomer_id(NiBLinkNBSbcCustomerModel customer_id) {
//		this.customer_id = customer_id;
//	}
//	@Override
//	public String toString() {
//		return "NiBLinkNBSdPaymentModel [payment_id=" + payment_id + ", customer_id=" + customer_id + "]";
//	}
//	
}
