package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="admins")
public class NiBLinkNBSbaAdminModel {
	@Id
	@GeneratedValue
	private int adminid;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "namelistid", referencedColumnName = "namelistid")
	private NiBLinkNBSaStatusModel namelistid;
	private String firstname;
	private String middlename;
	private String lastname;
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public NiBLinkNBSaStatusModel getNamelistid() {
		return namelistid;
	}
	public void setNamelistid(NiBLinkNBSaStatusModel statusid) {
		this.namelistid = statusid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSbaAdminModel [adminid=" + adminid + ", statusid=" + namelistid + ", firstname=" + firstname
				+ ", middlename=" + middlename + ", lastname=" + lastname + "]";
	}
	
	
}
