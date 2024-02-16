package com.nidheeshnelson.niblinknbs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shift_list")
public class NiBLinkNBSeShiftModel {
	@Id
	@GeneratedValue
	private int shiftid;
	private String generatedshiftid;
	private LocalDateTime generateddatetime;
	private LocalDate shiftdate;
	private LocalTime shifttime;
	private LocalDateTime accepteddatetime;
	private LocalDateTime cancelleddatetime;
	private LocalDateTime startdatetime;
	private double salaryperhour;
	private double commissionpercent;
	private LocalDateTime enddatetime;
	private double hoursforwork;
	private double payedbycustomer;
	private double commission;
	private double salary;
	private String thalukcode;
	private String jobcode;
	private String expertid;
	private String customerid;
	private String commissionid;
	private String address;
	private String landmark;
	private String expertname;
	private String customername;
	private long customercontact;
	private long expertcontact;
	private ShiftStatus status;
	public int getShiftid() {
		return shiftid;
	}
	public void setShiftid(int shiftid) {
		this.shiftid = shiftid;
	}
	public String getGeneratedshiftid() {
		return generatedshiftid;
	}
	public void setGeneratedshiftid(String generatedshiftid) {
		this.generatedshiftid = generatedshiftid;
	}
	public LocalDateTime getGenerateddatetime() {
		return generateddatetime;
	}
	public void setGenerateddatetime(LocalDateTime generateddatetime) {
		this.generateddatetime = generateddatetime;
	}
	public LocalDateTime getCancelleddatetime() {
		return cancelleddatetime;
	}
	public void setCancelleddatetime(LocalDateTime cancelleddatetime) {
		this.cancelleddatetime = cancelleddatetime;
	}
	public LocalDateTime getStartdatetime() {
		return startdatetime;
	}
	public void setStartdatetime(LocalDateTime startdatetime) {
		this.startdatetime = startdatetime;
	}
	public double getSalaryPerHours() {
		return salaryperhour;
	}
	public void setSalaryPerHours(double salaryperhour) {
		this.salaryperhour = salaryperhour;
	}
	public LocalDateTime getEnddatetime() {
		return enddatetime;
	}
	public void setEnddatetime(LocalDateTime enddatetime) {
		this.enddatetime = enddatetime;
	}
	public double getHoursforwork() {
		return hoursforwork;
	}
	public void setHoursforwork(double hoursforwork) {
		this.hoursforwork = hoursforwork;
	}
	public double getPayedbycustomer() {
		return payedbycustomer;
	}
	public void setPayedbycustomer(double payedbycustomer) {
		this.payedbycustomer = payedbycustomer;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getThalukcode() {
		return thalukcode;
	}
	public void setThalukcode(String thalukcode) {
		this.thalukcode = thalukcode;
	}
	public String getJobcode() {
		return jobcode;
	}
	public void setJobcode(String jobcode) {
		this.jobcode = jobcode;
	}
	public String getExpertid() {
		return expertid;
	}
	public void setExpertid(String expertid) {
		this.expertid = expertid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public ShiftStatus getStatus() {
		return status;
	}
	public void setStatus(ShiftStatus status) {
		this.status = status;
	}
	
	public LocalDate getShiftdate() {
		return shiftdate;
	}
	public void setShiftdate(LocalDate shiftdate) {
		this.shiftdate = shiftdate;
	}
	public LocalTime getShifttime() {
		return shifttime;
	}
	public void setShifttime(LocalTime shifttime) {
		this.shifttime = shifttime;
	}
	public LocalDateTime getAccepteddatetime() {
		return accepteddatetime;
	}
	public void setAccepteddatetime(LocalDateTime accepteddatetime) {
		this.accepteddatetime = accepteddatetime;
	}
	public double getCommissionpercent() {
		return commissionpercent;
	}
	public void setCommissionpercent(double commissionpercent) {
		this.commissionpercent = commissionpercent;
	}
	public String getCommissionid() {
		return commissionid;
	}
	public void setCommissionid(String commissionid) {
		this.commissionid = commissionid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	public long getCustomercontact() {
		return customercontact;
	}
	public void setCustomercontact(long customercontact) {
		this.customercontact = customercontact;
	}
	public long getExpertcontact() {
		return expertcontact;
	}
	public void setExpertcontact(long expertcontact) {
		this.expertcontact = expertcontact;
	}
	public String getExpertname() {
		return expertname;
	}
	public void setExpertname(String expertname) {
		this.expertname = expertname;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	@Override
	public String toString() {
		return "NiBLinkNBSeShiftModel [shiftid=" + shiftid + ", generatedshiftid=" + generatedshiftid
				+ ", generateddatetime=" + generateddatetime + ", shiftdate=" + shiftdate + ", shifttime=" + shifttime
				+ ", accepteddatetime=" + accepteddatetime + ", cancelleddatetime=" + cancelleddatetime
				+ ", startdatetime=" + startdatetime + ", salaryperhour=" + salaryperhour + ", commissionpercent="
				+ commissionpercent + ", enddatetime=" + enddatetime + ", hoursforwork=" + hoursforwork
				+ ", payedbycustomer=" + payedbycustomer + ", commission=" + commission + ", salary=" + salary
				+ ", thalukcode=" + thalukcode + ", jobcode=" + jobcode + ", expertid=" + expertid + ", customerid="
				+ customerid + ", commissionid=" + commissionid + ", address=" + address + ", landmark=" + landmark
				+ ", expertname=" + expertname + ", customername=" + customername + ", customercontact="
				+ customercontact + ", expertcontact=" + expertcontact + ", status=" + status + "]";
	}
	
}
