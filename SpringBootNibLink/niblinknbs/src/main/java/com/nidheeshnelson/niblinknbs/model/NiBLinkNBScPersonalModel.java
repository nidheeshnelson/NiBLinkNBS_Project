package com.nidheeshnelson.niblinknbs.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="personal_details")
public class NiBLinkNBScPersonalModel {
	@Id
	private String personalid;
	private int age;
	private LocalDate dateofbirth;
	private String gender;
	private String father;
	private String mother;
	private String spouse;
	private int children;
	public boolean isAgeNull() {
		return age==0;
	}
	public boolean isDateofbirthNull() {
		return dateofbirth==null;
	}
	public boolean isGenderNull() {
		return gender==null;
	}
	public boolean isFatherNull() {
		return father==null;
	}
	public boolean isMotherNull() {
		return mother==null;
	}
	public boolean isChildrenNull() {
		return children==0;
	}
	public boolean isSpouseNull() {
		return spouse==null;
	}
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
	public LocalDate getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(LocalDate dateofbirth) {
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
