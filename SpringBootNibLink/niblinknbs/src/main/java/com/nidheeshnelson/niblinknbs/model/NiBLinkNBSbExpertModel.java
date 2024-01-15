package com.nidheeshnelson.niblinknbs.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Expert_details")
public class NiBLinkNBSbExpertModel {
	@Id
	@GeneratedValue
	private int expert_id;
	@ManyToOne
	@JoinColumn(name="job_id")
	private NiBLinkNBSaJobModel job_id;
	@OneToOne(mappedBy = "expert_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScPersonalModel personal_details;
	@OneToOne(mappedBy = "expert_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScAddressModel address;
	@OneToOne(mappedBy = "expert_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScBankDetailsModel bank_details;
	@OneToOne(mappedBy = "expert_id", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private NiBLinkNBScIdentityModel identity_details;
	@OneToOne(mappedBy = "expert_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScPaymentDetailsModel payment_details;
	@OneToOne(mappedBy = "expert_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBScWalletModel wallet;
	@OneToMany(mappedBy = "expert_id", cascade = CascadeType.ALL)
	private List<NiBLinkNBSdCommissionModel> commission_amount=new ArrayList<>();
	@OneToMany(mappedBy = "expert_id", cascade = CascadeType.ALL)
	private List<NiBLinkNBSdSalaryModel> salary_amount=new ArrayList<>();
	@OneToMany(mappedBy = "expert_id", cascade = CascadeType.ALL)
	private List<NiBLinkNBSdWalletHistoryModel> wallet_amount=new ArrayList<>();
	@OneToMany(mappedBy = "expert_id", cascade = CascadeType.ALL)
	private List<NiBLinkNBSeShiftModel> shifts = new ArrayList<>();
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="log_id")
	private NiBLinkNBSaLogInModel log_id;
	public int getExpert_id() {
		return expert_id;
	}
	public void setExpert_id(int expert_id) {
		this.expert_id = expert_id;
	}
	public NiBLinkNBSaJobModel getJob_id() {
		return job_id;
	}
	public void setJob_id(NiBLinkNBSaJobModel job_id) {
		this.job_id = job_id;
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
	public NiBLinkNBScPaymentDetailsModel getPayment_details() {
		return payment_details;
	}
	public void setPayment_details(NiBLinkNBScPaymentDetailsModel payment_details) {
		this.payment_details = payment_details;
	}
	public NiBLinkNBScWalletModel getWallet() {
		return wallet;
	}
	public void setWallet(NiBLinkNBScWalletModel wallet) {
		this.wallet = wallet;
	}
	public List<NiBLinkNBSdCommissionModel> getCommission_amount() {
		return commission_amount;
	}
	public void setCommission_amount(List<NiBLinkNBSdCommissionModel> commission_amount) {
		this.commission_amount = commission_amount;
	}
	public List<NiBLinkNBSdSalaryModel> getSalary_amount() {
		return salary_amount;
	}
	public void setSalary_amount(List<NiBLinkNBSdSalaryModel> salary_amount) {
		this.salary_amount = salary_amount;
	}
	public List<NiBLinkNBSdWalletHistoryModel> getWallet_amount() {
		return wallet_amount;
	}
	public void setWallet_amount(List<NiBLinkNBSdWalletHistoryModel> wallet_amount) {
		this.wallet_amount = wallet_amount;
	}
	public List<NiBLinkNBSeShiftModel> getShifts() {
		return shifts;
	}
	public void setShifts(List<NiBLinkNBSeShiftModel> shifts) {
		this.shifts = shifts;
	}
	public NiBLinkNBSaLogInModel getLog_id() {
		return log_id;
	}
	public void setLog_id(NiBLinkNBSaLogInModel log_id) {
		this.log_id = log_id;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSbExpertModel [expert_id=" + expert_id + ", job_id=" + job_id + ", personal_details="
				+ personal_details + ", address=" + address + ", bank_details=" + bank_details + ", identity_details="
				+ identity_details + ", payment_details=" + payment_details + ", wallet=" + wallet
				+ ", commission_amount=" + commission_amount + ", salary_amount=" + salary_amount + ", wallet_amount="
				+ wallet_amount + ", shifts=" + shifts + ", log_id=" + log_id + "]";
	}
	
}
