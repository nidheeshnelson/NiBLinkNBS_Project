package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment_details")
public class NiBLinkNBScPaymentDetailsModel {
	@Id
	@GeneratedValue
	private int payment_id;
	private double paymentperhour;
	private double commission;
}
