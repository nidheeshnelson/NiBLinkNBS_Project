package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="commission_details")
public class NiBLinkNBSdCommissionModel {
	@Id
	@GeneratedValue
	private int commission_id;
	@ManyToOne
	@JoinColumn(name="expert_id")
	private NiBLinkNBSbExpertModel expert_id;
	private String datetime;
	private double commission_amount;
}
