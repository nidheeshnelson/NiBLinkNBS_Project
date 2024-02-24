package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Expert_details")
public class NiBLinkNBSbbExpertModel {
	@Id
	private String expertid;
	private String firstname;
	private String middlename;
	private String lastname;
	public static final int status=2;
	public String getExpertid() {
		return expertid;
	}
	public void setExpertid(String expertid) {
		this.expertid = expertid;
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
	public boolean isFirstnameNull() {
		return firstname==null;
	}
	public boolean isMiddlenameNull() {
		return middlename==null;
	}
	public boolean isLastnameNull() {
		return lastname==null;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSbbExpertModel [expertid=" + expertid + ", firstname=" + firstname + ", middlename="
				+ middlename + ", lastname=" + lastname + ", status=" + status +"]";
	}
	
}
