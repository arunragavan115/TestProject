package com.JavaTraining;

public class PracticeString {

	public static void main(String[] args) {
		
		//String  functions
		
		String n="arun kumar";

		System.out.println(n.charAt(6));
		System.out.println(n.length());
		System.out.println(n.isEmpty());
		System.out.println(n.concat("bala"));
		System.out.println(n.isBlank());
		System.out.println(n.charAt(7));


//		for (int i = 0;i<n.length();i++) {
//			System.out.println(n.charAt(i));
			
			String s2 = "Sachin Master Blaster";

		    String [] s3 = s2.split(" ");   //split the word by gaps 
		    int i;
		    for ( i = 0; i < s3.length; i++)
		    	
		      System.out.println(s3[i]);
		    System.out.println(n.toUpperCase());
		    System.out.println(s2.toLowerCase());
		    System.out.println();

		 }


		}

	

