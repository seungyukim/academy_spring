package com.mis.domain;

import java.util.Date;

public class CustomerVO {

	private String userid;
	private String name;
	private int birthyear;
	private String address;
	private String phone;
	private String grade;
	private Date regdate;
	private Date moddate;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getModdate() {
		return moddate;
	}
	public void setModdate(Date moddate) {
		this.moddate = moddate;
	}
	@Override
	public String toString() {
		return "CustomerVO [userid=" + userid + ", name=" + name + ", birthyear=" + birthyear + ", address=" + address
				+ ", phone=" + phone + ", grade=" + grade + ", regdate=" + regdate + ", moddate=" + moddate + "]";
	}

}
