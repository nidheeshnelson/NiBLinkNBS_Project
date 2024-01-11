package com.nidheeshnelson.niblinknbs.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
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
	@OneToOne
	private NiBLinkNBScPersonalModel personal_details;
	@OneToOne
	private NiBLinkNBScAddressModel address;
	@OneToOne
	private NiBLinkNBScBankDetailsModel bank_details;
	@OneToOne
	private NiBLinkNBScIdentityModel identity_details;
	@OneToOne
	private NiBLinkNBScPaymentDetailsModel payment_details;
	@OneToOne
	private NiBLinkNBScWalletModel wallet;
	@OneToMany(mappedBy = "expert_id", cascade = CascadeType.ALL)
	private List<NiBLinkNBSdCommissionModel> commission_amount=new ArrayList<>();
	@OneToMany(mappedBy = "expert_id", cascade = CascadeType.ALL)
	private List<NiBLinkNBSdSalaryModel> salary_amount=new ArrayList<>();
	@OneToMany(mappedBy = "expert_id", cascade = CascadeType.ALL)
	private List<NiBLinkNBSdWalletHistoryModel> wallet_amount=new ArrayList<>();
}
