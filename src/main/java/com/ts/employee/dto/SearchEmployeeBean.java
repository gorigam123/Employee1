package com.ts.employee.dto;

import java.io.Serializable;

public class SearchEmployeeBean implements Serializable {
private static final long serialVersionUID = 1L;
private int eid;
private String fname;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}

}
