package com.nidheeshnelson.niblinknbs.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "expert", cascade = CascadeType.ALL)
    private List<NiBLinkNBSeShiftModel> shiftList;
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
	public List<NiBLinkNBSeShiftModel> getShiftList() {
		return shiftList;
	}
	public void setShiftList(List<NiBLinkNBSeShiftModel> shiftList) {
		this.shiftList = shiftList;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSbbExpertModel [expertid=" + expertid + ", firstname="
				+ firstname + ", middlename=" + middlename + ", lastname=" + lastname + ", shiftList=" + shiftList
				+ "]" +", status=" +status;
	}
	
	
}
