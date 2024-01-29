package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="banking_details")
public class NiBLinkNBScBankingDetailsModel {
	@Id
	private String bankid;
	private String bank;
	private String branch;
	private String ifsc;
	private String accountnumber;
	private int secretpin;
	private String upiid;
	public String getBankid() {
		return bankid;
	}
	public void setBankid(String bankid) {
		this.bankid = bankid;
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
	public String getUpiid() {
		return upiid;
	}
	public void setUpiid(String upiid) {
		this.upiid = upiid;
	}
	@Override
	public String toString() {
		return "NiBLinkNBScBankingDetailsModel [bankid=" + bankid  + ", bank=" + bank
				+ ", branch=" + branch + ", ifsc=" + ifsc + ", accountnumber=" + accountnumber + ", secretpin="
				+ secretpin + ", upiid=" + upiid + "]";
	}
	
}
