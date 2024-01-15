package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="admin_id")
	private NiBLinkNBSbAdminModel admin_id;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private NiBLinkNBSbCustomerModel customer_id;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="expert_id")
	private NiBLinkNBSbExpertModel expert_id;
	public int getWallet_id() {
		return wallet_id;
	}
	public void setWallet_id(int wallet_id) {
		this.wallet_id = wallet_id;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public NiBLinkNBSdWalletHistoryModel getWallet_history_id() {
		return wallet_history_id;
	}
	public void setWallet_history_id(NiBLinkNBSdWalletHistoryModel wallet_history_id) {
		this.wallet_history_id = wallet_history_id;
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
		return "NiBLinkNBScWalletModel [wallet_id=" + wallet_id + ", amount=" + amount + ", wallet_history_id="
				+ wallet_history_id + ", admin_id=" + admin_id + ", customer_id=" + customer_id + ", expert_id="
				+ expert_id + "]";
	}
	
}
