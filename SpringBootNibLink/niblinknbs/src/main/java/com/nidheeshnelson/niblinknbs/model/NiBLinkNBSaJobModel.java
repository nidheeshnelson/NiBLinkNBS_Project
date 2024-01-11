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
@Table(name="job_list")
public class NiBLinkNBSaJobModel {
	@Id
	@GeneratedValue
	private int job_id;
	@OneToMany(mappedBy = "job_id",cascade = CascadeType.ALL)
	private List<NiBLinkNBSbExpertModel> experts = new ArrayList<>();
	
}
