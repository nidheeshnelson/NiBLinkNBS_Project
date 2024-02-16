package com.nidheeshnelson.niblinknbs.model;

import java.time.LocalDate;

public class NiBLinkNBSgThalukAndJobModel {
private String thalukid;
private String jobid;
private LocalDate jobdate;
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
public LocalDate getJobdate() {
	return jobdate;
}
public void setJobdate(LocalDate jobdate) {
	this.jobdate = jobdate;
}
@Override
public String toString() {
	return "NiBLinkNBSgThalukAndJobModel [thalukid=" + thalukid + ", jobid=" + jobid + ", jobdate=" + jobdate + "]";
}
}
