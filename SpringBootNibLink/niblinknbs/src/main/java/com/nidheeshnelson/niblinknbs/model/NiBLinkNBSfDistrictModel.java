package com.nidheeshnelson.niblinknbs.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="district_list")
public class NiBLinkNBSfDistrictModel {
	@Id
	@GeneratedValue
	private int district_id;
	private String district;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "thaluk")
	private List<NiBLinkNBSfThalukModel> thaluk=new ArrayList<>();
	@ManyToOne
	@JoinColumn(name = "state_id")
	private NiBLinkNBSfStateModel state;
	@ManyToOne
	@JoinColumn(name = "country_id")
	private NiBLinkNBSfCountryModel country;
	public int getDistrict_id() {
		return district_id;
	}
	public void setDistrict_id(int district_id) {
		this.district_id = district_id;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public List<NiBLinkNBSfThalukModel> getThaluk() {
		return thaluk;
	}
	public void setThaluk(List<NiBLinkNBSfThalukModel> thaluk) {
		this.thaluk = thaluk;
	}
	public NiBLinkNBSfStateModel getState() {
		return state;
	}
	public void setState(NiBLinkNBSfStateModel state) {
		this.state = state;
	}
	public NiBLinkNBSfCountryModel getCountry() {
		return country;
	}
	public void setCountry(NiBLinkNBSfCountryModel country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSfDistrictModel [district_id=" + district_id + ", district=" + district + ", thaluk=" + thaluk
				+ ", state=" + state + ", country=" + country + "]";
	}
	
}
