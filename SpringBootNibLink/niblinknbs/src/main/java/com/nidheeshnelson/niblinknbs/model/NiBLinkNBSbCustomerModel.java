package com.nidheeshnelson.niblinknbs.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_details")
public class NiBLinkNBSbCustomerModel {
	@Id
	@GeneratedValue
	private int customer_id;
	@OneToOne(mappedBy = "customer_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScPersonalModel personal_details;
	@OneToOne(mappedBy = "customer_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScAddressModel address;
	@OneToOne(mappedBy = "customer_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScBankDetailsModel bank_details;
	@OneToOne(mappedBy = "customer_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScIdentityModel identity_details;
	@OneToOne(mappedBy = "customer_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScWalletModel wallet_id;
	@OneToMany(mappedBy = "customer_id", cascade = CascadeType.ALL)
	private List<NiBLinkNBSdWalletHistoryModel> wallet_amount=new ArrayList<>();
	@OneToMany(mappedBy = "customer_id", cascade = CascadeType.ALL)
	private List<NiBLinkNBSdPayedModel> payment_amount = new ArrayList<>();
	@OneToMany(mappedBy = "customer_id", cascade = CascadeType.ALL)
	private List<NiBLinkNBSeShiftModel> shifts = new ArrayList<>();
	@OneToOne(mappedBy = "customer_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBSeShiftRequestModel shift_request;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="log_id")
	private NiBLinkNBSaLogInModel log_id;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
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
	public NiBLinkNBScWalletModel getWallet_id() {
		return wallet_id;
	}
	public void setWallet_id(NiBLinkNBScWalletModel wallet_id) {
		this.wallet_id = wallet_id;
	}
	public List<NiBLinkNBSdWalletHistoryModel> getWallet_amount() {
		return wallet_amount;
	}
	public void setWallet_amount(List<NiBLinkNBSdWalletHistoryModel> wallet_amount) {
		this.wallet_amount = wallet_amount;
	}
	public List<NiBLinkNBSdPayedModel> getPayment_amount() {
		return payment_amount;
	}
	public void setPayment_amount(List<NiBLinkNBSdPayedModel> payment_amount) {
		this.payment_amount = payment_amount;
	}
	public List<NiBLinkNBSeShiftModel> getShifts() {
		return shifts;
	}
	public void setShifts(List<NiBLinkNBSeShiftModel> shifts) {
		this.shifts = shifts;
	}
	public NiBLinkNBSeShiftRequestModel getShift_request() {
		return shift_request;
	}
	public void setShift_request(NiBLinkNBSeShiftRequestModel shift_request) {
		this.shift_request = shift_request;
	}
	
	public NiBLinkNBSaLogInModel getLog_id() {
		return log_id;
	}
	public void setLog_id(NiBLinkNBSaLogInModel log_id) {
		this.log_id = log_id;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSbCustomerModel [customer_id=" + customer_id + ", personal_details=" + personal_details
				+ ", address=" + address + ", bank_details=" + bank_details + ", identity_details=" + identity_details
				+ ", wallet_id=" + wallet_id + ", wallet_amount=" + wallet_amount + ", payment_amount=" + payment_amount
				+ ", shifts=" + shifts + ", shift_request=" + shift_request + ", log_id=" + log_id + "]";
	}
	
}
