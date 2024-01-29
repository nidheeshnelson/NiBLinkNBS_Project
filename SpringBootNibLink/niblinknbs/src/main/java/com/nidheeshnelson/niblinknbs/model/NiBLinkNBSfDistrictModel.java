package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="district_list")
public class NiBLinkNBSfDistrictModel {
	@Id
	@GeneratedValue
	private int districtid;
	private String districtname;
	private String districtcode;
	private String statecode;
	private String countrycode;
	public int getDistrictid() {
		return districtid;
	}
	public void setDistrictid(int districtid) {
		this.districtid = districtid;
	}
	public String getDistrictname() {
		return districtname;
	}
	public void setDistrictname(String districtname) {
		this.districtname = districtname;
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
		return "NiBLinkNBSfDistrictModel [districtid=" + districtid + ", districtname=" + districtname
				+ ", districtcode=" + districtcode + ", statecode=" + statecode + ", countrycode=" + countrycode + "]";
	}
}
