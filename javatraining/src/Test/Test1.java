package Test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Take three numbers from the user and print the greatest number.

		Scanner in = new Scanner (System.in);
		
		System.out.println("enter the 1st number :");
		int num1 =in.nextInt();
		
		System.out.println("enter the 2nd number :");
		int num2 =in.nextInt();
		
		System.out.println("enter the 3rd number :");
		int num3 =in.nextInt();
		
		if (num1 > num2)
			if (num1 > num3)
				System.out.println("greatest number is" + num1);
		
		if (num2 > num1)
			if (num2 > num3)
				System.out.println("greatest number is" + num2);
		
		if (num3 > num1)
			if(num3 > num2)
				System.out.println("greatest number is" + num3);
	}

}
