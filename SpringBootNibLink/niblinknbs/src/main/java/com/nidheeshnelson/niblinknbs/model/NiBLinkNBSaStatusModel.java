package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="namelist")
public class NiBLinkNBSaStatusModel {
	@Id
	private String namelistid;
	private int status;
	public String getNamelistid() {
		return namelistid;
	}
	public void setNamelistid(String namelistid) {
		this.namelistid = namelistid;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSaStatusModel [namelistid=" + namelistid + ", status=" + status + "]";
	}
	
}
