package com.JavaTraining;
import java.util.ArrayList;
import java.util.List;

public class TestApp {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		Student st = new Student();
		st.setRollNumber(12345);
		st.setStudentName("Arun");
		st.setMobile(748849);
		st.setDep("JAVA");
		list.add(st);

		st = new Student();
		st.setRollNumber(12346);
		st.setStudentName("Prasath");
		st.setMobile(748849);
		st.setDep("JAVA");
		list.add(st);

		st = new Student();
		st.setRollNumber(12347);
		st.setStudentName("Parthiban");
		st.setMobile(748849);
		st.setDep("JAVA");
		list.add(st);

		st = new Student();
		st.setRollNumber(12348);
		st.setStudentName("Ragavan");
		st.setMobile(748849);
		st.setDep("JAVA");
		list.add(st);

		st = new Student();
		st.setRollNumber(12349);
		st.setStudentName("Devi");
		st.setMobile(748849);
		st.setDep("JAVA");
		list.add(st);

		st = new Student();
		st.setRollNumber(123451);
		st.setStudentName("Priya");
		st.setMobile(748849);
		st.setDep("JAVA");
		list.add(st);
		System.out.println("============VGHS STUDENT LIST=========");

		for (Student student : list) {
			System.out.println("==============================");
			System.out.println(student.getStudentName());
			System.out.println(student.getDep());
			System.out.println(student.getRollNumber());
			System.out.println(student.getMobile());
			System.out.println("==============================");
		}

	}}


