package com.nidheeshnelson.niblinknbs.model;

import java.util.Map;

public class NiBLinkNBSLists {
private Map<String, String> mss;
private Map<String, Double> msd;
public Map<String, String> getMss() {
	return mss;
}
public void setMss(Map<String, String> mss) {
	this.mss = mss;
}
public Map<String, Double> getMsd() {
	return msd;
}
public void setMsd(Map<String, Double> msd) {
	this.msd = msd;
}
@Override
public String toString() {
	return "NiBLinkNBSLists [mss=" + mss + ", msd=" + msd + "]";
}

}
