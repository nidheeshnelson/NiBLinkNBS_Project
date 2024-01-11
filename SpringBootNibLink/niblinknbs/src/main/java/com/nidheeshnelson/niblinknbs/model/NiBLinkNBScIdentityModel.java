package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "identityproof")
public class NiBLinkNBScIdentityModel {
	@Id
	@GeneratedValue
	private int identity_id;
	private long adhar;
	private String pancard;
	private String electionid;
}
