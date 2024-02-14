package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admins")
public class NiBLinkNBSbaAdminModel {
	@Id
	private String adminid;
	private String firstname;
	private String middlename;
	private String lastname;
	public static final int status=1;
	
	public String getAdminid() {
		return adminid;
	}

	public void setAdminid(String adminid) {
		this.adminid = adminid;
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

	public static int getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "NiBLinkNBSbaAdminModel [adminid=" + adminid + ", firstname=" + firstname
				+ ", middlename=" + middlename + ", lastname=" + lastname + "]" +", status=" +status;
	}
	
	
}
