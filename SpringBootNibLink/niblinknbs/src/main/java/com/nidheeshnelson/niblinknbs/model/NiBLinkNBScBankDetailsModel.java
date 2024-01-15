package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="admin_id")
	private NiBLinkNBSbAdminModel admin_id;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private NiBLinkNBSbCustomerModel customer_id;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="expert_id")
	private NiBLinkNBSbExpertModel expert_id;
	public int getBank_id() {
		return bank_id;
	}
	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getSecretpin() {
		return secretpin;
	}
	public void setSecretpin(int secretpin) {
		this.secretpin = secretpin;
	}
	public NiBLinkNBSbAdminModel getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(NiBLinkNBSbAdminModel admin_id) {
		this.admin_id = admin_id;
	}
	public NiBLinkNBSbCustomerModel getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(NiBLinkNBSbCustomerModel customer_id) {
		this.customer_id = customer_id;
	}
	public NiBLinkNBSbExpertModel getExpert_id() {
		return expert_id;
	}
	public void setExpert_id(NiBLinkNBSbExpertModel expert_id) {
		this.expert_id = expert_id;
	}
	@Override
	public String toString() {
		return "NiBLinkNBScBankDetailsModel [bank_id=" + bank_id + ", bank=" + bank + ", branch=" + branch + ", ifsc="
				+ ifsc + ", accountnumber=" + accountnumber + ", secretpin=" + secretpin + ", admin_id=" + admin_id
				+ ", customer_id=" + customer_id + ", expert_id=" + expert_id + "]";
	}
	
}
