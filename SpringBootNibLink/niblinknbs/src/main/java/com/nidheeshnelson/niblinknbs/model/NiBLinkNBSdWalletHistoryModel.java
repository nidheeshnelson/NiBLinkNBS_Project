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
//	@OneToMany(mappedBy = "wallet_history_id",cascade = CascadeType.ALL)
//	private List<NiBLinkNBScWalletModel> wallet = new ArrayList<>();
//	@ManyToOne
//	@JoinColumn(name="customer_id")
//	private NiBLinkNBSbcCustomerModel customer_id;
//	@ManyToOne
//	@JoinColumn(name="expert_id")
//	private NiBLinkNBSbbExpertModel expert_id;
//	public int getWallet_history_id() {
//		return wallet_history_id;
//	}
//	public void setWallet_history_id(int wallet_history_id) {
//		this.wallet_history_id = wallet_history_id;
//	}
//	public List<NiBLinkNBScWalletModel> getWallet() {
//		return wallet;
//	}
//	public void setWallet(List<NiBLinkNBScWalletModel> wallet) {
//		this.wallet = wallet;
//	}
//	public NiBLinkNBSbcCustomerModel getCustomer_id() {
//		return customer_id;
//	}
//	public void setCustomer_id(NiBLinkNBSbcCustomerModel customer_id) {
//		this.customer_id = customer_id;
//	}
//	public NiBLinkNBSbbExpertModel getExpert_id() {
//		return expert_id;
//	}
//	public void setExpert_id(NiBLinkNBSbbExpertModel expert_id) {
//		this.expert_id = expert_id;
//	}
//	@Override
//	public String toString() {
//		return "NiBLinkNBSdWalletHistoryModel [wallet_history_id=" + wallet_history_id + ", wallet=" + wallet
//				+ ", customer_id=" + customer_id + ", expert_id=" + expert_id + "]";
//	}
//	
}
