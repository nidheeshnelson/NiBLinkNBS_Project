package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="admins")
public class NiBLinkNBSbAdminModel {
	@Id
	@GeneratedValue
	private int admin_id;
	@OneToOne
	private NiBLinkNBScPersonalModel personal_details;
	@OneToOne
	private NiBLinkNBScAddressModel address;
	@OneToOne
	private NiBLinkNBScBankDetailsModel bank_details;
	@OneToOne
	private NiBLinkNBScIdentityModel identity_details;
	@OneToOne
	private NiBLinkNBSdWalletHistoryModel wallet;
	@OneToOne
	private NiBLinkNBScPaymentDetailsModel payment_details;
}
