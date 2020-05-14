package Java_Basics;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		
		int number;
		System.out.println("enter the number");
		
		Scanner scan = new Scanner(System.in);			//interview qns for addeven
		number =scan.nextInt();
		
		if(number %2 ==0){								//if given number is divisble by 2 means even number
			System.out.println("given number is even number");
		}else {
			System.out.println("given number is add number");
		}

	}

}
