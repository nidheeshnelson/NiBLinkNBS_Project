package com.nidheeshnelson.niblinknbs.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "country_list")
public class NiBLinkNBSfCountryModel {
	@Id
	@GeneratedValue
	private int country_id;
	private String country;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "state")
	private List<NiBLinkNBSfStateModel> state=new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "district")
	private List<NiBLinkNBSfDistrictModel> district=new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "thaluk")
	private List<NiBLinkNBSfThalukModel> thaluk=new ArrayList<>();
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<NiBLinkNBSfStateModel> getState() {
		return state;
	}
	public void setState(List<NiBLinkNBSfStateModel> state) {
		this.state = state;
	}
	public List<NiBLinkNBSfDistrictModel> getDistrict() {
		return district;
	}
	public void setDistrict(List<NiBLinkNBSfDistrictModel> district) {
		this.district = district;
	}
	public List<NiBLinkNBSfThalukModel> getThaluk() {
		return thaluk;
	}
	public void setThaluk(List<NiBLinkNBSfThalukModel> thaluk) {
		this.thaluk = thaluk;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSfCountryModel [country_id=" + country_id + ", country=" + country + ", state=" + state
				+ ", district=" + district + ", thaluk=" + thaluk + "]";
	}
	
}
