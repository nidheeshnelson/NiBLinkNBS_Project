package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="personal_details")
public class NiBLinkNBScPersonalModel {
	@Id
	@GeneratedValue
	private int personal_id;
	private String name;
	private int age;
	private String gender;
	private String father;
	private String mother;
	private String spouse;
}
