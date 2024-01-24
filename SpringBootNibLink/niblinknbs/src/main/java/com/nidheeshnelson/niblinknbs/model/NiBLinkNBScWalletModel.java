package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.CascadeType;
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
	private int walletid;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "namelistid", referencedColumnName = "namelistid")
	private NiBLinkNBSaStatusModel namelistid;
	private long amount;
	public int getWalletid() {
		return walletid;
	}
	public void setWalletid(int walletid) {
		this.walletid = walletid;
	}
	public NiBLinkNBSaStatusModel getNamelistid() {
		return namelistid;
	}
	public void setNamelistid(NiBLinkNBSaStatusModel statusid) {
		this.namelistid = statusid;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "NiBLinkNBScWalletModel [walletid=" + walletid + ", namelistid=" + namelistid + ", amount=" + amount + "]";
	}
	
	
}
