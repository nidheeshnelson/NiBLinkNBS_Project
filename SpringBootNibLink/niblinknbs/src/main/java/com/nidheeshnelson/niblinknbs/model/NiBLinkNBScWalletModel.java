package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="wallet")
public class NiBLinkNBScWalletModel {
	@Id
	@GeneratedValue
	private int wallet_id;
	private long amount;
	@ManyToOne
	@JoinColumn
	private NiBLinkNBSdWalletHistoryModel wallet_history_id;
}
