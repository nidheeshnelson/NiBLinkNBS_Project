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
@Table(name="admins")
public class NiBLinkNBSbAdminModel {
	@Id
	@GeneratedValue
	private int admin_id;
	@OneToOne(mappedBy = "admin_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScPersonalModel personal_details;
	@OneToOne(mappedBy = "admin_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScAddressModel address;
	@OneToOne(mappedBy = "admin_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScBankDetailsModel bank_details;
	@OneToOne(mappedBy = "admin_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScIdentityModel identity_details;
	@OneToOne(mappedBy = "admin_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScWalletModel wallet;
	@OneToOne(mappedBy = "admin_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScPaymentDetailsModel payment_details;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="log_id")
	private NiBLinkNBSaLogInModel log_id;
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public NiBLinkNBScPersonalModel getPersonal_details() {
		return personal_details;
	}
	public void setPersonal_details(NiBLinkNBScPersonalModel personal_details) {
		this.personal_details = personal_details;
	}
	public NiBLinkNBScAddressModel getAddress() {
		return address;
	}
	public void setAddress(NiBLinkNBScAddressModel address) {
		this.address = address;
	}
	public NiBLinkNBScBankDetailsModel getBank_details() {
		return bank_details;
	}
	public void setBank_details(NiBLinkNBScBankDetailsModel bank_details) {
		this.bank_details = bank_details;
	}
	public NiBLinkNBScIdentityModel getIdentity_details() {
		return identity_details;
	}
	public void setIdentity_details(NiBLinkNBScIdentityModel identity_details) {
		this.identity_details = identity_details;
	}
	public NiBLinkNBScWalletModel getWallet() {
		return wallet;
	}
	public void setWallet(NiBLinkNBScWalletModel wallet) {
		this.wallet = wallet;
	}
	public NiBLinkNBScPaymentDetailsModel getPayment_details() {
		return payment_details;
	}
	public void setPayment_details(NiBLinkNBScPaymentDetailsModel payment_details) {
		this.payment_details = payment_details;
	}
	
	public NiBLinkNBSaLogInModel getLog_id() {
		return log_id;
	}
	public void setLog_id(NiBLinkNBSaLogInModel log_id) {
		this.log_id = log_id;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSbAdminModel [admin_id=" + admin_id + ", personal_details=" + personal_details + ", address="
				+ address + ", bank_details=" + bank_details + ", identity_details=" + identity_details + ", wallet="
				+ wallet + ", payment_details=" + payment_details + ", log_id=" + log_id + "]";
	}
	
}
