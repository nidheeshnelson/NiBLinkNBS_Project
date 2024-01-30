package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="commission_list")
public class NiBLinkNBScCommissionModel {
	@Id
	@GeneratedValue
	private int commissionid;
	private String generatedcommissionid;
	private double commissionpersentage;
	public int getCommissionid() {
		return commissionid;
	}
	public void setCommissionid(int commissionid) {
		this.commissionid = commissionid;
	}
	public String getGeneratedcommissionid() {
		return generatedcommissionid;
	}
	public void setGeneratedcommissionid(String generatedcommissionid) {
		this.generatedcommissionid = generatedcommissionid;
	}
	public double getCommissionpersentage() {
		return commissionpersentage;
	}
	public void setCommissionpersentage(double commissionpersentage) {
		this.commissionpersentage = commissionpersentage;
	}
	@Override
	public String toString() {
		return "NiBLinkNBScCommissionModel [commissionid=" + commissionid + ", generatedcommissionid="
				+ generatedcommissionid + ", commissionpersentage=" + commissionpersentage + "]";
	}
	
}
