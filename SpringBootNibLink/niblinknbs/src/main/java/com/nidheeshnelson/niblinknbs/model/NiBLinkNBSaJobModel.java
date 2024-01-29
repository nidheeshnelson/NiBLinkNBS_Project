package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="job_list")
public class NiBLinkNBSaJobModel {
	@Id
	@GeneratedValue
	private int jobid;
	private String jobname;
	private String jobcode;
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public String getJobcode() {
		return jobcode;
	}
	public void setJobcode(String jobcode) {
		this.jobcode = jobcode;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSaJobModel [jobid=" + jobid + ", jobname=" + jobname + ", jobcode=" + jobcode + "]";
	}
	
}
