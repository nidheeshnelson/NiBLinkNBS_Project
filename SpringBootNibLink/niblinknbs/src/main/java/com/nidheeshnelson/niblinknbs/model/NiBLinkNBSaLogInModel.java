package com.nidheeshnelson.niblinknbs.model;

import org.hibernate.validator.constraints.UniqueElements;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="logintable")
public class NiBLinkNBSaLogInModel {
	@Id
	@GeneratedValue
	private int log_id;
	@Column(unique = true)
	private String username;
	private String password;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private long phone;
	private int status;
	@OneToOne(mappedBy = "log_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBSbAdminModel admin_id;
	@OneToOne(mappedBy = "log_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBSbExpertModel expert_id;
	@OneToOne(mappedBy = "log_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private NiBLinkNBSbCustomerModel customer_id;
	public int getLog_id() {
		return log_id;
	}
	public void setLog_id(int log_id) {
		this.log_id = log_id;
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
	public NiBLinkNBSbAdminModel getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(NiBLinkNBSbAdminModel admin_id) {
		this.admin_id = admin_id;
	}
	public NiBLinkNBSbExpertModel getExpert_id() {
		return expert_id;
	}
	public void setExpert_id(NiBLinkNBSbExpertModel expert_id) {
		this.expert_id = expert_id;
	}
	public NiBLinkNBSbCustomerModel getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(NiBLinkNBSbCustomerModel customer_id) {
		this.customer_id = customer_id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSaLogInModel [log_id=" + log_id + ", username=" + username + ", password=" + password
				+ ", email=" + email + ", phone=" + phone + ", status=" + status + ", admin_id=" + admin_id
				+ ", expert_id=" + expert_id + ", customer_id=" + customer_id + "]";
	}
	
}
