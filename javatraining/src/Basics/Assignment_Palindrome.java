package Basics;

import java.util.Scanner;

public class Assignment_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	         Scanner input=new Scanner(System.in);
	         System.out.println("Enter a String: ");
	         String string = input.nextLine();
	         
	         
	        char[] result = string.toCharArray();
	        System.out.println("Reversed String Is:");
	        for (int i = result.length-1; i>=0; i--)
	            System.out.print(result[i]);


	}

}
