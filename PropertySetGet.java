package com.JavaTraining;

public class PropertySetGet {

	private String Studentname;
	
	public String getStudentname() {
		return Studentname;
	}

	public void setStudentname(String studentname) {
		Studentname = studentname;
	}

	public int getMobilenum() {
		return Mobilenum;
	}

	public void setMobilenum(int mobilenum) {
		Mobilenum = mobilenum;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	private int Mobilenum;
	
	private String Dept;

}