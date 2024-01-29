package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="logintable")
public class NiBLinkNBSaLogInModel {
	@Id
	@GeneratedValue
	private int logid;
	@Column(unique = true)
//	@NotBlank(message = "Must have a username")
	private String username;
//	@NotBlank(message ="Must have a password")
	private String password;
	@Column(unique = true)
//	@NotBlank(message = "Must have a email id")
	private String email;
	@Column(unique = true)
//	@NotBlank(message = "Must Have a Phone Number")
	private long phone;
	private int status;
	private String generatedid;
	public int getLogid() {
		return logid;
	}
	public void setLogid(int logid) {
		this.logid = logid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getGeneratedid() {
		return generatedid;
	}
	public void setGeneratedid(String generatedid) {
		this.generatedid = generatedid;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSaLogInModel [logid=" + logid + ", username=" + username + ", password=" + password
				+ ", email=" + email + ", phone=" + phone + ", status=" + status + ", generatedid=" + generatedid + "]";
	}
	
}
