package com.nidheeshnelson.niblinknbs.model;

import org.hibernate.validator.constraints.UniqueElements;

import jakarta.persistence.Entity;
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
	@UniqueElements
	private String username;
	private String password;
	@UniqueElements
	private String email;
	@UniqueElements
	private String phone;
	@OneToOne
	private NiBLinkNBSbAdminModel admin_id;
	@OneToOne
	private NiBLinkNBSbExpertModel expert_id;
	@OneToOne
	private NiBLinkNBSbCustomerModel customer_id;
}
