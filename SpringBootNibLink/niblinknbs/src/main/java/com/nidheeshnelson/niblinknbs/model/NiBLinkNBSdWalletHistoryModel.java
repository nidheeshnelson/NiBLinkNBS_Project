package com.nidheeshnelson.niblinknbs.model;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cash_wallet")
public class NiBLinkNBSdWalletHistoryModel {
	@Id
	@GeneratedValue
	private int wallethistoryid;
	private String walletid;
	private long addedamount;
	private LocalDateTime adddatetime;
	public int getWallethistoryid() {
		return wallethistoryid;
	}
	public void setWallethistoryid(int wallethistoryid) {
		this.wallethistoryid = wallethistoryid;
	}
	public String getWalletid() {
		return walletid;
	}
	public void setWalletid(String walletid) {
		this.walletid = walletid;
	}
	public LocalDateTime getAdddatetime() {
		return adddatetime;
	}
	public void setAdddatetime(LocalDateTime adddatetime) {
		this.adddatetime = adddatetime;
	}
	public long getAddedamount() {
		return addedamount;
	}
	public void setAddedamount(long addedamount) {
		this.addedamount = addedamount;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSdWalletHistoryModel [wallethistoryid=" + wallethistoryid + ", walletid=" + walletid
				+ ", addedamount=" + addedamount + ", adddatetime=" + adddatetime + "]";
	}
	
}
