package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="wallet")
public class NiBLinkNBScWalletModel {
	@Id
	private String walletid;
	private long amount;
	public String getWalletid() {
		return walletid;
	}
	public void setWalletid(String walletid) {
		this.walletid = walletid;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "NiBLinkNBScWalletModel [walletid=" + walletid + ", amount=" + amount + "]";
	}
	
	
}
