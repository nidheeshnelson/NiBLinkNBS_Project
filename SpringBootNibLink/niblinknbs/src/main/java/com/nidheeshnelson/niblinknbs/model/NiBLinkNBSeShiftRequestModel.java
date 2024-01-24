package com.nidheeshnelson.niblinknbs.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Shift_requests")
public class NiBLinkNBSeShiftRequestModel {
	@Id
	@GeneratedValue
	private int shift_request_id;
//	private ShiftRequestStatus status;
//	@ManyToOne
//	@JoinColumn(name="shift_id")
//	private NiBLinkNBSeShiftModel shift_id;
//	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
//	private NiBLinkNBSbcCustomerModel customer_id;
//	public int getShift_request_id() {
//		return shift_request_id;
//	}
//	public void setShift_request_id(int shift_request_id) {
//		this.shift_request_id = shift_request_id;
//	}
//	public ShiftRequestStatus getStatus() {
//		return status;
//	}
//	public void setStatus(ShiftRequestStatus status) {
//		this.status = status;
//	}
//	public NiBLinkNBSeShiftModel getShift_id() {
//		return shift_id;
//	}
//	public void setShift_id(NiBLinkNBSeShiftModel shift_id) {
//		this.shift_id = shift_id;
//	}
//	@Override
//	public String toString() {
//		return "NiBLinkNBSeShiftRequestModel [shift_request_id=" + shift_request_id + ", status=" + status
//				+ ", shift_id=" + shift_id + "]";
//	}
//	
}
