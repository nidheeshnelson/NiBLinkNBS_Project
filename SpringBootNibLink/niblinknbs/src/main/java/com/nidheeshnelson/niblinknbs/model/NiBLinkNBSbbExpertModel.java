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
	@GeneratedValue
	private int expertid;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "namelistid", referencedColumnName = "namelistid")
	private NiBLinkNBSaStatusModel namelistid;
	private String firstname;
	private String middlename;
	private String lastname;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "expert", cascade = CascadeType.ALL)
    private List<NiBLinkNBSeShiftModel> shiftList;
	public int getExpertid() {
		return expertid;
	}
	public void setExpertid(int expertid) {
		this.expertid = expertid;
	}
	public NiBLinkNBSaStatusModel getNamelistid() {
		return namelistid;
	}
	public void setNamelistid(NiBLinkNBSaStatusModel namelistid) {
		this.namelistid = namelistid;
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
		return "NiBLinkNBSbbExpertModel [expertid=" + expertid + ", namelistid=" + namelistid + ", firstname="
				+ firstname + ", middlename=" + middlename + ", lastname=" + lastname + ", shiftList=" + shiftList
				+ "]";
	}
	
	
}
