package com.example.demo;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Employee {
	@Id
	private int EmpId;
	private String EmpName;
	private String Password;
	private String EmpCity;
	private String Address;
	private long ContactNum;
	private String img;
	private int flag;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmpCity() {
		return EmpCity;
	}
	public void setEmpCity(String empCity) {
		EmpCity = empCity;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getContactNum() {
		return ContactNum;
	}
	public void setContactNum(long contactNum) {
		ContactNum = contactNum;
	}

	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
	

}
