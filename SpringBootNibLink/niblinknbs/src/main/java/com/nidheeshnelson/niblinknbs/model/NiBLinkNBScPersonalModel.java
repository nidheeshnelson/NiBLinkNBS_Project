package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="personal_details")
public class NiBLinkNBScPersonalModel {
	@Id
	private String personalid;
	private int age;
	private String dateofbirth;
	private String gender;
	private String father;
	private String mother;
	private String spouse;
	private int children;
	public String getPersonalid() {
		return personalid;
	}
	public void setPersonalid(String personalid) {
		this.personalid = personalid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getSpouse() {
		return spouse;
	}
	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "NiBLinkNBScPersonalModel [personalid=" + personalid + ", age=" + age
				+ ", dateofbirth=" + dateofbirth + ", gender=" + gender + ", father=" + father + ", mother=" + mother
				+ ", spouse=" + spouse + ", children=" + children + "]";
	}
	
	
}
