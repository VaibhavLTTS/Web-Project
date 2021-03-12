package com.ltts.model;

import java.sql.Date;

public class User {
	
	private String emailid;
	private int mobile;
	private String name ;
	private Date dob;
	private String address;
	private String password;
	private String userType;
	
	
	
	public User() {
		super();
	}
	public User(String emailid, int mobile, String name, Date dob, String address, String password,String userType) {
		super();
		this.emailid = emailid;
		this.mobile = mobile;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.password = password;
		this.userType=userType;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	@Override
	public String toString() {
		return "User [emailid=" + emailid + ", mobile=" + mobile + ", name=" + name + ", dob=" + dob + ", address="
				+ address + ", password=" + password + ",userType=" + userType +"]";
	}

	

}
