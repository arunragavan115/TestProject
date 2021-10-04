package com.JavaTraining;

public class Project2 {
	

	public static void main(String[] args) {

		 // creating object for TestData class
		TestData t =new TestData();
		
		// first  set the value
		t.setMobNum(12345);

		t.setSchoolId( "govt");

		t.setSchoolName("jhss");

		t.setStudentName("kumar");
		
		//get the value
		
		System.out.println(t.getSchoolName());
		
		System.out.println(t.getStudentName());
		
		
	}

}
