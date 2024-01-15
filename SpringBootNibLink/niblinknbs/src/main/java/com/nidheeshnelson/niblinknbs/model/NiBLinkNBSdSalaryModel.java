package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class NiBLinkNBSdSalaryModel {
	@Id
	@GeneratedValue
	private int salary_id;
	@ManyToOne
	@JoinColumn(name="expert_id")
	private NiBLinkNBSbExpertModel expert_id;
	private String datetime;
	private double salary_amount;
	public int getSalary_id() {
		return salary_id;
	}
	public void setSalary_id(int salary_id) {
		this.salary_id = salary_id;
	}
	public NiBLinkNBSbExpertModel getExpert_id() {
		return expert_id;
	}
	public void setExpert_id(NiBLinkNBSbExpertModel expert_id) {
		this.expert_id = expert_id;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public double getSalary_amount() {
		return salary_amount;
	}
	public void setSalary_amount(double salary_amount) {
		this.salary_amount = salary_amount;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSdSalaryModel [salary_id=" + salary_id + ", expert_id=" + expert_id + ", datetime=" + datetime
				+ ", salary_amount=" + salary_amount + "]";
	}
	
}
