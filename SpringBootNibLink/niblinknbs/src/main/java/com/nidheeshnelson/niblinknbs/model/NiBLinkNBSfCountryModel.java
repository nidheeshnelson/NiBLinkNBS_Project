package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country_list")
public class NiBLinkNBSfCountryModel {
	@Id
	@GeneratedValue
	private int countryid;
	private String countryname;
	private String countrycode;
	public int getCountryid() {
		return countryid;
	}
	public void setCountryid(int countryid) {
		this.countryid = countryid;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSfCountryModel [countryid=" + countryid + ", countryname=" + countryname + ", countrycode="
				+ countrycode + "]";
	}
}
