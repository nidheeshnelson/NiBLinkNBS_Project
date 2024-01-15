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
	public int getJob_id() {
		return job_id;
	}
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	public List<NiBLinkNBSbExpertModel> getExperts() {
		return experts;
	}
	public void setExperts(List<NiBLinkNBSbExpertModel> experts) {
		this.experts = experts;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSaJobModel [job_id=" + job_id + ", experts=" + experts + "]";
	}
	
}
