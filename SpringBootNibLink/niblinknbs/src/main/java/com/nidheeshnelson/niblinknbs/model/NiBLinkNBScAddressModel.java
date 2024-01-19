package com.nidheeshnelson.niblinknbs.model;

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
	private int address_id;
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
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="admin_id")
	private NiBLinkNBSbAdminModel admin_id;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private NiBLinkNBSbCustomerModel customer_id;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="expert_id")
	private NiBLinkNBSbExpertModel expert_id;
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
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
	
	public NiBLinkNBSbAdminModel getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(NiBLinkNBSbAdminModel admin_id) {
		this.admin_id = admin_id;
	}
	public NiBLinkNBSbCustomerModel getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(NiBLinkNBSbCustomerModel customer_id) {
		this.customer_id = customer_id;
	}
	public NiBLinkNBSbExpertModel getExpert_id() {
		return expert_id;
	}
	public void setExpert_id(NiBLinkNBSbExpertModel expert_id) {
		this.expert_id = expert_id;
	}
	@Override
	public String toString() {
		return "NiBLinkNBScAddressModel [address_id=" + address_id + ", housename=" + housename + ", street=" + street
				+ ", landmark=" + landmark + ", place=" + place + ", postoffice=" + postoffice + ", pincode=" + pincode
				+ ", localbody=" + localbody + ", thaluk=" + thaluk + ", district=" + district + ", state=" + state
				+ ", country=" + country + ", admin_id=" + admin_id + ", customer_id=" + customer_id + ", expert_id="
				+ expert_id + "]";
	}
	
}
