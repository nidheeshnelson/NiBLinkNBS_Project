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
@Table(name = "state_list")
public class NiBLinkNBSfStateModel {
	@Id
	@GeneratedValue
	private int id;
	private String state;
	@ManyToOne
	@JoinColumn(name = "country_id")
	private NiBLinkNBSfCountryModel country;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "district")
	private List<NiBLinkNBSfDistrictModel> district=new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "thaluk")
	private List<NiBLinkNBSfThalukModel> thaluk=new ArrayList<>();
	
}
