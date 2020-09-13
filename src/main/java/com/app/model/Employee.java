package com.app.model;

import java.util.List;

public class Employee {

	private int empId;
	private String empName;
	private double empSal;
	private String addr;
	private List<String> locs;
	private List<String> langs;
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public List<String> getLocs() {
		return locs;
	}
	public void setLocs(List<String> locs) {
		this.locs = locs;
	}
	public List<String> getLangs() {
		return langs;
	}
	public void setLangs(List<String> langs) {
		this.langs = langs;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", addr=" + addr + ", locs="
				+ locs + ", langs=" + langs + "]";
	}
	
	
	
	
	
	
}
