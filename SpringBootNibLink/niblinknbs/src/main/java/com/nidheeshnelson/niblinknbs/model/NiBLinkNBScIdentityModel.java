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
	private String identityid;
	private long adhar;
	private String pancard;
	private String electionid;
	public String getIdentityid() {
		return identityid;
	}
	public void setIdentityid(String identityid) {
		this.identityid = identityid;
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
		return "NiBLinkNBScIdentityModel [identityid=" + identityid + ", adhar=" + adhar
				+ ", pancard=" + pancard + ", electionid=" + electionid + "]";
	}
	
}
