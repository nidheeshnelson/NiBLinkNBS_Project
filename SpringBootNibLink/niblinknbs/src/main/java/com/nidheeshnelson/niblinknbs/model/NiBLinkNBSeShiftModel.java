package com.nidheeshnelson.niblinknbs.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="shift_list")
public class NiBLinkNBSeShiftModel {
	@Id
	@GeneratedValue
	private int shift_id;
	private String date;
	private String time;
	private ShiftStatus status;
	 @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "expertid")
	    private NiBLinkNBSbbExpertModel expert;
	
	@ManyToMany
	@JoinTable( name = "thaluks",joinColumns = @JoinColumn(name = "shift_id"),inverseJoinColumns = @JoinColumn(name = "thaluk_id"))
	private Set<NiBLinkNBSfThalukModel> thaluks = new HashSet<>();
//	@ManyToOne
//	@JoinColumn(name="expert_id")
//	private NiBLinkNBSbbExpertModel expert_id;
//	@ManyToOne
//	@JoinColumn(name = "customer_id")
//	private NiBLinkNBSbcCustomerModel customer_id;
//	@OneToMany(mappedBy = "shift_id", cascade = CascadeType.ALL)
//	private List<NiBLinkNBSeShiftRequestModel> requests = new ArrayList<>();
//	public int getShift_id() {
//		return shift_id;
//	}
//	public void setShift_id(int shift_id) {
//		this.shift_id = shift_id;
//	}
//	public String getDate() {
//		return date;
//	}
//	public void setDate(String date) {
//		this.date = date;
//	}
//	public String getTime() {
//		return time;
//	}
//	public void setTime(String time) {
//		this.time = time;
//	}
//	public ShiftStatus getStatus() {
//		return status;
//	}
//	public void setStatus(ShiftStatus status) {
//		this.status = status;
//	}
//	public Set<NiBLinkNBSfThalukModel> getThaluks() {
//		return thaluks;
//	}
//	public void setThaluks(Set<NiBLinkNBSfThalukModel> thaluks) {
//		this.thaluks = thaluks;
//	}
//	public NiBLinkNBSbbExpertModel getExpert_id() {
//		return expert_id;
//	}
//	public void setExpert_id(NiBLinkNBSbbExpertModel expert_id) {
//		this.expert_id = expert_id;
//	}
//	public NiBLinkNBSbcCustomerModel getCustomer_id() {
//		return customer_id;
//	}
//	public void setCustomer_id(NiBLinkNBSbcCustomerModel customer_id) {
//		this.customer_id = customer_id;
//	}
//	public List<NiBLinkNBSeShiftRequestModel> getRequests() {
//		return requests;
//	}
//	public void setRequests(List<NiBLinkNBSeShiftRequestModel> requests) {
//		this.requests = requests;
//	}
//	@Override
//	public String toString() {
//		return "NiBLinkNBSeShiftModel [shift_id=" + shift_id + ", date=" + date + ", time=" + time + ", status="
//				+ status + ", thaluks=" + thaluks + ", expert_id=" + expert_id + ", customer_id=" + customer_id
//				+ ", requests=" + requests + "]";
//	}
//	
}
