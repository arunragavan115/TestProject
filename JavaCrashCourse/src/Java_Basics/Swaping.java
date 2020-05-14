package Java_Basics;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {

		int n1 = 10, n2 = 20;

		// n1 =20, n2 = 10;
		System.out.println("Before swaping n1:" + n1 + "after swaping n2:" + n2);

		n1 = n1 + n2;
		// n1=n1 + n2 =30

		n2 = n1 - n2;
		// now here n1 =30 n2=20 n1-n2=10

		n1 = n1 - n2;
		// n1=30 n2 = 10 n1-n2=20;
		System.out.println("after swaping n1:" + n1 + "after swaping n2:" + n2);

	}
}
