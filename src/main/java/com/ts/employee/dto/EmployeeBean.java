package com.ts.employee.dto;


import java.io.Serializable;


public class EmployeeBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int eid;
	private String fname;
	private String lname;
	private String address1;
	private String address2;
	private String city;
	private long phno;
	private long pincode;
	private String email;
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
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long l) {
		this.phno = l;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long l) {
		this.pincode = l;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
