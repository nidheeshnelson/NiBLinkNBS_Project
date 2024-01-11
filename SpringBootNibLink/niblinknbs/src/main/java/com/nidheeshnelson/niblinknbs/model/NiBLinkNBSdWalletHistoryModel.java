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
import jakarta.persistence.Table;

@Entity
@Table(name="cash_wallet")
public class NiBLinkNBSdWalletHistoryModel {
	@Id
	@GeneratedValue
	private int wallet_history_id;
	@OneToMany(mappedBy = "wallet_history_id",cascade = CascadeType.ALL)
	private List<NiBLinkNBScWalletModel> wallet = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name="customer_id")
	private NiBLinkNBSbCustomerModel customer_id;
	@ManyToOne
	@JoinColumn(name="expert_id")
	private NiBLinkNBSbExpertModel expert_id;
}
