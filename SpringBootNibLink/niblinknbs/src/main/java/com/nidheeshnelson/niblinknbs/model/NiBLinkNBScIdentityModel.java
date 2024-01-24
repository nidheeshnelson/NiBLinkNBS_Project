package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "identityproof")
public class NiBLinkNBScIdentityModel {
	@Id
	@GeneratedValue
	private int identityid;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "namelistid", referencedColumnName = "namelistid")
	private NiBLinkNBSaStatusModel namelistid;
	private long adhar;
	private String pancard;
	private String electionid;
	public int getIdentityid() {
		return identityid;
	}
	public void setIdentityid(int identityid) {
		this.identityid = identityid;
	}
	public NiBLinkNBSaStatusModel getNamelistid() {
		return namelistid;
	}
	public void setNamelistid(NiBLinkNBSaStatusModel statusid) {
		this.namelistid = statusid;
	}
	public long getAdhar() {
		return adhar;
	}
	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getElectionid() {
		return electionid;
	}
	public void setElectionid(String electionid) {
		this.electionid = electionid;
	}
	@Override
	public String toString() {
		return "NiBLinkNBScIdentityModel [identityid=" + identityid + ", namelistid=" + namelistid + ", adhar=" + adhar
				+ ", pancard=" + pancard + ", electionid=" + electionid + "]";
	}
	
}
