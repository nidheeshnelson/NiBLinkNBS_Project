package com.nidheeshnelson.niblinknbs.model;

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
	private int identity_id;
	private long adhar;
	private String pancard;
	private String electionid;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="admin_id")
	private NiBLinkNBSbAdminModel admin_id;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private NiBLinkNBSbCustomerModel customer_id;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="expert_id")
	private NiBLinkNBSbExpertModel expert_id;
	public int getIdentity_id() {
		return identity_id;
	}
	public void setIdentity_id(int identity_id) {
		this.identity_id = identity_id;
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
		return "NiBLinkNBScIdentityModel [identity_id=" + identity_id + ", adhar=" + adhar + ", pancard=" + pancard
				+ ", electionid=" + electionid + ", admin_id=" + admin_id + ", customer_id=" + customer_id
				+ ", expert_id=" + expert_id + "]";
	}
	
}
