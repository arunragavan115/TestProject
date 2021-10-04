package com.JavaTraining;

import java.util.Scanner;

public class ReverseaNumber {
	void partha() {
	
		String str;
		System.out.println("edhuna ezudhu");
		Scanner k=new Scanner(System.in);
		str=k.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) 
			System.out.print(rev+str.charAt(i)+"  ");
		}
	
	

	public static void main(String[] args) {
		ReverseaNumber s=new ReverseaNumber();
		s.partha();
		
		int num = 1234567, reversed = 0;

	    for(;num != 0; num /= 10) {
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	    }

	    System.out.println("Reversed Number: " + reversed);

	}

}
