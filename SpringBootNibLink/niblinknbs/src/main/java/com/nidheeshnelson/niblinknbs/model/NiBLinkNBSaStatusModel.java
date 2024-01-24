package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="namelist")
public class NiBLinkNBSaStatusModel {
	@Id
	private String namelistid;
	private int status;
	@OneToOne(mappedBy = "namelistid",cascade = CascadeType.ALL)
	private NiBLinkNBScAddressModel address;
	@OneToOne(mappedBy = "namelistid",cascade = CascadeType.ALL)
	private NiBLinkNBSbaAdminModel admin;
	@OneToOne(mappedBy = "namelistid",cascade = CascadeType.ALL)
	private NiBLinkNBSbbExpertModel expert;
	@OneToOne(mappedBy = "namelistid",cascade = CascadeType.ALL)
	private NiBLinkNBSbcCustomerModel customer;
	@OneToOne(mappedBy = "namelistid",cascade = CascadeType.ALL)
	private NiBLinkNBScBankingDetailsModel banking;
	@OneToOne(mappedBy = "namelistid",cascade = CascadeType.ALL)
	private NiBLinkNBScIdentityModel identity;
	@OneToOne(mappedBy = "namelistid",cascade = CascadeType.ALL)
	private NiBLinkNBScPersonalModel personal;
	public String getNamelistid() {
		return namelistid;
	}
	public void setNamelistid(String namelistid) {
		this.namelistid = namelistid;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSaStatusModel [namelistid=" + namelistid + ", status=" + status + "]";
	}
	
}
