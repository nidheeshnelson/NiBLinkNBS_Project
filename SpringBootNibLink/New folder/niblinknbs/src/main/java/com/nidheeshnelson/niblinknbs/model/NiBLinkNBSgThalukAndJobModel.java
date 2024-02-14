package com.nidheeshnelson.niblinknbs.model;

public class NiBLinkNBSgThalukAndJobModel {
private String thalukid;
private String jobid;
public String getThalukid() {
	return thalukid;
}
public void setThalukid(String thalukid) {
	this.thalukid = thalukid;
}
public String getJobid() {
	return jobid;
}
public void setJobid(String jobid) {
	this.jobid = jobid;
}
@Override
public String toString() {
	return "NiBLinkNBSgThalukAndJobModel [thalukid=" + thalukid + ", jobid=" + jobid + "]";
}
}
