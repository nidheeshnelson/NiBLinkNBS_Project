package com.nidheeshnelson.niblinknbs.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_details")
public class NiBLinkNBSbCustomerModel {
	@Id
	@GeneratedValue
	private int customer_id;
	@OneToOne
	private NiBLinkNBScPersonalModel personal_details;
	@OneToOne
	private NiBLinkNBScAddressModel address;
	@OneToOne
	private NiBLinkNBScBankDetailsModel bank_details;
	@OneToOne
	private NiBLinkNBScIdentityModel identity_details;
	@OneToOne
	private NiBLinkNBScWalletModel wallet_id;
	@OneToMany(mappedBy = "customer_id", cascade = CascadeType.ALL)
	private List<NiBLinkNBSdWalletHistoryModel> wallet_amount=new ArrayList<>();
	
}
