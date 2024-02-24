package com.nidheeshnelson.niblinknbs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="livepayment")
public class NiBLinkNBSaLivePaymentModel {
	@Id
	@GeneratedValue
private int livepaymentid;
private String payeeid;
private String shiftid;
private String workerid;
private String commissionid;
private String debitcardnumber;
private LocalDate expirationdate;
private int cvc;
private String upiid;
private String netbankingid;
private String password;
private double amountget;
private double amountput;
private double amountsave;
private LocalDateTime transactiondatetime;
private PaymentMode mode;
public int getLivepaymentid() {
	return livepaymentid;
}
public void setLivepaymentid(int livepaymentid) {
	this.livepaymentid = livepaymentid;
}
public String getPayeeid() {
	return payeeid;
}
public void setPayeeid(String payeeid) {
	this.payeeid = payeeid;
}
public double getAmountget() {
	return amountget;
}
public void setAmountget(double amountget) {
	this.amountget = amountget;
}
public double getAmountput() {
	return amountput;
}
public void setAmountput(double amountput) {
	this.amountput = amountput;
}
public String getDebitcardnumber() {
	return debitcardnumber;
}
public void setDebitcardnumber(String debitcardnumber) {
	this.debitcardnumber = debitcardnumber;
}
public int getCvc() {
	return cvc;
}
public void setCvc(int cvc) {
	this.cvc = cvc;
}
public String getUpiid() {
	return upiid;
}
public void setUpiid(String upiid) {
	this.upiid = upiid;
}
public String getNetbankingid() {
	return netbankingid;
}
public void setNetbankingid(String netbankingid) {
	this.netbankingid = netbankingid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public double getAmountsave() {
	return amountsave;
}
public void setAmountsave(double amountsave) {
	this.amountsave = amountsave;
}
public String getShiftid() {
	return shiftid;
}
public void setShiftid(String shiftid) {
	this.shiftid = shiftid;
}
public String getWorkerid() {
	return workerid;
}
public void setWorkerid(String workerid) {
	this.workerid = workerid;
}
public String getCommissionid() {
	return commissionid;
}
public void setCommissionid(String commissionid) {
	this.commissionid = commissionid;
}
public LocalDateTime getTransactiondatetime() {
	return transactiondatetime;
}
public void setTransactiondatetime(LocalDateTime transactiondatetime) {
	this.transactiondatetime = transactiondatetime;
}
public PaymentMode getMode() {
	return mode;
}
public void setMode(PaymentMode mode) {
	this.mode = mode;
}
public LocalDate getExpirationdate() {
	return expirationdate;
}
public void setExpirationdate(LocalDate expirationdate) {
	this.expirationdate = expirationdate;
}
@Override
public String toString() {
	return "NiBLinkNBSaLivePaymentModel [livepaymentid=" + livepaymentid + ", payeeid=" + payeeid + ", shiftid="
			+ shiftid + ", workerid=" + workerid + ", commissionid=" + commissionid + ", debitcardnumber="
			+ debitcardnumber + ", expirationdate=" + expirationdate + ", cvc=" + cvc + ", upiid=" + upiid
			+ ", netbankingid=" + netbankingid + ", password=" + password + ", amountget=" + amountget + ", amountput="
			+ amountput + ", amountsave=" + amountsave + ", transactiondatetime=" + transactiondatetime + ", mode="
			+ mode + "]";
}

}
