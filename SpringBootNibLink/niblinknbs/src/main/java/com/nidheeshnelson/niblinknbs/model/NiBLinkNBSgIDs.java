package com.nidheeshnelson.niblinknbs.model;

public class NiBLinkNBSgIDs {
private String shiftid;
private String customerid;
private double hoursforwork;
public String getShiftid() {
	return shiftid;
}

public void setShiftid(String shiftid) {
	this.shiftid = shiftid;
}

public String getCustomerid() {
	return customerid;
}

public void setCustomerid(String customerid) {
	this.customerid = customerid;
}

public double getHoursforwork() {
	return hoursforwork;
}

public void setHoursforwork(double hoursforwork) {
	this.hoursforwork = hoursforwork;
}

@Override
public String toString() {
	return "NiBLinkNBSgIDs [shiftid=" + shiftid + ", customerid=" + customerid + ", hoursforwork=" + hoursforwork + "]";
}
}
