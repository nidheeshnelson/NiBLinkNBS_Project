package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="commission_details")
public class NiBLinkNBSdCommissionPayedModel {
	@Id
	@GeneratedValue
	private int commission_id;
//	@ManyToOne
//	@JoinColumn(name="expert_id")
//	private NiBLinkNBSbbExpertModel expert_id;
//	private String datetime;
//	private double commission_amount;
//	public int getCommission_id() {
//		return commission_id;
//	}
//	public void setCommission_id(int commission_id) {
//		this.commission_id = commission_id;
//	}
//	public NiBLinkNBSbbExpertModel getExpert_id() {
//		return expert_id;
//	}
//	public void setExpert_id(NiBLinkNBSbbExpertModel expert_id) {
//		this.expert_id = expert_id;
//	}
//	public String getDatetime() {
//		return datetime;
//	}
//	public void setDatetime(String datetime) {
//		this.datetime = datetime;
//	}
//	public double getCommission_amount() {
//		return commission_amount;
//	}
//	public void setCommission_amount(double commission_amount) {
//		this.commission_amount = commission_amount;
//	}
//	@Override
//	public String toString() {
//		return "NiBLinkNBSdCommissionModel [commission_id=" + commission_id + ", expert_id=" + expert_id + ", datetime="
//				+ datetime + ", commission_amount=" + commission_amount + "]";
//	}
}
