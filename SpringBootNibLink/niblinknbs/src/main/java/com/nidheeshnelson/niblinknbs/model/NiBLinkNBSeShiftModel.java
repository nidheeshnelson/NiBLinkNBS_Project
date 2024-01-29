package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shift_list")
public class NiBLinkNBSeShiftModel {
	@Id
	@GeneratedValue
	private int shiftid;
	private String date;
	private String time;
	private String thalukcode;
	private String jobcode;
	private String expertid;
	private String customerid;
	private String shiftcode;
	private boolean finished;
	private boolean expired;
	public int getShiftid() {
		return shiftid;
	}
	public void setShiftid(int shiftid) {
		this.shiftid = shiftid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getThalukcode() {
		return thalukcode;
	}
	public void setThalukcode(String thalukcode) {
		this.thalukcode = thalukcode;
	}
	public String getJobcode() {
		return jobcode;
	}
	public void setJobcode(String jobcode) {
		this.jobcode = jobcode;
	}
	public String getExpertid() {
		return expertid;
	}
	public void setExpertid(String expertid) {
		this.expertid = expertid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getShiftcode() {
		return shiftcode;
	}
	public void setShiftcode(String shiftcode) {
		this.shiftcode = shiftcode;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	public boolean isExpired() {
		return expired;
	}
	public void setExpired(boolean expired) {
		this.expired = expired;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSeShiftModel [shiftid=" + shiftid + ", date=" + date + ", time=" + time + ", thalukcode="
				+ thalukcode + ", jobcode=" + jobcode + ", expertid=" + expertid + ", customerid=" + customerid
				+ ", shiftcode=" + shiftcode + ", finished=" + finished + ", expired=" + expired + "]";
	}
	
}
