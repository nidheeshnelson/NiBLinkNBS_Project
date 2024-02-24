package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "identityproof")
public class NiBLinkNBScIdentityModel {
	@Id
	private String identityid;
	@Column(unique = true)
	private String adhar;
	@Column(unique = true)
	private String pancard;
	@Column(unique = true)
	private String electionid;
	public boolean isAdharNull() {
		return adhar==null;
	}
	public boolean isPancardNull() {
		return pancard==null;
	}
	public boolean isElectionidNull() {
		return electionid==null;
	}
	public String getIdentityid() {
		return identityid;
	}
	public void setIdentityid(String identityid) {
		this.identityid = identityid;
	}
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
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
