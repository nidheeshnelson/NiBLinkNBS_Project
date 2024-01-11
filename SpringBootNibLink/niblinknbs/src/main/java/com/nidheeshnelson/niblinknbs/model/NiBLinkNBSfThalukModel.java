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
	@ManyToOne
	@JoinColumn(name = "district_id")
	private NiBLinkNBSfDistrictModel district;
	@ManyToOne
	@JoinColumn(name = "state_id")
	private NiBLinkNBSfStateModel state;
	@ManyToOne
	@JoinColumn(name = "country_id")
	private NiBLinkNBSfCountryModel country;
	
}
