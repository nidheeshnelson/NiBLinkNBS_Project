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
}
