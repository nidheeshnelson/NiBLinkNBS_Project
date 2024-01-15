package com.nidheeshnelson.niblinknbs.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "thaluk_list")
public class NiBLinkNBSfThalukModel {
	@Id
	@GeneratedValue
	private int thaluk_id;
	private String thaluk;
	@ManyToMany(mappedBy = "thaluks")
	private Set<NiBLinkNBSeShiftModel> shift = new HashSet<>();
	@ManyToOne
	@JoinColumn(name = "district_id")
	private NiBLinkNBSfDistrictModel district;
	@ManyToOne
	@JoinColumn(name = "state_id")
	private NiBLinkNBSfStateModel state;
	@ManyToOne
	@JoinColumn(name = "country_id")
	private NiBLinkNBSfCountryModel country;
	public int getThaluk_id() {
		return thaluk_id;
	}
	public void setThaluk_id(int thaluk_id) {
		this.thaluk_id = thaluk_id;
	}
	public String getThaluk() {
		return thaluk;
	}
	public void setThaluk(String thaluk) {
		this.thaluk = thaluk;
	}
	public Set<NiBLinkNBSeShiftModel> getShift() {
		return shift;
	}
	public void setShift(Set<NiBLinkNBSeShiftModel> shift) {
		this.shift = shift;
	}
	public NiBLinkNBSfDistrictModel getDistrict() {
		return district;
	}
	public void setDistrict(NiBLinkNBSfDistrictModel district) {
		this.district = district;
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
		return "NiBLinkNBSfThalukModel [thaluk_id=" + thaluk_id + ", thaluk=" + thaluk + ", shift=" + shift
				+ ", district=" + district + ", state=" + state + ", country=" + country + "]";
	}
	
}
