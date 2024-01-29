package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "thaluk_list")
public class NiBLinkNBSfThalukModel {
	@Id
	@GeneratedValue
	private int thalukid;
	private String thalukname;
	private String thalukcode;
	private String districtcode;
	private String statecode;
	private String countrycode;
	public int getThalukid() {
		return thalukid;
	}
	public void setThalukid(int thalukid) {
		this.thalukid = thalukid;
	}
	public String getThalukname() {
		return thalukname;
	}
	public void setThalukname(String thalukname) {
		this.thalukname = thalukname;
	}
	public String getThalukcode() {
		return thalukcode;
	}
	public void setThalukcode(String thalukcode) {
		this.thalukcode = thalukcode;
	}
	public String getDistrictcode() {
		return districtcode;
	}
	public void setDistrictcode(String districtcode) {
		this.districtcode = districtcode;
	}
	public String getStatecode() {
		return statecode;
	}
	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSfThalukModel [thalukid=" + thalukid + ", thalukname=" + thalukname + ", thalukcode="
				+ thalukcode + ", districtcode=" + districtcode + ", statecode=" + statecode + ", countrycode="
				+ countrycode + "]";
	}
}
