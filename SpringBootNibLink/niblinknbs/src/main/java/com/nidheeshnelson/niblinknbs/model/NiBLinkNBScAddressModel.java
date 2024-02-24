package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class NiBLinkNBScAddressModel {
	@Id
	private String addressid;
	private String housename;
	private String street;
	private String landmark;
	private String place;
	private String postoffice;
	private int pincode;
	private String localbody;
	private String thalukcode;
	private String districtcode;
	private String statecode;
	private String countrycode;
	public boolean isDistrictcodeNull() {
		return districtcode==null;
	}
	public boolean isStatecodeNull() {
		return statecode==null;
	}
	public boolean isCountrycodeNull() {
		return countrycode==null;
	}
	public boolean isLocalbodyNull() {
		return localbody==null;
	}
	public boolean isThalukcodeNull() {
		return thalukcode==null;
	}
	public boolean isPlaceNull() {
		return place==null;
	}
	public boolean isPostofficeNull() {
		return postoffice==null;
	}
	public boolean isPincodeNull() {
		return pincode==0;
	}
	public boolean isHousenameNull() {
		return housename==null;
	}
	public boolean isStreetNull() {
		return street==null;
	}
	public boolean isLandmarkNull() {
		return landmark==null;
	}
	public String getAddressid() {
		return addressid;
	}
	public void setAddressid(String addressid) {
		this.addressid = addressid;
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
		return "NiBLinkNBScAddressModel [addressid=" + addressid + ", housename=" + housename + ", street=" + street
				+ ", landmark=" + landmark + ", place=" + place + ", postoffice=" + postoffice + ", pincode=" + pincode
				+ ", localbody=" + localbody + ", thalukcode=" + thalukcode + ", districtcode=" + districtcode
				+ ", statecode=" + statecode + ", countrycode=" + countrycode + "]";
	}
	
}
