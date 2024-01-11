package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="banking_details")
public class NiBLinkNBScBankDetailsModel {
	@Id
	@GeneratedValue
	private int bank_id;
	private String bank;
	private String branch;
	private String ifsc;
	private String accountnumber;
	private int secretpin;
}
