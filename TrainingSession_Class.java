package com.JavaTraining;

import com.JavaTraining.*;

public class TrainingSession_Class {

	void data() {
		
		int a=10, b=30;
		int c =a+b;
		System.out.println("Result :"+c);
	}
	
	int display(int a, int b) {
		int c= a+b;
		System.out.println("Welcome...."+c);
		
		return 10;
	}
	
	
	public static void main(String args[]) {
		
		TrainingSession_Class obj = new TrainingSession_Class();
		obj.data();
		int v1=20, v2=40;
		int rs = obj.display(v1,v2);
		System.out.println(rs);
		
		
	}

}

