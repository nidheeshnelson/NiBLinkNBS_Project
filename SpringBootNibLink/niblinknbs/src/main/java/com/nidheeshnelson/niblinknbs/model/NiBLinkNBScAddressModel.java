package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class NiBLinkNBScAddressModel {
	@Id
	@GeneratedValue
	private int addressid;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "namelistid", referencedColumnName = "namelistid")
	private NiBLinkNBSaStatusModel namelistid;
	private String housename;
	private String street;
	private String landmark;
	private String place;
	private String postoffice;
	private int pincode;
	private String localbody;
	private String thaluk;
	private String district;
	private String state;
	private String country;
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public NiBLinkNBSaStatusModel getNamelistid() {
		return namelistid;
	}
	public void setNamelistid(NiBLinkNBSaStatusModel statusid) {
		this.namelistid = statusid;
	}
	public String getHousename() {
		return housename;
	}
	public void setHousename(String housename) {
		this.housename = housename;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPostoffice() {
		return postoffice;
	}
	public void setPostoffice(String postoffice) {
		this.postoffice = postoffice;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLocalbody() {
		return localbody;
	}
	public void setLocalbody(String localbody) {
		this.localbody = localbody;
	}
	public String getThaluk() {
		return thaluk;
	}
	public void setThaluk(String thaluk) {
		this.thaluk = thaluk;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "NiBLinkNBScAddressModel [addressid=" + addressid + ", namelistid=" + namelistid + ", housename=" + housename
				+ ", street=" + street + ", landmark=" + landmark + ", place=" + place + ", postoffice=" + postoffice
				+ ", pincode=" + pincode + ", localbody=" + localbody + ", thaluk=" + thaluk + ", district=" + district
				+ ", state=" + state + ", country=" + country + "]";
	}
	
	
}
