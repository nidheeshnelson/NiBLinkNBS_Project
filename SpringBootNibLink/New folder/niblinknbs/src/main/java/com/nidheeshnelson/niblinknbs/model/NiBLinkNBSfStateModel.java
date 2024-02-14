package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "state_list")
public class NiBLinkNBSfStateModel {
	@Id
	@GeneratedValue
	private int id;
	private String state;
	private String statecode;
	private String countrycode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
		return "NiBLinkNBSfStateModel [id=" + id + ", state=" + state + ", statecode=" + statecode + ", countrycode="
				+ countrycode + "]";
	}
}
