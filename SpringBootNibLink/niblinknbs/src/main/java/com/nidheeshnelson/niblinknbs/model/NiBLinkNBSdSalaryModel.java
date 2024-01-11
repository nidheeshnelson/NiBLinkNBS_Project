package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class NiBLinkNBSdSalaryModel {
	@Id
	@GeneratedValue
	private int salary_id;
	@ManyToOne
	@JoinColumn(name="expert_id")
	private NiBLinkNBSbExpertModel expert_id;
	private String datetime;
	private double salary_amount;
}
