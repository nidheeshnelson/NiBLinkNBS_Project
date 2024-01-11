package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class NiBLinkNBScAddressModel {
	@Id
	@GeneratedValue
	private int address_id;
	private String housename;
	private String Street;
	private String landmark;
	private String place;
	private String postoffice;
	private int pincode;
	private String localbody;
	private String thaluk;
	private String district;
	private String state;
	private String country;
}
