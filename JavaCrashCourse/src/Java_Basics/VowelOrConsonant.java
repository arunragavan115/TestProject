package Java_Basics;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the character");
		char ch=scan.next().charAt(0);
		
		if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O' ||ch=='U' ) {
			
			System.out.println("charcter is vowels");
		}
			else {
				System.out.println("character is consonant");
				
			}
		}
		

	}


