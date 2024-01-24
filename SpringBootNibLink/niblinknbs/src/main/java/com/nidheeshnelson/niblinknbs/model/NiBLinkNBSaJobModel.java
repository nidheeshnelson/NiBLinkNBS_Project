package com.nidheeshnelson.niblinknbs.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
//	@Column(unique = true)
//	private String job;
//	@OneToMany(mappedBy = "job_id",cascade = CascadeType.ALL)
//	private List<NiBLinkNBSbbExpertModel> experts = new ArrayList<>();
//	public int getJob_id() {
//		return job_id;
//	}
//	public void setJob_id(int job_id) {
//		this.job_id = job_id;
//	}
//	public List<NiBLinkNBSbbExpertModel> getExperts() {
//		return experts;
//	}
//	public void setExperts(List<NiBLinkNBSbbExpertModel> experts) {
//		this.experts = experts;
//	}
//	public String getJob() {
//		return job;
//	}
//	public void setJob(String job) {
//		this.job = job;
//	}
//	@Override
//	public String toString() {
//		return "NiBLinkNBSaJobModel [job_id=" + job_id + ", job=" + job + ", experts=" + experts + "]";
//	}
}
